package com.fullcycle.solid.OCP.right;

public class OCP {
    public static void main(String[] args) {
        EnergyType energyType = new EnergyType();

        Car combustionCar = Car.create("Red", "Fusca", 1979, "gasoline");
        System.out.println(combustionCar);
        System.out.println(energyType.energy(combustionCar.getEnergy()));

        Car electricCar = Car.create("Blue", "Tesla", 2021, "electric");
        System.out.println(electricCar);
        System.out.println(energyType.energy(electricCar.getEnergy()));

        Car hybridCar = Car.create("Green", "Prius", 2021, "hybrid");
        System.out.println(hybridCar);
        System.out.println(energyType.energy(hybridCar.getEnergy()));

        // Adding a new type of car
        Car solarCar = Car.create("Yellow", "Solar", 2021, "solar");
        System.out.println(solarCar);
        System.out.println(energyType.energy(solarCar.getEnergy()));

    }
}

