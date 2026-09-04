package kotlinx.coroutines.sync;

/* compiled from: Mutex.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r\u001aB\u0010\u000e\u001a\u0002H\u000f\"\u0004\b\u0000\u0010\u000f*\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0013H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"HOLDS_LOCK_ANOTHER_OWNER", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "HOLDS_LOCK_UNLOCKED", "HOLDS_LOCK_YES", "NO_OWNER", "Lkotlinx/coroutines/internal/Symbol;", "ON_LOCK_ALREADY_LOCKED_BY_OWNER", "TRY_LOCK_ALREADY_LOCKED_BY_OWNER", "TRY_LOCK_FAILED", "TRY_LOCK_SUCCESS", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "withLock", "T", "owner", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MutexKt {
    private static final int HOLDS_LOCK_ANOTHER_OWNER = 2;
    private static final int HOLDS_LOCK_UNLOCKED = 0;
    private static final int HOLDS_LOCK_YES = 1;
    private static final kotlinx.coroutines.internal.Symbol NO_OWNER = new kotlinx.coroutines.internal.Symbol("NO_OWNER");
    private static final kotlinx.coroutines.internal.Symbol ON_LOCK_ALREADY_LOCKED_BY_OWNER = new kotlinx.coroutines.internal.Symbol("ALREADY_LOCKED_BY_OWNER");
    private static final int TRY_LOCK_ALREADY_LOCKED_BY_OWNER = 2;
    private static final int TRY_LOCK_FAILED = 1;
    private static final int TRY_LOCK_SUCCESS = 0;

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Mutex(z);
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean z) {
        return new kotlinx.coroutines.sync.MutexImpl(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.sync.MutexKt$withLock$1 mutexKt$withLock$1;
        int i;
        try {
            if (continuation instanceof kotlinx.coroutines.sync.MutexKt$withLock$1) {
                mutexKt$withLock$1 = (kotlinx.coroutines.sync.MutexKt$withLock$1) continuation;
                if ((mutexKt$withLock$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                    mutexKt$withLock$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                    java.lang.Object obj2 = mutexKt$withLock$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = mutexKt$withLock$1.label;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj2);
                        mutexKt$withLock$1.L$0 = mutex;
                        mutexKt$withLock$1.L$1 = obj;
                        mutexKt$withLock$1.L$2 = function0;
                        mutexKt$withLock$1.label = 1;
                        if (mutex.lock(obj, mutexKt$withLock$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        function0 = (kotlin.jvm.functions.Function0) mutexKt$withLock$1.L$2;
                        obj = mutexKt$withLock$1.L$1;
                        mutex = (kotlinx.coroutines.sync.Mutex) mutexKt$withLock$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj2);
                    }
                    return function0.invoke();
                }
            }
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
        mutexKt$withLock$1 = new kotlinx.coroutines.sync.MutexKt$withLock$1(continuation);
        java.lang.Object obj22 = mutexKt$withLock$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mutexKt$withLock$1.label;
        if (i != 0) {
        }
    }

    private static final <T> java.lang.Object withLock$$forInline(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0<? extends T> function0, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(obj, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex mutex, java.lang.Object obj, kotlin.jvm.functions.Function0 function0, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        kotlin.jvm.internal.InlineMarker.mark(0);
        mutex.lock(obj, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        try {
            return function0.invoke();
        } finally {
            kotlin.jvm.internal.InlineMarker.finallyStart(1);
            mutex.unlock(obj);
            kotlin.jvm.internal.InlineMarker.finallyEnd(1);
        }
    }
}
