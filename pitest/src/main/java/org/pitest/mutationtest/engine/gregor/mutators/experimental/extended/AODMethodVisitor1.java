/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*     */ 
/*     */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*     */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
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
/*     */ class AODMethodVisitor1
/*     */   extends MethodVisitor
/*     */ {
/*     */   private final MethodMutatorFactory factory;
/*     */   private final MutationContext context;
/*     */   private final MethodInfo info;
/*     */   
/*     */   public AODMethodVisitor1(MethodMutatorFactory factory, MutationContext context, MethodInfo info, MethodVisitor delegateMethodVisitor)
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
/*  60 */     MutationIdentifier newId = this.context.registerMutation(this.factory, "Replace expression by first member");
/*     */     
/*  62 */     return this.context.shouldMutate(newId);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void visitInsn(int opcode)
/*     */   {
/*  69 */     switch (opcode) {
/*     */     case 96: 
/*     */     case 98: 
/*     */     case 100: 
/*     */     case 102: 
/*     */     case 104: 
/*     */     case 106: 
/*     */     case 108: 
/*     */     case 110: 
/*     */     case 112: 
/*     */     case 114: 
/*  80 */       if (shouldMutate()) {
/*  81 */         this.mv.visitInsn(87);
/*     */       } else {
/*  83 */         this.mv.visitInsn(opcode);
/*     */       }
/*  85 */       break;
/*     */     case 97: 
/*     */     case 99: 
/*     */     case 101: 
/*     */     case 103: 
/*     */     case 105: 
/*     */     case 107: 
/*     */     case 109: 
/*     */     case 111: 
/*     */     case 113: 
/*     */     case 115: 
/*  96 */       if (shouldMutate()) {
/*  97 */         this.mv.visitInsn(88);
/*     */       }
/*     */       else {
/* 100 */         this.mv.visitInsn(opcode);
/*     */       }
/* 102 */       break;
/*     */     default: 
/* 104 */       this.mv.visitInsn(opcode);
/*     */     }
/*     */   }
/*     */ }


