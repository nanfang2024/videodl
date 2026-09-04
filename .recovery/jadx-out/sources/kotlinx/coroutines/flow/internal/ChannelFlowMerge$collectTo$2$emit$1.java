package kotlinx.coroutines.flow.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {66}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2$emit$1(kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2<? super T> channelFlowMerge$collectTo$2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1> continuation) {
        super(continuation);
        this.this$0 = channelFlowMerge$collectTo$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return this.this$0.emit((kotlinx.coroutines.flow.Flow) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }
}
