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
/*     */ class AORMethodVisitor3
/*     */   extends AbstractInsnMutator
/*     */ {
/*     */   public AORMethodVisitor3(MethodMutatorFactory factory, MethodInfo methodInfo, MutationContext context, MethodVisitor writer)
/*     */   {
/*  53 */     super(factory, methodInfo, context, writer);
/*     */   }
/*     */   
/*  56 */   private static final Map<Integer, ZeroOperandMutation> MUTATIONS = new HashMap();
/*     */   
/*     */   static {
/*  59 */     MUTATIONS.put(Integer.valueOf(96), new InsnSubstitution(108, "Replaced integer addition with division"));
/*     */     
/*  61 */     MUTATIONS.put(Integer.valueOf(100), new InsnSubstitution(104, "Replaced integer subtraction with multiplication"));
/*     */     
/*  63 */     MUTATIONS.put(Integer.valueOf(104), new InsnSubstitution(100, "Replaced integer multiplication with substraction"));
/*     */     
/*  65 */     MUTATIONS.put(Integer.valueOf(108), new InsnSubstitution(96, "Replaced integer division with addition"));
/*     */     
/*  67 */     MUTATIONS.put(Integer.valueOf(112), new InsnSubstitution(96, "Replaced integer modulus with addition"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  72 */     MUTATIONS.put(Integer.valueOf(97), new InsnSubstitution(109, "Replaced long addition with division"));
/*     */     
/*  74 */     MUTATIONS.put(Integer.valueOf(101), new InsnSubstitution(105, "Replaced long subtraction with multiplication"));
/*     */     
/*  76 */     MUTATIONS.put(Integer.valueOf(105), new InsnSubstitution(101, "Replaced long multiplication with substraction"));
/*     */     
/*  78 */     MUTATIONS.put(Integer.valueOf(109), new InsnSubstitution(97, "Replaced long division with addition"));
/*     */     
/*  80 */     MUTATIONS.put(Integer.valueOf(113), new InsnSubstitution(97, "Replaced long modulus with addition"));
/*     */     
/*     */ 
/*     */ 
/*  84 */     MUTATIONS.put(Integer.valueOf(98), new InsnSubstitution(110, "Replaced float addition with division"));
/*     */     
/*  86 */     MUTATIONS.put(Integer.valueOf(102), new InsnSubstitution(106, "Replaced float subtraction with multiplication"));
/*     */     
/*  88 */     MUTATIONS.put(Integer.valueOf(106), new InsnSubstitution(102, "Replaced float multiplication with substraction"));
/*     */     
/*  90 */     MUTATIONS.put(Integer.valueOf(110), new InsnSubstitution(98, "Replaced float division with addition"));
/*     */     
/*  92 */     MUTATIONS.put(Integer.valueOf(114), new InsnSubstitution(98, "Replaced float modulus with addition"));
/*     */     
/*     */ 
/*     */ 
/*  96 */     MUTATIONS.put(Integer.valueOf(99), new InsnSubstitution(111, "Replaced double addition with division"));
/*     */     
/*  98 */     MUTATIONS.put(Integer.valueOf(103), new InsnSubstitution(107, "Replaced double subtraction with multiplication"));
/*     */     
/* 100 */     MUTATIONS.put(Integer.valueOf(107), new InsnSubstitution(103, "Replaced double multiplication with substraction"));
/*     */     
/* 102 */     MUTATIONS.put(Integer.valueOf(111), new InsnSubstitution(99, "Replaced double division with addition"));
/*     */     
/* 104 */     MUTATIONS.put(Integer.valueOf(115), new InsnSubstitution(99, "Replaced double modulus with addition"));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected Map<Integer, ZeroOperandMutation> getMutations()
/*     */   {
/* 111 */     return MUTATIONS;
/*     */   }
/*     */ }


