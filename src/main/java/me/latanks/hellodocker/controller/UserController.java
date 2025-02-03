package me.latanks.hellodocker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Docker!";
    }
}
