package com.helloworld.service;

import com.helloworld.model.Greeting;
import com.helloworld.model.User;

import java.util.List;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
    List<Greeting> getAll();
    Greeting updateGreeting(long id, Greeting greeting);
    void deleteGreeting(long id);
}
