package com.interview.usermsa.controller;

import com.interview.usermsa.client.OrderClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private OrderClient orderClient;

    @GetMapping("/user/{id}")
    public String getUserDetails(@PathVariable int id) {
        log.info("Inside class UserController with id : {} " + id);
        if (id != 0 && id > 0) {
           return orderClient.getMessageFromOrderService(id);
        }
        return "Invalid user Id";
    }


}
