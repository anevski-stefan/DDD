package org.example.library.sales.domain.models;

import jakarta.persistence.*;
import lombok.Getter;
import org.example.library.sales.domain.valueobjects.Name;
import org.example.library.sharedkernel.base.AbstractEntity;
import org.example.library.sharedkernel.financial.Money;

@Entity
@Getter
public class Book extends AbstractEntity<BookId> {
    private Name title;
    private String ISBN;
    private Integer numOfCopies;

    @AttributeOverrides({
            @AttributeOverride(name = "amount", column = @Column(name = "price")),
            @AttributeOverride(name = "name", column = @Column(name = "title"))
    })
    private Money price;


}
