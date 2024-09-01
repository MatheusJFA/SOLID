package com.fullcycle.solid.LSP.wrong;

import com.fullcycle.solid.LSP.wrong.birds.*;

import java.util.ArrayList;
import java.util.List;

public class LSP {
    public static void main(String[] args) {
        try {
            List<Bird> birds = new ArrayList<>();
            birds.add(new Hawk());
            birds.add(new Penguin());

            // In the Liskov Substitution Principle, the idea is that a subclass should be able to replace its parent class without affecting the behavior of the system.
            // In this case, the Penguin class should not be able to fly, but the code is not prepared to handle this situation.
            for (Bird bird : birds) {
                bird.fly();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

