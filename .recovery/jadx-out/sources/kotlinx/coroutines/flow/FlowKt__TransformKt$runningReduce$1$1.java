package kotlinx.coroutines.flow;

/* compiled from: Transform.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class FlowKt__TransformKt$runningReduce$1$1<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $accumulator;
    final /* synthetic */ kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $operation;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $this_unsafeFlow;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningReduce$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super T, ? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector) {
        this.$accumulator = objectRef;
        this.$operation = function3;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1;
        java.lang.Object coroutine_suspended;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
        kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1<T> flowKt__TransformKt$runningReduce$1$1;
        T t2;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        T t3;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) continuation;
            if ((flowKt__TransformKt$runningReduce$1$1$emit$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningReduce$1$1$emit$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__TransformKt$runningReduce$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = this.$accumulator;
                    if (objectRef.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        flowKt__TransformKt$runningReduce$1$1 = this;
                        objectRef.element = t;
                        flowCollector = flowKt__TransformKt$runningReduce$1$1.$this_unsafeFlow;
                        t3 = flowKt__TransformKt$runningReduce$1$1.$accumulator.element;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
                        if (flowCollector.emit(t3, flowKt__TransformKt$runningReduce$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                    kotlin.jvm.functions.Function3<T, T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> function3 = this.$operation;
                    T t4 = this.$accumulator.element;
                    flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = this;
                    flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = objectRef;
                    flowKt__TransformKt$runningReduce$1$1$emit$1.label = 1;
                    java.lang.Object invoke = function3.invoke(t4, t, flowKt__TransformKt$runningReduce$1$1$emit$1);
                    if (invoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__TransformKt$runningReduce$1$1 = this;
                    t2 = invoke;
                    objectRef2 = objectRef;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__TransformKt$runningReduce$1$1$emit$1.L$1;
                    flowKt__TransformKt$runningReduce$1$1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) flowKt__TransformKt$runningReduce$1$1$emit$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    t2 = obj;
                }
                T t5 = t2;
                objectRef = objectRef2;
                t = t5;
                objectRef.element = t;
                flowCollector = flowKt__TransformKt$runningReduce$1$1.$this_unsafeFlow;
                t3 = flowKt__TransformKt$runningReduce$1$1.$accumulator.element;
                flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
                flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
                flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
                if (flowCollector.emit(t3, flowKt__TransformKt$runningReduce$1$1$emit$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__TransformKt$runningReduce$1$1$emit$1 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
        java.lang.Object obj2 = flowKt__TransformKt$runningReduce$1$1$emit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__TransformKt$runningReduce$1$1$emit$1.label;
        if (i != 0) {
        }
        T t52 = t2;
        objectRef = objectRef2;
        t = t52;
        objectRef.element = t;
        flowCollector = flowKt__TransformKt$runningReduce$1$1.$this_unsafeFlow;
        t3 = flowKt__TransformKt$runningReduce$1$1.$accumulator.element;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$0 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.L$1 = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.label = 2;
        if (flowCollector.emit(t3, flowKt__TransformKt$runningReduce$1$1$emit$1) == coroutine_suspended) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
