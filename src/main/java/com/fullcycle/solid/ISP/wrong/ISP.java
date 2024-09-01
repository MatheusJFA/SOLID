package com.fullcycle.solid.ISP.wrong;

import com.fullcycle.solid.ISP.wrong.worker.Chief;
import com.fullcycle.solid.ISP.wrong.worker.Driver;

public class ISP {
    public static void main(String[] args) {
        var chief = new Chief();
        try {
            System.out.println(chief.getClass().getSimpleName());
            chief.work();
            chief.cook();
            chief.drive();
            System.out.println();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("====================================");

        try {
            var driver = new Driver();
            System.out.println(driver.getClass().getSimpleName());
            driver.work();
            driver.cook();
            driver.drive();
            System.out.println();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
