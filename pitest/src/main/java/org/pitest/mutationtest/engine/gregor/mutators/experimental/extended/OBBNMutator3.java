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
/*    */ public enum OBBNMutator3
/*    */   implements MethodMutatorFactory
/*    */ {
/* 28 */   OBBN_MUTATOR3;
/*    */   
/*    */   private OBBNMutator3() {}
/*    */   
/* 32 */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor) { return new OBBNMethodVisitor3(this, context, methodInfo, methodVisitor); }
/*    */   
/*    */   public String getGloballyUniqueId()
/*    */   {
/* 36 */     return getClass().getName();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 40 */     return name();
/*    */   }
/*    */ }


