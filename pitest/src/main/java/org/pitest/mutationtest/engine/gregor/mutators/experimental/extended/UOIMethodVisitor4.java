/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
import org.objectweb.asm.MethodVisitor;
/*     */ 
/*     */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*     */ import org.pitest.mutationtest.engine.gregor.MutationContext;
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
/*     */ class UOIMethodVisitor4
/*     */   extends MethodVisitor
/*     */ {
/*     */   private final MethodMutatorFactory factory;
/*     */   private final MutationContext context;
/*     */   private final MethodInfo info;
/*     */   
/*     */   public UOIMethodVisitor4(MethodMutatorFactory factory, MutationContext context, MethodInfo info, MethodVisitor delegateMethodVisitor)
/*     */   {
/*  50 */     super(327680, delegateMethodVisitor);
/*  51 */     this.factory = factory;
/*  52 */     this.context = context;
/*  53 */     this.info = info;
/*     */   }
/*     */   
/*     */   private boolean shouldMutate() {
/*  57 */     if (this.info.isGeneratedEnumMethod()) {
/*  58 */       return false;
/*     */     }
/*  60 */     MutationIdentifier newId = this.context.registerMutation(this.factory, "Insert increment (++a)");
/*     */     
/*  62 */     return this.context.shouldMutate(newId);
/*     */   }
/*     */   
/*     */ 
/*     */   public void visitVarInsn(int opcode, int var)
/*     */   {
/*  68 */     switch (opcode) {
/*     */     case 21: 
/*  70 */       if (shouldMutate()) {
/*  71 */         this.mv.visitIincInsn(var, -1);
/*  72 */         this.mv.visitVarInsn(opcode, var);
/*     */       } else {
/*  74 */         this.mv.visitVarInsn(opcode, var);
/*     */       }
/*  76 */       break;
/*     */     case 23: 
/*  78 */       if (shouldMutate()) {
/*  79 */         this.mv.visitVarInsn(opcode, var);
/*  80 */         this.mv.visitInsn(12);
/*  81 */         this.mv.visitInsn(102);
/*  82 */         this.mv.visitVarInsn(56, var);
/*  83 */         this.mv.visitVarInsn(opcode, var);
/*     */       } else {
/*  85 */         this.mv.visitVarInsn(opcode, var);
/*     */       }
/*  87 */       break;
/*     */     case 22: 
/*  89 */       if (shouldMutate()) {
/*  90 */         this.mv.visitVarInsn(opcode, var);
/*  91 */         this.mv.visitInsn(10);
/*  92 */         this.mv.visitInsn(101);
/*  93 */         this.mv.visitVarInsn(55, var);
/*  94 */         this.mv.visitVarInsn(opcode, var);
/*     */       } else {
/*  96 */         this.mv.visitVarInsn(opcode, var);
/*     */       }
/*  98 */       break;
/*     */     case 24: 
/* 100 */       if (shouldMutate()) {
/* 101 */         this.mv.visitVarInsn(opcode, var);
/* 102 */         this.mv.visitInsn(15);
/* 103 */         this.mv.visitInsn(103);
/* 104 */         this.mv.visitVarInsn(57, var);
/* 105 */         this.mv.visitVarInsn(opcode, var);
/*     */       } else {
/* 107 */         this.mv.visitVarInsn(opcode, var);
/*     */       }
/* 109 */       break;
/*     */     default: 
/* 111 */       this.mv.visitVarInsn(opcode, var);
/*     */     }
/*     */   }
/*     */ }


