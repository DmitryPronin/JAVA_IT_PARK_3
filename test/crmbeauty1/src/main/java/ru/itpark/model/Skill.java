package ru.itpark.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "skills")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
@ToString
@Setter
@Getter

public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameSkill;
    private double price;
    private double executionTime;
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private User user;

    }

