package com.fullcycle.solid.OCP.right;

public class Car {
    // This class is responsible for managing the car
    // This class should not be responsible for returning the energy type of the car

    private final String color;
    private final String model;
    private final int year;
    private final String energy;

    private Car(String color, String model, int year, String energy) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.energy = energy;
    }

    public static Car create(String color, String model, int year, String energy) {
        return new Car(color, model, year, energy);
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getEnergy() {
        return energy;
    }

    @Override
    public String toString() {
        return String.format("Car [color=%s, model=%s, year=%s, energy=%s]", color, model, year, energy);
    }
}
