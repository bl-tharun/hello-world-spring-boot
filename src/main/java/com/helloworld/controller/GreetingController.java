package com.helloworld.controller;

import com.helloworld.model.Greeting;
import com.helloworld.model.User;
import com.helloworld.service.GreetingService;
import com.helloworld.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("")
    public Greeting greeting(
            @RequestParam(value = "fname", defaultValue = "World") String fname,
            @RequestParam(value = "lname", defaultValue = "") String lname
    ) {
        User user = new User();
        user.setFirstName(fname);
        user.setLastName(lname);
        return greetingService.addGreeting(user);
    }
}
