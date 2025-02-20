package states;

import interfaces.LightStateInter;


public class RedLight implements LightStateInter {
    @Override
    public void display() {
        System.out.println("**RED LIGHT ACTIVE - stop");

    }

    @Override
    public void nextLight(TrafficLight light) throws InterruptedException {
        long TIMER_TIME = 5000;
        Thread.sleep(TIMER_TIME);
            light.setLight(new GreenLight());

    }
}
