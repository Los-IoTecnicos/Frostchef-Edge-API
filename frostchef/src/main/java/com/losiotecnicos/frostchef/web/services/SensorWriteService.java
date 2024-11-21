package com.losiotecnicos.frostchef.web.services;


import com.losiotecnicos.frostchef.application.dto.SensorDTO;
import com.losiotecnicos.frostchef.domain.models.Sensor;
import com.losiotecnicos.frostchef.infraestructure.repositories.SensorWriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorWriteService {

    @Autowired
    private SensorWriteRepository sensorWriteRepository;

    public Sensor saveSensor(SensorDTO sensorDTO) {
        Sensor sensor = new Sensor();
        sensor.setMacAddress(sensorDTO.getMacAddress());
        sensor.setTemperature(sensorDTO.getTemperature());
        sensor.setHumidity(sensorDTO.getHumidity());
        sensor.setProximity(sensorDTO.getProximity());
        sensor.setGasMethane(sensorDTO.getGasMethane());
        return sensorWriteRepository.save(sensor);
    }

    public Sensor updateSensor(SensorDTO sensorDTO) {
        Sensor sensor = sensorWriteRepository.findByMacAddress(sensorDTO.getMacAddress());
        if (sensor != null) {
            sensor.setTemperature(sensorDTO.getTemperature());
            sensor.setHumidity(sensorDTO.getHumidity());
            sensor.setProximity(sensorDTO.getProximity());
            sensor.setGasMethane(sensorDTO.getGasMethane());
            return sensorWriteRepository.save(sensor);
        }
        return null;
    }
}