package com.example.demo.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller("")
public class FirstController {
    @GetMapping("/")
    String getMain() {
        return "welcome";
    }

    @GetMapping("/info")
    String getMain(@RequestParam String parameter, Model model) {
        model.addAttribute("guest_name",parameter);
        return "info";
    }
}
