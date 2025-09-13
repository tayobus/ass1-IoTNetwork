package org.example.appliances;

import org.example.Appliance;

import java.util.Arrays;

public class AirConditioner extends Appliance {
    private int targetTemperature;

    public AirConditioner(String deviceId) {
        super(deviceId);
        availableActions.addAll(Arrays.asList("설정온도 변경"));
        actionMethods.addAll(Arrays.asList(scanner -> {
            System.out.println("희망하는 온도를 정수로 입력해주세요.");
            int input = scanner.nextInt();
            scanner.nextLine();
            setTargetTemperature(input);
        }));
        status.put("설정온도", "" + targetTemperature);
    }

    public void setTargetTemperature(int temperature) {
        this.targetTemperature = temperature;
        status.put("설정온도", "" + temperature);
    }
}
