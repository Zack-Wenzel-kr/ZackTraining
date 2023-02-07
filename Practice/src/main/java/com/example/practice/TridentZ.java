package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class TridentZ implements RAM{
    @Override
    public String Manufacturer() {
        return "Corsair";
    }

    @Override
    public double Cost() {
        return 200;
    }

    @Override
    public int Capacity() {
        return 32;
    }

    @Override
    public int Frequency() {
        return 4000;
    }

    @Override
    public String Name() {
        return "Trident Z 4000mhz";
    }
}
