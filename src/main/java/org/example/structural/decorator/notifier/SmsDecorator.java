package org.example.structural.decorator.notifier;

public class SmsDecorator extends BaseDecorator {

    public SmsDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message + " from SMS ");
    }
}
