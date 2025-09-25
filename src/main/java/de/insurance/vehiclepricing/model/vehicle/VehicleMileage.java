package de.insurance.vehiclepricing.model.vehicle;

import java.math.BigDecimal;

public class VehicleMileage {

    public static BigDecimal computeFactor(int annualMileageKilometers) {
        if (annualMileageKilometers <= 5000) {
            return new BigDecimal("0.5");
        } else if (annualMileageKilometers <= 10_000) {
            return new BigDecimal("1.0");
        } else if (annualMileageKilometers <= 20_000) {
            return new BigDecimal("1.5");
        } else {
            return new BigDecimal("2.0");
        }
    }
}
