package com.fullcycle.solid.SRP.wrong;

public class SRP {
    public static void main(String[] args) {
        System.out.println("Creating courses");
        Course.save(Course.create("Clean Code", "Clean Code Principles", "Programming"));
        Course.save(Course.create("SOLID", "SOLID Principles", "Programming"));
        Course.save(Course.create("Java", "Java Programming", "Programming"));
        Course.save(Course.create("Spring", "Spring Framework", "Programming"));
        Course.save(Course.create("React", "React Framework", "Programming"));
        Course.save(Course.create("Docker", "Docker Containers", "DevOps"));

        System.out.println("List of courses:");
        Course.list().forEach(System.out::println);

        System.out.println("Removing the first course:");
        System.out.println(Course.delete(0));
        System.out.println("List of courses without the first one:");

        System.out.println("Get the first course:");
        System.out.println(Course.get(0));

        System.out.println("Updating the first course:");
        Course.update(0, "SOLID", "SOLID Principles", "Improving programming");
        System.out.println("List of courses with the first one updated:");
        Course.list().forEach(System.out::println);
    }
}

