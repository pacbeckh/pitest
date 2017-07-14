/*    */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*    */ 
/*    */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*    */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*    */ import org.objectweb.asm.MethodVisitor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class OBBNMethodVisitor2
/*    */   extends MethodVisitor
/*    */ {
/*    */   private final MethodMutatorFactory factory;
/*    */   private final MutationContext context;
/*    */   private final MethodInfo info;
/*    */   
/*    */   public OBBNMethodVisitor2(MethodMutatorFactory factory, MutationContext context, MethodInfo info, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 50 */     super(327680, delegateMethodVisitor);
/* 51 */     this.factory = factory;
/* 52 */     this.context = context;
/* 53 */     this.info = info;
/*    */   }
/*    */   
/*    */   private boolean shouldMutate() {
/* 57 */     if (this.info.isGeneratedEnumMethod()) {
/* 58 */       return false;
/*    */     }
/* 60 */     MutationIdentifier newId = this.context.registerMutation(this.factory, "Replaced expression by first member");
/*    */     
/* 62 */     return this.context.shouldMutate(newId);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void visitInsn(int opcode)
/*    */   {
/* 69 */     switch (opcode) {
/*    */     case 126: 
/*    */     case 128: 
/* 72 */       if (shouldMutate()) {
/* 73 */         this.mv.visitInsn(87);
/*    */       } else {
/* 75 */         this.mv.visitInsn(opcode);
/*    */       }
/* 77 */       break;
/*    */     case 97: 
/*    */     case 129: 
/* 80 */       if (shouldMutate()) {
/* 81 */         this.mv.visitInsn(88);
/*    */       }
/*    */       else {
/* 84 */         this.mv.visitInsn(opcode);
/*    */       }
/* 86 */       break;
/*    */     default: 
/* 88 */       this.mv.visitInsn(opcode);
/*    */     }
/*    */   }
/*    */ }


