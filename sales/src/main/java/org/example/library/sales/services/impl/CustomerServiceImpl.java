package org.example.library.sales.services.impl;

import lombok.AllArgsConstructor;
import org.example.library.sales.domain.models.Customer;
import org.example.library.sales.domain.models.CustomerId;
import org.example.library.sales.domain.repository.CustomerRepository;
import org.example.library.sales.services.CustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer findById(CustomerId id) {
        return this.customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public boolean deleteCustomer(CustomerId id) {
        return this.customerRepository.findById(id)
                .map(book -> {
                    this.customerRepository.delete(book);
                    return true;
                })
                .orElse(false);
    }
}
