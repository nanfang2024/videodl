package tool.wu.heng.repository;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoParserRepository.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.repository.VideoParserRepository", f = "VideoParserRepository.kt", i = {}, l = {29}, m = "parseVideo-gIAlu-s", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoParserRepository$parseVideo$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ tool.wu.heng.repository.VideoParserRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoParserRepository$parseVideo$1(tool.wu.heng.repository.VideoParserRepository videoParserRepository, kotlin.coroutines.Continuation<? super tool.wu.heng.repository.VideoParserRepository$parseVideo$1> continuation) {
        super(continuation);
        this.this$0 = videoParserRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        java.lang.Object m1386parseVideogIAlus = this.this$0.m1386parseVideogIAlus(null, this);
        return m1386parseVideogIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m1386parseVideogIAlus : kotlin.Result.box-impl(m1386parseVideogIAlus);
    }
}
