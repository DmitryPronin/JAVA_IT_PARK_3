package ru.itpark.probro.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.itpark.probro.forms.RegistrationForm;
import ru.itpark.probro.models.enums.Role;
import ru.itpark.probro.models.enums.State;
import ru.itpark.probro.models.User;
import ru.itpark.probro.repositories.UserRepository;


import javax.mail.internet.MimeMessage;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;


@Service
public class RegistrationServiceImpl implements RegistrationService {


    @Autowired
    private UserRepository usersRepository;

    @Autowired
    private JavaMailSender javaMailSender;


    private PasswordEncoder encoder = new BCryptPasswordEncoder();


    @Override
    @SneakyThrows
    public User registration(RegistrationForm form) {
        String hashPassword = encoder.encode(form.getPassword());
        LocalDateTime registrationTime = LocalDateTime.now();
        LocalDate birthDate = LocalDate.parse(form.getBirthDate());
        System.out.println(birthDate);
        System.out.println(form.getGender());
        String confirmString = UUID.randomUUID().toString().replace("-", "");
        String avatarurl;
        Role role = Role.valueOf(form.getRole());
        if (form.getGender().equals("Male")) {
            avatarurl = "/pic/useravatar.png";
        } else {
            avatarurl = "/pic/useravatar2.png";
        }
        User newUser = User.builder()
                .name(form.getName())
                .confirmCode(confirmString)
                .surname(form.getSurname())
                .expiredDate(LocalDateTime.now().plusMinutes(10))
                .email(form.getEmail())
                .surname(form.getSurname())
                .mobilephone(form.getMobilephone())
                .birthDate(birthDate)
                .role(role)
                .avatarUrl(avatarurl)
                .gender(form.getGender())
                .hashPassword(hashPassword)
                .registrationTime(registrationTime)
                .build();

        usersRepository.save(newUser);
        String text = "<a href=\"localhost/confirm/" + newUser.getConfirmCode() + "\">Follow link</a>";
        MimeMessage message = javaMailSender.createMimeMessage();
        message.setContent(text, "text/html");
        MimeMessageHelper messageHelper = new MimeMessageHelper(message, true);
        messageHelper.setTo(newUser.getEmail());
        messageHelper.setSubject("Подтверждение регистрации");
        messageHelper.setText(text, true);
        javaMailSender.send(message);
        return newUser;

    }

    @Override
    public User update(RegistrationForm form) {
        return null;
    }

    @Override
    public boolean confirm(String confirmString) {
        Optional<User> userOptional = usersRepository.findByConfirmCode(confirmString);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (LocalDateTime.now().isAfter(user.getExpiredDate())) {
                return false;
            }

            user.setConfirmCode(null);
            user.setExpiredDate(null);
            user.setState(State.CONFIRMED);
            usersRepository.save(user);
            return true;
        }
        return false;

    }
}
