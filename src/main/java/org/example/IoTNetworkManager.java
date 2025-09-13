package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IoTNetworkManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean systemRunning;
        List<Device> deviceList = new ArrayList<>();
        List<Controller> controllerList = new ArrayList<>();

        System.out.println("IoT 네트워크 매니저 시작");

        deviceList.add(new Fan("fan-001"));
        deviceList.add(new Light("light-001"));
        deviceList.add(new AirConditioner("airconditioner-001"));
        deviceList.add(new RobotCleaner("robotcleaner-001"));
        Smartphone smartphone = new Smartphone("smartphone-001");
        deviceList.add(smartphone);
        controllerList.add(smartphone);

        System.out.println("IoT네트워크 시작");

        // 컨트롤러 목록 보여주기
        for (int i = 1; i <= controllerList.size(); i++) {
            System.out.println(i + ". " + controllerList.get(i - 1).getDeviceId());
        }

        int controllerNo = scanner.nextInt();
        controllerList.get(controllerNo - 1).startControlSession(scanner, deviceList);
    }
}