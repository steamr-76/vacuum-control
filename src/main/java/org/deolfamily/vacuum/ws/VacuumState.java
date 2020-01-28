/*    */ package org.deolfamily.vacuum.ws;
/*    */ 
/*    */ import com.fasterxml.jackson.annotation.JsonFormat;
/*    */ import com.fasterxml.jackson.annotation.JsonProperty;
/*    */ 
/*    */ @JsonFormat(shape = JsonFormat.Shape.OBJECT)
/*    */ public enum VacuumState {
/*  8 */   ON(true), OFF(false);
/*    */   
/*    */   @JsonProperty
/*    */   private boolean on;
/*    */   
/*    */   VacuumState(boolean on) {
/* 14 */     this.on = on;
/*    */   }
/*    */   
/*    */   public static VacuumState getState(boolean state) {
/* 18 */     return state ? ON : OFF;
/*    */   }
/*    */   
/*    */   public boolean toBoolean() {
/* 22 */     return this.on;
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/ws/VacuumState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */