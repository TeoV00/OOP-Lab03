package oop.lab03.acme;

import java.util.Arrays;

public class Professor implements User {

    private static final String DOT = ".";
    private final int id;
    private final String name;
    private final String surname;
    private final String password;
    private String[] courses;

    public Professor(final int id, final String name, final String surname, final String passw,
            final String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = passw;
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    public void replaceCourse(final String course, final int index) {
        if (index < this.courses.length) {
        this.courses[index] = course;
        }
    }

    public void replaceAllCourses(final String[] courses) {
        this.courses = Arrays.copyOf(courses, courses.length);
    }

    public String getUsername() {
        return this.name + Professor.DOT + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String toString() {
        return "Professor [id=" + id + ", name=" + name + ", surname=" + surname + ", courses=" 
                + Arrays.toString(courses) + "]";
    }

    public String getDescription() {
        return this.toString();
    }
}
