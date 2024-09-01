package com.fullcycle.solid.ISP.wrong.worker;

public class Driver implements Worker {

    // This method should not be here, it should be in another interface
    // Because the driver doesn't cook
    @Override
    public void cook() {
        throw new UnsupportedOperationException("Driver doesn't cook");
    }

    @Override
    public void drive() {
        System.out.println("Driving");
    }

    @Override
    public void work() {
        System.out.println("Working");
    }
}
