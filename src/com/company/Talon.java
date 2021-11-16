package com.company;

public class Talon {
    private String talonID;
    public enum State {
        WAIT,
        CURRENT,
        END
    }
    private State state;

    public String getTalonID() {
        return talonID;
    }

    public void setTalonID(String talonID) {
        this.talonID = talonID;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
