package com.springdemo.helloworld.repositories;

import com.springdemo.helloworld.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
