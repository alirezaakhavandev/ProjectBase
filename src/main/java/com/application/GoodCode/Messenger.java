package com.application.GoodCode;

public class Messenger {

    MessageService messageService;

    public Messenger(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notify(String to, String message){
        messageService.sendMessage(to , message);
    }
}
