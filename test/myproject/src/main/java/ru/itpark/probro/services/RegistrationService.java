package ru.itpark.probro.services;

import ru.itpark.probro.forms.RegistrationForm;
import ru.itpark.probro.models.User;

public interface RegistrationService {
    User registration(RegistrationForm form);
    User update(RegistrationForm form);


    boolean confirm(String confirmString);
}
