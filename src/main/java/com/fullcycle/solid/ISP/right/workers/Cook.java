package com.fullcycle.solid.ISP.right.workers;

public class Cook implements Chief {
    @Override
    public void cook() {
        System.out.println("I'm a cook and I'm cooking");
    }

    @Override
    public void work() {
        System.out.println("I'm a cook and I'm working");
    }
}
