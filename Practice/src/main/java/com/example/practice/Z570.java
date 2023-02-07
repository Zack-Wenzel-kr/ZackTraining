package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class Z570 implements Motherboard{
    public Z570(){};
    @Override
    public String Manufacturer() {
        return "MSI";
    }

    @Override
    public double Cost() {
        return 189.99;
    }

    @Override
    public String Form() {
        return "Micro";
    }

    @Override
    public String Name() {
        return "Z570";
    }
}
