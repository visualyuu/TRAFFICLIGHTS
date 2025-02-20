package states;

import interfaces.LightStateInter;
public class TrafficLight{
    private LightStateInter state;
    public TrafficLight(){
        state = new RedLight();
    }
    public void setLight (LightStateInter state){
        this.state =state;
    }

    public void show() {
        state.display();
    }

    public void change() throws InterruptedException {
        state.nextLight(this);
    }
}
