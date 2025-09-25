package de.insurance.vehiclepricing.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Pricing {

    @Id
    private final UUID id = UUID.randomUUID();
}
