package com.albertflynn.studentsystem.service;

import com.albertflynn.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
