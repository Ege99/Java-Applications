package com.example.flyer.driver;

import com.example.flyer.vehicle.Vehicle;

public class UniversalDriver extends AbstractDriver{

    public UniversalDriver(String name) {
        super(name);
    }

    @Override
    public void drive(Vehicle vehicle){
        park(vehicle);
    }

    public void park(Vehicle vehicle){
        System.out.println("\n" + name + vehicle + " park ediyor ");
        vehicle.turnOn();
        vehicle.go();
        vehicle.stop();
        vehicle.turnOff();
    }
}
