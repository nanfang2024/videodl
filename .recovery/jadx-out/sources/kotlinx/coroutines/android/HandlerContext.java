package kotlinx.coroutines.android;

/* compiled from: HandlerDispatcher.kt */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002J\u001c\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J\u0013\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010 \u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001e\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100#H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u0000X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lkotlinx/coroutines/android/HandlerContext;", "Lkotlinx/coroutines/android/HandlerDispatcher;", "Lkotlinx/coroutines/Delay;", "handler", "Landroid/os/Handler;", "name", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/os/Handler;Ljava/lang/String;)V", "invokeImmediately", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/os/Handler;Ljava/lang/String;Z)V", "_immediate", "immediate", "getImmediate", "()Lkotlinx/coroutines/android/HandlerContext;", "cancelOnRejection", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatch", "equals", "other", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isDispatchNeeded", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "toString", "kotlinx-coroutines-android"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class HandlerContext extends kotlinx.coroutines.android.HandlerDispatcher implements kotlinx.coroutines.Delay {
    private volatile kotlinx.coroutines.android.HandlerContext _immediate;
    private final android.os.Handler handler;
    private final kotlinx.coroutines.android.HandlerContext immediate;
    private final boolean invokeImmediately;
    private final java.lang.String name;

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public kotlinx.coroutines.android.HandlerContext getImmediate() {
        return this.immediate;
    }

    private HandlerContext(android.os.Handler handler, java.lang.String str, boolean z) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z;
        this._immediate = z ? this : null;
        kotlinx.coroutines.android.HandlerContext handlerContext = this._immediate;
        if (handlerContext == null) {
            handlerContext = new kotlinx.coroutines.android.HandlerContext(handler, str, true);
            this._immediate = handlerContext;
        }
        this.immediate = handlerContext;
    }

    public /* synthetic */ HandlerContext(android.os.Handler handler, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(android.os.Handler handler, java.lang.String str) {
        this(handler, str, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext context) {
        return (this.invokeImmediately && kotlin.jvm.internal.Intrinsics.areEqual(android.os.Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public void mo1203dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        cancelOnRejection(context, block);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, final java.lang.Runnable block, kotlin.coroutines.CoroutineContext context) {
        if (this.handler.postDelayed(block, kotlin.ranges.RangesKt.coerceAtMost(timeMillis, kotlin.time.DurationKt.MAX_MILLIS))) {
            return new kotlinx.coroutines.DisposableHandle() { // from class: kotlinx.coroutines.android.HandlerContext$$ExternalSyntheticLambda0
                @Override // kotlinx.coroutines.DisposableHandle
                public final void dispose() {
                    kotlinx.coroutines.android.HandlerContext.invokeOnTimeout$lambda$3(kotlinx.coroutines.android.HandlerContext.this, block);
                }
            };
        }
        cancelOnRejection(context, block);
        return kotlinx.coroutines.NonDisposableHandle.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(kotlinx.coroutines.android.HandlerContext handlerContext, java.lang.Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    private final void cancelOnRejection(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        kotlinx.coroutines.JobKt.cancel(context, new java.util.concurrent.CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        kotlinx.coroutines.Dispatchers.getIO().mo1203dispatch(context, block);
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
        java.lang.String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        java.lang.String str = this.name;
        if (str == null) {
            str = this.handler.toString();
        }
        return this.invokeImmediately ? str + ".immediate" : str;
    }

    public boolean equals(java.lang.Object other) {
        return (other instanceof kotlinx.coroutines.android.HandlerContext) && ((kotlinx.coroutines.android.HandlerContext) other).handler == this.handler;
    }

    public int hashCode() {
        return java.lang.System.identityHashCode(this.handler);
    }

    @Override // kotlinx.coroutines.Delay
    /* renamed from: scheduleResumeAfterDelay */
    public void mo1204scheduleResumeAfterDelay(long timeMillis, final kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        final java.lang.Runnable runnable = new java.lang.Runnable() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$$inlined$Runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                kotlinx.coroutines.CancellableContinuation.this.resumeUndispatched(this, kotlin.Unit.INSTANCE);
            }
        };
        if (this.handler.postDelayed(runnable, kotlin.ranges.RangesKt.coerceAtMost(timeMillis, kotlin.time.DurationKt.MAX_MILLIS))) {
            continuation.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.android.HandlerContext$scheduleResumeAfterDelay$1
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
                    android.os.Handler handler;
                    handler = kotlinx.coroutines.android.HandlerContext.this.handler;
                    handler.removeCallbacks(runnable);
                }
            });
        } else {
            cancelOnRejection(continuation.getContext(), runnable);
        }
    }
}
