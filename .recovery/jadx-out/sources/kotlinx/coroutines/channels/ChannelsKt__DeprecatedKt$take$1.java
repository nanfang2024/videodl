package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class ChannelsKt__DeprecatedKt$take$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $n;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_take;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$take$1(int i, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1> continuation) {
        super(2, continuation);
        this.$n = i;
        this.$this_take = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1 channelsKt__DeprecatedKt$take$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1(this.$n, this.$this_take, continuation);
        channelsKt__DeprecatedKt$take$1.L$0 = obj;
        return channelsKt__DeprecatedKt$take$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0086 -> B:6:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1<E> channelsKt__DeprecatedKt$take$1;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1<E> channelsKt__DeprecatedKt$take$12;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            i = this.$n;
            if (i == 0) {
                return kotlin.Unit.INSTANCE;
            }
            if (!(i >= 0)) {
                throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
            it = this.$this_take.iterator();
            channelsKt__DeprecatedKt$take$1 = this;
            channelsKt__DeprecatedKt$take$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
            }
        } else if (i2 == 1) {
            i = this.I$0;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$take$12 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } else {
            if (i2 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope3;
            channelsKt__DeprecatedKt$take$1 = this;
            i--;
            if (i == 0) {
                return kotlin.Unit.INSTANCE;
            }
            channelsKt__DeprecatedKt$take$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$take$1.L$1 = it;
            channelsKt__DeprecatedKt$take$1.I$0 = i;
            channelsKt__DeprecatedKt$take$1.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1<E> channelsKt__DeprecatedKt$take$13 = channelsKt__DeprecatedKt$take$1;
            producerScope2 = producerScope;
            obj = hasNext;
            channelsKt__DeprecatedKt$take$12 = channelsKt__DeprecatedKt$take$13;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$take$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$take$12.L$1 = it;
                channelsKt__DeprecatedKt$take$12.I$0 = i;
                channelsKt__DeprecatedKt$take$12.label = 2;
                if (producerScope2.send(it.next(), channelsKt__DeprecatedKt$take$12) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
                channelsKt__DeprecatedKt$take$1 = channelsKt__DeprecatedKt$take$12;
                i--;
                if (i == 0) {
                }
                channelsKt__DeprecatedKt$take$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$take$1.L$1 = it;
                channelsKt__DeprecatedKt$take$1.I$0 = i;
                channelsKt__DeprecatedKt$take$1.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$take$1);
                if (hasNext == coroutine_suspended) {
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
    }
}
