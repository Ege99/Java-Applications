package com.example.flyer.animal;

import com.example.flyer.vehicle.Flyer;

public class Bird extends Animal implements Flyer {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(" Kuş yemek yiyor. ");
    }

    @Override
    public void takeOff() {
        System.out.println(" Kuş kalkışa hazır. ");
    }

    @Override
    public void fly(){System.out.println(" Kuş uçuyor. ");}

    @Override
    public void land(){System.out.println(" Kuş iniyor. ");}

}
