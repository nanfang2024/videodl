package kotlinx.coroutines.channels;

/* compiled from: Channel.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0017J\u0014\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H'J\u001a\u0010\u0014\u001a\u00020\u00152\u0010\b\u0002\u0010\u0016\u001a\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019H&J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH¦\u0002J\u000f\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u0017¢\u0006\u0002\u0010\u001dJ\u0011\u0010\u001e\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\"\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u0013\u0010\"\u001a\u0004\u0018\u00018\u0000H\u0097@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00048&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0007R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR!\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000bX¦\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u000b8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lkotlinx/coroutines/channels/ReceiveChannel;", "E", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isClosedForReceive", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isClosedForReceive$annotations", "()V", "()Z", "isEmpty", "isEmpty$annotations", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "cancel", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "poll", "()Ljava/lang/Object;", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveOrNull", "tryReceive", "tryReceive-PtdJZtk", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public interface ReceiveChannel<E> {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    void cancel(java.util.concurrent.CancellationException cause);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean cancel(java.lang.Throwable cause);

    kotlinx.coroutines.selects.SelectClause1<E> getOnReceive();

    kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching();

    kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull();

    boolean isClosedForReceive();

    boolean isEmpty();

    kotlinx.coroutines.channels.ChannelIterator<E> iterator();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    E poll();

    java.lang.Object receive(kotlin.coroutines.Continuation<? super E> continuation);

    /* renamed from: receiveCatching-JP2dKIU */
    java.lang.Object mo1152receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> continuation);

    /* renamed from: tryReceive-PtdJZtk */
    java.lang.Object mo1153tryReceivePtdJZtk();

    /* compiled from: Channel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class DefaultImpls {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @kotlin.ReplaceWith(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void getOnReceiveOrNull$annotations() {
        }

        public static /* synthetic */ void isClosedForReceive$annotations() {
        }

        public static /* synthetic */ void isEmpty$annotations() {
        }

        public static /* synthetic */ void cancel$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            receiveChannel.cancel(cancellationException);
        }

        public static /* synthetic */ boolean cancel$default(kotlinx.coroutines.channels.ReceiveChannel receiveChannel, java.lang.Throwable th, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return receiveChannel.cancel(th);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        public static <E> E poll(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
            java.lang.Object mo1153tryReceivePtdJZtk = receiveChannel.mo1153tryReceivePtdJZtk();
            if (kotlinx.coroutines.channels.ChannelResult.m1168isSuccessimpl(mo1153tryReceivePtdJZtk)) {
                return (E) kotlinx.coroutines.channels.ChannelResult.m1164getOrThrowimpl(mo1153tryReceivePtdJZtk);
            }
            java.lang.Throwable m1162exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m1162exceptionOrNullimpl(mo1153tryReceivePtdJZtk);
            if (m1162exceptionOrNullimpl == null) {
                return null;
            }
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(m1162exceptionOrNullimpl);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <E> java.lang.Object receiveOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel, kotlin.coroutines.Continuation<? super E> continuation) {
            kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1 receiveChannel$receiveOrNull$1;
            int i;
            java.lang.Object mo1152receiveCatchingJP2dKIU;
            if (continuation instanceof kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1) {
                receiveChannel$receiveOrNull$1 = (kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1) continuation;
                if ((receiveChannel$receiveOrNull$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                    receiveChannel$receiveOrNull$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                    java.lang.Object obj = receiveChannel$receiveOrNull$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = receiveChannel$receiveOrNull$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        receiveChannel$receiveOrNull$1.label = 1;
                        mo1152receiveCatchingJP2dKIU = receiveChannel.mo1152receiveCatchingJP2dKIU(receiveChannel$receiveOrNull$1);
                        if (mo1152receiveCatchingJP2dKIU == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        mo1152receiveCatchingJP2dKIU = ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
                    }
                    return kotlinx.coroutines.channels.ChannelResult.m1163getOrNullimpl(mo1152receiveCatchingJP2dKIU);
                }
            }
            receiveChannel$receiveOrNull$1 = new kotlinx.coroutines.channels.ReceiveChannel$receiveOrNull$1(continuation);
            java.lang.Object obj2 = receiveChannel$receiveOrNull$1.result;
            java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            i = receiveChannel$receiveOrNull$1.label;
            if (i != 0) {
            }
            return kotlinx.coroutines.channels.ChannelResult.m1163getOrNullimpl(mo1152receiveCatchingJP2dKIU);
        }

        public static <E> kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull(kotlinx.coroutines.channels.ReceiveChannel<? extends E> receiveChannel) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(receiveChannel, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>");
            return ((kotlinx.coroutines.channels.BufferedChannel) receiveChannel).getOnReceiveOrNull();
        }
    }
}
