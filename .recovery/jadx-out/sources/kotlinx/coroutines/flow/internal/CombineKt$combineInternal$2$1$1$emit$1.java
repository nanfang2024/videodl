package kotlinx.coroutines.flow.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Combine.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", i = {}, l = {32, 33}, m = "emit", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CombineKt$combineInternal$2$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C00001<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$combineInternal$2$1$1$emit$1(kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.AnonymousClass1.C00001<? super T> c00001, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = c00001;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
