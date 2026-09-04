package kotlinx.coroutines.flow.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Combine.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {54, kotlin.io.encoding.Base64.mimeLineLength, 79}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CombineKt$combineInternal$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<T[]> $arrayFactory;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_combineInternal;
    final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, kotlin.jvm.functions.Function0<T[]> function0, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function3, kotlinx.coroutines.flow.FlowCollector<? super R> flowCollector, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2> continuation) {
        super(2, continuation);
        this.$flows = flowArr;
        this.$arrayFactory = function0;
        this.$transform = function3;
        this.$this_combineInternal = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 combineKt$combineInternal$2 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, continuation);
        combineKt$combineInternal$2.L$0 = obj;
        return combineKt$combineInternal$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111 A[EDGE_INSN: B:39:0x0111->B:25:0x0111 BREAK  A[LOOP:0: B:17:0x00ec->B:38:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlinx.coroutines.flow.Flow[], kotlinx.coroutines.flow.Flow<T>[]] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlinx.coroutines.flow.Flow<T>[]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0134 -> B:8:0x00c6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object[] objArr;
        byte b;
        byte[] bArr;
        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 combineKt$combineInternal$2;
        int i;
        kotlinx.coroutines.channels.Channel channel;
        byte b2;
        java.lang.Object obj2;
        java.lang.Object[] objArr2;
        kotlin.collections.IndexedValue indexedValue;
        int index;
        java.lang.Object obj3;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        int i3 = 2;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.L$0;
            int length = this.$flows.length;
            if (length == 0) {
                return kotlin.Unit.INSTANCE;
            }
            objArr = new java.lang.Object[length];
            kotlin.collections.ArraysKt.fill$default(objArr, kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED, 0, 0, 6, (java.lang.Object) null);
            kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(length, null, null, 6, null);
            java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger(length);
            b = 0;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4;
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1(this.$flows, i5, atomicInteger, Channel$default, null), 3, null);
                i4 = i5 + 1;
                atomicInteger = atomicInteger;
            }
            bArr = new byte[length];
            combineKt$combineInternal$2 = this;
            i = length;
            channel = Channel$default;
        } else if (i2 == 1) {
            ?? r2 = this.I$1;
            i = this.I$0;
            byte[] bArr2 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.Channel channel2 = (kotlinx.coroutines.channels.Channel) this.L$1;
            objArr2 = (java.lang.Object[]) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
            b2 = r2;
            bArr = bArr2;
            channel = channel2;
            combineKt$combineInternal$2 = this;
            indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m1163getOrNullimpl(obj2);
            if (indexedValue == null) {
                return kotlin.Unit.INSTANCE;
            }
            do {
                index = indexedValue.getIndex();
                obj3 = objArr2[index];
                objArr2[index] = indexedValue.getValue();
                if (obj3 == kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED) {
                    i--;
                }
                if (bArr[index] != b2) {
                    break;
                }
                bArr[index] = b2;
                indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m1163getOrNullimpl(channel.mo1153tryReceivePtdJZtk());
            } while (indexedValue != null);
            if (i != 0) {
                b = b2;
                objArr = objArr2;
            } else {
                java.lang.Object[] objArr3 = (java.lang.Object[]) combineKt$combineInternal$2.$arrayFactory.invoke();
                if (objArr3 == null) {
                    kotlin.jvm.functions.Function3 function3 = combineKt$combineInternal$2.$transform;
                    java.lang.Object obj4 = combineKt$combineInternal$2.$this_combineInternal;
                    combineKt$combineInternal$2.L$0 = objArr2;
                    combineKt$combineInternal$2.L$1 = channel;
                    combineKt$combineInternal$2.L$2 = bArr;
                    combineKt$combineInternal$2.I$0 = i;
                    combineKt$combineInternal$2.I$1 = b2;
                    combineKt$combineInternal$2.label = i3;
                    if (function3.invoke(obj4, objArr2, combineKt$combineInternal$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objArr = objArr2;
                    b = b2;
                } else {
                    byte b3 = b2;
                    kotlin.collections.ArraysKt.copyInto$default(objArr2, objArr3, 0, 0, 0, 14, (java.lang.Object) null);
                    kotlin.jvm.functions.Function3 function32 = combineKt$combineInternal$2.$transform;
                    java.lang.Object obj5 = combineKt$combineInternal$2.$this_combineInternal;
                    combineKt$combineInternal$2.L$0 = objArr2;
                    combineKt$combineInternal$2.L$1 = channel;
                    combineKt$combineInternal$2.L$2 = bArr;
                    combineKt$combineInternal$2.I$0 = i;
                    combineKt$combineInternal$2.I$1 = b3;
                    combineKt$combineInternal$2.label = 3;
                    if (function32.invoke(obj5, objArr3, combineKt$combineInternal$2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    b = b3;
                    objArr = objArr2;
                }
            }
            i3 = 2;
        } else if (i2 == 2) {
            ?? r22 = this.I$1;
            i = this.I$0;
            byte[] bArr3 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.Channel channel3 = (kotlinx.coroutines.channels.Channel) this.L$1;
            java.lang.Object[] objArr4 = (java.lang.Object[]) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            b = r22;
            bArr = bArr3;
            channel = channel3;
            objArr = objArr4;
            combineKt$combineInternal$2 = this;
        } else {
            if (i2 != 3) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ?? r23 = this.I$1;
            i = this.I$0;
            byte[] bArr4 = (byte[]) this.L$2;
            kotlinx.coroutines.channels.Channel channel4 = (kotlinx.coroutines.channels.Channel) this.L$1;
            java.lang.Object[] objArr5 = (java.lang.Object[]) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            b = r23;
            bArr = bArr4;
            channel = channel4;
            objArr = objArr5;
            combineKt$combineInternal$2 = this;
            i3 = 2;
        }
        byte b4 = (byte) (b + 1);
        combineKt$combineInternal$2.L$0 = objArr;
        combineKt$combineInternal$2.L$1 = channel;
        combineKt$combineInternal$2.L$2 = bArr;
        combineKt$combineInternal$2.I$0 = i;
        combineKt$combineInternal$2.I$1 = b4;
        combineKt$combineInternal$2.label = 1;
        obj2 = channel.mo1152receiveCatchingJP2dKIU(combineKt$combineInternal$2);
        if (obj2 != coroutine_suspended) {
            return coroutine_suspended;
        }
        b2 = b4;
        objArr2 = objArr;
        indexedValue = (kotlin.collections.IndexedValue) kotlinx.coroutines.channels.ChannelResult.m1163getOrNullimpl(obj2);
        if (indexedValue == null) {
        }
        do {
            index = indexedValue.getIndex();
            obj3 = objArr2[index];
            objArr2[index] = indexedValue.getValue();
            if (obj3 == kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED) {
            }
            if (bArr[index] != b2) {
            }
        } while (indexedValue != null);
        if (i != 0) {
        }
        i3 = 2;
        byte b42 = (byte) (b + 1);
        combineKt$combineInternal$2.L$0 = objArr;
        combineKt$combineInternal$2.L$1 = channel;
        combineKt$combineInternal$2.L$2 = bArr;
        combineKt$combineInternal$2.I$0 = i;
        combineKt$combineInternal$2.I$1 = b42;
        combineKt$combineInternal$2.label = 1;
        obj2 = channel.mo1152receiveCatchingJP2dKIU(combineKt$combineInternal$2);
        if (obj2 != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
        final /* synthetic */ int $i;
        final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $nonClosed;
        final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] flowArr, int i, java.util.concurrent.atomic.AtomicInteger atomicInteger, kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1> continuation) {
            super(2, continuation);
            this.$flows = flowArr;
            this.$i = i;
            this.$nonClosed = atomicInteger;
            this.$resultChannel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            return new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.util.concurrent.atomic.AtomicInteger atomicInteger;
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.$flows[this.$i].collect(new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C00001(this.$resultChannel, this.$i), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                }
                return kotlin.Unit.INSTANCE;
            } finally {
                if (this.$nonClosed.decrementAndGet() == 0) {
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: /workspace/.recovery/dex/classes3.dex */
        public static final class C00001<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ int $i;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;

            C00001(kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel, int i) {
                this.$resultChannel = channel;
                this.$i = i;
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 combineKt$combineInternal$2$1$1$emit$1;
                java.lang.Object coroutine_suspended;
                int i;
                if (continuation instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) {
                    combineKt$combineInternal$2$1$1$emit$1 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) continuation;
                    if ((combineKt$combineInternal$2$1$1$emit$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                        combineKt$combineInternal$2$1$1$emit$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                        java.lang.Object obj = combineKt$combineInternal$2$1$1$emit$1.result;
                        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = combineKt$combineInternal$2$1$1$emit$1.label;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> channel = this.$resultChannel;
                            kotlin.collections.IndexedValue<java.lang.Object> indexedValue = new kotlin.collections.IndexedValue<>(this.$i, t);
                            combineKt$combineInternal$2$1$1$emit$1.label = 1;
                            if (channel.send(indexedValue, combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj);
                                return kotlin.Unit.INSTANCE;
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        combineKt$combineInternal$2$1$1$emit$1.label = 2;
                        if (kotlinx.coroutines.YieldKt.yield(combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }
                combineKt$combineInternal$2$1$1$emit$1 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1(this, continuation);
                java.lang.Object obj2 = combineKt$combineInternal$2$1$1$emit$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = combineKt$combineInternal$2$1$1$emit$1.label;
                if (i != 0) {
                }
                combineKt$combineInternal$2$1$1$emit$1.label = 2;
                if (kotlinx.coroutines.YieldKt.yield(combineKt$combineInternal$2$1$1$emit$1) == coroutine_suspended) {
                }
                return kotlin.Unit.INSTANCE;
            }
        }
    }
}
