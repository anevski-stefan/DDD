package org.example.library.sales.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import org.example.library.sharedkernel.base.AbstractEntity;

import java.util.List;

@Entity
@Getter
public class Cart extends AbstractEntity<CartId> {
    @ManyToMany
    private List<Book> books;

    @OneToMany(mappedBy = "cart")
    private List<Order> orders;
}
