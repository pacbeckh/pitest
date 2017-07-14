/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*     */ 
/*     */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*     */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*     */ import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
/*     */ import org.pitest.util.PitError;
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
/*     */ public enum CRCRMutator2
/*     */   implements MethodMutatorFactory
/*     */ {
/*  36 */   CRCR_MUTATOR2;
/*     */   
/*     */   private CRCRMutator2() {}
/*     */   
/*     */   private final class CRCRVisitor2 extends MethodVisitor {
/*     */     private final MutationContext context;
/*     */     
/*  43 */     public CRCRVisitor2(MutationContext context, MethodVisitor delegateVisitor) { super(Opcodes.ASM4, delegateVisitor);
/*  44 */       this.context = context;
/*     */     }
/*     */     
/*     */ 
/*     */     private void mutate(Double constant)
/*     */     {
/*  50 */       Double replacement = Double.valueOf(constant.doubleValue() == -1.0D ? 2.0D : -1.0D);
/*     */       
/*  52 */       if ((constant.doubleValue() != -1.0D) && (shouldMutate(constant, replacement))) {
/*  53 */         translateToByteCode(replacement);
/*     */       } else {
/*  55 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private void mutate(Float constant)
/*     */     {
/*  62 */       Float replacement = Float.valueOf(constant.floatValue() == -1.0F ? 2.0F : -1.0F);
/*     */       
/*  64 */       if ((constant.floatValue() != -1.0F) && (shouldMutate(constant, replacement))) {
/*  65 */         translateToByteCode(replacement);
/*     */       } else {
/*  67 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Integer constant) {
/*  72 */       Integer replacement = Integer.valueOf(-1);
/*     */       
/*  74 */       if ((constant.intValue() != -1) && (shouldMutate(constant, replacement))) {
/*  75 */         translateToByteCode(replacement);
/*     */       } else {
/*  77 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Long constant)
/*     */     {
/*  83 */       Long replacement = Long.valueOf(constant.longValue() == -1L ? 2L : -1L);
/*     */       
/*  85 */       if ((constant.longValue() != -1L) && (shouldMutate(constant, replacement))) {
/*  86 */         translateToByteCode(replacement);
/*     */       } else {
/*  88 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private void mutate(Number constant)
/*     */     {
/*  95 */       if ((constant instanceof Integer)) {
/*  96 */         mutate((Integer)constant);
/*  97 */       } else if ((constant instanceof Long)) {
/*  98 */         mutate((Long)constant);
/*  99 */       } else if ((constant instanceof Float)) {
/* 100 */         mutate((Float)constant);
/* 101 */       } else if ((constant instanceof Double)) {
/* 102 */         mutate((Double)constant);
/*     */       }
/*     */       else {
/* 105 */         throw new PitError("Unsupported subtype of Number found:" + constant.getClass());
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private <T extends Number> boolean shouldMutate(T constant, T replacement)
/*     */     {
/* 112 */       MutationIdentifier mutationId = this.context.registerMutation(CRCRMutator2.this, "Substituted " + constant + " with " + replacement);
/*     */       
/*     */ 
/*     */ 
/* 116 */       return this.context.shouldMutate(mutationId);
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Double constant) {
/* 120 */       if (constant.doubleValue() == 0.0D) {
/* 121 */         super.visitInsn(14);
/* 122 */       } else if (constant.doubleValue() == 1.0D) {
/* 123 */         super.visitInsn(15);
/*     */       } else {
/* 125 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Float constant) {
/* 130 */       if (constant.floatValue() == 0.0F) {
/* 131 */         super.visitInsn(11);
/* 132 */       } else if (constant.floatValue() == 1.0F) {
/* 133 */         super.visitInsn(12);
/* 134 */       } else if (constant.floatValue() == 2.0F) {
/* 135 */         super.visitInsn(13);
/*     */       } else {
/* 137 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Integer constant) {
/* 142 */       switch (constant.intValue()) {
/*     */       case -1: 
/* 144 */         super.visitInsn(2);
/* 145 */         break;
/*     */       case 0: 
/* 147 */         super.visitInsn(3);
/* 148 */         break;
/*     */       case 1: 
/* 150 */         super.visitInsn(4);
/* 151 */         break;
/*     */       case 2: 
/* 153 */         super.visitInsn(5);
/* 154 */         break;
/*     */       case 3: 
/* 156 */         super.visitInsn(6);
/* 157 */         break;
/*     */       case 4: 
/* 159 */         super.visitInsn(7);
/* 160 */         break;
/*     */       case 5: 
/* 162 */         super.visitInsn(8);
/* 163 */         break;
/*     */       default: 
/* 165 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Long constant)
/*     */     {
/* 171 */       if (constant.longValue() == 0L) {
/* 172 */         super.visitInsn(9);
/* 173 */       } else if (constant.longValue() == 1L) {
/* 174 */         super.visitInsn(10);
/*     */       } else {
/* 176 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
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
/*     */     private Number translateToNumber(int opcode)
/*     */     {
/* 191 */       switch (opcode) {
/*     */       case 2: 
/* 193 */         return Integer.valueOf(-1);
/*     */       case 3: 
/* 195 */         return Integer.valueOf(0);
/*     */       case 4: 
/* 197 */         return Integer.valueOf(1);
/*     */       case 5: 
/* 199 */         return Integer.valueOf(2);
/*     */       case 6: 
/* 201 */         return Integer.valueOf(3);
/*     */       case 7: 
/* 203 */         return Integer.valueOf(4);
/*     */       case 8: 
/* 205 */         return Integer.valueOf(5);
/*     */       case 9: 
/* 207 */         return Long.valueOf(0L);
/*     */       case 10: 
/* 209 */         return Long.valueOf(1L);
/*     */       case 11: 
/* 211 */         return Float.valueOf(0.0F);
/*     */       case 12: 
/* 213 */         return Float.valueOf(1.0F);
/*     */       case 13: 
/* 215 */         return Float.valueOf(2.0F);
/*     */       case 14: 
/* 217 */         return Double.valueOf(0.0D);
/*     */       case 15: 
/* 219 */         return Double.valueOf(1.0D);
/*     */       }
/* 221 */       return null;
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void visitInsn(int opcode)
/*     */     {
/* 233 */       Number inlineConstant = translateToNumber(opcode);
/*     */       
/* 235 */       if (inlineConstant == null) {
/* 236 */         super.visitInsn(opcode);
/* 237 */         return;
/*     */       }
/*     */       
/* 240 */       mutate(inlineConstant);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void visitIntInsn(int opcode, int operand)
/*     */     {
/* 250 */       if ((opcode == 16) || (opcode == 17)) {
/* 251 */         mutate(Integer.valueOf(operand));
/*     */       } else {
/* 253 */         super.visitIntInsn(opcode, operand);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void visitLdcInsn(Object constant)
/*     */     {
/* 265 */       if ((constant instanceof Number)) {
/* 266 */         mutate((Number)constant);
/*     */       } else {
/* 268 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor)
/*     */   {
/* 276 */     return new CRCRVisitor2(context, methodVisitor);
/*     */   }
/*     */   
/*     */   public String getGloballyUniqueId() {
/* 280 */     return getClass().getName();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 285 */     return "CRCR_MUTATOR2";
/*     */   }
/*     */   
/*     */   public String getName() {
/* 289 */     return toString();
/*     */   }
/*     */ }


