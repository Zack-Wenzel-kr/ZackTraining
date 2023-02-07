package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class R5700 implements GraphicsCard{
    @Override
    public String Manufacturer() {
        return "AMD";
    }

    @Override
    public double Cost() {
        return 699.99;
    }

    @Override
    public String Name() {
        return "Radeon 5700";
    }
}
