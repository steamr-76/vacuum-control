/*    */ package org.deolfamily.vacuum.spring.converter;
/*    */ 
/*    */ import org.deolfamily.vacuum.ws.VacuumState;
/*    */ import org.springframework.core.convert.converter.Converter;
/*    */ import org.springframework.stereotype.Component;
/*    */ 
/*    */ @Component
/*    */ public class ConverterForStringToVacuumState
/*    */   implements Converter<String, VacuumState>
/*    */ {
/*    */   public VacuumState convert(String source) {
/* 12 */     return (source == null) ? null : VacuumState.valueOf(source.toUpperCase());
/*    */   }
/*    */ }


/* Location:              /home/ravinder/IdeaProjects/vacuum/!/org/deolfamily/vacuum/spring/converter/ConverterForStringToVacuumState.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */