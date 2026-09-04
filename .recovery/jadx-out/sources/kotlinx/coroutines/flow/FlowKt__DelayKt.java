package kotlinx.coroutines.flow;

/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0007\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00070\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\b\b\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0005H\u0007\u001a3\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a7\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0002\b\r\u001a$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0000\u001a&\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0007\u001a3\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\n\u001a3\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"debounce", "Lkotlinx/coroutines/flow/Flow;", "T", "timeoutMillis", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "timeout", "Lkotlin/time/Duration;", "debounceDuration", "debounce-HG0u8IE", "(Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;", "debounceInternal", "timeoutMillisSelector", "debounceInternal$FlowKt__DelayKt", "fixedPeriodTicker", "Lkotlinx/coroutines/channels/ReceiveChannel;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;", "delayMillis", "initialDelayMillis", "sample", "periodMillis", "period", "sample-HG0u8IE", "timeout-HG0u8IE", "timeoutInternal", "timeoutInternal-HG0u8IE$FlowKt__DelayKt", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class FlowKt__DelayKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, final long j) {
        if (j >= 0) {
            return j == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new kotlin.jvm.functions.Function1<T, java.lang.Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Long invoke(T t) {
                    return java.lang.Long.valueOf(j);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ java.lang.Long invoke(java.lang.Object obj) {
                    return invoke((kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2<T>) obj);
                }
            });
        }
        throw new java.lang.IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, function1);
    }

    /* renamed from: debounce-HG0u8IE */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1181debounceHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.debounce(flow, kotlinx.coroutines.DelayKt.m1136toDelayMillisLRDsOJo(j));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> debounceDuration(kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function1<? super T, kotlin.time.Duration> function1) {
        return debounceInternal$FlowKt__DelayKt(flow, new kotlin.jvm.functions.Function1<T, java.lang.Long>() { // from class: kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ java.lang.Long invoke(java.lang.Object obj) {
                return invoke((kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$3<T>) obj);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Long invoke(T t) {
                return java.lang.Long.valueOf(kotlinx.coroutines.DelayKt.m1136toDelayMillisLRDsOJo(function1.invoke(t).getRawValue()));
            }
        });
    }

    private static final <T> kotlinx.coroutines.flow.Flow<T> debounceInternal$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function1<? super T, java.lang.Long> function1) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1(function1, flow, null));
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> sample(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        if (j <= 0) {
            throw new java.lang.IllegalArgumentException("Sample period should be positive".toString());
        }
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2(j, flow, null));
    }

    public static /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel fixedPeriodTicker$default(kotlinx.coroutines.CoroutineScope coroutineScope, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        return kotlinx.coroutines.flow.FlowKt.fixedPeriodTicker(coroutineScope, j, j2);
    }

    public static final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> fixedPeriodTicker(kotlinx.coroutines.CoroutineScope coroutineScope, long j, long j2) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
        }
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        return kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, 0, new kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3(j2, j, null), 1, null);
    }

    /* renamed from: sample-HG0u8IE */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1182sampleHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.FlowKt.sample(flow, kotlinx.coroutines.DelayKt.m1136toDelayMillisLRDsOJo(j));
    }

    /* renamed from: timeout-HG0u8IE */
    public static final <T> kotlinx.coroutines.flow.Flow<T> m1183timeoutHG0u8IE(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return m1184timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j);
    }

    /* renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt */
    private static final <T> kotlinx.coroutines.flow.Flow<T> m1184timeoutInternalHG0u8IE$FlowKt__DelayKt(kotlinx.coroutines.flow.Flow<? extends T> flow, long j) {
        return kotlinx.coroutines.flow.internal.FlowCoroutineKt.scopedFlow(new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }
}
