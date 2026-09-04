package kotlinx.coroutines.flow;

/* compiled from: Merge.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b2\u001e\u0010\f\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\r\"\b\u0012\u0004\u0012\u0002H\u000b0\n¢\u0006\u0002\u0010\u000e\u001ae\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n27\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001ah\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n29\b\u0005\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001ao\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u000127\u0010\u0011\u001a3\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\nH\u0007\u001a.\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0\n2\b\b\u0002\u0010\u001b\u001a\u00020\u0001H\u0007\u001aa\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n23\b\u0001\u0010\u0011\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0012H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a\"\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0004\b\u0000\u0010\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000b0\n0 \u001ar\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00100\n\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u000b0\n2D\b\u0001\u0010\u0011\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00100#\u0012\u0013\u0012\u0011H\u000b¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\"¢\u0006\u0002\b%H\u0007ø\u0001\u0000¢\u0006\u0002\u0010&\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"DEFAULT_CONCURRENCY", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getDEFAULT_CONCURRENCY$annotations", "()V", "getDEFAULT_CONCURRENCY", "()I", "DEFAULT_CONCURRENCY_PROPERTY_NAME", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations", "merge", "Lkotlinx/coroutines/flow/Flow;", "T", "flows", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "([Lkotlinx/coroutines/flow/Flow;)Lkotlinx/coroutines/flow/Flow;", "flatMapConcat", "R", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flatMapLatest", "flatMapMerge", "concurrency", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "flattenConcat", "flattenMerge", "mapLatest", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "transformLatest", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = kotlinx.coroutines.internal.SystemPropsKt.systemProp(kotlinx.coroutines.flow.FlowKt.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    public static final int getDEFAULT_CONCURRENCY() {
        return DEFAULT_CONCURRENCY;
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flatMapMerge$default(kotlinx.coroutines.flow.Flow flow, int i, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_CONCURRENCY;
        }
        return kotlinx.coroutines.flow.FlowKt.flatMapMerge(flow, i, function2);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(java.lang.Iterable<? extends kotlinx.coroutines.flow.Flow<? extends T>> iterable) {
        return new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> merge(kotlinx.coroutines.flow.Flow<? extends T>... flowArr) {
        return kotlinx.coroutines.flow.FlowKt.merge(kotlin.collections.ArraysKt.asIterable(flowArr));
    }

    public static /* synthetic */ kotlinx.coroutines.flow.Flow flattenMerge$default(kotlinx.coroutines.flow.Flow flow, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_CONCURRENCY;
        }
        return kotlinx.coroutines.flow.FlowKt.flattenMerge(flow, i);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow, int i) {
        if (i > 0) {
            return i == 1 ? kotlinx.coroutines.flow.FlowKt.flattenConcat(flow) : new kotlinx.coroutines.flow.internal.ChannelFlowMerge(flow, i, null, 0, null, 28, null);
        }
        throw new java.lang.IllegalArgumentException(("Expected positive concurrency level, but had " + i).toString());
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3) {
        return new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest(function3, flow, null, 0, null, 28, null);
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(flow, new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1(function2, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> mapLatest(kotlinx.coroutines.flow.Flow<? extends T> flow, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.transformLatest(flow, new kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1(function2, null));
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapConcat(final kotlinx.coroutines.flow.Flow<? extends T> flow, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.flattenConcat(new kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /workspace/.recovery/dex/classes3.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function2 $transform$inlined;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object obj2;
                    java.lang.Object coroutine_suspended;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                            anonymousClass1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                kotlin.jvm.functions.Function2 function2 = this.$transform$inlined;
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                java.lang.Object invoke = function2.invoke(obj, anonymousClass1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = invoke;
                                flowCollector = flowCollector2;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    return kotlin.Unit.INSTANCE;
                                }
                                kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector = flowCollector3;
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        });
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> flatMapMerge(final kotlinx.coroutines.flow.Flow<? extends T> flow, int i, final kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends R>>, ? extends java.lang.Object> function2) {
        return kotlinx.coroutines.flow.FlowKt.flattenMerge(new kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* compiled from: Emitters.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: /workspace/.recovery/dex/classes3.dex */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function2 $transform$inlined;

                /* compiled from: Emitters.kt */
                @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
                /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
                    java.lang.Object L$0;
                    int label;
                    /* synthetic */ java.lang.Object result;

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.result = obj;
                        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                        return kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.jvm.functions.Function2 function2) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = function2;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    java.lang.Object obj2;
                    java.lang.Object coroutine_suspended;
                    int i;
                    kotlinx.coroutines.flow.FlowCollector flowCollector;
                    if (continuation instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        if ((anonymousClass1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                            anonymousClass1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                            obj2 = anonymousClass1.result;
                            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                kotlin.jvm.functions.Function2 function2 = this.$transform$inlined;
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                java.lang.Object invoke = function2.invoke(obj, anonymousClass1);
                                if (invoke == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj2 = invoke;
                                flowCollector = flowCollector2;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.ResultKt.throwOnFailure(obj2);
                                    return kotlin.Unit.INSTANCE;
                                }
                                kotlinx.coroutines.flow.FlowCollector flowCollector3 = (kotlinx.coroutines.flow.FlowCollector) anonymousClass1.L$0;
                                kotlin.ResultKt.throwOnFailure(obj2);
                                flowCollector = flowCollector3;
                            }
                            anonymousClass1.L$0 = null;
                            anonymousClass1.label = 2;
                            if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    obj2 = anonymousClass1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.label = 2;
                    if (flowCollector.emit(obj2, anonymousClass1) == coroutine_suspended) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2(flowCollector, function2), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        }, i);
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> flattenConcat(final kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> flow) {
        return new kotlinx.coroutines.flow.Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1(flowCollector), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }
        };
    }
}
