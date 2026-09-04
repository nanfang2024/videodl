package kotlinx.coroutines.selects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Select.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.selects.SelectImplementation", f = "Select.kt", i = {}, l = {706}, m = "processResultAndInvokeBlockRecoveringException", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class SelectImplementation$processResultAndInvokeBlockRecoveringException$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.selects.SelectImplementation<R> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$processResultAndInvokeBlockRecoveringException$1(kotlinx.coroutines.selects.SelectImplementation<R> selectImplementation, kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1> continuation) {
        super(continuation);
        this.this$0 = selectImplementation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object processResultAndInvokeBlockRecoveringException;
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        processResultAndInvokeBlockRecoveringException = this.this$0.processResultAndInvokeBlockRecoveringException(null, null, this);
        return processResultAndInvokeBlockRecoveringException;
    }
}
