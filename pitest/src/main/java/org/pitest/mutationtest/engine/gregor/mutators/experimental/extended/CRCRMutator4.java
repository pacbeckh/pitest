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
/*     */ public enum CRCRMutator4
/*     */   implements MethodMutatorFactory
/*     */ {
/*  36 */   CRCR_MUTATOR4;
/*     */   
/*     */   private CRCRMutator4() {}
/*     */   
/*     */   private final class CRCRVisitor4 extends MethodVisitor {
/*     */     private final MutationContext context;
/*     */     
/*  43 */     public CRCRVisitor4(MutationContext context, MethodVisitor delegateVisitor) { super(Opcodes.ASM4, delegateVisitor);
/*  44 */       this.context = context;
/*     */     }
/*     */     
/*     */     private void mutate(Double constant)
/*     */     {
/*  49 */       Double replacement = Double.valueOf(constant.doubleValue() + 1.0D);
/*     */       
/*  51 */       if ((constant.doubleValue() != 0.0D) && (constant.doubleValue() != -2.0D) && (constant.doubleValue() != -1.0D) && (shouldMutate(constant, replacement)))
/*     */       {
/*  53 */         translateToByteCode(replacement);
/*     */       } else {
/*  55 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Float constant)
/*     */     {
/*  61 */       Float replacement = Float.valueOf(constant.floatValue() + 1.0F);
/*     */       
/*  63 */       if ((constant.floatValue() != 0.0F) && (constant.floatValue() != -2.0F) && (constant.floatValue() != -1.0F) && (shouldMutate(constant, replacement))) {
/*  64 */         translateToByteCode(replacement);
/*     */       } else {
/*  66 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Integer constant) {
/*  71 */       Integer replacement = Integer.valueOf(constant.intValue() + 1);
/*     */       
/*  73 */       if ((constant.intValue() != 0) && (constant.intValue() != -2) && (constant.intValue() != -1) && (shouldMutate(constant, replacement))) {
/*  74 */         translateToByteCode(replacement);
/*     */       } else {
/*  76 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void mutate(Long constant)
/*     */     {
/*  82 */       Long replacement = Long.valueOf(constant.longValue() + 1L);
/*     */       
/*  84 */       if ((constant.longValue() != 0L) && (constant.longValue() != -2L) && (constant.longValue() != -1L) && (shouldMutate(constant, replacement))) {
/*  85 */         translateToByteCode(replacement);
/*     */       } else {
/*  87 */         translateToByteCode(constant);
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private void mutate(Number constant)
/*     */     {
/*  94 */       if ((constant instanceof Integer)) {
/*  95 */         mutate((Integer)constant);
/*  96 */       } else if ((constant instanceof Long)) {
/*  97 */         mutate((Long)constant);
/*  98 */       } else if ((constant instanceof Float)) {
/*  99 */         mutate((Float)constant);
/* 100 */       } else if ((constant instanceof Double)) {
/* 101 */         mutate((Double)constant);
/*     */       }
/*     */       else {
/* 104 */         throw new PitError("Unsupported subtype of Number found:" + constant.getClass());
/*     */       }
/*     */     }
/*     */     
/*     */ 
/*     */     private <T extends Number> boolean shouldMutate(T constant, T replacement)
/*     */     {
/* 111 */       MutationIdentifier mutationId = this.context.registerMutation(CRCRMutator4.this, "Substituted " + constant + " with " + replacement);
/*     */       
/*     */ 
/*     */ 
/* 115 */       return this.context.shouldMutate(mutationId);
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Double constant) {
/* 119 */       if (constant.doubleValue() == 0.0D) {
/* 120 */         super.visitInsn(14);
/* 121 */       } else if (constant.doubleValue() == 1.0D) {
/* 122 */         super.visitInsn(15);
/*     */       } else {
/* 124 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Float constant) {
/* 129 */       if (constant.floatValue() == 0.0F) {
/* 130 */         super.visitInsn(11);
/* 131 */       } else if (constant.floatValue() == 1.0F) {
/* 132 */         super.visitInsn(12);
/* 133 */       } else if (constant.floatValue() == 2.0F) {
/* 134 */         super.visitInsn(13);
/*     */       } else {
/* 136 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Integer constant) {
/* 141 */       switch (constant.intValue()) {
/*     */       case -1: 
/* 143 */         super.visitInsn(2);
/* 144 */         break;
/*     */       case 0: 
/* 146 */         super.visitInsn(3);
/* 147 */         break;
/*     */       case 1: 
/* 149 */         super.visitInsn(4);
/* 150 */         break;
/*     */       case 2: 
/* 152 */         super.visitInsn(5);
/* 153 */         break;
/*     */       case 3: 
/* 155 */         super.visitInsn(6);
/* 156 */         break;
/*     */       case 4: 
/* 158 */         super.visitInsn(7);
/* 159 */         break;
/*     */       case 5: 
/* 161 */         super.visitInsn(8);
/* 162 */         break;
/*     */       default: 
/* 164 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */     
/*     */     private void translateToByteCode(Long constant)
/*     */     {
/* 170 */       if (constant.longValue() == 0L) {
/* 171 */         super.visitInsn(9);
/* 172 */       } else if (constant.longValue() == 1L) {
/* 173 */         super.visitInsn(10);
/*     */       } else {
/* 175 */         super.visitLdcInsn(constant);
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
/* 190 */       switch (opcode) {
/*     */       case 2: 
/* 192 */         return Integer.valueOf(-1);
/*     */       case 3: 
/* 194 */         return Integer.valueOf(0);
/*     */       case 4: 
/* 196 */         return Integer.valueOf(1);
/*     */       case 5: 
/* 198 */         return Integer.valueOf(2);
/*     */       case 6: 
/* 200 */         return Integer.valueOf(3);
/*     */       case 7: 
/* 202 */         return Integer.valueOf(4);
/*     */       case 8: 
/* 204 */         return Integer.valueOf(5);
/*     */       case 9: 
/* 206 */         return Long.valueOf(0L);
/*     */       case 10: 
/* 208 */         return Long.valueOf(1L);
/*     */       case 11: 
/* 210 */         return Float.valueOf(0.0F);
/*     */       case 12: 
/* 212 */         return Float.valueOf(1.0F);
/*     */       case 13: 
/* 214 */         return Float.valueOf(2.0F);
/*     */       case 14: 
/* 216 */         return Double.valueOf(0.0D);
/*     */       case 15: 
/* 218 */         return Double.valueOf(1.0D);
/*     */       }
/* 220 */       return null;
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
/* 232 */       Number inlineConstant = translateToNumber(opcode);
/*     */       
/* 234 */       if (inlineConstant == null) {
/* 235 */         super.visitInsn(opcode);
/* 236 */         return;
/*     */       }
/*     */       
/* 239 */       mutate(inlineConstant);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     public void visitIntInsn(int opcode, int operand)
/*     */     {
/* 249 */       if ((opcode == 16) || (opcode == 17)) {
/* 250 */         mutate(Integer.valueOf(operand));
/*     */       } else {
/* 252 */         super.visitIntInsn(opcode, operand);
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
/* 264 */       if ((constant instanceof Number)) {
/* 265 */         mutate((Number)constant);
/*     */       } else {
/* 267 */         super.visitLdcInsn(constant);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */   public MethodVisitor create(MutationContext context, MethodInfo methodInfo, MethodVisitor methodVisitor)
/*     */   {
/* 275 */     return new CRCRVisitor4(context, methodVisitor);
/*     */   }
/*     */   
/*     */   public String getGloballyUniqueId() {
/* 279 */     return getClass().getName();
/*     */   }
/*     */   
/*     */   public String toString()
/*     */   {
/* 284 */     return "CRCR_MUTATOR4";
/*     */   }
/*     */   
/*     */   public String getName() {
/* 288 */     return toString();
/*     */   }
/*     */ }


