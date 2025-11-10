package org.example.behavioral.state.fan;

class OffState implements State {

    private static OffState instance;

    private OffState() {
    }

    public static OffState getInstance() {
        if (instance == null) {
            instance = new OffState();
        }

        return instance;
    }

    @Override
    public void push(Fan fan) {
        System.out.println("Low speed");
        fan.setState(LowState.INSTANCE);
    }
}
