package com.example.demo.BookService;

import java.util.List;

import com.example.demo.BookEntity.Book;

public interface BookService {
	public List<Book> getAllBooks();

	public String createBookDetails(Book book);

	public String updateBookDetails(Book book,int id);

	public String deleteBook(int id);

	

}
