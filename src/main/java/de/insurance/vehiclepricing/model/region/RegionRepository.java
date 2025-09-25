package de.insurance.vehiclepricing.model.region;

import java.util.Optional;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepository extends JpaRepository<Region, UUID> {

    Optional<Region> findByStateAndDistrictAndCityAndPostalCodeAndLocation(
            String state, String district, String city, String postalCode, String location);
}
