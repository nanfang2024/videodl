package kotlinx.coroutines;

/* compiled from: CompletableDeferred.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002¢\u0006\u0002\u0010\u0004\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a,\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\nø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"CompletableDeferred", "Lkotlinx/coroutines/CompletableDeferred;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;", "parent", "Lkotlinx/coroutines/Job;", "completeWith", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "result", "Lkotlin/Result;", "(Lkotlinx/coroutines/CompletableDeferred;Ljava/lang/Object;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CompletableDeferredKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean completeWith(kotlinx.coroutines.CompletableDeferred<T> completableDeferred, java.lang.Object obj) {
        java.lang.Throwable th = kotlin.Result.exceptionOrNull-impl(obj);
        return th == null ? completableDeferred.complete(obj) : completableDeferred.completeExceptionally(th);
    }

    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(kotlinx.coroutines.Job job) {
        return new kotlinx.coroutines.CompletableDeferredImpl(job);
    }

    public static /* synthetic */ kotlinx.coroutines.CompletableDeferred CompletableDeferred$default(kotlinx.coroutines.Job job, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return CompletableDeferred(job);
    }

    public static final <T> kotlinx.coroutines.CompletableDeferred<T> CompletableDeferred(T t) {
        kotlinx.coroutines.CompletableDeferredImpl completableDeferredImpl = new kotlinx.coroutines.CompletableDeferredImpl(null);
        completableDeferredImpl.complete(t);
        return completableDeferredImpl;
    }
}
