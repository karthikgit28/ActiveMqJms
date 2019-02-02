package com.jms.test.springjms.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.jms.test.springjms.entity.Book;

@Service
public class BookOrderService {

	private static final String QUEUE_NAME= "Book-Order"; 
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	public void sendMessage(Book bookOrder) {
		jmsTemplate.convertAndSend(QUEUE_NAME,bookOrder);
	}
	
}
