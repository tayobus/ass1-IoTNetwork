package org.example;

import java.util.List;
import java.util.Scanner;

public class Controller extends Device {
    protected Scanner scanner;
    protected List<Device> deviceList;
    protected IoTNetworkManager networkManager;

    public Controller(String deviceId) {
        super(deviceId);
    }

    public void startControlSession(Scanner scanner, List<Device> deviceList) {
        this.scanner = scanner;
        this.deviceList = deviceList;
    }
}
