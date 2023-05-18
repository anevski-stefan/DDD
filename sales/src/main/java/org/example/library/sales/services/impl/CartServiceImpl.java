package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.BookId;
import org.example.library.sales.domain.models.Cart;
import org.example.library.sales.domain.models.CartId;
import org.example.library.sales.domain.repository.CartRepository;
import org.example.library.sales.services.BookService;
import org.example.library.sales.services.CartService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CartServiceImpl implements CartService {

    private final CartRepository cartRepository;
    private final BookService bookService;

    @Override
    public Cart findById(CartId id) {
        return this.cartRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cart> getAll() {
        return this.cartRepository.findAll();
    }

    @Override
    public Cart createCart(Cart cart) {
        return this.cartRepository.save(cart);
    }

    @Override
    public Cart updateCart(Cart cart) {
        return this.cartRepository.save(cart);
    }

    @Override
    public boolean deleteCart(CartId id) {
        return this.cartRepository.findById(id)
                .map(cart -> {
                    this.cartRepository.delete(cart);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean addBookToCart(CartId cartId, BookId bookId) {
        return this.cartRepository.findById(cartId)
                .map(cart -> {
                    cart.getBooks().add(this.bookService.findById(bookId));
                    this.cartRepository.save(cart);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean removeBookFromCart(CartId cartId, BookId bookId) {
        return this.cartRepository.findById(cartId)
                .map(cart -> {
                    cart.getBooks().remove(this.bookService.findById(bookId));
                    this.cartRepository.save(cart);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public boolean removeAllFromCart(CartId cartId) {
        return this.cartRepository.findById(cartId)
                .map(cart -> {
                    cart.getBooks().clear();
                    this.cartRepository.save(cart);
                    return true;
                })
                .orElse(false);
    }
}
