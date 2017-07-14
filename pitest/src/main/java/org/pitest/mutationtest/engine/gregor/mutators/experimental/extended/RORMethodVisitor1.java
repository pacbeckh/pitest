/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.pitest.mutationtest.engine.gregor.AbstractJumpMutator;
/*     */ import org.pitest.mutationtest.engine.gregor.AbstractJumpMutator.Substitution;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*     */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*     */ import org.objectweb.asm.MethodVisitor;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class RORMethodVisitor1
/*     */   extends AbstractJumpMutator
/*     */ {
/*  48 */   private static final Map<Integer, AbstractJumpMutator.Substitution> MUTATIONS = new HashMap();
/*     */   
/*     */   static {
/*  51 */     MUTATIONS.put(Integer.valueOf(157), new AbstractJumpMutator.Substitution(156, "Replaced greater by greater or equal"));
/*     */     
/*  53 */     MUTATIONS.put(Integer.valueOf(163), new AbstractJumpMutator.Substitution(162, "Replaced greater by greater or equal"));
/*     */     
/*     */ 
/*  56 */     MUTATIONS.put(Integer.valueOf(156), new AbstractJumpMutator.Substitution(157, "Replace greater or equal by greater"));
/*     */     
/*  58 */     MUTATIONS.put(Integer.valueOf(162), new AbstractJumpMutator.Substitution(163, "Replace greater or equal by greater"));
/*     */     
/*     */ 
/*  61 */     MUTATIONS.put(Integer.valueOf(155), new AbstractJumpMutator.Substitution(157, "Replace less by greater"));
/*     */     
/*  63 */     MUTATIONS.put(Integer.valueOf(161), new AbstractJumpMutator.Substitution(163, "Replace less by greater"));
/*     */     
/*     */ 
/*  66 */     MUTATIONS.put(Integer.valueOf(158), new AbstractJumpMutator.Substitution(157, "Replace less or equal by greater"));
/*     */     
/*  68 */     MUTATIONS.put(Integer.valueOf(164), new AbstractJumpMutator.Substitution(163, "Replace less by greater"));
/*     */     
/*     */ 
/*  71 */     MUTATIONS.put(Integer.valueOf(153), new AbstractJumpMutator.Substitution(157, "Replace equal by greater"));
/*     */     
/*  73 */     MUTATIONS.put(Integer.valueOf(159), new AbstractJumpMutator.Substitution(163, "Replace equal by greater"));
/*     */     
/*     */ 
/*  76 */     MUTATIONS.put(Integer.valueOf(154), new AbstractJumpMutator.Substitution(157, "Replace different by greater"));
/*     */     
/*  78 */     MUTATIONS.put(Integer.valueOf(160), new AbstractJumpMutator.Substitution(163, "Replace different by greater"));
/*     */     
/*     */ 
/*  81 */     MUTATIONS.put(Integer.valueOf(198), new AbstractJumpMutator.Substitution(199, "Replace if null by if non null"));
/*     */     
/*  83 */     MUTATIONS.put(Integer.valueOf(199), new AbstractJumpMutator.Substitution(198, "Replace if non null by if null"));
/*     */     
/*     */ 
/*  86 */     MUTATIONS.put(Integer.valueOf(165), new AbstractJumpMutator.Substitution(166, "Replaced references equal by not equal"));
/*     */     
/*     */ 
/*  89 */     MUTATIONS.put(Integer.valueOf(166), new AbstractJumpMutator.Substitution(165, "Replaced references not equal by equal"));
/*     */   }
/*     */   
/*     */ 
/*     */   public RORMethodVisitor1(MethodMutatorFactory factory, MutationContext context, MethodVisitor delegateMethodVisitor)
/*     */   {
/*  95 */     super(factory, context, delegateMethodVisitor);
/*     */   }
/*     */   
/*     */   protected Map<Integer, AbstractJumpMutator.Substitution> getMutations()
/*     */   {
/* 100 */     return MUTATIONS;
/*     */   }
/*     */ }


