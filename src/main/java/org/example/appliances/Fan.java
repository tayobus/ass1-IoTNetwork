package org.example.appliances;

import org.example.Appliance;

import java.util.Arrays;
import java.util.Scanner;

public class Fan extends Appliance {
    private int speed = 1;

    public Fan(String deviceId) {
        super(deviceId);
        availableActions.addAll(Arrays.asList("풍량 조절"));
        actionMethods.addAll(Arrays.asList(scanner -> {
            System.out.println("희망하는 풍량 값을 정수로 입력해주세요.");
            int input = scanner.nextInt();
            scanner.nextLine();
            setSpeed(input);
        }));
        status.put("풍량", Integer.toString(speed));
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        status.put("풍량", Integer.toString(speed));
    }
}
