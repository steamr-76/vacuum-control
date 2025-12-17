package org.deolfamily.vacuum.ws;

import org.deolfamily.vacuum.service.OnOffDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = {"/vacuum/state"}, produces = {"plain/text"})
public class VacuumController {
    @Autowired
    private OnOffDevice vacuumMachine;

    @GetMapping
    public String getState() {
        return PortState.getState(this.vacuumMachine.isOn()).toString();
    }

    @PutMapping({"/{state}"})
    public String setState(@PathVariable PortState state) {
        this.vacuumMachine.setState(state.toBoolean());
        return getState();
    }

    @PostMapping
    public String toggleState() {
        this.vacuumMachine.toggleState();
        return getState();
    }
}
