/*    */ package org.deolfamily.vacuum;
/*    */ 
/*    */ import org.deolfamily.vacuum.config.GPIOConfiguration;
/*    */ import org.deolfamily.vacuum.config.MockConfiguration;
/*    */ import org.springframework.boot.SpringApplication;
/*    */ import org.springframework.boot.autoconfigure.SpringBootApplication;
/*    */ import org.springframework.context.annotation.Import;
/*    */ 
/*    */ 
/*    */ 
/*    */ @SpringBootApplication
/*    */ @Import({MockConfiguration.class, GPIOConfiguration.class})
/*    */ public class GPIOManagerStarter
/*    */ {
/*    */   public static void main(String[] args) {
/* 16 */     SpringApplication.run(GPIOManagerStarter.class, args);
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/GPIOManagerStarter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */