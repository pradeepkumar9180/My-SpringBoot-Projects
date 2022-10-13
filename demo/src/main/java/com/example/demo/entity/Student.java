package com.example.demo.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	@Getter
	@Setter
	private int id;

	@Column(name = "FirstName")
	@Getter
	@Setter
	private String firstName;

	@Column(name = "LastName")
	@Getter
	@Setter
	private String lastName;

	@Column(name = "Email")
	@Getter
	@Setter
	private String email;

	@Transient
	@JsonIgnore
	@Getter
	private String fullName;

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public void setFullName(String firstName, String lastName) {
		this.fullName = this.firstName + " " + this.lastName;
	}

}
