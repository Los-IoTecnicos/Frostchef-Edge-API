package com.losiotecnicos.frostchef.web.controllers;


import com.losiotecnicos.frostchef.application.dto.SensorDTO;
import com.losiotecnicos.frostchef.domain.models.Sensor;
import com.losiotecnicos.frostchef.web.services.SensorWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/write/sensors")
public class SensorWriteController {

    @Autowired
    private SensorWriteService sensorWriteService;

    @PostMapping
    public Sensor saveSensor(@RequestBody SensorDTO sensorDTO) {
        return sensorWriteService.saveSensor(sensorDTO);
    }
}