package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Channels.common.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u001a\u001a\u0010\u0002\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001aC\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\n2\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0087\b¢\u0006\u0002\u0010\u000e\u001aP\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\t\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\t0\u00042\u001d\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\u0004\u0012\u0004\u0012\u0002H\b0\f¢\u0006\u0002\b\rH\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\n2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a5\u0010\u0010\u001a\u00020\u0003\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u00030\fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a$\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\t0\u0015\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0007\u001a'\u0010\u0017\u001a\u0004\u0018\u0001H\t\"\b\b\u0000\u0010\t*\u00020\u0016*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a'\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\t0\u001a\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u0002H\t0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"DEFAULT_CLOSE_MESSAGE", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cancelConsumed", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/channels/ReceiveChannel;", "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "consume", "R", "E", "Lkotlinx/coroutines/channels/BroadcastChannel;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "consumeEach", "action", "(Lkotlinx/coroutines/channels/BroadcastChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onReceiveOrNull", "Lkotlinx/coroutines/selects/SelectClause1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "receiveOrNull", "(Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toList", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class ChannelsKt__Channels_commonKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    public static final <E, R> R consume(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            return function1.invoke(openSubscription);
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public static final /* synthetic */ java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, kotlin.coroutines.Continuation continuation) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.receiveOrNull?>");
        return receiveChannel.receiveOrNull(continuation);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Deprecated in the favour of 'onReceiveCatching'")
    public static final /* synthetic */ kotlinx.coroutines.selects.SelectClause1 onReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel receiveChannel) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveChannel<E of kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt.onReceiveOrNull?>");
        return receiveChannel.getOnReceiveOrNull();
    }

    public static final <E, R> R consume(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super kotlinx.coroutines.channels.ReceiveChannel<? extends E>, ? extends R> function1) {
        try {
            R invoke = function1.invoke(receiveChannel);
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            return invoke;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0065 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:11:0x0032, B:12:0x005d, B:14:0x0065, B:15:0x004b, B:20:0x006e), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[Catch: all -> 0x0036, TRY_LEAVE, TryCatch #1 {all -> 0x0036, blocks: (B:11:0x0032, B:12:0x005d, B:14:0x0065, B:15:0x004b, B:20:0x006e), top: B:10:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x005a -> B:12:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1 channelsKt__Channels_commonKt$consumeEach$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ChannelIterator it;
        kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function12;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) {
            channelsKt__Channels_commonKt$consumeEach$1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1) continuation;
            if ((channelsKt__Channels_commonKt$consumeEach$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = channelsKt__Channels_commonKt$consumeEach$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$consumeEach$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        function12 = function1;
                        channelsKt__Channels_commonKt$consumeEach$1.L$0 = function12;
                        channelsKt__Channels_commonKt$consumeEach$1.L$1 = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$1.L$2 = it;
                        channelsKt__Channels_commonKt$consumeEach$1.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$consumeEach$1.L$2;
                    receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$1.L$1;
                    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function13 = (kotlin.jvm.functions.Function1) channelsKt__Channels_commonKt$consumeEach$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            function13.invoke((java.lang.Object) it.next());
                            function12 = function13;
                            channelsKt__Channels_commonKt$consumeEach$1.L$0 = function12;
                            channelsKt__Channels_commonKt$consumeEach$1.L$1 = receiveChannel2;
                            channelsKt__Channels_commonKt$consumeEach$1.L$2 = it;
                            channelsKt__Channels_commonKt$consumeEach$1.label = 1;
                            hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$1);
                            if (hasNext != coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            function13 = function12;
                            obj = hasNext;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                                kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, null);
                                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                                return kotlin.Unit.INSTANCE;
                            }
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (java.lang.Throwable th4) {
                            kotlin.jvm.internal.InlineMarker.finallyStart(1);
                            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                            throw th4;
                        }
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$consumeEach$1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$1(continuation);
        java.lang.Object obj2 = channelsKt__Channels_commonKt$consumeEach$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$consumeEach$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x003a, TryCatch #2 {all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0068, B:14:0x0070, B:29:0x0079), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #2 {all -> 0x003a, blocks: (B:11:0x0036, B:12:0x0068, B:14:0x0070, B:29:0x0079), top: B:10:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0065 -> B:12:0x0068). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object toList(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super java.util.List<? extends E>> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1 channelsKt__Channels_commonKt$toList$1;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2;
        java.lang.Throwable th;
        java.util.List list;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.util.List list2;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) {
            channelsKt__Channels_commonKt$toList$1 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1) continuation;
            if ((channelsKt__Channels_commonKt$toList$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$toList$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = channelsKt__Channels_commonKt$toList$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$toList$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    try {
                        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                        list = createListBuilder;
                        receiveChannel2 = receiveChannel;
                        it = receiveChannel.iterator();
                        list2 = createListBuilder;
                        channelsKt__Channels_commonKt$toList$1.L$0 = list;
                        channelsKt__Channels_commonKt$toList$1.L$1 = list2;
                        channelsKt__Channels_commonKt$toList$1.L$2 = receiveChannel2;
                        channelsKt__Channels_commonKt$toList$1.L$3 = it;
                        channelsKt__Channels_commonKt$toList$1.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel2 = receiveChannel;
                        th = th2;
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$toList$1.L$3;
                    kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel3 = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$toList$1.L$2;
                    java.util.List list3 = (java.util.List) channelsKt__Channels_commonKt$toList$1.L$1;
                    list = (java.util.List) channelsKt__Channels_commonKt$toList$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.util.List list4 = list3;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            list4.add(it.next());
                            receiveChannel2 = receiveChannel3;
                            list2 = list4;
                            try {
                                channelsKt__Channels_commonKt$toList$1.L$0 = list;
                                channelsKt__Channels_commonKt$toList$1.L$1 = list2;
                                channelsKt__Channels_commonKt$toList$1.L$2 = receiveChannel2;
                                channelsKt__Channels_commonKt$toList$1.L$3 = it;
                                channelsKt__Channels_commonKt$toList$1.label = 1;
                                hasNext = it.hasNext(channelsKt__Channels_commonKt$toList$1);
                                if (hasNext != coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                receiveChannel3 = receiveChannel2;
                                obj = hasNext;
                                list4 = list2;
                                if (!((java.lang.Boolean) obj).booleanValue()) {
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel3, null);
                                    return kotlin.collections.CollectionsKt.build(list);
                                }
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                try {
                                    throw th;
                                } catch (java.lang.Throwable th4) {
                                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel2, th);
                                    throw th4;
                                }
                            }
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        receiveChannel2 = receiveChannel3;
                        throw th;
                    }
                }
            }
        }
        channelsKt__Channels_commonKt$toList$1 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$toList$1(continuation);
        java.lang.Object obj2 = channelsKt__Channels_commonKt$toList$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$toList$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006f A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:15:0x0067, B:17:0x006f, B:29:0x007a), top: B:14:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:15:0x0067, B:17:0x006f, B:29:0x007a), top: B:14:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0063 -> B:13:0x0039). Please report as a decompilation issue!!! */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <E> java.lang.Object consumeEach(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$3;
        int i;
        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel;
        java.lang.Throwable th;
        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel2;
        kotlinx.coroutines.channels.ChannelIterator it;
        java.lang.Object hasNext;
        if (continuation instanceof kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3) {
            channelsKt__Channels_commonKt$consumeEach$3 = (kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3) continuation;
            if ((channelsKt__Channels_commonKt$consumeEach$3.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                channelsKt__Channels_commonKt$consumeEach$3.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = channelsKt__Channels_commonKt$consumeEach$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelsKt__Channels_commonKt$consumeEach$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
                    try {
                        receiveChannel2 = openSubscription;
                        it = openSubscription.iterator();
                        channelsKt__Channels_commonKt$consumeEach$3.L$0 = function1;
                        channelsKt__Channels_commonKt$consumeEach$3.L$1 = receiveChannel2;
                        channelsKt__Channels_commonKt$consumeEach$3.L$2 = it;
                        channelsKt__Channels_commonKt$consumeEach$3.label = 1;
                        hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$3);
                        if (hasNext != coroutine_suspended) {
                        }
                    } catch (java.lang.Throwable th2) {
                        receiveChannel = openSubscription;
                        th = th2;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (kotlinx.coroutines.channels.ChannelIterator) channelsKt__Channels_commonKt$consumeEach$3.L$2;
                    receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) channelsKt__Channels_commonKt$consumeEach$3.L$1;
                    kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function12 = (kotlin.jvm.functions.Function1) channelsKt__Channels_commonKt$consumeEach$3.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$32 = channelsKt__Channels_commonKt$consumeEach$3;
                        kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel3 = receiveChannel;
                        function1 = function12;
                        java.lang.Object obj2 = coroutine_suspended;
                        kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$33 = channelsKt__Channels_commonKt$consumeEach$32;
                        try {
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                function1.invoke((java.lang.Object) it.next());
                                receiveChannel2 = receiveChannel3;
                                channelsKt__Channels_commonKt$consumeEach$3 = channelsKt__Channels_commonKt$consumeEach$33;
                                coroutine_suspended = obj2;
                                try {
                                    channelsKt__Channels_commonKt$consumeEach$3.L$0 = function1;
                                    channelsKt__Channels_commonKt$consumeEach$3.L$1 = receiveChannel2;
                                    channelsKt__Channels_commonKt$consumeEach$3.L$2 = it;
                                    channelsKt__Channels_commonKt$consumeEach$3.label = 1;
                                    hasNext = it.hasNext(channelsKt__Channels_commonKt$consumeEach$3);
                                    if (hasNext != coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelsKt__Channels_commonKt$consumeEach$32 = channelsKt__Channels_commonKt$consumeEach$3;
                                    receiveChannel3 = receiveChannel2;
                                    obj = hasNext;
                                    java.lang.Object obj22 = coroutine_suspended;
                                    kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3 channelsKt__Channels_commonKt$consumeEach$332 = channelsKt__Channels_commonKt$consumeEach$32;
                                    if (!((java.lang.Boolean) obj).booleanValue()) {
                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                        kotlin.jvm.internal.InlineMarker.finallyStart(1);
                                        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel3, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                                        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                                        return kotlin.Unit.INSTANCE;
                                    }
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    receiveChannel = receiveChannel2;
                                }
                            }
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            receiveChannel = receiveChannel3;
                        }
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                    }
                }
                kotlin.jvm.internal.InlineMarker.finallyStart(1);
                kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        channelsKt__Channels_commonKt$consumeEach$3 = new kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumeEach$3(continuation);
        java.lang.Object obj3 = channelsKt__Channels_commonKt$consumeEach$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelsKt__Channels_commonKt$consumeEach$3.label;
        if (i != 0) {
        }
        kotlin.jvm.internal.InlineMarker.finallyStart(1);
        kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) receiveChannel, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        throw th;
    }

    public static final void cancelConsumed(kotlinx.coroutines.channels.ReceiveChannel<?> receiveChannel, java.lang.Throwable th) {
        if (th != null) {
            r0 = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            if (r0 == null) {
                r0 = kotlinx.coroutines.ExceptionsKt.CancellationException("Channel was consumed, consumer had failed", th);
            }
        }
        receiveChannel.cancel(r0);
    }

    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        try {
            kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel2 = receiveChannel;
            kotlinx.coroutines.channels.ChannelIterator<? extends E> it = receiveChannel.iterator();
            while (true) {
                kotlin.jvm.internal.InlineMarker.mark(3);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object hasNext = it.hasNext(null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                if (!((java.lang.Boolean) hasNext).booleanValue()) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(receiveChannel, null);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    return kotlin.Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } finally {
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    private static final <E> java.lang.Object consumeEach$$forInline(kotlinx.coroutines.channels.BroadcastChannel<E> broadcastChannel, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription = broadcastChannel.openSubscription();
        try {
            kotlinx.coroutines.channels.ReceiveChannel<E> receiveChannel = openSubscription;
            kotlinx.coroutines.channels.ChannelIterator<E> it = openSubscription.iterator();
            while (true) {
                kotlin.jvm.internal.InlineMarker.mark(3);
                kotlin.jvm.internal.InlineMarker.mark(0);
                java.lang.Object hasNext = it.hasNext(null);
                kotlin.jvm.internal.InlineMarker.mark(1);
                if (!((java.lang.Boolean) hasNext).booleanValue()) {
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.jvm.internal.InlineMarker.finallyStart(1);
                    kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    kotlin.jvm.internal.InlineMarker.finallyEnd(1);
                    return kotlin.Unit.INSTANCE;
                }
                function1.invoke(it.next());
            }
        } catch (java.lang.Throwable th) {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default((kotlinx.coroutines.channels.ReceiveChannel) openSubscription, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
