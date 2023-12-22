package com.blit.inheritance;

public class Animal {

    int legs;

    int eyes;

    String name;

    Animal(int legs, int eyes, String name){
        this.eyes = eyes;
        this.legs = legs;
        this.name = name;


    }

    public void walk(){
        System.out.println(this.name + " is walking");
    }

    public void talk(){
        System.out.println(this.name + "can talk");
    }

}
