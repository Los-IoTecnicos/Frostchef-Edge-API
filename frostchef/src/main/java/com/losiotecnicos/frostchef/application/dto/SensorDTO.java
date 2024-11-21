package com.losiotecnicos.frostchef.application.dto;

public class SensorDTO {



    private String macAddress;
    private double temperature;
    private double humidity;
    private double proximity;
    private double gasMethane;

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getProximity() {
        return proximity;
    }

    public void setProximity(double proximity) {
        this.proximity = proximity;
    }

    public double getGasMethane() {
        return gasMethane;
    }

    public void setGasMethane(double gasMethane) {
        this.gasMethane = gasMethane;
    }

    // Getters and Setters
}