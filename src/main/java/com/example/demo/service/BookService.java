package com.example.demo.service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public Optional<Book> getBook(Long id) {
        return repository.findById(id);
    }

    public Page<Book> getAllBooks(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return repository.findAll(pageable);
    }

    public Book updateBook(Long id, Book bookDetails) {
        Book book = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        book.setTitle(bookDetails.getTitle());
        book.setAuthor(bookDetails.getAuthor());
        book.setPrice(bookDetails.getPrice());
        return repository.save(book);
    }

    public void deleteBook(Long id) {
        repository.deleteById(id);
    }
}
