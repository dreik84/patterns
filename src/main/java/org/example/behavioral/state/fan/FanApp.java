package org.example.behavioral.state.fan;

class FanApp {
    public static void main(String[] args) throws InterruptedException {
        Fan fan = new Fan();

        while (true) {
            fan.push();
            Thread.sleep(500);
        }
    }
}
