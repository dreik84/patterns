package org.example.structural.adapter.temp;

class FahrenheitSensor {
    private double temperature = 32.0;

    FahrenheitSensor(double temperature) {
        this.temperature = temperature;
    }

    public double getFTemperature() {
        return temperature;
    }
}
