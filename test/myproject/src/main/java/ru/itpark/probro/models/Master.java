package ru.itpark.probro.models;


import ru.itpark.probro.models.enums.Role;
import ru.itpark.probro.models.enums.State;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

public class Master {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String mobilephone;
    private String email;
    private String hashPassword;
    private LocalDateTime birthDate;
    private LocalDateTime registrationTime;
    private String confirmedCode;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Enumerated(value = EnumType.STRING)
    private State state;

    private String avatarUrl;


    private List<Skill> skills;
}
