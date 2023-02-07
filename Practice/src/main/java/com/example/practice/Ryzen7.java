package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class Ryzen7 implements CPU{
    @Override
    public String Manufacturer() {
        return "AMD";
    }

    @Override
    public double Cost() {
        return 299.99;
    }

    @Override
    public String Name() {
        return "Ryzen 7 7700x";
    }
}
