package org.example;

public class Light extends SimpleAppliance {
    private int brightness;

    public Light(String deviceId) {
        super(deviceId);
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
}
