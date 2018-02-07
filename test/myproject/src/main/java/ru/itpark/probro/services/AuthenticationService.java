package ru.itpark.probro.services;


import org.springframework.security.core.Authentication;
import ru.itpark.probro.models.User;

public interface AuthenticationService{
    User getUserByAuthentication(Authentication authentication);

}
