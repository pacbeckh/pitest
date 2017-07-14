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
/*    */ public enum RORMutator1
/*    */   implements MethodMutatorFactory
/*    */ {
/* 29 */   ROR_MUTATOR1;
/*    */   
/*    */   private RORMutator1() {}
/*    */   
/* 33 */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor) { return new RORMethodVisitor1(this, context, methodVisitor); }
/*    */   
/*    */   public String getGloballyUniqueId()
/*    */   {
/* 37 */     return getClass().getName();
/*    */   }
/*    */   
/*    */   public String getName() {
/* 41 */     return name();
/*    */   }
/*    */ }


