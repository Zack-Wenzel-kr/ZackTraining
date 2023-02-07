package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class GTX3080 implements GraphicsCard{
    @Override
    public String Manufacturer() {
        return "Nvidia";
    }

    @Override
    public double Cost() {
        return 899.99;
    }

    @Override
    public String Name() {
        return "Rtx 3080";
    }
}
