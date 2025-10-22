package org.example.structural.decorator.notifier;

public abstract class BaseDecorator implements Notifier {

    Notifier notifier;

    public BaseDecorator(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message);
    }
}
