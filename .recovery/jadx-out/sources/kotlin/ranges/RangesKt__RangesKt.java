package kotlin.ranges;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ranges.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\n*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\r\u001a@\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0007*\u00020\b\"\u0018\b\u0001\u0010\t*\b\u0012\u0004\u0012\u0002H\u00070\u000e*\b\u0012\u0004\u0012\u0002H\u00070\u000b*\u0002H\t2\b\u0010\f\u001a\u0004\u0018\u0001H\u0007H\u0087\n¢\u0006\u0002\u0010\u000f\u001a0\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\n\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0086\u0002¢\u0006\u0002\u0010\u0013\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00160\u0014*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002\u001a0\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00070\u000e\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00070\u0011*\u0002H\u00072\u0006\u0010\u0012\u001a\u0002H\u0007H\u0087\u0002¢\u0006\u0002\u0010\u0018\u001a\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015H\u0087\u0002\u001a\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e*\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0016H\u0087\u0002¨\u0006\u0019"}, d2 = {"checkStepIsPositive", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isPositive", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "step", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "contains", "T", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "R", "Lkotlin/ranges/ClosedRange;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Lkotlin/ranges/ClosedRange;Ljava/lang/Object;)Z", "Lkotlin/ranges/OpenEndRange;", "(Lkotlin/ranges/OpenEndRange;Ljava/lang/Object;)Z", "rangeTo", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "that", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/ClosedRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "rangeUntil", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Lkotlin/ranges/OpenEndRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/RangesKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class RangesKt__RangesKt {
    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.ClosedRange<T> rangeTo(T t, T that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "that");
        return new kotlin.ranges.ComparableRange(t, that);
    }

    public static final <T extends java.lang.Comparable<? super T>> kotlin.ranges.OpenEndRange<T> rangeUntil(T t, T that) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(that, "that");
        return new kotlin.ranges.ComparableOpenEndRange(t, that);
    }

    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Double> rangeTo(double d, double d2) {
        return new kotlin.ranges.ClosedDoubleRange(d, d2);
    }

    public static final kotlin.ranges.OpenEndRange<java.lang.Double> rangeUntil(double d, double d2) {
        return new kotlin.ranges.OpenEndDoubleRange(d, d2);
    }

    public static final kotlin.ranges.ClosedFloatingPointRange<java.lang.Float> rangeTo(float f, float f2) {
        return new kotlin.ranges.ClosedFloatRange(f, f2);
    }

    public static final kotlin.ranges.OpenEndRange<java.lang.Float> rangeUntil(float f, float f2) {
        return new kotlin.ranges.OpenEndFloatRange(f, f2);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/ClosedRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(kotlin.ranges.ClosedRange closedRange, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(closedRange, "<this>");
        return obj != null && closedRange.contains((java.lang.Comparable) obj);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Ljava/lang/Object;R::Lkotlin/ranges/OpenEndRange<TT;>;:Ljava/lang/Iterable<+TT;>;>(TR;TT;)Z */
    private static final boolean contains(kotlin.ranges.OpenEndRange openEndRange, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(openEndRange, "<this>");
        return obj != null && openEndRange.contains((java.lang.Comparable) obj);
    }

    public static final void checkStepIsPositive(boolean z, java.lang.Number step) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "step");
        if (!z) {
            throw new java.lang.IllegalArgumentException("Step must be positive, was: " + step + '.');
        }
    }
}
