package com.jms.test.springjms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class BookOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
//	@OneToMany
//	private Book book;
//	
//	@OneToMany
//	private Customer customer;
//	
	
	protected BookOrder() {
		
	}

	public BookOrder(int id) {
		super();
		this.id = id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
