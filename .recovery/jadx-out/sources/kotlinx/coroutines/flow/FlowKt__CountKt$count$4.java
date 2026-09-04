package kotlinx.coroutines.flow;

/* compiled from: Count.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class FlowKt__CountKt$count$4<T> implements kotlinx.coroutines.flow.FlowCollector {
    final /* synthetic */ kotlin.jvm.internal.Ref.IntRef $i;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $predicate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__CountKt$count$4(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.jvm.internal.Ref.IntRef intRef) {
        this.$predicate = function2;
        this.$i = intRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
        java.lang.Object obj;
        int i;
        kotlinx.coroutines.flow.FlowKt__CountKt$count$4<T> flowKt__CountKt$count$4;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) {
            flowKt__CountKt$count$4$emit$1 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1) continuation;
            if ((flowKt__CountKt$count$4$emit$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__CountKt$count$4$emit$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                obj = flowKt__CountKt$count$4$emit$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__CountKt$count$4$emit$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> function2 = this.$predicate;
                    flowKt__CountKt$count$4$emit$1.L$0 = this;
                    flowKt__CountKt$count$4$emit$1.label = 1;
                    obj = function2.invoke(t, flowKt__CountKt$count$4$emit$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    flowKt__CountKt$count$4 = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__CountKt$count$4 = (kotlinx.coroutines.flow.FlowKt__CountKt$count$4) flowKt__CountKt$count$4$emit$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (((java.lang.Boolean) obj).booleanValue()) {
                    flowKt__CountKt$count$4.$i.element++;
                    int i2 = flowKt__CountKt$count$4.$i.element;
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        flowKt__CountKt$count$4$emit$1 = new kotlinx.coroutines.flow.FlowKt__CountKt$count$4$emit$1(this, continuation);
        obj = flowKt__CountKt$count$4$emit$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__CountKt$count$4$emit$1.label;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
