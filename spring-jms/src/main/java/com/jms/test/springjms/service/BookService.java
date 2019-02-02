package com.jms.test.springjms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jms.test.springjms.entity.Book;
import com.jms.test.springjms.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepo;
	
	public Book addBooks(Book books) {
		return bookRepo.save(books);
	}

}
