package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Timeout.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {104}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class TimeoutKt$withTimeoutOrNull$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TimeoutKt$withTimeoutOrNull$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.TimeoutKt$withTimeoutOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.TimeoutKt.withTimeoutOrNull(0L, null, this);
    }
}
