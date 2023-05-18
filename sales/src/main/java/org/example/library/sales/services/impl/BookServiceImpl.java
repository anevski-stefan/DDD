package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.Book;
import org.example.library.sales.domain.models.BookId;
import org.example.library.sales.domain.repository.BookRepository;
import org.example.library.sales.services.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book findById(BookId id) {
        return this.bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public boolean deleteBook(BookId id) {
        return this.bookRepository.findById(id)
                .map(book -> {
                    this.bookRepository.delete(book);
                    return true;
                })
                .orElse(false);
    }
}
