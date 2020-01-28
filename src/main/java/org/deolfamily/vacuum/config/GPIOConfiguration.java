/*    */ package org.deolfamily.vacuum.config;
/*    */ 
/*    */ import com.pi4j.io.gpio.GpioController;
/*    */ import com.pi4j.io.gpio.GpioFactory;
/*    */ import com.pi4j.io.gpio.GpioPinDigitalOutput;
/*    */ import com.pi4j.io.gpio.PinState;
/*    */ import com.pi4j.io.gpio.RaspiPin;
/*    */ import org.deolfamily.vacuum.service.GPIOBasedOnOffDevice;
/*    */ import org.deolfamily.vacuum.service.OnOffDevice;
/*    */ import org.springframework.beans.factory.annotation.Qualifier;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import org.springframework.context.annotation.Profile;
/*    */ 
/*    */ 
/*    */ @Configuration
/*    */ @Profile({"pi"})
/*    */ public class GPIOConfiguration
/*    */ {
/*    */   @Bean
/*    */   public GpioController gpio() {
/* 22 */     return GpioFactory.getInstance();
/*    */   }
/*    */   
/*    */   @Bean
/*    */   @Qualifier("Vacuum")
/*    */   public OnOffDevice GPIOBasedvacuumMachine(GpioController gpio) {
/* 28 */     GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "vacuum", PinState.LOW);
/* 29 */     pin.setShutdownOptions(Boolean.valueOf(true), PinState.LOW);
/*    */     
/* 31 */     return (OnOffDevice)new GPIOBasedOnOffDevice(pin);
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/config/GPIOConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */