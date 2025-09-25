package de.insurance.vehiclepricing.service;

import de.insurance.vehiclepricing.model.PricingRequest;
import de.insurance.vehiclepricing.model.PricingResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PricingService {

    public PricingResponse calculate(PricingRequest request) {
        return null;
    }
}
