package states;

import interfaces.LightStateInter;

public class YellowLight implements LightStateInter {
    @Override
    public void display() {
        System.out.println("**YELLOW LIGHT ACTIVE - slow down");
    }

    @Override
    public void nextLight(TrafficLight light) throws InterruptedException {
        Thread.sleep(3000);
        light.setLight(new RedLight());

    }
}
