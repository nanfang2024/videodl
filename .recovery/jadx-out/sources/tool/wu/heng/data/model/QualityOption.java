package tool.wu.heng.data.model;

/* compiled from: VideoInfo.kt */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\r\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0002\u0010\u001dJ\t\u0010\u001e\u001a\u00020\u001cHÖ\u0001J\u0006\u0010\u001f\u001a\u00020\u0003J\u0006\u0010 \u001a\u00020\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\""}, d2 = {"Ltool/wu/heng/data/model/QualityOption;", "Ljava/io/Serializable;", "formatId", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "resolution", "ext", "filesize", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "getExt", "()Ljava/lang/String;", "getFilesize", "()J", "getFormatId", "getResolution", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getHeight", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/Integer;", "hashCode", "humanReadableFilesize", "qualityLabel", "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* data */ class QualityOption implements java.io.Serializable {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("ext")
    private final java.lang.String ext;

    @com.google.gson.annotations.SerializedName("filesize")
    private final long filesize;

    @com.google.gson.annotations.SerializedName("format_id")
    private final java.lang.String formatId;

    @com.google.gson.annotations.SerializedName("resolution")
    private final java.lang.String resolution;

    @com.google.gson.annotations.SerializedName("url")
    private final java.lang.String url;

    public QualityOption() {
        this(null, null, null, 0L, null, 31, null);
    }

    public static /* synthetic */ tool.wu.heng.data.model.QualityOption copy$default(tool.wu.heng.data.model.QualityOption qualityOption, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = qualityOption.formatId;
        }
        if ((i & 2) != 0) {
            str2 = qualityOption.resolution;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = qualityOption.ext;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            j = qualityOption.filesize;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = qualityOption.url;
        }
        return qualityOption.copy(str, str5, str6, j2, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFormatId() {
        return this.formatId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getResolution() {
        return this.resolution;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getExt() {
        return this.ext;
    }

    /* renamed from: component4, reason: from getter */
    public final long getFilesize() {
        return this.filesize;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    public final tool.wu.heng.data.model.QualityOption copy(java.lang.String formatId, java.lang.String resolution, java.lang.String ext, long filesize, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatId, "formatId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ext, "ext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new tool.wu.heng.data.model.QualityOption(formatId, resolution, ext, filesize, url);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tool.wu.heng.data.model.QualityOption)) {
            return false;
        }
        tool.wu.heng.data.model.QualityOption qualityOption = (tool.wu.heng.data.model.QualityOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.formatId, qualityOption.formatId) && kotlin.jvm.internal.Intrinsics.areEqual(this.resolution, qualityOption.resolution) && kotlin.jvm.internal.Intrinsics.areEqual(this.ext, qualityOption.ext) && this.filesize == qualityOption.filesize && kotlin.jvm.internal.Intrinsics.areEqual(this.url, qualityOption.url);
    }

    public final java.lang.String getExt() {
        return this.ext;
    }

    public final long getFilesize() {
        return this.filesize;
    }

    public final java.lang.String getFormatId() {
        return this.formatId;
    }

    public final java.lang.String getResolution() {
        return this.resolution;
    }

    public final java.lang.String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.formatId.hashCode() * 31;
        java.lang.String str = this.resolution;
        return ((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.ext.hashCode()) * 31) + java.lang.Long.hashCode(this.filesize)) * 31) + this.url.hashCode();
    }

    public java.lang.String toString() {
        return "QualityOption(formatId=" + this.formatId + ", resolution=" + this.resolution + ", ext=" + this.ext + ", filesize=" + this.filesize + ", url=" + this.url + ")";
    }

    public QualityOption(java.lang.String formatId, java.lang.String str, java.lang.String ext, long j, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatId, "formatId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ext, "ext");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.formatId = formatId;
        this.resolution = str;
        this.ext = ext;
        this.filesize = j;
        this.url = url;
    }

    public /* synthetic */ QualityOption(java.lang.String str, java.lang.String str2, java.lang.String str3, long j, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? okhttp3.HttpUrl.FRAGMENT_ENCODE_SET : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "mp4" : str3, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? okhttp3.HttpUrl.FRAGMENT_ENCODE_SET : str4);
    }

    public final java.lang.Integer getHeight() {
        java.util.List split$default;
        java.lang.String str;
        java.lang.String str2 = this.resolution;
        if (str2 == null || (split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str2, new java.lang.String[]{"x"}, false, 0, 6, (java.lang.Object) null)) == null || (str = (java.lang.String) kotlin.collections.CollectionsKt.getOrNull(split$default, 1)) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toIntOrNull(str);
    }

    public final java.lang.String qualityLabel() {
        java.lang.Integer height = getHeight();
        if (height != null) {
            return height + "P";
        }
        java.lang.String str = this.resolution;
        return str == null ? "未知" : str;
    }

    public final java.lang.String humanReadableFilesize() {
        long j = this.filesize;
        if (j <= 0) {
            return "未知";
        }
        if (j < 1048576) {
            return (j / 1024) + " KB";
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%.1f MB", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) this.filesize) / 1024.0f) / 1024.0f)}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
