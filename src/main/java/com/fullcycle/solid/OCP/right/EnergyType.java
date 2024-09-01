package com.fullcycle.solid.OCP.right;

public class EnergyType {

    // This method is responsible for returning the energy type of any car
    // If I want to add a new type of car, I just need to add a new case without changing the Car class code

    // Of course, this is a simple way of viewing the Open/Closed Principle
    // This class could tell where is the closest "gas" station for the car energy type, for example
    // Or it could tell how much time the car needs to be charged or refueled
    // But the main idea is that the Car class should not be responsible for returning the energy type of the car
    public String energy(String type) {
        return switch (type) {
            case "electric" -> "Electric";
            case "gasoline" -> "Gasoline";
            case "solar" -> "Solar";
            default -> "Hybrid";
        };
    }
}
