package com.fullcycle.solid.ISP.right;

import com.fullcycle.solid.ISP.right.workers.*;

public class ISP {
    public static void main(String[] args) {
        CarDriver carDriver = new CarDriver();
        carDriver.drive();
        carDriver.work();

        System.out.println("====================================");

        Cook cook = new Cook();
        cook.cook();
        cook.work();
    }
}

