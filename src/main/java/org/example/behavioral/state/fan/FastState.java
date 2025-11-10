package org.example.behavioral.state.fan;

class FastState implements State {

    @Override
    public void push(Fan fan) {
        System.out.println("Shutdown");
        fan.setState(OffState.getInstance());
    }
}
