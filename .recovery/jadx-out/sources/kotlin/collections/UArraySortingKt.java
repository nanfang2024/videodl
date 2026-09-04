package kotlin.collections;

/* compiled from: UArraySorting.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u0014\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0016\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0018\u001a'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "array", "Lkotlin/UByteArray;", "left", "right", "partition-4UcCI2c", "([BII)I", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "quickSort-4UcCI2c", "([BII)V", "quickSort-oBK06Vg", "([III)V", "quickSort--nroSd4", "([JII)V", "quickSort-Aa5vz7o", "([SII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-oBK06Vg", "sortArray--nroSd4", "sortArray-Aa5vz7o", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class UArraySortingKt {
    /* renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m101partition4UcCI2c(byte[] bArr, int i, int i2) {
        int i3;
        byte b = kotlin.UByteArray.get-w2LRezQ(bArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = b & 255;
                if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.get-w2LRezQ(bArr, i) & 255, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UByteArray.get-w2LRezQ(bArr, i2) & 255, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                byte b2 = kotlin.UByteArray.get-w2LRezQ(bArr, i);
                kotlin.UByteArray.set-VurrAj0(bArr, i, kotlin.UByteArray.get-w2LRezQ(bArr, i2));
                kotlin.UByteArray.set-VurrAj0(bArr, i2, b2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m105quickSort4UcCI2c(byte[] bArr, int i, int i2) {
        int m101partition4UcCI2c = m101partition4UcCI2c(bArr, i, i2);
        int i3 = m101partition4UcCI2c - 1;
        if (i < i3) {
            m105quickSort4UcCI2c(bArr, i, i3);
        }
        if (m101partition4UcCI2c < i2) {
            m105quickSort4UcCI2c(bArr, m101partition4UcCI2c, i2);
        }
    }

    /* renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m102partitionAa5vz7o(short[] sArr, int i, int i2) {
        int i3;
        short s = kotlin.UShortArray.get-Mh2AYeg(sArr, (i + i2) / 2);
        while (i <= i2) {
            while (true) {
                i3 = s & 65535;
                if (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.get-Mh2AYeg(sArr, i) & 65535, i3) >= 0) {
                    break;
                }
                i++;
            }
            while (kotlin.jvm.internal.Intrinsics.compare(kotlin.UShortArray.get-Mh2AYeg(sArr, i2) & 65535, i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                short s2 = kotlin.UShortArray.get-Mh2AYeg(sArr, i);
                kotlin.UShortArray.set-01HTLdE(sArr, i, kotlin.UShortArray.get-Mh2AYeg(sArr, i2));
                kotlin.UShortArray.set-01HTLdE(sArr, i2, s2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m106quickSortAa5vz7o(short[] sArr, int i, int i2) {
        int m102partitionAa5vz7o = m102partitionAa5vz7o(sArr, i, i2);
        int i3 = m102partitionAa5vz7o - 1;
        if (i < i3) {
            m106quickSortAa5vz7o(sArr, i, i3);
        }
        if (m102partitionAa5vz7o < i2) {
            m106quickSortAa5vz7o(sArr, m102partitionAa5vz7o, i2);
        }
    }

    /* renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m103partitionoBK06Vg(int[] iArr, int i, int i2) {
        int i3 = kotlin.UIntArray.get-pVg5ArA(iArr, (i + i2) / 2);
        while (i <= i2) {
            while (kotlin.UByte$.ExternalSyntheticBackport0.m$2(kotlin.UIntArray.get-pVg5ArA(iArr, i), i3) < 0) {
                i++;
            }
            while (kotlin.UByte$.ExternalSyntheticBackport0.m$2(kotlin.UIntArray.get-pVg5ArA(iArr, i2), i3) > 0) {
                i2--;
            }
            if (i <= i2) {
                int i4 = kotlin.UIntArray.get-pVg5ArA(iArr, i);
                kotlin.UIntArray.set-VXSXFK8(iArr, i, kotlin.UIntArray.get-pVg5ArA(iArr, i2));
                kotlin.UIntArray.set-VXSXFK8(iArr, i2, i4);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m107quickSortoBK06Vg(int[] iArr, int i, int i2) {
        int m103partitionoBK06Vg = m103partitionoBK06Vg(iArr, i, i2);
        int i3 = m103partitionoBK06Vg - 1;
        if (i < i3) {
            m107quickSortoBK06Vg(iArr, i, i3);
        }
        if (m103partitionoBK06Vg < i2) {
            m107quickSortoBK06Vg(iArr, m103partitionoBK06Vg, i2);
        }
    }

    /* renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m100partitionnroSd4(long[] jArr, int i, int i2) {
        long j = kotlin.ULongArray.get-s-VKNKU(jArr, (i + i2) / 2);
        while (i <= i2) {
            while (kotlin.UByte$.ExternalSyntheticBackport0.m(kotlin.ULongArray.get-s-VKNKU(jArr, i), j) < 0) {
                i++;
            }
            while (kotlin.UByte$.ExternalSyntheticBackport0.m(kotlin.ULongArray.get-s-VKNKU(jArr, i2), j) > 0) {
                i2--;
            }
            if (i <= i2) {
                long j2 = kotlin.ULongArray.get-s-VKNKU(jArr, i);
                kotlin.ULongArray.set-k8EXiF4(jArr, i, kotlin.ULongArray.get-s-VKNKU(jArr, i2));
                kotlin.ULongArray.set-k8EXiF4(jArr, i2, j2);
                i++;
                i2--;
            }
        }
        return i;
    }

    /* renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m104quickSortnroSd4(long[] jArr, int i, int i2) {
        int m100partitionnroSd4 = m100partitionnroSd4(jArr, i, i2);
        int i3 = m100partitionnroSd4 - 1;
        if (i < i3) {
            m104quickSortnroSd4(jArr, i, i3);
        }
        if (m100partitionnroSd4 < i2) {
            m104quickSortnroSd4(jArr, m100partitionnroSd4, i2);
        }
    }

    /* renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m109sortArray4UcCI2c(byte[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m105quickSort4UcCI2c(array, i, i2 - 1);
    }

    /* renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m110sortArrayAa5vz7o(short[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m106quickSortAa5vz7o(array, i, i2 - 1);
    }

    /* renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m111sortArrayoBK06Vg(int[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m107quickSortoBK06Vg(array, i, i2 - 1);
    }

    /* renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m108sortArraynroSd4(long[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        m104quickSortnroSd4(array, i, i2 - 1);
    }
}
