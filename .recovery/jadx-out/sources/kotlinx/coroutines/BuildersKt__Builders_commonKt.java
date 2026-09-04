package kotlinx.coroutines;

/* compiled from: Builders.common.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aU\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u000e\u001a[\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u0005*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aF\u0010\u0014\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00152)\b\b\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086Jø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aO\u0010\u0017\u001a\u00020\u0018*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"RESUMED", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt.SUSPENDED, "UNDECIDED", "withContext", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "Lkotlinx/coroutines/Deferred;", "start", "Lkotlinx/coroutines/CoroutineStart;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "invoke", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "Lkotlinx/coroutines/Job;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return kotlinx.coroutines.BuildersKt.launch(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.LazyStandaloneCoroutine standaloneCoroutine;
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        if (coroutineStart.isLazy()) {
            standaloneCoroutine = new kotlinx.coroutines.LazyStandaloneCoroutine(newCoroutineContext, function2);
        } else {
            standaloneCoroutine = new kotlinx.coroutines.StandaloneCoroutine(newCoroutineContext, true);
        }
        standaloneCoroutine.start(coroutineStart, standaloneCoroutine, function2);
        return standaloneCoroutine;
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2 function2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            coroutineStart = kotlinx.coroutines.CoroutineStart.DEFAULT;
        }
        return kotlinx.coroutines.BuildersKt.async(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.CoroutineContext coroutineContext, kotlinx.coroutines.CoroutineStart coroutineStart, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        kotlinx.coroutines.LazyDeferredCoroutine deferredCoroutine;
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(coroutineScope, coroutineContext);
        if (coroutineStart.isLazy()) {
            deferredCoroutine = new kotlinx.coroutines.LazyDeferredCoroutine(newCoroutineContext, function2);
        } else {
            deferredCoroutine = new kotlinx.coroutines.DeferredCoroutine(newCoroutineContext, true);
        }
        deferredCoroutine.start(coroutineStart, deferredCoroutine, function2);
        return deferredCoroutine;
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext coroutineContext, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        java.lang.Object result$kotlinx_coroutines_core;
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        kotlin.coroutines.CoroutineContext newCoroutineContext = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(context, coroutineContext);
        kotlinx.coroutines.JobKt.ensureActive(newCoroutineContext);
        if (newCoroutineContext == context) {
            kotlinx.coroutines.internal.ScopeCoroutine scopeCoroutine = new kotlinx.coroutines.internal.ScopeCoroutine(newCoroutineContext, continuation);
            result$kotlinx_coroutines_core = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, function2);
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(newCoroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE), context.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE))) {
            kotlinx.coroutines.UndispatchedCoroutine undispatchedCoroutine = new kotlinx.coroutines.UndispatchedCoroutine(newCoroutineContext, continuation);
            kotlin.coroutines.CoroutineContext context2 = undispatchedCoroutine.getContext();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context2, null);
            try {
                java.lang.Object startUndispatchedOrReturn = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(undispatchedCoroutine, undispatchedCoroutine, function2);
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                result$kotlinx_coroutines_core = startUndispatchedOrReturn;
            } catch (java.lang.Throwable th) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                throw th;
            }
        } else {
            kotlinx.coroutines.DispatchedCoroutine dispatchedCoroutine = new kotlinx.coroutines.DispatchedCoroutine(newCoroutineContext, continuation);
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(function2, dispatchedCoroutine, dispatchedCoroutine, null, 4, null);
            result$kotlinx_coroutines_core = dispatchedCoroutine.getResult$kotlinx_coroutines_core();
        }
        if (result$kotlinx_coroutines_core == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result$kotlinx_coroutines_core;
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, function2, continuation);
    }

    private static final <T> java.lang.Object invoke$$forInline(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(coroutineDispatcher, function2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return withContext;
    }
}
