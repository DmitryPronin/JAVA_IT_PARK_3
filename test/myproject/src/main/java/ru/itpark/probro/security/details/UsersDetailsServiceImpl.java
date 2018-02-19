package ru.itpark.probro.security.details;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.itpark.probro.models.User;
import ru.itpark.probro.repositories.UserRepository;

import java.util.Optional;


@Component
public class UsersDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository usersRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Optional<User> userOptional = usersRepository.findByEmail(email);
    if (userOptional.isPresent()) {
      User user = userOptional.get();
      return new UserDetailsImpl(user);
    } else throw new IllegalArgumentException("User not found by email");

    }
}