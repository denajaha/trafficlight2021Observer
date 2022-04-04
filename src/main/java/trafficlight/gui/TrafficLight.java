package trafficlight.gui;


import observer.Observer;

import java.awt.*;
//OBSERVER
public class TrafficLight extends Light implements Observer {

    TrafficLight(Color color) {
        super(color);
    }

    public void turnOn(boolean a) {
        isOn = a;
        repaint();
    }

    public boolean isOn() {
        return isOn;
    }

    @Override
    public void update() {
        turnOn(!isOn);
    }

    //DONE implement a part of the pattern here
}
