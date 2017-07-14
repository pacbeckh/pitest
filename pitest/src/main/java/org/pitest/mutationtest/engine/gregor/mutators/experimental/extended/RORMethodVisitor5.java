/*    */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.pitest.mutationtest.engine.gregor.AbstractJumpMutator;
/*    */ import org.pitest.mutationtest.engine.gregor.AbstractJumpMutator.Substitution;
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
/*    */ class RORMethodVisitor5
/*    */   extends AbstractJumpMutator
/*    */ {
/* 48 */   private static final Map<Integer, AbstractJumpMutator.Substitution> MUTATIONS = new HashMap();
/*    */   
/*    */   static {
/* 51 */     MUTATIONS.put(Integer.valueOf(157), new AbstractJumpMutator.Substitution(154, "Replaced greater by different"));
/*    */     
/* 53 */     MUTATIONS.put(Integer.valueOf(163), new AbstractJumpMutator.Substitution(160, "Replaced greater by different"));
/*    */     
/*    */ 
/* 56 */     MUTATIONS.put(Integer.valueOf(156), new AbstractJumpMutator.Substitution(154, "Replace greater or equal by different"));
/*    */     
/* 58 */     MUTATIONS.put(Integer.valueOf(162), new AbstractJumpMutator.Substitution(160, "Replace greater or equal by different"));
/*    */     
/*    */ 
/* 61 */     MUTATIONS.put(Integer.valueOf(155), new AbstractJumpMutator.Substitution(154, "Replace less by different"));
/*    */     
/* 63 */     MUTATIONS.put(Integer.valueOf(161), new AbstractJumpMutator.Substitution(160, "Replace less by different"));
/*    */     
/*    */ 
/* 66 */     MUTATIONS.put(Integer.valueOf(158), new AbstractJumpMutator.Substitution(154, "Replace less or different"));
/*    */     
/* 68 */     MUTATIONS.put(Integer.valueOf(164), new AbstractJumpMutator.Substitution(160, "Replace less by different"));
/*    */     
/*    */ 
/* 71 */     MUTATIONS.put(Integer.valueOf(153), new AbstractJumpMutator.Substitution(154, "Replace equal by different"));
/*    */     
/* 73 */     MUTATIONS.put(Integer.valueOf(159), new AbstractJumpMutator.Substitution(160, "Replace equal by different"));
/*    */     
/*    */ 
/* 76 */     MUTATIONS.put(Integer.valueOf(154), new AbstractJumpMutator.Substitution(153, "Replace different by equal"));
/*    */     
/* 78 */     MUTATIONS.put(Integer.valueOf(160), new AbstractJumpMutator.Substitution(159, "Replace different by equal"));
/*    */   }
/*    */   
/*    */ 
/*    */   public RORMethodVisitor5(MethodMutatorFactory factory, MutationContext context, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 84 */     super(factory, context, delegateMethodVisitor);
/*    */   }
/*    */   
/*    */   protected Map<Integer, AbstractJumpMutator.Substitution> getMutations()
/*    */   {
/* 89 */     return MUTATIONS;
/*    */   }
/*    */ }


