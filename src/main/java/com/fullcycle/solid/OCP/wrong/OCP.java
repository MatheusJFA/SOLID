package com.fullcycle.solid.OCP.wrong;

public class OCP {
    public static void main(String[] args) {
        Car combustionCar = Car.create("Red", "Fusca", 1979, "gasoline");
        System.out.println(combustionCar);
        System.out.println(combustionCar.energy());

        Car electricCar = Car.create("Blue", "Tesla", 2021, "electric");
        System.out.println(electricCar);
        System.out.println(electricCar.energy());

        Car hybridCar = Car.create("Green", "Prius", 2021, "hybrid");
        System.out.println(hybridCar);
        System.out.println(hybridCar.energy());

        // Adding a new type of car
        Car solarCar = Car.create("Yellow", "Solar", 2021, "solar");
        System.out.println(solarCar);
        // This is a problem because the energy method should not be in the Car class
        System.out.println(solarCar.energy()); // This will return Hybrid
    }
}

