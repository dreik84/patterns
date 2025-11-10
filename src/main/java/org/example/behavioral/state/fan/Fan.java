package org.example.behavioral.state.fan;

class Fan {
    private State state;

    Fan() {
        state = OffState.getInstance();
    }

    public void push() {
        state.push(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
