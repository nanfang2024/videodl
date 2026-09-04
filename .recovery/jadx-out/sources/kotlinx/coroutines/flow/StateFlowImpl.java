package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0003H\u0014J\u001d\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J&\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020(H\u0016J\u0015\u00102\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u00020\bH\u0002R\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "replayCache", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getReplayCache", "()Ljava/util/List;", "sequence", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "setValue", "collect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createSlot", "createSlotArray", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "emit", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.flow.StateFlowImpl.class, java.lang.Object.class, "_state");

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _state;
    private int sequence;

    public static /* synthetic */ void getValue$annotations() {
    }

    public StateFlowImpl(java.lang.Object obj) {
        this._state = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        kotlinx.coroutines.internal.Symbol symbol = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        T t = (T) _state$FU.get(this);
        if (t == symbol) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        if (t == null) {
            t = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        updateState(null, t);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T expect, T update) {
        if (expect == null) {
            expect = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        if (update == null) {
            update = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
        }
        return updateState(expect, update);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
        return kotlin.collections.CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        setValue(value);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        setValue(t);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new java.lang.UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ba, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, (java.lang.Object) r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:13:0x003f, B:14:0x00a9, B:16:0x00b1, B:18:0x00b6, B:20:0x00d7, B:22:0x00dd, B:26:0x00bc, B:29:0x00c3, B:38:0x005d, B:40:0x0070, B:41:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b6 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:13:0x003f, B:14:0x00a9, B:16:0x00b1, B:18:0x00b6, B:20:0x00d7, B:22:0x00dd, B:26:0x00bc, B:29:0x00c3, B:38:0x005d, B:40:0x0070, B:41:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:13:0x003f, B:14:0x00a9, B:16:0x00b1, B:18:0x00b6, B:20:0x00d7, B:22:0x00dd, B:26:0x00bc, B:29:0x00c3, B:38:0x005d, B:40:0x0070, B:41:0x0098), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00db -> B:14:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ed -> B:14:0x00a9). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlinx.coroutines.flow.StateFlowImpl<T> stateFlowImpl;
        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot;
        kotlinx.coroutines.flow.FlowCollector flowCollector2;
        kotlinx.coroutines.Job job;
        java.lang.Object obj;
        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot2;
        boolean takePending;
        T t;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) continuation;
                if ((stateFlowImpl$collect$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                    java.lang.Object obj2 = stateFlowImpl$collect$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stateFlowImpl$collect$1.label;
                    ?? r6 = 1;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        kotlinx.coroutines.flow.StateFlowSlot allocateSlot = allocateSlot();
                        try {
                            if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
                                stateFlowImpl$collect$1.L$0 = this;
                                stateFlowImpl$collect$1.L$1 = flowCollector;
                                stateFlowImpl$collect$1.L$2 = allocateSlot;
                                stateFlowImpl$collect$1.label = 1;
                                if (((kotlinx.coroutines.flow.SubscribedFlowCollector) flowCollector).onSubscription(stateFlowImpl$collect$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            stateFlowImpl = this;
                            stateFlowSlot = allocateSlot;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            stateFlowImpl = this;
                            r6 = allocateSlot;
                            stateFlowImpl.freeSlot((kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r6);
                            throw th;
                        }
                    } else if (i == 1) {
                        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot3 = (kotlinx.coroutines.flow.StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector = (kotlinx.coroutines.flow.FlowCollector) stateFlowImpl$collect$1.L$1;
                        stateFlowImpl = (kotlinx.coroutines.flow.StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        stateFlowSlot = stateFlowSlot3;
                    } else if (i == 2) {
                        obj = stateFlowImpl$collect$1.L$4;
                        job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.L$3;
                        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot4 = (kotlinx.coroutines.flow.StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) stateFlowImpl$collect$1.L$1;
                        stateFlowImpl = (kotlinx.coroutines.flow.StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        stateFlowSlot2 = stateFlowSlot4;
                        takePending = stateFlowSlot2.takePending();
                        r6 = stateFlowSlot2;
                        if (!takePending) {
                        }
                        ?? r12 = _state$FU.get(stateFlowImpl);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (r12 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = r6;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = r12;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    } else {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = stateFlowImpl$collect$1.L$4;
                        job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.L$3;
                        kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot5 = (kotlinx.coroutines.flow.StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) stateFlowImpl$collect$1.L$1;
                        stateFlowImpl = (kotlinx.coroutines.flow.StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                        r6 = stateFlowSlot5;
                        ?? r122 = _state$FU.get(stateFlowImpl);
                        if (job != null) {
                            kotlinx.coroutines.JobKt.ensureActive(job);
                        }
                        if (obj != null) {
                            stateFlowSlot2 = r6;
                        }
                        t = r122 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL ? null : r122;
                        stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = r6;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = r122;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = r122;
                        stateFlowSlot2 = r6;
                        takePending = stateFlowSlot2.takePending();
                        r6 = stateFlowSlot2;
                        if (!takePending) {
                            stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                            stateFlowImpl$collect$1.L$1 = flowCollector2;
                            stateFlowImpl$collect$1.L$2 = stateFlowSlot2;
                            stateFlowImpl$collect$1.L$3 = job;
                            stateFlowImpl$collect$1.L$4 = obj;
                            stateFlowImpl$collect$1.label = 3;
                            java.lang.Object awaitPending = stateFlowSlot2.awaitPending(stateFlowImpl$collect$1);
                            r6 = stateFlowSlot2;
                            if (awaitPending == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        ?? r1222 = _state$FU.get(stateFlowImpl);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (r1222 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = r6;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = r1222;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    }
                    flowCollector2 = flowCollector;
                    job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
                    obj = null;
                    r6 = stateFlowSlot;
                    ?? r12222 = _state$FU.get(stateFlowImpl);
                    if (job != null) {
                    }
                    if (obj != null) {
                    }
                    if (r12222 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    }
                    stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                    stateFlowImpl$collect$1.L$1 = flowCollector2;
                    stateFlowImpl$collect$1.L$2 = r6;
                    stateFlowImpl$collect$1.L$3 = job;
                    stateFlowImpl$collect$1.L$4 = r12222;
                    stateFlowImpl$collect$1.label = 2;
                    if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            flowCollector2 = flowCollector;
            job = (kotlinx.coroutines.Job) stateFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
            obj = null;
            r6 = stateFlowSlot;
            ?? r122222 = _state$FU.get(stateFlowImpl);
            if (job != null) {
            }
            if (obj != null) {
            }
            if (r122222 == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
            }
            stateFlowImpl$collect$1.L$0 = stateFlowImpl;
            stateFlowImpl$collect$1.L$1 = flowCollector2;
            stateFlowImpl$collect$1.L$2 = r6;
            stateFlowImpl$collect$1.L$3 = job;
            stateFlowImpl$collect$1.L$4 = r122222;
            stateFlowImpl$collect$1.label = 2;
            if (flowCollector2.emit(t, stateFlowImpl$collect$1) == coroutine_suspended) {
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        stateFlowImpl$collect$1 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1(this, continuation);
        java.lang.Object obj22 = stateFlowImpl$collect$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stateFlowImpl$collect$1.label;
        ?? r62 = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.StateFlowSlot createSlot() {
        return new kotlinx.coroutines.flow.StateFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.StateFlowSlot[] createSlotArray(int size) {
        return new kotlinx.coroutines.flow.StateFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return kotlinx.coroutines.flow.StateFlowKt.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }

    private final boolean updateState(java.lang.Object expectedState, java.lang.Object newState) {
        int i;
        kotlinx.coroutines.flow.StateFlowSlot[] slots;
        synchronized (this) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (expectedState != null && !kotlin.jvm.internal.Intrinsics.areEqual(obj, expectedState)) {
                return false;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, newState)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, newState);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            kotlinx.coroutines.flow.StateFlowSlot[] slots2 = getSlots();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            while (true) {
                kotlinx.coroutines.flow.StateFlowSlot[] stateFlowSlotArr = slots2;
                if (stateFlowSlotArr != null) {
                    for (kotlinx.coroutines.flow.StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            stateFlowSlot.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    slots = getSlots();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                }
                slots2 = slots;
                i3 = i;
            }
        }
    }
}
