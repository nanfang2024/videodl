package kotlinx.coroutines.selects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WhileSelect.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {41}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class WhileSelectKt$whileSelect$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WhileSelectKt$whileSelect$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.selects.WhileSelectKt.whileSelect(null, this);
    }
}
