package org.deolfamily.vacuum.service;

public interface OnOffDevice {
    boolean isOn();

    void turnOn();

    void turnOff();

    void toggleState();

    void setState(boolean paramBoolean);
}
