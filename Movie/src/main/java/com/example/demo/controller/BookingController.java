package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Movie;
import com.example.demo.service.BookingService;

@RestController
@RequestMapping("/api/v1/bookings/")
public class BookingController {

	@Autowired
	private BookingService bookingService;
	
	@GetMapping("getBookings/{movieId}")
  public ResponseEntity<List<Booking>>  getAllBookingsForAMovie(@PathVariable int movieId){
	  List<Booking> bookings = bookingService.getAllBookings(movieId);
	  return ResponseEntity.status(HttpStatus.OK).body(bookings);
  }
	
	@GetMapping("getMovieBYBookId/{bookId}")
	public Movie getMovieByBookId(@PathVariable int bookId)
	{
		return bookingService.getMovieByBook(bookId);
		
	}
	
	@DeleteMapping("deleteMovieByBookId/{bookId}")
	public String deleteMovieByBookId(@PathVariable int bookId)
	{
		return bookingService.deleteMovieByBookId(bookId);
		
	}
	
}

