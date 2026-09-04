package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class ChannelsKt__DeprecatedKt$drop$1<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $n;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_drop;
    int I$0;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$drop$1(int i, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1> continuation) {
        super(2, continuation);
        this.$n = i;
        this.$this_drop = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1 channelsKt__DeprecatedKt$drop$1 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1(this.$n, this.$this_drop, continuation);
        channelsKt__DeprecatedKt$drop$1.L$0 = obj;
        return channelsKt__DeprecatedKt$drop$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b1 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d1 -> B:7:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007a -> B:24:0x0081). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ProducerScope producerScope;
        int i;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1<E> channelsKt__DeprecatedKt$drop$1;
        kotlinx.coroutines.channels.ChannelIterator<E> it;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1<E> channelsKt__DeprecatedKt$drop$12;
        kotlinx.coroutines.channels.ChannelIterator<E> it2;
        java.lang.Object hasNext;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        java.lang.Object hasNext2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            i = this.$n;
            if (!(i >= 0)) {
                throw new java.lang.IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
            }
            if (i > 0) {
                it = this.$this_drop.iterator();
                producerScope2 = producerScope;
                channelsKt__DeprecatedKt$drop$12 = this;
                channelsKt__DeprecatedKt$drop$12.L$0 = producerScope2;
                channelsKt__DeprecatedKt$drop$12.L$1 = it;
                channelsKt__DeprecatedKt$drop$12.I$0 = i;
                channelsKt__DeprecatedKt$drop$12.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$12);
                if (hasNext != coroutine_suspended) {
                }
            } else {
                obj2 = coroutine_suspended;
                channelsKt__DeprecatedKt$drop$1 = this;
                it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
                channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext2 != obj2) {
                }
            }
        } else if (i2 == 1) {
            int i3 = this.I$0;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.channels.ProducerScope producerScope5 = producerScope4;
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator2 = channelIterator;
            int i4 = i3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            if (((java.lang.Boolean) obj).booleanValue()) {
                channelIterator2.next();
                int i5 = i4 - 1;
                if (i5 != 0) {
                    it = channelIterator2;
                    producerScope2 = producerScope5;
                    java.lang.Object obj3 = obj2;
                    i = i5;
                    channelsKt__DeprecatedKt$drop$12 = channelsKt__DeprecatedKt$drop$1;
                    coroutine_suspended = obj3;
                    channelsKt__DeprecatedKt$drop$12.L$0 = producerScope2;
                    channelsKt__DeprecatedKt$drop$12.L$1 = it;
                    channelsKt__DeprecatedKt$drop$12.I$0 = i;
                    channelsKt__DeprecatedKt$drop$12.label = 1;
                    hasNext = it.hasNext(channelsKt__DeprecatedKt$drop$12);
                    if (hasNext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    java.lang.Object obj4 = coroutine_suspended;
                    channelsKt__DeprecatedKt$drop$1 = channelsKt__DeprecatedKt$drop$12;
                    obj = hasNext;
                    producerScope5 = producerScope2;
                    channelIterator2 = it;
                    i4 = i;
                    obj2 = obj4;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                }
            }
            producerScope = producerScope5;
            it2 = channelsKt__DeprecatedKt$drop$1.$this_drop.iterator();
            channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
            }
        } else if (i2 == 2) {
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope3 = producerScope6;
            it2 = channelIterator3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            if (!((java.lang.Boolean) obj).booleanValue()) {
            }
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinx.coroutines.channels.ChannelIterator<E> channelIterator4 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
            kotlinx.coroutines.channels.ProducerScope producerScope7 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            producerScope = producerScope7;
            it2 = channelIterator4;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$drop$1 = this;
            channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
            channelsKt__DeprecatedKt$drop$1.L$1 = it2;
            channelsKt__DeprecatedKt$drop$1.label = 2;
            hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
            if (hasNext2 != obj2) {
                return obj2;
            }
            producerScope3 = producerScope;
            obj = hasNext2;
            if (!((java.lang.Boolean) obj).booleanValue()) {
                channelsKt__DeprecatedKt$drop$1.L$0 = producerScope3;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 3;
                if (producerScope3.send(it2.next(), channelsKt__DeprecatedKt$drop$1) == obj2) {
                    return obj2;
                }
                producerScope = producerScope3;
                channelsKt__DeprecatedKt$drop$1.L$0 = producerScope;
                channelsKt__DeprecatedKt$drop$1.L$1 = it2;
                channelsKt__DeprecatedKt$drop$1.label = 2;
                hasNext2 = it2.hasNext(channelsKt__DeprecatedKt$drop$1);
                if (hasNext2 != obj2) {
                }
            } else {
                return kotlin.Unit.INSTANCE;
            }
        }
    }
}
