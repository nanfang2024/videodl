package kotlinx.coroutines.flow.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Merge.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ChannelFlowMerge$collectTo$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
    final /* synthetic */ kotlinx.coroutines.Job $job;
    final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $scope;
    final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge$collectTo$2(kotlinx.coroutines.Job job, kotlinx.coroutines.sync.Semaphore semaphore, kotlinx.coroutines.channels.ProducerScope<? super T> producerScope, kotlinx.coroutines.flow.internal.SendingCollector<T> sendingCollector) {
        this.$job = job;
        this.$semaphore = semaphore;
        this.$scope = producerScope;
        this.$collector = sendingCollector;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return emit((kotlinx.coroutines.flow.Flow) obj, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
        int i;
        kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2<T> channelFlowMerge$collectTo$2;
        if (continuation instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) {
            channelFlowMerge$collectTo$2$emit$1 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) continuation;
            if ((channelFlowMerge$collectTo$2$emit$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                channelFlowMerge$collectTo$2$emit$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = channelFlowMerge$collectTo$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = channelFlowMerge$collectTo$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job job = this.$job;
                    if (job != null) {
                        kotlinx.coroutines.JobKt.ensureActive(job);
                    }
                    kotlinx.coroutines.sync.Semaphore semaphore = this.$semaphore;
                    channelFlowMerge$collectTo$2$emit$1.L$0 = this;
                    channelFlowMerge$collectTo$2$emit$1.L$1 = flow;
                    channelFlowMerge$collectTo$2$emit$1.label = 1;
                    if (semaphore.acquire(channelFlowMerge$collectTo$2$emit$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channelFlowMerge$collectTo$2 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flow = (kotlinx.coroutines.flow.Flow) channelFlowMerge$collectTo$2$emit$1.L$1;
                    channelFlowMerge$collectTo$2 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2) channelFlowMerge$collectTo$2$emit$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(channelFlowMerge$collectTo$2.$scope, null, null, new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1(flow, channelFlowMerge$collectTo$2.$collector, channelFlowMerge$collectTo$2.$semaphore, null), 3, null);
                return kotlin.Unit.INSTANCE;
            }
        }
        channelFlowMerge$collectTo$2$emit$1 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1(this, continuation);
        java.lang.Object obj2 = channelFlowMerge$collectTo$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = channelFlowMerge$collectTo$2$emit$1.label;
        if (i != 0) {
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(channelFlowMerge$collectTo$2.$scope, null, null, new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1(flow, channelFlowMerge$collectTo$2.$collector, channelFlowMerge$collectTo$2.$semaphore, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $inner;
        final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlinx.coroutines.flow.internal.SendingCollector<T> sendingCollector, kotlinx.coroutines.sync.Semaphore semaphore, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$inner = flow;
            this.$collector = sendingCollector;
            this.$semaphore = semaphore;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1(this.$inner, this.$collector, this.$semaphore, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$inner.collect(this.$collector, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                this.$semaphore.release();
                return kotlin.Unit.INSTANCE;
            } catch (java.lang.Throwable th) {
                this.$semaphore.release();
                throw th;
            }
        }
    }
}
