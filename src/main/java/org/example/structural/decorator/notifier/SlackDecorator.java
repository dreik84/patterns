package org.example.structural.decorator.notifier;

public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void sendMessage(String message) {
        notifier.sendMessage(message + " from Slack ");
    }
}
