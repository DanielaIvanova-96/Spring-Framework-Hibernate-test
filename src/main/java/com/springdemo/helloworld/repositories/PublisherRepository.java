package com.springdemo.helloworld.repositories;

import com.springdemo.helloworld.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
