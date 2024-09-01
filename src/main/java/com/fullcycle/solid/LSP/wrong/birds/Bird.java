package com.fullcycle.solid.LSP.wrong.birds;

public abstract class Bird {
    // This method is not applicable to all birds
    // For example, Ostrich and Penguin can't fly
    // But the code will compile because the method is abstract
    // So each and every subclass of Bird must implement this method, even if it doesn't make sense

    public abstract void fly();
}
