package oop.lab03.acme;

import java.util.Arrays;

public class Exam {

    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;
    private Student[] students;

    Exam(final int examID, final int maxStud, final String courseName, final Professor prof, 
            final ExamRoom room) {
        this.id = examID;
        this.maxStudents = maxStud;
        this.courseName = courseName;
        this.professor = prof;
        this.room = room;
        this.students = new Student[maxStudents];
        this.registeredStudents = 0;
    }

    public void registerStudent(final Student student) {
        if (this.registeredStudents < this.maxStudents) {
            this.students[registeredStudents] = student;
            incrementStudentNum();
        }
    }

    public int getRegisteredStudents() {
        return registeredStudents;
    }

    public Student[] getStudents() {
        return Arrays.copyOf(this.students, this.students.length);
    }

    public int getId() {
        return id;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public Professor getProfessor() {
        return professor;
    }

    public ExamRoom getRoom() {
        return room;
    }

    private void incrementStudentNum() {
        this.registeredStudents += 1;
    }

    public String toString() {
            return "ID: " + this.id + ", Course: " + this.courseName + ", Porf: " + this.professor
                    + ", Room: " + this.room + ", Registered Student: " + this.registeredStudents
                    + ", List of Student: " + Arrays.toString(this.students);
    }

}
