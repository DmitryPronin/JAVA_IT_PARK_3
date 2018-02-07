package ru.itpark.probro.forms;

import lombok.Data;
import ru.itpark.probro.models.User;


@Data
public class NamesForm {
    private String name;
    private String surname;

    public void update(User user){
        user.setName(this.name);
        user.setSurname(this.surname);
    }
}
