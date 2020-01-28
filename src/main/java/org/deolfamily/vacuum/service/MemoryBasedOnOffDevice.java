/*    */ package org.deolfamily.vacuum.service;
/*    */ 
/*    */ public class MemoryBasedOnOffDevice
/*    */   implements OnOffDevice
/*    */ {
/*    */   private boolean state;
/*    */   
/*    */   public boolean isOn() {
/*  9 */     return this.state;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOff() {
/* 14 */     return !this.state;
/*    */   }
/*    */ 
/*    */   
/*    */   public void turnOn() {
/* 19 */     this.state = true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void turnOff() {
/* 24 */     this.state = false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void togglePower() {
/* 29 */     this.state = !this.state;
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPowerState(boolean state) {
/* 34 */     this.state = state;
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/service/MemoryBasedOnOffDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */