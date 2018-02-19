package ru.itpark.probro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.probro.forms.NamesForm;
import ru.itpark.probro.forms.UpdateForm;
import ru.itpark.probro.models.User;
import ru.itpark.probro.services.AuthenticationService;
import ru.itpark.probro.services.UsersService;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersService service;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping(value = "/profile")
    public String getProfilePage(
            @ModelAttribute("model") ModelMap model,
            Authentication authentication) {
        User user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        return "profile";
    }

    @GetMapping(value = "/profile_edit")
    public String getEditPage(
            @ModelAttribute("model") ModelMap model,
            Authentication authentication){
        User user = authenticationService.getUserByAuthentication(authentication);
        model.addAttribute("user", user);
        return "profile_edit";
    }

    @PostMapping(value = "/profile_edit")
    public String updateUser(@ModelAttribute UpdateForm form,
                             @ModelAttribute("model") ModelMap model,
                             Authentication authentication){
      User user = service.update(authenticationService.getUserByAuthentication(authentication).getId(), form);
      model.addAttribute("user", user);
      return "profile";
    }

}