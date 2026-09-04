package kotlinx.coroutines.intrinsics;

/* compiled from: Undispatched.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\u001a\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0082\b\u001a>\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aR\u0010\b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n\"\u0004\b\u0001\u0010\u0002*\u001e\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\f\u001a\u0002H\n2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\t\u001aY\u0010\u000f\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aY\u0010\u0013\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0006\u0010\f\u001a\u0002H\n2'\u0010\u0005\u001a#\b\u0001\u0012\u0004\u0012\u0002H\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0002\b\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a?\u0010\u0014\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00062\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"startDirect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "completion", "Lkotlin/coroutines/Continuation;", "block", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "startCoroutineUndispatched", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V", "R", "Lkotlin/Function2;", "receiver", "(Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)V", "startCoroutineUnintercepted", "startUndispatchedOrReturn", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/internal/ScopeCoroutine;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "startUndispatchedOrReturnIgnoreTimeout", "undispatchedResult", "shouldThrow", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "startBlock", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class UndispatchedKt {
    public static final <T, R> java.lang.Object startUndispatchedOrReturn(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        java.lang.Object completedExceptionally;
        java.lang.Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, scopeCoroutine);
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = (kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core;
                java.lang.Throwable th2 = completedExceptionally2.cause;
                java.lang.Throwable th3 = completedExceptionally2.cause;
                kotlin.coroutines.Continuation<? super T> continuation = scopeCoroutine.uCont;
                if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th3, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                }
                throw th3;
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T, R> java.lang.Object startUndispatchedOrReturnIgnoreTimeout(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2) {
        java.lang.Object completedExceptionally;
        java.lang.Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, scopeCoroutine);
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = (kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core;
                java.lang.Throwable th2 = completedExceptionally2.cause;
                if (!(th2 instanceof kotlinx.coroutines.TimeoutCancellationException) || ((kotlinx.coroutines.TimeoutCancellationException) th2).coroutine != scopeCoroutine) {
                    java.lang.Throwable th3 = completedExceptionally2.cause;
                    kotlin.coroutines.Continuation<? super T> continuation = scopeCoroutine.uCont;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th3, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th3;
                }
                if (completedExceptionally instanceof kotlinx.coroutines.CompletedExceptionally) {
                    java.lang.Throwable th4 = ((kotlinx.coroutines.CompletedExceptionally) completedExceptionally).cause;
                    kotlin.coroutines.Continuation<? super T> continuation2 = scopeCoroutine.uCont;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th4, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation2);
                    }
                    throw th4;
                }
            } else {
                completedExceptionally = kotlinx.coroutines.JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
            }
            return completedExceptionally;
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    private static final <T> java.lang.Object undispatchedResult(kotlinx.coroutines.internal.ScopeCoroutine<? super T> scopeCoroutine, kotlin.jvm.functions.Function1<? super java.lang.Throwable, java.lang.Boolean> function1, kotlin.jvm.functions.Function0<? extends java.lang.Object> function0) {
        java.lang.Object completedExceptionally;
        java.lang.Object makeCompletingOnce$kotlinx_coroutines_core;
        try {
            completedExceptionally = function0.invoke();
        } catch (java.lang.Throwable th) {
            completedExceptionally = new kotlinx.coroutines.CompletedExceptionally(th, false, 2, null);
        }
        if (completedExceptionally != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() && (makeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) != kotlinx.coroutines.JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            if (makeCompletingOnce$kotlinx_coroutines_core instanceof kotlinx.coroutines.CompletedExceptionally) {
                kotlinx.coroutines.CompletedExceptionally completedExceptionally2 = (kotlinx.coroutines.CompletedExceptionally) makeCompletingOnce$kotlinx_coroutines_core;
                if (!function1.invoke(completedExceptionally2.cause).booleanValue()) {
                    if (!(completedExceptionally instanceof kotlinx.coroutines.CompletedExceptionally)) {
                        return completedExceptionally;
                    }
                    java.lang.Throwable th2 = ((kotlinx.coroutines.CompletedExceptionally) completedExceptionally).cause;
                    kotlin.coroutines.Continuation<? super T> continuation = scopeCoroutine.uCont;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th2, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                    }
                    throw th2;
                }
                java.lang.Throwable th3 = completedExceptionally2.cause;
                kotlin.coroutines.Continuation<? super T> continuation2 = scopeCoroutine.uCont;
                if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                    throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(th3, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation2);
                }
                throw th3;
            }
            return kotlinx.coroutines.JobSupportKt.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    public static final <T> void startCoroutineUnintercepted(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.coroutines.Continuation probeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            java.lang.Object invoke = ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(probeCoroutineCreated);
            if (invoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(invoke));
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th)));
        }
    }

    public static final <T> void startCoroutineUndispatched(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.coroutines.Continuation probeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            kotlin.coroutines.CoroutineContext context = continuation.getContext();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
            try {
                java.lang.Object invoke = ((kotlin.jvm.functions.Function1) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function1, 1)).invoke(probeCoroutineCreated);
                if (invoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(invoke));
                }
            } finally {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th)));
        }
    }

    public static final <R, T> void startCoroutineUndispatched(kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, R r, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.coroutines.Continuation probeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            kotlin.coroutines.CoroutineContext context = continuation.getContext();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, null);
            try {
                java.lang.Object invoke = ((kotlin.jvm.functions.Function2) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(r, probeCoroutineCreated);
                if (invoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(invoke));
                }
            } finally {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th)));
        }
    }

    private static final <T> void startDirect(kotlin.coroutines.Continuation<? super T> continuation, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function1) {
        kotlin.coroutines.Continuation probeCoroutineCreated = kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            java.lang.Object invoke = function1.invoke(probeCoroutineCreated);
            if (invoke != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(invoke));
            }
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            probeCoroutineCreated.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th)));
        }
    }
}
