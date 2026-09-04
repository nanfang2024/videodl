package kotlinx.coroutines.channels;

/* compiled from: Channels.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/channels/ChannelResult;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>>, java.lang.Object> {
    final /* synthetic */ E $element;
    final /* synthetic */ kotlinx.coroutines.channels.SendChannel<E> $this_trySendBlocking;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelsKt__ChannelsKt$trySendBlocking$2(kotlinx.coroutines.channels.SendChannel<? super E> sendChannel, E e, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2> continuation) {
        super(2, continuation);
        this.$this_trySendBlocking = sendChannel;
        this.$element = e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, continuation);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends kotlin.Unit>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<kotlin.Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<kotlin.Unit>> continuation) {
        return ((kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.SendChannel<E> sendChannel = this.$this_trySendBlocking;
                E e = this.$element;
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                this.label = 1;
                if (sendChannel.send(e, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            obj2 = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        return kotlinx.coroutines.channels.ChannelResult.m1158boximpl(kotlin.Result.isSuccess-impl(obj2) ? kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(kotlin.Unit.INSTANCE) : kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(kotlin.Result.exceptionOrNull-impl(obj2)));
    }
}
