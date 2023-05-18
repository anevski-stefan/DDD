package org.example.library.sales.services;

import org.example.library.sales.domain.models.Order;
import org.example.library.sales.domain.models.OrderId;

import java.util.List;

public interface OrderService {
    Order findById(OrderId id);
    List<Order> getAll();
    Order createOrder(Order order);
    Order updateOrder(Order order);
    boolean deleteOrder(OrderId id);
    Order payOrder(OrderId id);
    Order cancelOrder(OrderId id);
}
