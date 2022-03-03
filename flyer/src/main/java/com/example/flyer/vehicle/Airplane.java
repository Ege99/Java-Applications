package com.example.flyer.vehicle;

public class Airplane extends AbstractVehicle implements Flyer{

    public Airplane(String name){
        super(name);
    }

    public void turnOn(){
        System.out.println("Uçak çalıştırıldı.");
    }

    public void stop(){
        System.out.println("Uçak durdu.");
    }

    public void go(){
        System.out.println("Uçak gidiyor.");
    }

    public void turnOff(){
        System.out.println("Uçak kapatıldı.");
    }

    @Override
    public void takeOff(){
        System.out.println("Uçak kalkışa hazır.");
    }

    @Override
    public void fly(){
        System.out.println("Uçak uçuyor.");
    }

    @Override
    public void land(){
        System.out.println("Uçak iniyor.");
    }

    @Override
    public String toString()
    {
        return "Uçak [Adı = " + name + "]";
    }
}
