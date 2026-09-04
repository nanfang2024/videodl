package tool.wu.heng.service;

/* compiled from: DownloadService.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.service.DownloadService$onStartCommand$1", f = "DownloadService.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class DownloadService$onStartCommand$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $taskId;
    int label;
    final /* synthetic */ tool.wu.heng.service.DownloadService this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$onStartCommand$1(tool.wu.heng.service.DownloadService downloadService, java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.service.DownloadService$onStartCommand$1> continuation) {
        super(2, continuation);
        this.this$0 = downloadService;
        this.$taskId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new tool.wu.heng.service.DownloadService$onStartCommand$1(this.this$0, this.$taskId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((tool.wu.heng.service.DownloadService$onStartCommand$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object downloadTaskWithRetry;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.label = 1;
            downloadTaskWithRetry = this.this$0.downloadTaskWithRetry(this.$taskId, this);
            if (downloadTaskWithRetry == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.this$0.stopSelf();
        return kotlin.Unit.INSTANCE;
    }
}
