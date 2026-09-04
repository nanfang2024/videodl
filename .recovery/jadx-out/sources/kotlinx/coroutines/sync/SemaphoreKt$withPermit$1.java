package kotlinx.coroutines.sync;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Semaphore.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {86}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class SemaphoreKt$withPermit$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SemaphoreKt$withPermit$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.SemaphoreKt$withPermit$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.sync.SemaphoreKt.withPermit(null, null, this);
    }
}
