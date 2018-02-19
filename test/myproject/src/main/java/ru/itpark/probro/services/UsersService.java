package ru.itpark.probro.services;

import ru.itpark.probro.forms.NamesForm;
import ru.itpark.probro.forms.UpdateForm;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Role;

import java.time.LocalDate;
import java.util.List;

import static ru.itpark.probro.models.enums.Role.USER;

public interface UsersService {
    List<User> getAll();
    List<User> getUsersByRole(Role role, LocalDate date);
    User getUser(Long userId);
    User update(Long userId, UpdateForm form);

}
