package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/getAll")
	public List<Student> getAllStudent() {
		return service.getAllStudents();
	}

	@PostMapping("/create")
	public String createStudent(@RequestBody Student student) {
		return service.createStudent(student);
	}

	@PutMapping("/update/{id}")
	public String updateStudent(@RequestBody Student student, @PathVariable int id) {
		return service.updateStudent(student, id);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		return service.deleteStudent(id);
	}

	@GetMapping("/getAll/{firstName}")
	public List<Student> findByFirstname(@PathVariable String firstName) {
		return service.findByFirstName(firstName);

	}

	@GetMapping("/getAllByEmail/{email}")
	public List<Student> findByEmail(@PathVariable String email) {
		return service.findByEmail(email);

	}

	@GetMapping("/getAllByFirstNameAndLastName/{firstName}/{lastName}")
	public List<Student> findByFirstNameAndLastname(@PathVariable String firstName, @PathVariable String lastName) {
		return service.findByFirstNameAndLastname(firstName, lastName);

	}

	@GetMapping("/getAllByIn")
	public List<Student> findByFirstNameIn(@RequestBody List<String> firstName) {
		return service.findByFirstNameIn(firstName);
	}

	@GetMapping("/getAllAfterSorting")
	public List<Student> studentSorting() {
		return service.studentSorting();
	}

	@GetMapping("/like/{firstName}")
	public List<Student> like(@PathVariable String firstName) {
		return service.likeOperator(firstName);
	}

}