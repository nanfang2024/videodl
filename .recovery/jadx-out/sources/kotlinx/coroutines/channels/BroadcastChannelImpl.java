package kotlinx.coroutines.channels;

/* compiled from: BroadcastChannel.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u000245B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0017\u0010\u001f\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0010¢\u0006\u0002\b\"J\u0012\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016J\u001e\u0010&\u001a\u00020'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00132\b\u0010)\u001a\u0004\u0018\u00010\rH\u0014J\u0016\u0010*\u001a\u00020'2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0002J\u0019\u0010,\u001a\u00020'2\u0006\u0010)\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020/H\u0016J&\u00100\u001a\b\u0012\u0004\u0012\u00020'012\u0006\u0010)\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0011\u001a*\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0012j\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013\u0012\u0006\u0012\u0004\u0018\u00010\r`\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00018\u00008F¢\u0006\f\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl;", "E", "Lkotlinx/coroutines/channels/BufferedChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;", "capacity", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "getCapacity", "()I", "isClosedForSend", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "lastConflatedElement", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "onSendInternalResult", "Ljava/util/HashMap;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/collections/HashMap;", "subscribers", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "valueOrNull", "getValueOrNull$annotations", "getValueOrNull", "cancelImpl", "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cancelImpl$kotlinx_coroutines_core", "close", "openSubscription", "Lkotlinx/coroutines/channels/ReceiveChannel;", "registerSelectForSend", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "select", "element", "removeSubscriber", "s", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "SubscriberBuffered", "SubscriberConflated", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class BroadcastChannelImpl<E> extends kotlinx.coroutines.channels.BufferedChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private final int capacity;
    private java.lang.Object lastConflatedElement;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final java.util.HashMap<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object> onSendInternalResult;
    private java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> subscribers;

    public static /* synthetic */ void getValue$annotations() {
    }

    public static /* synthetic */ void getValueOrNull$annotations() {
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public BroadcastChannelImpl(int i) {
        super(0, null);
        this.capacity = i;
        if (i < 1 && i != -1) {
            throw new java.lang.IllegalArgumentException(("BroadcastChannel capacity must be positive or Channel.CONFLATED, but " + i + " was specified").toString());
        }
        this.lock = new java.util.concurrent.locks.ReentrantLock();
        this.subscribers = kotlin.collections.CollectionsKt.emptyList();
        this.lastConflatedElement = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p();
        this.onSendInternalResult = new java.util.HashMap<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:10:0x0080). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.BroadcastChannelImpl$send$1 broadcastChannelImpl$send$1;
        int i;
        kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl;
        E e2;
        java.util.Iterator it;
        if (continuation instanceof kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) {
            broadcastChannelImpl$send$1 = (kotlinx.coroutines.channels.BroadcastChannelImpl$send$1) continuation;
            if ((broadcastChannelImpl$send$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                broadcastChannelImpl$send$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = broadcastChannelImpl$send$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = broadcastChannelImpl$send$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
                    reentrantLock.lock();
                    try {
                        if (isClosedForSend()) {
                            throw getSendException();
                        }
                        if (this.capacity == -1) {
                            this.lastConflatedElement = e;
                        }
                        java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
                        reentrantLock.unlock();
                        broadcastChannelImpl = this;
                        e2 = e;
                        it = list.iterator();
                        if (it.hasNext()) {
                        }
                    } catch (java.lang.Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (java.util.Iterator) broadcastChannelImpl$send$1.L$2;
                    java.lang.Object obj2 = broadcastChannelImpl$send$1.L$1;
                    broadcastChannelImpl = (kotlinx.coroutines.channels.BroadcastChannelImpl) broadcastChannelImpl$send$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    E e3 = obj2;
                    if (((java.lang.Boolean) obj).booleanValue() && broadcastChannelImpl.isClosedForSend()) {
                        throw broadcastChannelImpl.getSendException();
                    }
                    e2 = e3;
                    if (it.hasNext()) {
                        kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (kotlinx.coroutines.channels.BufferedChannel) it.next();
                        broadcastChannelImpl$send$1.L$0 = broadcastChannelImpl;
                        broadcastChannelImpl$send$1.L$1 = e2;
                        broadcastChannelImpl$send$1.L$2 = it;
                        broadcastChannelImpl$send$1.label = 1;
                        java.lang.Object sendBroadcast$kotlinx_coroutines_core = bufferedChannel.sendBroadcast$kotlinx_coroutines_core(e2, broadcastChannelImpl$send$1);
                        if (sendBroadcast$kotlinx_coroutines_core == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        e3 = e2;
                        obj = sendBroadcast$kotlinx_coroutines_core;
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        e2 = e3;
                        if (it.hasNext()) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        broadcastChannelImpl$send$1 = new kotlinx.coroutines.channels.BroadcastChannelImpl$send$1(this, continuation);
        java.lang.Object obj3 = broadcastChannelImpl$send$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = broadcastChannelImpl$send$1.label;
        if (i != 0) {
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberBuffered;", "Lkotlinx/coroutines/channels/BufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    private final class SubscriberBuffered extends kotlinx.coroutines.channels.BufferedChannel<E> {
        /* JADX WARN: Multi-variable type inference failed */
        public SubscriberBuffered() {
            super(kotlinx.coroutines.channels.BroadcastChannelImpl.this.getCapacity(), null, 2, 0 == true ? 1 : 0);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = ((kotlinx.coroutines.channels.BroadcastChannelImpl) kotlinx.coroutines.channels.BroadcastChannelImpl.this).lock;
            kotlinx.coroutines.channels.BroadcastChannelImpl<E> broadcastChannelImpl = kotlinx.coroutines.channels.BroadcastChannelImpl.this;
            java.util.concurrent.locks.ReentrantLock reentrantLock2 = reentrantLock;
            reentrantLock2.lock();
            try {
                broadcastChannelImpl.removeSubscriber(this);
                return super.cancelImpl$kotlinx_coroutines_core(cause);
            } finally {
                reentrantLock2.unlock();
            }
        }
    }

    /* compiled from: BroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/channels/BroadcastChannelImpl$SubscriberConflated;", "Lkotlinx/coroutines/channels/ConflatedBufferedChannel;", "(Lkotlinx/coroutines/channels/BroadcastChannelImpl;)V", "cancelImpl", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    private final class SubscriberConflated extends kotlinx.coroutines.channels.ConflatedBufferedChannel<E> {
        public SubscriberConflated() {
            super(1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, null, 4, null);
        }

        @Override // kotlinx.coroutines.channels.BufferedChannel
        /* renamed from: cancelImpl, reason: merged with bridge method [inline-methods] */
        public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
            kotlinx.coroutines.channels.BroadcastChannelImpl.this.removeSubscriber(this);
            return super.cancelImpl$kotlinx_coroutines_core(cause);
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public java.lang.String toString() {
        return (this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p() ? "CONFLATED_ELEMENT=" + this.lastConflatedElement + "; " : okhttp3.HttpUrl.FRAGMENT_ENCODE_SET) + "BROADCAST=<" + super.toString() + ">; SUBSCRIBERS=" + kotlin.collections.CollectionsKt.joinToString$default(this.subscribers, ";", "<", ">", 0, null, null, 56, null);
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            kotlinx.coroutines.channels.BufferedChannel subscriberConflated = this.capacity == -1 ? new kotlinx.coroutines.channels.BroadcastChannelImpl.SubscriberConflated() : new kotlinx.coroutines.channels.BroadcastChannelImpl.SubscriberBuffered();
            if (isClosedForSend() && this.lastConflatedElement == kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()) {
                subscriberConflated.close(getCloseCause());
                return subscriberConflated;
            }
            if (this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()) {
                subscriberConflated.mo1148trySendJP2dKIU(getValue());
            }
            this.subscribers = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends kotlinx.coroutines.channels.BufferedChannel>) this.subscribers, subscriberConflated);
            reentrantLock.unlock();
            return subscriberConflated;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeSubscriber(kotlinx.coroutines.channels.ReceiveChannel<? extends E> s) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (java.lang.Object) it.next();
                if (bufferedChannel != s) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.subscribers = arrayList;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo1148trySendJP2dKIU(E element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                return super.mo1148trySendJP2dKIU(element);
            }
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((kotlinx.coroutines.channels.BufferedChannel) it.next()).shouldSendSuspend$kotlinx_coroutines_core()) {
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1172failurePtdJZtk();
                    }
                }
            }
            if (this.capacity == -1) {
                this.lastConflatedElement = element;
            }
            java.util.Iterator<T> it2 = this.subscribers.iterator();
            while (it2.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it2.next()).mo1148trySendJP2dKIU(element);
            }
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(kotlin.Unit.INSTANCE);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.channels.BufferedChannel
    public void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.lang.Object remove = this.onSendInternalResult.remove(select);
            if (remove != null) {
                select.selectInRegistrationPhase(remove);
                return;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            reentrantLock.unlock();
            kotlinx.coroutines.BuildersKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(select.getContext()), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new kotlinx.coroutines.channels.BroadcastChannelImpl$registerSelectForSend$2(this, element, select, null), 1, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it.next()).close(cause);
            }
            java.util.List<? extends kotlinx.coroutines.channels.BufferedChannel<E>> list = this.subscribers;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                kotlinx.coroutines.channels.BufferedChannel bufferedChannel = (java.lang.Object) it2.next();
                if (bufferedChannel.hasElements$kotlinx_coroutines_core()) {
                    arrayList.add(bufferedChannel);
                }
            }
            this.subscribers = arrayList;
            return super.close(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            java.util.Iterator<T> it = this.subscribers.iterator();
            while (it.hasNext()) {
                ((kotlinx.coroutines.channels.BufferedChannel) it.next()).cancelImpl$kotlinx_coroutines_core(cause);
            }
            this.lastConflatedElement = kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p();
            return super.cancelImpl$kotlinx_coroutines_core(cause);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return super.isClosedForSend();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E getValue() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (isClosedForSend()) {
                java.lang.Throwable closeCause = getCloseCause();
                if (closeCause == null) {
                    throw new java.lang.IllegalStateException("This broadcast channel is closed");
                }
                throw closeCause;
            }
            if (this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()) {
                return (E) this.lastConflatedElement;
            }
            throw new java.lang.IllegalStateException("No value".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final E getValueOrNull() {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            E e = null;
            if (!isClosedForReceive() && this.lastConflatedElement != kotlinx.coroutines.channels.BroadcastChannelKt.access$getNO_ELEMENT$p()) {
                e = (E) this.lastConflatedElement;
            }
            return e;
        } finally {
            reentrantLock.unlock();
        }
    }
}
