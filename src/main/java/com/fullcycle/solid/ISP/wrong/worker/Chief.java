package com.fullcycle.solid.ISP.wrong.worker;

public class Chief implements Worker {
    @Override
    public void cook() {
        System.out.println("Cooking");
    }

    // This method should not be here, it should be in another interface
    // Because the chief doesn't drive
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Chief doesn't drive");
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}

