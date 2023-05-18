package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Order;
import org.example.library.sales.domain.models.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, OrderId> {
}
