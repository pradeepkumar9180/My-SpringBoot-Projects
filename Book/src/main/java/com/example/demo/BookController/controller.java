package com.example.demo.BookController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.BookEntity.Book;
import com.example.demo.BookService.BookService;
@RequestMapping("/api/book")
@RestController
public class controller {
	@Autowired
	BookService service;
	@GetMapping("/getAll")
	public List<Book> getAllBooks()
	{
		return service.getAllBooks();
	}
	
	@PostMapping("/create")
	public String createBookDetails(@RequestBody Book book)
	{
		return service.createBookDetails(book);
	}
	
	@PutMapping("/update/{id}")
	public String updateBook(@RequestBody Book book,@PathVariable int id)
	{
		return service.updateBookDetails(book,id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id)
	{
		return service.deleteBook(id);
	}

}
