package com.cglia.onetoone.controller;

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

import com.cglia.onetoone.model.Book;
import com.cglia.onetoone.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	 @Autowired
	    private BookService bookService;
	 
	  @GetMapping
	    public List<Book> getAllBooks() {
	        return bookService.getAllBooks();
	    }
	    @PostMapping
	    public Book createBook(@RequestBody Book book) {
	        return bookService.createBook(book);
	    }

	    @GetMapping("/{id}")
	    public Book getBookById(@PathVariable Long id) {
	        return bookService.getBookById(id);
	    }

	    @PutMapping("/{id}")
	    public void updateBook(@PathVariable Long id, @RequestBody Book book) {
	        Book existingBook = bookService.getBookById(id);
	        if (existingBook != null) {
	            book.setId(id);
	            bookService.updateBook(book);
	        }
	    }

	    @DeleteMapping("/{id}")
	    public void deleteBook(@PathVariable Long id) {
	        bookService.deleteBook(id);
	    }
}
