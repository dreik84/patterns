package org.example.structural.decorator.notifier;

public class NotifierApp {
    public static void main(String[] args) {

        Notifier baseNotifier = new BaseNotifier();

        baseNotifier = new SmsDecorator(baseNotifier);

        baseNotifier.sendMessage("Hello");

        baseNotifier = new SlackDecorator(baseNotifier);

        baseNotifier.sendMessage("Hello");

    }
}
