package com.springdemo.helloworld.repositories;

import com.springdemo.helloworld.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
