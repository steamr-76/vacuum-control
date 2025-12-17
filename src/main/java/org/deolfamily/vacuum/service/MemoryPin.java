package org.deolfamily.vacuum.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.deolfamily.vacuum.ws.PortState.getState;

public class MemoryPin implements OnOffDevice {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private boolean state;

    public boolean isOn() {
        return this.state;
    }


    public void turnOn() {
        log.info("*** Turning simulated switch to ON");
        this.state = true;
    }


    public void turnOff() {
        log.info("*** Turning simulated switch to OFF");
        this.state = false;
    }


    public void toggleState() {
        log.info("*** Toggling simulated switch. Old state: {}", getState(state));
        this.state = !this.state;
    }


    public void setState(boolean state) {
        log.info("*** Setting simulated switch to: {}", getState(state));
        this.state = state;
    }
}
