package com.example.demo.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Movie;
import com.example.demo.repository.BookingRepository;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepository movieRepository;

	@Autowired
	private BookingRepository bookingRepository;

	@Override
	public String addMovie(Movie movie) {
		Movie movieToBeSaved = new Movie();
		movieToBeSaved.setMovieName(movie.getMovieName());
		movieToBeSaved.setTicketPrice(movie.getTicketPrice());
		movieToBeSaved.setBookings(movie.getBookings());
		Movie savedMovie = movieRepository.save(movieToBeSaved);
		movie.getBookings().forEach(booking -> {
			Booking b = new Booking();
			b.setSeatNumber(booking.getSeatNumber());
			b.setBookedRow(booking.getBookedRow());
			b.setMovie(savedMovie);
			bookingRepository.save(b);
		});
		return "Details inserted Successfully";
	}

	@Override
	public String deleteMovieByBookId(int movieId) {
		movieRepository.deleteById(movieId);
		return "movie deleted successfully";
	}

}
