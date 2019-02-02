package com.jms.test.springjms.sender;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.jms.test.springjms.entity.Book;

@Component
public class Receiver {

	@JmsListener(destination="Book-Order")
	public void receiveMessage(Book book) {
		System.out.println("Message Received = " + book);
	}
	
}
