package com.example.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class I9 implements CPU{

    public I9(){};
    String name = "I9-10900k";

    @Override
    public String Manufacturer() {
        return "Intel";
    }

    @Override
    public double Cost() {
        return 399.99;
    }

    public void setName(String theName){
        name = theName;
    }

    @Override
    public String Name() {
        return name;
    }
}
