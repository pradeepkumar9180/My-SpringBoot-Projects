package com.example.demo.BookRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.BookEntity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
