package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookId;
	private int seatNumber;
	private char bookedRow;
	@ManyToOne
	@JoinColumn(name = "movie_id")
	@JsonIgnore
	private Movie movie;
	public Booking(int bookId, int seatNumber, char bookedRow, Movie movie) {
		super();
		this.bookId = bookId;
		this.seatNumber = seatNumber;
		this.bookedRow = bookedRow;
		this.movie = movie;
	}
	public Booking() {
		super();
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public char getBookedRow() {
		return bookedRow;
	}
	public void setBookedRow(char bookedRow) {
		this.bookedRow = bookedRow;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
	

}
