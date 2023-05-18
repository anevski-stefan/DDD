package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Author;
import org.example.library.sales.domain.models.AuthorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, AuthorId> {
}
