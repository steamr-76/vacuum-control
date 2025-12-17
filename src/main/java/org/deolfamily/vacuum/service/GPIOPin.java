package org.deolfamily.vacuum.service;

import com.pi4j.io.gpio.digital.DigitalOutput;

public class GPIOPin implements OnOffDevice {
    private final DigitalOutput pin;

    public GPIOPin(DigitalOutput pin) {
        this.pin = pin;
    }

    public boolean isOn() {
        return this.pin.isLow();
    }

    public void turnOn() {
        this.pin.low();
    }

    public void turnOff() {
        this.pin.high();
    }

    public void toggleState() {
        this.pin.toggle();
    }

    public void setState(boolean state) {
        if (state) {
            turnOn();
        } else {
            turnOff();
        }
    }
}
