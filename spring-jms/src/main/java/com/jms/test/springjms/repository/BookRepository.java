package com.jms.test.springjms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jms.test.springjms.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
