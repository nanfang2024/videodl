package tool.wu.heng.parser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoParserEngine.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.parser.VideoParserEngine", f = "VideoParserEngine.kt", i = {}, l = {19}, m = "parse-gIAlu-s", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoParserEngine$parse$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ tool.wu.heng.parser.VideoParserEngine this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoParserEngine$parse$1(tool.wu.heng.parser.VideoParserEngine videoParserEngine, kotlin.coroutines.Continuation<? super tool.wu.heng.parser.VideoParserEngine$parse$1> continuation) {
        super(continuation);
        this.this$0 = videoParserEngine;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        java.lang.Object m1385parsegIAlus = this.this$0.m1385parsegIAlus(null, this);
        return m1385parsegIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m1385parsegIAlus : kotlin.Result.box-impl(m1385parsegIAlus);
    }
}
