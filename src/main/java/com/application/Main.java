package com.application;

import com.application.GoodCode.EmailService;
import com.application.GoodCode.MessageService;
import com.application.GoodCode.Messenger;

public class Main {
    public static void main(String[] args) {
        MessageService email = new EmailService();
        Messenger mess = new Messenger(email);
        mess.notify("ethan@example.com", "Hello from Email!");
    }
}