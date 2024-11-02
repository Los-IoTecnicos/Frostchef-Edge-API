package com.losiotecnicos.frostchef.web.controllers;

import com.losiotecnicos.frostchef.application.dto.SensorDTO;
import com.losiotecnicos.frostchef.web.services.SensorReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/read/sensors")
public class SensorReadController {

    @Autowired
    private SensorReadService sensorReadService;

    @GetMapping
    public List<SensorDTO> getAllSensors() {
        return sensorReadService.getAllSensors();
    }
}

