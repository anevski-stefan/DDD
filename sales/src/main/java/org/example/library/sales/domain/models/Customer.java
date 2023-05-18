package org.example.library.sales.domain.models;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import org.example.library.sales.domain.valueobjects.Address;
import org.example.library.sales.domain.valueobjects.Name;
import org.example.library.sharedkernel.base.AbstractEntity;

@Entity
@Getter
public class Customer extends AbstractEntity<CustomerId> {

    private Name name;
    private Address address;

    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "customer_name"))
    })
    private String phoneNumber;
}
