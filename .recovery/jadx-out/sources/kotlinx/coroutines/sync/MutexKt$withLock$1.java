package kotlinx.coroutines.sync;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Mutex.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {125}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MutexKt$withLock$1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutexKt$withLock$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.MutexKt$withLock$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.sync.MutexKt.withLock(null, null, null, this);
    }
}
