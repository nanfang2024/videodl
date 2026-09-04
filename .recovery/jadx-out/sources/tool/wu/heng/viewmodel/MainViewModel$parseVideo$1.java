package tool.wu.heng.viewmodel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.viewmodel.MainViewModel$parseVideo$1", f = "MainViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MainViewModel$parseVideo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String $rawText;
    int label;
    final /* synthetic */ tool.wu.heng.viewmodel.MainViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$parseVideo$1(tool.wu.heng.viewmodel.MainViewModel mainViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.viewmodel.MainViewModel$parseVideo$1> continuation) {
        super(2, continuation);
        this.this$0 = mainViewModel;
        this.$rawText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new tool.wu.heng.viewmodel.MainViewModel$parseVideo$1(this.this$0, this.$rawText, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((tool.wu.heng.viewmodel.MainViewModel$parseVideo$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        tool.wu.heng.repository.VideoParserRepository videoParserRepository;
        java.lang.Object m1386parseVideogIAlus;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.this$0._parseUiState;
            mutableStateFlow2 = this.this$0._parseUiState;
            mutableStateFlow.setValue(((tool.wu.heng.viewmodel.MainViewModel.ParseUiState) mutableStateFlow2.getValue()).copy(true, kotlin.collections.CollectionsKt.emptyList(), null, false));
            videoParserRepository = this.this$0.repository;
            this.label = 1;
            m1386parseVideogIAlus = videoParserRepository.m1386parseVideogIAlus(this.$rawText, this);
            if (m1386parseVideogIAlus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            m1386parseVideogIAlus = ((kotlin.Result) obj).unbox-impl();
        }
        tool.wu.heng.viewmodel.MainViewModel mainViewModel = this.this$0;
        java.lang.Throwable th = kotlin.Result.exceptionOrNull-impl(m1386parseVideogIAlus);
        if (th != null) {
            mutableStateFlow3 = mainViewModel._parseUiState;
            java.lang.String message = th.getMessage();
            if (message == null) {
                message = "解析失败";
            }
            mutableStateFlow3.setValue(new tool.wu.heng.viewmodel.MainViewModel.ParseUiState(false, null, message, false, 10, null));
        } else {
            java.util.List list = (java.util.List) m1386parseVideogIAlus;
            java.util.List list2 = list;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (java.lang.Object obj2 : list2) {
                linkedHashMap.put(java.util.UUID.randomUUID().toString(), obj2);
            }
            mutableStateFlow4 = mainViewModel._pendingVideos;
            mutableStateFlow4.setValue(linkedHashMap);
            mutableStateFlow5 = mainViewModel._parseUiState;
            mutableStateFlow5.setValue(new tool.wu.heng.viewmodel.MainViewModel.ParseUiState(false, list, null, true, 4, null));
        }
        return kotlin.Unit.INSTANCE;
    }
}
