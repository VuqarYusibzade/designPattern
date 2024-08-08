package org.example.creationalpatterns.builder;

public class Main {
    public static void main(String[] args) {
        AcademyStudents students = new AcademyStudents.StudentBuilder("Vugar", "Yusibzada")
                .age(22)
                .position("Junior")
                .build();

        System.out.println("Name:"+students.getName());
        System.out.println("Surname:"+students.getSurname());
        System.out.println("Age:"+students.getAge());
        System.out.println("Position:"+students.getPosition());

    }
}