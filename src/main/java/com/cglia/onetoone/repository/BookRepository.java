package com.cglia.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cglia.onetoone.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}