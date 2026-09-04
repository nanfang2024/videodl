package kotlin.collections.unsigned;

/* compiled from: _UArraysJvm.kt */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a+\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a+\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a+\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a+\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a+\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a+\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"asList", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", "index", "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", "max", "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
class UArraysKt___UArraysJvmKt {
    /* renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m127elementAtqFRl0hI(int[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UIntArray.get-pVg5ArA(elementAt, i);
    }

    /* renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m128elementAtr7IrZao(long[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.ULongArray.get-s-VKNKU(elementAt, i);
    }

    /* renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m125elementAtPpDY95g(byte[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UByteArray.get-w2LRezQ(elementAt, i);
    }

    /* renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m126elementAtnggk6HY(short[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UShortArray.get-Mh2AYeg(elementAt, i);
    }

    /* renamed from: asList--ajY-9A, reason: not valid java name */
    public static final java.util.List<kotlin.UInt> m113asListajY9A(int[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    /* renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final java.util.List<kotlin.ULong> m115asListQwZRm1k(long[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    /* renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final java.util.List<kotlin.UByte> m114asListGBYM_sE(byte[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    /* renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final java.util.List<kotlin.UShort> m116asListrL5Bavg(short[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m118binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = kotlin.UIntArray.getSize-impl(iArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m117binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    /* renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m117binarySearch2fe2U9s(int[] binarySearch, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i2, i3, kotlin.UIntArray.getSize-impl(binarySearch));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int uintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i);
            if (uintCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m122binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.ULongArray.getSize-impl(jArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m121binarySearchK6DWlUc(jArr, j, i, i2);
    }

    /* renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m121binarySearchK6DWlUc(long[] binarySearch, long j, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.ULongArray.getSize-impl(binarySearch));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int ulongCompare = kotlin.UnsignedKt.ulongCompare(binarySearch[i4], j);
            if (ulongCompare < 0) {
                i = i4 + 1;
            } else {
                if (ulongCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m124binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UByteArray.getSize-impl(bArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m123binarySearchWpHrYlw(bArr, b, i, i2);
    }

    /* renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m123binarySearchWpHrYlw(byte[] binarySearch, byte b, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UByteArray.getSize-impl(binarySearch));
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int uintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (uintCompare < 0) {
                i = i5 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m120binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UShortArray.getSize-impl(sArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m119binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    /* renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m119binarySearchEtDCXyQ(short[] binarySearch, short s, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UShortArray.getSize-impl(binarySearch));
        int i3 = s & 65535;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int uintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (uintCompare < 0) {
                i = i5 + 1;
            } else {
                if (uintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m129maxajY9A(int[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m497maxOrNullajY9A(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m131maxQwZRm1k(long[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m499maxOrNullQwZRm1k(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m130maxGBYM_sE(byte[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m498maxOrNullGBYM_sE(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m132maxrL5Bavg(short[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m500maxOrNullrL5Bavg(max);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m135maxByjgv0xPQ(int[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UIntArray.isEmpty-impl(maxBy)) {
            return null;
        }
        int i = kotlin.UIntArray.get-pVg5ArA(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UInt.box-impl(i));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i2 = kotlin.UIntArray.get-pVg5ArA(maxBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.UInt.box-impl(i2));
                if (invoke.compareTo(invoke2) < 0) {
                    i = i2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.UInt.box-impl(i);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m134maxByMShoTSo(long[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.ULongArray.isEmpty-impl(maxBy)) {
            return null;
        }
        long j = kotlin.ULongArray.get-s-VKNKU(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.ULong.box-impl(j));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                long j2 = kotlin.ULongArray.get-s-VKNKU(maxBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.ULong.box-impl(j2));
                if (invoke.compareTo(invoke2) < 0) {
                    j = j2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.ULong.box-impl(j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m133maxByJOV_ifY(byte[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UByteArray.isEmpty-impl(maxBy)) {
            return null;
        }
        byte b = kotlin.UByteArray.get-w2LRezQ(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UByte.box-impl(b));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte b2 = kotlin.UByteArray.get-w2LRezQ(maxBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.UByte.box-impl(b2));
                if (invoke.compareTo(invoke2) < 0) {
                    b = b2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.UByte.box-impl(b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m136maxByxTcfx_M(short[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UShortArray.isEmpty-impl(maxBy)) {
            return null;
        }
        short s = kotlin.UShortArray.get-Mh2AYeg(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UShort.box-impl(s));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                short s2 = kotlin.UShortArray.get-Mh2AYeg(maxBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.UShort.box-impl(s2));
                if (invoke.compareTo(invoke2) < 0) {
                    s = s2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.UShort.box-impl(s);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m138maxWithYmdZ_VM(int[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m506maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m140maxWithzrEWJaI(long[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m508maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m137maxWithXMRcp5o(byte[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m505maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m139maxWitheOHTfZs(short[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m507maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m141minajY9A(int[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m553minOrNullajY9A(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m143minQwZRm1k(long[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m555minOrNullQwZRm1k(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m142minGBYM_sE(byte[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m554minOrNullGBYM_sE(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m144minrL5Bavg(short[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m556minOrNullrL5Bavg(min);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m147minByjgv0xPQ(int[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UIntArray.isEmpty-impl(minBy)) {
            return null;
        }
        int i = kotlin.UIntArray.get-pVg5ArA(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UInt.box-impl(i));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int i2 = kotlin.UIntArray.get-pVg5ArA(minBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.UInt.box-impl(i2));
                if (invoke.compareTo(invoke2) > 0) {
                    i = i2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.UInt.box-impl(i);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m146minByMShoTSo(long[] minBy, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.ULongArray.isEmpty-impl(minBy)) {
            return null;
        }
        long j = kotlin.ULongArray.get-s-VKNKU(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.ULong.box-impl(j));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                long j2 = kotlin.ULongArray.get-s-VKNKU(minBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.ULong.box-impl(j2));
                if (invoke.compareTo(invoke2) > 0) {
                    j = j2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.ULong.box-impl(j);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m145minByJOV_ifY(byte[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UByteArray.isEmpty-impl(minBy)) {
            return null;
        }
        byte b = kotlin.UByteArray.get-w2LRezQ(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UByte.box-impl(b));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte b2 = kotlin.UByteArray.get-w2LRezQ(minBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.UByte.box-impl(b2));
                if (invoke.compareTo(invoke2) > 0) {
                    b = b2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.UByte.box-impl(b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m148minByxTcfx_M(short[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UShortArray.isEmpty-impl(minBy)) {
            return null;
        }
        short s = kotlin.UShortArray.get-Mh2AYeg(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R invoke = selector.invoke(kotlin.UShort.box-impl(s));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                short s2 = kotlin.UShortArray.get-Mh2AYeg(minBy, it.nextInt());
                R invoke2 = selector.invoke(kotlin.UShort.box-impl(s2));
                if (invoke.compareTo(invoke2) > 0) {
                    s = s2;
                    invoke = invoke2;
                }
            }
        }
        return kotlin.UShort.box-impl(s);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m150minWithYmdZ_VM(int[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m562minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m152minWithzrEWJaI(long[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m564minWithOrNullzrEWJaI(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m149minWithXMRcp5o(byte[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m561minWithOrNullXMRcp5o(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m151minWitheOHTfZs(short[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m563minWithOrNulleOHTfZs(minWith, comparator);
    }

    private static final java.math.BigDecimal sumOfBigDecimal(int[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.UIntArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UInt.box-impl(kotlin.UIntArray.get-pVg5ArA(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(long[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.ULongArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.ULong.box-impl(kotlin.ULongArray.get-s-VKNKU(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(byte[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.UByteArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UByte.box-impl(kotlin.UByteArray.get-w2LRezQ(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(short[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.UShortArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UShort.box-impl(kotlin.UShortArray.get-Mh2AYeg(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(int[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.UIntArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UInt.box-impl(kotlin.UIntArray.get-pVg5ArA(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(long[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.ULongArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.ULong.box-impl(kotlin.ULongArray.get-s-VKNKU(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(byte[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.UByteArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UByte.box-impl(kotlin.UByteArray.get-w2LRezQ(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(short[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger valueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        int i = kotlin.UShortArray.getSize-impl(sumOf);
        for (int i2 = 0; i2 < i; i2++) {
            valueOf = valueOf.add(selector.invoke(kotlin.UShort.box-impl(kotlin.UShortArray.get-Mh2AYeg(sumOf, i2))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "add(...)");
        }
        return valueOf;
    }
}
