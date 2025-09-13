package org.example;

import java.util.HashMap;
import java.util.Map;

public class Device {
    public final String deviceId;
    public Map<String, String> status;

    public Device(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
