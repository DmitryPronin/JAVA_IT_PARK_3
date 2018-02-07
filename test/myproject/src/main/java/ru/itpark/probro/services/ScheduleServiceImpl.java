package ru.itpark.probro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;
import ru.itpark.probro.forms.ScheduleForm;
import ru.itpark.probro.models.Schedules;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Status;
import ru.itpark.probro.repositories.ScheduleRepository;
import ru.itpark.probro.repositories.UserRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ScheduleServiceImpl implements ScheduleService {



    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    private ScheduleRepository scheduleRepository;

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<Schedules> getScheduleByData(LocalDateTime date) {
        System.out.println(date);
        List<Schedules> schedules = scheduleRepository.findAllByDateTimeOrderByMaster(date);

        return schedules;
    }

    @Override
    public Schedules addNewSchedule(Authentication authentication, ScheduleForm form) {

        String str = form.getTime_id();
        String[] parts = str.split(" ", 2);
        String time = parts[0];
        Long master_id  = Long.parseLong(parts[1]);
        User master= userRepository.findOne(master_id);

        String string = form.getDate()+"T"+time+":00.000";
        System.out.println(string);
        System.out.println(LocalDateTime.now());
        LocalDateTime dateTime = LocalDateTime.parse(string);

        String commit = form.getCommit();
        User user = authenticationService.getUserByAuthentication(authentication);
        Schedules schedule = Schedules.builder()
                .dateTime(dateTime)
                .user(user)
                .master(master)
                .commit(commit)
                .status(Status.BUSY)
                .build();
        scheduleRepository.save(schedule);
        return schedule;




    }
}
