package com.helloworld.service;

import com.helloworld.model.Greeting;
import com.helloworld.model.User;
import com.helloworld.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class GreetingService implements IGreetingService{

    private static final String TEMPLATE = "Hello, %s";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    GreetingRepository repository;

    public Greeting addGreeting(User user) {

        String fullName = user.getFirstName();

        if (user.getLastName() != null && !user.getLastName().isBlank()) {
            fullName += " " + user.getLastName();
        }

        String message = String.format(TEMPLATE, fullName);

        return repository.save(
                new Greeting(counter.incrementAndGet(), message)
        );
    }

    @Override
    public Greeting getGreetingById(long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Greeting> getAll() {
        return repository.findAll();
    }
}

