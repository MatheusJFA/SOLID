package com.fullcycle.solid.LSP.right;

import com.fullcycle.solid.LSP.right.birds.*;

import java.util.ArrayList;
import java.util.List;

public class LSP {
    public static void main(String[] args) {
        List<Bird> birds = new ArrayList<>();

        birds.add(new Hawk());
        birds.add(new Penguin());

        // This is the Liskov Substitution Principle, the idea is that a subclass should be able to replace its parent class without affecting the behavior of the system.
        // As you can see in the code each class have two methods, the first one is called eat and another one called doYourThing, but each class implements this method in a different way.
        // So the Penguin class doesn't have to implement the fly method, because it is not a flying bird and the Hawk class doesn't have to implement the swim method, because it is not a swimming bird.
        for (Bird bird : birds) {
            bird.eat();
            bird.doYourThing();
            System.out.println();
        }
    }
}

