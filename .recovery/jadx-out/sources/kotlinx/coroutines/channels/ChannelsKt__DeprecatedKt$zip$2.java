package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: Deprecated.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "R", "V", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ChannelsKt__DeprecatedKt$zip$2<V> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super V>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<R> $other;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_zip;
    final /* synthetic */ kotlin.jvm.functions.Function2<E, R, V> $transform;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__DeprecatedKt$zip$2(kotlinx.coroutines.channels.ReceiveChannel<? extends R> receiveChannel, kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2, kotlin.jvm.functions.Function2<? super E, ? super R, ? extends V> function2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2> continuation) {
        super(2, continuation);
        this.$other = receiveChannel;
        this.$this_zip = receiveChannel2;
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, continuation);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super V> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd A[Catch: all -> 0x005a, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:16:0x00b5, B:18:0x00bd, B:39:0x0115, B:50:0x004e), top: B:49:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e5 A[Catch: all -> 0x0112, TRY_LEAVE, TryCatch #0 {all -> 0x0112, blocks: (B:23:0x00dd, B:25:0x00e5), top: B:22:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0115 A[Catch: all -> 0x005a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x005a, blocks: (B:16:0x00b5, B:18:0x00bd, B:39:0x0115, B:50:0x004e), top: B:49:0x004e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0102 -> B:10:0x0104). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x010a -> B:11:0x0097). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2<V> channelsKt__DeprecatedKt$zip$2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        kotlinx.coroutines.channels.ProducerScope producerScope2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator2;
        kotlin.jvm.functions.Function2 function22;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel3;
        java.lang.Object obj2;
        kotlinx.coroutines.channels.ChannelIterator channelIterator3;
        java.lang.Object obj3;
        kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2<V> channelsKt__DeprecatedKt$zip$22;
        kotlinx.coroutines.channels.ProducerScope producerScope3;
        kotlinx.coroutines.channels.ChannelIterator channelIterator4;
        kotlin.jvm.functions.Function2 function23;
        java.lang.Object hasNext;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ProducerScope producerScope4 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlinx.coroutines.channels.ChannelIterator it2 = this.$other.iterator();
                receiveChannel = this.$this_zip;
                function2 = this.$transform;
                producerScope = producerScope4;
                channelsKt__DeprecatedKt$zip$2 = this;
                channelIterator = it2;
                it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$zip$2.L$0 = producerScope;
                channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                channelsKt__DeprecatedKt$zip$2.L$4 = it;
                channelsKt__DeprecatedKt$zip$2.L$5 = null;
                channelsKt__DeprecatedKt$zip$2.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                if (hasNext != coroutine_suspended) {
                }
            } else if (i == 1) {
                kotlinx.coroutines.channels.ChannelIterator channelIterator5 = (kotlinx.coroutines.channels.ChannelIterator) this.L$4;
                kotlinx.coroutines.channels.ReceiveChannel receiveChannel4 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
                kotlin.jvm.functions.Function2 function24 = (kotlin.jvm.functions.Function2) this.L$2;
                kotlinx.coroutines.channels.ChannelIterator channelIterator6 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope5 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                producerScope3 = producerScope5;
                channelIterator4 = channelIterator6;
                function23 = function24;
                receiveChannel2 = receiveChannel4;
                channelIterator3 = channelIterator5;
                obj3 = coroutine_suspended;
                channelsKt__DeprecatedKt$zip$22 = this;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                }
            } else if (i == 2) {
                java.lang.Object obj4 = this.L$5;
                channelIterator3 = (kotlinx.coroutines.channels.ChannelIterator) this.L$4;
                receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
                kotlin.jvm.functions.Function2 function25 = (kotlin.jvm.functions.Function2) this.L$2;
                kotlinx.coroutines.channels.ChannelIterator channelIterator7 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
                kotlinx.coroutines.channels.ProducerScope producerScope6 = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                try {
                    kotlin.ResultKt.throwOnFailure(obj);
                    producerScope2 = producerScope6;
                    channelIterator2 = channelIterator7;
                    function22 = function25;
                    receiveChannel3 = receiveChannel2;
                    obj2 = obj4;
                    obj3 = coroutine_suspended;
                    channelsKt__DeprecatedKt$zip$22 = this;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    receiveChannel = receiveChannel2;
                    throw th;
                }
            } else {
                if (i != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlinx.coroutines.channels.ChannelIterator channelIterator8 = (kotlinx.coroutines.channels.ChannelIterator) this.L$4;
                kotlinx.coroutines.channels.ReceiveChannel receiveChannel5 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
                function2 = (kotlin.jvm.functions.Function2) this.L$2;
                kotlinx.coroutines.channels.ChannelIterator channelIterator9 = (kotlinx.coroutines.channels.ChannelIterator) this.L$1;
                producerScope = (kotlinx.coroutines.channels.ProducerScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                channelIterator2 = channelIterator9;
                receiveChannel3 = receiveChannel5;
                channelIterator3 = channelIterator8;
                obj3 = coroutine_suspended;
                channelsKt__DeprecatedKt$zip$22 = this;
                channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                coroutine_suspended = obj3;
                it = channelIterator3;
                receiveChannel = receiveChannel3;
                channelIterator = channelIterator2;
                channelsKt__DeprecatedKt$zip$2.L$0 = producerScope;
                channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                channelsKt__DeprecatedKt$zip$2.L$4 = it;
                channelsKt__DeprecatedKt$zip$2.L$5 = null;
                channelsKt__DeprecatedKt$zip$2.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                java.lang.Object obj5 = coroutine_suspended;
                channelsKt__DeprecatedKt$zip$22 = channelsKt__DeprecatedKt$zip$2;
                obj = hasNext;
                producerScope3 = producerScope;
                channelIterator4 = channelIterator;
                function23 = function2;
                receiveChannel2 = receiveChannel;
                channelIterator3 = it;
                obj3 = obj5;
                if (!((java.lang.Boolean) obj).booleanValue()) {
                    java.lang.Object next = channelIterator3.next();
                    channelsKt__DeprecatedKt$zip$22.L$0 = producerScope3;
                    channelsKt__DeprecatedKt$zip$22.L$1 = channelIterator4;
                    channelsKt__DeprecatedKt$zip$22.L$2 = function23;
                    channelsKt__DeprecatedKt$zip$22.L$3 = receiveChannel2;
                    channelsKt__DeprecatedKt$zip$22.L$4 = channelIterator3;
                    channelsKt__DeprecatedKt$zip$22.L$5 = next;
                    channelsKt__DeprecatedKt$zip$22.label = 2;
                    java.lang.Object hasNext2 = channelIterator4.hasNext(channelsKt__DeprecatedKt$zip$22);
                    if (hasNext2 == obj3) {
                        return obj3;
                    }
                    kotlinx.coroutines.channels.ReceiveChannel receiveChannel6 = receiveChannel2;
                    obj2 = next;
                    obj = hasNext2;
                    producerScope2 = producerScope3;
                    channelIterator2 = channelIterator4;
                    function22 = function23;
                    receiveChannel3 = receiveChannel6;
                    try {
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                            coroutine_suspended = obj3;
                            it = channelIterator3;
                            receiveChannel = receiveChannel3;
                            function2 = function22;
                            channelIterator = channelIterator2;
                            producerScope = producerScope2;
                            channelsKt__DeprecatedKt$zip$2.L$0 = producerScope;
                            channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                            channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                            channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                            channelsKt__DeprecatedKt$zip$2.L$4 = it;
                            channelsKt__DeprecatedKt$zip$2.L$5 = null;
                            channelsKt__DeprecatedKt$zip$2.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                            if (hasNext != coroutine_suspended) {
                            }
                        } else {
                            java.lang.Object invoke = function22.invoke(obj2, channelIterator2.next());
                            channelsKt__DeprecatedKt$zip$22.L$0 = producerScope2;
                            channelsKt__DeprecatedKt$zip$22.L$1 = channelIterator2;
                            channelsKt__DeprecatedKt$zip$22.L$2 = function22;
                            channelsKt__DeprecatedKt$zip$22.L$3 = receiveChannel3;
                            channelsKt__DeprecatedKt$zip$22.L$4 = channelIterator3;
                            channelsKt__DeprecatedKt$zip$22.L$5 = null;
                            channelsKt__DeprecatedKt$zip$22.label = 3;
                            if (producerScope2.send(invoke, channelsKt__DeprecatedKt$zip$22) == obj3) {
                                return obj3;
                            }
                            function2 = function22;
                            producerScope = producerScope2;
                            channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                            coroutine_suspended = obj3;
                            it = channelIterator3;
                            receiveChannel = receiveChannel3;
                            channelIterator = channelIterator2;
                            channelsKt__DeprecatedKt$zip$2.L$0 = producerScope;
                            channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                            channelsKt__DeprecatedKt$zip$2.L$2 = function2;
                            channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                            channelsKt__DeprecatedKt$zip$2.L$4 = it;
                            channelsKt__DeprecatedKt$zip$2.L$5 = null;
                            channelsKt__DeprecatedKt$zip$2.label = 1;
                            hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                            if (hasNext != coroutine_suspended) {
                            }
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        receiveChannel = receiveChannel3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th3) {
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, th);
                            throw th3;
                        }
                    }
                } else {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                    return kotlin.Unit.INSTANCE;
                }
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
        }
    }
}
