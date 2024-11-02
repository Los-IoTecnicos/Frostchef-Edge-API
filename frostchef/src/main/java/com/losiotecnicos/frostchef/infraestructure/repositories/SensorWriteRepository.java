package com.losiotecnicos.frostchef.infraestructure.repositories;

import com.losiotecnicos.frostchef.domain.models.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorWriteRepository extends JpaRepository<Sensor, Long> {
}
