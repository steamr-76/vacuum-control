package org.deolfamily.vacuum.service;

public class MemoryBasedOnOffDevice implements OnOffDevice {
    // Mocked state.
    private boolean state;

    public boolean isOn() {
        return this.state;
    }


    public boolean isOff() {
        return !this.state;
    }


    public void turnOn() {
        this.state = true;
    }


    public void turnOff() {
        this.state = false;
    }


    public void toggleState() {
        this.state = !this.state;
    }


    public void setState(boolean state) {
        this.state = state;
    }
}
