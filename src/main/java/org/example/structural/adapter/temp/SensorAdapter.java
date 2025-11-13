package org.example.structural.adapter.temp;

class SensorAdapter extends Sensor {
    FahrenheitSensor sensor;

    SensorAdapter(FahrenheitSensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public double getTemperature() {
        return (sensor.getFTemperature() - 32.0) * 5.0 / 9.0;
    }
}
