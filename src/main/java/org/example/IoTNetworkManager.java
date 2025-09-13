package org.example;

import org.example.appliances.*;
import org.example.controllers.*;

import java.util.*;

public class IoTNetworkManager {
    public static List<Device> deviceList = new ArrayList<>();
    public static List<Appliance> applianceList = new ArrayList<>();
    public static List<Controller> controllerList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---IoT 네트워크 매니저 시작---");

        Fan fan = new Fan("fan-001");
        Light light = new Light("light-001");
        AirConditioner airConditioner = new AirConditioner("airconditioner-001");
        RobotCleaner robotCleaner = new RobotCleaner("robotcleaner-001");
        Smartphone smartphone = new Smartphone("smartphone-001");

        deviceList.add(fan);
        deviceList.add(light);
        deviceList.add(airConditioner);
        deviceList.add(robotCleaner);
        deviceList.add(smartphone);

        applianceList.add(fan);
        applianceList.add(light);
        applianceList.add(airConditioner);
        applianceList.add(robotCleaner);

        controllerList.add(smartphone);

        chooseController(scanner);

        System.out.println("---IoT 네트워크 매니저 종료---");
        scanner.close();
    }

    // 컨트롤러 목록 보여주고 CLI 제어 이전
    public static void chooseController(Scanner scanner) {
        while (true) {
            System.out.println("팁: 0번 입력은 항상 뒤로가기입니다.");
            System.out.println("사용하고 싶은 제어 단말기의 번호를 입력하세요.");

            for (int i = 1; i <= controllerList.size(); i++) {
                System.out.println(i + ". " + controllerList.get(i - 1).getDeviceId());
            }

            int controllerNo = scanner.nextInt();
            scanner.nextLine();

            if (controllerNo == 0) return;

            controllerList.get(controllerNo - 1).startControlSession(scanner, deviceList);
        }
    }
}