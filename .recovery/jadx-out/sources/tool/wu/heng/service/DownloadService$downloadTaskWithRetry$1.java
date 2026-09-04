package tool.wu.heng.service;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadService.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.service.DownloadService", f = "DownloadService.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 6, 6}, l = {116, okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, 133, 135, 137, 142, 144}, m = "downloadTaskWithRetry", n = {"this", "taskId", "dao", "retryCount", "this", "taskId", "dao", "retryCount", "this", "taskId", "dao", "retryCount", "this", "taskId", "dao", "retryCount", "this", "taskId", "dao", "retryCount", "this", "dao", "this", "finalRecord"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DownloadService$downloadTaskWithRetry$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int I$0;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ tool.wu.heng.service.DownloadService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$downloadTaskWithRetry$1(tool.wu.heng.service.DownloadService downloadService, kotlin.coroutines.Continuation<? super tool.wu.heng.service.DownloadService$downloadTaskWithRetry$1> continuation) {
        super(continuation);
        this.this$0 = downloadService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object downloadTaskWithRetry;
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        downloadTaskWithRetry = this.this$0.downloadTaskWithRetry(null, this);
        return downloadTaskWithRetry;
    }
}
