package org.example;

public class RobotCleaner extends SmartAppliance {
    private int batteryLevel;

    public RobotCleaner(String deviceId) {
        super(deviceId);
    }

    public void startClean() {
        System.out.println("로봇청소기 청소 시작");
    }
}
