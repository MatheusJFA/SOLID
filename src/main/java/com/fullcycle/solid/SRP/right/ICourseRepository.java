package com.fullcycle.solid.SRP.right;

import java.util.List;

public interface ICourseRepository {
    void save(Course course);
    List<Course> list();
    Course get(int index);
    Course delete(int index);
    Course update(int index, String name, String description, String category);
}
