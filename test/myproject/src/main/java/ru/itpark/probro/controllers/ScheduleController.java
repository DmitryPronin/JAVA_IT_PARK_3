package ru.itpark.probro.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.probro.forms.ScheduleForm;
import ru.itpark.probro.models.Schedules;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Role;
import ru.itpark.probro.services.AuthenticationService;
import ru.itpark.probro.services.ScheduleService;
import ru.itpark.probro.services.UsersService;

import java.sql.Time;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @Autowired
    private UsersService usersService;

    @Autowired
    private AuthenticationService authenticationService;



    @GetMapping("/schedule")
    public String loadSchedule(@ModelAttribute ScheduleForm form,
                               @ModelAttribute("model") ModelMap model){
        LocalDate min = LocalDate.now();
        LocalDate today = LocalDate.now();
        if (form.getDate() != null) {
            today = LocalDate.parse(form.getDate());
        }
        Role role = Role.MASTER;
        List<User> users = usersService.getUsersByRole(role, today);
        model.addAttribute("today", today);
        model.addAttribute("users", users);
        model.addAttribute("min", min);

        return "check";
    }

    @PostMapping("/schedule")
    public String saveOneSchedule(
            @ModelAttribute ScheduleForm form,
            @ModelAttribute("model") ModelMap model,
            Authentication authentication){
        Schedules schedules = scheduleService.updateSchedule(authentication,form);
        LocalDate today = LocalDate.now();
        if (form.getDate() != null) {
            today = LocalDate.parse(form.getDate());
        }
        LocalDateTime dateTime = schedules.getDateTime();
        int day = dateTime.getDayOfMonth();
        String month = dateTime.getMonth().name();
        int year = dateTime.getYear();
        DayOfWeek dayofweek = dateTime.getDayOfWeek();
        int hour = dateTime.getHour();
        int minute = dateTime.getMinute();

        String time = hour + ":" + minute;
        User user = schedules.getUser();
        User master = schedules.getMaster();
        model.addAttribute("master", master );
        model.addAttribute("user", user);
        model.addAttribute("day", day);
        model.addAttribute("month", month);
        model.addAttribute("year", year);
        model.addAttribute("dayofweek", dayofweek);
        model.addAttribute("time", time);
        return "success_record";
    }

}
