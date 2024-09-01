package com.fullcycle.solid.LSP.wrong.birds;

public class Hawk extends Bird {


    @Override
    public void fly() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " and I can fly");
    }
}
