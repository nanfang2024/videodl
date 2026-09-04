package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ChannelsKt__DeprecatedKt$toCollection$1<E, C extends java.util.Collection<? super E>> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChannelsKt__DeprecatedKt$toCollection$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$toCollection$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return kotlinx.coroutines.channels.ChannelsKt.toCollection(null, null, this);
    }
}
