package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {155}, m = "last", n = {"result"}, s = {"L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlowKt__ReduceKt$last$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__ReduceKt$last$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.flow.FlowKt.last(null, this);
    }
}
