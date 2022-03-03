package com.example.flyer.driver;

import com.example.flyer.vehicle.Floatable;

public class Harbour {

    protected String name;

    public Harbour(String name){
        this.name = name;
    }

    public void enter(Floatable floatable){
        System.out.println("\n" + floatable + " limana giriş yaptı: " + name);
        floatable.floatNow();
        floatable.park();
    }

    @Override
    public String toString(){
        return "Liman [Adı = " + name + "]";
    }
}
