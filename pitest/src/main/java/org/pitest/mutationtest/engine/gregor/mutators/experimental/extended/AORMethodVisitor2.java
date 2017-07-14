/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*     */ 
/*     */ import java.util.HashMap;
/*     */ import java.util.Map;
/*     */ import org.pitest.mutationtest.engine.gregor.AbstractInsnMutator;
/*     */ import org.pitest.mutationtest.engine.gregor.InsnSubstitution;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*     */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*     */ import org.pitest.mutationtest.engine.gregor.ZeroOperandMutation;
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
/*     */ 
/*     */ class AORMethodVisitor2
/*     */   extends AbstractInsnMutator
/*     */ {
/*     */   public AORMethodVisitor2(MethodMutatorFactory factory, MethodInfo methodInfo, MutationContext context, MethodVisitor writer)
/*     */   {
/*  53 */     super(factory, methodInfo, context, writer);
/*     */   }
/*     */   
/*  56 */   private static final Map<Integer, ZeroOperandMutation> MUTATIONS = new HashMap();
/*     */   
/*     */   static {
/*  59 */     MUTATIONS.put(Integer.valueOf(96), new InsnSubstitution(104, "Replaced integer addition with multiplication"));
/*     */     
/*  61 */     MUTATIONS.put(Integer.valueOf(100), new InsnSubstitution(108, "Replaced integer subtraction with division"));
/*     */     
/*  63 */     MUTATIONS.put(Integer.valueOf(104), new InsnSubstitution(96, "Replaced integer multiplication with addition"));
/*     */     
/*  65 */     MUTATIONS.put(Integer.valueOf(108), new InsnSubstitution(112, "Replaced integer division with modulus"));
/*     */     
/*  67 */     MUTATIONS.put(Integer.valueOf(112), new InsnSubstitution(108, "Replaced integer modulus with division"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  72 */     MUTATIONS.put(Integer.valueOf(97), new InsnSubstitution(105, "Replaced long addition with multiplication"));
/*     */     
/*  74 */     MUTATIONS.put(Integer.valueOf(101), new InsnSubstitution(109, "Replaced long subtraction with division"));
/*     */     
/*  76 */     MUTATIONS.put(Integer.valueOf(105), new InsnSubstitution(97, "Replaced long multiplication with addition"));
/*     */     
/*  78 */     MUTATIONS.put(Integer.valueOf(109), new InsnSubstitution(113, "Replaced long division with modulus"));
/*     */     
/*  80 */     MUTATIONS.put(Integer.valueOf(113), new InsnSubstitution(109, "Replaced long modulus with division"));
/*     */     
/*     */ 
/*     */ 
/*  84 */     MUTATIONS.put(Integer.valueOf(98), new InsnSubstitution(106, "Replaced float addition with multiplication"));
/*     */     
/*  86 */     MUTATIONS.put(Integer.valueOf(102), new InsnSubstitution(110, "Replaced float subtraction with division"));
/*     */     
/*  88 */     MUTATIONS.put(Integer.valueOf(106), new InsnSubstitution(98, "Replaced float multiplication with addition"));
/*     */     
/*  90 */     MUTATIONS.put(Integer.valueOf(110), new InsnSubstitution(114, "Replaced float division with modulus"));
/*     */     
/*  92 */     MUTATIONS.put(Integer.valueOf(114), new InsnSubstitution(110, "Replaced float modulus with division"));
/*     */     
/*     */ 
/*     */ 
/*  96 */     MUTATIONS.put(Integer.valueOf(99), new InsnSubstitution(107, "Replaced double addition with multiplication"));
/*     */     
/*  98 */     MUTATIONS.put(Integer.valueOf(103), new InsnSubstitution(111, "Replaced double subtraction with division"));
/*     */     
/* 100 */     MUTATIONS.put(Integer.valueOf(107), new InsnSubstitution(99, "Replaced double multiplication with addition"));
/*     */     
/* 102 */     MUTATIONS.put(Integer.valueOf(111), new InsnSubstitution(115, "Replaced double division with modulus"));
/*     */     
/* 104 */     MUTATIONS.put(Integer.valueOf(115), new InsnSubstitution(111, "Replaced double modulus with division"));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected Map<Integer, ZeroOperandMutation> getMutations()
/*     */   {
/* 111 */     return MUTATIONS;
/*     */   }
/*     */ }


