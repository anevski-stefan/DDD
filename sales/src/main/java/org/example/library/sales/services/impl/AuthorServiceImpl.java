package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.Author;
import org.example.library.sales.domain.models.AuthorId;
import org.example.library.sales.domain.repository.AuthorRepository;
import org.example.library.sales.services.AuthorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author findById(AuthorId id) {
        return this.authorRepository.findById(id).orElse(null);
    }

    @Override
    public List<Author> getAll() {
        return this.authorRepository.findAll();
    }

    @Override
    public Author createAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    @Override
    public Author updateAuthor(Author author) {
        return this.authorRepository.save(author);
    }

    @Override
    public boolean deleteAuthor(AuthorId id) {
        return this.authorRepository.findById(id)
                .map(book -> {
                    this.authorRepository.delete(book);
                    return true;
                })
                .orElse(false);
    }
}
