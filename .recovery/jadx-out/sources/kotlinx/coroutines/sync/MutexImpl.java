package kotlinx.coroutines.sync;

/* compiled from: Mutex.kt */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+,B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nH\u0016J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u001b\u0010 \u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001b\u0010\"\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010!J\u001e\u0010#\u001a\u0004\u0018\u00010\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\n2\b\u0010$\u001a\u0004\u0018\u00010\nH\u0014J\u001e\u0010%\u001a\u00020\u00192\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00112\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010)\u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0012\u0010*\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R(\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eRk\u0010\u000f\u001a_\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0010j\u0002`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001cX\u0082\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl;", "Lkotlinx/coroutines/sync/SemaphoreImpl;", "Lkotlinx/coroutines/sync/Mutex;", "locked", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "isLocked", "()Z", "onLock", "Lkotlinx/coroutines/selects/SelectClause2;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getOnLock$annotations", "()V", "getOnLock", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSelectCancellationUnlockConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "owner", "Lkotlinx/atomicfu/AtomicRef;", "holdsLock", "holdsLockImpl", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lockSuspend", "onLockProcessResult", "result", "onLockRegFunction", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "tryLock", "tryLockImpl", "unlock", "CancellableContinuationWithOwner", "SelectInstanceWithOwner", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class MutexImpl extends kotlinx.coroutines.sync.SemaphoreImpl implements kotlinx.coroutines.sync.Mutex {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater owner$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.sync.MutexImpl.class, java.lang.Object.class, "owner");
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onSelectCancellationUnlockConstructor;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object owner;

    public static /* synthetic */ void getOnLock$annotations() {
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public java.lang.Object lock(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return lock$suspendImpl(this, obj, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner = z ? null : kotlinx.coroutines.sync.MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends kotlin.Unit>>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> invoke(kotlinx.coroutines.selects.SelectInstance<?> selectInstance, final java.lang.Object obj, java.lang.Object obj2) {
                final kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
                return new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$onSelectCancellationUnlockConstructor$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        kotlinx.coroutines.sync.MutexImpl.this.unlock(obj);
                    }
                };
            }
        };
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(java.lang.Object owner) {
        return holdsLockImpl(owner) == 1;
    }

    private final int holdsLockImpl(java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        while (isLocked()) {
            java.lang.Object obj = owner$FU.get(this);
            symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
            if (obj != symbol) {
                return obj == owner ? 1 : 2;
            }
        }
        return 0;
    }

    static /* synthetic */ java.lang.Object lock$suspendImpl(kotlinx.coroutines.sync.MutexImpl mutexImpl, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object lockSuspend;
        return (!mutexImpl.tryLock(obj) && (lockSuspend = mutexImpl.lockSuspend(obj, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? lockSuspend : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(java.lang.Object owner) {
        int tryLockImpl = tryLockImpl(owner);
        if (tryLockImpl == 0) {
            return true;
        }
        if (tryLockImpl == 1) {
            return false;
        }
        if (tryLockImpl == 2) {
            throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
        }
        throw new java.lang.IllegalStateException("unexpected".toString());
    }

    private final int tryLockImpl(java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        while (!tryAcquire()) {
            if (owner == null) {
                return 1;
            }
            int holdsLockImpl = holdsLockImpl(owner);
            if (holdsLockImpl == 1) {
                return 2;
            }
            if (holdsLockImpl == 2) {
                return 1;
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            java.lang.Object obj = owner$FU.get(this);
            symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
            if (obj != symbol) {
                throw new java.lang.AssertionError();
            }
        }
        owner$FU.set(this, owner);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        while (isLocked()) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$FU;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
            if (obj != symbol) {
                if (obj != owner && owner != null) {
                    throw new java.lang.IllegalStateException(("This mutex is locked by " + obj + ", but " + owner + " is expected").toString());
                }
                symbol2 = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, symbol2)) {
                    release();
                    return;
                }
            }
        }
        throw new java.lang.IllegalStateException("This mutex is not locked".toString());
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public kotlinx.coroutines.selects.SelectClause2<java.lang.Object, kotlinx.coroutines.sync.Mutex> getOnLock() {
        kotlinx.coroutines.sync.MutexImpl$onLock$1 mutexImpl$onLock$1 = kotlinx.coroutines.sync.MutexImpl$onLock$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$1, 3);
        kotlinx.coroutines.sync.MutexImpl$onLock$2 mutexImpl$onLock$2 = kotlinx.coroutines.sync.MutexImpl$onLock$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.SelectClause2Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(mutexImpl$onLock$2, 3), this.onSelectCancellationUnlockConstructor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onLockRegFunction(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object owner) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (owner != null && holdsLock(owner)) {
            symbol = kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER;
            select.selectInRegistrationPhase(symbol);
        } else {
            kotlin.jvm.internal.Intrinsics.checkNotNull(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            onAcquireRegFunction(new kotlinx.coroutines.sync.MutexImpl.SelectInstanceWithOwner((kotlinx.coroutines.selects.SelectInstanceInternal) select, owner), owner);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public java.lang.Object onLockProcessResult(java.lang.Object owner, java.lang.Object result) {
        kotlinx.coroutines.internal.Symbol symbol;
        symbol = kotlinx.coroutines.sync.MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER;
        if (kotlin.jvm.internal.Intrinsics.areEqual(result, symbol)) {
            throw new java.lang.IllegalStateException(("This mutex is already locked by the specified owner: " + owner).toString());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0001J\u0011\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0007H\u0097\u0001J\t\u0010\u0017\u001a\u00020\u0002H\u0097\u0001J2\u0010\u0018\u001a\u00020\u00022'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00020\u001aj\u0002`\u001dH\u0096\u0001J\u001d\u0010\u0018\u001a\u00020\u00022\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010 \u001a\u00020!H\u0096\u0001J:\u0010\"\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u00022#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010%J\u001f\u0010&\u001a\u00020\u00022\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(H\u0096\u0001ø\u0001\u0000¢\u0006\u0002\u0010)J$\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0007H\u0097\u0001¢\u0006\u0002\u0010,JF\u0010*\u001a\u0004\u0018\u00010\u00072\u0006\u0010#\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010\u00072#\u0010$\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001aH\u0016¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u0004\u0018\u00010\u00072\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001J\u001a\u00100\u001a\u00020\u0002*\u0002012\u0006\u0010#\u001a\u00020\u0002H\u0097\u0001¢\u0006\u0002\u00102J\u0015\u00103\u001a\u00020\u0002*\u0002012\u0006\u0010/\u001a\u00020\u0014H\u0097\u0001R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000fR\u0012\u0010\u0010\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u0012\u0010\u0011\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner;", "Lkotlinx/coroutines/CancellableContinuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "owner", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/CancellableContinuationImpl;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "isActive", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "isCancelled", "isCompleted", "cancel", "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "completeResume", "token", "initCancellability", "invokeOnCancellation", "handler", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "resume", "value", "onCancellation", "(Lkotlin/Unit;Lkotlin/jvm/functions/Function1;)V", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "tryResume", "idempotent", "(Lkotlin/Unit;Ljava/lang/Object;)Ljava/lang/Object;", "(Lkotlin/Unit;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tryResumeWithException", "exception", "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/Unit;)V", "resumeUndispatchedWithException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public final class CancellableContinuationWithOwner implements kotlinx.coroutines.CancellableContinuation<kotlin.Unit>, kotlinx.coroutines.Waiter {
        public final kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cont;
        public final java.lang.Object owner;

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(java.lang.Throwable cause) {
            return this.cont.cancel(cause);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void completeResume(java.lang.Object token) {
            this.cont.completeResume(token);
        }

        @Override // kotlin.coroutines.Continuation
        public kotlin.coroutines.CoroutineContext getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
            this.cont.invokeOnCancellation(handler);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            this.cont.invokeOnCancellation(segment, index);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatched(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.Unit unit) {
            this.cont.resumeUndispatched(coroutineDispatcher, unit);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void resumeUndispatchedWithException(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.Throwable th) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th);
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(java.lang.Object result) {
            this.cont.resumeWith(result);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public java.lang.Object tryResume(kotlin.Unit value, java.lang.Object idempotent) {
            return this.cont.tryResume(value, idempotent);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public java.lang.Object tryResumeWithException(java.lang.Throwable exception) {
            return this.cont.tryResumeWithException(exception);
        }

        public CancellableContinuationWithOwner(kotlinx.coroutines.CancellableContinuationImpl<? super kotlin.Unit> cancellableContinuationImpl, java.lang.Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ void resume(kotlin.Unit unit, kotlin.jvm.functions.Function1 function1) {
            resume2(unit, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public /* bridge */ /* synthetic */ java.lang.Object tryResume(kotlin.Unit unit, java.lang.Object obj, kotlin.jvm.functions.Function1 function1) {
            return tryResume2(unit, obj, (kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit>) function1);
        }

        /* renamed from: tryResume, reason: avoid collision after fix types in other method */
        public java.lang.Object tryResume2(kotlin.Unit value, java.lang.Object idempotent, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.owner$FU.get(mutexImpl);
                symbol2 = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol2) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cancellableContinuationImpl = this.cont;
            final kotlinx.coroutines.sync.MutexImpl mutexImpl2 = kotlinx.coroutines.sync.MutexImpl.this;
            java.lang.Object tryResume = cancellableContinuationImpl.tryResume(value, idempotent, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$tryResume$token$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    kotlinx.coroutines.internal.Symbol symbol3;
                    kotlinx.coroutines.sync.MutexImpl mutexImpl3 = kotlinx.coroutines.sync.MutexImpl.this;
                    kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner = this;
                    if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                        java.lang.Object obj2 = kotlinx.coroutines.sync.MutexImpl.owner$FU.get(mutexImpl3);
                        symbol3 = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                        if (obj2 != symbol3 && obj2 != cancellableContinuationWithOwner.owner) {
                            throw new java.lang.AssertionError();
                        }
                    }
                    kotlinx.coroutines.sync.MutexImpl.owner$FU.set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
                    kotlinx.coroutines.sync.MutexImpl.this.unlock(this.owner);
                }
            });
            if (tryResume != null) {
                kotlinx.coroutines.sync.MutexImpl mutexImpl3 = kotlinx.coroutines.sync.MutexImpl.this;
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    java.lang.Object obj2 = kotlinx.coroutines.sync.MutexImpl.owner$FU.get(mutexImpl3);
                    symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                    if (obj2 != symbol) {
                        throw new java.lang.AssertionError();
                    }
                }
                kotlinx.coroutines.sync.MutexImpl.owner$FU.set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
            }
            return tryResume;
        }

        /* renamed from: resume, reason: avoid collision after fix types in other method */
        public void resume2(kotlin.Unit value, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> onCancellation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.owner$FU.get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.sync.MutexImpl.owner$FU.set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
            kotlinx.coroutines.CancellableContinuationImpl<kotlin.Unit> cancellableContinuationImpl = this.cont;
            final kotlinx.coroutines.sync.MutexImpl mutexImpl2 = kotlinx.coroutines.sync.MutexImpl.this;
            cancellableContinuationImpl.resume(value, new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.sync.MutexImpl$CancellableContinuationWithOwner$resume$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    kotlinx.coroutines.sync.MutexImpl.this.unlock(this.owner);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096\u0001J\u001d\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0096\u0001J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0016R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner;", "Q", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "select", "owner", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/sync/MutexImpl;Lkotlinx/coroutines/selects/SelectInstanceInternal;Ljava/lang/Object;)V", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "disposeOnCompletion", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "selectInRegistrationPhase", "internalResult", "trySelect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "clauseObject", "result", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public final class SelectInstanceWithOwner<Q> implements kotlinx.coroutines.selects.SelectInstanceInternal<Q> {
        public final java.lang.Object owner;
        public final kotlinx.coroutines.selects.SelectInstanceInternal<Q> select;

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(kotlinx.coroutines.DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public kotlin.coroutines.CoroutineContext getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            this.select.invokeOnCancellation(segment, index);
        }

        public SelectInstanceWithOwner(kotlinx.coroutines.selects.SelectInstanceInternal<Q> selectInstanceInternal, java.lang.Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(java.lang.Object clauseObject, java.lang.Object result) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.owner$FU.get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            boolean trySelect = this.select.trySelect(clauseObject, result);
            kotlinx.coroutines.sync.MutexImpl mutexImpl2 = kotlinx.coroutines.sync.MutexImpl.this;
            if (trySelect) {
                kotlinx.coroutines.sync.MutexImpl.owner$FU.set(mutexImpl2, this.owner);
            }
            return trySelect;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(java.lang.Object internalResult) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.sync.MutexImpl mutexImpl = kotlinx.coroutines.sync.MutexImpl.this;
            if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                java.lang.Object obj = kotlinx.coroutines.sync.MutexImpl.owner$FU.get(mutexImpl);
                symbol = kotlinx.coroutines.sync.MutexKt.NO_OWNER;
                if (obj != symbol) {
                    throw new java.lang.AssertionError();
                }
            }
            kotlinx.coroutines.sync.MutexImpl.owner$FU.set(kotlinx.coroutines.sync.MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(internalResult);
        }
    }

    public java.lang.String toString() {
        return "Mutex@" + kotlinx.coroutines.DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$FU.get(this) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object lockSuspend(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            acquire((kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit>) new kotlinx.coroutines.sync.MutexImpl.CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
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
}
