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
/*    */ class RORMethodVisitor2
/*    */   extends AbstractJumpMutator
/*    */ {
/* 48 */   private static final Map<Integer, AbstractJumpMutator.Substitution> MUTATIONS = new HashMap();
/*    */   
/*    */   static {
/* 51 */     MUTATIONS.put(Integer.valueOf(157), new AbstractJumpMutator.Substitution(155, "Replaced greater by less"));
/*    */     
/* 53 */     MUTATIONS.put(Integer.valueOf(163), new AbstractJumpMutator.Substitution(161, "Replaced greater by less"));
/*    */     
/*    */ 
/* 56 */     MUTATIONS.put(Integer.valueOf(156), new AbstractJumpMutator.Substitution(155, "Replace greater or equal by less"));
/*    */     
/* 58 */     MUTATIONS.put(Integer.valueOf(162), new AbstractJumpMutator.Substitution(161, "Replace greater or equal by less"));
/*    */     
/*    */ 
/* 61 */     MUTATIONS.put(Integer.valueOf(155), new AbstractJumpMutator.Substitution(156, "Replace less by greater or equal"));
/*    */     
/* 63 */     MUTATIONS.put(Integer.valueOf(161), new AbstractJumpMutator.Substitution(162, "Replace less by greater or equal"));
/*    */     
/*    */ 
/* 66 */     MUTATIONS.put(Integer.valueOf(158), new AbstractJumpMutator.Substitution(156, "Replace less or equal by greater or equal"));
/*    */     
/* 68 */     MUTATIONS.put(Integer.valueOf(164), new AbstractJumpMutator.Substitution(162, "Replace less by greater or equal"));
/*    */     
/*    */ 
/* 71 */     MUTATIONS.put(Integer.valueOf(153), new AbstractJumpMutator.Substitution(156, "Replace equal by greater or equal"));
/*    */     
/* 73 */     MUTATIONS.put(Integer.valueOf(159), new AbstractJumpMutator.Substitution(162, "Replace equal by greater or equal"));
/*    */     
/*    */ 
/* 76 */     MUTATIONS.put(Integer.valueOf(154), new AbstractJumpMutator.Substitution(156, "Replace different by greater or equal"));
/*    */     
/* 78 */     MUTATIONS.put(Integer.valueOf(160), new AbstractJumpMutator.Substitution(162, "Replace different by greater or equal"));
/*    */   }
/*    */   
/*    */ 
/*    */   public RORMethodVisitor2(MethodMutatorFactory factory, MutationContext context, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 84 */     super(factory, context, delegateMethodVisitor);
/*    */   }
/*    */   
/*    */   protected Map<Integer, AbstractJumpMutator.Substitution> getMutations()
/*    */   {
/* 89 */     return MUTATIONS;
/*    */   }
/*    */ }


