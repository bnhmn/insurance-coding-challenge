package de.insurance.vehiclepricing.model.vehicle;

import java.math.BigDecimal;
import lombok.Getter;

@Getter
public enum VehicleType {
    CAR("1.0"),
    TRUCK("2.5"),
    MOTORCYCLE("0.3");

    private final BigDecimal factor;

    VehicleType(String factor) {
        this.factor = new BigDecimal(factor);
    }
}
