package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Movie;

public interface BookingService {

	List<Booking> getAllBookings(int movieId);

	Movie getMovieByBook(int bookId);

	String deleteMovieByBookId(int bookId);





}
