package com.example.flyer.animal;

public class Eagle extends Bird implements Hunter{

    public Eagle(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println(" Kartal yemek yiyor. ");
    }

    @Override
    public void takeOff(){
        System.out.println(" Kartal kalkışa hazır. ");
    }

    @Override
    public void fly(){
        System.out.println(" Kartal uçuyor. ");
    }

    @Override
    public void land(){
        System.out.println(" Kartal iniyor. ");
    }

    @Override
    public void hunt(){
        System.out.println(" Kartal avlanıyor. ");
    }
}
