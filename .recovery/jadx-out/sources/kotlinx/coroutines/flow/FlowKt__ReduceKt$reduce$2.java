package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "S", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlowKt__ReduceKt$reduce$2<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $accumulator;
    final /* synthetic */ kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> $operation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ReduceKt$reduce$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> function3) {
        this.$accumulator = objectRef;
        this.$operation = function3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef;
        T t2;
        kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> objectRef2;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) {
            flowKt__ReduceKt$reduce$2$emit$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1) continuation;
            if ((flowKt__ReduceKt$reduce$2$emit$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$2$emit$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$reduce$2$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$reduce$2$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    objectRef = this.$accumulator;
                    if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        kotlin.jvm.functions.Function3<S, T, kotlin.coroutines.Continuation<? super S>, java.lang.Object> function3 = this.$operation;
                        java.lang.Object obj2 = this.$accumulator.element;
                        flowKt__ReduceKt$reduce$2$emit$1.L$0 = objectRef;
                        flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                        java.lang.Object invoke = function3.invoke(obj2, t, flowKt__ReduceKt$reduce$2$emit$1);
                        if (invoke == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        t2 = invoke;
                        objectRef2 = objectRef;
                    }
                    objectRef.element = t;
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                objectRef2 = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$reduce$2$emit$1.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                t2 = obj;
                T t3 = t2;
                objectRef = objectRef2;
                t = t3;
                objectRef.element = t;
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__ReduceKt$reduce$2$emit$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2$emit$1(this, continuation);
        java.lang.Object obj3 = flowKt__ReduceKt$reduce$2$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$reduce$2$emit$1.label;
        if (i != 0) {
        }
        T t32 = t2;
        objectRef = objectRef2;
        t = t32;
        objectRef.element = t;
        return kotlin.Unit.INSTANCE;
    }
}
