package ru.itpark.probro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Role;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long > {
    List<User> findByOrderByRegistrationTime();
    List<User> findByOrderById();
    List<User> findByOrderByName();
    Optional<User> findByConfirmCode(String confirmeCode);
    Optional<User> findByEmail(String email);
    List<User> findAllByRole(Role role);

}
