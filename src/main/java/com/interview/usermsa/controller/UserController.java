package com.interview.usermsa.controller;

import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/user/{id}")
    public String getUserDetails(@PathVariable @NonNull int id) {
        if (id != 0 && id > 0) {
            return "User: Shankar is working fine!";
        }
        return "Invalid user Id";
    }


}
