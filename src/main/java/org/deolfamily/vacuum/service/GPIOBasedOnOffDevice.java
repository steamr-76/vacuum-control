/*    */ package org.deolfamily.vacuum.service;
/*    */ 
/*    */ import com.pi4j.io.gpio.GpioPinDigitalOutput;
/*    */ import com.pi4j.io.gpio.PinState;
/*    */ 
/*    */ public class GPIOBasedOnOffDevice
/*    */   implements OnOffDevice {
/*    */   private GpioPinDigitalOutput pin;
/*    */   
/*    */   public GPIOBasedOnOffDevice(GpioPinDigitalOutput pin) {
/* 11 */     this.pin = pin;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOn() {
/* 16 */     return this.pin.getState().isHigh();
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isOff() {
/* 21 */     return this.pin.getState().isLow();
/*    */   }
/*    */ 
/*    */   
/*    */   public void turnOn() {
/* 26 */     this.pin.setState(PinState.HIGH);
/*    */   }
/*    */ 
/*    */   
/*    */   public void turnOff() {
/* 31 */     this.pin.setState(PinState.LOW);
/*    */   }
/*    */ 
/*    */   
/*    */   public void togglePower() {
/* 36 */     this.pin.toggle();
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPowerState(boolean state) {
/* 41 */     if (state) { turnOn(); } else { turnOff(); }
/*    */   
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/service/GPIOBasedOnOffDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */