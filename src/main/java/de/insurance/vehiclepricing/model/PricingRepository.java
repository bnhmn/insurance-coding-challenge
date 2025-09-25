package de.insurance.vehiclepricing.model;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepository extends JpaRepository<Pricing, UUID> {}
