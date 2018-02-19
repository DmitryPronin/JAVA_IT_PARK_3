package ru.itpark.probro.forms;

import lombok.Data;
import ru.itpark.probro.models.User;

import java.time.LocalDate;

@Data
public class UpdateForm {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String mobilephone;
    private String birthDate;
    private String gender;
    private String role;

    public void update(User user){
        user.setName(this.name);
        user.setSurname(this.surname);
        LocalDate birthdate = LocalDate.parse(this.birthDate);
        user.setBirthDate(birthdate);
        user.setMobilephone(this.mobilephone);
        user.setGender(this.gender);

    }
}
