package com.fullcycle.solid.LSP.right.birds;

public abstract class Bird {
    public void eat() {
        System.out.println("I'm a " + this.getClass().getSimpleName() + " and I'm eating");
    }

    public abstract void doYourThing();
}
