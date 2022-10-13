package com.example.demo.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository repo;

	public List<Student> getAllStudents() {
		return repo.findAll();

	}

	@Override
	public String createStudent(Student student) {
//		Student newStudent = new Student();
//		newStudent.setEmail(student.getEmail());
//		newStudent.setFirstName(student.getFirstName());
//		newStudent.setLastName(student.getLastName());
//		repo.save(newStudent);
		String firstName = student.getFirstName();
		if (firstName != null) {
			Student s1 = new Student(firstName, student.getLastName(), student.getEmail());
			Student s2 = repo.save(s1);
			return "Details Inserted Successfully";
		}

//		if (student.getFirstName() != null) {
//			repo.save(student);
//			return "Details Inserted Successfully";
//		}

//		Student savedStudent = repo.save(student);
//		if (null != savedStudent) {
//			return "Details Inserted Successfully";
//		}
		return "Error while Inserting Data";
	}

	@Override
	public String updateStudent(Student student, int id) {
		Optional<Student> s = repo.findById(id);
		if (s.isPresent()) {
			Student existingStudent = s.get();
				existingStudent.setFirstName(student.getFirstName());
				repo.save(existingStudent);
				return "Updated Successfully !";
		}
		return "No Data Found !";
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

		return "deleted succesfilly";
	}

	@Override
	public List<Student> findByFirstName(String firstName) {
		return repo.getEmployeeByFirstName(firstName);
	}

	@Override
	public List<Student> findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.retrieveStudentsByEmail(email);
	}

	@Override
	public List<Student> findByFirstNameAndLastname(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return repo.findByFirstNameAndLastName(firstName, lastName);
	}

	@Override
	public List<Student> findByFirstNameIn(List<String> firstName) {
		return repo.findByFirstNameIn(firstName);
	}

	@Override
	public List<Student> studentSorting() {
		// TODO Auto-generated method stub
		Sort sort = Sort.by(Sort.Direction.ASC, "firstName");
		return repo.findAll(sort);
	}

	@Override
	public List<Student> likeOperator(String firstName) {
		// TODO Auto-generated method stub
		return repo.findByFirstNameContains(firstName);
	}

}
