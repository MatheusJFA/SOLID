package com.fullcycle.solid.LSP.right.birds;

public class Hawk extends Bird {
    public void doYourThing() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " and I am flying");
    }
}

