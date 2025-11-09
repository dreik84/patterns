package org.example.behavioral.state.fan;

class MediumState implements State {

    @Override
    public void push(Fan fan) {
        System.out.println("Fast speed");
        fan.setState(new FastState());
    }
}
