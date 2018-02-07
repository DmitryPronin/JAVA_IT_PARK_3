package ru.itpark.probro.models;

import lombok.*;
import ru.itpark.probro.models.enums.Status;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Builder
public class Schedules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateTime;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "master_id")
    private User master;

    @Enumerated(value = EnumType.STRING)
    private Status status;
    private String commit;
}
