package okhttp3.internal.http2;

/* compiled from: Hpack.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0018\u0019B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005J\u0014\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/http2/Hpack;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "NAME_TO_FIRST_INDEX", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/ByteString;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "PREFIX_4_BITS", "PREFIX_5_BITS", "PREFIX_6_BITS", "PREFIX_7_BITS", "SETTINGS_HEADER_TABLE_SIZE", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "STATIC_HEADER_TABLE", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "checkLowercase", "name", "nameToFirstIndex", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class Hpack {
    public static final okhttp3.internal.http2.Hpack INSTANCE;
    private static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE;

    public final java.util.Map<okio.ByteString, java.lang.Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final okhttp3.internal.http2.Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }

    private Hpack() {
    }

    static {
        okhttp3.internal.http2.Hpack hpack = new okhttp3.internal.http2.Hpack();
        INSTANCE = hpack;
        STATIC_HEADER_TABLE = new okhttp3.internal.http2.Header[]{new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_AUTHORITY, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, "GET"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_METHOD, "POST"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_PATH, "/index.html"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "http"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.TARGET_SCHEME, "https"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "200"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "204"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "206"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "304"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "400"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "404"), new okhttp3.internal.http2.Header(okhttp3.internal.http2.Header.RESPONSE_STATUS, "500"), new okhttp3.internal.http2.Header("accept-charset", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("accept-encoding", "gzip, deflate"), new okhttp3.internal.http2.Header("accept-language", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("accept-ranges", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("accept", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("access-control-allow-origin", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("age", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("allow", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("authorization", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("cache-control", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-disposition", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-encoding", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-language", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-length", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-location", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-range", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("content-type", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("cookie", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("date", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("etag", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("expect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("expires", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("from", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("host", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("if-match", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("if-modified-since", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("if-none-match", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("if-range", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("if-unmodified-since", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("last-modified", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("link", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("location", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("max-forwards", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("proxy-authenticate", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("proxy-authorization", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("range", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("referer", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("refresh", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("retry-after", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("server", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("set-cookie", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("strict-transport-security", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("transfer-encoding", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("user-agent", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("vary", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("via", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET), new okhttp3.internal.http2.Header("www-authenticate", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET)};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    /* compiled from: Hpack.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001aJ\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010!\u001a\u00020\u0005H\u0002J\u0006\u0010\"\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u0013J\u0010\u0010$\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0016\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005J\u0010\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020\u0005H\u0002J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "source", "Lokio/Source;", "headerTableSizeSetting", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "maxDynamicTableByteCount", "(Lokio/Source;II)V", "dynamicTable", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "headerCount", "headerList", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "nextHeaderIndex", "Lokio/BufferedSource;", "adjustDynamicTableByteCount", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "clearDynamicTable", "dynamicTableIndex", "index", "evictToRecoverBytes", "bytesToRecover", "getAndResetHeaderList", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getName", "Lokio/ByteString;", "insertIntoDynamicTable", "entry", "isStaticHeader", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "readByte", "readByteString", "readHeaders", "readIndexedHeader", "readInt", "firstByte", "prefixMask", "readLiteralHeaderWithIncrementalIndexingIndexedName", "nameIndex", "readLiteralHeaderWithIncrementalIndexingNewName", "readLiteralHeaderWithoutIndexingIndexedName", "readLiteralHeaderWithoutIndexingNewName", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Reader {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.BufferedSource source;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Reader(okio.Source source, int i) {
            this(source, i, 0, 4, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        }

        private final int dynamicTableIndex(int index) {
            return this.nextHeaderIndex + 1 + index;
        }

        /* renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getMaxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public Reader(okio.Source source, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new java.util.ArrayList();
            this.source = okio.Okio.buffer(source);
            this.dynamicTable = new okhttp3.internal.http2.Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Reader(okio.Source source, int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i, (i3 & 4) != 0 ? i : i2);
        }

        public final java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
            java.util.List<okhttp3.internal.http2.Header> list = kotlin.collections.CollectionsKt.toList(this.headerList);
            this.headerList.clear();
            return list;
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            kotlin.collections.ArraysKt.fill$default(this.dynamicTable, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.Header header = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    bytesToRecover -= header.hpackSize;
                    this.dynamicTableByteCount -= header.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                java.lang.System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        public final void readHeaders() throws java.io.IOException {
            while (!this.source.exhausted()) {
                int and = okhttp3.internal.Util.and(this.source.readByte(), 255);
                if (and == 128) {
                    throw new java.io.IOException("index == 0");
                }
                if ((and & 128) == 128) {
                    readIndexedHeader(readInt(and, 127) - 1);
                } else if (and == 64) {
                    readLiteralHeaderWithIncrementalIndexingNewName();
                } else if ((and & 64) == 64) {
                    readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, okhttp3.internal.http2.Hpack.PREFIX_6_BITS) - 1);
                } else if ((and & 32) == 32) {
                    int readInt = readInt(and, okhttp3.internal.http2.Hpack.PREFIX_5_BITS);
                    this.maxDynamicTableByteCount = readInt;
                    if (readInt < 0 || readInt > this.headerTableSizeSetting) {
                        throw new java.io.IOException("Invalid dynamic table size update " + this.maxDynamicTableByteCount);
                    }
                    adjustDynamicTableByteCount();
                } else if (and == 16 || and == 0) {
                    readLiteralHeaderWithoutIndexingNewName();
                } else {
                    readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                }
            }
        }

        private final void readIndexedHeader(int index) throws java.io.IOException {
            if (isStaticHeader(index)) {
                this.headerList.add(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(index - okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    java.util.List<okhttp3.internal.http2.Header> list = this.headerList;
                    okhttp3.internal.http2.Header header = headerArr[dynamicTableIndex];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    list.add(header);
                    return;
                }
            }
            throw new java.io.IOException("Header index too large " + (index + 1));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int index) throws java.io.IOException {
            this.headerList.add(new okhttp3.internal.http2.Header(getName(index), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
            this.headerList.add(new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int nameIndex) throws java.io.IOException {
            insertIntoDynamicTable(-1, new okhttp3.internal.http2.Header(getName(nameIndex), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
            insertIntoDynamicTable(-1, new okhttp3.internal.http2.Header(okhttp3.internal.http2.Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final okio.ByteString getName(int index) throws java.io.IOException {
            if (isStaticHeader(index)) {
                return okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[index].name;
            }
            int dynamicTableIndex = dynamicTableIndex(index - okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    okhttp3.internal.http2.Header header = headerArr[dynamicTableIndex];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            throw new java.io.IOException("Header index too large " + (index + 1));
        }

        private final boolean isStaticHeader(int index) {
            return index >= 0 && index <= okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1;
        }

        private final void insertIntoDynamicTable(int index, okhttp3.internal.http2.Header entry) {
            this.headerList.add(entry);
            int i = entry.hpackSize;
            if (index != -1) {
                okhttp3.internal.http2.Header header = this.dynamicTable[dynamicTableIndex(index)];
                kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                i -= header.hpackSize;
            }
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            if (index == -1) {
                int i3 = this.headerCount + 1;
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                if (i3 > headerArr.length) {
                    okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                    java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i4 = this.nextHeaderIndex;
                this.nextHeaderIndex = i4 - 1;
                this.dynamicTable[i4] = entry;
                this.headerCount++;
            } else {
                this.dynamicTable[index + dynamicTableIndex(index) + evictToRecoverBytes] = entry;
            }
            this.dynamicTableByteCount += i;
        }

        private final int readByte() throws java.io.IOException {
            return okhttp3.internal.Util.and(this.source.readByte(), 255);
        }

        public final int readInt(int firstByte, int prefixMask) throws java.io.IOException {
            int i = firstByte & prefixMask;
            if (i < prefixMask) {
                return i;
            }
            int i2 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) == 0) {
                    return prefixMask + (readByte << i2);
                }
                prefixMask += (readByte & 127) << i2;
                i2 += 7;
            }
        }

        public final okio.ByteString readByteString() throws java.io.IOException {
            int readByte = readByte();
            boolean z = (readByte & 128) == 128;
            long readInt = readInt(readByte, 127);
            if (z) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.INSTANCE.decode(this.source, readInt, buffer);
                return buffer.readByteString();
            }
            return this.source.readByteString(readInt);
        }
    }

    private final java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
        okhttp3.internal.http2.Header[] headerArr = STATIC_HEADER_TABLE;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i = 0; i < length; i++) {
            okhttp3.internal.http2.Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, java.lang.Integer.valueOf(i));
            }
        }
        java.util.Map<okio.ByteString, java.lang.Integer> unmodifiableMap = java.util.Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        return unmodifiableMap;
    }

    /* compiled from: Hpack.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u0014\u0010\u001e\u001a\u00020\u00142\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "headerTableSizeSetting", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "useCompression", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "out", "Lokio/Buffer;", "(IZLokio/Buffer;)V", "dynamicTable", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/internal/http2/Header;", "[Lokhttp3/internal/http2/Header;", "dynamicTableByteCount", "emitDynamicTableSizeUpdate", "headerCount", "maxDynamicTableByteCount", "nextHeaderIndex", "smallestHeaderTableSizeSetting", "adjustDynamicTableByteCount", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "clearDynamicTable", "evictToRecoverBytes", "bytesToRecover", "insertIntoDynamicTable", "entry", "resizeHeaderTable", "writeByteString", "data", "Lokio/ByteString;", "writeHeaders", "headerBlock", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "writeInt", "value", "prefixMask", "bits", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Writer {
        public okhttp3.internal.http2.Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(int i, okio.Buffer out) {
            this(i, false, out, 2, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Writer(okio.Buffer out) {
            this(0, false, out, 3, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
        }

        public Writer(int i, boolean z, okio.Buffer out) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = out;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new okhttp3.internal.http2.Header[8];
            this.nextHeaderIndex = r2.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z, okio.Buffer buffer, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, buffer);
        }

        private final void clearDynamicTable() {
            kotlin.collections.ArraysKt.fill$default(this.dynamicTable, (java.lang.Object) null, 0, 0, 6, (java.lang.Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int bytesToRecover) {
            int i;
            int i2 = 0;
            if (bytesToRecover > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i = this.nextHeaderIndex;
                    if (length < i || bytesToRecover <= 0) {
                        break;
                    }
                    okhttp3.internal.http2.Header header = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header);
                    bytesToRecover -= header.hpackSize;
                    int i3 = this.dynamicTableByteCount;
                    okhttp3.internal.http2.Header header2 = this.dynamicTable[length];
                    kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i3 - header2.hpackSize;
                    this.headerCount--;
                    i2++;
                }
                okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
                java.lang.System.arraycopy(headerArr, i + 1, headerArr, i + 1 + i2, this.headerCount);
                okhttp3.internal.http2.Header[] headerArr2 = this.dynamicTable;
                int i4 = this.nextHeaderIndex;
                java.util.Arrays.fill(headerArr2, i4 + 1, i4 + 1 + i2, (java.lang.Object) null);
                this.nextHeaderIndex += i2;
            }
            return i2;
        }

        private final void insertIntoDynamicTable(okhttp3.internal.http2.Header entry) {
            int i = entry.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            okhttp3.internal.http2.Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                okhttp3.internal.http2.Header[] headerArr2 = new okhttp3.internal.http2.Header[headerArr.length * 2];
                java.lang.System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = entry;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> headerBlock) throws java.io.IOException {
            int i;
            int i2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.emitDynamicTableSizeUpdate) {
                int i3 = this.smallestHeaderTableSizeSetting;
                if (i3 < this.maxDynamicTableByteCount) {
                    writeInt(i3, okhttp3.internal.http2.Hpack.PREFIX_5_BITS, 32);
                }
                this.emitDynamicTableSizeUpdate = false;
                this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, okhttp3.internal.http2.Hpack.PREFIX_5_BITS, 32);
            }
            int size = headerBlock.size();
            for (int i4 = 0; i4 < size; i4++) {
                okhttp3.internal.http2.Header header = headerBlock.get(i4);
                okio.ByteString asciiLowercase = header.name.toAsciiLowercase();
                okio.ByteString byteString = header.value;
                java.lang.Integer num = okhttp3.internal.http2.Hpack.INSTANCE.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    int intValue = num.intValue();
                    i2 = intValue + 1;
                    if (2 <= i2 && i2 < 8) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[intValue].value, byteString)) {
                            i = i2;
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i2].value, byteString)) {
                            i2 = intValue + 2;
                            i = i2;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i2 == -1) {
                    int i5 = this.nextHeaderIndex + 1;
                    int length = this.dynamicTable.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        okhttp3.internal.http2.Header header2 = this.dynamicTable[i5];
                        kotlin.jvm.internal.Intrinsics.checkNotNull(header2);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(header2.name, asciiLowercase)) {
                            okhttp3.internal.http2.Header header3 = this.dynamicTable[i5];
                            kotlin.jvm.internal.Intrinsics.checkNotNull(header3);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(header3.value, byteString)) {
                                i2 = okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i5 - this.nextHeaderIndex);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.nextHeaderIndex) + okhttp3.internal.http2.Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    writeInt(i2, 127, 128);
                } else if (i == -1) {
                    this.out.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                } else if (asciiLowercase.startsWith(okhttp3.internal.http2.Header.PSEUDO_PREFIX) && !kotlin.jvm.internal.Intrinsics.areEqual(okhttp3.internal.http2.Header.TARGET_AUTHORITY, asciiLowercase)) {
                    writeInt(i, 15, 0);
                    writeByteString(byteString);
                } else {
                    writeInt(i, okhttp3.internal.http2.Hpack.PREFIX_6_BITS, 64);
                    writeByteString(byteString);
                    insertIntoDynamicTable(header);
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            if (value < prefixMask) {
                this.out.writeByte(value | bits);
                return;
            }
            this.out.writeByte(bits | prefixMask);
            int i = value - prefixMask;
            while (i >= 128) {
                this.out.writeByte(128 | (i & 127));
                i >>>= 7;
            }
            this.out.writeByte(i);
        }

        public final void writeByteString(okio.ByteString data) throws java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "data");
            if (this.useCompression && okhttp3.internal.http2.Huffman.INSTANCE.encodedLength(data) < data.size()) {
                okio.Buffer buffer = new okio.Buffer();
                okhttp3.internal.http2.Huffman.INSTANCE.encode(data, buffer);
                okio.ByteString readByteString = buffer.readByteString();
                writeInt(readByteString.size(), 127, 128);
                this.out.write(readByteString);
                return;
            }
            writeInt(data.size(), 127, 0);
            this.out.write(data);
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int min = java.lang.Math.min(headerTableSizeSetting, 16384);
            int i = this.maxDynamicTableByteCount;
            if (i == min) {
                return;
            }
            if (min < i) {
                this.smallestHeaderTableSizeSetting = java.lang.Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }
    }

    public final okio.ByteString checkLowercase(okio.ByteString name) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i = 0; i < size; i++) {
            byte b = name.getByte(i);
            if (65 <= b && b < 91) {
                throw new java.io.IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }
}
