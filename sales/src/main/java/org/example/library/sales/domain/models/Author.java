package org.example.library.sales.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import org.example.library.sales.domain.valueobjects.Name;
import org.example.library.sharedkernel.base.AbstractEntity;

import java.time.LocalDate;

public class Author extends AbstractEntity<BookId> {
    private Name name;
    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "author_name"))
    })
    private LocalDate birth_date;
}
