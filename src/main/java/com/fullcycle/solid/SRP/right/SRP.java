package com.fullcycle.solid.SRP.right;


public class SRP {
    public static void main(String[] args) {
        CoursesRepository repository = new CoursesRepository();

        System.out.println("Creating courses");
        repository.save(Course.create("Clean Code", "Clean Code Principles", "Programming"));
        repository.save(Course.create("SOLID", "SOLID Principles", "Programming"));
        repository.save(Course.create("Java", "Java Programming", "Programming"));
        repository.save(Course.create("Spring", "Spring Framework", "Programming"));
        repository.save(Course.create("React", "React Framework", "Programming"));
        repository.save(Course.create("Docker", "Docker Containers", "DevOps"));

        System.out.println("List of courses:");
        repository.list().forEach(System.out::println);

        System.out.println("Removing the first course:");
        System.out.println(repository.delete(0));
        System.out.println("List of courses without the first one:");

        System.out.println("Get the first course:");
        System.out.println(repository.get(0));

        System.out.println("Updating the first course:");
        repository.update(0, "SOLID", "SOLID Principles", "Improving programming");
        System.out.println("List of courses with the first one updated:");
        repository.list().forEach(System.out::println);
    }
}