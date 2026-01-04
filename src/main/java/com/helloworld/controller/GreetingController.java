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

    @GetMapping("/hello")
    public Greeting sayHello() {
        return greetingService.sayHello();
    }

//    @GetMapping("")
//    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
//        User user = new User();
//        user.setFirstName(name);
//        return greetingService.addGreeting(user);
//    }
}
