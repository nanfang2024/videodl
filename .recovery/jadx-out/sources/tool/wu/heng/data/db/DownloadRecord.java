package tool.wu.heng.data.db;

/* compiled from: DownloadRecord.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000eHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J¬\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020>HÖ\u0001J\u0006\u0010?\u001a\u00020\u0003J\u0006\u0010@\u001a\u00020\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019¨\u0006B"}, d2 = {"Ltool/wu/heng/data/db/DownloadRecord;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "id", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "title", "thumbnailUrl", "downloadUrl", "savePath", "ext", "source", "status", "progress", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "downloadedBytes", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "totalBytes", "speedBps", "errorMessage", "createdAt", "completedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJJJLjava/lang/String;JLjava/lang/Long;)V", "getCompletedAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCreatedAt", "()J", "getDownloadUrl", "()Ljava/lang/String;", "getDownloadedBytes", "getErrorMessage", "getExt", "getId", "getProgress", "()F", "getSavePath", "getSource", "getSpeedBps", "getStatus", "getThumbnailUrl", "getTitle", "getTotalBytes", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJJJLjava/lang/String;JLjava/lang/Long;)Ltool/wu/heng/data/db/DownloadRecord;", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "humanReadableSize", "humanReadableSpeed", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* data */ class DownloadRecord {
    public static final int $stable = 0;
    private final java.lang.Long completedAt;
    private final long createdAt;
    private final java.lang.String downloadUrl;
    private final long downloadedBytes;
    private final java.lang.String errorMessage;
    private final java.lang.String ext;
    private final java.lang.String id;
    private final float progress;
    private final java.lang.String savePath;
    private final java.lang.String source;
    private final long speedBps;
    private final java.lang.String status;
    private final java.lang.String thumbnailUrl;
    private final java.lang.String title;
    private final long totalBytes;

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    /* renamed from: component11, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* renamed from: component12, reason: from getter */
    public final long getSpeedBps() {
        return this.speedBps;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component14, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component15, reason: from getter */
    public final java.lang.Long getCompletedAt() {
        return this.completedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDownloadUrl() {
        return this.downloadUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSavePath() {
        return this.savePath;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getExt() {
        return this.ext;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getSource() {
        return this.source;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    public final tool.wu.heng.data.db.DownloadRecord copy(java.lang.String id, java.lang.String title, java.lang.String thumbnailUrl, java.lang.String downloadUrl, java.lang.String savePath, java.lang.String ext, java.lang.String source, java.lang.String status, float progress, long downloadedBytes, long totalBytes, long speedBps, java.lang.String errorMessage, long createdAt, java.lang.Long completedAt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ext, "ext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        return new tool.wu.heng.data.db.DownloadRecord(id, title, thumbnailUrl, downloadUrl, savePath, ext, source, status, progress, downloadedBytes, totalBytes, speedBps, errorMessage, createdAt, completedAt);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tool.wu.heng.data.db.DownloadRecord)) {
            return false;
        }
        tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, downloadRecord.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, downloadRecord.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.thumbnailUrl, downloadRecord.thumbnailUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.downloadUrl, downloadRecord.downloadUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.savePath, downloadRecord.savePath) && kotlin.jvm.internal.Intrinsics.areEqual(this.ext, downloadRecord.ext) && kotlin.jvm.internal.Intrinsics.areEqual(this.source, downloadRecord.source) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, downloadRecord.status) && java.lang.Float.compare(this.progress, downloadRecord.progress) == 0 && this.downloadedBytes == downloadRecord.downloadedBytes && this.totalBytes == downloadRecord.totalBytes && this.speedBps == downloadRecord.speedBps && kotlin.jvm.internal.Intrinsics.areEqual(this.errorMessage, downloadRecord.errorMessage) && this.createdAt == downloadRecord.createdAt && kotlin.jvm.internal.Intrinsics.areEqual(this.completedAt, downloadRecord.completedAt);
    }

    public final java.lang.Long getCompletedAt() {
        return this.completedAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final java.lang.String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public final java.lang.String getErrorMessage() {
        return this.errorMessage;
    }

    public final java.lang.String getExt() {
        return this.ext;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final java.lang.String getSavePath() {
        return this.savePath;
    }

    public final java.lang.String getSource() {
        return this.source;
    }

    public final long getSpeedBps() {
        return this.speedBps;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public int hashCode() {
        int hashCode = ((this.id.hashCode() * 31) + this.title.hashCode()) * 31;
        java.lang.String str = this.thumbnailUrl;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.downloadUrl.hashCode()) * 31;
        java.lang.String str2 = this.savePath;
        int hashCode3 = (((((((((((((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.ext.hashCode()) * 31) + this.source.hashCode()) * 31) + this.status.hashCode()) * 31) + java.lang.Float.hashCode(this.progress)) * 31) + java.lang.Long.hashCode(this.downloadedBytes)) * 31) + java.lang.Long.hashCode(this.totalBytes)) * 31) + java.lang.Long.hashCode(this.speedBps)) * 31;
        java.lang.String str3 = this.errorMessage;
        int hashCode4 = (((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Long.hashCode(this.createdAt)) * 31;
        java.lang.Long l = this.completedAt;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DownloadRecord(id=" + this.id + ", title=" + this.title + ", thumbnailUrl=" + this.thumbnailUrl + ", downloadUrl=" + this.downloadUrl + ", savePath=" + this.savePath + ", ext=" + this.ext + ", source=" + this.source + ", status=" + this.status + ", progress=" + this.progress + ", downloadedBytes=" + this.downloadedBytes + ", totalBytes=" + this.totalBytes + ", speedBps=" + this.speedBps + ", errorMessage=" + this.errorMessage + ", createdAt=" + this.createdAt + ", completedAt=" + this.completedAt + ")";
    }

    public DownloadRecord(java.lang.String id, java.lang.String title, java.lang.String str, java.lang.String downloadUrl, java.lang.String str2, java.lang.String ext, java.lang.String source, java.lang.String status, float f, long j, long j2, long j3, java.lang.String str3, long j4, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "id");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "title");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ext, "ext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.title = title;
        this.thumbnailUrl = str;
        this.downloadUrl = downloadUrl;
        this.savePath = str2;
        this.ext = ext;
        this.source = source;
        this.status = status;
        this.progress = f;
        this.downloadedBytes = j;
        this.totalBytes = j2;
        this.speedBps = j3;
        this.errorMessage = str3;
        this.createdAt = j4;
        this.completedAt = l;
    }

    public /* synthetic */ DownloadRecord(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, float f, long j, long j2, long j3, java.lang.String str9, long j4, java.lang.Long l, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? "mp4" : str6, (i & 64) != 0 ? okhttp3.HttpUrl.FRAGMENT_ENCODE_SET : str7, (i & 128) != 0 ? "PENDING" : str8, (i & 256) != 0 ? 0.0f : f, (i & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? 0L : j, (i & 1024) != 0 ? 0L : j2, (i & 2048) != 0 ? 0L : j3, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? java.lang.System.currentTimeMillis() : j4, (i & okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : l);
    }

    public final java.lang.String humanReadableSpeed() {
        long j = this.speedBps;
        if (j <= 0) {
            return "--";
        }
        if (j < okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return j + " B/s";
        }
        if (j < 1048576) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%.1f KB/s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) this.speedBps) / 1024.0f)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format2 = java.lang.String.format("%.1f MB/s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) this.speedBps) / 1024.0f) / 1024.0f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    public final java.lang.String humanReadableSize() {
        long j = this.totalBytes;
        if (j <= 0) {
            j = this.downloadedBytes;
        }
        if (j <= 0) {
            return "未知";
        }
        if (j < okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return j + " B";
        }
        if (j < 1048576) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%.1f KB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(((float) j) / 1024.0f)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format2 = java.lang.String.format("%.1f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) j) / 1024.0f) / 1024.0f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }
}
