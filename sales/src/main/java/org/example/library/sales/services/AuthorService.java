package org.example.library.sales.services;

import org.example.library.sales.domain.models.Author;
import org.example.library.sales.domain.models.AuthorId;

import java.util.List;

public interface AuthorService {
    Author findById(AuthorId id);
    List<Author> getAll();
    Author createAuthor(Author author);
    Author updateAuthor(Author author);
    boolean deleteAuthor(AuthorId id);
}
