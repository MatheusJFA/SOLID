package com.fullcycle.solid.OCP.wrong;

public class Car {
    private final String color;
    private final String model;
    private final int year;
    private final String type;

    private Car(String color, String model, int year, String type) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.type = type;
    }

    public static Car create(String color, String model, int year, String type) {
        return new Car(color, model, year, type);
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

    public String getType() {
        return type;
    }


    // This method is responsible for returning the energy type of the car
    // This method should be in a different class
    // Because if we want to add a new type of car, we need to change this function
    // This class should not be responsible for returning the energy type of the car
    public String energy() {
        return switch (type) {
            case "electric" -> "Electric";
            case "gasoline" -> "Gasoline";
            default -> "Hybrid";
        };
    }

    @Override
    public String toString() {
        return String.format("Car [color=%s, model=%s, year=%s, type=%s]", color, model, year, type);
    }
}
