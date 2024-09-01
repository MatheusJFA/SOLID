package com.fullcycle.solid.SRP.wrong;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final static List<Course> courses = new ArrayList<>();

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

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    // This is adding into the list of courses, but, could be a database, a file, etc.
    // This class should not be responsible for saving, listing, getting, deleting, and updating courses
    // As you can see, this class is doing more than one thing such as managing the course and managing the list of courses
    public static void save(Course course) {
        courses.add(course);
    }

    public static List<Course> list() {
        return courses;
    }

    public static Course get (int index) {
        return courses.get(index);
    }

    public static Course delete(int index) {
        return courses.remove(index);
    }

    public static Course update(int index, String name, String description, String category) {
        return courses.set(index, new Course(name, description, category));
    }

    @Override
    public String toString() {
        return String.format("Course [name=%s, description=%s, category=%s]", name, description, category);
    }
}
