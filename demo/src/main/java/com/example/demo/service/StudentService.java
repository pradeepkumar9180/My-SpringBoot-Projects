package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public String createStudent(Student student);

	public String updateStudent(Student student, int id);

	public String deleteStudent(int id);

	public List<Student> findByFirstName(String firstName);

	public List<Student> findByEmail(String email);

	public List<Student> findByFirstNameAndLastname(String firstName, String lastName);

	public List<Student> findByFirstNameIn(List<String> firstName);

	public List<Student> studentSorting();

	public List<Student> likeOperator(String firstName);

}
