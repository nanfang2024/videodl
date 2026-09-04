package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Delay.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "Lkotlinx/coroutines/CoroutineScope;", "downStream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", i = {0, 0}, l = {424}, m = "invokeSuspend", n = {"downStream", "values"}, s = {"L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlowKt__DelayKt$timeoutInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1(long j, kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1> continuation) {
        super(3, continuation);
        this.$timeout = j;
        this.$this_timeoutInternal = flow;
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, continuation);
        flowKt__DelayKt$timeoutInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$timeoutInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0094  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0085 -> B:5:0x008c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.Flow buffer$default;
        long j;
        kotlinx.coroutines.flow.FlowCollector flowCollector;
        kotlinx.coroutines.channels.ReceiveChannel receiveChannel;
        kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1<T> flowKt__DelayKt$timeoutInternal$1;
        java.lang.Object doSelect;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            kotlinx.coroutines.flow.FlowCollector flowCollector2 = (kotlinx.coroutines.flow.FlowCollector) this.L$1;
            if (kotlin.time.Duration.m970compareToLRDsOJo(this.$timeout, kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc()) > 0) {
                buffer$default = kotlinx.coroutines.flow.FlowKt__ContextKt.buffer$default(this.$this_timeoutInternal, 0, null, 2, null);
                kotlinx.coroutines.channels.ReceiveChannel produceIn = kotlinx.coroutines.flow.FlowKt.produceIn(buffer$default, coroutineScope);
                j = this.$timeout;
                flowCollector = flowCollector2;
                receiveChannel = produceIn;
                flowKt__DelayKt$timeoutInternal$1 = this;
                kotlinx.coroutines.selects.SelectImplementation selectImplementation = new kotlinx.coroutines.selects.SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
                kotlinx.coroutines.selects.SelectImplementation selectImplementation2 = selectImplementation;
                selectImplementation2.invoke(receiveChannel.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
                kotlinx.coroutines.selects.OnTimeoutKt.m1215onTimeout8Mi8wO0(selectImplementation2, j, new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2(j, null));
                flowKt__DelayKt$timeoutInternal$1.L$0 = flowCollector;
                flowKt__DelayKt$timeoutInternal$1.L$1 = receiveChannel;
                flowKt__DelayKt$timeoutInternal$1.J$0 = j;
                flowKt__DelayKt$timeoutInternal$1.label = 1;
                doSelect = selectImplementation.doSelect(flowKt__DelayKt$timeoutInternal$1);
                if (doSelect != coroutine_suspended) {
                }
            } else {
                throw new kotlinx.coroutines.TimeoutCancellationException("Timed out immediately");
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = this.J$0;
            kotlinx.coroutines.channels.ReceiveChannel receiveChannel2 = (kotlinx.coroutines.channels.ReceiveChannel) this.L$1;
            kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.flow.FlowCollector flowCollector4 = flowCollector3;
            long j3 = j2;
            kotlinx.coroutines.channels.ReceiveChannel receiveChannel3 = receiveChannel2;
            java.lang.Object obj2 = coroutine_suspended;
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1<T> flowKt__DelayKt$timeoutInternal$12 = this;
            if (((java.lang.Boolean) obj).booleanValue()) {
                return kotlin.Unit.INSTANCE;
            }
            flowKt__DelayKt$timeoutInternal$1 = flowKt__DelayKt$timeoutInternal$12;
            coroutine_suspended = obj2;
            receiveChannel = receiveChannel3;
            j = j3;
            flowCollector = flowCollector4;
            kotlinx.coroutines.selects.SelectImplementation selectImplementation3 = new kotlinx.coroutines.selects.SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
            kotlinx.coroutines.selects.SelectImplementation selectImplementation22 = selectImplementation3;
            selectImplementation22.invoke(receiveChannel.getOnReceiveCatching(), new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
            kotlinx.coroutines.selects.OnTimeoutKt.m1215onTimeout8Mi8wO0(selectImplementation22, j, new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2(j, null));
            flowKt__DelayKt$timeoutInternal$1.L$0 = flowCollector;
            flowKt__DelayKt$timeoutInternal$1.L$1 = receiveChannel;
            flowKt__DelayKt$timeoutInternal$1.J$0 = j;
            flowKt__DelayKt$timeoutInternal$1.label = 1;
            doSelect = selectImplementation3.doSelect(flowKt__DelayKt$timeoutInternal$1);
            if (doSelect != coroutine_suspended) {
                return coroutine_suspended;
            }
            java.lang.Object obj3 = coroutine_suspended;
            flowKt__DelayKt$timeoutInternal$12 = flowKt__DelayKt$timeoutInternal$1;
            obj = doSelect;
            flowCollector4 = flowCollector;
            j3 = j;
            receiveChannel3 = receiveChannel;
            obj2 = obj3;
            if (((java.lang.Boolean) obj).booleanValue()) {
            }
        }
    }
}
