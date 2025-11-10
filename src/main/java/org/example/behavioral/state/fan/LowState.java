package org.example.behavioral.state.fan;

class LowState implements State {

    public final static LowState INSTANCE = new LowState();

    private LowState() {
    }

    @Override
    public void push(Fan fan) {
        System.out.println("Medium speed");
        fan.setState(new MediumState());
    }
}
