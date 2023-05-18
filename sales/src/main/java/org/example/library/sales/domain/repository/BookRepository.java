package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Book;
import org.example.library.sales.domain.models.BookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, BookId> {
}
