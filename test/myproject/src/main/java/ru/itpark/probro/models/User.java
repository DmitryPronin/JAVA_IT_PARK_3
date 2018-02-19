package ru.itpark.probro.models;

import lombok.*;
import ru.itpark.probro.models.enums.Role;
import ru.itpark.probro.models.enums.State;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name ="users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String mobilephone;
    private String email;
    private String hashPassword;
    private LocalDate birthDate;
    private LocalDateTime registrationTime;
    private String confirmCode;
    private LocalDateTime expiredDate;
    private int countOrders;
    private int completedOrders;
    private String gender;

    @Enumerated(value = EnumType.STRING)
    private Role role;

    @Enumerated(value = EnumType.STRING)
    private State state;

    private String avatarUrl;

    @OneToMany(mappedBy = "master", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Schedules> schedules;


 //   private List<Skill> skills;







}
