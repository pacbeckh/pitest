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
/*    */ class RORMethodVisitor4
/*    */   extends AbstractJumpMutator
/*    */ {
/* 48 */   private static final Map<Integer, AbstractJumpMutator.Substitution> MUTATIONS = new HashMap();
/*    */   
/*    */   static {
/* 51 */     MUTATIONS.put(Integer.valueOf(157), new AbstractJumpMutator.Substitution(153, "Replaced greater by equal"));
/*    */     
/* 53 */     MUTATIONS.put(Integer.valueOf(163), new AbstractJumpMutator.Substitution(159, "Replaced greater by equal"));
/*    */     
/*    */ 
/* 56 */     MUTATIONS.put(Integer.valueOf(156), new AbstractJumpMutator.Substitution(153, "Replace greater or equal by equal"));
/*    */     
/* 58 */     MUTATIONS.put(Integer.valueOf(162), new AbstractJumpMutator.Substitution(159, "Replace greater or equal by equal"));
/*    */     
/*    */ 
/* 61 */     MUTATIONS.put(Integer.valueOf(155), new AbstractJumpMutator.Substitution(153, "Replace less by equal"));
/*    */     
/* 63 */     MUTATIONS.put(Integer.valueOf(161), new AbstractJumpMutator.Substitution(159, "Replace less by equal"));
/*    */     
/*    */ 
/* 66 */     MUTATIONS.put(Integer.valueOf(158), new AbstractJumpMutator.Substitution(153, "Replace less or equal"));
/*    */     
/* 68 */     MUTATIONS.put(Integer.valueOf(164), new AbstractJumpMutator.Substitution(159, "Replace less by equal"));
/*    */     
/*    */ 
/* 71 */     MUTATIONS.put(Integer.valueOf(153), new AbstractJumpMutator.Substitution(158, "Replace equal by less or equal"));
/*    */     
/* 73 */     MUTATIONS.put(Integer.valueOf(159), new AbstractJumpMutator.Substitution(164, "Replace equal by less or equal"));
/*    */     
/*    */ 
/* 76 */     MUTATIONS.put(Integer.valueOf(154), new AbstractJumpMutator.Substitution(158, "Replace different by less or equal"));
/*    */     
/* 78 */     MUTATIONS.put(Integer.valueOf(160), new AbstractJumpMutator.Substitution(164, "Replace different by less or equal"));
/*    */   }
/*    */   
/*    */ 
/*    */   public RORMethodVisitor4(MethodMutatorFactory factory, MutationContext context, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 84 */     super(factory, context, delegateMethodVisitor);
/*    */   }
/*    */   
/*    */   protected Map<Integer, AbstractJumpMutator.Substitution> getMutations()
/*    */   {
/* 89 */     return MUTATIONS;
/*    */   }
/*    */ }


