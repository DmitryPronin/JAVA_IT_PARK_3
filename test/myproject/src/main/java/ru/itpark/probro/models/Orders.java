package ru.itpark.probro.models;

import ru.itpark.probro.models.Master;
import ru.itpark.probro.models.User;

import java.time.LocalDateTime;

public class Orders {
    private Long id;
    private LocalDateTime dateTime;
    private User user;
    private Master master;
    private String commit;

}
