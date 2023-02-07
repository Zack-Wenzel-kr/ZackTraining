package com.example.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PC1 {
    GraphicsCard gpu;
    PSU psu;
    //constructor injection
    public PC1(GTX3080 gpu, PowerSupply psu ){
        this.gpu = gpu;
        this.psu = psu;
    }
    Motherboard mobo;

    //Setter injection
    @Autowired
    public void setMobo(Z570 mobo){
        this.mobo = mobo;
    }

    //Field injection, relies on config class
    @Qualifier("ripJaw")
    @Autowired
    RAM ram;
    @Qualifier("i9")
    @Autowired
    CPU cpu;
    @Autowired
    @Qualifier("NZXT")
    Case acase;


    public double Cost(){
        double cost = 0;
        cost += cpu.Cost();
        cost += ram.Cost();
        cost += gpu.Cost();
        cost += mobo.Cost();
        cost += psu.Cost();
        cost += acase.Cost();
        return cost;
    }

    public void printSpecs(){
        System.out.println("Motherboard: " + this.mobo.Name());
        System.out.println("CPU: " + this.cpu.Name());
        System.out.println("GPU: " + this.gpu.Name());
        System.out.println("RAM: " + this.ram.Name());
        System.out.println("Power Supply: " + this.psu.Name());
        System.out.println("Case: " + this.acase.Name());
    }



}
