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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum AORMutator4
/*    */   implements MethodMutatorFactory
/*    */ {
/* 31 */   AOR_MUTATOR4;
/*    */   
/*    */   private AORMutator4() {}
/*    */   
/* 35 */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor) { return new AORMethodVisitor4(this, methodInfo, context, methodVisitor); }
/*    */   
/*    */   public String getGloballyUniqueId()
/*    */   {
/* 39 */     return getClass().getName();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 43 */     return name();
/*    */   }
/*    */ }


