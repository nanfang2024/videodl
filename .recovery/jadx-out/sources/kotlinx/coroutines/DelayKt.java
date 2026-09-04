package kotlinx.coroutines;

/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0019\u0010\u0000\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a!\u0010\u0000\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000b\u001a\u0019\u0010\u000f\u001a\u00020\n*\u00020\rH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"delay", "Lkotlinx/coroutines/Delay;", "Lkotlin/coroutines/CoroutineContext;", "getDelay", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/Delay;", "awaitCancellation", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "timeMillis", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "duration", "Lkotlin/time/Duration;", "delay-VtjQ1oo", "toDelayMillis", "toDelayMillis-LRDsOJo", "(J)J", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object awaitCancellation(kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        int i;
        if (continuation instanceof kotlinx.coroutines.DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (kotlinx.coroutines.DelayKt$awaitCancellation$1) continuation;
            if ((delayKt$awaitCancellation$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = delayKt$awaitCancellation$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = delayKt$awaitCancellation$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    delayKt$awaitCancellation$1.label = 1;
                    kotlinx.coroutines.DelayKt$awaitCancellation$1 delayKt$awaitCancellation$12 = delayKt$awaitCancellation$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(delayKt$awaitCancellation$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    java.lang.Object result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(delayKt$awaitCancellation$12);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        delayKt$awaitCancellation$1 = new kotlinx.coroutines.DelayKt$awaitCancellation$1(continuation);
        java.lang.Object obj2 = delayKt$awaitCancellation$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = delayKt$awaitCancellation$1.label;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public static final java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (j <= 0) {
            return kotlin.Unit.INSTANCE;
        }
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (j < kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
            getDelay(cancellableContinuationImpl2.getContext()).mo1204scheduleResumeAfterDelay(j, cancellableContinuationImpl2);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final java.lang.Object m1135delayVtjQ1oo(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object delay = delay(m1136toDelayMillisLRDsOJo(j), continuation);
        return delay == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? delay : kotlin.Unit.INSTANCE;
    }

    public static final kotlinx.coroutines.Delay getDelay(kotlin.coroutines.CoroutineContext coroutineContext) {
        kotlin.coroutines.CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.ContinuationInterceptor.INSTANCE);
        kotlinx.coroutines.Delay delay = element instanceof kotlinx.coroutines.Delay ? (kotlinx.coroutines.Delay) element : null;
        return delay == null ? kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay() : delay;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m1136toDelayMillisLRDsOJo(long j) {
        if (kotlin.time.Duration.m970compareToLRDsOJo(j, kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc()) > 0) {
            return kotlin.ranges.RangesKt.coerceAtLeast(kotlin.time.Duration.m989getInWholeMillisecondsimpl(j), 1L);
        }
        return 0L;
    }
}
