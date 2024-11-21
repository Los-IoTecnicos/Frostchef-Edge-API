package com.losiotecnicos.frostchef.web.controllers;


import com.losiotecnicos.frostchef.application.dto.SensorDTO;
import com.losiotecnicos.frostchef.domain.models.Sensor;
import com.losiotecnicos.frostchef.web.services.SensorWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/write/sensors")
public class SensorWriteController {

    @Autowired
    private SensorWriteService sensorWriteService;

    @PostMapping("/register")
    public Sensor saveSensor(@RequestBody SensorDTO sensorDTO) {
        return sensorWriteService.saveSensor(sensorDTO);
    }

    @PutMapping("/update")
    public Sensor updateSensor(@RequestBody SensorDTO sensorDTO) {
        return sensorWriteService.updateSensor(sensorDTO);
    }

}