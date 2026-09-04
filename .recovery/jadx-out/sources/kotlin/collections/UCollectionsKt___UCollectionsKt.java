package kotlin.collections;

/* compiled from: _UCollections.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0017\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(java.util.Collection<kotlin.UByte> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = kotlin.UByteArray.constructor-impl(collection.size());
        java.util.Iterator<kotlin.UByte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UByteArray.set-VurrAj0(bArr, i, it.next().unbox-impl());
            i++;
        }
        return bArr;
    }

    public static final int[] toUIntArray(java.util.Collection<kotlin.UInt> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = kotlin.UIntArray.constructor-impl(collection.size());
        java.util.Iterator<kotlin.UInt> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UIntArray.set-VXSXFK8(iArr, i, it.next().unbox-impl());
            i++;
        }
        return iArr;
    }

    public static final long[] toULongArray(java.util.Collection<kotlin.ULong> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = kotlin.ULongArray.constructor-impl(collection.size());
        java.util.Iterator<kotlin.ULong> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.ULongArray.set-k8EXiF4(jArr, i, it.next().unbox-impl());
            i++;
        }
        return jArr;
    }

    public static final short[] toUShortArray(java.util.Collection<kotlin.UShort> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArr = kotlin.UShortArray.constructor-impl(collection.size());
        java.util.Iterator<kotlin.UShort> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            kotlin.UShortArray.set-01HTLdE(sArr, i, it.next().unbox-impl());
            i++;
        }
        return sArr;
    }

    public static final int sumOfUInt(java.lang.Iterable<kotlin.UInt> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.UInt> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.constructor-impl(i + it.next().unbox-impl());
        }
        return i;
    }

    public static final long sumOfULong(java.lang.Iterable<kotlin.ULong> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.ULong> it = iterable.iterator();
        long j = 0;
        while (it.hasNext()) {
            j = kotlin.ULong.constructor-impl(j + it.next().unbox-impl());
        }
        return j;
    }

    public static final int sumOfUByte(java.lang.Iterable<kotlin.UByte> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.UByte> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.constructor-impl(i + kotlin.UInt.constructor-impl(it.next().unbox-impl() & 255));
        }
        return i;
    }

    public static final int sumOfUShort(java.lang.Iterable<kotlin.UShort> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "<this>");
        java.util.Iterator<kotlin.UShort> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = kotlin.UInt.constructor-impl(i + kotlin.UInt.constructor-impl(it.next().unbox-impl() & 65535));
        }
        return i;
    }
}
