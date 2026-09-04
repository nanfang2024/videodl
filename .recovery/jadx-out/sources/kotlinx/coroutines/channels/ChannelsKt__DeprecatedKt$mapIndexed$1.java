package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ChannelsKt__DeprecatedKt$mapIndexed$1<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_mapIndexed;
    final /* synthetic */ kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$mapIndexed$1(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1> continuation) {
        super(2, continuation);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, continuation);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super R> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00b3 -> B:7:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1<R> channelsKt__DeprecatedKt$mapIndexed$1;
        kotlinx.coroutines.channels.ChannelIterator it;
        int i;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1<R> channelsKt__DeprecatedKt$mapIndexed$12;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1<R> channelsKt__DeprecatedKt$mapIndexed$13;
        kotlinx.coroutines.channels.ProducerScope producerScope4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
            it = this.$this_mapIndexed.iterator();
            i = 0;
        } else if (i2 == 1) {
            i = this.I$0;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$mapIndexed$13 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                java.lang.Object next = it.next();
                kotlin.jvm.functions.Function3<java.lang.Integer, E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> function3 = channelsKt__DeprecatedKt$mapIndexed$13.$transform;
                int i3 = i + 1;
                java.lang.Integer boxInt = kotlin.coroutines.jvm.internal.Boxing.boxInt(i);
                channelsKt__DeprecatedKt$mapIndexed$13.L$0 = producerScope4;
                channelsKt__DeprecatedKt$mapIndexed$13.L$1 = it;
                channelsKt__DeprecatedKt$mapIndexed$13.L$2 = producerScope4;
                channelsKt__DeprecatedKt$mapIndexed$13.I$0 = i3;
                channelsKt__DeprecatedKt$mapIndexed$13.label = 2;
                obj = function3.invoke(boxInt, next, channelsKt__DeprecatedKt$mapIndexed$13);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                channelsKt__DeprecatedKt$mapIndexed$12 = channelsKt__DeprecatedKt$mapIndexed$13;
                i = i3;
                producerScope2 = producerScope4;
                channelIterator = it;
                producerScope3 = producerScope2;
                channelsKt__DeprecatedKt$mapIndexed$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$mapIndexed$12.L$1 = channelIterator;
                channelsKt__DeprecatedKt$mapIndexed$12.L$2 = null;
                channelsKt__DeprecatedKt$mapIndexed$12.I$0 = i;
                channelsKt__DeprecatedKt$mapIndexed$12.label = 3;
                if (producerScope3.send(obj, channelsKt__DeprecatedKt$mapIndexed$12) != coroutine_suspended) {
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        } else if (i2 == 2) {
            i = this.I$0;
            producerScope3 = (kotlinx.coroutines.channels.ProducerScope) this.L$2;
            channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            channelsKt__DeprecatedKt$mapIndexed$12 = this;
            channelsKt__DeprecatedKt$mapIndexed$12.L$0 = producerScope2;
            channelsKt__DeprecatedKt$mapIndexed$12.L$1 = channelIterator;
            channelsKt__DeprecatedKt$mapIndexed$12.L$2 = null;
            channelsKt__DeprecatedKt$mapIndexed$12.I$0 = i;
            channelsKt__DeprecatedKt$mapIndexed$12.label = 3;
            if (producerScope3.send(obj, channelsKt__DeprecatedKt$mapIndexed$12) != coroutine_suspended) {
                return coroutine_suspended;
            }
            it = channelIterator;
            producerScope = producerScope2;
            channelsKt__DeprecatedKt$mapIndexed$1 = channelsKt__DeprecatedKt$mapIndexed$12;
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$0;
            it = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope5;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
        }
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = producerScope;
        channelsKt__DeprecatedKt$mapIndexed$1.L$1 = it;
        channelsKt__DeprecatedKt$mapIndexed$1.I$0 = i;
        channelsKt__DeprecatedKt$mapIndexed$1.label = 1;
        java.lang.Object hasNext = it.hasNext(channelsKt__DeprecatedKt$mapIndexed$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1<R> channelsKt__DeprecatedKt$mapIndexed$14 = channelsKt__DeprecatedKt$mapIndexed$1;
        producerScope4 = producerScope;
        obj = hasNext;
        channelsKt__DeprecatedKt$mapIndexed$13 = channelsKt__DeprecatedKt$mapIndexed$14;
        if (!((java.lang.Boolean) obj).booleanValue()) {
        }
    }
}
