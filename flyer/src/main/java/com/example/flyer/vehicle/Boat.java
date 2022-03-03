package com.example.flyer.vehicle;

public class Boat extends AbstractVehicle implements Floatable{
    public Boat(String name){
        super(name);
    }

    public void turnOn(){ System.out.println("Tekne çalıştırıldı");}

    public void stop(){ System.out.println("Tekne durdu");}

    public void go(){ System.out.println("Tekne gidiyor.");}

    public void turnOff(){ System.out.println("Tekne kapatıldı.");}

    @Override
    public void floatNow(){
        System.out.println("Tekne şuan yüzüyor.");
    }

    @Override
    public void park(){
        System.out.println("Tekne limana yanaştı.");
    }

    @Override
    public String toString(){
        return "Tekne [Adı = " + name + "]";
    }
}
