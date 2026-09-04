package okio.internal;

/* compiled from: SegmentedByteString.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a-\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010\u000e\u001a\u00020\u000f*\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\bH\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a]\u0010!\u001a\u00020\u0007*\u00020\b2K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0080\bø\u0001\u0000\u001aj\u0010!\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0082\b\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"binarySearch", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "value", "fromIndex", "toIndex", "commonCopyInto", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lokio/SegmentedByteString;", "offset", "target", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "targetOffset", "byteCount", "commonEquals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "commonGetSize", "commonHashCode", "commonInternalGet", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "pos", "commonRangeEquals", "otherOffset", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", "buffer", "Lokio/Buffer;", "forEachSegment", "action", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "data", "segment", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class SegmentedByteString {
    public static final int binarySearch(int[] iArr, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int segment(okio.C0009SegmentedByteString c0009SegmentedByteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        int binarySearch = binarySearch(c0009SegmentedByteString.getDirectory(), i + 1, 0, c0009SegmentedByteString.getSegments().length);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public static final void forEachSegment(okio.C0009SegmentedByteString c0009SegmentedByteString, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        int length = c0009SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = c0009SegmentedByteString.getDirectory()[length + i];
            int i4 = c0009SegmentedByteString.getDirectory()[i];
            action.invoke(c0009SegmentedByteString.getSegments()[i], java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4 - i2));
            i++;
            i2 = i4;
        }
    }

    private static final void forEachSegment(okio.C0009SegmentedByteString c0009SegmentedByteString, int i, int i2, kotlin.jvm.functions.Function3<? super byte[], ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> function3) {
        int segment = segment(c0009SegmentedByteString, i);
        while (i < i2) {
            int i3 = segment == 0 ? 0 : c0009SegmentedByteString.getDirectory()[segment - 1];
            int i4 = c0009SegmentedByteString.getDirectory()[segment] - i3;
            int i5 = c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + segment];
            int min = java.lang.Math.min(i2, i4 + i3) - i;
            function3.invoke(c0009SegmentedByteString.getSegments()[segment], java.lang.Integer.valueOf(i5 + (i - i3)), java.lang.Integer.valueOf(min));
            i += min;
            segment++;
        }
    }

    public static final okio.ByteString commonSubstring(okio.C0009SegmentedByteString c0009SegmentedByteString, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        okio.C0009SegmentedByteString c0009SegmentedByteString2 = c0009SegmentedByteString;
        int resolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c0009SegmentedByteString2, i2);
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("beginIndex=" + i + " < 0").toString());
        }
        if (resolveDefaultParameter > c0009SegmentedByteString.size()) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " > length(" + c0009SegmentedByteString.size() + ')').toString());
        }
        int i3 = resolveDefaultParameter - i;
        if (i3 < 0) {
            throw new java.lang.IllegalArgumentException(("endIndex=" + resolveDefaultParameter + " < beginIndex=" + i).toString());
        }
        if (i == 0 && resolveDefaultParameter == c0009SegmentedByteString.size()) {
            return c0009SegmentedByteString2;
        }
        if (i == resolveDefaultParameter) {
            return okio.ByteString.EMPTY;
        }
        int segment = segment(c0009SegmentedByteString, i);
        int segment2 = segment(c0009SegmentedByteString, resolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) kotlin.collections.ArraysKt.copyOfRange(c0009SegmentedByteString.getSegments(), segment, segment2 + 1);
        byte[][] bArr2 = bArr;
        int[] iArr = new int[bArr2.length * 2];
        if (segment <= segment2) {
            int i4 = segment;
            int i5 = 0;
            while (true) {
                iArr[i5] = java.lang.Math.min(c0009SegmentedByteString.getDirectory()[i4] - i, i3);
                int i6 = i5 + 1;
                iArr[i5 + bArr2.length] = c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + i4];
                if (i4 == segment2) {
                    break;
                }
                i4++;
                i5 = i6;
            }
        }
        int i7 = segment != 0 ? c0009SegmentedByteString.getDirectory()[segment - 1] : 0;
        int length = bArr2.length;
        iArr[length] = iArr[length] + (i - i7);
        return new okio.C0009SegmentedByteString(bArr, iArr);
    }

    public static final byte commonInternalGet(okio.C0009SegmentedByteString c0009SegmentedByteString, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length - 1], i, 1L);
        int segment = segment(c0009SegmentedByteString, i);
        return c0009SegmentedByteString.getSegments()[segment][(i - (segment == 0 ? 0 : c0009SegmentedByteString.getDirectory()[segment - 1])) + c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + segment]];
    }

    public static final int commonGetSize(okio.C0009SegmentedByteString c0009SegmentedByteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        return c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length - 1];
    }

    public static final byte[] commonToByteArray(okio.C0009SegmentedByteString c0009SegmentedByteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0009SegmentedByteString.size()];
        int length = c0009SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = c0009SegmentedByteString.getDirectory()[length + i];
            int i5 = c0009SegmentedByteString.getDirectory()[i];
            int i6 = i5 - i2;
            kotlin.collections.ArraysKt.copyInto(c0009SegmentedByteString.getSegments()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public static final boolean commonRangeEquals(okio.C0009SegmentedByteString c0009SegmentedByteString, int i, okio.ByteString other, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > c0009SegmentedByteString.size() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(c0009SegmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : c0009SegmentedByteString.getDirectory()[segment - 1];
            int i6 = c0009SegmentedByteString.getDirectory()[segment] - i5;
            int i7 = c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + segment];
            int min = java.lang.Math.min(i4, i6 + i5) - i;
            if (!other.rangeEquals(i2, c0009SegmentedByteString.getSegments()[segment], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final boolean commonRangeEquals(okio.C0009SegmentedByteString c0009SegmentedByteString, int i, byte[] other, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (i < 0 || i > c0009SegmentedByteString.size() - i3 || i2 < 0 || i2 > other.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int segment = segment(c0009SegmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : c0009SegmentedByteString.getDirectory()[segment - 1];
            int i6 = c0009SegmentedByteString.getDirectory()[segment] - i5;
            int i7 = c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + segment];
            int min = java.lang.Math.min(i4, i6 + i5) - i;
            if (!okio.SegmentedByteString.arrayRangeEquals(c0009SegmentedByteString.getSegments()[segment], i7 + (i - i5), other, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            segment++;
        }
        return true;
    }

    public static final void commonCopyInto(okio.C0009SegmentedByteString c0009SegmentedByteString, int i, byte[] target, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "target");
        long j = i3;
        okio.SegmentedByteString.checkOffsetAndCount(c0009SegmentedByteString.size(), i, j);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i2, j);
        int i4 = i3 + i;
        int segment = segment(c0009SegmentedByteString, i);
        while (i < i4) {
            int i5 = segment == 0 ? 0 : c0009SegmentedByteString.getDirectory()[segment - 1];
            int i6 = c0009SegmentedByteString.getDirectory()[segment] - i5;
            int i7 = c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + segment];
            int min = java.lang.Math.min(i4, i6 + i5) - i;
            int i8 = i7 + (i - i5);
            kotlin.collections.ArraysKt.copyInto(c0009SegmentedByteString.getSegments()[segment], target, i2, i8, i8 + min);
            i2 += min;
            i += min;
            segment++;
        }
    }

    public static final boolean commonEquals(okio.C0009SegmentedByteString c0009SegmentedByteString, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        if (obj == c0009SegmentedByteString) {
            return true;
        }
        if (obj instanceof okio.ByteString) {
            okio.ByteString byteString = (okio.ByteString) obj;
            if (byteString.size() == c0009SegmentedByteString.size() && c0009SegmentedByteString.rangeEquals(0, byteString, 0, c0009SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonHashCode(okio.C0009SegmentedByteString c0009SegmentedByteString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        int hashCode$okio = c0009SegmentedByteString.getHashCode();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int length = c0009SegmentedByteString.getSegments().length;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        while (i < length) {
            int i4 = c0009SegmentedByteString.getDirectory()[length + i];
            int i5 = c0009SegmentedByteString.getDirectory()[i];
            byte[] bArr = c0009SegmentedByteString.getSegments()[i];
            int i6 = (i5 - i3) + i4;
            while (i4 < i6) {
                i2 = (i2 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i3 = i5;
        }
        c0009SegmentedByteString.setHashCode$okio(i2);
        return i2;
    }

    public static final void commonWrite(okio.C0009SegmentedByteString c0009SegmentedByteString, okio.Buffer buffer, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0009SegmentedByteString, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i3 = i + i2;
        int segment = segment(c0009SegmentedByteString, i);
        while (i < i3) {
            int i4 = segment == 0 ? 0 : c0009SegmentedByteString.getDirectory()[segment - 1];
            int i5 = c0009SegmentedByteString.getDirectory()[segment] - i4;
            int i6 = c0009SegmentedByteString.getDirectory()[c0009SegmentedByteString.getSegments().length + segment];
            int min = java.lang.Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            okio.Segment segment2 = new okio.Segment(c0009SegmentedByteString.getSegments()[segment], i7, i7 + min, true, false);
            if (buffer.head == null) {
                segment2.prev = segment2;
                segment2.next = segment2.prev;
                buffer.head = segment2.next;
            } else {
                okio.Segment segment3 = buffer.head;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment3);
                okio.Segment segment4 = segment3.prev;
                kotlin.jvm.internal.Intrinsics.checkNotNull(segment4);
                segment4.push(segment2);
            }
            i += min;
            segment++;
        }
        buffer.setSize$okio(buffer.size() + i2);
    }
}
