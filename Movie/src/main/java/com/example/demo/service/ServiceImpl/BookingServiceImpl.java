package com.example.demo.service.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;
import com.example.demo.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService{
	
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Booking> getAllBookings(int movieId) {
		Optional<Movie> movie = movieRepository.findById(movieId);
		if(movie.isPresent()) {
			return movie.get().getBookings();
		}
		return null;
	}

	@Override
	public Movie getMovieByBook(int bookId) {
		Optional<Movie>movie=movieRepository.findById(bookId);
		
		if(movie.isPresent())	
		{
			Movie movieById=new Movie();
			
			movieById.setMovieName(movie.get().getMovieName());
			movieById.setTicketPrice(movie.get().getTicketPrice());
			
			return movieById;
		}
		return null;
	}

	@Override
	public String deleteMovieByBookId(int bookId) {
		movieRepository.deleteById(bookId);
		return "Movie successfully deleted";
	}



}
