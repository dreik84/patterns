package org.example.structural.decorator.notifier;

public class BaseNotifier implements Notifier {

    @Override
    public void sendMessage(String message) {
        System.out.println(message);
    }
}
