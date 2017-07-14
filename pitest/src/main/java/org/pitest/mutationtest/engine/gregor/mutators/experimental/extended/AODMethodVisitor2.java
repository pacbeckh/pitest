/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*     */ 
/*     */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*     */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*     */ import org.objectweb.asm.MethodVisitor;
/*     */ import org.objectweb.asm.Type;
/*     */ import org.objectweb.asm.commons.LocalVariablesSorter;
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
/*     */ class AODMethodVisitor2
/*     */   extends LocalVariablesSorter
/*     */ {
/*     */   private final MethodMutatorFactory factory;
/*     */   private final MutationContext context;
/*     */   private final MethodInfo info;
/*     */   
/*     */   public AODMethodVisitor2(MethodMutatorFactory factory, MutationContext context, MethodInfo info, MethodVisitor delegateMethodVisitor)
/*     */   {
/*  52 */     super(327680, info.getAccess(), info.getMethodDescriptor(), delegateMethodVisitor);
/*  53 */     this.factory = factory;
/*  54 */     this.context = context;
/*  55 */     this.info = info;
/*     */   }
/*     */   
/*     */   private boolean shouldMutate() {
/*  59 */     if (this.info.isGeneratedEnumMethod()) {
/*  60 */       return false;
/*     */     }
/*  62 */     MutationIdentifier newId = this.context.registerMutation(this.factory, "Replace expression by second member");
/*     */     
/*  64 */     return this.context.shouldMutate(newId);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void visitInsn(int opcode)
/*     */   {
/*  71 */     switch (opcode) {
/*     */     case 96: 
/*     */     case 100: 
/*     */     case 104: 
/*     */     case 108: 
/*     */     case 112: 
/*  77 */       if (shouldMutate()) {
/*  78 */         int storage = newLocal(Type.INT_TYPE);
/*  79 */         this.mv.visitVarInsn(54, storage);
/*  80 */         this.mv.visitInsn(87);
/*  81 */         this.mv.visitVarInsn(21, storage);
/*     */ 
/*     */ 
/*     */       }
/*     */       else
/*     */       {
/*     */ 
/*  88 */         this.mv.visitInsn(opcode);
/*     */       }
/*  90 */       break;
/*     */     case 98: 
/*     */     case 102: 
/*     */     case 106: 
/*     */     case 110: 
/*     */     case 114: 
/*  96 */       if (shouldMutate()) {
/*  97 */         int storage = newLocal(Type.FLOAT_TYPE);
/*  98 */         this.mv.visitVarInsn(56, storage);
/*  99 */         this.mv.visitInsn(87);
/* 100 */         this.mv.visitVarInsn(23, storage);
/*     */       } else {
/* 102 */         this.mv.visitInsn(opcode);
/*     */       }
/* 104 */       break;
/*     */     case 97: 
/*     */     case 101: 
/*     */     case 105: 
/*     */     case 109: 
/*     */     case 113: 
/* 110 */       if (shouldMutate()) {
/* 111 */         int storage = newLocal(Type.LONG_TYPE);
/* 112 */         this.mv.visitVarInsn(55, storage);
/* 113 */         this.mv.visitInsn(88);
/* 114 */         this.mv.visitVarInsn(22, storage);
/*     */       } else {
/* 116 */         this.mv.visitInsn(opcode);
/*     */       }
/* 118 */       break;
/*     */     case 99: 
/*     */     case 103: 
/*     */     case 107: 
/*     */     case 111: 
/*     */     case 115: 
/* 124 */       if (shouldMutate()) {
/* 125 */         int storage = newLocal(Type.DOUBLE_TYPE);
/* 126 */         this.mv.visitVarInsn(57, storage);
/* 127 */         this.mv.visitInsn(88);
/* 128 */         this.mv.visitVarInsn(24, storage);
/*     */       } else {
/* 130 */         this.mv.visitInsn(opcode);
/*     */       }
/* 132 */       break;
/*     */     default: 
/* 134 */       this.mv.visitInsn(opcode);
/*     */     }
/*     */   }
/*     */ }


