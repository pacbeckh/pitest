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
/*     */ public enum CRCRMutator5
/*     */   implements MethodMutatorFactory
/*     */ {
/*  36 */   CRCR_MUTATOR5;
/*     */   
/*     */   private CRCRMutator5() {}
/*     */   
/*     */   private final class CRCRVisitor5 extends MethodVisitor {
/*     */     private final MutationContext context;
/*     */     
/*  43 */     public CRCRVisitor5(MutationContext context, MethodVisitor delegateVisitor) { super(Opcodes.ASM4, delegateVisitor);
/*  44 */       this.context = context;
/*     */     }
/*     */     
/*     */     private void mutate(Double constant)
/*     */     {
/*  49 */       Double replacement = Double.valueOf(constant.doubleValue() - 1.0D);
/*     */       
/*  51 */       if ((constant.doubleValue() != 0.0D) && (constant.doubleValue() != 2.0D) && (constant.doubleValue() != 1.0D) && (shouldMutate(constant, replacement))) {
/*  52 */         translateToByteCode(replacement);
/*     */       } else {
/*  54 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Float constant)
/*     */     {
/*  60 */       Float replacement = Float.valueOf(constant.floatValue() - 1.0F);
/*     */       
/*  62 */       if ((constant.floatValue() != 0.0F) && (constant.floatValue() != 2.0F) && (constant.floatValue() != 1.0F) && (shouldMutate(constant, replacement))) {
/*  63 */         translateToByteCode(replacement);
/*     */       } else {
/*  65 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Integer constant) {
/*  70 */       Integer replacement = Integer.valueOf(constant.intValue() - 1);
/*     */       
/*  72 */       if ((constant.intValue() != 0) && (constant.intValue() != 2) && (constant.intValue() != 1) && (shouldMutate(constant, replacement))) {
/*  73 */         translateToByteCode(replacement);
/*     */       } else {
/*  75 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Long constant)
/*     */     {
/*  81 */       Long replacement = Long.valueOf(constant.longValue() - 1L);
/*     */       
/*  83 */       if ((constant.longValue() != 0L) && (constant.longValue() != 2L) && (constant.longValue() != 1L) && (shouldMutate(constant, replacement))) {
/*  84 */         translateToByteCode(replacement);
/*     */       } else {
/*  86 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private void mutate(Number constant)
/*     */     {
/*  93 */       if ((constant instanceof Integer)) {
/*  94 */         mutate((Integer)constant);
/*  95 */       } else if ((constant instanceof Long)) {
/*  96 */         mutate((Long)constant);
/*  97 */       } else if ((constant instanceof Float)) {
/*  98 */         mutate((Float)constant);
/*  99 */       } else if ((constant instanceof Double)) {
/* 100 */         mutate((Double)constant);
/*     */       }
/*     */       else {
/* 103 */         throw new PitError("Unsupported subtype of Number found:" + constant.getClass());
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private <T extends Number> boolean shouldMutate(T constant, T replacement)
/*     */     {
/* 110 */       MutationIdentifier mutationId = this.context.registerMutation(CRCRMutator5.this, "Substituted " + constant + " with " + replacement);
/*     */       
/*     */ 
/*     */ 
/* 114 */       return this.context.shouldMutate(mutationId);
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Double constant) {
/* 118 */       if (constant.doubleValue() == 0.0D) {
/* 119 */         super.visitInsn(14);
/* 120 */       } else if (constant.doubleValue() == 1.0D) {
/* 121 */         super.visitInsn(15);
/*     */       } else {
/* 123 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Float constant) {
/* 128 */       if (constant.floatValue() == 0.0F) {
/* 129 */         super.visitInsn(11);
/* 130 */       } else if (constant.floatValue() == 1.0F) {
/* 131 */         super.visitInsn(12);
/* 132 */       } else if (constant.floatValue() == 2.0F) {
/* 133 */         super.visitInsn(13);
/*     */       } else {
/* 135 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Integer constant) {
/* 140 */       switch (constant.intValue()) {
/*     */       case -1: 
/* 142 */         super.visitInsn(2);
/* 143 */         break;
/*     */       case 0: 
/* 145 */         super.visitInsn(3);
/* 146 */         break;
/*     */       case 1: 
/* 148 */         super.visitInsn(4);
/* 149 */         break;
/*     */       case 2: 
/* 151 */         super.visitInsn(5);
/* 152 */         break;
/*     */       case 3: 
/* 154 */         super.visitInsn(6);
/* 155 */         break;
/*     */       case 4: 
/* 157 */         super.visitInsn(7);
/* 158 */         break;
/*     */       case 5: 
/* 160 */         super.visitInsn(8);
/* 161 */         break;
/*     */       default: 
/* 163 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Long constant)
/*     */     {
/* 169 */       if (constant.longValue() == 0L) {
/* 170 */         super.visitInsn(9);
/* 171 */       } else if (constant.longValue() == 1L) {
/* 172 */         super.visitInsn(10);
/*     */       } else {
/* 174 */         super.visitLdcInsn(constant);
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
/* 189 */       switch (opcode) {
/*     */       case 2: 
/* 191 */         return Integer.valueOf(-1);
/*     */       case 3: 
/* 193 */         return Integer.valueOf(0);
/*     */       case 4: 
/* 195 */         return Integer.valueOf(1);
/*     */       case 5: 
/* 197 */         return Integer.valueOf(2);
/*     */       case 6: 
/* 199 */         return Integer.valueOf(3);
/*     */       case 7: 
/* 201 */         return Integer.valueOf(4);
/*     */       case 8: 
/* 203 */         return Integer.valueOf(5);
/*     */       case 9: 
/* 205 */         return Long.valueOf(0L);
/*     */       case 10: 
/* 207 */         return Long.valueOf(1L);
/*     */       case 11: 
/* 209 */         return Float.valueOf(0.0F);
/*     */       case 12: 
/* 211 */         return Float.valueOf(1.0F);
/*     */       case 13: 
/* 213 */         return Float.valueOf(2.0F);
/*     */       case 14: 
/* 215 */         return Double.valueOf(0.0D);
/*     */       case 15: 
/* 217 */         return Double.valueOf(1.0D);
/*     */       }
/* 219 */       return null;
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
/* 231 */       Number inlineConstant = translateToNumber(opcode);
/*     */       
/* 233 */       if (inlineConstant == null) {
/* 234 */         super.visitInsn(opcode);
/* 235 */         return;
/*     */       }
/*     */       
/* 238 */       mutate(inlineConstant);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void visitIntInsn(int opcode, int operand)
/*     */     {
/* 248 */       if ((opcode == 16) || (opcode == 17)) {
/* 249 */         mutate(Integer.valueOf(operand));
/*     */       } else {
/* 251 */         super.visitIntInsn(opcode, operand);
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
/* 263 */       if ((constant instanceof Number)) {
/* 264 */         mutate((Number)constant);
/*     */       } else {
/* 266 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor)
/*     */   {
/* 274 */     return new CRCRVisitor5(context, methodVisitor);
/*     */   }
/*     */   
/*     */   public String getGloballyUniqueId() {
/* 278 */     return getClass().getName();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 283 */     return "CRCR_MUTATOR5";
/*     */   }
/*     */   
/*     */   public String getName() {
/* 287 */     return toString();
/*     */   }
/*     */ }


