package kotlinx.coroutines.flow;

/* compiled from: Share.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BE\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012-\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u0019\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R:\u0010\u0004\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "action", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onSubscription", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class SubscribedFlowCollector<T> implements kotlinx.coroutines.flow.FlowCollector<T> {
    private final kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> action;
    private final kotlinx.coroutines.flow.FlowCollector<T> collector;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.collector.emit(t, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.flow.FlowCollector<? super T>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function2) {
        this.collector = flowCollector;
        this.action = function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object onSubscription(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 subscribedFlowCollector$onSubscription$1;
        ?? r2;
        kotlinx.coroutines.flow.internal.SafeCollector safeCollector;
        kotlinx.coroutines.flow.SubscribedFlowCollector<T> subscribedFlowCollector;
        try {
            if (continuation instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) {
                subscribedFlowCollector$onSubscription$1 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) continuation;
                if ((subscribedFlowCollector$onSubscription$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                    subscribedFlowCollector$onSubscription$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                    java.lang.Object obj = subscribedFlowCollector$onSubscription$1.result;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = subscribedFlowCollector$onSubscription$1.label;
                    if (r2 != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        safeCollector = new kotlinx.coroutines.flow.internal.SafeCollector(this.collector, subscribedFlowCollector$onSubscription$1.getContext());
                        kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> function2 = this.action;
                        subscribedFlowCollector$onSubscription$1.L$0 = this;
                        subscribedFlowCollector$onSubscription$1.L$1 = safeCollector;
                        subscribedFlowCollector$onSubscription$1.label = 1;
                        if (function2.invoke(safeCollector, subscribedFlowCollector$onSubscription$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        subscribedFlowCollector = this;
                    } else {
                        if (r2 != 1) {
                            if (r2 != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        safeCollector = (kotlinx.coroutines.flow.internal.SafeCollector) subscribedFlowCollector$onSubscription$1.L$1;
                        subscribedFlowCollector = (kotlinx.coroutines.flow.SubscribedFlowCollector) subscribedFlowCollector$onSubscription$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    safeCollector.releaseIntercepted();
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector = subscribedFlowCollector.collector;
                    r2 = flowCollector instanceof kotlinx.coroutines.flow.SubscribedFlowCollector;
                    if (r2 != 0) {
                        return kotlin.Unit.INSTANCE;
                    }
                    subscribedFlowCollector$onSubscription$1.L$0 = null;
                    subscribedFlowCollector$onSubscription$1.L$1 = null;
                    subscribedFlowCollector$onSubscription$1.label = 2;
                    if (((kotlinx.coroutines.flow.SubscribedFlowCollector) flowCollector).onSubscription(subscribedFlowCollector$onSubscription$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }
            if (r2 != 0) {
            }
            safeCollector.releaseIntercepted();
            kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = subscribedFlowCollector.collector;
            r2 = flowCollector2 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector;
            if (r2 != 0) {
            }
        } catch (java.lang.Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
        subscribedFlowCollector$onSubscription$1 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1(this, continuation);
        java.lang.Object obj2 = subscribedFlowCollector$onSubscription$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = subscribedFlowCollector$onSubscription$1.label;
    }
}
