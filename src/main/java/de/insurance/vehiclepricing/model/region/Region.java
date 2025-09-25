package de.insurance.vehiclepricing.model.region;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;
import lombok.Data;

@Data
@Entity
public class Region {

    @Id
    private UUID id;

    private String state;

    private String district;

    private String city;

    private String postalCode;

    private String location;

    public BigDecimal getFactor() {
        var state = State.fromName(this.state);
        return state.getFactor();
    }
}
