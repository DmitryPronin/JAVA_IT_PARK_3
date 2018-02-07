package ru.itpark.probro.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.probro.forms.ScheduleForm;
import ru.itpark.probro.models.Schedules;
import ru.itpark.probro.models.User;
import ru.itpark.probro.models.enums.Role;
import ru.itpark.probro.models.enums.Status;
import ru.itpark.probro.services.AuthenticationService;
import ru.itpark.probro.services.ScheduleService;
import ru.itpark.probro.services.UsersService;

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



    @GetMapping("/schedules")
    public String loadSchedule(@ModelAttribute ScheduleForm form,
                               @ModelAttribute("model") ModelMap model){
        LocalDateTime today;
        if (form.getDate() == null) {
            today = LocalDateTime.now();
        }else {
            today = LocalDateTime.parse(form.getDate());
        }
        System.out.println(today);

        List<Schedules> schedules = scheduleService.getScheduleByData(today);
        System.out.println(schedules);
        model.addAttribute("model", schedules);

        return "schedule";
    }

    @GetMapping("/schedule")
    public String loadDate(
            @ModelAttribute ScheduleForm form,
            @ModelAttribute("model") ModelMap model) {
        LocalDate today;
        if (form.getDate() == null) {
            today = LocalDate.now();
        }else {
            today = LocalDate.parse(form.getDate());
        }

        Role role = Role.ADMIN;
        List<User> users = usersService.getUsersByRole(role);
        model.addAttribute("today", today);
        model.addAttribute("users", users);
        return "index";
    }

    @PostMapping("/schedule")
    public String saveSchedule(@ModelAttribute ScheduleForm form,
                               @ModelAttribute("model") ModelMap model,
                               Authentication authentication){
        Schedules schedules = scheduleService.addNewSchedule(authentication,form);
        LocalDate today;
        if (form.getDate() == null) {
            today = LocalDate.now();
        }else {
            today = LocalDate.parse(form.getDate());
        }

        Role role = Role.ADMIN;
        List<User> users = usersService.getUsersByRole(role);
        model.addAttribute("today", today);
        model.addAttribute("users", users);

        return "index";
    }








//    @GetMapping("/schedule")
//    public String addNewSchedule(@ModelAttribute ScheduleForm form,
//                                 @ModelAttribute("model") ModelMap model){
//        //Schedules schedules = scheduleService.addNewSchedule(form);
////        model.addAttribute("id",id);
//        return "schedule";
//
//    }







}
