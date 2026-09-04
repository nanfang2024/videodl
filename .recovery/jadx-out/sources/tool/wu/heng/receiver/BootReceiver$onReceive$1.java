package tool.wu.heng.receiver;

/* compiled from: BootReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.receiver.BootReceiver$onReceive$1", f = "BootReceiver.kt", i = {0, 1, 1}, l = {35, 42}, m = "invokeSuspend", n = {"dao", "dao", "task"}, s = {"L$0", "L$0", "L$2"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class BootReceiver$onReceive$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context $context;
    final /* synthetic */ android.content.BroadcastReceiver.PendingResult $pendingResult;
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BootReceiver$onReceive$1(android.content.Context context, android.content.BroadcastReceiver.PendingResult pendingResult, kotlin.coroutines.Continuation<? super tool.wu.heng.receiver.BootReceiver$onReceive$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$pendingResult = pendingResult;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new tool.wu.heng.receiver.BootReceiver$onReceive$1(this.$context, this.$pendingResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((tool.wu.heng.receiver.BootReceiver$onReceive$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac A[Catch: all -> 0x00b8, Exception -> 0x00bd, TryCatch #5 {Exception -> 0x00bd, all -> 0x00b8, blocks: (B:10:0x009a, B:12:0x00ac, B:13:0x006a, B:15:0x0070, B:17:0x0082, B:24:0x00b2), top: B:9:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0070 A[Catch: all -> 0x00b8, Exception -> 0x00bd, TryCatch #5 {Exception -> 0x00bd, all -> 0x00b8, blocks: (B:10:0x009a, B:12:0x00ac, B:13:0x006a, B:15:0x0070, B:17:0x0082, B:24:0x00b2), top: B:9:0x009a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b2 A[Catch: all -> 0x00b8, Exception -> 0x00bd, TRY_LEAVE, TryCatch #5 {Exception -> 0x00bd, all -> 0x00b8, blocks: (B:10:0x009a, B:12:0x00ac, B:13:0x006a, B:15:0x0070, B:17:0x0082, B:24:0x00b2), top: B:9:0x009a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0080 -> B:9:0x009a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0097 -> B:9:0x009a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        tool.wu.heng.receiver.BootReceiver$onReceive$1 bootReceiver$onReceive$1;
        android.content.BroadcastReceiver.PendingResult pendingResult;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao;
        java.util.Iterator it;
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao2;
        tool.wu.heng.receiver.BootReceiver$onReceive$1 bootReceiver$onReceive$12;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
        } catch (java.lang.Exception e) {
            e = e;
            bootReceiver$onReceive$1 = this;
        } catch (java.lang.Throwable th) {
            th = th;
            bootReceiver$onReceive$1 = this;
        }
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            downloadRecordDao = tool.wu.heng.data.db.AppDatabase.INSTANCE.getInstance(this.$context).downloadRecordDao();
            this.L$0 = downloadRecordDao;
            this.label = 1;
            obj = downloadRecordDao.getActiveDownloads(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            downloadRecordDao = (tool.wu.heng.data.db.DownloadRecordDao) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) this.L$2;
            it = (java.util.Iterator) this.L$1;
            downloadRecordDao2 = (tool.wu.heng.data.db.DownloadRecordDao) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            bootReceiver$onReceive$12 = this;
            try {
                android.content.Intent createIntent = tool.wu.heng.service.DownloadService.INSTANCE.createIntent(bootReceiver$onReceive$12.$context, downloadRecord.getId());
                if (android.os.Build.VERSION.SDK_INT < 26) {
                    bootReceiver$onReceive$12.$context.startForegroundService(createIntent);
                } else {
                    bootReceiver$onReceive$12.$context.startService(createIntent);
                }
            } catch (java.lang.Exception e2) {
                bootReceiver$onReceive$1 = bootReceiver$onReceive$12;
                e = e2;
                try {
                    timber.log.Timber.INSTANCE.e(e, "开机恢复下载任务失败", new java.lang.Object[0]);
                    pendingResult = bootReceiver$onReceive$1.$pendingResult;
                    pendingResult.finish();
                    return kotlin.Unit.INSTANCE;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bootReceiver$onReceive$1.$pendingResult.finish();
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                bootReceiver$onReceive$1 = bootReceiver$onReceive$12;
                th = th3;
                bootReceiver$onReceive$1.$pendingResult.finish();
                throw th;
            }
            if (it.hasNext()) {
                downloadRecord = (tool.wu.heng.data.db.DownloadRecord) it.next();
                if (kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord.getStatus(), "DOWNLOADING")) {
                    bootReceiver$onReceive$12.L$0 = downloadRecordDao2;
                    bootReceiver$onReceive$12.L$1 = it;
                    bootReceiver$onReceive$12.L$2 = downloadRecord;
                    bootReceiver$onReceive$12.label = 2;
                    if (downloadRecordDao2.updateStatus(downloadRecord.getId(), "PENDING", bootReceiver$onReceive$12) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                android.content.Intent createIntent2 = tool.wu.heng.service.DownloadService.INSTANCE.createIntent(bootReceiver$onReceive$12.$context, downloadRecord.getId());
                if (android.os.Build.VERSION.SDK_INT < 26) {
                }
                if (it.hasNext()) {
                    pendingResult = bootReceiver$onReceive$12.$pendingResult;
                    pendingResult.finish();
                    return kotlin.Unit.INSTANCE;
                }
            }
        }
        java.util.List list = (java.util.List) obj;
        timber.log.Timber.INSTANCE.i("开机恢复：发现 %d 个未完成任务", kotlin.coroutines.jvm.internal.Boxing.boxInt(list.size()));
        it = list.iterator();
        downloadRecordDao2 = downloadRecordDao;
        bootReceiver$onReceive$12 = this;
        if (it.hasNext()) {
        }
    }
}
