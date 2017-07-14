/*     */ package org.pitest.mutationtest.engine.gregor.mutators.experimental.extended;

/*     */
/*     */ import org.pitest.mutationtest.engine.MutationIdentifier;
/*     */ import org.pitest.mutationtest.engine.gregor.ClassInfo;
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
/*     */ class ABSMethodVisitor/*     */ extends MethodVisitor
/*     */ {
    /*     */ private final MethodMutatorFactory factory;
    /*     */ private final MutationContext context;
    /*     */ private final MethodInfo info;

    /*     */
    /*     */ public ABSMethodVisitor(MethodMutatorFactory factory, MutationContext context, MethodInfo info,
        MethodVisitor delegateMethodVisitor)
    /*     */ {
        /* 50 */ super(327680, delegateMethodVisitor);
        /* 51 */ this.factory = factory;
        /* 52 */ this.context = context;
        /* 53 */ this.info = info;
        /*     */ }

    /*     */
    /*     */ private boolean shouldMutate() {
        /* 57 */ if (this.info.isGeneratedEnumMethod()) {
            /* 58 */ return false;
            /*     */ }
        /* 60 */ MutationIdentifier newId = this.context.registerMutation(this.factory, "+/-Insert abs");
        /*     */
        /* 62 */ return this.context.shouldMutate(newId);
        /*     */ }

    /*     */
    /*     */
    /*     */ public void visitVarInsn(int opcode, int var)
    /*     */ {
        /* 68 */ switch (opcode) {
        /*     */ case 21:
            /* 70 */ if (shouldMutate()) {
                /* 71 */ this.mv.visitVarInsn(opcode, var);
                /* 72 */ this.mv.visitInsn(116);
                /*     */ } else {
                /* 74 */ this.mv.visitVarInsn(opcode, var);
                /*     */ }
            /* 76 */ break;
        /*     */ case 23:
            /* 78 */ if (shouldMutate()) {
                /* 79 */ this.mv.visitVarInsn(opcode, var);
                /* 80 */ this.mv.visitInsn(118);
                /*     */ } else {
                /* 82 */ this.mv.visitVarInsn(opcode, var);
                /*     */ }
            /* 84 */ break;
        /*     */ case 22:
            /* 86 */ if (shouldMutate()) {
                /* 87 */ this.mv.visitVarInsn(opcode, var);
                /* 88 */ this.mv.visitInsn(117);
                /*     */ } else {
                /* 90 */ this.mv.visitVarInsn(opcode, var);
                /*     */ }
            /* 92 */ break;
        /*     */ case 24:
            /* 94 */ if (shouldMutate()) {
                /* 95 */ this.mv.visitVarInsn(opcode, var);
                /* 96 */ this.mv.visitInsn(119);
                /*     */ } else {
                /* 98 */ this.mv.visitVarInsn(opcode, var);
                /*     */ }
            /* 100 */ break;
        /*     */ default:
            /* 102 */ super.visitVarInsn(opcode, var);
            /*     */ }
        /*     */ }
    /*     */ }
