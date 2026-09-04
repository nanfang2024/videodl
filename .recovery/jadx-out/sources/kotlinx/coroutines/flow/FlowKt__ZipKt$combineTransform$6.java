package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: Zip.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlowKt__ZipKt$combineTransform$6<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ZipKt$combineTransform$6(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6> continuation) {
        super(2, continuation);
        this.$flows = flowArr;
        this.$transform = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6(this.$flows, this.$transform, continuation);
        flowKt__ZipKt$combineTransform$6.L$0 = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u0001H\u0002\u0018\u00010\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1, reason: invalid class name */
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class AnonymousClass1<T> extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<T[]> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr) {
            super(0);
            this.$flows = flowArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final T[] invoke() {
            int length = this.$flows.length;
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
            return (T[]) new java.lang.Object[length];
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Zip.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET}, k = 3, mv = {1, 8, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", i = {}, l = {251}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class AnonymousClass2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2> continuation) {
            super(3, continuation);
            this.$transform = function3;
        }

        @Override // kotlin.jvm.functions.Function3
        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            kotlin.jvm.internal.Intrinsics.needClassReification();
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2 anonymousClass2 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2(this.$transform, continuation);
            anonymousClass2.L$0 = flowCollector;
            anonymousClass2.L$1 = tArr;
            return anonymousClass2.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
                java.lang.Object[] objArr = (java.lang.Object[]) this.L$1;
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function3 = this.$transform;
                this.L$0 = null;
                this.label = 1;
                if (function3.invoke(flowCollector, objArr, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
            this.$transform.invoke((kotlinx.coroutines.flow.FlowCollector) this.L$0, (java.lang.Object[]) this.L$1, this);
            return kotlin.Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlinx.coroutines.flow.Flow<T>[] flowArr = this.$flows;
            kotlin.jvm.internal.Intrinsics.needClassReification();
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1(this.$flows);
            kotlin.jvm.internal.Intrinsics.needClassReification();
            this.label = 1;
            if (kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2(this.$transform, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object obj) {
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
        kotlinx.coroutines.flow.Flow<T>[] flowArr = this.$flows;
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1 anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass1(this.$flows);
        kotlin.jvm.internal.Intrinsics.needClassReification();
        kotlin.jvm.internal.InlineMarker.mark(0);
        kotlinx.coroutines.flow.internal.CombineKt.combineInternal(flowCollector, flowArr, anonymousClass1, new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6.AnonymousClass2(this.$transform, null), this);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return kotlin.Unit.INSTANCE;
    }
}
