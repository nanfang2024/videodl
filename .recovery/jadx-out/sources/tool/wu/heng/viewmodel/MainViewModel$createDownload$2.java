package tool.wu.heng.viewmodel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.viewmodel.MainViewModel$createDownload$2", f = "MainViewModel.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MainViewModel$createDownload$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> $onCreated;
    final /* synthetic */ tool.wu.heng.data.model.VideoInfo $video;
    int label;
    final /* synthetic */ tool.wu.heng.viewmodel.MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MainViewModel$createDownload$2(tool.wu.heng.viewmodel.MainViewModel mainViewModel, tool.wu.heng.data.model.VideoInfo videoInfo, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super tool.wu.heng.viewmodel.MainViewModel$createDownload$2> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
        this.$video = videoInfo;
        this.$onCreated = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new tool.wu.heng.viewmodel.MainViewModel$createDownload$2(this.this$0, this.$video, this.$onCreated, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((tool.wu.heng.viewmodel.MainViewModel$createDownload$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        tool.wu.heng.repository.VideoParserRepository videoParserRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            videoParserRepository = this.this$0.repository;
            this.label = 1;
            obj = videoParserRepository.createDownloadRecord(this.$video, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str = (java.lang.String) obj;
        timber.log.Timber.INSTANCE.d("下载记录已创建: %s", str);
        this.$onCreated.invoke(str);
        return kotlin.Unit.INSTANCE;
    }
}
