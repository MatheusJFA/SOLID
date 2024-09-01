package com.fullcycle.solid.ISP.right.workers;

public class CarDriver implements Driver {
    @Override
    public void drive() {
        System.out.println("I'm a driver and I'm driving");
    }

    @Override
    public void work() {
        System.out.println("I'm a driver and I'm working");
    }
}
