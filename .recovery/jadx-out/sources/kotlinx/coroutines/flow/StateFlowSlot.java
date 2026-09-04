package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0011\u0010\n\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\fJ'\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f0\u000e2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\bR\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "()V", "_state", "Lkotlinx/atomicfu/AtomicRef;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "allocateLocked", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "flow", "awaitPending", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "freeLocked", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.flow.StateFlowSlot.class, java.lang.Object.class, "_state");

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _state;

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> flow) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        symbol = kotlinx.coroutines.flow.StateFlowKt.NONE;
        atomicReferenceFieldUpdater.set(this, symbol);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> flow) {
        _state$FU.set(this, null);
        return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            symbol = kotlinx.coroutines.flow.StateFlowKt.PENDING;
            if (obj == symbol) {
                return;
            }
            symbol2 = kotlinx.coroutines.flow.StateFlowKt.NONE;
            if (obj == symbol2) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
                symbol3 = kotlinx.coroutines.flow.StateFlowKt.PENDING;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, obj, symbol3)) {
                    return;
                }
            } else {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$FU;
                symbol4 = kotlinx.coroutines.flow.StateFlowKt.NONE;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater3, this, obj, symbol4)) {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    ((kotlinx.coroutines.CancellableContinuationImpl) obj).resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean takePending() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        symbol = kotlinx.coroutines.flow.StateFlowKt.NONE;
        java.lang.Object andSet = atomicReferenceFieldUpdater.getAndSet(this, symbol);
        kotlin.jvm.internal.Intrinsics.checkNotNull(andSet);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(andSet instanceof kotlinx.coroutines.CancellableContinuationImpl))) {
            throw new java.lang.AssertionError();
        }
        symbol2 = kotlinx.coroutines.flow.StateFlowKt.PENDING;
        return andSet == symbol2;
    }

    public final java.lang.Object awaitPending(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(true ^ (_state$FU.get(this) instanceof kotlinx.coroutines.CancellableContinuationImpl))) {
            throw new java.lang.AssertionError();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        symbol = kotlinx.coroutines.flow.StateFlowKt.NONE;
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol, cancellableContinuationImpl2)) {
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = _state$FU.get(this);
                symbol2 = kotlinx.coroutines.flow.StateFlowKt.PENDING;
                if (obj != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }
}
