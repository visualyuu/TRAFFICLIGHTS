
import states.TrafficLight;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TrafficLight light = new TrafficLight();
        boolean working = true;

        while(working) {
            light.show();
            light.change();
        }
    }
}
