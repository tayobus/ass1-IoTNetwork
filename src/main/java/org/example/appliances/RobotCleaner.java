package org.example.appliances;

import org.example.Appliance;

import java.util.ArrayList;
import java.util.Arrays;

public class RobotCleaner extends Appliance {
    private int batteryLevel = 100;
    private boolean isCleaning = false;

    public RobotCleaner(String deviceId) {
        super(deviceId);
        availableActions.addAll(Arrays.asList("청소 시작", "청소 중지"));
        actionMethods.addAll(Arrays.asList(scanner -> startCleaning(), scanner -> stopCleaning()));
        status.put("배터리", batteryLevel + "%");
        status.put("청소 중", "X");
    }

    public void startCleaning() {
        this.isCleaning = true;
        status.put("청소 중", "O");

        new Thread(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("청소 방해받음!");
                return;
            }
            System.out.println("청소 끝!");
            stopCleaning();
        }).start();
    }

    public void stopCleaning() {
        this.isCleaning = true;
        status.put("청소 중", "X");
    }
}
