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
/*     */ class AORMethodVisitor4
/*     */   extends AbstractInsnMutator
/*     */ {
/*     */   public AORMethodVisitor4(MethodMutatorFactory factory, MethodInfo methodInfo, MutationContext context, MethodVisitor writer)
/*     */   {
/*  53 */     super(factory, methodInfo, context, writer);
/*     */   }
/*     */   
/*  56 */   private static final Map<Integer, ZeroOperandMutation> MUTATIONS = new HashMap();
/*     */   
/*     */   static {
/*  59 */     MUTATIONS.put(Integer.valueOf(96), new InsnSubstitution(112, "Replaced integer addition with modulus"));
/*     */     
/*  61 */     MUTATIONS.put(Integer.valueOf(100), new InsnSubstitution(112, "Replaced integer subtraction with modulus"));
/*     */     
/*  63 */     MUTATIONS.put(Integer.valueOf(104), new InsnSubstitution(112, "Replaced integer multiplication with modulus"));
/*     */     
/*  65 */     MUTATIONS.put(Integer.valueOf(108), new InsnSubstitution(100, "Replaced integer division with substraction"));
/*     */     
/*  67 */     MUTATIONS.put(Integer.valueOf(112), new InsnSubstitution(104, "Replaced integer modulus with multiplication"));
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*  72 */     MUTATIONS.put(Integer.valueOf(97), new InsnSubstitution(113, "Replaced long addition with modulus"));
/*     */     
/*  74 */     MUTATIONS.put(Integer.valueOf(101), new InsnSubstitution(113, "Replaced long subtraction with modulus"));
/*     */     
/*  76 */     MUTATIONS.put(Integer.valueOf(105), new InsnSubstitution(113, "Replaced long multiplication with modulus"));
/*     */     
/*  78 */     MUTATIONS.put(Integer.valueOf(109), new InsnSubstitution(101, "Replaced long division with substraction"));
/*     */     
/*  80 */     MUTATIONS.put(Integer.valueOf(113), new InsnSubstitution(105, "Replaced long modulus with multiplication"));
/*     */     
/*     */ 
/*     */ 
/*  84 */     MUTATIONS.put(Integer.valueOf(98), new InsnSubstitution(114, "Replaced float addition with modulus"));
/*     */     
/*  86 */     MUTATIONS.put(Integer.valueOf(102), new InsnSubstitution(114, "Replaced float subtraction with modulus"));
/*     */     
/*  88 */     MUTATIONS.put(Integer.valueOf(106), new InsnSubstitution(114, "Replaced float multiplication with modulus"));
/*     */     
/*  90 */     MUTATIONS.put(Integer.valueOf(110), new InsnSubstitution(102, "Replaced float division with substraction"));
/*     */     
/*  92 */     MUTATIONS.put(Integer.valueOf(114), new InsnSubstitution(106, "Replaced float modulus with multiplication"));
/*     */     
/*     */ 
/*     */ 
/*  96 */     MUTATIONS.put(Integer.valueOf(99), new InsnSubstitution(115, "Replaced double addition with modulus"));
/*     */     
/*  98 */     MUTATIONS.put(Integer.valueOf(103), new InsnSubstitution(115, "Replaced double subtraction with modulus"));
/*     */     
/* 100 */     MUTATIONS.put(Integer.valueOf(107), new InsnSubstitution(115, "Replaced double multiplication with modulus"));
/*     */     
/* 102 */     MUTATIONS.put(Integer.valueOf(111), new InsnSubstitution(103, "Replaced double division with substraction"));
/*     */     
/* 104 */     MUTATIONS.put(Integer.valueOf(115), new InsnSubstitution(107, "Replaced double modulus with multiplication"));
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected Map<Integer, ZeroOperandMutation> getMutations()
/*     */   {
/* 111 */     return MUTATIONS;
/*     */   }
/*     */ }


