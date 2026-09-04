package kotlin.internal;

/* compiled from: UProgressionUtil.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getProgressionLastElement-Nkh28Cs", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m852differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int m = kotlin.UByte$.ExternalSyntheticBackport0.m(i, i3);
        int m2 = kotlin.UByte$.ExternalSyntheticBackport0.m(i2, i3);
        int m$2 = kotlin.UByte$.ExternalSyntheticBackport0.m$2(m, m2);
        int i4 = kotlin.UInt.constructor-impl(m - m2);
        return m$2 >= 0 ? i4 : kotlin.UInt.constructor-impl(i4 + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m853differenceModulosambcqE(long j, long j2, long j3) {
        long m = kotlin.UByte$.ExternalSyntheticBackport0.m(j, j3);
        long m2 = kotlin.UByte$.ExternalSyntheticBackport0.m(j2, j3);
        int m3 = kotlin.UByte$.ExternalSyntheticBackport0.m(m, m2);
        long j4 = kotlin.ULong.constructor-impl(m - m2);
        return m3 >= 0 ? j4 : kotlin.ULong.constructor-impl(j4 + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m855getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, i2) >= 0 ? i2 : kotlin.UInt.constructor-impl(i2 - m852differenceModuloWZ9TVnA(i2, i, kotlin.UInt.constructor-impl(i3)));
        }
        if (i3 < 0) {
            return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, i2) <= 0 ? i2 : kotlin.UInt.constructor-impl(i2 + m852differenceModuloWZ9TVnA(i, i2, kotlin.UInt.constructor-impl(-i3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m854getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return kotlin.UByte$.ExternalSyntheticBackport0.m(j, j2) >= 0 ? j2 : kotlin.ULong.constructor-impl(j2 - m853differenceModulosambcqE(j2, j, kotlin.ULong.constructor-impl(j3)));
        }
        if (j3 < 0) {
            return kotlin.UByte$.ExternalSyntheticBackport0.m(j, j2) <= 0 ? j2 : kotlin.ULong.constructor-impl(j2 + m853differenceModulosambcqE(j, j2, kotlin.ULong.constructor-impl(-j3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }
}
