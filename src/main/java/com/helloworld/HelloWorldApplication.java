package com.helloworld;

import com.helloworld.component.DemoBean;
import com.helloworld.component.EmployeeBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

    public static final Logger logger = LoggerFactory.getLogger(HelloWorldApplication.class);

    public static void main(String[] args) {

        logger.debug("Welcome to spring concept demo");
        ApplicationContext context = SpringApplication.run(HelloWorldApplication.class, args);
        logger.debug("Checking Context: {}", context.getBean(DemoBean.class));
        logger.debug("\n*** Example using @Autowire annotation on property ***");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.setEid(69);
        employeeBean.setEname("Abhi");
        employeeBean.showEmployeeDetails();
    }

}
