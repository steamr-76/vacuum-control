package org.deolfamily.vacuum.ws;

public enum PortState {
    ON(true), OFF(false);

    private final boolean on;

    PortState(boolean on) {
        this.on = on;
    }

    public static PortState getState(boolean state) {
        return state ? ON : OFF;
    }

    public boolean toBoolean() {
        return this.on;
    }
}
