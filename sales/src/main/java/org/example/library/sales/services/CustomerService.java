package org.example.library.sales.services;

import org.example.library.sales.domain.models.Customer;
import org.example.library.sales.domain.models.CustomerId;

import java.util.List;

public interface CustomerService {
    Customer findById(CustomerId id);
    List<Customer> getAll();
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    boolean deleteCustomer(CustomerId id);
}
