package kotlinx.coroutines.debug.internal;

/* compiled from: DebugCoroutineInfoImpl.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B#\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0002\b&J\b\u0010'\u001a\u00020\u000eH\u0016J)\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020\u000e2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030+2\u0006\u0010,\u001a\u00020-H\u0000¢\u0006\u0002\b.J%\u0010/\u001a\u00020)*\b\u0012\u0004\u0012\u00020\u0015002\b\u0010*\u001a\u0004\u0018\u00010\fH\u0082Pø\u0001\u0000¢\u0006\u0002\u00101R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, d2 = {"Lkotlinx/coroutines/debug/internal/DebugCoroutineInfoImpl;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "creationStackBottom", "Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "sequenceNumber", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/debug/internal/StackTraceFrame;J)V", "_context", "Ljava/lang/ref/WeakReference;", "_lastObservedFrame", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "_state", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCreationStackBottom$kotlinx_coroutines_core", "()Lkotlinx/coroutines/debug/internal/StackTraceFrame;", "creationStackTrace", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StackTraceElement;", "getCreationStackTrace", "()Ljava/util/List;", "value", "lastObservedFrame", "getLastObservedFrame$kotlinx_coroutines_core", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "setLastObservedFrame$kotlinx_coroutines_core", "(Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)V", "lastObservedThread", "Ljava/lang/Thread;", "state", "getState$kotlinx_coroutines_core", "()Ljava/lang/String;", "unmatchedResume", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "lastObservedStackTrace", "lastObservedStackTrace$kotlinx_coroutines_core", "toString", "updateState", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "frame", "Lkotlin/coroutines/Continuation;", "shouldBeMatched", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "updateState$kotlinx_coroutines_core", "yieldFrames", "Lkotlin/sequences/SequenceScope;", "(Lkotlin/sequences/SequenceScope;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DebugCoroutineInfoImpl {
    private final java.lang.ref.WeakReference<kotlin.coroutines.CoroutineContext> _context;
    public volatile java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> _lastObservedFrame;
    public volatile java.lang.String _state = kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.CREATED;
    private final kotlinx.coroutines.debug.internal.StackTraceFrame creationStackBottom;
    public volatile java.lang.Thread lastObservedThread;
    public final long sequenceNumber;
    private int unmatchedResume;

    /* renamed from: getCreationStackBottom$kotlinx_coroutines_core, reason: from getter */
    public final kotlinx.coroutines.debug.internal.StackTraceFrame getCreationStackBottom() {
        return this.creationStackBottom;
    }

    /* renamed from: getState$kotlinx_coroutines_core, reason: from getter */
    public final java.lang.String get_state() {
        return this._state;
    }

    public DebugCoroutineInfoImpl(kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame, long j) {
        this.creationStackBottom = stackTraceFrame;
        this.sequenceNumber = j;
        this._context = new java.lang.ref.WeakReference<>(coroutineContext);
    }

    public final kotlin.coroutines.CoroutineContext getContext() {
        return this._context.get();
    }

    public final java.util.List<java.lang.StackTraceElement> getCreationStackTrace() {
        return creationStackTrace();
    }

    public final synchronized void updateState$kotlinx_coroutines_core(java.lang.String state, kotlin.coroutines.Continuation<?> frame, boolean shouldBeMatched) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(this._state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) && kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) && shouldBeMatched) {
            this.unmatchedResume++;
        } else if (this.unmatchedResume > 0 && kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED)) {
            this.unmatchedResume--;
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(this._state, state) && kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED) && getLastObservedFrame$kotlinx_coroutines_core() != null) {
            return;
        }
        this._state = state;
        setLastObservedFrame$kotlinx_coroutines_core(frame instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame ? (kotlin.coroutines.jvm.internal.CoroutineStackFrame) frame : null);
        this.lastObservedThread = kotlin.jvm.internal.Intrinsics.areEqual(state, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.RUNNING) ? java.lang.Thread.currentThread() : null;
    }

    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getLastObservedFrame$kotlinx_coroutines_core() {
        java.lang.ref.WeakReference<kotlin.coroutines.jvm.internal.CoroutineStackFrame> weakReference = this._lastObservedFrame;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void setLastObservedFrame$kotlinx_coroutines_core(kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame) {
        this._lastObservedFrame = coroutineStackFrame != null ? new java.lang.ref.WeakReference<>(coroutineStackFrame) : null;
    }

    public final java.util.List<java.lang.StackTraceElement> lastObservedStackTrace$kotlinx_coroutines_core() {
        kotlin.coroutines.jvm.internal.CoroutineStackFrame lastObservedFrame$kotlinx_coroutines_core = getLastObservedFrame$kotlinx_coroutines_core();
        if (lastObservedFrame$kotlinx_coroutines_core == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (lastObservedFrame$kotlinx_coroutines_core != null) {
            java.lang.StackTraceElement stackTraceElement = lastObservedFrame$kotlinx_coroutines_core.getStackTraceElement();
            if (stackTraceElement != null) {
                arrayList.add(stackTraceElement);
            }
            lastObservedFrame$kotlinx_coroutines_core = lastObservedFrame$kotlinx_coroutines_core.getCallerFrame();
        }
        return arrayList;
    }

    private final java.util.List<java.lang.StackTraceElement> creationStackTrace() {
        kotlinx.coroutines.debug.internal.StackTraceFrame stackTraceFrame = this.creationStackBottom;
        if (stackTraceFrame == null) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.sequence(new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$creationStackTrace$1(this, stackTraceFrame, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004b -> B:11:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005c -> B:10:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object yieldFrames(kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope, kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1 debugCoroutineInfoImpl$yieldFrames$1;
        int i;
        kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl debugCoroutineInfoImpl;
        if (continuation instanceof kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) {
            debugCoroutineInfoImpl$yieldFrames$1 = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1) continuation;
            if ((debugCoroutineInfoImpl$yieldFrames$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                debugCoroutineInfoImpl$yieldFrames$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = debugCoroutineInfoImpl$yieldFrames$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = debugCoroutineInfoImpl$yieldFrames$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    debugCoroutineInfoImpl = this;
                    if (coroutineStackFrame == null) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame2 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) debugCoroutineInfoImpl$yieldFrames$1.L$2;
                    kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope2 = (kotlin.sequences.SequenceScope) debugCoroutineInfoImpl$yieldFrames$1.L$1;
                    debugCoroutineInfoImpl = (kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl) debugCoroutineInfoImpl$yieldFrames$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope3 = sequenceScope2;
                    coroutineStackFrame = coroutineStackFrame2;
                    sequenceScope = sequenceScope3;
                    coroutineStackFrame = coroutineStackFrame.getCallerFrame();
                    if (coroutineStackFrame == null) {
                        return kotlin.Unit.INSTANCE;
                    }
                    if (coroutineStackFrame == null) {
                        java.lang.StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
                        if (stackTraceElement != null) {
                            debugCoroutineInfoImpl$yieldFrames$1.L$0 = debugCoroutineInfoImpl;
                            debugCoroutineInfoImpl$yieldFrames$1.L$1 = sequenceScope;
                            debugCoroutineInfoImpl$yieldFrames$1.L$2 = coroutineStackFrame;
                            debugCoroutineInfoImpl$yieldFrames$1.label = 1;
                            if (sequenceScope.yield(stackTraceElement, debugCoroutineInfoImpl$yieldFrames$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            kotlin.coroutines.jvm.internal.CoroutineStackFrame coroutineStackFrame3 = coroutineStackFrame;
                            sequenceScope2 = sequenceScope;
                            coroutineStackFrame2 = coroutineStackFrame3;
                            kotlin.sequences.SequenceScope<? super java.lang.StackTraceElement> sequenceScope32 = sequenceScope2;
                            coroutineStackFrame = coroutineStackFrame2;
                            sequenceScope = sequenceScope32;
                        }
                        coroutineStackFrame = coroutineStackFrame.getCallerFrame();
                        if (coroutineStackFrame == null) {
                        }
                        if (coroutineStackFrame == null) {
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                }
            }
        }
        debugCoroutineInfoImpl$yieldFrames$1 = new kotlinx.coroutines.debug.internal.DebugCoroutineInfoImpl$yieldFrames$1(this, continuation);
        java.lang.Object obj2 = debugCoroutineInfoImpl$yieldFrames$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = debugCoroutineInfoImpl$yieldFrames$1.label;
        if (i != 0) {
        }
    }

    public java.lang.String toString() {
        return "DebugCoroutineInfo(state=" + get_state() + ",context=" + getContext() + ')';
    }
}
