package org.example;


import java.util.*;
import java.util.function.Consumer;

public class Appliance extends Device {
    private boolean isOn;
    public List<String> availableActions = new ArrayList<>(Arrays.asList("켜기", "끄기"));
    public List<Consumer<Scanner>> actionMethods = new ArrayList<>(Arrays.asList(scanner -> turnOn(), scanner -> turnOff())); // 끄고 켜기는 매개변수가 필요하진 않지만 매개변수를 요구하는 메서드를 위해 Consumer 차용

    public Appliance(String deviceId) {
        super(deviceId);
        status = new HashMap<>(Map.of("전원", "꺼짐"));
    }

    public void turnOn() {
        isOn = true;
        status.put("전원", "켜짐");
    }

    public void turnOff() {
        isOn = false;
        status.put("전원", "꺼짐");
    }

    public void doNthAvailableAction(int index, Scanner scanner) {
        actionMethods.get(index).accept(scanner);
    }
}
