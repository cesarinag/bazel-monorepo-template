package com.book.store.api.services;

import com.book.store.api.models.Book;
import com.book.store.api.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URI;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list() {
        return bookRepository.findAll();
    }

    public Book add(Book b) {
        Book savedBook = bookRepository.save(b);
        return savedBook;
    }

    public void deleteById(long id) {
        bookRepository.deleteById(id);
    }

}