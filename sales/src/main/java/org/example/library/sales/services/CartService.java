package org.example.library.sales.services;

import org.example.library.sales.domain.models.BookId;
import org.example.library.sales.domain.models.Cart;
import org.example.library.sales.domain.models.CartId;

import java.util.List;

public interface CartService {
    Cart findById(CartId id);
    List<Cart> getAll();
    Cart createCart(Cart cart);
    Cart updateCart(Cart cart);
    boolean deleteCart(CartId id);
    boolean addBookToCart(CartId cartId, BookId bookId);
    boolean removeBookFromCart(CartId cartId, BookId bookId);
    boolean removeAllFromCart(CartId cartId);
}
