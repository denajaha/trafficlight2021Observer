import trafficlight.ctrl.TrafficLightCtrl;


public class MCP {
    /*
    controller class is always the one I make a singleton out of it
     */
    public static void main(String[] args) {
       // TrafficLightCtrl ctrl = new TrafficLightCtrl();
        TrafficLightCtrl ctrl = TrafficLightCtrl.getInstance();
        ctrl.run();
    }
}