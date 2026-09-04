package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", i = {0, 0, 0, 0}, l = {423}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "ticker"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlowKt__DelayKt$sample$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_sample;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2(long j, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2> continuation) {
        super(3, continuation);
        this.$periodMillis = j;
        this.$this_sample = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2(this.$periodMillis, this.$this_sample, continuation);
        flowKt__DelayKt$sample$2.L$0 = coroutineScope;
        flowKt__DelayKt$sample$2.L$1 = flowCollector;
        return flowKt__DelayKt$sample$2.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.channels.ReceiveChannel fixedPeriodTicker$default;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$1;
            kotlinx.coroutines.channels.ReceiveChannel produce$default = kotlinx.coroutines.channels.ProduceKt.produce$default(coroutineScope, null, -1, new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
            kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
            fixedPeriodTicker$default = kotlinx.coroutines.flow.FlowKt__DelayKt.fixedPeriodTicker$default(coroutineScope, this.$periodMillis, 0L, 2, null);
            flowCollector = flowCollector2;
            receiveChannel = produce$default;
            objectRef = objectRef2;
            receiveChannel2 = fixedPeriodTicker$default;
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$3;
            objectRef = (kotlin.jvm.internal.Ref.ObjectRef) this.L$2;
            receiveChannel = (kotlinx.coroutines.channels.ReceiveChannel) this.L$1;
            flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        while (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE) {
            kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(getContext());
            kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
            selectImplementation2.invoke(receiveChannel.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannel2, null));
            selectImplementation2.invoke(receiveChannel2.getOnReceive(), new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2(objectRef, flowCollector, null));
            this.L$0 = flowCollector;
            this.L$1 = receiveChannel;
            this.L$2 = objectRef;
            this.L$3 = receiveChannel2;
            this.label = 1;
            if (selectImplementation.doSelect(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
