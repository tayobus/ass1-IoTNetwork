package org.example;

import java.util.List;
import java.util.Scanner;

public class Controller extends Device {
    private Scanner scanner;
    private List<Device> deviceList;

    public Controller(String deviceId) {
        super(deviceId);
    }

    public void addDevice(Device device) {
        deviceList.add(device);
    }

    public void sendCommand(String deviceId, String command) {
        System.out.println("컨트롤러가 매니저에게 커맨드 전송. 로직 구체화 필요.");
    }

    public void startControlSession(Scanner scanner, List<Device> deviceList) {
        this.scanner = scanner;
        this.deviceList = deviceList;
    }
}
