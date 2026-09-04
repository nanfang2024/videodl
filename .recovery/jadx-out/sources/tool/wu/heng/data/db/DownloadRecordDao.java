package tool.wu.heng.data.db;

/* compiled from: DownloadRecordDao.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0003H§@¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH§@¢\u0006\u0002\u0010\bJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\fJ\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000e0\u0012H'J\u0016\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H§@¢\u0006\u0002\u0010\u0006J\u001e\u0010\u0014\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH§@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Ltool/wu/heng/data/db/DownloadRecordDao;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "delete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "record", "Ltool/wu/heng/data/db/DownloadRecord;", "(Ltool/wu/heng/data/db/DownloadRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAll", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteById", "id", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveDownloads", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getById", "insert", "observeAll", "Lkotlinx/coroutines/flow/Flow;", "update", "updateStatus", "status", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public interface DownloadRecordDao {
    java.lang.Object delete(tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteAll(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object deleteById(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getActiveDownloads(kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.db.DownloadRecord>> continuation);

    java.lang.Object getById(java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.data.db.DownloadRecord> continuation);

    java.lang.Object insert(tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> observeAll();

    java.lang.Object update(tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object updateStatus(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
