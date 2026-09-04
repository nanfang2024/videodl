package tool.wu.heng.service;

/* compiled from: DownloadService.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u0001:\u0004()*+B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u000eH\u0082@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0013H\u0016J\b\u0010 \u001a\u00020\u0013H\u0016J\"\u0010!\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000eH\u0002J$\u0010'\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Ltool/wu/heng/service/DownloadService;", "Landroid/app/Service;", "()V", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "Lkotlin/Lazy;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "buildNotification", "Landroid/app/Notification;", "title", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "progress", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "statusText", "createNotificationChannel", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "downloadTask", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "taskId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadTaskWithRetry", "mimeTypeFor", "ext", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "resolveSaveTarget", "Ltool/wu/heng/service/DownloadService$SaveTarget;", "fileName", "updateNotification", "Companion", "FileTarget", "MediaStoreTarget", "SaveTarget", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DownloadService extends android.app.Service {
    public static final java.lang.String CHANNEL_ID = "wuheng_download_channel";
    public static final java.lang.String EXTRA_TASK_ID = "extra_task_id";
    public static final int MAX_RETRY = 3;
    public static final int NOTIFICATION_ID = 1001;
    public static final java.lang.String SUB_DIR = "无痕";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final tool.wu.heng.service.DownloadService.Companion INSTANCE = new tool.wu.heng.service.DownloadService.Companion(null);
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineScope serviceScope = kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getIO()));

    /* renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy okHttpClient = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: tool.wu.heng.service.DownloadService$okHttpClient$2
        @Override // kotlin.jvm.functions.Function0
        public final okhttp3.OkHttpClient invoke() {
            return new okhttp3.OkHttpClient.Builder().connectTimeout(30L, java.util.concurrent.TimeUnit.SECONDS).readTimeout(60L, java.util.concurrent.TimeUnit.SECONDS).followRedirects(true).followSslRedirects(true).build();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DownloadService.kt */
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bb\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Ltool/wu/heng/service/DownloadService$SaveTarget;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "delete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "displayName", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "existingSize", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "fileSize", "openOutputStream", "Ljava/io/OutputStream;", "appendOffset", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public interface SaveTarget {
        void delete();

        java.lang.String displayName();

        long existingSize();

        long fileSize();

        java.io.OutputStream openOutputStream(long appendOffset);
    }

    @Override // android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return null;
    }

    /* compiled from: DownloadService.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Ltool/wu/heng/service/DownloadService$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "CHANNEL_ID", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "EXTRA_TASK_ID", "MAX_RETRY", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "NOTIFICATION_ID", "SUB_DIR", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "taskId", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final android.content.Intent createIntent(android.content.Context context, java.lang.String taskId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) tool.wu.heng.service.DownloadService.class);
            intent.putExtra(tool.wu.heng.service.DownloadService.EXTRA_TASK_ID, taskId);
            return intent;
        }
    }

    private final okhttp3.OkHttpClient getOkHttpClient() {
        return (okhttp3.OkHttpClient) this.okHttpClient.getValue();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
    }

    @Override // android.app.Service
    public int onStartCommand(android.content.Intent intent, int flags, int startId) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra(EXTRA_TASK_ID) : null;
        if (stringExtra != null) {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                startForeground(1001, buildNotification("准备下载", 0, null), 1);
            } else {
                startForeground(1001, buildNotification("准备下载", 0, null));
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new tool.wu.heng.service.DownloadService$onStartCommand$1(this, stringExtra, null), 3, null);
            return 2;
        }
        stopSelf();
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        kotlinx.coroutines.CoroutineScopeKt.cancel$default(this.serviceScope, null, 1, null);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01b9 -> B:25:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01bc -> B:26:0x00cf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object downloadTaskWithRetry(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        tool.wu.heng.service.DownloadService$downloadTaskWithRetry$1 downloadService$downloadTaskWithRetry$1;
        tool.wu.heng.service.DownloadService downloadService;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao;
        tool.wu.heng.service.DownloadService downloadService2;
        int i;
        java.lang.String str2;
        int i2;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao2;
        java.lang.String str3;
        tool.wu.heng.service.DownloadService downloadService3;
        int i3;
        tool.wu.heng.data.db.DownloadRecord downloadRecord;
        tool.wu.heng.data.db.DownloadRecord copy;
        tool.wu.heng.data.db.DownloadRecord downloadRecord2;
        tool.wu.heng.service.DownloadService downloadService4;
        tool.wu.heng.data.db.DownloadRecord downloadRecord3;
        tool.wu.heng.data.db.DownloadRecord copy2;
        tool.wu.heng.data.db.DownloadRecord downloadRecord4;
        tool.wu.heng.service.DownloadService downloadService5;
        if (continuation instanceof tool.wu.heng.service.DownloadService$downloadTaskWithRetry$1) {
            downloadService$downloadTaskWithRetry$1 = (tool.wu.heng.service.DownloadService$downloadTaskWithRetry$1) continuation;
            if ((downloadService$downloadTaskWithRetry$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                downloadService$downloadTaskWithRetry$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                downloadService = this;
                java.lang.Object obj = downloadService$downloadTaskWithRetry$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (downloadService$downloadTaskWithRetry$1.label) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        tool.wu.heng.data.db.AppDatabase.Companion companion = tool.wu.heng.data.db.AppDatabase.INSTANCE;
                        android.content.Context applicationContext = getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        downloadRecordDao = companion.getInstance(applicationContext).downloadRecordDao();
                        downloadService2 = downloadService;
                        i = 0;
                        str2 = str;
                        if (i >= 3) {
                            downloadService$downloadTaskWithRetry$1.L$0 = downloadService2;
                            downloadService$downloadTaskWithRetry$1.L$1 = str2;
                            downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao;
                            downloadService$downloadTaskWithRetry$1.I$0 = i;
                            downloadService$downloadTaskWithRetry$1.label = 1;
                            java.lang.Object byId = downloadRecordDao.getById(str2, downloadService$downloadTaskWithRetry$1);
                            if (byId == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            tool.wu.heng.service.DownloadService downloadService6 = downloadService2;
                            str3 = str2;
                            obj = byId;
                            downloadService3 = downloadService6;
                            int i4 = i;
                            downloadRecordDao2 = downloadRecordDao;
                            i2 = i4;
                            downloadRecord2 = (tool.wu.heng.data.db.DownloadRecord) obj;
                            if (downloadRecord2 == null) {
                                return kotlin.Unit.INSTANCE;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord2.getStatus(), "PAUSED") || kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord2.getStatus(), "CANCELLED") || kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord2.getStatus(), "COMPLETED")) {
                                timber.log.Timber.INSTANCE.d("任务 %s 状态为 %s，跳过执行", str3, downloadRecord2.getStatus());
                                return kotlin.Unit.INSTANCE;
                            }
                            downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                            downloadService$downloadTaskWithRetry$1.L$1 = str3;
                            downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                            downloadService$downloadTaskWithRetry$1.I$0 = i2;
                            downloadService$downloadTaskWithRetry$1.label = 2;
                            obj = downloadService3.downloadTask(str3, downloadService$downloadTaskWithRetry$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                return kotlin.Unit.INSTANCE;
                            }
                            int i5 = i2 + 1;
                            if (i5 < 3) {
                                timber.log.Timber.INSTANCE.w("任务 %s 第 %d 次重试", str3, kotlin.coroutines.jvm.internal.Boxing.boxInt(i2 + 2));
                                downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                                downloadService$downloadTaskWithRetry$1.L$1 = str3;
                                downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                                downloadService$downloadTaskWithRetry$1.I$0 = i5;
                                downloadService$downloadTaskWithRetry$1.label = 3;
                                java.lang.Object byId2 = downloadRecordDao2.getById(str3, downloadService$downloadTaskWithRetry$1);
                                if (byId2 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i3 = i5;
                                obj = byId2;
                                downloadRecord = (tool.wu.heng.data.db.DownloadRecord) obj;
                                if (downloadRecord != null && kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord.getStatus(), "DOWNLOADING")) {
                                    copy = downloadRecord.copy((r36 & 1) != 0 ? downloadRecord.id : null, (r36 & 2) != 0 ? downloadRecord.title : null, (r36 & 4) != 0 ? downloadRecord.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord.savePath : null, (r36 & 32) != 0 ? downloadRecord.ext : null, (r36 & 64) != 0 ? downloadRecord.source : null, (r36 & 128) != 0 ? downloadRecord.status : "PENDING", (r36 & 256) != 0 ? downloadRecord.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord.completedAt : null);
                                    downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                                    downloadService$downloadTaskWithRetry$1.L$1 = str3;
                                    downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                                    downloadService$downloadTaskWithRetry$1.I$0 = i3;
                                    downloadService$downloadTaskWithRetry$1.label = 4;
                                    if (downloadRecordDao2.update(copy, downloadService$downloadTaskWithRetry$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                                downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                                downloadService$downloadTaskWithRetry$1.L$1 = str3;
                                downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                                downloadService$downloadTaskWithRetry$1.I$0 = i3;
                                downloadService$downloadTaskWithRetry$1.label = 5;
                                if (kotlinx.coroutines.DelayKt.delay(i3 * 2000, downloadService$downloadTaskWithRetry$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str2 = str3;
                                downloadService2 = downloadService3;
                                tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao3 = downloadRecordDao2;
                                i = i3;
                                downloadRecordDao = downloadRecordDao3;
                                if (i >= 3) {
                                    downloadService$downloadTaskWithRetry$1.L$0 = downloadService2;
                                    downloadService$downloadTaskWithRetry$1.L$1 = downloadRecordDao;
                                    downloadService$downloadTaskWithRetry$1.L$2 = null;
                                    downloadService$downloadTaskWithRetry$1.label = 6;
                                    obj = downloadRecordDao.getById(str2, downloadService$downloadTaskWithRetry$1);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    downloadService4 = downloadService2;
                                    downloadRecord3 = (tool.wu.heng.data.db.DownloadRecord) obj;
                                    if (downloadRecord3 != null && !kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord3.getStatus(), "COMPLETED")) {
                                        copy2 = downloadRecord3.copy((r36 & 1) != 0 ? downloadRecord3.id : null, (r36 & 2) != 0 ? downloadRecord3.title : null, (r36 & 4) != 0 ? downloadRecord3.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord3.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord3.savePath : null, (r36 & 32) != 0 ? downloadRecord3.ext : null, (r36 & 64) != 0 ? downloadRecord3.source : null, (r36 & 128) != 0 ? downloadRecord3.status : "FAILED", (r36 & 256) != 0 ? downloadRecord3.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord3.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord3.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord3.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord3.errorMessage : "重试 3 次后仍失败", (r36 & 8192) != 0 ? downloadRecord3.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord3.completedAt : null);
                                        downloadService$downloadTaskWithRetry$1.L$0 = downloadService4;
                                        downloadService$downloadTaskWithRetry$1.L$1 = downloadRecord3;
                                        downloadService$downloadTaskWithRetry$1.label = 7;
                                        if (downloadRecordDao.update(copy2, downloadService$downloadTaskWithRetry$1) != coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        downloadRecord4 = downloadRecord3;
                                        downloadService5 = downloadService4;
                                        downloadService5.updateNotification(downloadRecord4.getTitle(), 0, "下载失败（已重试 3 次）");
                                    }
                                    return kotlin.Unit.INSTANCE;
                                }
                            } else {
                                downloadRecordDao = downloadRecordDao2;
                                i = i5;
                                str2 = str3;
                                downloadService2 = downloadService3;
                                if (i >= 3) {
                                }
                            }
                        }
                        break;
                    case 1:
                        i2 = downloadService$downloadTaskWithRetry$1.I$0;
                        downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTaskWithRetry$1.L$2;
                        str3 = (java.lang.String) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadRecord2 = (tool.wu.heng.data.db.DownloadRecord) obj;
                        if (downloadRecord2 == null) {
                        }
                        break;
                    case 2:
                        i2 = downloadService$downloadTaskWithRetry$1.I$0;
                        downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTaskWithRetry$1.L$2;
                        str3 = (java.lang.String) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                        }
                        break;
                    case 3:
                        i3 = downloadService$downloadTaskWithRetry$1.I$0;
                        downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTaskWithRetry$1.L$2;
                        str3 = (java.lang.String) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadRecord = (tool.wu.heng.data.db.DownloadRecord) obj;
                        if (downloadRecord != null) {
                            copy = downloadRecord.copy((r36 & 1) != 0 ? downloadRecord.id : null, (r36 & 2) != 0 ? downloadRecord.title : null, (r36 & 4) != 0 ? downloadRecord.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord.savePath : null, (r36 & 32) != 0 ? downloadRecord.ext : null, (r36 & 64) != 0 ? downloadRecord.source : null, (r36 & 128) != 0 ? downloadRecord.status : "PENDING", (r36 & 256) != 0 ? downloadRecord.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord.completedAt : null);
                            downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                            downloadService$downloadTaskWithRetry$1.L$1 = str3;
                            downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                            downloadService$downloadTaskWithRetry$1.I$0 = i3;
                            downloadService$downloadTaskWithRetry$1.label = 4;
                            if (downloadRecordDao2.update(copy, downloadService$downloadTaskWithRetry$1) == coroutine_suspended) {
                            }
                            break;
                        }
                        downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                        downloadService$downloadTaskWithRetry$1.L$1 = str3;
                        downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                        downloadService$downloadTaskWithRetry$1.I$0 = i3;
                        downloadService$downloadTaskWithRetry$1.label = 5;
                        if (kotlinx.coroutines.DelayKt.delay(i3 * 2000, downloadService$downloadTaskWithRetry$1) == coroutine_suspended) {
                        }
                        str2 = str3;
                        downloadService2 = downloadService3;
                        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao32 = downloadRecordDao2;
                        i = i3;
                        downloadRecordDao = downloadRecordDao32;
                        if (i >= 3) {
                        }
                        break;
                    case 4:
                        i3 = downloadService$downloadTaskWithRetry$1.I$0;
                        downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTaskWithRetry$1.L$2;
                        str3 = (java.lang.String) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadService$downloadTaskWithRetry$1.L$0 = downloadService3;
                        downloadService$downloadTaskWithRetry$1.L$1 = str3;
                        downloadService$downloadTaskWithRetry$1.L$2 = downloadRecordDao2;
                        downloadService$downloadTaskWithRetry$1.I$0 = i3;
                        downloadService$downloadTaskWithRetry$1.label = 5;
                        if (kotlinx.coroutines.DelayKt.delay(i3 * 2000, downloadService$downloadTaskWithRetry$1) == coroutine_suspended) {
                        }
                        str2 = str3;
                        downloadService2 = downloadService3;
                        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao322 = downloadRecordDao2;
                        i = i3;
                        downloadRecordDao = downloadRecordDao322;
                        if (i >= 3) {
                        }
                        break;
                    case 5:
                        i3 = downloadService$downloadTaskWithRetry$1.I$0;
                        downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTaskWithRetry$1.L$2;
                        str3 = (java.lang.String) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str2 = str3;
                        downloadService2 = downloadService3;
                        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao3222 = downloadRecordDao2;
                        i = i3;
                        downloadRecordDao = downloadRecordDao3222;
                        if (i >= 3) {
                        }
                        break;
                    case 6:
                        downloadRecordDao = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService4 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadRecord3 = (tool.wu.heng.data.db.DownloadRecord) obj;
                        if (downloadRecord3 != null) {
                            copy2 = downloadRecord3.copy((r36 & 1) != 0 ? downloadRecord3.id : null, (r36 & 2) != 0 ? downloadRecord3.title : null, (r36 & 4) != 0 ? downloadRecord3.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord3.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord3.savePath : null, (r36 & 32) != 0 ? downloadRecord3.ext : null, (r36 & 64) != 0 ? downloadRecord3.source : null, (r36 & 128) != 0 ? downloadRecord3.status : "FAILED", (r36 & 256) != 0 ? downloadRecord3.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord3.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord3.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord3.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord3.errorMessage : "重试 3 次后仍失败", (r36 & 8192) != 0 ? downloadRecord3.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord3.completedAt : null);
                            downloadService$downloadTaskWithRetry$1.L$0 = downloadService4;
                            downloadService$downloadTaskWithRetry$1.L$1 = downloadRecord3;
                            downloadService$downloadTaskWithRetry$1.label = 7;
                            if (downloadRecordDao.update(copy2, downloadService$downloadTaskWithRetry$1) != coroutine_suspended) {
                            }
                            break;
                        }
                        return kotlin.Unit.INSTANCE;
                    case 7:
                        downloadRecord4 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTaskWithRetry$1.L$1;
                        downloadService5 = (tool.wu.heng.service.DownloadService) downloadService$downloadTaskWithRetry$1.L$0;
                        kotlin.ResultKt.throwOnFailure(obj);
                        downloadService5.updateNotification(downloadRecord4.getTitle(), 0, "下载失败（已重试 3 次）");
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        downloadService = this;
        downloadService$downloadTaskWithRetry$1 = new tool.wu.heng.service.DownloadService$downloadTaskWithRetry$1(downloadService, continuation);
        java.lang.Object obj2 = downloadService$downloadTaskWithRetry$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (downloadService$downloadTaskWithRetry$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(3:(2:3|(4:5|6|7|8))|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x06b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x06b6, code lost:
    
        r21 = r1;
        r22 = r5;
        r24 = r9;
        r25 = r10;
        r26 = r14;
        r27 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x04ca, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x04cb, code lost:
    
        r5 = r9;
        r6 = r10;
        r58 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x020e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0029. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x04cc: MOVE (r6 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:422:0x04cb */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x06bc: MOVE (r25 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:419:0x06b6 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x04cd: MOVE (r58 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:422:0x04cb */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x06be: MOVE (r26 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:419:0x06b6 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x06c0: MOVE (r27 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]), block:B:419:0x06b6 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x04cb: MOVE (r5 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:422:0x04cb */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x06ba: MOVE (r24 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:419:0x06b6 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0ad8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0ad9  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05f9 A[Catch: all -> 0x0a2a, TRY_LEAVE, TryCatch #5 {all -> 0x0a2a, blocks: (B:68:0x05e8, B:137:0x05f9), top: B:67:0x05e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0ae3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0393 A[Catch: Exception -> 0x0a9c, LOOP:0: B:336:0x038d->B:338:0x0393, LOOP_END, TryCatch #13 {Exception -> 0x0a9c, blocks: (B:31:0x09fa, B:96:0x0a98, B:97:0x0a9b, B:262:0x06b1, B:233:0x0755, B:335:0x032f, B:336:0x038d, B:338:0x0393, B:340:0x03a9, B:342:0x03b3, B:343:0x03e5, B:92:0x0a95), top: B:334:0x032f, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03b3 A[Catch: Exception -> 0x0a9c, TryCatch #13 {Exception -> 0x0a9c, blocks: (B:31:0x09fa, B:96:0x0a98, B:97:0x0a9b, B:262:0x06b1, B:233:0x0755, B:335:0x032f, B:336:0x038d, B:338:0x0393, B:340:0x03a9, B:342:0x03b3, B:343:0x03e5, B:92:0x0a95), top: B:334:0x032f, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x047f A[Catch: all -> 0x04d7, TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x04d7, blocks: (B:352:0x047f, B:361:0x04f1), top: B:350:0x047d }] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x04db A[Catch: all -> 0x0a8e, TRY_ENTER, TryCatch #32 {all -> 0x0a8e, blocks: (B:349:0x0479, B:356:0x04db, B:358:0x04e5, B:359:0x04eb, B:365:0x0545, B:379:0x04e7), top: B:348:0x0479 }] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0400 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0982 A[Catch: all -> 0x027a, TryCatch #18 {all -> 0x027a, blocks: (B:28:0x09d5, B:29:0x09f4, B:36:0x096c, B:38:0x0972, B:40:0x097e, B:42:0x0982, B:44:0x0989, B:45:0x098e, B:119:0x0a8a, B:120:0x0a8d, B:261:0x06ae, B:232:0x0752, B:302:0x0230, B:309:0x0252, B:317:0x0275, B:115:0x0a87), top: B:7:0x0029, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0989 A[Catch: all -> 0x027a, TryCatch #18 {all -> 0x027a, blocks: (B:28:0x09d5, B:29:0x09f4, B:36:0x096c, B:38:0x0972, B:40:0x097e, B:42:0x0982, B:44:0x0989, B:45:0x098e, B:119:0x0a8a, B:120:0x0a8d, B:261:0x06ae, B:232:0x0752, B:302:0x0230, B:309:0x0252, B:317:0x0275, B:115:0x0a87), top: B:7:0x0029, inners: #30 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x09d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0964 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0965  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v32 */
    /* JADX WARN: Type inference failed for: r21v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r58v0, types: [kotlin.coroutines.Continuation, kotlin.coroutines.Continuation<? super java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r58v22 */
    /* JADX WARN: Type inference failed for: r58v25 */
    /* JADX WARN: Type inference failed for: r58v27 */
    /* JADX WARN: Type inference failed for: r58v28 */
    /* JADX WARN: Type inference failed for: r58v3 */
    /* JADX WARN: Type inference failed for: r58v31 */
    /* JADX WARN: Type inference failed for: r58v34 */
    /* JADX WARN: Type inference failed for: r58v35 */
    /* JADX WARN: Type inference failed for: r58v46 */
    /* JADX WARN: Type inference failed for: r58v47 */
    /* JADX WARN: Type inference failed for: r58v48 */
    /* JADX WARN: Type inference failed for: r58v5 */
    /* JADX WARN: Type inference failed for: r58v53 */
    /* JADX WARN: Type inference failed for: r58v54 */
    /* JADX WARN: Type inference failed for: r58v55 */
    /* JADX WARN: Type inference failed for: r58v6 */
    /* JADX WARN: Type inference failed for: r58v61 */
    /* JADX WARN: Type inference failed for: r58v7 */
    /* JADX WARN: Type inference failed for: r58v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v107 */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v46, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v86 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:187:0x0852 -> B:52:0x0870). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x08bb -> B:58:0x059a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object downloadTask(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$1;
        ?? r5;
        java.lang.Throwable th;
        java.lang.String str2;
        tool.wu.heng.data.db.DownloadRecord downloadRecord;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao;
        java.lang.String str3;
        java.io.Closeable closeable;
        tool.wu.heng.data.db.DownloadRecord downloadRecord2;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao2;
        java.lang.String str4;
        tool.wu.heng.service.DownloadService downloadService;
        okhttp3.Response response;
        java.lang.Throwable th2;
        tool.wu.heng.service.DownloadService downloadService2;
        java.lang.String str5;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao3;
        tool.wu.heng.data.db.DownloadRecord downloadRecord3;
        java.io.Closeable closeable2;
        java.lang.Throwable th3;
        java.lang.String str6;
        ?? r1;
        tool.wu.heng.service.DownloadService downloadService3;
        java.lang.String str7;
        java.lang.Exception exc;
        tool.wu.heng.data.db.DownloadRecord downloadRecord4;
        java.io.Closeable closeable3;
        java.lang.String str8;
        tool.wu.heng.service.DownloadService downloadService4;
        tool.wu.heng.data.db.DownloadRecord downloadRecord5;
        tool.wu.heng.data.db.DownloadRecord copy;
        java.lang.String str9;
        boolean z;
        java.lang.String str10;
        java.lang.Object obj;
        tool.wu.heng.data.db.DownloadRecord downloadRecord6;
        tool.wu.heng.data.db.DownloadRecord copy2;
        long existingSize;
        okhttp3.Response execute;
        okhttp3.Response response2;
        tool.wu.heng.data.db.DownloadRecord copy3;
        java.lang.String str11;
        okhttp3.ResponseBody body;
        java.io.OutputStream outputStream;
        java.io.Closeable closeable4;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget;
        kotlin.jvm.internal.Ref.LongRef longRef;
        java.io.Closeable closeable5;
        byte[] bArr;
        tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$12;
        java.lang.Object obj2;
        java.io.Closeable closeable6;
        long j;
        java.io.InputStream inputStream;
        long j2;
        java.lang.String str12;
        tool.wu.heng.service.DownloadService downloadService5;
        tool.wu.heng.data.db.DownloadRecord downloadRecord7;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao4;
        kotlin.jvm.internal.Ref.LongRef longRef2;
        long j3;
        tool.wu.heng.data.db.DownloadRecord copy4;
        java.io.Closeable closeable7;
        tool.wu.heng.service.DownloadService downloadService6;
        tool.wu.heng.data.db.DownloadRecord copy5;
        java.io.Closeable closeable8;
        kotlin.jvm.internal.Ref.LongRef longRef3;
        long j4;
        kotlin.jvm.internal.Ref.LongRef longRef4;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget2;
        java.io.Closeable closeable9;
        java.io.Closeable closeable10;
        tool.wu.heng.data.db.DownloadRecord downloadRecord8;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao5;
        long j5;
        java.lang.String str13;
        java.io.InputStream inputStream2;
        long j6;
        java.lang.Object obj3;
        java.io.Closeable closeable11;
        java.io.Closeable closeable12;
        tool.wu.heng.data.db.DownloadRecord downloadRecord9;
        java.io.Closeable closeable13;
        java.io.Closeable closeable14;
        boolean z2;
        tool.wu.heng.data.db.DownloadRecord downloadRecord10;
        java.lang.Object obj4;
        java.io.Closeable closeable15;
        java.io.Closeable closeable16;
        java.io.Closeable closeable17;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao6;
        tool.wu.heng.data.db.DownloadRecord downloadRecord11;
        float f;
        tool.wu.heng.data.db.DownloadRecord copy6;
        tool.wu.heng.data.db.DownloadRecord copy7;
        tool.wu.heng.data.db.DownloadRecord downloadRecord12;
        java.io.Closeable closeable18;
        tool.wu.heng.data.db.DownloadRecord downloadRecord13;
        java.io.Closeable closeable19;
        java.lang.Object obj5;
        java.io.Closeable closeable20;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao7;
        java.io.Closeable closeable21;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget3;
        java.io.Closeable closeable22;
        byte[] bArr2;
        kotlin.jvm.internal.Ref.LongRef longRef5;
        long j7;
        long j8;
        tool.wu.heng.data.db.DownloadRecord copy8;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget4;
        long j9;
        float f2;
        long j10;
        java.io.Closeable closeable23;
        kotlin.jvm.internal.Ref.LongRef longRef6;
        byte[] bArr3;
        long j11;
        java.io.OutputStream outputStream2;
        long j12;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget5;
        java.io.Closeable closeable24;
        tool.wu.heng.data.db.DownloadRecord downloadRecord14;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao8;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget6;
        java.io.Closeable closeable25;
        tool.wu.heng.data.db.DownloadRecord downloadRecord15;
        java.lang.String str14;
        java.io.Closeable closeable26;
        tool.wu.heng.service.DownloadService.SaveTarget saveTarget7;
        long j13;
        long j14;
        java.lang.Object byId;
        java.lang.Object obj6;
        java.lang.String str15;
        tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$13;
        tool.wu.heng.data.db.DownloadRecord downloadRecord16;
        tool.wu.heng.service.DownloadService.MediaStoreTarget mediaStoreTarget;
        tool.wu.heng.data.db.DownloadRecord copy9;
        tool.wu.heng.service.DownloadService downloadService7 = this;
        try {
            try {
                try {
                    try {
                        if (continuation instanceof tool.wu.heng.service.DownloadService$downloadTask$1) {
                            downloadService$downloadTask$1 = (tool.wu.heng.service.DownloadService$downloadTask$1) continuation;
                            if ((downloadService$downloadTask$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                                downloadService$downloadTask$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                                java.lang.Object obj7 = downloadService$downloadTask$1.result;
                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                r5 = downloadService$downloadTask$1.label;
                                switch (r5) {
                                    case 0:
                                        str3 = "下载失败";
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        tool.wu.heng.data.db.AppDatabase.Companion companion = tool.wu.heng.data.db.AppDatabase.INSTANCE;
                                        android.content.Context applicationContext = getApplicationContext();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                                        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao9 = companion.getInstance(applicationContext).downloadRecordDao();
                                        downloadService$downloadTask$1.L$0 = downloadService7;
                                        downloadService$downloadTask$1.L$1 = str;
                                        downloadService$downloadTask$1.L$2 = downloadRecordDao9;
                                        z = true;
                                        downloadService$downloadTask$1.label = 1;
                                        java.lang.Object byId2 = downloadRecordDao9.getById(str, downloadService$downloadTask$1);
                                        if (byId2 == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        downloadService3 = downloadService7;
                                        str10 = str;
                                        obj = byId2;
                                        downloadRecordDao = downloadRecordDao9;
                                        downloadRecord6 = (tool.wu.heng.data.db.DownloadRecord) obj;
                                        if (downloadRecord6 != null) {
                                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                                        }
                                        try {
                                            copy2 = downloadRecord6.copy((r36 & 1) != 0 ? downloadRecord6.id : null, (r36 & 2) != 0 ? downloadRecord6.title : null, (r36 & 4) != 0 ? downloadRecord6.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord6.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord6.savePath : null, (r36 & 32) != 0 ? downloadRecord6.ext : null, (r36 & 64) != 0 ? downloadRecord6.source : null, (r36 & 128) != 0 ? downloadRecord6.status : "DOWNLOADING", (r36 & 256) != 0 ? downloadRecord6.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord6.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord6.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord6.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord6.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord6.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord6.completedAt : null);
                                            downloadService$downloadTask$1.L$0 = downloadService3;
                                            downloadService$downloadTask$1.L$1 = str10;
                                            downloadService$downloadTask$1.L$2 = downloadRecordDao;
                                            downloadService$downloadTask$1.L$3 = downloadRecord6;
                                            downloadService$downloadTask$1.label = 2;
                                            if (downloadRecordDao.update(copy2, downloadService$downloadTask$1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            str5 = str10;
                                            downloadRecordDao3 = downloadRecordDao;
                                            downloadRecord3 = downloadRecord6;
                                            str2 = str3;
                                            downloadService2 = downloadService3;
                                            try {
                                                downloadService2.updateNotification(downloadRecord3.getTitle(), 0, null);
                                                tool.wu.heng.service.DownloadService.SaveTarget resolveSaveTarget = downloadService2.resolveSaveTarget(new kotlin.text.Regex("[\\\\/:*?\"<>|]").replace(downloadRecord3.getTitle(), "_") + "." + downloadRecord3.getExt(), downloadRecord3.getExt());
                                                okhttp3.Request.Builder url = new okhttp3.Request.Builder().url(downloadRecord3.getDownloadUrl());
                                                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : tool.wu.heng.parser.VideoParserEngine.INSTANCE.downloadHeaders(downloadRecord3.getSource()).entrySet()) {
                                                    url.header(entry.getKey(), entry.getValue());
                                                }
                                                existingSize = resolveSaveTarget.existingSize();
                                                if (existingSize > 0) {
                                                    url.header("Range", "bytes=" + existingSize + "-");
                                                    timber.log.Timber.INSTANCE.i("任务 %s 断点续传，从 %d 字节开始", str5, kotlin.coroutines.jvm.internal.Boxing.boxLong(existingSize));
                                                }
                                                execute = downloadService2.getOkHttpClient().newCall(url.build()).execute();
                                                try {
                                                    response2 = execute;
                                                    if (!response2.isSuccessful()) {
                                                        try {
                                                            if (response2.code() != 206) {
                                                                copy3 = r20.copy((r36 & 1) != 0 ? r20.id : null, (r36 & 2) != 0 ? r20.title : null, (r36 & 4) != 0 ? r20.thumbnailUrl : null, (r36 & 8) != 0 ? r20.downloadUrl : null, (r36 & 16) != 0 ? r20.savePath : null, (r36 & 32) != 0 ? r20.ext : null, (r36 & 64) != 0 ? r20.source : null, (r36 & 128) != 0 ? r20.status : "FAILED", (r36 & 256) != 0 ? r20.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? r20.downloadedBytes : 0L, (r36 & 1024) != 0 ? r20.totalBytes : 0L, (r36 & 2048) != 0 ? r20.speedBps : 0L, (r36 & 4096) != 0 ? r20.errorMessage : "HTTP " + response2.code(), (r36 & 8192) != 0 ? r20.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord3.completedAt : null);
                                                                downloadService$downloadTask$1.L$0 = downloadService2;
                                                                downloadService$downloadTask$1.L$1 = str5;
                                                                downloadService$downloadTask$1.L$2 = downloadRecordDao3;
                                                                downloadService$downloadTask$1.L$3 = downloadRecord3;
                                                                downloadService$downloadTask$1.L$4 = execute;
                                                                downloadService$downloadTask$1.label = 3;
                                                                if (downloadRecordDao3.update(copy3, downloadService$downloadTask$1) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                                r5 = execute;
                                                                continuation = str2;
                                                                try {
                                                                    downloadService2.updateNotification(downloadRecord3.getTitle(), 0, continuation);
                                                                    java.lang.Boolean boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                                                    kotlin.io.CloseableKt.closeFinally(r5, null);
                                                                    return boxBoolean;
                                                                } catch (java.lang.Throwable th4) {
                                                                    th = th4;
                                                                    th = th;
                                                                    closeable3 = r5;
                                                                    str2 = continuation;
                                                                    try {
                                                                        throw th;
                                                                    } catch (java.lang.Throwable th5) {
                                                                        kotlin.io.CloseableKt.closeFinally(closeable3, th);
                                                                        throw th5;
                                                                    }
                                                                }
                                                            }
                                                        } catch (java.lang.Throwable th6) {
                                                            th = th6;
                                                            th = th;
                                                            closeable3 = execute;
                                                            str2 = str2;
                                                            throw th;
                                                        }
                                                    }
                                                    str11 = str2;
                                                    try {
                                                        body = response2.body();
                                                    } catch (java.lang.Throwable th7) {
                                                        th = th7;
                                                        str2 = str11;
                                                        th = th;
                                                        closeable3 = execute;
                                                        str2 = str2;
                                                        throw th;
                                                    }
                                                } catch (java.lang.Throwable th8) {
                                                    th = th8;
                                                }
                                                try {
                                                    if (body != null) {
                                                        tool.wu.heng.service.DownloadService downloadService8 = downloadService2;
                                                        copy5 = r20.copy((r36 & 1) != 0 ? r20.id : null, (r36 & 2) != 0 ? r20.title : null, (r36 & 4) != 0 ? r20.thumbnailUrl : null, (r36 & 8) != 0 ? r20.downloadUrl : null, (r36 & 16) != 0 ? r20.savePath : null, (r36 & 32) != 0 ? r20.ext : null, (r36 & 64) != 0 ? r20.source : null, (r36 & 128) != 0 ? r20.status : "FAILED", (r36 & 256) != 0 ? r20.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? r20.downloadedBytes : 0L, (r36 & 1024) != 0 ? r20.totalBytes : 0L, (r36 & 2048) != 0 ? r20.speedBps : 0L, (r36 & 4096) != 0 ? r20.errorMessage : "响应体为空", (r36 & 8192) != 0 ? r20.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord3.completedAt : null);
                                                        downloadService$downloadTask$1.L$0 = downloadService2;
                                                        downloadService$downloadTask$1.L$1 = str5;
                                                        downloadService$downloadTask$1.L$2 = downloadRecordDao3;
                                                        downloadService$downloadTask$1.L$3 = downloadRecord3;
                                                        downloadService$downloadTask$1.L$4 = execute;
                                                        downloadService$downloadTask$1.label = 4;
                                                        if (downloadRecordDao3.update(copy5, downloadService$downloadTask$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        closeable8 = execute;
                                                        java.lang.Boolean boxBoolean2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                                        kotlin.io.CloseableKt.closeFinally(closeable8, null);
                                                        return boxBoolean2;
                                                    }
                                                    long contentLength = body.getContentLength();
                                                    long totalBytes = contentLength > 0 ? contentLength + existingSize : downloadRecord3.getTotalBytes();
                                                    java.io.OutputStream openOutputStream = resolveSaveTarget.openOutputStream(existingSize);
                                                    if (openOutputStream == null) {
                                                        tool.wu.heng.service.DownloadService downloadService9 = downloadService2;
                                                        copy4 = r20.copy((r36 & 1) != 0 ? r20.id : null, (r36 & 2) != 0 ? r20.title : null, (r36 & 4) != 0 ? r20.thumbnailUrl : null, (r36 & 8) != 0 ? r20.downloadUrl : null, (r36 & 16) != 0 ? r20.savePath : null, (r36 & 32) != 0 ? r20.ext : null, (r36 & 64) != 0 ? r20.source : null, (r36 & 128) != 0 ? r20.status : "FAILED", (r36 & 256) != 0 ? r20.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? r20.downloadedBytes : 0L, (r36 & 1024) != 0 ? r20.totalBytes : 0L, (r36 & 2048) != 0 ? r20.speedBps : 0L, (r36 & 4096) != 0 ? r20.errorMessage : "无法创建目标文件，可能是目录权限问题", (r36 & 8192) != 0 ? r20.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord3.completedAt : null);
                                                        downloadService$downloadTask$1.L$0 = downloadService2;
                                                        downloadService$downloadTask$1.L$1 = str5;
                                                        downloadService$downloadTask$1.L$2 = downloadRecordDao3;
                                                        downloadService$downloadTask$1.L$3 = downloadRecord3;
                                                        downloadService$downloadTask$1.L$4 = execute;
                                                        downloadService$downloadTask$1.L$5 = downloadService2;
                                                        downloadService$downloadTask$1.label = 5;
                                                        if (downloadRecordDao3.update(copy4, downloadService$downloadTask$1) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                        closeable7 = execute;
                                                        downloadService6 = downloadService2;
                                                        downloadService6.updateNotification(downloadRecord3.getTitle(), 0, str11);
                                                        java.lang.Boolean boxBoolean3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                                        kotlin.io.CloseableKt.closeFinally(closeable7, null);
                                                        return boxBoolean3;
                                                    }
                                                    java.io.OutputStream outputStream3 = openOutputStream;
                                                    try {
                                                        outputStream = outputStream3;
                                                        kotlin.jvm.internal.Ref.LongRef longRef7 = new kotlin.jvm.internal.Ref.LongRef();
                                                        longRef7.element = existingSize;
                                                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                                                        kotlin.jvm.internal.Ref.LongRef longRef8 = new kotlin.jvm.internal.Ref.LongRef();
                                                        java.io.InputStream byteStream = body.byteStream();
                                                        try {
                                                            closeable4 = outputStream3;
                                                            saveTarget = resolveSaveTarget;
                                                            longRef = longRef7;
                                                            continuation = str11;
                                                            closeable5 = execute;
                                                            tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$14 = downloadService$downloadTask$1;
                                                            bArr = new byte[8192];
                                                            downloadService$downloadTask$12 = downloadService$downloadTask$14;
                                                            obj2 = coroutine_suspended;
                                                            tool.wu.heng.data.db.DownloadRecord downloadRecord17 = downloadRecord3;
                                                            closeable6 = byteStream;
                                                            j = existingSize;
                                                            inputStream = byteStream;
                                                            j2 = totalBytes;
                                                            str12 = str5;
                                                            downloadService5 = downloadService2;
                                                            downloadRecord7 = downloadRecord17;
                                                            downloadRecordDao4 = downloadRecordDao3;
                                                            longRef2 = longRef8;
                                                            j3 = currentTimeMillis;
                                                            try {
                                                                try {
                                                                    downloadService$downloadTask$12.L$0 = downloadService5;
                                                                    downloadService$downloadTask$12.L$1 = str12;
                                                                    downloadService$downloadTask$12.L$2 = downloadRecordDao4;
                                                                    downloadService$downloadTask$12.L$3 = downloadRecord7;
                                                                    downloadService$downloadTask$12.L$4 = saveTarget;
                                                                    downloadService$downloadTask$12.L$5 = closeable5;
                                                                    downloadService$downloadTask$12.L$6 = closeable4;
                                                                    downloadService$downloadTask$12.L$7 = outputStream;
                                                                    downloadService$downloadTask$12.L$8 = longRef;
                                                                    downloadService$downloadTask$12.L$9 = longRef2;
                                                                    downloadService$downloadTask$12.L$10 = closeable6;
                                                                    downloadService$downloadTask$12.L$11 = inputStream;
                                                                    downloadService$downloadTask$12.L$12 = bArr;
                                                                    downloadService$downloadTask$12.J$0 = j;
                                                                    downloadService$downloadTask$12.J$1 = j13;
                                                                    j14 = j3;
                                                                    downloadService$downloadTask$12.J$2 = j14;
                                                                    downloadService$downloadTask$12.label = 6;
                                                                    byId = downloadRecordDao4.getById(str12, downloadService$downloadTask$12);
                                                                    obj6 = obj2;
                                                                } catch (java.lang.Throwable th9) {
                                                                    th = th9;
                                                                    downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                    closeable = closeable5;
                                                                    str4 = str12;
                                                                    downloadService = downloadService5;
                                                                    downloadRecordDao2 = downloadRecordDao4;
                                                                    outputStream3 = closeable26;
                                                                    coroutine_suspended = obj2;
                                                                    closeable2 = closeable6;
                                                                    downloadRecord2 = downloadRecord7;
                                                                    th3 = th;
                                                                    str6 = continuation;
                                                                    try {
                                                                        throw th3;
                                                                    } catch (java.lang.Throwable th10) {
                                                                        try {
                                                                            kotlin.io.CloseableKt.closeFinally(closeable2, th3);
                                                                            throw th10;
                                                                        } catch (java.lang.Throwable th11) {
                                                                            th2 = th11;
                                                                            r1 = outputStream3;
                                                                            r5 = closeable;
                                                                            downloadRecord3 = downloadRecord2;
                                                                            downloadRecordDao3 = downloadRecordDao2;
                                                                            str5 = str4;
                                                                            downloadService2 = downloadService;
                                                                            continuation = str6;
                                                                            try {
                                                                                throw th2;
                                                                            } catch (java.lang.Throwable th12) {
                                                                                kotlin.io.CloseableKt.closeFinally(r1, th2);
                                                                                throw th12;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                saveTarget7 = saveTarget;
                                                                closeable26 = closeable4;
                                                                j13 = j2;
                                                            } catch (java.lang.Throwable th13) {
                                                                th = th13;
                                                                closeable26 = closeable4;
                                                            }
                                                        } catch (java.lang.Throwable th14) {
                                                            str6 = str11;
                                                            th3 = th14;
                                                            closeable = execute;
                                                            closeable2 = byteStream;
                                                            downloadRecord2 = downloadRecord3;
                                                            downloadRecordDao2 = downloadRecordDao3;
                                                            str4 = str5;
                                                            downloadService = downloadService2;
                                                        }
                                                        if (byId != obj6) {
                                                            return obj6;
                                                        }
                                                        inputStream2 = inputStream;
                                                        longRef4 = longRef2;
                                                        downloadRecord8 = downloadRecord7;
                                                        j4 = j14;
                                                        longRef3 = longRef;
                                                        obj7 = byId;
                                                        saveTarget2 = saveTarget7;
                                                        j5 = j;
                                                        downloadRecordDao5 = downloadRecordDao4;
                                                        obj3 = obj6;
                                                        downloadService2 = downloadService5;
                                                        closeable9 = closeable26;
                                                        str13 = str12;
                                                        closeable10 = closeable5;
                                                        j6 = j13;
                                                        continuation = continuation;
                                                        try {
                                                            downloadRecord11 = (tool.wu.heng.data.db.DownloadRecord) obj7;
                                                        } catch (java.lang.Throwable th15) {
                                                            th = th15;
                                                            downloadRecord10 = downloadRecord8;
                                                        }
                                                        if (downloadRecord11 == null) {
                                                            java.io.OutputStream outputStream4 = outputStream;
                                                            if (kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord11.getStatus(), "PAUSED")) {
                                                                try {
                                                                    timber.log.Timber.Companion companion2 = timber.log.Timber.INSTANCE;
                                                                    java.lang.Object[] objArr = new java.lang.Object[2];
                                                                    objArr[0] = str13;
                                                                    java.io.Closeable closeable27 = closeable6;
                                                                    try {
                                                                        objArr[1] = kotlin.coroutines.jvm.internal.Boxing.boxLong(longRef3.element);
                                                                        companion2.d("任务 %s 用户暂停，保留 %d 字节", objArr);
                                                                        long j15 = longRef3.element;
                                                                        if (j6 > 0) {
                                                                            try {
                                                                                f = (((float) longRef3.element) / ((float) j6)) * 100;
                                                                            } catch (java.lang.Throwable th16) {
                                                                                th = th16;
                                                                                outputStream3 = closeable9;
                                                                                downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                                downloadRecord2 = downloadRecord8;
                                                                                downloadRecordDao2 = downloadRecordDao5;
                                                                                coroutine_suspended = obj3;
                                                                                closeable = closeable10;
                                                                                str4 = str13;
                                                                                downloadService = downloadService2;
                                                                                closeable2 = closeable27;
                                                                                th3 = th;
                                                                                str6 = continuation;
                                                                                throw th3;
                                                                            }
                                                                        } else {
                                                                            f = 0.0f;
                                                                        }
                                                                        copy6 = downloadRecord11.copy((r36 & 1) != 0 ? downloadRecord11.id : null, (r36 & 2) != 0 ? downloadRecord11.title : null, (r36 & 4) != 0 ? downloadRecord11.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord11.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord11.savePath : null, (r36 & 32) != 0 ? downloadRecord11.ext : null, (r36 & 64) != 0 ? downloadRecord11.source : null, (r36 & 128) != 0 ? downloadRecord11.status : null, (r36 & 256) != 0 ? downloadRecord11.progress : f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord11.downloadedBytes : j15, (r36 & 1024) != 0 ? downloadRecord11.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord11.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord11.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord11.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord11.completedAt : null);
                                                                        downloadService$downloadTask$12.L$0 = downloadService2;
                                                                        downloadService$downloadTask$12.L$1 = str13;
                                                                        downloadService$downloadTask$12.L$2 = downloadRecordDao5;
                                                                        downloadService$downloadTask$12.L$3 = downloadRecord8;
                                                                        downloadService$downloadTask$12.L$4 = closeable10;
                                                                        downloadService$downloadTask$12.L$5 = closeable9;
                                                                        closeable6 = closeable27;
                                                                        downloadService$downloadTask$12.L$6 = closeable6;
                                                                        downloadService$downloadTask$12.L$7 = null;
                                                                        downloadService$downloadTask$12.L$8 = null;
                                                                        downloadService$downloadTask$12.L$9 = null;
                                                                        downloadService$downloadTask$12.L$10 = null;
                                                                        downloadService$downloadTask$12.L$11 = null;
                                                                        downloadService$downloadTask$12.L$12 = null;
                                                                        downloadService$downloadTask$12.label = 7;
                                                                        if (downloadRecordDao5.update(copy6, downloadService$downloadTask$12) == obj3) {
                                                                            return obj3;
                                                                        }
                                                                        closeable11 = closeable6;
                                                                        downloadRecord9 = downloadRecord8;
                                                                        closeable12 = closeable10;
                                                                        downloadService2.updateNotification(downloadRecord9.getTitle(), 0, "已暂停");
                                                                        java.lang.Boolean boxBoolean4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                                                        kotlin.io.CloseableKt.closeFinally(closeable11, null);
                                                                        kotlin.io.CloseableKt.closeFinally(closeable9, null);
                                                                        kotlin.io.CloseableKt.closeFinally(closeable12, null);
                                                                        return boxBoolean4;
                                                                    } catch (java.lang.Throwable th17) {
                                                                        th = th17;
                                                                        closeable6 = closeable27;
                                                                        outputStream3 = closeable9;
                                                                        downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                        downloadRecord2 = downloadRecord8;
                                                                        downloadRecordDao2 = downloadRecordDao5;
                                                                        coroutine_suspended = obj3;
                                                                        closeable = closeable10;
                                                                        str4 = str13;
                                                                        downloadService = downloadService2;
                                                                        th3 = th;
                                                                        closeable2 = closeable6;
                                                                        str6 = continuation;
                                                                        throw th3;
                                                                    }
                                                                } catch (java.lang.Throwable th18) {
                                                                    th = th18;
                                                                }
                                                            } else {
                                                                tool.wu.heng.data.db.DownloadRecord downloadRecord18 = downloadRecord8;
                                                                try {
                                                                    if (kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord11.getStatus(), "CANCELLED")) {
                                                                        try {
                                                                            timber.log.Timber.INSTANCE.d("任务 %s 用户取消", str13);
                                                                            saveTarget2.delete();
                                                                            copy7 = downloadRecord11.copy((r36 & 1) != 0 ? downloadRecord11.id : null, (r36 & 2) != 0 ? downloadRecord11.title : null, (r36 & 4) != 0 ? downloadRecord11.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord11.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord11.savePath : null, (r36 & 32) != 0 ? downloadRecord11.ext : null, (r36 & 64) != 0 ? downloadRecord11.source : null, (r36 & 128) != 0 ? downloadRecord11.status : null, (r36 & 256) != 0 ? downloadRecord11.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord11.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord11.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord11.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord11.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord11.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord11.completedAt : null);
                                                                            downloadService$downloadTask$12.L$0 = downloadService2;
                                                                            downloadService$downloadTask$12.L$1 = str13;
                                                                            downloadService$downloadTask$12.L$2 = downloadRecordDao5;
                                                                            downloadService$downloadTask$12.L$3 = downloadRecord18;
                                                                            downloadService$downloadTask$12.L$4 = closeable10;
                                                                            downloadService$downloadTask$12.L$5 = closeable9;
                                                                            downloadService$downloadTask$12.L$6 = closeable6;
                                                                            downloadService$downloadTask$12.L$7 = null;
                                                                            downloadService$downloadTask$12.L$8 = null;
                                                                            downloadService$downloadTask$12.L$9 = null;
                                                                            downloadService$downloadTask$12.L$10 = null;
                                                                            downloadService$downloadTask$12.L$11 = null;
                                                                            downloadService$downloadTask$12.L$12 = null;
                                                                            downloadService$downloadTask$12.label = 8;
                                                                            if (downloadRecordDao5.update(copy7, downloadService$downloadTask$12) == obj3) {
                                                                                return obj3;
                                                                            }
                                                                            closeable14 = closeable10;
                                                                            z2 = true;
                                                                            closeable13 = closeable6;
                                                                            java.lang.Boolean boxBoolean5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
                                                                            kotlin.io.CloseableKt.closeFinally(closeable13, null);
                                                                            kotlin.io.CloseableKt.closeFinally(closeable9, null);
                                                                            kotlin.io.CloseableKt.closeFinally(closeable14, null);
                                                                            return boxBoolean5;
                                                                        } catch (java.lang.Throwable th19) {
                                                                            th = th19;
                                                                            outputStream3 = closeable9;
                                                                            downloadRecord2 = downloadRecord18;
                                                                            downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                        }
                                                                    } else {
                                                                        java.io.InputStream inputStream3 = inputStream2;
                                                                        int read = inputStream3.read(bArr);
                                                                        java.lang.Object obj8 = obj3;
                                                                        if (read != -1) {
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            outputStream4.write(bArr, 0, read);
                                                                                            longRef3.element += read;
                                                                                            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                                                                                            if (currentTimeMillis2 - longRef5.element <= 500) {
                                                                                                java.io.Closeable closeable28 = closeable10;
                                                                                                long j16 = j5;
                                                                                                saveTarget = saveTarget3;
                                                                                                longRef = longRef3;
                                                                                                bArr = bArr2;
                                                                                                downloadRecord7 = downloadRecord13;
                                                                                                tool.wu.heng.service.DownloadService downloadService10 = downloadService2;
                                                                                                downloadRecordDao4 = downloadRecordDao5;
                                                                                                closeable4 = closeable22;
                                                                                                str12 = str13;
                                                                                                downloadService5 = downloadService10;
                                                                                                obj2 = obj8;
                                                                                                inputStream = inputStream3;
                                                                                                closeable6 = closeable21;
                                                                                                j = j16;
                                                                                                outputStream = outputStream4;
                                                                                                long j17 = j6;
                                                                                                closeable5 = closeable28;
                                                                                                j3 = j4;
                                                                                                longRef2 = longRef5;
                                                                                                j2 = j17;
                                                                                                continuation = continuation;
                                                                                                downloadService$downloadTask$12.L$0 = downloadService5;
                                                                                                downloadService$downloadTask$12.L$1 = str12;
                                                                                                downloadService$downloadTask$12.L$2 = downloadRecordDao4;
                                                                                                downloadService$downloadTask$12.L$3 = downloadRecord7;
                                                                                                downloadService$downloadTask$12.L$4 = saveTarget;
                                                                                                downloadService$downloadTask$12.L$5 = closeable5;
                                                                                                downloadService$downloadTask$12.L$6 = closeable4;
                                                                                                downloadService$downloadTask$12.L$7 = outputStream;
                                                                                                downloadService$downloadTask$12.L$8 = longRef;
                                                                                                downloadService$downloadTask$12.L$9 = longRef2;
                                                                                                downloadService$downloadTask$12.L$10 = closeable6;
                                                                                                downloadService$downloadTask$12.L$11 = inputStream;
                                                                                                downloadService$downloadTask$12.L$12 = bArr;
                                                                                                downloadService$downloadTask$12.J$0 = j;
                                                                                                saveTarget7 = saveTarget;
                                                                                                closeable26 = closeable4;
                                                                                                j13 = j2;
                                                                                                downloadService$downloadTask$12.J$1 = j13;
                                                                                                j14 = j3;
                                                                                                downloadService$downloadTask$12.J$2 = j14;
                                                                                                downloadService$downloadTask$12.label = 6;
                                                                                                byId = downloadRecordDao4.getById(str12, downloadService$downloadTask$12);
                                                                                                obj6 = obj2;
                                                                                                if (byId != obj6) {
                                                                                                }
                                                                                            } else {
                                                                                                try {
                                                                                                    try {
                                                                                                        try {
                                                                                                            try {
                                                                                                                long j18 = j4;
                                                                                                                long j19 = (currentTimeMillis2 - j18) / 1000;
                                                                                                                if (j19 > 0) {
                                                                                                                    try {
                                                                                                                        j7 = (longRef3.element - j5) / j19;
                                                                                                                        j8 = 0;
                                                                                                                    } catch (java.lang.Throwable th20) {
                                                                                                                        th3 = th20;
                                                                                                                        downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                                                                        downloadRecordDao2 = downloadRecordDao5;
                                                                                                                        closeable = closeable10;
                                                                                                                        str4 = str13;
                                                                                                                        downloadService = downloadService2;
                                                                                                                        downloadRecord2 = downloadRecord13;
                                                                                                                        coroutine_suspended = obj8;
                                                                                                                        outputStream3 = closeable22;
                                                                                                                        closeable2 = closeable21;
                                                                                                                        str6 = continuation;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    j8 = 0;
                                                                                                                    j7 = 0;
                                                                                                                }
                                                                                                                float f3 = j6 > j8 ? (((float) longRef3.element) / ((float) j6)) * 100 : 0.0f;
                                                                                                                copy8 = downloadRecord11.copy((r36 & 1) != 0 ? downloadRecord11.id : null, (r36 & 2) != 0 ? downloadRecord11.title : null, (r36 & 4) != 0 ? downloadRecord11.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord11.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord11.savePath : null, (r36 & 32) != 0 ? downloadRecord11.ext : null, (r36 & 64) != 0 ? downloadRecord11.source : null, (r36 & 128) != 0 ? downloadRecord11.status : "DOWNLOADING", (r36 & 256) != 0 ? downloadRecord11.progress : f3, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord11.downloadedBytes : longRef3.element, (r36 & 1024) != 0 ? downloadRecord11.totalBytes : j6, (r36 & 2048) != 0 ? downloadRecord11.speedBps : j7, (r36 & 4096) != 0 ? downloadRecord11.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord11.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord11.completedAt : null);
                                                                                                                downloadService$downloadTask$12.L$0 = downloadService2;
                                                                                                                downloadService$downloadTask$12.L$1 = str13;
                                                                                                                downloadService$downloadTask$12.L$2 = downloadRecordDao7;
                                                                                                                downloadService$downloadTask$12.L$3 = downloadRecord13;
                                                                                                                downloadRecord13 = downloadRecord13;
                                                                                                                saveTarget4 = saveTarget3;
                                                                                                                downloadService$downloadTask$12.L$4 = saveTarget4;
                                                                                                                downloadService$downloadTask$12.L$5 = closeable10;
                                                                                                                downloadService$downloadTask$12.L$6 = closeable20;
                                                                                                                downloadService$downloadTask$12.L$7 = outputStream4;
                                                                                                                downloadService$downloadTask$12.L$8 = longRef3;
                                                                                                                downloadService$downloadTask$12.L$9 = longRef5;
                                                                                                                downloadService$downloadTask$12.L$10 = closeable15;
                                                                                                                downloadService$downloadTask$12.L$11 = inputStream3;
                                                                                                                downloadService$downloadTask$12.L$12 = bArr2;
                                                                                                                j9 = j5;
                                                                                                                downloadService$downloadTask$12.J$0 = j9;
                                                                                                                downloadService$downloadTask$12.J$1 = j6;
                                                                                                                downloadService$downloadTask$12.J$2 = j18;
                                                                                                                downloadService$downloadTask$12.J$3 = currentTimeMillis2;
                                                                                                                downloadService$downloadTask$12.F$0 = f3;
                                                                                                                float f4 = f3;
                                                                                                                downloadService$downloadTask$12.label = 9;
                                                                                                                if (downloadRecordDao7.update(copy8, downloadService$downloadTask$12) == obj8) {
                                                                                                                    return obj8;
                                                                                                                }
                                                                                                                f2 = f4;
                                                                                                                downloadRecordDao2 = downloadRecordDao7;
                                                                                                                j10 = currentTimeMillis2;
                                                                                                                closeable23 = closeable20;
                                                                                                                str12 = str13;
                                                                                                                closeable2 = closeable15;
                                                                                                                longRef6 = longRef3;
                                                                                                                downloadRecord7 = downloadRecord13;
                                                                                                                obj2 = obj8;
                                                                                                                bArr3 = bArr2;
                                                                                                                inputStream = inputStream3;
                                                                                                                j11 = j6;
                                                                                                                closeable5 = closeable19;
                                                                                                                outputStream2 = outputStream4;
                                                                                                                longRef2 = longRef5;
                                                                                                                j12 = j18;
                                                                                                                str15 = continuation;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        downloadService2.updateNotification(downloadRecord7.getTitle(), (int) f2, null);
                                                                                                                        longRef2.element = j10;
                                                                                                                        closeable4 = closeable23;
                                                                                                                        saveTarget = saveTarget4;
                                                                                                                        longRef = longRef6;
                                                                                                                        j = j9;
                                                                                                                        closeable6 = closeable2;
                                                                                                                        downloadService5 = downloadService2;
                                                                                                                        bArr = bArr3;
                                                                                                                        outputStream = outputStream2;
                                                                                                                        j3 = j12;
                                                                                                                        j2 = j11;
                                                                                                                        downloadRecordDao4 = downloadRecordDao2;
                                                                                                                        downloadService$downloadTask$12 = downloadService$downloadTask$13;
                                                                                                                        continuation = str15;
                                                                                                                        downloadService$downloadTask$12.L$0 = downloadService5;
                                                                                                                        downloadService$downloadTask$12.L$1 = str12;
                                                                                                                        downloadService$downloadTask$12.L$2 = downloadRecordDao4;
                                                                                                                        downloadService$downloadTask$12.L$3 = downloadRecord7;
                                                                                                                        downloadService$downloadTask$12.L$4 = saveTarget;
                                                                                                                        downloadService$downloadTask$12.L$5 = closeable5;
                                                                                                                        downloadService$downloadTask$12.L$6 = closeable4;
                                                                                                                        downloadService$downloadTask$12.L$7 = outputStream;
                                                                                                                        downloadService$downloadTask$12.L$8 = longRef;
                                                                                                                        downloadService$downloadTask$12.L$9 = longRef2;
                                                                                                                        downloadService$downloadTask$12.L$10 = closeable6;
                                                                                                                        downloadService$downloadTask$12.L$11 = inputStream;
                                                                                                                        downloadService$downloadTask$12.L$12 = bArr;
                                                                                                                        downloadService$downloadTask$12.J$0 = j;
                                                                                                                        saveTarget7 = saveTarget;
                                                                                                                        closeable26 = closeable4;
                                                                                                                        j13 = j2;
                                                                                                                        downloadService$downloadTask$12.J$1 = j13;
                                                                                                                        j14 = j3;
                                                                                                                        downloadService$downloadTask$12.J$2 = j14;
                                                                                                                        downloadService$downloadTask$12.label = 6;
                                                                                                                        byId = downloadRecordDao4.getById(str12, downloadService$downloadTask$12);
                                                                                                                        obj6 = obj2;
                                                                                                                        if (byId != obj6) {
                                                                                                                        }
                                                                                                                    } catch (java.lang.Throwable th21) {
                                                                                                                        th = th21;
                                                                                                                        outputStream3 = closeable23;
                                                                                                                        th3 = th;
                                                                                                                        closeable = closeable5;
                                                                                                                        downloadRecord2 = downloadRecord7;
                                                                                                                        downloadService = downloadService2;
                                                                                                                        coroutine_suspended = obj2;
                                                                                                                        downloadService$downloadTask$1 = downloadService$downloadTask$13;
                                                                                                                        str4 = str12;
                                                                                                                        str6 = str15;
                                                                                                                        throw th3;
                                                                                                                    }
                                                                                                                    downloadService$downloadTask$13 = downloadService$downloadTask$12;
                                                                                                                } catch (java.lang.Throwable th22) {
                                                                                                                    th = th22;
                                                                                                                    downloadService$downloadTask$13 = downloadService$downloadTask$12;
                                                                                                                }
                                                                                                            } catch (java.lang.Throwable th23) {
                                                                                                                th = th23;
                                                                                                                obj5 = obj8;
                                                                                                                downloadRecordDao2 = downloadRecordDao7;
                                                                                                                downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                                                                coroutine_suspended = obj5;
                                                                                                                outputStream3 = closeable20;
                                                                                                                str4 = str13;
                                                                                                                downloadService = downloadService2;
                                                                                                                closeable = closeable19;
                                                                                                                downloadRecord2 = downloadRecord13;
                                                                                                                th3 = th;
                                                                                                                closeable2 = closeable15;
                                                                                                                str6 = continuation;
                                                                                                                throw th3;
                                                                                                            }
                                                                                                            closeable15 = closeable21;
                                                                                                        } catch (java.lang.Throwable th24) {
                                                                                                            th = th24;
                                                                                                            closeable15 = closeable21;
                                                                                                        }
                                                                                                        closeable19 = closeable10;
                                                                                                        closeable20 = closeable22;
                                                                                                    } catch (java.lang.Throwable th25) {
                                                                                                        th = th25;
                                                                                                        closeable15 = closeable21;
                                                                                                        downloadRecord13 = downloadRecord13;
                                                                                                        closeable19 = closeable10;
                                                                                                        obj5 = obj8;
                                                                                                        closeable20 = closeable22;
                                                                                                        downloadRecordDao2 = downloadRecordDao7;
                                                                                                        downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                                                        coroutine_suspended = obj5;
                                                                                                        outputStream3 = closeable20;
                                                                                                        str4 = str13;
                                                                                                        downloadService = downloadService2;
                                                                                                        closeable = closeable19;
                                                                                                        downloadRecord2 = downloadRecord13;
                                                                                                        th3 = th;
                                                                                                        closeable2 = closeable15;
                                                                                                        str6 = continuation;
                                                                                                        throw th3;
                                                                                                    }
                                                                                                } catch (java.lang.Throwable th26) {
                                                                                                    th = th26;
                                                                                                    closeable15 = closeable21;
                                                                                                }
                                                                                                downloadRecordDao7 = downloadRecordDao5;
                                                                                            }
                                                                                        } catch (java.lang.Throwable th27) {
                                                                                            th = th27;
                                                                                            closeable15 = closeable21;
                                                                                            downloadRecordDao7 = downloadRecordDao5;
                                                                                            closeable19 = closeable10;
                                                                                            obj5 = obj8;
                                                                                            closeable20 = closeable22;
                                                                                            downloadRecordDao2 = downloadRecordDao7;
                                                                                            downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                                            coroutine_suspended = obj5;
                                                                                            outputStream3 = closeable20;
                                                                                            str4 = str13;
                                                                                            downloadService = downloadService2;
                                                                                            closeable = closeable19;
                                                                                            downloadRecord2 = downloadRecord13;
                                                                                            th3 = th;
                                                                                            closeable2 = closeable15;
                                                                                            str6 = continuation;
                                                                                            throw th3;
                                                                                        }
                                                                                        bArr2 = bArr;
                                                                                        longRef5 = longRef4;
                                                                                        downloadRecord13 = downloadRecord18;
                                                                                    } catch (java.lang.Throwable th28) {
                                                                                        th = th28;
                                                                                        closeable15 = closeable21;
                                                                                        downloadRecord13 = downloadRecord18;
                                                                                    }
                                                                                    saveTarget3 = saveTarget2;
                                                                                    closeable22 = closeable9;
                                                                                } catch (java.lang.Throwable th29) {
                                                                                    th = th29;
                                                                                    closeable15 = closeable21;
                                                                                    downloadRecord13 = downloadRecord18;
                                                                                    closeable19 = closeable10;
                                                                                    obj5 = obj8;
                                                                                    closeable20 = closeable9;
                                                                                    downloadRecordDao7 = downloadRecordDao5;
                                                                                    downloadRecordDao2 = downloadRecordDao7;
                                                                                    downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                                    coroutine_suspended = obj5;
                                                                                    outputStream3 = closeable20;
                                                                                    str4 = str13;
                                                                                    downloadService = downloadService2;
                                                                                    closeable = closeable19;
                                                                                    downloadRecord2 = downloadRecord13;
                                                                                    th3 = th;
                                                                                    closeable2 = closeable15;
                                                                                    str6 = continuation;
                                                                                    throw th3;
                                                                                }
                                                                                closeable21 = closeable6;
                                                                            } catch (java.lang.Throwable th30) {
                                                                                th = th30;
                                                                                downloadRecord13 = downloadRecord18;
                                                                                closeable15 = closeable6;
                                                                            }
                                                                        } else {
                                                                            downloadRecord12 = downloadRecord18;
                                                                            closeable15 = closeable6;
                                                                            closeable18 = closeable10;
                                                                            obj4 = obj8;
                                                                        }
                                                                    }
                                                                } catch (java.lang.Throwable th31) {
                                                                    th = th31;
                                                                    downloadRecord10 = downloadRecord18;
                                                                    obj4 = obj3;
                                                                    closeable15 = closeable6;
                                                                    closeable16 = closeable10;
                                                                    closeable17 = closeable9;
                                                                    downloadRecordDao6 = downloadRecordDao5;
                                                                    downloadRecordDao2 = downloadRecordDao6;
                                                                    downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                    coroutine_suspended = obj4;
                                                                    closeable = closeable16;
                                                                    outputStream3 = closeable17;
                                                                    str4 = str13;
                                                                    downloadRecord2 = downloadRecord10;
                                                                    downloadService = downloadService2;
                                                                    th3 = th;
                                                                    closeable2 = closeable15;
                                                                    str6 = continuation;
                                                                    throw th3;
                                                                }
                                                            }
                                                            downloadRecordDao2 = downloadRecordDao5;
                                                            coroutine_suspended = obj3;
                                                            closeable = closeable10;
                                                            str4 = str13;
                                                            downloadService = downloadService2;
                                                            th3 = th;
                                                            closeable2 = closeable6;
                                                            str6 = continuation;
                                                            throw th3;
                                                        }
                                                        downloadRecord12 = downloadRecord8;
                                                        obj4 = obj3;
                                                        closeable15 = closeable6;
                                                        closeable18 = closeable10;
                                                        closeable17 = closeable9;
                                                        downloadRecordDao6 = downloadRecordDao5;
                                                        saveTarget5 = saveTarget2;
                                                        try {
                                                            kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                            try {
                                                                kotlin.io.CloseableKt.closeFinally(closeable15, null);
                                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                                try {
                                                                    kotlin.io.CloseableKt.closeFinally(closeable17, null);
                                                                    downloadService$downloadTask$12.L$0 = downloadService2;
                                                                    downloadService$downloadTask$12.L$1 = str13;
                                                                    downloadService$downloadTask$12.L$2 = downloadRecordDao6;
                                                                    downloadRecord14 = downloadRecord12;
                                                                    try {
                                                                        downloadService$downloadTask$12.L$3 = downloadRecord14;
                                                                        downloadService$downloadTask$12.L$4 = saveTarget5;
                                                                        closeable24 = closeable18;
                                                                        try {
                                                                            downloadService$downloadTask$12.L$5 = closeable24;
                                                                            downloadService$downloadTask$12.L$6 = null;
                                                                            downloadService$downloadTask$12.L$7 = null;
                                                                            downloadService$downloadTask$12.L$8 = null;
                                                                            downloadService$downloadTask$12.L$9 = null;
                                                                            downloadService$downloadTask$12.L$10 = null;
                                                                            downloadService$downloadTask$12.L$11 = null;
                                                                            downloadService$downloadTask$12.L$12 = null;
                                                                            downloadService$downloadTask$12.label = 10;
                                                                            obj7 = downloadRecordDao6.getById(str13, downloadService$downloadTask$12);
                                                                            if (obj7 != obj4) {
                                                                                return obj4;
                                                                            }
                                                                            downloadRecordDao8 = downloadRecordDao6;
                                                                            downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                            coroutine_suspended = obj4;
                                                                            saveTarget6 = saveTarget5;
                                                                            closeable25 = closeable24;
                                                                            downloadRecord15 = downloadRecord14;
                                                                            str14 = str13;
                                                                            downloadRecord16 = (tool.wu.heng.data.db.DownloadRecord) obj7;
                                                                            if (downloadRecord16 != null && kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord16.getStatus(), "DOWNLOADING")) {
                                                                                mediaStoreTarget = !(saveTarget6 instanceof tool.wu.heng.service.DownloadService.MediaStoreTarget) ? (tool.wu.heng.service.DownloadService.MediaStoreTarget) saveTarget6 : null;
                                                                                if (mediaStoreTarget != null) {
                                                                                    mediaStoreTarget.markCompleted();
                                                                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                                                }
                                                                                long fileSize = saveTarget6.fileSize();
                                                                                copy9 = downloadRecord16.copy((r36 & 1) != 0 ? downloadRecord16.id : null, (r36 & 2) != 0 ? downloadRecord16.title : null, (r36 & 4) != 0 ? downloadRecord16.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord16.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord16.savePath : saveTarget6.displayName(), (r36 & 32) != 0 ? downloadRecord16.ext : null, (r36 & 64) != 0 ? downloadRecord16.source : null, (r36 & 128) != 0 ? downloadRecord16.status : "COMPLETED", (r36 & 256) != 0 ? downloadRecord16.progress : 100.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord16.downloadedBytes : fileSize, (r36 & 1024) != 0 ? downloadRecord16.totalBytes : fileSize, (r36 & 2048) != 0 ? downloadRecord16.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord16.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord16.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord16.completedAt : kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()));
                                                                                downloadService$downloadTask$1.L$0 = downloadService2;
                                                                                downloadService$downloadTask$1.L$1 = str14;
                                                                                downloadService$downloadTask$1.L$2 = downloadRecordDao8;
                                                                                downloadService$downloadTask$1.L$3 = downloadRecord15;
                                                                                downloadService$downloadTask$1.L$4 = saveTarget6;
                                                                                downloadService$downloadTask$1.L$5 = closeable25;
                                                                                downloadService$downloadTask$1.label = 11;
                                                                                if (downloadRecordDao8.update(copy9, downloadService$downloadTask$1) == coroutine_suspended) {
                                                                                    return coroutine_suspended;
                                                                                }
                                                                                downloadService2.updateNotification(downloadRecord15.getTitle(), 100, "下载完成");
                                                                                timber.log.Timber.INSTANCE.i("任务 %s 下载完成: %s", str14, saveTarget6.displayName());
                                                                            }
                                                                            java.lang.Boolean boxBoolean6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                                                            kotlin.io.CloseableKt.closeFinally(closeable25, null);
                                                                            return boxBoolean6;
                                                                        } catch (java.lang.Throwable th32) {
                                                                            th = th32;
                                                                            downloadRecordDao3 = downloadRecordDao6;
                                                                            downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                            coroutine_suspended = obj4;
                                                                            closeable3 = closeable24;
                                                                            downloadRecord3 = downloadRecord14;
                                                                            th = th;
                                                                            str5 = str13;
                                                                            str2 = continuation;
                                                                            throw th;
                                                                        }
                                                                    } catch (java.lang.Throwable th33) {
                                                                        th = th33;
                                                                        closeable24 = closeable18;
                                                                    }
                                                                } catch (java.lang.Throwable th34) {
                                                                    th = th34;
                                                                    closeable24 = closeable18;
                                                                    downloadRecord14 = downloadRecord12;
                                                                }
                                                            } catch (java.lang.Throwable th35) {
                                                                th2 = th35;
                                                                downloadRecordDao3 = downloadRecordDao6;
                                                                downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                                coroutine_suspended = obj4;
                                                                r5 = closeable18;
                                                                r1 = closeable17;
                                                                downloadRecord3 = downloadRecord12;
                                                                str5 = str13;
                                                                continuation = continuation;
                                                                throw th2;
                                                            }
                                                        } catch (java.lang.Throwable th36) {
                                                            th = th36;
                                                            closeable16 = closeable18;
                                                            downloadRecord10 = downloadRecord12;
                                                            downloadRecordDao2 = downloadRecordDao6;
                                                            downloadService$downloadTask$1 = downloadService$downloadTask$12;
                                                            coroutine_suspended = obj4;
                                                            closeable = closeable16;
                                                            outputStream3 = closeable17;
                                                            str4 = str13;
                                                            downloadRecord2 = downloadRecord10;
                                                            downloadService = downloadService2;
                                                            th3 = th;
                                                            closeable2 = closeable15;
                                                            str6 = continuation;
                                                            throw th3;
                                                        }
                                                    } catch (java.lang.Throwable th37) {
                                                        th = th37;
                                                        continuation = str11;
                                                        r5 = execute;
                                                        downloadService7 = outputStream3;
                                                        th2 = th;
                                                        r1 = downloadService7;
                                                        r5 = r5;
                                                        continuation = continuation;
                                                        throw th2;
                                                    }
                                                } catch (java.lang.Throwable th38) {
                                                    th = th38;
                                                    response = execute;
                                                    str2 = str11;
                                                    closeable3 = response;
                                                    throw th;
                                                }
                                            } catch (java.lang.Exception e) {
                                                e = e;
                                                downloadRecord = downloadRecord3;
                                                downloadRecordDao = downloadRecordDao3;
                                                str3 = str2;
                                                str7 = str5;
                                                downloadService3 = downloadService2;
                                                timber.log.Timber.INSTANCE.e(e, "任务 %s 下载失败", str7);
                                                downloadService$downloadTask$1.L$0 = downloadService3;
                                                downloadService$downloadTask$1.L$1 = downloadRecordDao;
                                                downloadService$downloadTask$1.L$2 = downloadRecord;
                                                downloadService$downloadTask$1.L$3 = e;
                                                downloadService$downloadTask$1.L$4 = null;
                                                downloadService$downloadTask$1.L$5 = null;
                                                downloadService$downloadTask$1.L$6 = null;
                                                downloadService$downloadTask$1.L$7 = null;
                                                downloadService$downloadTask$1.L$8 = null;
                                                downloadService$downloadTask$1.L$9 = null;
                                                downloadService$downloadTask$1.L$10 = null;
                                                downloadService$downloadTask$1.L$11 = null;
                                                downloadService$downloadTask$1.L$12 = null;
                                                downloadService$downloadTask$1.label = 12;
                                                obj7 = downloadRecordDao.getById(str7, downloadService$downloadTask$1);
                                                if (obj7 != coroutine_suspended) {
                                                }
                                            }
                                        } catch (java.lang.Exception e2) {
                                            e = e2;
                                            downloadRecord = downloadRecord6;
                                            str7 = str10;
                                            timber.log.Timber.INSTANCE.e(e, "任务 %s 下载失败", str7);
                                            downloadService$downloadTask$1.L$0 = downloadService3;
                                            downloadService$downloadTask$1.L$1 = downloadRecordDao;
                                            downloadService$downloadTask$1.L$2 = downloadRecord;
                                            downloadService$downloadTask$1.L$3 = e;
                                            downloadService$downloadTask$1.L$4 = null;
                                            downloadService$downloadTask$1.L$5 = null;
                                            downloadService$downloadTask$1.L$6 = null;
                                            downloadService$downloadTask$1.L$7 = null;
                                            downloadService$downloadTask$1.L$8 = null;
                                            downloadService$downloadTask$1.L$9 = null;
                                            downloadService$downloadTask$1.L$10 = null;
                                            downloadService$downloadTask$1.L$11 = null;
                                            downloadService$downloadTask$1.L$12 = null;
                                            downloadService$downloadTask$1.label = 12;
                                            obj7 = downloadRecordDao.getById(str7, downloadService$downloadTask$1);
                                            if (obj7 != coroutine_suspended) {
                                            }
                                        }
                                        break;
                                    case 1:
                                        str3 = "下载失败";
                                        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao10 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$2;
                                        java.lang.String str16 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        tool.wu.heng.service.DownloadService downloadService11 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        downloadService3 = downloadService11;
                                        downloadRecordDao = downloadRecordDao10;
                                        obj = obj7;
                                        str10 = str16;
                                        z = true;
                                        downloadRecord6 = (tool.wu.heng.data.db.DownloadRecord) obj;
                                        if (downloadRecord6 != null) {
                                        }
                                        break;
                                    case 2:
                                        str3 = "下载失败";
                                        downloadRecord = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        downloadRecordDao = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$2;
                                        str7 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        try {
                                            kotlin.ResultKt.throwOnFailure(obj7);
                                            downloadRecord3 = downloadRecord;
                                            downloadRecordDao3 = downloadRecordDao;
                                            str5 = str7;
                                            str2 = str3;
                                            downloadService2 = downloadService3;
                                            downloadService2.updateNotification(downloadRecord3.getTitle(), 0, null);
                                            tool.wu.heng.service.DownloadService.SaveTarget resolveSaveTarget2 = downloadService2.resolveSaveTarget(new kotlin.text.Regex("[\\\\/:*?\"<>|]").replace(downloadRecord3.getTitle(), "_") + "." + downloadRecord3.getExt(), downloadRecord3.getExt());
                                            okhttp3.Request.Builder url2 = new okhttp3.Request.Builder().url(downloadRecord3.getDownloadUrl());
                                            while (r5.hasNext()) {
                                            }
                                            existingSize = resolveSaveTarget2.existingSize();
                                            if (existingSize > 0) {
                                            }
                                            execute = downloadService2.getOkHttpClient().newCall(url2.build()).execute();
                                            response2 = execute;
                                            if (!response2.isSuccessful()) {
                                            }
                                            str11 = str2;
                                            body = response2.body();
                                            if (body != null) {
                                            }
                                        } catch (java.lang.Exception e3) {
                                            e = e3;
                                            timber.log.Timber.INSTANCE.e(e, "任务 %s 下载失败", str7);
                                            downloadService$downloadTask$1.L$0 = downloadService3;
                                            downloadService$downloadTask$1.L$1 = downloadRecordDao;
                                            downloadService$downloadTask$1.L$2 = downloadRecord;
                                            downloadService$downloadTask$1.L$3 = e;
                                            downloadService$downloadTask$1.L$4 = null;
                                            downloadService$downloadTask$1.L$5 = null;
                                            downloadService$downloadTask$1.L$6 = null;
                                            downloadService$downloadTask$1.L$7 = null;
                                            downloadService$downloadTask$1.L$8 = null;
                                            downloadService$downloadTask$1.L$9 = null;
                                            downloadService$downloadTask$1.L$10 = null;
                                            downloadService$downloadTask$1.L$11 = null;
                                            downloadService$downloadTask$1.L$12 = null;
                                            downloadService$downloadTask$1.label = 12;
                                            obj7 = downloadRecordDao.getById(str7, downloadService$downloadTask$1);
                                            if (obj7 != coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            exc = e;
                                            downloadRecord4 = downloadRecord;
                                            str8 = str3;
                                            java.lang.Object obj9 = coroutine_suspended;
                                            tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$15 = downloadService$downloadTask$1;
                                            downloadService4 = downloadService3;
                                            downloadRecord5 = (tool.wu.heng.data.db.DownloadRecord) obj7;
                                            str9 = str8;
                                            if (downloadRecord5 != null) {
                                            }
                                            downloadService4.updateNotification(downloadRecord4.getTitle(), 0, str9);
                                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                        }
                                        break;
                                    case 3:
                                        continuation = "下载失败";
                                        java.io.Closeable closeable29 = (java.io.Closeable) downloadService$downloadTask$1.L$4;
                                        downloadRecord3 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        downloadRecordDao3 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$2;
                                        str5 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        downloadService2 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        r5 = closeable29;
                                        downloadService2.updateNotification(downloadRecord3.getTitle(), 0, continuation);
                                        java.lang.Boolean boxBoolean7 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                        kotlin.io.CloseableKt.closeFinally(r5, null);
                                        return boxBoolean7;
                                    case 4:
                                        closeable8 = (java.io.Closeable) downloadService$downloadTask$1.L$4;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        java.lang.Boolean boxBoolean22 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                        kotlin.io.CloseableKt.closeFinally(closeable8, null);
                                        return boxBoolean22;
                                    case 5:
                                        downloadService6 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$5;
                                        closeable7 = (java.io.Closeable) downloadService$downloadTask$1.L$4;
                                        downloadRecord3 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        str11 = "下载失败";
                                        downloadService6.updateNotification(downloadRecord3.getTitle(), 0, str11);
                                        java.lang.Boolean boxBoolean32 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                        kotlin.io.CloseableKt.closeFinally(closeable7, null);
                                        return boxBoolean32;
                                    case 6:
                                        continuation = "下载失败";
                                        long j20 = downloadService$downloadTask$1.J$2;
                                        long j21 = downloadService$downloadTask$1.J$1;
                                        long j22 = downloadService$downloadTask$1.J$0;
                                        byte[] bArr4 = (byte[]) downloadService$downloadTask$1.L$12;
                                        java.io.InputStream inputStream4 = (java.io.InputStream) downloadService$downloadTask$1.L$11;
                                        java.io.Closeable closeable30 = (java.io.Closeable) downloadService$downloadTask$1.L$10;
                                        kotlin.jvm.internal.Ref.LongRef longRef9 = (kotlin.jvm.internal.Ref.LongRef) downloadService$downloadTask$1.L$9;
                                        longRef3 = (kotlin.jvm.internal.Ref.LongRef) downloadService$downloadTask$1.L$8;
                                        java.io.OutputStream outputStream5 = (java.io.OutputStream) downloadService$downloadTask$1.L$7;
                                        java.io.Closeable closeable31 = (java.io.Closeable) downloadService$downloadTask$1.L$6;
                                        java.io.Closeable closeable32 = (java.io.Closeable) downloadService$downloadTask$1.L$5;
                                        tool.wu.heng.service.DownloadService.SaveTarget saveTarget8 = (tool.wu.heng.service.DownloadService.SaveTarget) downloadService$downloadTask$1.L$4;
                                        tool.wu.heng.data.db.DownloadRecord downloadRecord19 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao11 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$2;
                                        java.lang.String str17 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        tool.wu.heng.service.DownloadService downloadService12 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        j4 = j20;
                                        longRef4 = longRef9;
                                        saveTarget2 = saveTarget8;
                                        closeable9 = closeable31;
                                        closeable10 = closeable32;
                                        downloadRecord8 = downloadRecord19;
                                        downloadRecordDao5 = downloadRecordDao11;
                                        j5 = j22;
                                        closeable6 = closeable30;
                                        str13 = str17;
                                        tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$16 = downloadService$downloadTask$1;
                                        bArr = bArr4;
                                        inputStream2 = inputStream4;
                                        j6 = j21;
                                        outputStream = outputStream5;
                                        downloadService2 = downloadService12;
                                        obj3 = coroutine_suspended;
                                        downloadService$downloadTask$12 = downloadService$downloadTask$16;
                                        downloadRecord11 = (tool.wu.heng.data.db.DownloadRecord) obj7;
                                        if (downloadRecord11 == null) {
                                        }
                                        closeable17 = closeable9;
                                        downloadRecordDao6 = downloadRecordDao5;
                                        saveTarget5 = saveTarget2;
                                        kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                        kotlin.io.CloseableKt.closeFinally(closeable15, null);
                                        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                                        kotlin.io.CloseableKt.closeFinally(closeable17, null);
                                        downloadService$downloadTask$12.L$0 = downloadService2;
                                        downloadService$downloadTask$12.L$1 = str13;
                                        downloadService$downloadTask$12.L$2 = downloadRecordDao6;
                                        downloadRecord14 = downloadRecord12;
                                        downloadService$downloadTask$12.L$3 = downloadRecord14;
                                        downloadService$downloadTask$12.L$4 = saveTarget5;
                                        closeable24 = closeable18;
                                        downloadService$downloadTask$12.L$5 = closeable24;
                                        downloadService$downloadTask$12.L$6 = null;
                                        downloadService$downloadTask$12.L$7 = null;
                                        downloadService$downloadTask$12.L$8 = null;
                                        downloadService$downloadTask$12.L$9 = null;
                                        downloadService$downloadTask$12.L$10 = null;
                                        downloadService$downloadTask$12.L$11 = null;
                                        downloadService$downloadTask$12.L$12 = null;
                                        downloadService$downloadTask$12.label = 10;
                                        obj7 = downloadRecordDao6.getById(str13, downloadService$downloadTask$12);
                                        if (obj7 != obj4) {
                                        }
                                        break;
                                    case 7:
                                        closeable11 = (java.io.Closeable) downloadService$downloadTask$1.L$6;
                                        java.io.Closeable closeable33 = (java.io.Closeable) downloadService$downloadTask$1.L$5;
                                        java.io.Closeable closeable34 = (java.io.Closeable) downloadService$downloadTask$1.L$4;
                                        tool.wu.heng.data.db.DownloadRecord downloadRecord20 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        tool.wu.heng.service.DownloadService downloadService13 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        closeable9 = closeable33;
                                        closeable12 = closeable34;
                                        downloadRecord9 = downloadRecord20;
                                        downloadService2 = downloadService13;
                                        downloadService2.updateNotification(downloadRecord9.getTitle(), 0, "已暂停");
                                        java.lang.Boolean boxBoolean42 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                        kotlin.io.CloseableKt.closeFinally(closeable11, null);
                                        kotlin.io.CloseableKt.closeFinally(closeable9, null);
                                        kotlin.io.CloseableKt.closeFinally(closeable12, null);
                                        return boxBoolean42;
                                    case 8:
                                        closeable13 = (java.io.Closeable) downloadService$downloadTask$1.L$6;
                                        java.io.Closeable closeable35 = (java.io.Closeable) downloadService$downloadTask$1.L$5;
                                        java.io.Closeable closeable36 = (java.io.Closeable) downloadService$downloadTask$1.L$4;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        closeable9 = closeable35;
                                        closeable14 = closeable36;
                                        z2 = true;
                                        java.lang.Boolean boxBoolean52 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
                                        kotlin.io.CloseableKt.closeFinally(closeable13, null);
                                        kotlin.io.CloseableKt.closeFinally(closeable9, null);
                                        kotlin.io.CloseableKt.closeFinally(closeable14, null);
                                        return boxBoolean52;
                                    case 9:
                                        float f5 = downloadService$downloadTask$1.F$0;
                                        long j23 = downloadService$downloadTask$1.J$3;
                                        str15 = "下载失败";
                                        long j24 = downloadService$downloadTask$1.J$2;
                                        long j25 = downloadService$downloadTask$1.J$1;
                                        long j26 = downloadService$downloadTask$1.J$0;
                                        byte[] bArr5 = (byte[]) downloadService$downloadTask$1.L$12;
                                        java.io.InputStream inputStream5 = (java.io.InputStream) downloadService$downloadTask$1.L$11;
                                        closeable2 = (java.io.Closeable) downloadService$downloadTask$1.L$10;
                                        kotlin.jvm.internal.Ref.LongRef longRef10 = (kotlin.jvm.internal.Ref.LongRef) downloadService$downloadTask$1.L$9;
                                        kotlin.jvm.internal.Ref.LongRef longRef11 = (kotlin.jvm.internal.Ref.LongRef) downloadService$downloadTask$1.L$8;
                                        outputStream2 = (java.io.OutputStream) downloadService$downloadTask$1.L$7;
                                        java.io.Closeable closeable37 = (java.io.Closeable) downloadService$downloadTask$1.L$6;
                                        java.io.Closeable closeable38 = (java.io.Closeable) downloadService$downloadTask$1.L$5;
                                        tool.wu.heng.service.DownloadService.SaveTarget saveTarget9 = (tool.wu.heng.service.DownloadService.SaveTarget) downloadService$downloadTask$1.L$4;
                                        tool.wu.heng.data.db.DownloadRecord downloadRecord21 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$2;
                                        java.lang.String str18 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        tool.wu.heng.service.DownloadService downloadService14 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        f2 = f5;
                                        j10 = j23;
                                        closeable23 = closeable37;
                                        downloadRecord7 = downloadRecord21;
                                        downloadService2 = downloadService14;
                                        downloadService$downloadTask$12 = downloadService$downloadTask$1;
                                        obj2 = coroutine_suspended;
                                        bArr3 = bArr5;
                                        longRef6 = longRef11;
                                        closeable5 = closeable38;
                                        j12 = j24;
                                        longRef2 = longRef10;
                                        j9 = j26;
                                        inputStream = inputStream5;
                                        saveTarget4 = saveTarget9;
                                        str12 = str18;
                                        j11 = j25;
                                        downloadService$downloadTask$13 = downloadService$downloadTask$12;
                                        downloadService2.updateNotification(downloadRecord7.getTitle(), (int) f2, null);
                                        longRef2.element = j10;
                                        closeable4 = closeable23;
                                        saveTarget = saveTarget4;
                                        longRef = longRef6;
                                        j = j9;
                                        closeable6 = closeable2;
                                        downloadService5 = downloadService2;
                                        bArr = bArr3;
                                        outputStream = outputStream2;
                                        j3 = j12;
                                        j2 = j11;
                                        downloadRecordDao4 = downloadRecordDao2;
                                        downloadService$downloadTask$12 = downloadService$downloadTask$13;
                                        continuation = str15;
                                        downloadService$downloadTask$12.L$0 = downloadService5;
                                        downloadService$downloadTask$12.L$1 = str12;
                                        downloadService$downloadTask$12.L$2 = downloadRecordDao4;
                                        downloadService$downloadTask$12.L$3 = downloadRecord7;
                                        downloadService$downloadTask$12.L$4 = saveTarget;
                                        downloadService$downloadTask$12.L$5 = closeable5;
                                        downloadService$downloadTask$12.L$6 = closeable4;
                                        downloadService$downloadTask$12.L$7 = outputStream;
                                        downloadService$downloadTask$12.L$8 = longRef;
                                        downloadService$downloadTask$12.L$9 = longRef2;
                                        downloadService$downloadTask$12.L$10 = closeable6;
                                        downloadService$downloadTask$12.L$11 = inputStream;
                                        downloadService$downloadTask$12.L$12 = bArr;
                                        downloadService$downloadTask$12.J$0 = j;
                                        saveTarget7 = saveTarget;
                                        closeable26 = closeable4;
                                        j13 = j2;
                                        downloadService$downloadTask$12.J$1 = j13;
                                        j14 = j3;
                                        downloadService$downloadTask$12.J$2 = j14;
                                        downloadService$downloadTask$12.label = 6;
                                        byId = downloadRecordDao4.getById(str12, downloadService$downloadTask$12);
                                        obj6 = obj2;
                                        if (byId != obj6) {
                                        }
                                        break;
                                    case 10:
                                        closeable25 = (java.io.Closeable) downloadService$downloadTask$1.L$5;
                                        saveTarget6 = (tool.wu.heng.service.DownloadService.SaveTarget) downloadService$downloadTask$1.L$4;
                                        downloadRecord15 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        downloadRecordDao8 = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$2;
                                        str14 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        downloadService2 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        downloadRecord16 = (tool.wu.heng.data.db.DownloadRecord) obj7;
                                        if (downloadRecord16 != null) {
                                            if (!(saveTarget6 instanceof tool.wu.heng.service.DownloadService.MediaStoreTarget)) {
                                            }
                                            if (mediaStoreTarget != null) {
                                            }
                                            long fileSize2 = saveTarget6.fileSize();
                                            copy9 = downloadRecord16.copy((r36 & 1) != 0 ? downloadRecord16.id : null, (r36 & 2) != 0 ? downloadRecord16.title : null, (r36 & 4) != 0 ? downloadRecord16.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord16.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord16.savePath : saveTarget6.displayName(), (r36 & 32) != 0 ? downloadRecord16.ext : null, (r36 & 64) != 0 ? downloadRecord16.source : null, (r36 & 128) != 0 ? downloadRecord16.status : "COMPLETED", (r36 & 256) != 0 ? downloadRecord16.progress : 100.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord16.downloadedBytes : fileSize2, (r36 & 1024) != 0 ? downloadRecord16.totalBytes : fileSize2, (r36 & 2048) != 0 ? downloadRecord16.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord16.errorMessage : null, (r36 & 8192) != 0 ? downloadRecord16.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord16.completedAt : kotlin.coroutines.jvm.internal.Boxing.boxLong(java.lang.System.currentTimeMillis()));
                                            downloadService$downloadTask$1.L$0 = downloadService2;
                                            downloadService$downloadTask$1.L$1 = str14;
                                            downloadService$downloadTask$1.L$2 = downloadRecordDao8;
                                            downloadService$downloadTask$1.L$3 = downloadRecord15;
                                            downloadService$downloadTask$1.L$4 = saveTarget6;
                                            downloadService$downloadTask$1.L$5 = closeable25;
                                            downloadService$downloadTask$1.label = 11;
                                            if (downloadRecordDao8.update(copy9, downloadService$downloadTask$1) == coroutine_suspended) {
                                            }
                                            downloadService2.updateNotification(downloadRecord15.getTitle(), 100, "下载完成");
                                            timber.log.Timber.INSTANCE.i("任务 %s 下载完成: %s", str14, saveTarget6.displayName());
                                            break;
                                        }
                                        java.lang.Boolean boxBoolean62 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                        kotlin.io.CloseableKt.closeFinally(closeable25, null);
                                        return boxBoolean62;
                                    case 11:
                                        closeable25 = (java.io.Closeable) downloadService$downloadTask$1.L$5;
                                        saveTarget6 = (tool.wu.heng.service.DownloadService.SaveTarget) downloadService$downloadTask$1.L$4;
                                        downloadRecord15 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$3;
                                        str14 = (java.lang.String) downloadService$downloadTask$1.L$1;
                                        downloadService2 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        downloadService2.updateNotification(downloadRecord15.getTitle(), 100, "下载完成");
                                        timber.log.Timber.INSTANCE.i("任务 %s 下载完成: %s", str14, saveTarget6.displayName());
                                        java.lang.Boolean boxBoolean622 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                        kotlin.io.CloseableKt.closeFinally(closeable25, null);
                                        return boxBoolean622;
                                    case 12:
                                        java.lang.Exception exc2 = (java.lang.Exception) downloadService$downloadTask$1.L$3;
                                        tool.wu.heng.data.db.DownloadRecord downloadRecord22 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$2;
                                        downloadRecordDao = (tool.wu.heng.data.db.DownloadRecordDao) downloadService$downloadTask$1.L$1;
                                        downloadService3 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        exc = exc2;
                                        downloadRecord4 = downloadRecord22;
                                        str8 = "下载失败";
                                        java.lang.Object obj92 = coroutine_suspended;
                                        tool.wu.heng.service.DownloadService$downloadTask$1 downloadService$downloadTask$152 = downloadService$downloadTask$1;
                                        downloadService4 = downloadService3;
                                        downloadRecord5 = (tool.wu.heng.data.db.DownloadRecord) obj7;
                                        str9 = str8;
                                        if (downloadRecord5 != null) {
                                            java.lang.String message = exc.getMessage();
                                            if (message == null) {
                                                message = "未知错误";
                                            }
                                            copy = downloadRecord5.copy((r36 & 1) != 0 ? downloadRecord5.id : null, (r36 & 2) != 0 ? downloadRecord5.title : null, (r36 & 4) != 0 ? downloadRecord5.thumbnailUrl : null, (r36 & 8) != 0 ? downloadRecord5.downloadUrl : null, (r36 & 16) != 0 ? downloadRecord5.savePath : null, (r36 & 32) != 0 ? downloadRecord5.ext : null, (r36 & 64) != 0 ? downloadRecord5.source : null, (r36 & 128) != 0 ? downloadRecord5.status : "FAILED", (r36 & 256) != 0 ? downloadRecord5.progress : 0.0f, (r36 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? downloadRecord5.downloadedBytes : 0L, (r36 & 1024) != 0 ? downloadRecord5.totalBytes : 0L, (r36 & 2048) != 0 ? downloadRecord5.speedBps : 0L, (r36 & 4096) != 0 ? downloadRecord5.errorMessage : message, (r36 & 8192) != 0 ? downloadRecord5.createdAt : 0L, (r36 & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? downloadRecord5.completedAt : null);
                                            downloadService$downloadTask$152.L$0 = downloadService4;
                                            downloadService$downloadTask$152.L$1 = downloadRecord4;
                                            downloadService$downloadTask$152.L$2 = null;
                                            downloadService$downloadTask$152.L$3 = null;
                                            downloadService$downloadTask$152.label = 13;
                                            str9 = str8;
                                            if (downloadRecordDao.update(copy, downloadService$downloadTask$152) == obj92) {
                                                return obj92;
                                            }
                                        }
                                        downloadService4.updateNotification(downloadRecord4.getTitle(), 0, str9);
                                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                    case 13:
                                        downloadRecord4 = (tool.wu.heng.data.db.DownloadRecord) downloadService$downloadTask$1.L$1;
                                        downloadService4 = (tool.wu.heng.service.DownloadService) downloadService$downloadTask$1.L$0;
                                        kotlin.ResultKt.throwOnFailure(obj7);
                                        str9 = "下载失败";
                                        downloadService4.updateNotification(downloadRecord4.getTitle(), 0, str9);
                                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                                    default:
                                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                        }
                        switch (r5) {
                        }
                    } catch (java.lang.Throwable th39) {
                        th = th39;
                    }
                } catch (java.lang.Throwable th40) {
                    th = th40;
                    response = r5;
                }
            } catch (java.lang.Throwable th41) {
                th = th41;
            }
        } catch (java.lang.Throwable th42) {
            th = th42;
            str2 = "下载失败";
            closeable3 = r5;
        }
        downloadService$downloadTask$1 = new tool.wu.heng.service.DownloadService$downloadTask$1(downloadService7, continuation);
        java.lang.Object obj72 = downloadService$downloadTask$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r5 = downloadService$downloadTask$1.label;
    }

    private final tool.wu.heng.service.DownloadService.SaveTarget resolveSaveTarget(java.lang.String fileName, java.lang.String ext) {
        int columnIndex;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.content.ContentResolver contentResolver = getContentResolver();
            android.net.Uri EXTERNAL_CONTENT_URI = android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
            android.database.Cursor query = contentResolver.query(EXTERNAL_CONTENT_URI, new java.lang.String[]{"_id", "_display_name"}, "_display_name = ?", new java.lang.String[]{fileName}, null);
            android.net.Uri uri = null;
            if (query != null) {
                android.database.Cursor cursor = query;
                try {
                    android.database.Cursor cursor2 = cursor;
                    android.net.Uri withAppendedPath = (!cursor2.moveToFirst() || (columnIndex = cursor2.getColumnIndex("_id")) < 0) ? null : android.net.Uri.withAppendedPath(EXTERNAL_CONTENT_URI, java.lang.String.valueOf(cursor2.getLong(columnIndex)));
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(cursor, null);
                    uri = withAppendedPath;
                } finally {
                }
            }
            if (uri == null) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("_display_name", fileName);
                contentValues.put("relative_path", android.os.Environment.DIRECTORY_DOWNLOADS + "/无痕");
                contentValues.put("mime_type", mimeTypeFor(ext));
                if (android.os.Build.VERSION.SDK_INT >= 30) {
                    contentValues.put("is_pending", (java.lang.Integer) 1);
                }
                uri = contentResolver.insert(EXTERNAL_CONTENT_URI, contentValues);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(contentResolver);
            return new tool.wu.heng.service.DownloadService.MediaStoreTarget(uri, contentResolver, fileName);
        }
        java.io.File file = new java.io.File(android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS), SUB_DIR);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new tool.wu.heng.service.DownloadService.FileTarget(new java.io.File(file, fileName));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.String mimeTypeFor(java.lang.String ext) {
        java.lang.String lowerCase = ext.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        switch (lowerCase.hashCode()) {
            case 102340:
                return !lowerCase.equals("gif") ? "application/octet-stream" : "image/gif";
            case 105441:
                if (lowerCase.equals("jpg")) {
                    return "image/jpeg";
                }
                break;
            case 108273:
                if (lowerCase.equals("mp4")) {
                    return "video/mp4";
                }
                break;
            case 111145:
                if (lowerCase.equals("png")) {
                    return "image/png";
                }
                break;
            case 3268712:
                if (!lowerCase.equals("jpeg")) {
                }
                break;
            case 3645337:
                if (lowerCase.equals("webm")) {
                    return "video/webm";
                }
                break;
            case 3645340:
                if (lowerCase.equals("webp")) {
                    return "image/webp";
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DownloadService.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0006\u0010\u000f\u001a\u00020\nJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Ltool/wu/heng/service/DownloadService$MediaStoreTarget;", "Ltool/wu/heng/service/DownloadService$SaveTarget;", "uri", "Landroid/net/Uri;", "resolver", "Landroid/content/ContentResolver;", "fileName", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Landroid/net/Uri;Landroid/content/ContentResolver;Ljava/lang/String;)V", "delete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "displayName", "existingSize", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "fileSize", "markCompleted", "openOutputStream", "Ljava/io/OutputStream;", "appendOffset", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class MediaStoreTarget implements tool.wu.heng.service.DownloadService.SaveTarget {
        private final java.lang.String fileName;
        private final android.content.ContentResolver resolver;
        private final android.net.Uri uri;

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public long existingSize() {
            return 0L;
        }

        public MediaStoreTarget(android.net.Uri uri, android.content.ContentResolver resolver, java.lang.String fileName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolver, "resolver");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fileName, "fileName");
            this.uri = uri;
            this.resolver = resolver;
            this.fileName = fileName;
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public java.io.OutputStream openOutputStream(long appendOffset) {
            android.net.Uri uri = this.uri;
            if (uri == null) {
                return null;
            }
            try {
                return this.resolver.openOutputStream(uri, "rwt");
            } catch (java.lang.Exception e) {
                timber.log.Timber.INSTANCE.e(e, "打开 MediaStore 输出流失败", new java.lang.Object[0]);
                return null;
            }
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public void delete() {
            android.net.Uri uri = this.uri;
            if (uri != null) {
                try {
                    this.resolver.delete(uri, null, null);
                } catch (java.lang.Exception e) {
                    timber.log.Timber.INSTANCE.w(e, "删除 MediaStore 条目失败", new java.lang.Object[0]);
                }
            }
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public long fileSize() {
            android.database.Cursor query;
            int columnIndex;
            android.net.Uri uri = this.uri;
            if (uri != null && (query = this.resolver.query(uri, new java.lang.String[]{"_size"}, null, null, null)) != null) {
                android.database.Cursor cursor = query;
                try {
                    android.database.Cursor cursor2 = cursor;
                    if (cursor2.moveToFirst() && (columnIndex = cursor2.getColumnIndex("_size")) >= 0) {
                        long j = cursor2.getLong(columnIndex);
                        kotlin.io.CloseableKt.closeFinally(cursor, null);
                        return j;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    kotlin.io.CloseableKt.closeFinally(cursor, null);
                } finally {
                }
            }
            return 0L;
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public java.lang.String displayName() {
            return android.os.Environment.DIRECTORY_DOWNLOADS + "/无痕/" + this.fileName;
        }

        public final void markCompleted() {
            if (this.uri != null && android.os.Build.VERSION.SDK_INT >= 30) {
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put("is_pending", (java.lang.Integer) 0);
                try {
                    this.resolver.update(this.uri, contentValues, null, null);
                } catch (java.lang.Exception e) {
                    timber.log.Timber.INSTANCE.w(e, "更新 IS_PENDING 失败", new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DownloadService.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Ltool/wu/heng/service/DownloadService$FileTarget;", "Ltool/wu/heng/service/DownloadService$SaveTarget;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "delete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "displayName", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "existingSize", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "fileSize", "openOutputStream", "Ljava/io/OutputStream;", "appendOffset", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class FileTarget implements tool.wu.heng.service.DownloadService.SaveTarget {
        private final java.io.File file;

        public FileTarget(java.io.File file) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public long existingSize() {
            if (this.file.exists()) {
                return this.file.length();
            }
            return 0L;
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public java.io.OutputStream openOutputStream(long appendOffset) {
            java.io.FileOutputStream fileOutputStream;
            try {
                if (appendOffset > 0) {
                    final java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(this.file, "rw");
                    randomAccessFile.seek(appendOffset);
                    fileOutputStream = new java.io.OutputStream() { // from class: tool.wu.heng.service.DownloadService$FileTarget$openOutputStream$1
                        @Override // java.io.OutputStream
                        public void write(int b) {
                            randomAccessFile.write(b);
                        }

                        @Override // java.io.OutputStream
                        public void write(byte[] b, int off, int len) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
                            randomAccessFile.write(b, off, len);
                        }

                        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
                        public void close() {
                            randomAccessFile.close();
                        }
                    };
                } else {
                    fileOutputStream = new java.io.FileOutputStream(this.file);
                }
                return fileOutputStream;
            } catch (java.lang.Exception e) {
                timber.log.Timber.INSTANCE.e(e, "打开文件输出流失败: %s", this.file.getAbsolutePath());
                return null;
            }
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public void delete() {
            this.file.delete();
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public long fileSize() {
            if (this.file.exists()) {
                return this.file.length();
            }
            return 0L;
        }

        @Override // tool.wu.heng.service.DownloadService.SaveTarget
        public java.lang.String displayName() {
            java.lang.String absolutePath = this.file.getAbsolutePath();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            return absolutePath;
        }
    }

    private final void createNotificationChannel() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel(CHANNEL_ID, "下载任务", 2);
            notificationChannel.setDescription("显示视频下载进度");
            notificationChannel.setShowBadge(false);
            ((android.app.NotificationManager) getSystemService(android.app.NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
    }

    static /* synthetic */ android.app.Notification buildNotification$default(tool.wu.heng.service.DownloadService downloadService, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        return downloadService.buildNotification(str, i, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r7, (java.lang.CharSequence) "已重试", false, 2, (java.lang.Object) null) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final android.app.Notification buildNotification(java.lang.String title, int progress, java.lang.String statusText) {
        java.lang.String str = "无痕·正在下载";
        boolean z = false;
        if (statusText != null) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(statusText, "下载完成")) {
                str = "无痕·下载完成";
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(statusText, "下载失败")) {
                    java.lang.String str2 = statusText;
                    if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "已暂停", false, 2, (java.lang.Object) null)) {
                        str = "无痕·已暂停";
                    }
                }
                str = "无痕·下载失败";
            }
        }
        androidx.core.app.NotificationCompat.Builder contentTitle = new androidx.core.app.NotificationCompat.Builder(this, CHANNEL_ID).setContentTitle(str);
        if (statusText != null) {
            title = statusText;
        }
        androidx.core.app.NotificationCompat.Builder ongoing = contentTitle.setContentText(title).setSmallIcon(tool.wu.heng.R.drawable.ic_notification).setOnlyAlertOnce(true).setOngoing(true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ongoing, "setOngoing(...)");
        if (kotlin.jvm.internal.Intrinsics.areEqual(statusText, "下载完成") || kotlin.jvm.internal.Intrinsics.areEqual(statusText, "下载失败") || (statusText != null && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) statusText, (java.lang.CharSequence) "已暂停", false, 2, (java.lang.Object) null))) {
            ongoing.setOngoing(false);
        } else {
            if (progress == 0 && statusText == null) {
                z = true;
            }
            ongoing.setProgress(100, progress, z);
        }
        android.app.Notification build = ongoing.build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    static /* synthetic */ void updateNotification$default(tool.wu.heng.service.DownloadService downloadService, java.lang.String str, int i, java.lang.String str2, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        downloadService.updateNotification(str, i, str2);
    }

    private final void updateNotification(java.lang.String title, int progress, java.lang.String statusText) {
        ((android.app.NotificationManager) getSystemService(android.app.NotificationManager.class)).notify(1001, buildNotification(title, progress, statusText));
    }
}
