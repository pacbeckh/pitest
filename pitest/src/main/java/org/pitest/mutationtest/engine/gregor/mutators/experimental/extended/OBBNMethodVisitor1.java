/*    */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import org.pitest.mutationtest.engine.gregor.AbstractInsnMutator;
/*    */ import org.pitest.mutationtest.engine.gregor.InsnSubstitution;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*    */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*    */ import org.pitest.mutationtest.engine.gregor.ZeroOperandMutation;
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
/*    */ 
/*    */ class OBBNMethodVisitor1
/*    */   extends AbstractInsnMutator
/*    */ {
/*    */   public OBBNMethodVisitor1(MethodMutatorFactory factory, MethodInfo methodInfo, MutationContext context, MethodVisitor writer)
/*    */   {
/* 53 */     super(factory, methodInfo, context, writer);
/*    */   }
/*    */   
/* 56 */   private static final Map<Integer, ZeroOperandMutation> MUTATIONS = new HashMap();
/*    */   
/*    */   static {
/* 59 */     MUTATIONS.put(Integer.valueOf(126), new InsnSubstitution(128, "Replaced integer and with or"));
/*    */     
/* 61 */     MUTATIONS.put(Integer.valueOf(128), new InsnSubstitution(126, "Replaced integer or with and"));
/*    */     
/*    */ 
/*    */ 
/*    */ 
/* 66 */     MUTATIONS.put(Integer.valueOf(127), new InsnSubstitution(129, "Replaced long and with or"));
/*    */     
/* 68 */     MUTATIONS.put(Integer.valueOf(101), new InsnSubstitution(97, "Replaced long or with and"));
/*    */   }
/*    */   
/*    */ 
/*    */   protected Map<Integer, ZeroOperandMutation> getMutations()
/*    */   {
/* 74 */     return MUTATIONS;
/*    */   }
/*    */ }


