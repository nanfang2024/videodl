package okhttp3.internal.io;

/* compiled from: FileSystem.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/io/FileSystem;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "deleteContents", "directory", "exists", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "rename", "from", "to", "sink", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "source", "Lokio/Source;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public interface FileSystem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.io.FileSystem.Companion INSTANCE = okhttp3.internal.io.FileSystem.Companion.$$INSTANCE;
    public static final okhttp3.internal.io.FileSystem SYSTEM = new okhttp3.internal.io.FileSystem.Companion.SystemFileSystem();

    okio.Sink appendingSink(java.io.File file) throws java.io.FileNotFoundException;

    void delete(java.io.File file) throws java.io.IOException;

    void deleteContents(java.io.File directory) throws java.io.IOException;

    boolean exists(java.io.File file);

    void rename(java.io.File from, java.io.File to) throws java.io.IOException;

    okio.Sink sink(java.io.File file) throws java.io.FileNotFoundException;

    long size(java.io.File file);

    okio.Source source(java.io.File file) throws java.io.FileNotFoundException;

    /* compiled from: FileSystem.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        static final /* synthetic */ okhttp3.internal.io.FileSystem.Companion $$INSTANCE = new okhttp3.internal.io.FileSystem.Companion();

        private Companion() {
        }

        /* compiled from: FileSystem.kt */
        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "delete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "deleteContents", "directory", "exists", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "rename", "from", "to", "sink", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "source", "Lokio/Source;", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /workspace/.recovery/dex/classes3.dex */
        private static final class SystemFileSystem implements okhttp3.internal.io.FileSystem {
            public java.lang.String toString() {
                return "FileSystem.SYSTEM";
            }

            @Override // okhttp3.internal.io.FileSystem
            public okio.Source source(java.io.File file) throws java.io.FileNotFoundException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                return okio.Okio.source(file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public okio.Sink sink(java.io.File file) throws java.io.FileNotFoundException {
                okio.Sink sink$default;
                okio.Sink sink$default2;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                try {
                    sink$default2 = okio.Okio__JvmOkioKt.sink$default(file, false, 1, null);
                    return sink$default2;
                } catch (java.io.FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    sink$default = okio.Okio__JvmOkioKt.sink$default(file, false, 1, null);
                    return sink$default;
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public okio.Sink appendingSink(java.io.File file) throws java.io.FileNotFoundException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                try {
                    return okio.Okio.appendingSink(file);
                } catch (java.io.FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return okio.Okio.appendingSink(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(java.io.File file) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new java.io.IOException("failed to delete " + file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(java.io.File file) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(java.io.File from, java.io.File to) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "from");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(to, "to");
                delete(to);
                if (!from.renameTo(to)) {
                    throw new java.io.IOException("failed to rename " + from + " to " + to);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(java.io.File directory) throws java.io.IOException {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(directory, "directory");
                java.io.File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new java.io.IOException("not a readable directory: " + directory);
                }
                for (java.io.File file : listFiles) {
                    if (file.isDirectory()) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new java.io.IOException("failed to delete " + file);
                    }
                }
            }
        }
    }
}
