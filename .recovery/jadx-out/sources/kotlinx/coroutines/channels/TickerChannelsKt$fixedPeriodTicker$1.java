package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TickerChannels.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.TickerChannelsKt", f = "TickerChannels.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3}, l = {84, 88, 94, 96}, m = "fixedPeriodTicker", n = {"channel", "delayMillis", "deadline", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs", "channel", "deadline", "delayNs"}, s = {"L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1", "L$0", "J$0", "J$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class TickerChannelsKt$fixedPeriodTicker$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    long J$0;
    long J$1;
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TickerChannelsKt$fixedPeriodTicker$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object fixedPeriodTicker;
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        fixedPeriodTicker = kotlinx.coroutines.channels.TickerChannelsKt.fixedPeriodTicker(0L, 0L, null, this);
        return fixedPeriodTicker;
    }
}
