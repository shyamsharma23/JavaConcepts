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






    public static void main(String[] args) {
        Bird bird = new Bird(2, 2,"bird", true);
        Animal animal = new Bird(2,2,"bird", false);


    }
}
