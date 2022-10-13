package com.example.demo.BookService.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.BookEntity.Book;
import com.example.demo.BookRepository.BookRepo;
import com.example.demo.BookService.BookService;

@Service
public class ServiceImpl implements BookService{
@Autowired
BookRepo repo;
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	@Override
	public String createBookDetails(Book book) {
		// TODO Auto-generated method stub
		//return repo.save(book);
//		Book newbook=new Book();
//		newbook.setBookName(book.getBookName());
//		newbook.setAuthor(book.getAuthor());
//		if(newbook.getBookName()!=null)
//		{
//			repo.save(newbook);
//			return "succesfully saved";
//			
//		}
//		return "erorr while inserting";
		if(book.getBookName()!=null)
		{
		Book newbook1=new Book(book.getBookName(),book.getAuthor());
		repo.save(newbook1);
		return "saved successfully";
		}
		return "error while inserting";
		}
	@Override
	public String updateBookDetails(Book book,int id) {
	Optional<Book>s=repo.findById(id);
	if(s.isPresent())
	{
		Book existingBook=s.get();
		existingBook.setBookName(book.getBookName());
		repo.save(existingBook);
		return "successfully updated";
		
		}
	else
	{
		return "not updated";
	}
		
	}
	@Override
	public String deleteBook(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "deleted Successfully";
	}
}
