package com.example.flyer.vehicle;

public class SeaPlane extends Airplane implements Floatable{

    public SeaPlane(String name){ super(name);}

    public void turnOn(){ System.out.println("Deniz uçağı çalıştırıldı.");}

    public void stop(){ System.out.println("Deniz uçağı durduruldu.");}

    public void go(){ System.out.println("Deniz uçağı gidiyor.");}

    public void turnOff(){ System.out.println("Deniz uçağı kapatıldı.");}

    @Override
    public void takeOff(){ System.out.println("Deniz uçağı kalkışa hazır.");}

    @Override
    public void fly(){ System.out.println("Deniz uçağı uçuyor.");}

    @Override
    public void land(){ System.out.println("Deniz uçağı iniyor.");}

    @Override
    public void floatNow(){ System.out.println("Deniz uçağı yüzüyor.");}

    @Override
    public void park(){ System.out.println("Deniz uçağı limana yanaşıyor.");}

    @Override
    public String toString(){
        return "Deniz uçağı [Adı = " + name + "]";
    }
}
