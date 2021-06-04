/*    */ package com.itwill.timetable.vo;
/*    */ 
/*    */ public enum Week {
/*  4 */   MON("월"), 
/*  5 */   TUE("화"), 
/*  6 */   WEN("수"), 
/*  7 */   THU("목"), 
/*  8 */   FRI("금"), 
/*  9 */   SAT("토"), 
/* 10 */   SUN("일");
/*    */   
/*    */ 
/*    */   private final String name;
/*    */   
/* 15 */   private Week(String name) { this.name = name; }
/*    */   
/*    */   public static Week parse(String name) {
/*    */     Week[] arrayOfWeek;
/* 19 */     int j = (arrayOfWeek = values()).length; for (int i = 0; i < j; i++) { Week week = arrayOfWeek[i];
/* 20 */       if (week.name.equals(name))
/* 21 */         return week;
/*    */     }
/* 23 */     return null;
/*    */   }
/*    */   
/*    */   public String toString()
/*    */   {
/* 28 */     return this.name;
/*    */   }
/*    */ }


/* Location:              D:\Downloads\pknutimetable-r31\pknutimetable-r31.jar!\data\Week.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */