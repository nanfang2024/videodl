package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Context.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CancellableFlowImpl$collect$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $collector;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl$collect$2(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.$collector = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) {
            cancellableFlowImpl$collect$2$emit$1 = (kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1) continuation;
            if ((cancellableFlowImpl$collect$2$emit$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                cancellableFlowImpl$collect$2$emit$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = cancellableFlowImpl$collect$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = cancellableFlowImpl$collect$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.JobKt.ensureActive(cancellableFlowImpl$collect$2$emit$1.getContext());
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = this.$collector;
                    cancellableFlowImpl$collect$2$emit$1.label = 1;
                    if (flowCollector.emit(t, cancellableFlowImpl$collect$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        cancellableFlowImpl$collect$2$emit$1 = new kotlinx.coroutines.flow.CancellableFlowImpl$collect$2$emit$1(this, continuation);
        java.lang.Object obj2 = cancellableFlowImpl$collect$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = cancellableFlowImpl$collect$2$emit$1.label;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
