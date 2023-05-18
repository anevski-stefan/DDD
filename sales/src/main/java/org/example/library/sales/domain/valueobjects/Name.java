package org.example.library.sales.domain.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.library.sharedkernel.base.ValueObject;

@Embeddable
@Getter
@Setter
public class Name implements ValueObject {
    private final String name;

    protected Name() {
        this.name = "";
    }


}
