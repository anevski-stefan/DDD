package org.example.library.sales.domain.repository;

import org.example.library.sales.domain.models.Customer;
import org.example.library.sales.domain.models.CustomerId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, CustomerId> {
}
