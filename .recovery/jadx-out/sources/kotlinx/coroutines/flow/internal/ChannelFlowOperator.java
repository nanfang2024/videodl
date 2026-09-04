package kotlinx.coroutines.flow.internal;

/* compiled from: ChannelFlow.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public abstract class ChannelFlowOperator<S, T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    protected final kotlinx.coroutines.flow.Flow<S> flow;

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return collect$suspendImpl((kotlinx.coroutines.flow.internal.ChannelFlowOperator) this, (kotlinx.coroutines.flow.FlowCollector) flowCollector, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return collectTo$suspendImpl(this, producerScope, continuation);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract java.lang.Object flowCollect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowOperator(kotlinx.coroutines.flow.Flow<? extends S> flow, kotlin.coroutines.CoroutineContext coroutineContext, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.flow = flow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object collectWithContextUndispatched(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.CoroutineContext coroutineContext, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContextUndispatched$default = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(coroutineContext, kotlinx.coroutines.flow.internal.ChannelFlowKt.access$withUndispatchedContextCollector(flowCollector, continuation.getContext()), null, new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation, 4, null);
        return withContextUndispatched$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContextUndispatched$default : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ <S, T> java.lang.Object collectTo$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> channelFlowOperator, kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object flowCollect = channelFlowOperator.flowCollect(new kotlinx.coroutines.flow.internal.SendingCollector(producerScope), continuation);
        return flowCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flowCollect : kotlin.Unit.INSTANCE;
    }

    static /* synthetic */ <S, T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> channelFlowOperator, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (channelFlowOperator.capacity == -3) {
            kotlin.coroutines.CoroutineContext context = continuation.getContext();
            kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(context, channelFlowOperator.context);
            if (kotlin.jvm.internal.Intrinsics.areEqual(newCoroutineContext, context)) {
                java.lang.Object flowCollect = channelFlowOperator.flowCollect(flowCollector, continuation);
                return flowCollect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flowCollect : kotlin.Unit.INSTANCE;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(newCoroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE), context.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE))) {
                java.lang.Object collectWithContextUndispatched = channelFlowOperator.collectWithContextUndispatched(flowCollector, newCoroutineContext, continuation);
                return collectWithContextUndispatched == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collectWithContextUndispatched : kotlin.Unit.INSTANCE;
            }
        }
        java.lang.Object collect = super.collect(flowCollector, continuation);
        return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public java.lang.String toString() {
        return this.flow + " -> " + super.toString();
    }
}
