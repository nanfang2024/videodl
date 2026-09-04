package tool.wu.heng.viewmodel;

/* compiled from: MainViewModel.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rJ$\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u000e2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u001d0\"J\u000e\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010$\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020\rJ\b\u0010&\u001a\u00020\u001dH\u0002J\u000e\u0010'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\rJ\u000e\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rJ\u0006\u0010*\u001a\u00020\u001dJ\u000e\u0010+\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rJ\u000e\u0010,\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006."}, d2 = {"Ltool/wu/heng/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_downloads", "Lkotlinx/coroutines/flow/MutableStateFlow;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/db/DownloadRecord;", "_parseUiState", "Ltool/wu/heng/viewmodel/MainViewModel$ParseUiState;", "_pendingVideos", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "downloads", "Lkotlinx/coroutines/flow/StateFlow;", "getDownloads", "()Lkotlinx/coroutines/flow/StateFlow;", "parseUiState", "getParseUiState", "pendingVideos", "getPendingVideos", "repository", "Ltool/wu/heng/repository/VideoParserRepository;", "supportedPlatforms", "getSupportedPlatforms", "()Ljava/util/List;", "cancelDownload", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "id", "createDownload", "video", "onCreated", "Lkotlin/Function1;", "deleteDownload", "getVideoById", "videoId", "observeDownloads", "parseVideo", "rawText", "pauseDownload", "resetParseResult", "resumeDownload", "retryDownload", "ParseUiState", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    public static final int $stable = 8;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> _downloads;
    private final kotlinx.coroutines.flow.MutableStateFlow<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> _parseUiState;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo>> _pendingVideos;
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> downloads;
    private final kotlinx.coroutines.flow.StateFlow<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> parseUiState;
    private final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo>> pendingVideos;
    private final tool.wu.heng.repository.VideoParserRepository repository;
    private final java.util.List<java.lang.String> supportedPlatforms;

    public final kotlinx.coroutines.flow.StateFlow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> getDownloads() {
        return this.downloads;
    }

    public final kotlinx.coroutines.flow.StateFlow<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> getParseUiState() {
        return this.parseUiState;
    }

    public final kotlinx.coroutines.flow.StateFlow<java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo>> getPendingVideos() {
        return this.pendingVideos;
    }

    public final java.util.List<java.lang.String> getSupportedPlatforms() {
        return this.supportedPlatforms;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel(android.app.Application application) {
        super(application);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
        tool.wu.heng.repository.VideoParserRepository videoParserRepository = new tool.wu.heng.repository.VideoParserRepository(application);
        this.repository = videoParserRepository;
        kotlinx.coroutines.flow.MutableStateFlow<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> MutableStateFlow = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(new tool.wu.heng.viewmodel.MainViewModel.ParseUiState(false, null, null, false, 15, null));
        this._parseUiState = MutableStateFlow;
        this.parseUiState = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> MutableStateFlow2 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.CollectionsKt.emptyList());
        this._downloads = MutableStateFlow2;
        this.downloads = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow2);
        kotlinx.coroutines.flow.MutableStateFlow<java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo>> MutableStateFlow3 = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(kotlin.collections.MapsKt.emptyMap());
        this._pendingVideos = MutableStateFlow3;
        this.pendingVideos = kotlinx.coroutines.flow.FlowKt.asStateFlow(MutableStateFlow3);
        this.supportedPlatforms = videoParserRepository.getSupportedPlatforms();
        observeDownloads();
    }

    /* compiled from: MainViewModel.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Ltool/wu/heng/viewmodel/MainViewModel$ParseUiState;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isLoading", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "videos", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "errorMessage", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isParseSuccessful", "(ZLjava/util/List;Ljava/lang/String;Z)V", "getErrorMessage", "()Ljava/lang/String;", "()Z", "getVideos", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final /* data */ class ParseUiState {
        public static final int $stable = 8;
        private final java.lang.String errorMessage;
        private final boolean isLoading;
        private final boolean isParseSuccessful;
        private final java.util.List<tool.wu.heng.data.model.VideoInfo> videos;

        public ParseUiState() {
            this(false, null, null, false, 15, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ tool.wu.heng.viewmodel.MainViewModel.ParseUiState copy$default(tool.wu.heng.viewmodel.MainViewModel.ParseUiState parseUiState, boolean z, java.util.List list, java.lang.String str, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = parseUiState.isLoading;
            }
            if ((i & 2) != 0) {
                list = parseUiState.videos;
            }
            if ((i & 4) != 0) {
                str = parseUiState.errorMessage;
            }
            if ((i & 8) != 0) {
                z2 = parseUiState.isParseSuccessful;
            }
            return parseUiState.copy(z, list, str, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final java.util.List<tool.wu.heng.data.model.VideoInfo> component2() {
            return this.videos;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsParseSuccessful() {
            return this.isParseSuccessful;
        }

        public final tool.wu.heng.viewmodel.MainViewModel.ParseUiState copy(boolean isLoading, java.util.List<tool.wu.heng.data.model.VideoInfo> videos, java.lang.String errorMessage, boolean isParseSuccessful) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videos, "videos");
            return new tool.wu.heng.viewmodel.MainViewModel.ParseUiState(isLoading, videos, errorMessage, isParseSuccessful);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof tool.wu.heng.viewmodel.MainViewModel.ParseUiState)) {
                return false;
            }
            tool.wu.heng.viewmodel.MainViewModel.ParseUiState parseUiState = (tool.wu.heng.viewmodel.MainViewModel.ParseUiState) other;
            return this.isLoading == parseUiState.isLoading && kotlin.jvm.internal.Intrinsics.areEqual(this.videos, parseUiState.videos) && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, parseUiState.errorMessage) && this.isParseSuccessful == parseUiState.isParseSuccessful;
        }

        public final java.lang.String getErrorMessage() {
            return this.errorMessage;
        }

        public final java.util.List<tool.wu.heng.data.model.VideoInfo> getVideos() {
            return this.videos;
        }

        public int hashCode() {
            int hashCode = ((java.lang.Boolean.hashCode(this.isLoading) * 31) + this.videos.hashCode()) * 31;
            java.lang.String str = this.errorMessage;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.isParseSuccessful);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final boolean isParseSuccessful() {
            return this.isParseSuccessful;
        }

        public java.lang.String toString() {
            return "ParseUiState(isLoading=" + this.isLoading + ", videos=" + this.videos + ", errorMessage=" + this.errorMessage + ", isParseSuccessful=" + this.isParseSuccessful + ")";
        }

        public ParseUiState(boolean z, java.util.List<tool.wu.heng.data.model.VideoInfo> videos, java.lang.String str, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videos, "videos");
            this.isLoading = z;
            this.videos = videos;
            this.errorMessage = str;
            this.isParseSuccessful = z2;
        }

        public /* synthetic */ ParseUiState(boolean z, java.util.List list, java.lang.String str, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2);
        }
    }

    private final void observeDownloads() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$observeDownloads$1(this, null), 3, null);
    }

    public final void parseVideo(java.lang.String rawText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawText, "rawText");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$parseVideo$1(this, rawText, null), 3, null);
    }

    public final tool.wu.heng.data.model.VideoInfo getVideoById(java.lang.String videoId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoId, "videoId");
        return this._pendingVideos.getValue().get(videoId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void createDownload$default(tool.wu.heng.viewmodel.MainViewModel mainViewModel, tool.wu.heng.data.model.VideoInfo videoInfo, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function1 = new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.viewmodel.MainViewModel$createDownload$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(java.lang.String it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                    invoke2(str);
                    return kotlin.Unit.INSTANCE;
                }
            };
        }
        mainViewModel.createDownload(videoInfo, function1);
    }

    public final void createDownload(tool.wu.heng.data.model.VideoInfo video, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onCreated) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(video, "video");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onCreated, "onCreated");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$createDownload$2(this, video, onCreated, null), 3, null);
    }

    public final void pauseDownload(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$pauseDownload$1(this, id, null), 3, null);
    }

    public final void resumeDownload(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$resumeDownload$1(this, id, null), 3, null);
    }

    public final void cancelDownload(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$cancelDownload$1(this, id, null), 3, null);
    }

    public final void deleteDownload(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$deleteDownload$1(this, id, null), 3, null);
    }

    public final void retryDownload(java.lang.String id) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.ViewModelKt.getViewModelScope((androidx.lifecycle.ViewModel) this), null, null, new tool.wu.heng.viewmodel.MainViewModel$retryDownload$1(this, id, null), 3, null);
    }

    public final void resetParseResult() {
        this._parseUiState.setValue(new tool.wu.heng.viewmodel.MainViewModel.ParseUiState(false, null, null, false, 15, null));
    }
}
