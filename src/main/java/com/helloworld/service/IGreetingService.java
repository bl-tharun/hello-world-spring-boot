package com.helloworld.service;

import com.helloworld.model.Greeting;
import com.helloworld.model.User;

public interface IGreetingService {
    Greeting addGreeting(User user);
    Greeting getGreetingById(long id);
}
