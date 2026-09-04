package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a$\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(flowCollector, receiveChannel, true, continuation);
        return emitAllImpl$FlowKt__ChannelsKt == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAllImpl$FlowKt__ChannelsKt : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007e A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #0 {all -> 0x009c, blocks: (B:12:0x0037, B:14:0x0061, B:19:0x0076, B:21:0x007e, B:32:0x0053, B:34:0x005d), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.FlowCollector, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0090 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<? extends T> it;
        kotlinx.coroutines.channels.ChannelIterator<? extends T> channelIterator;
        ?? r2;
        java.lang.Object hasNext;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) continuation;
                if ((flowKt__ChannelsKt$emitAllImpl$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                    java.lang.Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = flowKt__ChannelsKt$emitAllImpl$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowKt.ensureActive(flowCollector);
                        it = receiveChannel.iterator();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext == coroutine_suspended) {
                        }
                    } else if (i == 1) {
                        z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        r2 = flowCollector2;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        channelIterator = (kotlinx.coroutines.channels.ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector4 = flowCollector3;
                        it = channelIterator;
                        flowCollector = flowCollector4;
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = flowCollector;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r2 = flowCollector;
                        channelIterator = it;
                        obj = hasNext;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            T next = channelIterator.next();
                            flowKt__ChannelsKt$emitAllImpl$1.L$0 = r2;
                            flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                            flowKt__ChannelsKt$emitAllImpl$1.L$2 = channelIterator;
                            flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                            flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                            java.lang.Object emit = r2.emit(next, flowKt__ChannelsKt$emitAllImpl$1);
                            flowCollector4 = r2;
                            if (emit == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            it = channelIterator;
                            flowCollector = flowCollector4;
                            flowKt__ChannelsKt$emitAllImpl$1.L$0 = flowCollector;
                            flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                            flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                            flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z;
                            flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                            hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                            if (hasNext == coroutine_suspended) {
                            }
                        } else {
                            if (z) {
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } finally {
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1(continuation);
        java.lang.Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ChannelsKt$emitAllImpl$1.label;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel) {
        return new kotlinx.coroutines.flow.ChannelAsFlow(receiveChannel, false, null, 0, null, 28, null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> receiveChannel) {
        return new kotlinx.coroutines.flow.ChannelAsFlow(receiveChannel, true, null, 0, null, 28, null);
    }

    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return kotlinx.coroutines.flow.internal.ChannelFlowKt.asChannelFlow(flow).produceImpl(coroutineScope);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(final kotlinx.coroutines.channels.BroadcastChannel<T> broadcastChannel) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object emitAll = kotlinx.coroutines.flow.FlowKt.emitAll(flowCollector, kotlinx.coroutines.channels.BroadcastChannel.this.openSubscription(), continuation);
                return emitAll == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAll : kotlin.Unit.INSTANCE;
            }
        };
    }
}
