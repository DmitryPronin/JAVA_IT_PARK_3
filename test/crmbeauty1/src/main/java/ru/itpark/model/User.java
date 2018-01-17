package ru.itpark.model;

import lombok.*;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Setter
@Getter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    private String mobilePhone;
    private int age;

    @OneToMany(mappedBy = "user")
    private List<Orders> orders;


//    @OneToMany(mappedBy = "user")
//    private List<Skill> skills;

}
