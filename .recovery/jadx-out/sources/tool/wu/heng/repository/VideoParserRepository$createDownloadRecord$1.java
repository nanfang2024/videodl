package tool.wu.heng.repository;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoParserRepository.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.repository.VideoParserRepository", f = "VideoParserRepository.kt", i = {0}, l = {51}, m = "createDownloadRecord", n = {"id"}, s = {"L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoParserRepository$createDownloadRecord$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ tool.wu.heng.repository.VideoParserRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoParserRepository$createDownloadRecord$1(tool.wu.heng.repository.VideoParserRepository videoParserRepository, kotlin.coroutines.Continuation<? super tool.wu.heng.repository.VideoParserRepository$createDownloadRecord$1> continuation) {
        super(continuation);
        this.this$0 = videoParserRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        return this.this$0.createDownloadRecord(null, this);
    }
}
