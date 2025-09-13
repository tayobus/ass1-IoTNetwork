package org.example;

public class SmartAppliance extends Device {
    private String mode;

    public SmartAppliance(String deviceId) {
        super(deviceId);
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void sendAlert(String alert) {
        System.out.println("스마트가전이 매니저에게 얼럿 보내기");
    }
}
