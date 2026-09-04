package kotlinx.coroutines.flow;

/* compiled from: Flow.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "()V", "collect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectSafely", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public abstract class AbstractFlow<T> implements kotlinx.coroutines.flow.Flow<T>, kotlinx.coroutines.flow.CancellableFlow<T> {
    public abstract java.lang.Object collectSafely(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.AbstractFlow$collect$1 abstractFlow$collect$1;
        int i;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        if (continuation instanceof kotlinx.coroutines.flow.AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (kotlinx.coroutines.flow.AbstractFlow$collect$1) continuation;
            if ((abstractFlow$collect$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                abstractFlow$collect$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = abstractFlow$collect$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = abstractFlow$collect$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.internal.SafeCollector safeCollector2 = new kotlinx.coroutines.flow.internal.SafeCollector(flowCollector, abstractFlow$collect$1.getContext());
                    try {
                        abstractFlow$collect$1.L$0 = safeCollector2;
                        abstractFlow$collect$1.label = 1;
                        if (collectSafely(safeCollector2, abstractFlow$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        safeCollector = safeCollector2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        safeCollector = safeCollector2;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safeCollector = (kotlinx.coroutines.flow.internal.SafeCollector) abstractFlow$collect$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        safeCollector.releaseIntercepted();
                        throw th;
                    }
                }
                safeCollector.releaseIntercepted();
                return kotlin.Unit.INSTANCE;
            }
        }
        abstractFlow$collect$1 = new kotlinx.coroutines.flow.AbstractFlow$collect$1(this, continuation);
        java.lang.Object obj2 = abstractFlow$collect$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = abstractFlow$collect$1.label;
        if (i != 0) {
        }
        safeCollector.releaseIntercepted();
        return kotlin.Unit.INSTANCE;
    }
}
