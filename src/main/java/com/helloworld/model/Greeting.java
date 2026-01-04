package com.helloworld.model;

public class Greeting {
    private long numberOfGreetings;
    private String message;

    public Greeting(long numberOfGreetings, String message) {
        this.numberOfGreetings = numberOfGreetings;
        this.message = message;
    }

    public long getNumberOfGreetings() {
        return numberOfGreetings;
    }

    public void setNumberOfGreetings(long numberOfGreetings) {
        this.numberOfGreetings = numberOfGreetings;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
