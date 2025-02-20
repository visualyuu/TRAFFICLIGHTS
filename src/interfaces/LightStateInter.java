package interfaces;

import states.TrafficLight;

public interface LightStateInter {
    void display();
    void nextLight(TrafficLight light) throws InterruptedException;
}
