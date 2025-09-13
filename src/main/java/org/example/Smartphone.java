package org.example;

import java.util.List;
import java.util.Scanner;

public class Smartphone extends Controller {
    private List<String> notifications;
    private boolean isActive;
    private Scanner userInput;
    private IoTNetworkManager networkManager;

    public Smartphone(String deviceId) {
        super(deviceId);
    }

    public void receiveAlert(String alert) {
        System.out.println("스마트폰이 얼럿 받음");
    }

    public void showNotification() {
        System.out.println("스마트폰이 알림 보여줌");
    }

    public void run() {
        System.out.println("스마트폰 가동");
    }

    public void showMainMenu() {
        System.out.println("스마트폰이 메인메뉴 보여줌");
    }

    public void processUserCommand() {
        System.out.println("스마트폰이 유저 입력받은 걸 처리함. 스위치문으로 하자.");
    }

    public void sendToManager(String message) {
        System.out.println("스마트폰이 매니저에게 메시지 보냄");
    }

    public void displayDeviceList() {
        System.out.println("스마트폰이 디바이스 리스트 보여줌");
    }
}
