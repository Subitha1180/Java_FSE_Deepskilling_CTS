package com.example.factory;


public class Main {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        System.out.println(" Creating notifications using Factory Method...\n");

        Notification email = factory.createNotification("EMAIL");
        if (email != null) email.notifyUser();

        Notification sms = factory.createNotification("SMS");
        if (sms != null) sms.notifyUser();

        Notification push = factory.createNotification("PUSH");
        if (push != null) push.notifyUser();

        Notification unknown = factory.createNotification("VOICE");
        if (unknown != null) unknown.notifyUser();
    }
}
