package com.example.flyer.driver;

import com.example.flyer.vehicle.Airplane;

public class Hangar {

    protected String name;

    public Hangar(String name)
    {
        this.name = name;
    }

    public void store(Airplane plane){
        System.out.println("\n" + plane + " adlı uçak " + name + " hangarında duruyor.");
        plane.go();
        plane.takeOff();
        plane.land();
    }

    @Override
    public String toString()
    {
        return "Hangar [Adı = " + name + "]";
    }
}
