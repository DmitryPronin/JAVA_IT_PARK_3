package ru.itpark.probro.services;

import org.springframework.security.core.Authentication;
import ru.itpark.probro.forms.ScheduleForm;
import ru.itpark.probro.models.Schedules;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleService {
    List<Schedules> getScheduleByData(LocalDate date);


    Schedules addNewSchedule(Authentication authentication, ScheduleForm form);
    Schedules updateSchedule(Authentication authentication, ScheduleForm form);
}
