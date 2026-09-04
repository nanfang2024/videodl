package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class ChannelsKt__DeprecatedKt$takeWhile$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_takeWhile;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$takeWhile$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1> continuation) {
        super(2, continuation);
        this.$this_takeWhile = receiveChannel;
        this.$predicate = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1 channelsKt__DeprecatedKt$takeWhile$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1(this.$this_takeWhile, this.$predicate, continuation);
        channelsKt__DeprecatedKt$takeWhile$1.L$0 = obj;
        return channelsKt__DeprecatedKt$takeWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ae -> B:8:0x0058). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1<E> channelsKt__DeprecatedKt$takeWhile$1;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1<E> channelsKt__DeprecatedKt$takeWhile$12;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            it = this.$this_takeWhile.iterator();
            producerScope = producerScope3;
        } else if (i == 1) {
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope2 = producerScope4;
            channelIterator = channelIterator2;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$takeWhile$1 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } else if (i == 2) {
            java.lang.Object obj3 = this.L$2;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope6 = producerScope5;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator4 = channelIterator3;
            E e = obj3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$takeWhile$1 = this;
            if (((java.lang.Boolean) obj).booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            channelsKt__DeprecatedKt$takeWhile$1.L$0 = producerScope6;
            channelsKt__DeprecatedKt$takeWhile$1.L$1 = channelIterator4;
            channelsKt__DeprecatedKt$takeWhile$1.L$2 = null;
            channelsKt__DeprecatedKt$takeWhile$1.label = 3;
            if (producerScope6.send(e, channelsKt__DeprecatedKt$takeWhile$1) == obj2) {
                return obj2;
            }
            channelsKt__DeprecatedKt$takeWhile$12 = channelsKt__DeprecatedKt$takeWhile$1;
            coroutine_suspended = obj2;
            it = channelIterator4;
            producerScope = producerScope6;
            channelsKt__DeprecatedKt$takeWhile$12.L$0 = producerScope;
            channelsKt__DeprecatedKt$takeWhile$12.L$1 = it;
            channelsKt__DeprecatedKt$takeWhile$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$takeWhile$12);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            java.lang.Object obj4 = coroutine_suspended;
            channelsKt__DeprecatedKt$takeWhile$1 = channelsKt__DeprecatedKt$takeWhile$12;
            obj = hasNext;
            producerScope2 = producerScope;
            channelIterator = it;
            obj2 = obj4;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                E next = channelIterator.next();
                kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = channelsKt__DeprecatedKt$takeWhile$1.$predicate;
                channelsKt__DeprecatedKt$takeWhile$1.L$0 = producerScope2;
                channelsKt__DeprecatedKt$takeWhile$1.L$1 = channelIterator;
                channelsKt__DeprecatedKt$takeWhile$1.L$2 = next;
                channelsKt__DeprecatedKt$takeWhile$1.label = 2;
                java.lang.Object invoke = function2.invoke(next, channelsKt__DeprecatedKt$takeWhile$1);
                if (invoke == obj2) {
                    return obj2;
                }
                kotlinx.coroutines.channels.ChannelIterator<E> channelIterator5 = channelIterator;
                e = next;
                obj = invoke;
                producerScope6 = producerScope2;
                channelIterator4 = channelIterator5;
                if (((java.lang.Boolean) obj).booleanValue()) {
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
        channelsKt__DeprecatedKt$takeWhile$12 = this;
        channelsKt__DeprecatedKt$takeWhile$12.L$0 = producerScope;
        channelsKt__DeprecatedKt$takeWhile$12.L$1 = it;
        channelsKt__DeprecatedKt$takeWhile$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$takeWhile$12);
        if (hasNext != coroutine_suspended) {
        }
    }
}
