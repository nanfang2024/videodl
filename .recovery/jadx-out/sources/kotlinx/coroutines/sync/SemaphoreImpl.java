package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0016\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0017Jb\u0010\u0016\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u00182\u0006\u0010\u0019\u001a\u0002H\u00182!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u001d0\u00122!\u0010\u001e\u001a\u001d\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0012H\u0083\b¢\u0006\u0002\u0010\u001fJ\u0016\u0010\u0016\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140 H\u0005J\u0011\u0010!\u001a\u00020\u0014H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020\u0003H\u0002J\u001e\u0010&\u001a\u00020\u00142\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0004J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u001dH\u0016J\b\u0010-\u001a\u00020\u001dH\u0002J\f\u0010.\u001a\u00020\u001d*\u00020*H\u0002R\t\u0010\u0006\u001a\u00020\u0007X\u0082\u0004R\u0014\u0010\b\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\t\u0010\u000b\u001a\u00020\fX\u0082\u0004R\t\u0010\r\u001a\u00020\fX\u0082\u0004R\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Semaphore;", "permits", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "acquiredPermits", "(II)V", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "enqIdx", "head", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "onCancellationRelease", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "tail", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "W", "waiter", "suspend", "Lkotlin/ParameterName;", "name", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/CancellableContinuation;", "acquireSlowPath", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "coerceAvailablePermitsAtMaximum", "decPermits", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, tool.wu.heng.BuildConfig.BUILD_TYPE, "tryAcquire", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class SemaphoreImpl implements kotlinx.coroutines.sync.Semaphore {

    @kotlin.jvm.Volatile
    private volatile int _availablePermits;

    @kotlin.jvm.Volatile
    private volatile long deqIdx;

    @kotlin.jvm.Volatile
    private volatile long enqIdx;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object head;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellationRelease;
    private final int permits;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object tail;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreImpl.class, java.lang.Object.class, "head");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreImpl.class, "deqIdx");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreImpl.class, java.lang.Object.class, "tail");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreImpl.class, "enqIdx");
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.sync.SemaphoreImpl.class, "_availablePermits");

    @Override // kotlinx.coroutines.sync.Semaphore
    public java.lang.Object acquire(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return acquire$suspendImpl(this, continuation);
    }

    public SemaphoreImpl(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new java.lang.IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = new kotlinx.coroutines.sync.SemaphoreSegment(0L, null, 2);
        this.head = semaphoreSegment;
        this.tail = semaphoreSegment;
        this._availablePermits = i - i2;
        this.onCancellationRelease = new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                invoke2(th);
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(java.lang.Throwable th) {
                kotlinx.coroutines.sync.SemaphoreImpl.this.release();
            }
        };
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return java.lang.Math.max(_availablePermits$FU.get(this), 0);
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        while (true) {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _availablePermits$FU;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    static /* synthetic */ java.lang.Object acquire$suspendImpl(kotlinx.coroutines.sync.SemaphoreImpl semaphoreImpl, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (semaphoreImpl.decPermits() > 0) {
            return kotlin.Unit.INSTANCE;
        }
        java.lang.Object acquireSlowPath = semaphoreImpl.acquireSlowPath(continuation);
        return acquireSlowPath == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? acquireSlowPath : kotlin.Unit.INSTANCE;
    }

    private final <W> void acquire(W waiter, kotlin.jvm.functions.Function1<? super W, java.lang.Boolean> suspend, kotlin.jvm.functions.Function1<? super W, kotlin.Unit> onAcquired) {
        while (decPermits() <= 0) {
            if (suspend.invoke(waiter).booleanValue()) {
                return;
            }
        }
        onAcquired.invoke(waiter);
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
        do {
            int andIncrement = _availablePermits$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new java.lang.IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    private final void coerceAvailablePermitsAtMaximum() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        int i2;
        do {
            atomicIntegerFieldUpdater = _availablePermits$FU;
            i = atomicIntegerFieldUpdater.get(this);
            i2 = this.permits;
            if (i <= i2) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(kotlinx.coroutines.Waiter waiter) {
        int i;
        java.lang.Object findSegmentInternal;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$FU;
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = (kotlinx.coroutines.sync.SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = enqIdx$FU.getAndIncrement(this);
        kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        i = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        long j = andIncrement / i;
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m1209getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m1209getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1209getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment2 = (kotlinx.coroutines.sync.SemaphoreSegment) kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
        i2 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        int i3 = (int) (andIncrement % i2);
        if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i3, null, waiter)) {
            waiter.invokeOnCancellation(semaphoreSegment2, i3);
            return true;
        }
        symbol = kotlinx.coroutines.sync.SemaphoreKt.PERMIT;
        symbol2 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN;
        if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i3, symbol, symbol2)) {
            if (waiter instanceof kotlinx.coroutines.CancellableContinuation) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                ((kotlinx.coroutines.CancellableContinuation) waiter).resume(kotlin.Unit.INSTANCE, this.onCancellationRelease);
            } else if (waiter instanceof kotlinx.coroutines.selects.SelectInstance) {
                ((kotlinx.coroutines.selects.SelectInstance) waiter).selectInRegistrationPhase(kotlin.Unit.INSTANCE);
            } else {
                throw new java.lang.IllegalStateException(("unexpected: " + waiter).toString());
            }
            return true;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            return false;
        }
        java.lang.Object obj = semaphoreSegment2.getAcquirers().get(i3);
        symbol3 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN;
        if (obj == symbol3) {
            return false;
        }
        throw new java.lang.AssertionError();
    }

    private final boolean tryResumeNextFromQueue() {
        int i;
        java.lang.Object findSegmentInternal;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        int i3;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$FU;
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment = (kotlinx.coroutines.sync.SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = deqIdx$FU.getAndIncrement(this);
        i = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        long j = andIncrement / i;
        kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                break;
            }
            kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
            while (true) {
                kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= m1209getSegmentimpl.id) {
                    break loop0;
                }
                if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m1209getSegmentimpl)) {
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m1209getSegmentimpl.remove();
                }
            }
        }
        kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment2 = (kotlinx.coroutines.sync.SemaphoreSegment) kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
        semaphoreSegment2.cleanPrev();
        if (semaphoreSegment2.id > j) {
            return false;
        }
        i2 = kotlinx.coroutines.sync.SemaphoreKt.SEGMENT_SIZE;
        int i4 = (int) (andIncrement % i2);
        symbol = kotlinx.coroutines.sync.SemaphoreKt.PERMIT;
        java.lang.Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i4, symbol);
        if (andSet == null) {
            i3 = kotlinx.coroutines.sync.SemaphoreKt.MAX_SPIN_CYCLES;
            for (int i5 = 0; i5 < i3; i5++) {
                java.lang.Object obj = semaphoreSegment2.getAcquirers().get(i4);
                symbol5 = kotlinx.coroutines.sync.SemaphoreKt.TAKEN;
                if (obj == symbol5) {
                    return true;
                }
            }
            symbol3 = kotlinx.coroutines.sync.SemaphoreKt.PERMIT;
            symbol4 = kotlinx.coroutines.sync.SemaphoreKt.BROKEN;
            return !kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(semaphoreSegment2.getAcquirers(), i4, symbol3, symbol4);
        }
        symbol2 = kotlinx.coroutines.sync.SemaphoreKt.CANCELLED;
        if (andSet == symbol2) {
            return false;
        }
        return tryResumeAcquire(andSet);
    }

    private final boolean tryResumeAcquire(java.lang.Object obj) {
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            kotlinx.coroutines.CancellableContinuation cancellableContinuation = (kotlinx.coroutines.CancellableContinuation) obj;
            java.lang.Object tryResume = cancellableContinuation.tryResume(kotlin.Unit.INSTANCE, null, this.onCancellationRelease);
            if (tryResume == null) {
                return false;
            }
            cancellableContinuation.completeResume(tryResume);
            return true;
        }
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            return ((kotlinx.coroutines.selects.SelectInstance) obj).trySelect(this, kotlin.Unit.INSTANCE);
        }
        throw new java.lang.IllegalStateException(("unexpected: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object acquireSlowPath(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>) orCreateCancellableContinuation);
            }
            java.lang.Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void acquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> waiter) {
        while (decPermits() <= 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(waiter, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((kotlinx.coroutines.Waiter) waiter)) {
                return;
            }
        }
        waiter.resume(kotlin.Unit.INSTANCE, this.onCancellationRelease);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void onAcquireRegFunction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        while (decPermits() <= 0) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((kotlinx.coroutines.Waiter) select)) {
                return;
            }
        }
        select.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
    }
}
