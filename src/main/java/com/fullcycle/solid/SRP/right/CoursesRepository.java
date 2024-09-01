package com.fullcycle.solid.SRP.right;

import java.util.ArrayList;
import java.util.List;

public class CoursesRepository implements  ICourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public void save(Course course) {
        courses.add(course);
    }

    public List<Course> list() {
        return courses;
    }

    public Course get(int index) {
        return courses.get(index);
    }

    public Course delete(int index) {
        return courses.remove(index);
    }

    public Course update(int index, String name, String description, String category) {
        return courses.set(index, Course.create(name, description, category));
    }
}
