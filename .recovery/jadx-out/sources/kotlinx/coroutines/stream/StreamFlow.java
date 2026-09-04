package kotlinx.coroutines.stream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Stream.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u001f\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\fR\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", "T", "Lkotlinx/coroutines/flow/Flow;", "stream", "Ljava/util/stream/Stream;", "(Ljava/util/stream/Stream;)V", "consumed", "Lkotlinx/atomicfu/AtomicBoolean;", "collect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class StreamFlow<T> implements kotlinx.coroutines.flow.Flow<T> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumed$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.stream.StreamFlow.class, "consumed");

    @kotlin.jvm.Volatile
    private volatile int consumed = 0;
    private final java.util.stream.Stream<T> stream;

    public StreamFlow(java.util.stream.Stream<T> stream) {
        this.stream = stream;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:11:0x0032, B:14:0x0057, B:16:0x005d), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.stream.StreamFlow$collect$1 streamFlow$collect$1;
        int i;
        kotlinx.coroutines.stream.StreamFlow<T> streamFlow;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        java.util.Iterator<T> it;
        if (continuation instanceof kotlinx.coroutines.stream.StreamFlow$collect$1) {
            streamFlow$collect$1 = (kotlinx.coroutines.stream.StreamFlow$collect$1) continuation;
            if ((streamFlow$collect$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                streamFlow$collect$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = streamFlow$collect$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = streamFlow$collect$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!consumed$FU.compareAndSet(this, 0, 1)) {
                        throw new java.lang.IllegalStateException("Stream.consumeAsFlow can be collected only once".toString());
                    }
                    try {
                        streamFlow = this;
                        flowCollector2 = flowCollector;
                        it = this.stream.iterator();
                    } catch (java.lang.Throwable th) {
                        th = th;
                        streamFlow = this;
                        streamFlow.stream.close();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) streamFlow$collect$1.L$2;
                    kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) streamFlow$collect$1.L$1;
                    streamFlow = (kotlinx.coroutines.stream.StreamFlow) streamFlow$collect$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        flowCollector2 = flowCollector3;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        streamFlow.stream.close();
                        throw th;
                    }
                }
                while (it.hasNext()) {
                    T next = it.next();
                    streamFlow$collect$1.L$0 = streamFlow;
                    streamFlow$collect$1.L$1 = flowCollector2;
                    streamFlow$collect$1.L$2 = it;
                    streamFlow$collect$1.label = 1;
                    if (flowCollector2.emit(next, streamFlow$collect$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                streamFlow.stream.close();
                return kotlin.Unit.INSTANCE;
            }
        }
        streamFlow$collect$1 = new kotlinx.coroutines.stream.StreamFlow$collect$1(this, continuation);
        java.lang.Object obj2 = streamFlow$collect$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = streamFlow$collect$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        streamFlow.stream.close();
        return kotlin.Unit.INSTANCE;
    }
}
