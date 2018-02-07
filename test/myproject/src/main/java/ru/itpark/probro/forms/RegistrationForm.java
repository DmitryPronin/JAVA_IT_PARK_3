package ru.itpark.probro.forms;


import lombok.Data;
import lombok.ToString;
import ru.itpark.probro.models.enums.Gender;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@ToString
public class RegistrationForm {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String mobilephone;
    private String birthDate;
    private String gender;


}
