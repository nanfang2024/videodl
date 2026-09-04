package tool.wu.heng.parser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DouyinParser.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.parser.DouyinParser", f = "DouyinParser.kt", i = {0, 0, 0}, l = {51}, m = "parse", n = {"this", "sharePage", "lastError"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DouyinParser$parse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    int I$1;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ tool.wu.heng.parser.DouyinParser this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DouyinParser$parse$1(tool.wu.heng.parser.DouyinParser douyinParser, kotlin.coroutines.Continuation<? super tool.wu.heng.parser.DouyinParser$parse$1> continuation) {
        super(continuation);
        this.this$0 = douyinParser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return this.this$0.parse(null, this);
    }
}
