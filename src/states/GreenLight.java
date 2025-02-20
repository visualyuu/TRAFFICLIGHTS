package states;

import interfaces.LightStateInter;

public class GreenLight implements LightStateInter {
    @Override
    public void display() {
        System.out.println("**GREEN LIGHT ACTIVE");

    }

    @Override
    public void nextLight(TrafficLight light) throws InterruptedException {
        Thread.sleep(5000);
        light.setLight(new YellowLight());

    }
}
