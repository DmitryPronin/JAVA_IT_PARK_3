package ru.itpark.probro.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.probro.forms.RegistrationForm;
import ru.itpark.probro.models.User;
import ru.itpark.probro.services.RegistrationService;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationService service;

    @PostMapping("/registration")
    public String registrationUser(@ModelAttribute RegistrationForm form,
                                   @ModelAttribute("model") ModelMap model) {
        User user = service.registration(form);
        String email = user.getEmail();
        String name = user.getName();
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "success";
    }

    @GetMapping("/registration")
    public String getRegistrationPage() {
        return "registration_page";
    }

    @GetMapping("/confirm/{confirm-string}")
    public String getConfirmPage(@ModelAttribute("model") ModelMap model,
                                 @PathVariable("confirm-string") String confirmString) {
        boolean result = service.confirm(confirmString);
        model.addAttribute("result", result);
        return "confirm_result_page";

    }

    @GetMapping("/")
    public String index(){
        return "login";
    }



    @GetMapping("/login")
    public String login(
            @ModelAttribute("model") ModelMap model,
            @RequestParam(value = "error", required = false) Boolean error) {
        if (error != null) {
            model.addAttribute("error", true);
        } else {
            model.addAttribute("error", false);
        }
        return "login";
    }

}
