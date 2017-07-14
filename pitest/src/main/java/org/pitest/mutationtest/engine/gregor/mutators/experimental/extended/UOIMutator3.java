/*    */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*    */ 
/*    */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*    */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*    */ import org.objectweb.asm.MethodVisitor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum UOIMutator3
/*    */   implements MethodMutatorFactory
/*    */ {
/* 26 */   UOI_MUTATOR3;
/*    */   
/*    */   private UOIMutator3() {}
/*    */   
/* 30 */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor) { return new UOIMethodVisitor3(this, context, methodInfo, methodVisitor); }
/*    */   
/*    */   public String getGloballyUniqueId()
/*    */   {
/* 34 */     return getClass().getName();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 38 */     return name();
/*    */   }
/*    */ }


