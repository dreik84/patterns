package org.example.behavioral.state.fan;

class OffState implements State {

    @Override
    public void push(Fan fan) {
        System.out.println("Low speed");
        fan.setState(new LowState());
    }
}
