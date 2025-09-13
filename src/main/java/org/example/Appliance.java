package org.example;

public class Appliance extends Device {
    private boolean isOn;

    public Appliance(String deviceId) {
        super(deviceId);
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }
}
