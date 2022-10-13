package com.example.demo.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exceptionApp.MovieExceptionApp;
import com.example.demo.utility.ExceptionHandling;

@RestControllerAdvice(annotations = RestController.class)
public class MovieExceptionHandler {

	@ExceptionHandler(MovieExceptionApp.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ExceptionHandling exceptionGetter(MovieExceptionApp result, HttpServletRequest request) {
		ExceptionHandling exception = new ExceptionHandling();
		exception.setMessage(result.getMessage());
		exception.setUrl(request.getRequestURI());
		return exception;
	}

}
