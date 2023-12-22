package com.blit.inheritance;

public class Bird extends Animal{

    boolean canFly;
    Bird(int legs, int eyes, String name, boolean canFly) {
        super(legs, eyes, name);
        this.canFly = canFly;
    }

    @Override
    public void walk(){
        System.out.println(this.name + " is flying");
    }

    @Override
    public void talk(){
        System.out.println(this.name + "cannot talk");
    }

    public void roar(){
        System.out.println(this.name + "cannot roar");
    }


    public static void main(String[] args) {
        Bird bird = new Bird(2, 2,"bird", true);
        Animal animal = new Bird(2,2,"bird", false);
        bird.roar();
        animal.walk();

    }
}
