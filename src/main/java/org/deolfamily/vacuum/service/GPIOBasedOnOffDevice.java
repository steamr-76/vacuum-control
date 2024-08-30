package org.deolfamily.vacuum.service;

import com.pi4j.io.gpio.GpioPinDigitalOutput;

import static com.pi4j.io.gpio.PinState.*;

public class GPIOBasedOnOffDevice
        implements OnOffDevice {
    private GpioPinDigitalOutput pin;

    public GPIOBasedOnOffDevice(GpioPinDigitalOutput pin) {
        this.pin = pin;
    }


    public boolean isOn() {
        return this.pin.getState().isLow();
    }


    public boolean isOff() {
        return this.pin.getState().isHigh();
    }


    public void turnOn() {
        this.pin.setState(LOW);
    }


    public void turnOff() {
        this.pin.setState(HIGH);
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
