package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {

	public List<Student> findAll();

	public void saveStudent(Student student);

	public Student findStudentById(int id);


}
