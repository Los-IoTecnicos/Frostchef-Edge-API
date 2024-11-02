package com.losiotecnicos.frostchef.web.services;




import com.losiotecnicos.frostchef.application.dto.SensorDTO;
import com.losiotecnicos.frostchef.domain.models.Sensor;
import com.losiotecnicos.frostchef.infraestructure.repositories.SensorReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SensorReadService {

    @Autowired
    private SensorReadRepository sensorReadRepository;

    public List<SensorDTO> getAllSensors() {
        return sensorReadRepository.findAll().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    private SensorDTO convertToDTO(Sensor sensor) {
        SensorDTO dto = new SensorDTO();
        dto.setTemperature(sensor.getTemperature());
        dto.setHumidity(sensor.getHumidity());
        dto.setProximity(sensor.getProximity());
        dto.setGasMethane(sensor.getGasMethane());
        return dto;
    }
}