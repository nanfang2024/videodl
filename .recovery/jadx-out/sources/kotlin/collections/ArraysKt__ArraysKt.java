package kotlin.collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Arrays.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u00032\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00032\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0015\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u00030\u0003¢\u0006\u0002\u0010\u0016\u001a;\u0010\u0017\u001a\u0002H\u0018\"\u0010\b\u0000\u0010\u0019*\u0006\u0012\u0002\b\u00030\u0003*\u0002H\u0018\"\u0004\b\u0001\u0010\u0018*\u0002H\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00180\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a)\u0010\u001d\u001a\u00020\u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u0003H\u0087\b\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0002\u0010\u001e\u001aG\u0010\u001f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00180\u00150 \"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0018*\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00180 0\u0003¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"contentDeepEqualsImpl", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", "contentDeepEquals", "([Ljava/lang/Object;[Ljava/lang/Object;)Z", "contentDeepToStringImpl", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "contentDeepToString", "([Ljava/lang/Object;)Ljava/lang/String;", "contentDeepToStringInternal", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "result", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "processed", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "contentDeepToStringInternal$ArraysKt__ArraysKt", "([Ljava/lang/Object;Ljava/lang/StringBuilder;Ljava/util/List;)V", "flatten", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "([[Ljava/lang/Object;)Ljava/util/List;", "ifEmpty", "R", "C", "defaultValue", "Lkotlin/Function0;", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNullOrEmpty", "([Ljava/lang/Object;)Z", "unzip", "Lkotlin/Pair;", "([Lkotlin/Pair;)Lkotlin/Pair;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class ArraysKt__ArraysKt extends kotlin.collections.ArraysKt__ArraysJVMKt {
    public static final <T> java.util.List<T> flatten(T[][] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[][] tArr2 = tArr;
        int i = 0;
        for (T[] tArr3 : tArr2) {
            i += tArr3.length;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        int length = tArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            kotlin.collections.CollectionsKt.addAll(arrayList, tArr[i2]);
        }
        return arrayList;
    }

    public static final <T, R> kotlin.Pair<java.util.List<T>, java.util.List<R>> unzip(kotlin.Pair<? extends T, ? extends R>[] pairArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pairArr, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(pairArr.length);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(pairArr.length);
        for (kotlin.Pair<? extends T, ? extends R> pair : pairArr) {
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return kotlin.TuplesKt.to(arrayList, arrayList2);
    }

    private static final boolean isNullOrEmpty(java.lang.Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    /* JADX WARN: Incorrect types in method signature: <C:[Ljava/lang/Object;:TR;R:Ljava/lang/Object;>(TC;Lkotlin/jvm/functions/Function0<+TR;>;)TR; */
    private static final java.lang.Object ifEmpty(java.lang.Object[] objArr, kotlin.jvm.functions.Function0 defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        return objArr.length == 0 ? defaultValue.invoke() : objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean contentDeepEquals(T[] tArr, T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == 0 || tArr2 == 0 || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            java.lang.Object[] objArr = tArr[i];
            java.lang.Object[] objArr2 = tArr2[i];
            if (objArr != objArr2) {
                if (objArr == 0 || objArr2 == 0) {
                    return false;
                }
                if ((objArr instanceof java.lang.Object[]) && (objArr2 instanceof java.lang.Object[])) {
                    if (!kotlin.collections.ArraysKt.contentDeepEquals(objArr, objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof byte[]) && (objArr2 instanceof byte[])) {
                    if (!java.util.Arrays.equals((byte[]) objArr, (byte[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof short[]) && (objArr2 instanceof short[])) {
                    if (!java.util.Arrays.equals((short[]) objArr, (short[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof int[]) && (objArr2 instanceof int[])) {
                    if (!java.util.Arrays.equals((int[]) objArr, (int[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof long[]) && (objArr2 instanceof long[])) {
                    if (!java.util.Arrays.equals((long[]) objArr, (long[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof float[]) && (objArr2 instanceof float[])) {
                    if (!java.util.Arrays.equals((float[]) objArr, (float[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof double[]) && (objArr2 instanceof double[])) {
                    if (!java.util.Arrays.equals((double[]) objArr, (double[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof char[]) && (objArr2 instanceof char[])) {
                    if (!java.util.Arrays.equals((char[]) objArr, (char[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof boolean[]) && (objArr2 instanceof boolean[])) {
                    if (!java.util.Arrays.equals((boolean[]) objArr, (boolean[]) objArr2)) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.UByteArray) && (objArr2 instanceof kotlin.UByteArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m215contentEqualskV0jMPg(((kotlin.UByteArray) objArr).unbox-impl(), ((kotlin.UByteArray) objArr2).unbox-impl())) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.UShortArray) && (objArr2 instanceof kotlin.UShortArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m213contentEqualsFGO6Aew(((kotlin.UShortArray) objArr).unbox-impl(), ((kotlin.UShortArray) objArr2).unbox-impl())) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.UIntArray) && (objArr2 instanceof kotlin.UIntArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m214contentEqualsKJPZfPQ(((kotlin.UIntArray) objArr).unbox-impl(), ((kotlin.UIntArray) objArr2).unbox-impl())) {
                        return false;
                    }
                } else if ((objArr instanceof kotlin.ULongArray) && (objArr2 instanceof kotlin.ULongArray)) {
                    if (!kotlin.collections.unsigned.UArraysKt.m216contentEqualslec5QzE(((kotlin.ULongArray) objArr).unbox-impl(), ((kotlin.ULongArray) objArr2).unbox-impl())) {
                        return false;
                    }
                } else if (!kotlin.jvm.internal.Intrinsics.areEqual(objArr, objArr2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final <T> java.lang.String contentDeepToString(T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder((kotlin.ranges.RangesKt.coerceAtMost(tArr.length, 429496729) * 5) + 2);
        contentDeepToStringInternal$ArraysKt__ArraysKt(tArr, sb, new java.util.ArrayList());
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> void contentDeepToStringInternal$ArraysKt__ArraysKt(T[] tArr, java.lang.StringBuilder sb, java.util.List<java.lang.Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            java.lang.Object[] objArr = tArr[i];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof java.lang.Object[]) {
                contentDeepToStringInternal$ArraysKt__ArraysKt(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                java.lang.String arrays = java.util.Arrays.toString((byte[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                java.lang.String arrays2 = java.util.Arrays.toString((short[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays2, "toString(...)");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                java.lang.String arrays3 = java.util.Arrays.toString((int[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays3, "toString(...)");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                java.lang.String arrays4 = java.util.Arrays.toString((long[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays4, "toString(...)");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                java.lang.String arrays5 = java.util.Arrays.toString((float[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays5, "toString(...)");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                java.lang.String arrays6 = java.util.Arrays.toString((double[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays6, "toString(...)");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                java.lang.String arrays7 = java.util.Arrays.toString((char[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays7, "toString(...)");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                java.lang.String arrays8 = java.util.Arrays.toString((boolean[]) objArr);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrays8, "toString(...)");
                sb.append(arrays8);
            } else if (objArr instanceof kotlin.UByteArray) {
                kotlin.UByteArray uByteArray = (kotlin.UByteArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m221contentToString2csIQuQ(uByteArray != null ? uByteArray.unbox-impl() : null));
            } else if (objArr instanceof kotlin.UShortArray) {
                kotlin.UShortArray uShortArray = (kotlin.UShortArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m223contentToStringd6D3K8(uShortArray != null ? uShortArray.unbox-impl() : null));
            } else if (objArr instanceof kotlin.UIntArray) {
                kotlin.UIntArray uIntArray = (kotlin.UIntArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m222contentToStringXUkPCBk(uIntArray != null ? uIntArray.unbox-impl() : null));
            } else if (objArr instanceof kotlin.ULongArray) {
                kotlin.ULongArray uLongArray = (kotlin.ULongArray) objArr;
                sb.append(kotlin.collections.unsigned.UArraysKt.m224contentToStringuLth9ew(uLongArray != null ? uLongArray.unbox-impl() : null));
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(kotlin.collections.CollectionsKt.getLastIndex(list));
    }
}
