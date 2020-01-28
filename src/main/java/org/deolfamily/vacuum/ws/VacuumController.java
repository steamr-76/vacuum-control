/*    */ package org.deolfamily.vacuum.ws;
/*    */ 
/*    */ import org.deolfamily.vacuum.service.OnOffDevice;
/*    */ import org.springframework.beans.factory.annotation.Autowired;
/*    */ import org.springframework.beans.factory.annotation.Qualifier;
/*    */ import org.springframework.web.bind.annotation.GetMapping;
/*    */ import org.springframework.web.bind.annotation.PathVariable;
/*    */ import org.springframework.web.bind.annotation.PostMapping;
/*    */ import org.springframework.web.bind.annotation.PutMapping;
/*    */ import org.springframework.web.bind.annotation.RequestMapping;
/*    */ import org.springframework.web.bind.annotation.RestController;
/*    */ 
/*    */ @RestController
/*    */ @RequestMapping(path = {"/vacuum/state"}, produces = {"application/json"})
/*    */ public class VacuumController
/*    */ {
/*    */   @Autowired
/*    */   @Qualifier("Vacuum")
/*    */   OnOffDevice vacuumMachine;
/*    */   
/*    */   @GetMapping
/*    */   public VacuumState getState() {
/* 23 */     return VacuumState.getState(this.vacuumMachine.isOn());
/*    */   }
/*    */   
/*    */   @PutMapping({"/{state}"})
/*    */   public VacuumState setState(@PathVariable VacuumState state) {
/* 28 */     this.vacuumMachine.setPowerState(state.toBoolean());
/* 29 */     return getState();
/*    */   }
/*    */   
/*    */   @PostMapping
/*    */   public VacuumState toggleState() {
/* 34 */     this.vacuumMachine.togglePower();
/* 35 */     return getState();
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/ws/VacuumController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */