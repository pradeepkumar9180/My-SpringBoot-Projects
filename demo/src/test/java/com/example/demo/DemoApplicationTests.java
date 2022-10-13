package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.service.serviceImpl.StudentServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@InjectMocks
	private StudentServiceImpl serviceImpl;

	@Mock
	private StudentRepository studentRepository;

	@Test
	public void deleteStudent() {
		Mockito.when(serviceImpl.deleteStudent(1)).thenReturn("deleted succesfilly");
		assertEquals("deleted succesfully", serviceImpl.deleteStudent(1));
	}

}
