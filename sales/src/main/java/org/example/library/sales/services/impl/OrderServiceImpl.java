package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.Order;
import org.example.library.sales.domain.models.OrderId;
import org.example.library.sales.domain.repository.OrderRepository;
import org.example.library.sales.services.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Order findById(OrderId id) {
        return this.orderRepository.findById(id).orElse(null);
    }

    @Override
    public List<Order> getAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Order createOrder(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public Order updateOrder(Order order) {
        return this.orderRepository.save(order);
    }

    @Override
    public boolean deleteOrder(OrderId id) {
        return this.orderRepository.findById(id)
                .map(order -> {
                    this.orderRepository.delete(order);
                    return true;
                })
                .orElse(false);
    }

    @Override
    public Order payOrder(OrderId id) {
        return this.orderRepository.findById(id)
                .map(order -> {
                    this.orderRepository.save(order);
                    return order;
                })
                .orElse(null);
    }

    @Override
    public Order cancelOrder(OrderId id) {
        return this.orderRepository.findById(id)
                .map(order -> {
                    this.orderRepository.save(order);
                    return order;
                })
                .orElse(null);
    }
}
