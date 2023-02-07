package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class PowerSupply implements PSU{
    @Override
    public String Manufacturer() {
        return "Corsair";
    }

    @Override
    public double Cost() {
        return 75;
    }

    @Override
    public String powerOutput() {
        return "750w";
    }

    @Override
    public String Name() {
        return "Corsair 750w";
    }

}
