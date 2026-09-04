package tool.wu.heng.data.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoInfo.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ltool/wu/heng/data/model/DownloadStatus;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "PENDING", "DOWNLOADING", "PAUSED", "COMPLETED", "FAILED", "CANCELLED", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DownloadStatus {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ tool.wu.heng.data.model.DownloadStatus[] $VALUES;
    public static final tool.wu.heng.data.model.DownloadStatus PENDING = new tool.wu.heng.data.model.DownloadStatus("PENDING", 0);
    public static final tool.wu.heng.data.model.DownloadStatus DOWNLOADING = new tool.wu.heng.data.model.DownloadStatus("DOWNLOADING", 1);
    public static final tool.wu.heng.data.model.DownloadStatus PAUSED = new tool.wu.heng.data.model.DownloadStatus("PAUSED", 2);
    public static final tool.wu.heng.data.model.DownloadStatus COMPLETED = new tool.wu.heng.data.model.DownloadStatus("COMPLETED", 3);
    public static final tool.wu.heng.data.model.DownloadStatus FAILED = new tool.wu.heng.data.model.DownloadStatus("FAILED", 4);
    public static final tool.wu.heng.data.model.DownloadStatus CANCELLED = new tool.wu.heng.data.model.DownloadStatus("CANCELLED", 5);

    private static final /* synthetic */ tool.wu.heng.data.model.DownloadStatus[] $values() {
        return new tool.wu.heng.data.model.DownloadStatus[]{PENDING, DOWNLOADING, PAUSED, COMPLETED, FAILED, CANCELLED};
    }

    public static kotlin.enums.EnumEntries<tool.wu.heng.data.model.DownloadStatus> getEntries() {
        return $ENTRIES;
    }

    public static tool.wu.heng.data.model.DownloadStatus valueOf(java.lang.String str) {
        return (tool.wu.heng.data.model.DownloadStatus) java.lang.Enum.valueOf(tool.wu.heng.data.model.DownloadStatus.class, str);
    }

    public static tool.wu.heng.data.model.DownloadStatus[] values() {
        return (tool.wu.heng.data.model.DownloadStatus[]) $VALUES.clone();
    }

    private DownloadStatus(java.lang.String str, int i) {
    }

    static {
        tool.wu.heng.data.model.DownloadStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }
}
