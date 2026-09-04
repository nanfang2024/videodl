package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_flatMap;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$flatMap$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1> continuation) {
        super(2, continuation);
        this.$this_flatMap = receiveChannel;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, continuation);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x009a -> B:8:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1<R> channelsKt__DeprecatedKt$flatMap$1;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1<R> channelsKt__DeprecatedKt$flatMap$12;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            it = this.$this_flatMap.iterator();
            producerScope = producerScope3;
        } else if (i == 1) {
            kotlinx.coroutines.channels.ChannelIterator channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope2 = producerScope4;
            channelIterator = channelIterator2;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } else if (i == 2) {
            kotlinx.coroutines.channels.ChannelIterator channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope2 = producerScope5;
            channelIterator = channelIterator3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = this;
            channelsKt__DeprecatedKt$flatMap$1.L$0 = producerScope2;
            channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$flatMap$1.label = 3;
            if (kotlinx.coroutines.channels.ChannelsKt.toChannel((kotlinx.coroutines.channels.ReceiveChannel) obj, producerScope2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                return obj2;
            }
            channelsKt__DeprecatedKt$flatMap$12 = channelsKt__DeprecatedKt$flatMap$1;
            coroutine_suspended = obj2;
            it = channelIterator;
            producerScope = producerScope2;
            channelsKt__DeprecatedKt$flatMap$12.L$0 = producerScope;
            channelsKt__DeprecatedKt$flatMap$12.L$1 = it;
            channelsKt__DeprecatedKt$flatMap$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$flatMap$12);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            java.lang.Object obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = channelsKt__DeprecatedKt$flatMap$12;
            obj = hasNext;
            producerScope2 = producerScope;
            channelIterator = it;
            obj2 = obj3;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                java.lang.Object next = channelIterator.next();
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel<? extends R>>, java.lang.Object> function2 = channelsKt__DeprecatedKt$flatMap$1.$transform;
                channelsKt__DeprecatedKt$flatMap$1.L$0 = producerScope2;
                channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
                channelsKt__DeprecatedKt$flatMap$1.label = 2;
                obj = function2.invoke(next, channelsKt__DeprecatedKt$flatMap$1);
                if (obj == obj2) {
                    return obj2;
                }
                channelsKt__DeprecatedKt$flatMap$1.L$0 = producerScope2;
                channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
                channelsKt__DeprecatedKt$flatMap$1.label = 3;
                if (kotlinx.coroutines.channels.ChannelsKt.toChannel((kotlinx.coroutines.channels.ReceiveChannel) obj, producerScope2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else {
            if (i != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        channelsKt__DeprecatedKt$flatMap$12 = this;
        channelsKt__DeprecatedKt$flatMap$12.L$0 = producerScope;
        channelsKt__DeprecatedKt$flatMap$12.L$1 = it;
        channelsKt__DeprecatedKt$flatMap$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$flatMap$12);
        if (hasNext != coroutine_suspended) {
        }
    }
}
