package com.helloworld.service;

import com.helloworld.model.Greeting;
import com.helloworld.model.User;
import com.helloworld.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService {
    private static final String template = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    public Greeting sayHello() {
        return new Greeting(counter.incrementAndGet(), "Hello World");
    }

    public Greeting addGreeting(User user) {
        String message = String.format(template, (user.toString().isEmpty()) ? "World" : user.toString());
        return new Greeting(counter.incrementAndGet(), message);
    }
}
