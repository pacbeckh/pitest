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
/*    */ class ProutMethodVisitor
/*    */   extends MethodVisitor
/*    */ {
/*    */   private final MethodMutatorFactory factory;
/*    */   private final MutationContext context;
/*    */   private final MethodInfo info;
/*    */   
/*    */   public ProutMethodVisitor(MethodMutatorFactory factory, MutationContext context, MethodInfo info, MethodVisitor delegateMethodVisitor)
/*    */   {
/* 50 */     super(327680, delegateMethodVisitor);
/* 51 */     this.factory = factory;
/* 52 */     this.context = context;
/* 53 */     this.info = info;
/*    */   }
/*    */   
/*    */   public void visitIincInsn(int var, int increment)
/*    */   {
/* 58 */     MutationIdentifier newId = this.context.registerMutation(this.factory, "Removed increment " + increment);
/*    */     
/* 60 */     if (this.context.shouldMutate(newId)) {
/* 61 */       this.mv.visitInsn(0);
/*    */     } else {
/* 63 */       this.mv.visitIincInsn(var, increment);
/*    */     }
/*    */   }
/*    */   
/*    */   public void visitVarInsn(int opcode, int var) {
/* 68 */     if (this.info.isGeneratedEnumMethod()) {
/* 69 */       MutationIdentifier localMutationIdentifier = this.context.registerMutation(this.factory, "Insert increment (a++)");
/*    */     }
/*    */     
/*    */ 
/* 73 */     super.visitVarInsn(opcode, var);
/*    */   }
/*    */ }


