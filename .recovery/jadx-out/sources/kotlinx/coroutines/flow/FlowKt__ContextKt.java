package kotlinx.coroutines.flow;

/* compiled from: Context.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¢\u0006\u0002\b\u0004\u001a(\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0006\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u00062\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u000f"}, d2 = {"checkFlowContext", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "checkFlowContext$FlowKt__ContextKt", "buffer", "Lkotlinx/coroutines/flow/Flow;", "T", "capacity", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "cancellable", "conflate", "flowOn", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class FlowKt__ContextKt {
    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow flow, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = kotlinx.coroutines.channels.BufferOverflow.SUSPEND;
        }
        return kotlinx.coroutines.flow.FlowKt.buffer(flow, i, bufferOverflow);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> buffer(kotlinx.coroutines.flow.Flow<? extends T> flow, int i, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        if (i < 0 && i != -2 && i != -1) {
            throw new java.lang.IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i).toString());
        }
        if (i == -1 && bufferOverflow != kotlinx.coroutines.channels.BufferOverflow.SUSPEND) {
            throw new java.lang.IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            bufferOverflow = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST;
            i = 0;
        }
        int i2 = i;
        kotlinx.coroutines.channels.BufferOverflow bufferOverflow2 = bufferOverflow;
        return flow instanceof kotlinx.coroutines.flow.internal.FusibleFlow ? kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default((kotlinx.coroutines.flow.internal.FusibleFlow) flow, null, i2, bufferOverflow2, 1, null) : new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(flow, null, i2, bufferOverflow2, 2, null);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.4.0, binary compatibility with earlier versions")
    public static final /* synthetic */ kotlinx.coroutines.flow.Flow buffer(kotlinx.coroutines.flow.Flow flow, int i) {
        kotlinx.coroutines.flow.Flow buffer$default;
        buffer$default = buffer$default(flow, i, null, 2, null);
        return buffer$default;
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow buffer$default(kotlinx.coroutines.flow.Flow flow, int i, int i2, java.lang.Object obj) {
        kotlinx.coroutines.flow.Flow buffer;
        if ((i2 & 1) != 0) {
            i = -2;
        }
        buffer = buffer(flow, i);
        return buffer;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> conflate(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        kotlinx.coroutines.flow.Flow<T> buffer$default;
        buffer$default = buffer$default(flow, -1, null, 2, null);
        return buffer$default;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> flowOn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.CoroutineContext coroutineContext) {
        checkFlowContext$FlowKt__ContextKt(coroutineContext);
        return kotlin.jvm.internal.Intrinsics.areEqual(coroutineContext, kotlin.coroutines.EmptyCoroutineContext.INSTANCE) ? flow : flow instanceof kotlinx.coroutines.flow.internal.FusibleFlow ? kotlinx.coroutines.flow.internal.FusibleFlow.DefaultImpls.fuse$default((kotlinx.coroutines.flow.internal.FusibleFlow) flow, coroutineContext, 0, null, 6, null) : new kotlinx.coroutines.flow.internal.ChannelFlowOperatorImpl(flow, coroutineContext, 0, null, 12, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> cancellable(kotlinx.coroutines.flow.Flow<? extends T> flow) {
        return flow instanceof kotlinx.coroutines.flow.CancellableFlow ? flow : new kotlinx.coroutines.flow.CancellableFlowImpl(flow);
    }

    private static final void checkFlowContext$FlowKt__ContextKt(kotlin.coroutines.CoroutineContext coroutineContext) {
        if (coroutineContext.get(kotlinx.coroutines.Job.INSTANCE) != null) {
            throw new java.lang.IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
        }
    }
}
