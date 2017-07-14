/*    */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;
/*    */ 
/*    */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodInfo;
/*    */ import org.pitest.mutationtest.engine.gregor.MethodMutatorFactory;
/*    */ import org.pitest.mutationtest.engine.gregor.MutationContext;
/*    */ import org.objectweb.asm.MethodVisitor;
/*    */ import org.objectweb.asm.Type;
/*    */ import org.objectweb.asm.commons.LocalVariablesSorter;
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
/*    */ class OBBNMethodVisitor3
/*    */   extends LocalVariablesSorter
/*    */ {
/*    */   private final MethodMutatorFactory factory;
/*    */   private final MutationContext context;
/*    */   private final MethodInfo info;
/*    */   
/*    */   public OBBNMethodVisitor3(MethodMutatorFactory factory, MutationContext context, MethodInfo info, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 52 */     super(327680, info.getAccess(), info.getMethodDescriptor(), delegateMethodVisitor);
/* 53 */     this.factory = factory;
/* 54 */     this.context = context;
/* 55 */     this.info = info;
/*    */   }
/*    */   
/*    */   private boolean shouldMutate() {
/* 59 */     if (this.info.isGeneratedEnumMethod()) {
/* 60 */       return false;
/*    */     }
/* 62 */     MutationIdentifier newId = this.context.registerMutation(this.factory, "Replace expression by second member");
/*    */     
/* 64 */     return this.context.shouldMutate(newId);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */   public void visitInsn(int opcode)
/*    */   {
/* 71 */     switch (opcode) {
/*    */     case 126: 
/*    */     case 128: 
/* 74 */       if (shouldMutate()) {
/* 75 */         int storage = newLocal(Type.INT_TYPE);
/* 76 */         this.mv.visitVarInsn(54, storage);
/* 77 */         this.mv.visitInsn(87);
/* 78 */         this.mv.visitVarInsn(21, storage);
/*    */       } else {
/* 80 */         this.mv.visitInsn(opcode);
/*    */       }
/* 82 */       break;
/*    */     case 97: 
/*    */     case 129: 
/* 85 */       if (shouldMutate()) {
/* 86 */         int storage = newLocal(Type.LONG_TYPE);
/* 87 */         this.mv.visitVarInsn(55, storage);
/* 88 */         this.mv.visitInsn(88);
/* 89 */         this.mv.visitVarInsn(22, storage);
/*    */       } else {
/* 91 */         this.mv.visitInsn(opcode);
/*    */       }
/* 93 */       break;
/*    */     default: 
/* 95 */       this.mv.visitInsn(opcode);
/*    */     }
/*    */   }
/*    */ }


