/*    */ package org.deolfamily.vacuum.config;
/*    */ 
/*    */ import org.deolfamily.vacuum.service.MemoryBasedOnOffDevice;
/*    */ import org.deolfamily.vacuum.service.OnOffDevice;
/*    */ import org.springframework.beans.factory.annotation.Qualifier;
/*    */ import org.springframework.context.annotation.Bean;
/*    */ import org.springframework.context.annotation.Configuration;
/*    */ import org.springframework.context.annotation.Profile;
/*    */ 
/*    */ @Configuration
/*    */ @Profile({"mock"})
/*    */ public class MockConfiguration
/*    */ {
/*    */   @Bean
/*    */   @Qualifier("Vacuum")
/*    */   public OnOffDevice InMemoryVacuumMachine() {
/* 17 */     return (OnOffDevice)new MemoryBasedOnOffDevice();
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/config/MockConfiguration.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */