package org.example.library.sharedkernel.financial;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.NonNull;
import org.example.library.sharedkernel.base.ValueObject;

@Embeddable
@Getter
public class Money implements ValueObject {
    @Enumerated(value = EnumType.STRING)
    private final PaymentMethod paymentMethod;

    private final double amount;

    protected Money() {
        this.paymentMethod = null;
        this.amount = 0.0;
    }

    public Money(@NonNull PaymentMethod paymentMethod, double amount) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public static Money valueOf(PaymentMethod paymentMethod, double amount) {
        return new Money(paymentMethod, amount);
    }

    public Money add(Money money) {
        assert paymentMethod != null;
        if (!paymentMethod.equals(money.paymentMethod)) {
            throw new IllegalArgumentException("Cannot add two Money objects with different payment methods");
        }
        return new Money(paymentMethod, amount + money.amount);
    }

    public Money subtract(Money money) {
        assert paymentMethod != null;
        if (!paymentMethod.equals(money.paymentMethod)) {
            throw new IllegalArgumentException ("Cannot add two Money objects with different payment methods");
        }
        return new Money (paymentMethod, amount - money.amount);
    }

    public Money multiply(int m) {
        assert paymentMethod != null;
        return new Money(paymentMethod, amount * m);
    }
}
