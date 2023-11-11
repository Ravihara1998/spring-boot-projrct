package com.project.Management.service;

import com.project.Management.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private static final Map<Integer, Student> studentMap = new HashMap<>();

    static {

        Student student = new Student("Sachila","07140557","ravidert@gmail.com","9923456V", 1);
        studentMap.put(studentMap.size(),student);

        student = new Student("Suraj", "07140557", "ravidert@gmail.com", "9923456V", 2);
        studentMap.put(studentMap.size(),student);

    }

    public static ArrayList<Student> getAllStudent(){

        return new ArrayList<>(studentMap.values());
    }

    public static ArrayList<Student> addStudent(Student student){

        student.setId(studentMap.size());
        studentMap.put((studentMap.size()),student);
        return new ArrayList<>(studentMap.values());
    }

    public static ArrayList<Student> updateStudent(Student student) {

        student.setId(studentMap.size());
        studentMap.put((studentMap.size()), student);
        return new ArrayList<>(studentMap.values());

    }

    public static ArrayList<Student> deleteStudent(Student student) {

        student.setId(studentMap.size());
        studentMap.remove((studentMap.size()), student);
        return new ArrayList<>(studentMap.values());
    }
}
