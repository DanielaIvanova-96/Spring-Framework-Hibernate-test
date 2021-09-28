package com.springdemo.helloworld.bootstrap;

import com.springdemo.helloworld.model.Author;
import com.springdemo.helloworld.model.Book;
import com.springdemo.helloworld.model.Publisher;
import com.springdemo.helloworld.repositories.AuthorRepository;
import com.springdemo.helloworld.repositories.BookRepository;
import com.springdemo.helloworld.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("Siela");
        publisher.setAddress("ul.Ivan Rilski");
        publisher.setCity("Sofia");
        publisher.setCountry("Bulgaria");

        publisherRepository.save(publisher);
        System.out.println("Publisher count: " + publisherRepository.count());



        Author first = new Author();
        first.setFirstName("J.K");
        first.setLastName("Rowling");

        authorRepository.save(first);
        System.out.println("Author count: " + authorRepository.count());
        System.out.println("Author name: " + first.getFirstName() + " " + first.getLastName());

        Book one = new Book();
        one.setTitle("Harry Potter");
        one.setIsbn("123456");
        one.setPublisher(publisher);

        publisher.getBooks().add(one);

        bookRepository.save(one);
        publisherRepository.save(publisher);
        System.out.println("Book count: " + bookRepository.count());
    }
}
