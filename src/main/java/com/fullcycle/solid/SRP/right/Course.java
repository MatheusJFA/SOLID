package com.fullcycle.solid.SRP.right;

public class Course {
    // This class is responsible for managing the course
    private final String name;
    private final String description;
    private final String category;

    private Course(String name, String description, String category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    // This is creating a course using a factory method
    public static Course create(String name, String description, String category) {
        return new Course(name, description, category);
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return String.format("Course [name=%s, description=%s, category=%s]", name, description, category);
    }
}
