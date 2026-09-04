package kotlinx.coroutines.flow;

/* compiled from: SharedFlow.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001hB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020,2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020,H\u0002J\u001f\u00103\u001a\u0002042\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0096@ø\u0001\u0000¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020,2\u0006\u00109\u001a\u00020\u0012H\u0002J\b\u0010:\u001a\u00020\u0003H\u0014J\u001d\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e2\u0006\u0010<\u001a\u00020\bH\u0014¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020,H\u0002J\u0019\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0019\u0010B\u001a\u00020,2\u0006\u0010@\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0012\u0010C\u001a\u00020,2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0002J1\u0010E\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0014\u0010G\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000eH\u0002¢\u0006\u0002\u0010HJ&\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000J2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010N\u001a\u0004\u0018\u00010\u000f2\u0006\u0010O\u001a\u00020\u0012H\u0002J7\u0010P\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0010\u0010Q\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000e2\u0006\u0010R\u001a\u00020\b2\u0006\u0010S\u001a\u00020\bH\u0002¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020,H\u0016J\u0015\u0010V\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010XJ\u0015\u0010Y\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0015\u0010Z\u001a\u00020W2\u0006\u0010@\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010XJ\u0010\u0010[\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0003H\u0002J\u0012\u0010\\\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020\u0003H\u0002J(\u0010]\u001a\u00020,2\u0006\u0010^\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u00122\u0006\u0010`\u001a\u00020\u00122\u0006\u0010a\u001a\u00020\u0012H\u0002J%\u0010b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010F0\u000e2\u0006\u0010c\u001a\u00020\u0012H\u0000¢\u0006\u0004\bd\u0010eJ\r\u0010f\u001a\u00020\u0012H\u0000¢\u0006\u0002\bgR\u001a\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u000e\u0010 \u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006i"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "[Ljava/lang/Object;", "bufferEndIndex", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "lastReplayedLocked", "getLastReplayedLocked$annotations", "()V", "getLastReplayedLocked", "()Ljava/lang/Object;", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class SharedFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.SharedFlowSlot> implements kotlinx.coroutines.flow.MutableSharedFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private java.lang.Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* compiled from: SharedFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kotlinx.coroutines.channels.BufferOverflow.values().length];
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    protected static /* synthetic */ void getLastReplayedLocked$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        return collect$suspendImpl(this, flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return emit$suspendImpl(this, t, continuation);
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    public SharedFlowImpl(int i, int i2, kotlinx.coroutines.channels.BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return java.lang.Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + this.bufferSize) - this.replayIndex);
    }

    private final long getBufferEndIndex() {
        return getHead() + this.bufferSize;
    }

    private final long getQueueEndIndex() {
        return getHead() + this.bufferSize + this.queueSize;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final T getLastReplayedLocked() {
        java.lang.Object[] objArr = this.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        return (T) kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr, (this.replayIndex + getReplaySize()) - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.SharedFlowImpl$collect$1 sharedFlowImpl$collect$1;
        int i;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl2;
        java.lang.Throwable th;
        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.flow.FlowCollector flowCollector3;
        java.lang.Object tryTakeValue;
        kotlinx.coroutines.Job job2;
        kotlinx.coroutines.flow.FlowCollector flowCollector4;
        if (continuation instanceof kotlinx.coroutines.flow.SharedFlowImpl$collect$1) {
            sharedFlowImpl$collect$1 = (kotlinx.coroutines.flow.SharedFlowImpl$collect$1) continuation;
            if ((sharedFlowImpl$collect$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                sharedFlowImpl$collect$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = sharedFlowImpl$collect$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = sharedFlowImpl$collect$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.SharedFlowSlot allocateSlot = sharedFlowImpl.allocateSlot();
                    try {
                        if (flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector) {
                            sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                            sharedFlowImpl$collect$1.L$1 = flowCollector;
                            sharedFlowImpl$collect$1.L$2 = allocateSlot;
                            sharedFlowImpl$collect$1.label = 1;
                            if (((kotlinx.coroutines.flow.SubscribedFlowCollector) flowCollector).onSubscription(sharedFlowImpl$collect$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        flowCollector2 = flowCollector;
                        sharedFlowSlot = allocateSlot;
                    } catch (java.lang.Throwable th2) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th = th2;
                        sharedFlowSlot = allocateSlot;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            job2 = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.L$3;
                            sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) sharedFlowImpl$collect$1.L$2;
                            flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = (kotlinx.coroutines.flow.SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        } else {
                            if (i != 3) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            job2 = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.L$3;
                            sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) sharedFlowImpl$collect$1.L$2;
                            flowCollector4 = (kotlinx.coroutines.flow.FlowCollector) sharedFlowImpl$collect$1.L$1;
                            sharedFlowImpl2 = (kotlinx.coroutines.flow.SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        }
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            flowCollector3 = flowCollector4;
                            job = job2;
                            sharedFlowImpl = sharedFlowImpl2;
                            while (true) {
                                tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
                                if (tryTakeValue == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = flowCollector3;
                                    sharedFlowImpl$collect$1.L$2 = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.L$3 = job;
                                    sharedFlowImpl$collect$1.label = 2;
                                    if (sharedFlowImpl.awaitValue(sharedFlowSlot, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (job != null) {
                                        kotlinx.coroutines.JobKt.ensureActive(job);
                                    }
                                    sharedFlowImpl$collect$1.L$0 = sharedFlowImpl;
                                    sharedFlowImpl$collect$1.L$1 = flowCollector3;
                                    sharedFlowImpl$collect$1.L$2 = sharedFlowSlot;
                                    sharedFlowImpl$collect$1.L$3 = job;
                                    sharedFlowImpl$collect$1.label = 3;
                                    if (flowCollector3.emit(tryTakeValue, sharedFlowImpl$collect$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } catch (java.lang.Throwable th3) {
                            th = th3;
                        }
                    } else {
                        sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) sharedFlowImpl$collect$1.L$2;
                        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector5 = (kotlinx.coroutines.flow.FlowCollector) sharedFlowImpl$collect$1.L$1;
                        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl3 = (kotlinx.coroutines.flow.SharedFlowImpl) sharedFlowImpl$collect$1.L$0;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            flowCollector2 = flowCollector5;
                            sharedFlowImpl = sharedFlowImpl3;
                        } catch (java.lang.Throwable th4) {
                            th = th4;
                            sharedFlowImpl2 = sharedFlowImpl3;
                        }
                    }
                    sharedFlowImpl2.freeSlot(sharedFlowSlot);
                    throw th;
                }
                job = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
                flowCollector3 = flowCollector2;
                while (true) {
                    tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
                    if (tryTakeValue == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                    }
                }
            }
        }
        sharedFlowImpl$collect$1 = new kotlinx.coroutines.flow.SharedFlowImpl$collect$1(sharedFlowImpl, continuation);
        java.lang.Object obj2 = sharedFlowImpl$collect$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = sharedFlowImpl$collect$1.label;
        if (i != 0) {
        }
        job = (kotlinx.coroutines.Job) sharedFlowImpl$collect$1.getContext().get(kotlinx.coroutines.Job.INSTANCE);
        flowCollector3 = flowCollector2;
        while (true) {
            tryTakeValue = sharedFlowImpl.tryTakeValue(sharedFlowSlot);
            if (tryTakeValue == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        int i;
        boolean z;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(value)) {
                continuationArr = findSlotsToResumeLocked(continuationArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : continuationArr) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                continuation.resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
            }
        }
        return z;
    }

    static /* synthetic */ <T> java.lang.Object emit$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl, T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emitSuspend;
        return (!sharedFlowImpl.tryEmit(t) && (emitSuspend = sharedFlowImpl.emitSuspend(t, continuation)) == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? emitSuspend : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T value) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(value);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = kotlinx.coroutines.flow.SharedFlowImpl.WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        enqueueLocked(value);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T value) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getNCollectors() != 0) {
            throw new java.lang.AssertionError();
        }
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(value);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + this.bufferSize;
        return true;
    }

    private final void dropOldestLocked() {
        java.lang.Object[] objArr = this.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && getHead() != head) {
            throw new java.lang.AssertionError();
        }
    }

    private final void correctCollectorIndexesOnDropOldest(long newHead) {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(sharedFlowImpl) != 0 && (access$getSlots = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(sharedFlowImpl)) != null) {
            for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : access$getSlots) {
                if (abstractSharedFlowSlot != null) {
                    kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < newHead) {
                        sharedFlowSlot.index = newHead;
                    }
                }
            }
        }
        this.minCollectorIndex = newHead;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(java.lang.Object item) {
        int totalSize = getTotalSize();
        java.lang.Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = growBuffer(null, 0, 2);
        } else if (totalSize >= objArr.length) {
            objArr = growBuffer(objArr, totalSize, objArr.length * 2);
        }
        kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, getHead() + totalSize, item);
    }

    private final java.lang.Object[] growBuffer(java.lang.Object[] curBuffer, int curSize, int newSize) {
        if (newSize <= 0) {
            throw new java.lang.IllegalStateException("Buffer size overflow".toString());
        }
        java.lang.Object[] objArr = new java.lang.Object[newSize];
        this.buffer = objArr;
        if (curBuffer == null) {
            return objArr;
        }
        long head = getHead();
        for (int i = 0; i < curSize; i++) {
            long j = i + head;
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, j, kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(curBuffer, j));
        }
        return objArr;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long oldIndex) {
        long j;
        long j2;
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && oldIndex < this.minCollectorIndex) {
            throw new java.lang.AssertionError();
        }
        if (oldIndex > this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j3 = this.bufferSize + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j3++;
        }
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(sharedFlowImpl) != 0 && (access$getSlots = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(sharedFlowImpl)) != null) {
            for (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot : access$getSlots) {
                if (abstractSharedFlowSlot != null) {
                    kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot;
                    if (sharedFlowSlot.index >= 0 && sharedFlowSlot.index < j3) {
                        j3 = sharedFlowSlot.index;
                    }
                }
            }
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && j3 < this.minCollectorIndex) {
            throw new java.lang.AssertionError();
        }
        if (j3 <= this.minCollectorIndex) {
            return kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int min = getNCollectors() > 0 ? java.lang.Math.min(this.queueSize, this.bufferCapacity - ((int) (bufferEndIndex - j3))) : this.queueSize;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        long j4 = this.queueSize + bufferEndIndex;
        if (min > 0) {
            continuationArr = new kotlin.coroutines.Continuation[min];
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            long j5 = bufferEndIndex;
            int i = 0;
            while (true) {
                if (bufferEndIndex >= j4) {
                    j = j3;
                    break;
                }
                java.lang.Object access$getBufferAt = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr, bufferEndIndex);
                j = j3;
                if (access$getBufferAt != kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(access$getBufferAt, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter = (kotlinx.coroutines.flow.SharedFlowImpl.Emitter) access$getBufferAt;
                    int i2 = i + 1;
                    continuationArr[i] = emitter.cont;
                    kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, bufferEndIndex, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE);
                    kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, j5, emitter.value);
                    j2 = 1;
                    j5++;
                    if (i2 >= min) {
                        break;
                    }
                    i = i2;
                } else {
                    j2 = 1;
                }
                bufferEndIndex += j2;
                j3 = j;
            }
            bufferEndIndex = j5;
        } else {
            j = j3;
        }
        int i3 = (int) (bufferEndIndex - head);
        long j6 = getNCollectors() == 0 ? bufferEndIndex : j;
        long max = java.lang.Math.max(this.replayIndex, bufferEndIndex - java.lang.Math.min(this.replay, i3));
        if (this.bufferCapacity == 0 && max < j4) {
            java.lang.Object[] objArr2 = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr2, max), kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE)) {
                bufferEndIndex++;
                max++;
            }
        }
        updateBufferLocked(max, j6, bufferEndIndex, j4);
        cleanupTailLocked();
        return (continuationArr.length == 0) ^ true ? findSlotsToResumeLocked(continuationArr) : continuationArr;
    }

    private final void updateBufferLocked(long newReplayIndex, long newMinCollectorIndex, long newBufferEndIndex, long newQueueEndIndex) {
        long min = java.lang.Math.min(newMinCollectorIndex, newReplayIndex);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && min < getHead()) {
            throw new java.lang.AssertionError();
        }
        for (long head = getHead(); head < min; head++) {
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, head, null);
        }
        this.replayIndex = newReplayIndex;
        this.minCollectorIndex = newMinCollectorIndex;
        this.bufferSize = (int) (newBufferEndIndex - min);
        this.queueSize = (int) (newQueueEndIndex - newBufferEndIndex);
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.bufferSize < 0) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.queueSize < 0) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.replayIndex > getHead() + this.bufferSize) {
            throw new java.lang.AssertionError();
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            while (this.queueSize > 0 && kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr, (getHead() + getTotalSize()) - 1) == kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, getHead() + getTotalSize(), null);
            }
        }
    }

    private final java.lang.Object tryTakeValue(kotlinx.coroutines.flow.SharedFlowSlot slot) {
        java.lang.Object obj;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            long tryPeekLocked = tryPeekLocked(slot);
            if (tryPeekLocked < 0) {
                obj = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE;
            } else {
                long j = slot.index;
                java.lang.Object peekedValueLockedAt = getPeekedValueLockedAt(tryPeekLocked);
                slot.index = tryPeekLocked + 1;
                continuationArr = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                obj = peekedValueLockedAt;
            }
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation : continuationArr) {
            if (continuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                continuation.resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(kotlinx.coroutines.flow.SharedFlowSlot slot) {
        long j = slot.index;
        if (j < getBufferEndIndex()) {
            return j;
        }
        if (this.bufferCapacity <= 0 && j <= getHead() && this.queueSize != 0) {
            return j;
        }
        return -1L;
    }

    private final java.lang.Object getPeekedValueLockedAt(long index) {
        java.lang.Object[] objArr = this.buffer;
        kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
        java.lang.Object access$getBufferAt = kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr, index);
        return access$getBufferAt instanceof kotlinx.coroutines.flow.SharedFlowImpl.Emitter ? ((kotlinx.coroutines.flow.SharedFlowImpl.Emitter) access$getBufferAt).value : access$getBufferAt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final kotlin.coroutines.Continuation<kotlin.Unit>[] findSlotsToResumeLocked(kotlin.coroutines.Continuation<kotlin.Unit>[] resumesIn) {
        kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] access$getSlots;
        kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot;
        kotlin.coroutines.Continuation<? super kotlin.Unit> continuation;
        int length = resumesIn.length;
        kotlinx.coroutines.flow.SharedFlowImpl<T> sharedFlowImpl = this;
        if (kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getNCollectors(sharedFlowImpl) != 0 && (access$getSlots = kotlinx.coroutines.flow.internal.AbstractSharedFlow.access$getSlots(sharedFlowImpl)) != null) {
            int length2 = access$getSlots.length;
            int i = 0;
            resumesIn = resumesIn;
            while (i < length2) {
                kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot abstractSharedFlowSlot = access$getSlots[i];
                if (abstractSharedFlowSlot != null && (continuation = (sharedFlowSlot = (kotlinx.coroutines.flow.SharedFlowSlot) abstractSharedFlowSlot).cont) != null && tryPeekLocked(sharedFlowSlot) >= 0) {
                    int length3 = resumesIn.length;
                    resumesIn = resumesIn;
                    if (length >= length3) {
                        ?? copyOf = java.util.Arrays.copyOf(resumesIn, java.lang.Math.max(2, resumesIn.length * 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        resumesIn = copyOf;
                    }
                    resumesIn[length] = continuation;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                resumesIn = resumesIn;
            }
        }
        return resumesIn;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.SharedFlowSlot createSlot() {
        return new kotlinx.coroutines.flow.SharedFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public kotlinx.coroutines.flow.SharedFlowSlot[] createSlotArray(int size) {
        return new kotlinx.coroutines.flow.SharedFlowSlot[size];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext context, int capacity, kotlinx.coroutines.channels.BufferOverflow onBufferOverflow) {
        return kotlinx.coroutines.flow.SharedFlowKt.fuseSharedFlow(this, context, capacity, onBufferOverflow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SharedFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\nH\u0016R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "value", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cont", "Lkotlin/coroutines/Continuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Emitter implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.coroutines.Continuation<kotlin.Unit> cont;
        public final kotlinx.coroutines.flow.SharedFlowImpl<?> flow;
        public long index;
        public final java.lang.Object value;

        public Emitter(kotlinx.coroutines.flow.SharedFlowImpl<?> sharedFlowImpl, long j, java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = continuation;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(replaySize);
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr, this.replayIndex + i));
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object emitSuspend(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr;
        kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlin.coroutines.Continuation<kotlin.Unit>[] continuationArr2 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t)) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
                continuationArr = findSlotsToResumeLocked(continuationArr2);
                emitter = null;
            } else {
                kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter2 = new kotlinx.coroutines.flow.SharedFlowImpl.Emitter(this, getTotalSize() + getHead(), t, cancellableContinuationImpl2);
                enqueueLocked(emitter2);
                this.queueSize++;
                if (this.bufferCapacity == 0) {
                    continuationArr2 = findSlotsToResumeLocked(continuationArr2);
                }
                continuationArr = continuationArr2;
                emitter = emitter2;
            }
        }
        if (emitter != null) {
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl2, emitter);
        }
        for (kotlin.coroutines.Continuation<kotlin.Unit> continuation2 : continuationArr) {
            if (continuation2 != null) {
                kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                continuation2.resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
            }
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(kotlinx.coroutines.flow.SharedFlowImpl.Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            java.lang.Object[] objArr = this.buffer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr);
            if (kotlinx.coroutines.flow.SharedFlowKt.access$getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            kotlinx.coroutines.flow.SharedFlowKt.access$setBufferAt(objArr, emitter.index, kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object awaitValue(kotlinx.coroutines.flow.SharedFlowSlot sharedFlowSlot, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        synchronized (this) {
            if (tryPeekLocked(sharedFlowSlot) < 0) {
                sharedFlowSlot.cont = cancellableContinuationImpl2;
                sharedFlowSlot.cont = cancellableContinuationImpl2;
            } else {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE));
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized (this) {
            updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }
}
