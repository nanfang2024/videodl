package kotlinx.coroutines.flow.internal;

/* compiled from: SafeCollector.common.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022/\b\u0005\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0018\u0010\u000b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\u001a\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0080\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"unsafeFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/Continuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "checkContext", "Lkotlinx/coroutines/flow/internal/SafeCollector;", "currentContext", "Lkotlin/coroutines/CoroutineContext;", "transitiveCoroutineParent", "Lkotlinx/coroutines/Job;", "collectJob", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class SafeCollector_commonKt {
    public static final void checkContext(final kotlinx.coroutines.flow.internal.SafeCollector<?> safeCollector, kotlin.coroutines.CoroutineContext coroutineContext) {
        if (((java.lang.Number) coroutineContext.fold(0, new kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.CoroutineContext.Element, java.lang.Integer>() { // from class: kotlinx.coroutines.flow.internal.SafeCollector_commonKt$checkContext$result$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Integer invoke(java.lang.Integer num, kotlin.coroutines.CoroutineContext.Element element) {
                return invoke(num.intValue(), element);
            }

            public final java.lang.Integer invoke(int i, kotlin.coroutines.CoroutineContext.Element element) {
                kotlin.coroutines.CoroutineContext.Key<?> key = element.getKey();
                kotlin.coroutines.CoroutineContext.Element element2 = safeCollector.collectContext.get(key);
                if (key != kotlinx.coroutines.Job.INSTANCE) {
                    return java.lang.Integer.valueOf(element != element2 ? kotlin.jvm.internal.IntCompanionObject.MIN_VALUE : i + 1);
                }
                kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) element2;
                kotlin.jvm.internal.Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.Job");
                kotlinx.coroutines.Job transitiveCoroutineParent = kotlinx.coroutines.flow.internal.SafeCollector_commonKt.transitiveCoroutineParent((kotlinx.coroutines.Job) element, job);
                if (transitiveCoroutineParent != job) {
                    throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + transitiveCoroutineParent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                }
                if (job != null) {
                    i++;
                }
                return java.lang.Integer.valueOf(i);
            }
        })).intValue() != safeCollector.collectContextSize) {
            throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + safeCollector.collectContext + ",\n\t\tbut emission happened in " + coroutineContext + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    public static final kotlinx.coroutines.Job transitiveCoroutineParent(kotlinx.coroutines.Job job, kotlinx.coroutines.Job job2) {
        while (job != null) {
            if (job == job2 || !(job instanceof kotlinx.coroutines.internal.ScopeCoroutine)) {
                return job;
            }
            job = job.getParent();
        }
        return null;
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> unsafeFlow(kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        return new kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1(function2);
    }
}
