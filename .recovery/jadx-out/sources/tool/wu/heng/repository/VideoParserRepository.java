package tool.wu.heng.repository;

/* compiled from: VideoParserRepository.kt */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0016J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00160\u0018J*\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00160\u001a2\u0006\u0010\u001b\u001a\u00020\fH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\rJ\u0016\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u0016\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\rJ\u001e\u0010 \u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010!\u001a\u00020\"H\u0086@¢\u0006\u0002\u0010#R\u0016\u0010\u0005\u001a\n \u0006*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Ltool/wu/heng/repository/VideoParserRepository;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appContext", "kotlin.jvm.PlatformType", "dao", "Ltool/wu/heng/data/db/DownloadRecordDao;", "cancelDownload", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "id", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDownloadRecord", "video", "Ltool/wu/heng/data/model/VideoInfo;", "(Ltool/wu/heng/data/model/VideoInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDownload", "getDownloadRecord", "Ltool/wu/heng/data/db/DownloadRecord;", "getSupportedPlatforms", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "observeDownloads", "Lkotlinx/coroutines/flow/Flow;", "parseVideo", "Lkotlin/Result;", "rawText", "parseVideo-gIAlu-s", "pauseDownload", "resumeDownload", "retryDownload", "updateStatus", "status", "Ltool/wu/heng/data/model/DownloadStatus;", "(Ljava/lang/String;Ltool/wu/heng/data/model/DownloadStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoParserRepository {
    public static final int $stable = 8;
    private final android.content.Context appContext;
    private final tool.wu.heng.data.db.DownloadRecordDao dao;

    public VideoParserRepository(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        android.content.Context appContext = context.getApplicationContext();
        this.appContext = appContext;
        tool.wu.heng.data.db.AppDatabase.Companion companion = tool.wu.heng.data.db.AppDatabase.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        this.dao = companion.getInstance(appContext).downloadRecordDao();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: parseVideo-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m1386parseVideogIAlus(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<tool.wu.heng.data.model.VideoInfo>>> continuation) {
        tool.wu.heng.repository.VideoParserRepository$parseVideo$1 videoParserRepository$parseVideo$1;
        int i;
        java.lang.Object m1385parsegIAlus;
        java.lang.Throwable th;
        if (continuation instanceof tool.wu.heng.repository.VideoParserRepository$parseVideo$1) {
            videoParserRepository$parseVideo$1 = (tool.wu.heng.repository.VideoParserRepository$parseVideo$1) continuation;
            if ((videoParserRepository$parseVideo$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                videoParserRepository$parseVideo$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = videoParserRepository$parseVideo$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoParserRepository$parseVideo$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tool.wu.heng.parser.VideoParserEngine videoParserEngine = tool.wu.heng.parser.VideoParserEngine.INSTANCE;
                    videoParserRepository$parseVideo$1.label = 1;
                    m1385parsegIAlus = videoParserEngine.m1385parsegIAlus(str, videoParserRepository$parseVideo$1);
                    if (m1385parsegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    m1385parsegIAlus = ((kotlin.Result) obj).unbox-impl();
                }
                th = kotlin.Result.exceptionOrNull-impl(m1385parsegIAlus);
                if (th != null) {
                    timber.log.Timber.INSTANCE.w("本地解析失败：%s", th.getMessage());
                }
                return m1385parsegIAlus;
            }
        }
        videoParserRepository$parseVideo$1 = new tool.wu.heng.repository.VideoParserRepository$parseVideo$1(this, continuation);
        java.lang.Object obj2 = videoParserRepository$parseVideo$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoParserRepository$parseVideo$1.label;
        if (i != 0) {
        }
        th = kotlin.Result.exceptionOrNull-impl(m1385parsegIAlus);
        if (th != null) {
        }
        return m1385parsegIAlus;
    }

    public final java.util.List<java.lang.String> getSupportedPlatforms() {
        return tool.wu.heng.parser.VideoParserEngine.INSTANCE.getSupportedPlatforms();
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> observeDownloads() {
        return this.dao.observeAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object createDownloadRecord(tool.wu.heng.data.model.VideoInfo videoInfo, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        tool.wu.heng.repository.VideoParserRepository$createDownloadRecord$1 videoParserRepository$createDownloadRecord$1;
        int i;
        java.lang.String str;
        if (continuation instanceof tool.wu.heng.repository.VideoParserRepository$createDownloadRecord$1) {
            videoParserRepository$createDownloadRecord$1 = (tool.wu.heng.repository.VideoParserRepository$createDownloadRecord$1) continuation;
            if ((videoParserRepository$createDownloadRecord$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                videoParserRepository$createDownloadRecord$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = videoParserRepository$createDownloadRecord$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoParserRepository$createDownloadRecord$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao = this.dao;
                    java.lang.String title = videoInfo.getTitle();
                    if (kotlin.text.StringsKt.isBlank(title)) {
                        title = "未命名视频";
                    }
                    tool.wu.heng.data.db.DownloadRecord downloadRecord = new tool.wu.heng.data.db.DownloadRecord(uuid, title, videoInfo.getThumbnail(), videoInfo.getDownloadUrl(), null, videoInfo.getExt(), videoInfo.getSource(), null, 0.0f, 0L, 0L, 0L, null, 0L, null, 32656, null);
                    videoParserRepository$createDownloadRecord$1.L$0 = uuid;
                    videoParserRepository$createDownloadRecord$1.label = 1;
                    if (downloadRecordDao.insert(downloadRecord, videoParserRepository$createDownloadRecord$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = uuid;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (java.lang.String) videoParserRepository$createDownloadRecord$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                timber.log.Timber.INSTANCE.d("创建下载记录: %s", str);
                return str;
            }
        }
        videoParserRepository$createDownloadRecord$1 = new tool.wu.heng.repository.VideoParserRepository$createDownloadRecord$1(this, continuation);
        java.lang.Object obj2 = videoParserRepository$createDownloadRecord$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoParserRepository$createDownloadRecord$1.label;
        if (i != 0) {
        }
        timber.log.Timber.INSTANCE.d("创建下载记录: %s", str);
        return str;
    }

    public final java.lang.Object getDownloadRecord(java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.data.db.DownloadRecord> continuation) {
        return this.dao.getById(str, continuation);
    }

    public final java.lang.Object updateStatus(java.lang.String str, tool.wu.heng.data.model.DownloadStatus downloadStatus, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateStatus = this.dao.updateStatus(str, downloadStatus.name(), continuation);
        return updateStatus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateStatus : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object pauseDownload(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateStatus = this.dao.updateStatus(str, "PAUSED", continuation);
        return updateStatus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateStatus : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object resumeDownload(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateStatus = this.dao.updateStatus(str, "PENDING", continuation);
        return updateStatus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateStatus : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object cancelDownload(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object updateStatus = this.dao.updateStatus(str, "CANCELLED", continuation);
        return updateStatus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateStatus : kotlin.Unit.INSTANCE;
    }

    public final java.lang.Object deleteDownload(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object deleteById = this.dao.deleteById(str, continuation);
        return deleteById == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? deleteById : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object retryDownload(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        tool.wu.heng.repository.VideoParserRepository$retryDownload$1 videoParserRepository$retryDownload$1;
        int i;
        tool.wu.heng.repository.VideoParserRepository videoParserRepository;
        tool.wu.heng.data.db.DownloadRecord downloadRecord;
        tool.wu.heng.data.db.DownloadRecord copy;
        java.lang.String str2 = str;
        if (continuation instanceof tool.wu.heng.repository.VideoParserRepository$retryDownload$1) {
            videoParserRepository$retryDownload$1 = (tool.wu.heng.repository.VideoParserRepository$retryDownload$1) continuation;
            if ((videoParserRepository$retryDownload$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                videoParserRepository$retryDownload$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = videoParserRepository$retryDownload$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoParserRepository$retryDownload$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao = this.dao;
                    videoParserRepository$retryDownload$1.L$0 = this;
                    videoParserRepository$retryDownload$1.L$1 = str2;
                    videoParserRepository$retryDownload$1.label = 1;
                    obj = downloadRecordDao.getById(str2, videoParserRepository$retryDownload$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    videoParserRepository = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (java.lang.String) videoParserRepository$retryDownload$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        timber.log.Timber.INSTANCE.d("重试任务: %s", str2);
                        return kotlin.Unit.INSTANCE;
                    }
                    str2 = (java.lang.String) videoParserRepository$retryDownload$1.L$1;
                    videoParserRepository = (tool.wu.heng.repository.VideoParserRepository) videoParserRepository$retryDownload$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                downloadRecord = (tool.wu.heng.data.db.DownloadRecord) obj;
                if (downloadRecord != null) {
                    return kotlin.Unit.INSTANCE;
                }
                tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao2 = videoParserRepository.dao;
                copy = downloadRecord.copy((r36 & 1) != 0 ? downloadRecord.id : null, (r36 & 2) != 0 ? downloadRecord.title : null, (r36 & 4) != 0 ? downloadRecord.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord.savePath : null, (r36 & 32) != 0 ? downloadRecord.ext : null, (r36 & 64) != 0 ? downloadRecord.source : null, (r36 & 128) != 0 ? downloadRecord.status : "PENDING", (r36 & 256) != 0 ? downloadRecord.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord.completedAt : null);
                videoParserRepository$retryDownload$1.L$0 = str2;
                videoParserRepository$retryDownload$1.L$1 = null;
                videoParserRepository$retryDownload$1.label = 2;
                if (downloadRecordDao2.update(copy, videoParserRepository$retryDownload$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                timber.log.Timber.INSTANCE.d("重试任务: %s", str2);
                return kotlin.Unit.INSTANCE;
            }
        }
        videoParserRepository$retryDownload$1 = new tool.wu.heng.repository.VideoParserRepository$retryDownload$1(this, continuation);
        java.lang.Object obj2 = videoParserRepository$retryDownload$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoParserRepository$retryDownload$1.label;
        if (i != 0) {
        }
        downloadRecord = (tool.wu.heng.data.db.DownloadRecord) obj2;
        if (downloadRecord != null) {
        }
    }
}
