package org.deolfamily.vacuum.ws;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum PortState {
    ON(true), OFF(false);

    @JsonProperty
    private boolean on;

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
