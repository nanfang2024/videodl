package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Broadcast.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {56, 57}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class BroadcastKt$broadcast$2<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $channel;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastKt$broadcast$2(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastKt$broadcast$2> continuation) {
        super(2, continuation);
        this.$channel = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.BroadcastKt$broadcast$2 broadcastKt$broadcast$2 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$2(this.$channel, continuation);
        broadcastKt$broadcast$2.L$0 = obj;
        return broadcastKt$broadcast$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.BroadcastKt$broadcast$2) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006e -> B:7:0x003e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.BroadcastKt$broadcast$2<E> broadcastKt$broadcast$2;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            it = this.$channel.iterator();
        } else if (i == 1) {
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.BroadcastKt$broadcast$2<E> broadcastKt$broadcast$22 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                broadcastKt$broadcast$22.L$0 = producerScope2;
                broadcastKt$broadcast$22.L$1 = it;
                broadcastKt$broadcast$22.label = 2;
                if (producerScope2.send(it.next(), broadcastKt$broadcast$22) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                producerScope = producerScope2;
                broadcastKt$broadcast$2 = broadcastKt$broadcast$22;
                broadcastKt$broadcast$2.L$0 = producerScope;
                broadcastKt$broadcast$2.L$1 = it;
                broadcastKt$broadcast$2.label = 1;
                hasNext = it.hasNext(broadcastKt$broadcast$2);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                kotlinx.coroutines.channels.BroadcastKt$broadcast$2<E> broadcastKt$broadcast$23 = broadcastKt$broadcast$2;
                producerScope2 = producerScope;
                obj = hasNext;
                broadcastKt$broadcast$22 = broadcastKt$broadcast$23;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    return kotlin.Unit.INSTANCE;
                }
            }
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope3;
        }
        broadcastKt$broadcast$2 = this;
        broadcastKt$broadcast$2.L$0 = producerScope;
        broadcastKt$broadcast$2.L$1 = it;
        broadcastKt$broadcast$2.label = 1;
        hasNext = it.hasNext(broadcastKt$broadcast$2);
        if (hasNext != coroutine_suspended) {
        }
    }
}
