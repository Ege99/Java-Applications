package com.example.flyer;

import com.example.flyer.driver.Hangar;
import com.example.flyer.driver.Harbour;
import com.example.flyer.driver.Pilot;
import com.example.flyer.driver.UniversalDriver;
import com.example.flyer.vehicle.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FlyerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyerApplication.class, args);

        SeaPlane seaPlane = new SeaPlane(" Ege'nin Deniz Uçağı ");
        Floatable floatable = seaPlane;
        Airplane airplane = seaPlane;
        AbstractVehicle abstractVehicle = seaPlane;
        Vehicle vehicle = seaPlane;
        Flyer flyer = seaPlane;
        Object object = seaPlane;


        ///////////////////////////////////////////////////////////////////////////

        Pilot pilot = new Pilot(" 'Hilmi Ege SUBAT' ");
        pilot.drive(seaPlane);  // Vehicle

        Hangar hangar = new Hangar(" 'SUBAT Hangarı' ");
        hangar.store(seaPlane); // Airplane

        Harbour harbour = new Harbour(" 'Tuzla Limanı' ");
        harbour.enter(seaPlane);    // Floatable

        List list = new ArrayList();
        list.add(seaPlane); // Object

        UniversalDriver universalDriver = new UniversalDriver(" 'Ege' ");
        universalDriver.drive(seaPlane);    // Vehicle
    }

}
