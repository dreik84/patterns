package org.example.behavioral.state.fan;

class LowState implements State {

    @Override
    public void push(Fan fan) {
        System.out.println("Medium speed");
        fan.setState(new MediumState());
    }
}
