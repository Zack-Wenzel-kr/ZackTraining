package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//implementing CLR is required for run method to work
public class PracticeApplication implements CommandLineRunner {
    @Autowired
    ApplicationContext applicationContext;
    public static void main(String[] args) {SpringApplication.run(PracticeApplication.class, args);}
    @Override
    public void run(String... args) throws Exception {
        PC1 c = applicationContext.getBean(PC1.class);
        c.printSpecs();
        System.out.println("Cost: " + c.Cost());
    }

}
