package ru.itpark.probro.services;

import ru.itpark.probro.forms.NamesForm;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Role;

import java.util.List;

import static ru.itpark.probro.models.enums.Role.USER;

public interface UsersService {
    List<User> getUsers(String orderBy);
    List<User> getAll();
    List<User> getUsersByRole(Role role);

    User getUser(Long userId);


    void update(Long userId, NamesForm form);

}
