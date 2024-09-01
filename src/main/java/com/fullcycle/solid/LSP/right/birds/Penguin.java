package com.fullcycle.solid.LSP.right.birds;

public class Penguin extends Bird {
    public void doYourThing() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " and I am swimming");
    }
}
