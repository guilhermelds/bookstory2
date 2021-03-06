package com.equipe2.bookstore.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.equipe2.bookstore.domain.Book;
import com.equipe2.bookstore.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository br;
	
	@GetMapping("bookstore/books")
	public List<Book> allBooks() {
		List<Book> livros = br.findAll();
		return livros;
	}
	
	@GetMapping("bookstore/book/{id}")
	public Book aBook(@PathVariable Long id) {
		Book livro = br.findById(id).get();
		return livro;
	}
}
