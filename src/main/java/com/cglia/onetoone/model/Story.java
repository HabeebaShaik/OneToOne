package com.cglia.onetoone.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Story {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "book_id")
    @JsonBackReference
    private Book book;
    
	public Story() {}
	public Story(Long id, String content, Book book) {
		super();
		this.id = id;
		this.content = content;
		this.book = book;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
}
