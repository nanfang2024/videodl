package tool.wu.heng.service;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DownloadService.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.service.DownloadService", f = "DownloadService.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12}, l = {160, 164, 190, 201, 216, 235, 239, 252, 276, 293, 298, 316, 318}, m = "downloadTask", n = {"this", "taskId", "dao", "this", "taskId", "dao", "record", "this", "taskId", "dao", "record", "this", "taskId", "dao", "record", "this", "taskId", "dao", "record", "$this$downloadTask_u24lambda_u246_u24lambda_u243", "this", "taskId", "dao", "record", "saveTarget", "output", "downloaded", "lastUiUpdate", "input", "buffer", "existingSize", "totalBytes", "startTime", "this", "taskId", "dao", "record", "this", "taskId", "dao", "record", "this", "taskId", "dao", "record", "saveTarget", "output", "downloaded", "lastUiUpdate", "input", "buffer", "existingSize", "totalBytes", "startTime", "now", "progress", "this", "taskId", "dao", "record", "saveTarget", "this", "taskId", "dao", "record", "saveTarget", "this", "dao", "record", "e", "this", "record"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$7", "L$8", "L$9", "L$11", "L$12", "J$0", "J$1", "J$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$7", "L$8", "L$9", "L$11", "L$12", "J$0", "J$1", "J$2", "J$3", "F$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DownloadService$downloadTask$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    float F$0;
    long J$0;
    long J$1;
    long J$2;
    long J$3;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$10;
    java.lang.Object L$11;
    java.lang.Object L$12;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    java.lang.Object L$6;
    java.lang.Object L$7;
    java.lang.Object L$8;
    java.lang.Object L$9;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ tool.wu.heng.service.DownloadService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$downloadTask$1(tool.wu.heng.service.DownloadService downloadService, kotlin.coroutines.Continuation<? super tool.wu.heng.service.DownloadService$downloadTask$1> continuation) {
        super(continuation);
        this.this$0 = downloadService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object downloadTask;
        this.result = obj;
        this.label |= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
        downloadTask = this.this$0.downloadTask(null, this);
        return downloadTask;
    }
}
