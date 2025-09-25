package de.insurance.vehiclepricing.api;

import de.insurance.vehiclepricing.model.PricingRequest;
import de.insurance.vehiclepricing.model.PricingResponse;
import de.insurance.vehiclepricing.service.PricingService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pricing")
@RequiredArgsConstructor
public class PricingController {

    private final PricingService pricingService;

    @PostMapping("/calculations")
    public ResponseEntity<PricingResponse> calculate(@Valid @RequestBody PricingRequest request) {
        var response = pricingService.calculate(request);
        return ResponseEntity.ok(response);
    }
}
