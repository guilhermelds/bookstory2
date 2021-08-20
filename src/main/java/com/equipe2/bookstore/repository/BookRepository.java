package com.equipe2.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equipe2.bookstore.domain.Book;

public interface BookRepository extends JpaRepository<Book,Long>{
		
}
