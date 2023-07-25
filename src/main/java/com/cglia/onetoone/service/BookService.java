package com.cglia.onetoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.onetoone.model.Book;
import com.cglia.onetoone.repository.BookRepository;

@Service
public class BookService {
	 @Autowired
	    private BookRepository bookRepository;
	 
	   public List<Book> getAllBooks() {
	        return bookRepository.findAll();
	    }
	    public Book createBook(Book book) {
	        return bookRepository.save(book);
	    }

	    public Book getBookById(Long bookId) {
	        return bookRepository.findById(bookId).orElse(null);
	    }

	    public void updateBook(Book book) {
	        bookRepository.save(book);
	    }

	    public void deleteBook(Long bookId) {
	        bookRepository.deleteById(bookId);
	    }
}
