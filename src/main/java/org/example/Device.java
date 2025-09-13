package org.example;

public class Device {
    private final String deviceId;
    private String status;

    public Device(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getStatus() {
        return status;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
