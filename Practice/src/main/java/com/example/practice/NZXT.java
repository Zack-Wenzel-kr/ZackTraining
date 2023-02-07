package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class NZXT implements Case{
    @Override
    public String Manufacturer() {
        return "NZXT";
    }

    @Override
    public String Form() {
        return "Micro";
    }

    @Override
    public double Cost() {
        return 75;
    }

    @Override
    public String Name() {
        return "NZXT";
    }
}
