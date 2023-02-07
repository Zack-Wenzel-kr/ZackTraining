package com.example.practice;

import org.springframework.stereotype.Component;

@Component
public class RipJaw implements RAM{
    @Override
    public String Manufacturer() {
        return "Gskill";
    }

    @Override
    public double Cost() {
        return 150;
    }

    @Override
    public int Capacity() {
        return 32;
    }

    @Override
    public int Frequency() {
        return 3666;
    }

    @Override
    public String Name() {
        return "Ripjaw 3666mhz";
    }
}
