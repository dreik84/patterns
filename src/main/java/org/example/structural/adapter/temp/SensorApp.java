package org.example.structural.adapter.temp;

public class SensorApp {
    public static void main(String[] args) {

        Sensor sensor = new SensorAdapter(new FahrenheitSensor(64));

        System.out.println(sensor.getTemperature());
    }
}
