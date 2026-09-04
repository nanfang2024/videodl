package tool.wu.heng.viewmodel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.viewmodel.MainViewModel$observeDownloads$1", f = "MainViewModel.kt", i = {}, l = {kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_SHIFT}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MainViewModel$observeDownloads$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int label;
    final /* synthetic */ tool.wu.heng.viewmodel.MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$observeDownloads$1(tool.wu.heng.viewmodel.MainViewModel mainViewModel, kotlin.coroutines.Continuation<? super tool.wu.heng.viewmodel.MainViewModel$observeDownloads$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new tool.wu.heng.viewmodel.MainViewModel$observeDownloads$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((tool.wu.heng.viewmodel.MainViewModel$observeDownloads$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        tool.wu.heng.repository.VideoParserRepository videoParserRepository;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            videoParserRepository = this.this$0.repository;
            kotlinx.coroutines.flow.Flow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> observeDownloads = videoParserRepository.observeDownloads();
            final tool.wu.heng.viewmodel.MainViewModel mainViewModel = this.this$0;
            this.label = 1;
            if (observeDownloads.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: tool.wu.heng.viewmodel.MainViewModel$observeDownloads$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    return emit((java.util.List<tool.wu.heng.data.db.DownloadRecord>) obj2, (kotlin.coroutines.Continuation<? super kotlin.Unit>) continuation);
                }

                public final java.lang.Object emit(java.util.List<tool.wu.heng.data.db.DownloadRecord> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                    kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                    mutableStateFlow = tool.wu.heng.viewmodel.MainViewModel.this._downloads;
                    mutableStateFlow.setValue(list);
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
