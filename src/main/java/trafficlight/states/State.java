package trafficlight.states;

//DONE implement a part of the pattern here

import observer.Subject;
//SUBJECT
public abstract class State extends Subject {

    public abstract State getNextState();

    public abstract String getColor();

    public String getString(){
        return getColor();
    }
}