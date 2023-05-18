package org.example.library.sales.domain.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.example.library.sharedkernel.base.AbstractEntity;

@Entity
@Getter
@Table(name = "orders")
public class Order extends AbstractEntity<OrderId> {
    @ManyToOne
    private Cart cart;
}
