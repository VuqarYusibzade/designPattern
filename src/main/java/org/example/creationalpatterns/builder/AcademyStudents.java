package org.example.creationalpatterns.builder;

public class AcademyStudents {
    private final String name;
    private final String surname;
    private final int age;
    private final String position;


    private AcademyStudents(StudentBuilder builder){
        this.name=builder.name;
        this.surname=builder.surname;
        this.age=builder.age;
        this.position=builder.position;
    }
    public static class StudentBuilder {
        private final String name;
        private final String surname;
        private  int age;
        private String position;

        public StudentBuilder(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder position(String position) {
            this.position = position;
            return this;
        }
        public AcademyStudents build(){
            return new AcademyStudents(this);
        }
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }
}
