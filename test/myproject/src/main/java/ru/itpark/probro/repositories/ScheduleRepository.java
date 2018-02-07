package ru.itpark.probro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.probro.models.Schedules;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ScheduleRepository extends JpaRepository <Schedules, Long> {
    List<Schedules> findAll();
    List<Schedules> findAllByDateTimeOrderByMaster(LocalDateTime date);
    List<Schedules> findAllByDateTimeBetween(LocalDateTime date,LocalDateTime date2);
    List<Schedules> findAllByDateTime_MinBetweenDateTime_Max(LocalDateTime dateTime);
 }
