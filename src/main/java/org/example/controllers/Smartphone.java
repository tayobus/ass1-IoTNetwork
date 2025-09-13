package org.example.controllers;

import org.example.Controller;
import org.example.Device;
import org.example.Appliance;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static org.example.utils.PrintUtils.printWithIndent;

public class Smartphone extends Controller {

    public Smartphone(String deviceId) {
        super(deviceId);
    }

    public void displayDeviceList() {
        while (true) {
            System.out.println("---장치 목록---");
            System.out.println("제어하고 싶은 장치의 번호를 입력하세요.");

            // 장치 목록 나열
            List<Appliance> applianceList = networkManager.applianceList;
            for (int i = 1; i <= applianceList.size(); i++) {
                Appliance appliance = applianceList.get(i - 1);
                System.out.println(i + ". " + appliance.getDeviceId());
                printApplianceStatus(2, appliance);
            }

            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 0) return;

            displayDetailedApplianceMenu(applianceList.get(input - 1));
        }
    }

    public void displayDetailedApplianceMenu(Appliance appliance) {
        while (true) {
            System.out.println("---" + appliance.deviceId + "---");
            printApplianceStatus(0, appliance);
            System.out.println(" * 지시하고 싶은 동작의 번호를 입력하세요.");

            for (int i = 1; i <= appliance.availableActions.size(); i++) {
                System.out.println(i + ": " + appliance.availableActions.get(i - 1));
            }

            int input = scanner.nextInt();
            scanner.nextLine();
            if (input == 0) return;

            appliance.doNthAvailableAction(input - 1, scanner);
        }
    }

    private void printApplianceStatus(int indent, Appliance appliance) {
        for (Map.Entry<String, String> entry : appliance.status.entrySet()) {
            printWithIndent(indent, entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public void startControlSession(Scanner scanner, List<Device> deviceList) {
        super.startControlSession(scanner, deviceList);
        displayDeviceList();
    }
}
