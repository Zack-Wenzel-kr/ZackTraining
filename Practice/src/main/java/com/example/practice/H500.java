package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class H500 implements Case{
    @Override
    public String Manufacturer() {
        return "Corsair";
    }

    @Override
    public String Form() {
        return "Mid";
    }

    @Override
    public double Cost() {
        return 100;
    }

    @Override
    public String Name() {
        return null;
    }
}
