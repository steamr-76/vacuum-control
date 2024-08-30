package org.deolfamily.vacuum.ws;

import org.deolfamily.vacuum.service.OnOffDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/vacuum/state"}, produces = {"application/json"})
public class VacuumController {
    @Autowired
    @Qualifier("Vacuum")
    OnOffDevice vacuumMachine;

    @GetMapping
    public PortState getState() {
        return PortState.getState(this.vacuumMachine.isOn());
    }

    @PutMapping({"/{state}"})
    public PortState setState(@PathVariable PortState state) {
        this.vacuumMachine.setState(state.toBoolean());
        return getState();
    }

    @PostMapping
    public PortState toggleState() {
        this.vacuumMachine.toggleState();
        return getState();
    }
}
