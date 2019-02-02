package com.jms.test.springjms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jms.test.springjms.entity.Book;
import com.jms.test.springjms.sender.BookOrderService;
import com.jms.test.springjms.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService service;
	
	@Autowired
	private BookOrderService sender;
	
	@PostMapping("/addBook")
	public Book addBooks(@RequestBody Book book) {
		Book bookRes = service.addBooks(book);
		System.out.println("****************");
		sender.sendMessage(book);
		return bookRes;
	}
	
}
