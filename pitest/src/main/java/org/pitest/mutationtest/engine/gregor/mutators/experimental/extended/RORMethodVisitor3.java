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
/*    */ class RORMethodVisitor3
/*    */   extends AbstractJumpMutator
/*    */ {
/* 48 */   private static final Map<Integer, AbstractJumpMutator.Substitution> MUTATIONS = new HashMap();
/*    */   
/*    */   static {
/* 51 */     MUTATIONS.put(Integer.valueOf(157), new AbstractJumpMutator.Substitution(158, "Replaced greater by less or equal"));
/*    */     
/* 53 */     MUTATIONS.put(Integer.valueOf(163), new AbstractJumpMutator.Substitution(164, "Replaced greater by less or equal"));
/*    */     
/*    */ 
/* 56 */     MUTATIONS.put(Integer.valueOf(156), new AbstractJumpMutator.Substitution(158, "Replace greater or equal by less or equal"));
/*    */     
/* 58 */     MUTATIONS.put(Integer.valueOf(162), new AbstractJumpMutator.Substitution(164, "Replace greater or equal by less or equal"));
/*    */     
/*    */ 
/* 61 */     MUTATIONS.put(Integer.valueOf(155), new AbstractJumpMutator.Substitution(158, "Replace less by less or equal"));
/*    */     
/* 63 */     MUTATIONS.put(Integer.valueOf(161), new AbstractJumpMutator.Substitution(164, "Replace less by less or equal"));
/*    */     
/*    */ 
/* 66 */     MUTATIONS.put(Integer.valueOf(158), new AbstractJumpMutator.Substitution(155, "Replace less or equal by less"));
/*    */     
/* 68 */     MUTATIONS.put(Integer.valueOf(164), new AbstractJumpMutator.Substitution(161, "Replace less by less"));
/*    */     
/*    */ 
/* 71 */     MUTATIONS.put(Integer.valueOf(153), new AbstractJumpMutator.Substitution(155, "Replace equal by less"));
/*    */     
/* 73 */     MUTATIONS.put(Integer.valueOf(159), new AbstractJumpMutator.Substitution(161, "Replace equal by less"));
/*    */     
/*    */ 
/* 76 */     MUTATIONS.put(Integer.valueOf(154), new AbstractJumpMutator.Substitution(155, "Replace different by less"));
/*    */     
/* 78 */     MUTATIONS.put(Integer.valueOf(160), new AbstractJumpMutator.Substitution(161, "Replace different by less"));
/*    */   }
/*    */   
/*    */ 
/*    */   public RORMethodVisitor3(MethodMutatorFactory factory, MutationContext context, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 84 */     super(factory, context, delegateMethodVisitor);
/*    */   }
/*    */   
/*    */   protected Map<Integer, AbstractJumpMutator.Substitution> getMutations()
/*    */   {
/* 89 */     return MUTATIONS;
/*    */   }
/*    */ }


