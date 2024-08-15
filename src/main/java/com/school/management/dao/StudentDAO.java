package com.school.management.dao;

import com.school.management.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "John Doe", 20));
        students.add(new Student(2, "Jane Smith", 22));
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
