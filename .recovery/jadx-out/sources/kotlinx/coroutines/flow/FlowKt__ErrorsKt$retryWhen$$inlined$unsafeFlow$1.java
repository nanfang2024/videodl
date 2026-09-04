package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: SafeCollector.common.kt */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function4 $predicate$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_retryWhen$inlined;

    /* compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {118, 120}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u242", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u242", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            this.result = obj;
            this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
            return kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007a -> B:14:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x009b -> B:11:0x009e). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1 anonymousClass1;
        int i;
        long j;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
        int i2;
        kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
        kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector2;
        java.lang.Throwable th;
        java.lang.Object catchImpl;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) {
            anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) continuation;
            if ((anonymousClass1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                anonymousClass1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = anonymousClass1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = anonymousClass1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    j = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = this;
                    kotlinx.coroutines.flow.Flow flow = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.$this_retryWhen$inlined;
                    anonymousClass1.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                    anonymousClass1.L$1 = flowCollector;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.J$0 = j;
                    anonymousClass1.I$0 = 0;
                    anonymousClass1.label = 1;
                    catchImpl = kotlinx.coroutines.flow.FlowKt.catchImpl(flow, flowCollector, anonymousClass1);
                    if (catchImpl != coroutine_suspended) {
                    }
                } else if (i == 1) {
                    i2 = anonymousClass1.I$0;
                    j = anonymousClass1.J$0;
                    flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    th = (java.lang.Throwable) obj;
                    if (th != null) {
                    }
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                    if (i2 == 0) {
                    }
                } else {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = anonymousClass1.J$0;
                    java.lang.Throwable th2 = (java.lang.Throwable) anonymousClass1.L$2;
                    flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$1;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!((java.lang.Boolean) obj).booleanValue()) {
                        j++;
                        i2 = 1;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                        if (i2 == 0) {
                            return kotlin.Unit.INSTANCE;
                        }
                        flowCollector = flowCollector2;
                        kotlinx.coroutines.flow.Flow flow2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.$this_retryWhen$inlined;
                        anonymousClass1.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                        anonymousClass1.L$1 = flowCollector;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.J$0 = j;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        catchImpl = kotlinx.coroutines.flow.FlowKt.catchImpl(flow2, flowCollector, anonymousClass1);
                        if (catchImpl != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowCollector2 = flowCollector;
                        i2 = 0;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                        obj = catchImpl;
                        th = (java.lang.Throwable) obj;
                        if (th != null) {
                            kotlin.jvm.functions.Function4 function4 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.$predicate$inlined;
                            java.lang.Long boxLong = kotlin.coroutines.jvm.internal.Boxing.boxLong(j);
                            anonymousClass1.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                            anonymousClass1.L$1 = flowCollector2;
                            anonymousClass1.L$2 = th;
                            anonymousClass1.J$0 = j;
                            anonymousClass1.label = 2;
                            kotlin.jvm.internal.InlineMarker.mark(6);
                            java.lang.Object invoke = function4.invoke(flowCollector2, th, boxLong, anonymousClass1);
                            kotlin.jvm.internal.InlineMarker.mark(7);
                            if (invoke == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = invoke;
                            th2 = th;
                            if (!((java.lang.Boolean) obj).booleanValue()) {
                                throw th2;
                            }
                        }
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                        if (i2 == 0) {
                        }
                    }
                }
            }
        }
        anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1(continuation);
        java.lang.Object obj2 = anonymousClass1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = anonymousClass1.label;
        if (i != 0) {
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow flow, kotlin.jvm.functions.Function4 function4) {
        this.$this_retryWhen$inlined = flow;
        this.$predicate$inlined = function4;
    }
}
