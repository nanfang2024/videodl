package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channel.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {372}, m = "receiveOrNull", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ReceiveChannel$receiveOrNull$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReceiveChannel$receiveOrNull$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.receiveOrNull(null, this);
    }
}
