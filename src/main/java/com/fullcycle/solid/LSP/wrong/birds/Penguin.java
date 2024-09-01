package com.fullcycle.solid.LSP.wrong.birds;

public class Penguin extends Bird {
    public void fly() {
        throw new RuntimeException("I'm a " + this.getClass().getSimpleName() + " and I can't fly");
    }
}
