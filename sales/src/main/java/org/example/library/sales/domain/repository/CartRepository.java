package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Cart;
import org.example.library.sales.domain.models.CartId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, CartId> {
}
