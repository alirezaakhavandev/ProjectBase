package com.application.GoodCode;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println(message + " was sent to " + to + " via SMS");
    }
}
