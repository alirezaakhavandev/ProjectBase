package com.application.GoodCode;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String to, String message) {
        System.out.println(message + " was sent to " + to + " via Email");

    }
}
