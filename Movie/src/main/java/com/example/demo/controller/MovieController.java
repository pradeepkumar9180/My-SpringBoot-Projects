package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Movie;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

	@Autowired
	private MovieService movieService;

//	@RequestMapping(value = "/api/v1/movies/", method = RequestMethod.POST)
	@PostMapping("/add")
	public ResponseEntity<String> addMovie(@RequestBody Movie movie) {
		String insertionStatus = movieService.addMovie(movie);
		return ResponseEntity.status(HttpStatus.OK).body(insertionStatus);
	}
	
	@DeleteMapping("deleteMovieByMovieId/{movieId}")
	public String deleteMovieByBookId(@PathVariable int movieId)
	{
		return movieService.deleteMovieByBookId(movieId);
		
	}

}
