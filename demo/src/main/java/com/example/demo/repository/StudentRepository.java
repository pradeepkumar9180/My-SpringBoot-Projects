package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> getEmployeeByFirstName(String firstname);

	@Query("FROM Student s WHERE s.email = :email")
	List<Student> retrieveStudentsByEmail(@Param("email") String email);

	List<Student> findByFirstNameAndLastName(String firstName, String lastName);

	List<Student> findByFirstNameIn(List<String> firstName);

	List<Student> findByFirstNameContains(String firstName);

}
