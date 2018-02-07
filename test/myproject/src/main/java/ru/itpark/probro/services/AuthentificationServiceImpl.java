package ru.itpark.probro.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import ru.itpark.probro.models.User;
import ru.itpark.probro.repositories.UserRepository;

@Component
public class AuthentificationServiceImpl implements AuthenticationService {

    @Autowired
    private UserRepository usersRepository;


    @Override
    public User getUserByAuthentication(Authentication authentication) {
        String email = authentication.getName();
        return usersRepository.findByEmail(email).get();
    }
}

