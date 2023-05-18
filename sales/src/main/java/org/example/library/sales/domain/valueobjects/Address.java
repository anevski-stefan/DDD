package org.example.library.sales.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import org.example.library.sharedkernel.base.ValueObject;

@Embeddable
@Getter
public class Address implements ValueObject {
    private final String address;

    protected Address() {
        this.address = "";
    }
}
