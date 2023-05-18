package org.example.library.sales.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class PaymentMethod {

    private final PaymentMethod paymentMethod;

    protected PaymentMethod() {
        this.paymentMethod = null;
    }
}
