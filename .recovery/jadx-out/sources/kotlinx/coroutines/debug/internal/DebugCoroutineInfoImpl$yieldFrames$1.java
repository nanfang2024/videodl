package kotlinx.coroutines.debug.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DebugCoroutineInfoImpl.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl", f = "DebugCoroutineInfoImpl.kt", i = {0, 0, 0}, l = {171}, m = "yieldFrames", n = {"this", "$this$yieldFrames", "frame"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DebugCoroutineInfoImpl$yieldFrames$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugCoroutineInfoImpl$yieldFrames$1(kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1> continuation) {
        super(continuation);
        this.this$0 = debugCoroutineInfoImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object yieldFrames;
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        yieldFrames = this.this$0.yieldFrames(null, null, this);
        return yieldFrames;
    }
}
