package org.example.library.sales.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.example.library.sales.domain.valueobjects.Name;
import org.example.library.sharedkernel.base.AbstractEntity;
import org.example.library.sharedkernel.financial.Money;

@Entity
@Getter
public class BookStore extends AbstractEntity<BookId> {
    private int quantity;
    private Money price;
}
