package com.example.demo.service;

import com.example.demo.entity.Movie;

public interface MovieService {

	String addMovie(Movie movie);

	String deleteMovieByBookId(int movieId);

}
