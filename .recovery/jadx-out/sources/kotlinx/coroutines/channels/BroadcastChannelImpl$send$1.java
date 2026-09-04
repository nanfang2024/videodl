package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BroadcastChannel.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastChannelImpl", f = "BroadcastChannel.kt", i = {0, 0}, l = {230}, m = "send", n = {"this", "element"}, s = {"L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class BroadcastChannelImpl$send$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.channels.BroadcastChannelImpl<E> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastChannelImpl$send$1(kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastChannelImpl$send$1> continuation) {
        super(continuation);
        this.this$0 = broadcastChannelImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return this.this$0.send(null, this);
    }
}
