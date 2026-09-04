package kotlinx.coroutines.flow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Reduce.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aE\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001aG\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001ay\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\r\u001a\u0002H\f2H\b\u0004\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\f0\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a!\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u0016\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001as\u0010\u0017\u001a\u0002H\u0018\"\u0004\b\u0000\u0010\u0018\"\b\b\u0001\u0010\u0001*\u0002H\u0018*\b\u0012\u0004\u0012\u0002H\u00010\u00022F\u0010\u000e\u001aB\b\u0001\u0012\u0013\u0012\u0011H\u0018¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u0011H\u0001¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001b\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u001a#\u0010\u001c\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"first", "T", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "predicate", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "acc", "value", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "last", "lastOrNull", "reduce", "S", "accumulator", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "single", "singleOrNull", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class FlowKt__ReduceKt {
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.internal.Symbol, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S, T extends S> java.lang.Object reduce(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super S, ? super T, ? super kotlin.coroutines.Continuation<? super S>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super S> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1 flowKt__ReduceKt$reduce$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1) {
            flowKt__ReduceKt$reduce$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1) continuation;
            if ((flowKt__ReduceKt$reduce$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$reduce$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$reduce$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$reduce$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ReduceKt$reduce$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2<>(objectRef2, function3);
                    flowKt__ReduceKt$reduce$1.L$0 = objectRef2;
                    flowKt__ReduceKt$reduce$1.label = 1;
                    if (flow.collect(flowKt__ReduceKt$reduce$2, flowKt__ReduceKt$reduce$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$reduce$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    throw new java.util.NoSuchElementException("Empty flow can't be reduced");
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$reduce$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$reduce$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$reduce$1.label;
        if (i != 0) {
        }
        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T, R> java.lang.Object fold(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1 flowKt__ReduceKt$fold$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1) {
            flowKt__ReduceKt$fold$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1) continuation;
            if ((flowKt__ReduceKt$fold$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$fold$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$fold$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$fold$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = r;
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ReduceKt$fold$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2<>(objectRef2, function3);
                    flowKt__ReduceKt$fold$1.L$0 = objectRef2;
                    flowKt__ReduceKt$fold$1.label = 1;
                    if (flow.collect(flowKt__ReduceKt$fold$2, flowKt__ReduceKt$fold$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$fold$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$fold$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$fold$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$fold$1.label;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T, R> java.lang.Object fold$$forInline(kotlinx.coroutines.flow.Flow<? extends T> flow, R r, kotlin.jvm.functions.Function3<? super R, ? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function3, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
        objectRef.element = r;
        kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2(objectRef, function3);
        kotlin.jvm.internal.InlineMarker.mark(0);
        flow.collect(flowKt__ReduceKt$fold$2, continuation);
        kotlin.jvm.internal.InlineMarker.mark(1);
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object single(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1) {
            flowKt__ReduceKt$single$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1) continuation;
            if ((flowKt__ReduceKt$single$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$single$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$single$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$single$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            if (objectRef2.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                                throw new java.lang.IllegalArgumentException("Flow has more than one element".toString());
                            }
                            objectRef2.element = t;
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    flowKt__ReduceKt$single$1.L$0 = objectRef2;
                    flowKt__ReduceKt$single$1.label = 1;
                    if (flow.collect(flowCollector, flowKt__ReduceKt$single$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$single$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    throw new java.util.NoSuchElementException("Flow is empty");
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$single$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$single$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$single$1.label;
        if (i != 0) {
        }
        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object singleOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1 flowKt__ReduceKt$singleOrNull$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1) {
            flowKt__ReduceKt$singleOrNull$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1) continuation;
            if ((flowKt__ReduceKt$singleOrNull$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$singleOrNull$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$singleOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$singleOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            if (kotlin.jvm.internal.Ref.ObjectRef.this.element == kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                                kotlin.jvm.internal.Ref.ObjectRef.this.element = t;
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlin.jvm.internal.Ref.ObjectRef.this.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                            throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$singleOrNull$1.L$0 = objectRef2;
                        flowKt__ReduceKt$singleOrNull$1.L$1 = flowCollector2;
                        flowKt__ReduceKt$singleOrNull$1.label = 1;
                        if (flow.collect(flowCollector2, flowKt__ReduceKt$singleOrNull$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        objectRef = objectRef2;
                        e = e2;
                        flowCollector = flowCollector2;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) flowKt__ReduceKt$singleOrNull$1.L$1;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$singleOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                    }
                }
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    return null;
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$singleOrNull$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$singleOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$singleOrNull$1.label;
        if (i != 0) {
        }
        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1) continuation;
            if ((flowKt__ReduceKt$first$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$first$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$first$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            kotlin.jvm.internal.Ref.ObjectRef.this.element = t;
                            throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$first$1.L$0 = objectRef2;
                        flowKt__ReduceKt$first$1.L$1 = flowCollector2;
                        flowKt__ReduceKt$first$1.label = 1;
                        if (flow.collect(flowCollector2, flowKt__ReduceKt$first$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        objectRef = objectRef2;
                        e = e2;
                        flowCollector = flowCollector2;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1) flowKt__ReduceKt$first$1.L$1;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$first$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                    }
                }
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    throw new java.util.NoSuchElementException("Expected at least one element");
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$first$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$first$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$first$1.label;
        if (i != 0) {
        }
        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object first(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        int i;
        kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function22;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3) continuation;
            if ((flowKt__ReduceKt$first$3.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$first$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$first$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(function2, objectRef2);
                    try {
                        flowKt__ReduceKt$first$3.L$0 = function2;
                        flowKt__ReduceKt$first$3.L$1 = objectRef2;
                        flowKt__ReduceKt$first$3.L$2 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        flowKt__ReduceKt$first$3.label = 1;
                        if (flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, flowKt__ReduceKt$first$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        function22 = function2;
                        objectRef = objectRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        function22 = function2;
                        objectRef = objectRef2;
                        e = e2;
                        flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) flowKt__ReduceKt$first$3.L$2;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$first$3.L$1;
                    function22 = (kotlin.jvm.functions.Function2) flowKt__ReduceKt$first$3.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                        }
                    }
                }
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    throw new java.util.NoSuchElementException("Expected at least one element matching the predicate " + function22);
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$first$3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$first$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$first$3.label;
        if (i != 0) {
        }
        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<T> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1) continuation;
            if ((flowKt__ReduceKt$firstOrNull$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$firstOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$firstOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlinx.coroutines.flow.FlowCollector<T> flowCollector2 = new kotlinx.coroutines.flow.FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            kotlin.jvm.internal.Ref.ObjectRef.this.element = t;
                            throw new kotlinx.coroutines.flow.internal.AbortFlowException(this);
                        }
                    };
                    try {
                        flowKt__ReduceKt$firstOrNull$1.L$0 = objectRef2;
                        flowKt__ReduceKt$firstOrNull$1.L$1 = flowCollector2;
                        flowKt__ReduceKt$firstOrNull$1.label = 1;
                        if (flow.collect(flowCollector2, flowKt__ReduceKt$firstOrNull$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        objectRef = objectRef2;
                        e = e2;
                        flowCollector = flowCollector2;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        return objectRef.element;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) flowKt__ReduceKt$firstOrNull$1.L$1;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$1.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        return objectRef.element;
                    }
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$firstOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$firstOrNull$1.label;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object firstOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        kotlinx.coroutines.flow.internal.AbortFlowException e;
        kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) {
            flowKt__ReduceKt$firstOrNull$3 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3) continuation;
            if ((flowKt__ReduceKt$firstOrNull$3.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$3.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$firstOrNull$3.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$firstOrNull$3.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(function2, objectRef2);
                    try {
                        flowKt__ReduceKt$firstOrNull$3.L$0 = objectRef2;
                        flowKt__ReduceKt$firstOrNull$3.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        flowKt__ReduceKt$firstOrNull$3.label = 1;
                        if (flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, flowKt__ReduceKt$firstOrNull$3) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef = objectRef2;
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e2) {
                        objectRef = objectRef2;
                        e = e2;
                        flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        return objectRef.element;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) flowKt__ReduceKt$firstOrNull$3.L$1;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$firstOrNull$3.L$0;
                    try {
                        kotlin.ResultKt.throwOnFailure(obj);
                    } catch (kotlinx.coroutines.flow.internal.AbortFlowException e3) {
                        e = e3;
                        kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                        return objectRef.element;
                    }
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$firstOrNull$3 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$firstOrNull$3.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$firstOrNull$3.label;
        if (i != 0) {
        }
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object last(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1 flowKt__ReduceKt$last$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1) {
            flowKt__ReduceKt$last$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1) continuation;
            if ((flowKt__ReduceKt$last$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$last$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$last$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$last$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    objectRef2.element = (T) kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL;
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            objectRef2.element = t;
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    flowKt__ReduceKt$last$1.L$0 = objectRef2;
                    flowKt__ReduceKt$last$1.label = 1;
                    if (flow.collect(flowCollector, flowKt__ReduceKt$last$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$last$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
                    throw new java.util.NoSuchElementException("Expected at least one element");
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$last$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$last$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$last$1.label;
        if (i != 0) {
        }
        if (objectRef.element != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> java.lang.Object lastOrNull(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1 flowKt__ReduceKt$lastOrNull$1;
        int i;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        if (continuation instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1) {
            flowKt__ReduceKt$lastOrNull$1 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1) continuation;
            if ((flowKt__ReduceKt$lastOrNull$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                flowKt__ReduceKt$lastOrNull$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = flowKt__ReduceKt$lastOrNull$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = flowKt__ReduceKt$lastOrNull$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    final kotlin.jvm.internal.Ref.ObjectRef objectRef2 = new kotlin.jvm.internal.Ref.ObjectRef();
                    kotlinx.coroutines.flow.FlowCollector<? super java.lang.Object> flowCollector = new kotlinx.coroutines.flow.FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation2) {
                            objectRef2.element = t;
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    flowKt__ReduceKt$lastOrNull$1.L$0 = objectRef2;
                    flowKt__ReduceKt$lastOrNull$1.label = 1;
                    if (flow.collect(flowCollector, flowKt__ReduceKt$lastOrNull$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef = objectRef2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) flowKt__ReduceKt$lastOrNull$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return objectRef.element;
            }
        }
        flowKt__ReduceKt$lastOrNull$1 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1(continuation);
        java.lang.Object obj2 = flowKt__ReduceKt$lastOrNull$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = flowKt__ReduceKt$lastOrNull$1.label;
        if (i != 0) {
        }
        return objectRef.element;
    }
}
