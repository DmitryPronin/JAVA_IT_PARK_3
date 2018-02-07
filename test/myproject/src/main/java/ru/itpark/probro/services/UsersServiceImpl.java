package ru.itpark.probro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itpark.probro.forms.NamesForm;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Role;
import ru.itpark.probro.repositories.UserRepository;

import java.util.List;


@Service
public class UsersServiceImpl implements UsersService {


    @Autowired
    private UserRepository usersRepository;


    @Override
    public List<User> getUsers(String orderBy) {
        switch (orderBy) {
            case "registration_date":
                return usersRepository.findByOrderByRegistrationTime();
            case "id":
                return usersRepository.findByOrderById();
            case "name":
                return usersRepository.findByOrderByName();
        }
        return usersRepository.findAll();
    }

    @Override
    public List<User> getAll() {
        List<User> users = usersRepository.findAll();
        return users;
    }

    @Override
    public List<User> getUsersByRole(Role role) {
        List<User> users = usersRepository.findAllByRole(role);
        return users;
    }


    @Override
    public User getUser(Long userId) {
        return usersRepository.findOne(userId);
    }

    @Override
    public void update(Long userId, NamesForm form) {
        User user = usersRepository.findOne(userId);
        form.update(user);
        usersRepository.save(user);

    }
}
