package ru.itpark.probro.models;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Skill {
    private Long id;
    private String name;
    private double price;


    private Master masters;
}
