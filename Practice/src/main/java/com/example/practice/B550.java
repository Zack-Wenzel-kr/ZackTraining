package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class B550 implements Motherboard{
    @Override
    public String Manufacturer() {
        return "MSI";
    }

    @Override
    public double Cost() {
        return 100;
    }

    @Override
    public String Form() {
        return "Mid";
    }

    @Override
    public String Name() {
        return "B550";
    }
}
