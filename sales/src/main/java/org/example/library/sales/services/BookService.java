package org.example.library.sales.services;

import org.example.library.sales.domain.models.Book;
import org.example.library.sales.domain.models.BookId;

import java.util.List;

public interface BookService {
    Book findById(BookId id);
    List<Book> getAll();
    Book createBook(Book book);
    Book updateBook(Book book);
    boolean deleteBook(BookId id);
}
