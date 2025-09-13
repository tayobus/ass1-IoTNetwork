package org.example;

public class Fan extends Appliance {
    private int speed;

    public Fan(String deviceId) {
        super(deviceId);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
