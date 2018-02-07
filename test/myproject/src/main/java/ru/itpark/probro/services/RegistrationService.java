package ru.itpark.probro.services;

import ru.itpark.probro.forms.RegistrationForm;
import ru.itpark.probro.models.User;

public interface RegistrationService {
    User registration(RegistrationForm form);

    boolean confirm(String confirmString);
}
