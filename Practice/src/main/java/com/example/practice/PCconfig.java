package com.example.practice;

import org.springframework.context.annotation.Configuration;

@Configuration
public class PCconfig {
    public CPU cpu(){
        return new I9();
    }
    public RAM ram(){
        return new RipJaw();
    }
    public Case acase(){
        return new NZXT();
    }
}
