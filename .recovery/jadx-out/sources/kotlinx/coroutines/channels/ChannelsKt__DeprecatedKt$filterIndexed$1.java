package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class ChannelsKt__DeprecatedKt$filterIndexed$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_filterIndexed;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$filterIndexed$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1> continuation) {
        super(2, continuation);
        this.$this_filterIndexed = receiveChannel;
        this.$predicate = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1 channelsKt__DeprecatedKt$filterIndexed$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1(this.$this_filterIndexed, this.$predicate, continuation);
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        r13 = r0;
        r0 = r1;
        r7 = r8;
        r1 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1<E> channelsKt__DeprecatedKt$filterIndexed$1;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        int i;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator;
        int i2;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        E e;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1<E> channelsKt__DeprecatedKt$filterIndexed$12;
        kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2;
        int i3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$filterIndexed$1 = this;
            it = this.$this_filterIndexed.iterator();
            i = 0;
        } else if (i4 == 1) {
            int i5 = this.I$0;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope2 = producerScope3;
            channelIterator2 = channelIterator3;
            i3 = i5;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$12 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                E next = channelIterator2.next();
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function3 = channelsKt__DeprecatedKt$filterIndexed$12.$predicate;
                i2 = i3 + 1;
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(i3);
                channelsKt__DeprecatedKt$filterIndexed$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$filterIndexed$12.L$1 = channelIterator2;
                channelsKt__DeprecatedKt$filterIndexed$12.L$2 = next;
                channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i2;
                channelsKt__DeprecatedKt$filterIndexed$12.label = 2;
                java.lang.Object invoke = function3.invoke(boxInt, next, channelsKt__DeprecatedKt$filterIndexed$12);
                if (invoke == obj2) {
                    return obj2;
                }
                channelIterator = channelIterator2;
                e = next;
                obj = invoke;
                it = channelIterator;
                if (((java.lang.Boolean) obj).booleanValue()) {
                }
                channelsKt__DeprecatedKt$filterIndexed$1 = channelsKt__DeprecatedKt$filterIndexed$12;
                coroutine_suspended = obj2;
                producerScope = producerScope2;
                i = i2;
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else if (i4 == 2) {
            int i6 = this.I$0;
            java.lang.Object obj3 = this.L$2;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator4 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            i2 = i6;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$filterIndexed$12 = this;
            channelIterator = channelIterator4;
            e = obj3;
            it = channelIterator;
            if (((java.lang.Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$filterIndexed$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$filterIndexed$12.L$1 = it;
                channelsKt__DeprecatedKt$filterIndexed$12.L$2 = null;
                channelsKt__DeprecatedKt$filterIndexed$12.I$0 = i2;
                channelsKt__DeprecatedKt$filterIndexed$12.label = 3;
                if (producerScope2.send(e, channelsKt__DeprecatedKt$filterIndexed$12) == obj2) {
                    return obj2;
                }
            }
            channelsKt__DeprecatedKt$filterIndexed$1 = channelsKt__DeprecatedKt$filterIndexed$12;
            coroutine_suspended = obj2;
            producerScope = producerScope2;
            i = i2;
        } else {
            if (i4 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$filterIndexed$1 = this;
        }
        channelsKt__DeprecatedKt$filterIndexed$1.L$0 = producerScope;
        channelsKt__DeprecatedKt$filterIndexed$1.L$1 = it;
        channelsKt__DeprecatedKt$filterIndexed$1.L$2 = null;
        channelsKt__DeprecatedKt$filterIndexed$1.I$0 = i;
        channelsKt__DeprecatedKt$filterIndexed$1.label = 1;
        java.lang.Object hasNext = it.hasNext(channelsKt__DeprecatedKt$filterIndexed$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        java.lang.Object obj4 = coroutine_suspended;
        channelsKt__DeprecatedKt$filterIndexed$12 = channelsKt__DeprecatedKt$filterIndexed$1;
        obj = hasNext;
        producerScope2 = producerScope;
        channelIterator2 = it;
        i3 = i;
        obj2 = obj4;
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
