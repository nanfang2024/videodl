package kotlin.ranges;

/* compiled from: ULongRange.kt */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u001cB\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001d\u0010\b\u001a\u00020\u00038VX\u0097\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", "Lkotlin/ranges/OpenEndRange;", "start", "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "endExclusive", "getEndExclusive-s-VKNKU$annotations", "()V", "getEndExclusive-s-VKNKU", "()J", "getEndInclusive-s-VKNKU", "getStart-s-VKNKU", "contains", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ULongRange extends kotlin.ranges.ULongProgression implements kotlin.ranges.ClosedRange<kotlin.ULong>, kotlin.ranges.OpenEndRange<kotlin.ULong> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.ranges.ULongRange.Companion INSTANCE = new kotlin.ranges.ULongRange.Companion(null);
    private static final kotlin.ranges.ULongRange EMPTY = new kotlin.ranges.ULongRange(-1, 0, null);

    public /* synthetic */ ULongRange(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @kotlin.Deprecated(message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    /* renamed from: getEndExclusive-s-VKNKU$annotations, reason: not valid java name */
    public static /* synthetic */ void m882getEndExclusivesVKNKU$annotations() {
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(java.lang.Comparable comparable) {
        return m883containsVKZWuLQ(((kotlin.ULong) comparable).unbox-impl());
    }

    @Override // kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ kotlin.ULong getEndExclusive() {
        return kotlin.ULong.box-impl(m884getEndExclusivesVKNKU());
    }

    @Override // kotlin.ranges.ClosedRange
    public /* bridge */ /* synthetic */ kotlin.ULong getEndInclusive() {
        return kotlin.ULong.box-impl(m885getEndInclusivesVKNKU());
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ java.lang.Comparable getStart() {
        return kotlin.ULong.box-impl(m886getStartsVKNKU());
    }

    private ULongRange(long j, long j2) {
        super(j, j2, 1L, null);
    }

    /* renamed from: getStart-s-VKNKU, reason: not valid java name */
    public long m886getStartsVKNKU() {
        return getFirst();
    }

    /* renamed from: getEndInclusive-s-VKNKU, reason: not valid java name */
    public long m885getEndInclusivesVKNKU() {
        return getLast();
    }

    /* renamed from: getEndExclusive-s-VKNKU, reason: not valid java name */
    public long m884getEndExclusivesVKNKU() {
        if (getLast() == -1) {
            throw new java.lang.IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return kotlin.ULong.constructor-impl(getLast() + kotlin.ULong.constructor-impl(1 & 4294967295L));
    }

    /* renamed from: contains-VKZWuLQ, reason: not valid java name */
    public boolean m883containsVKZWuLQ(long value) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m(getFirst(), value) <= 0 && kotlin.UByte$.ExternalSyntheticBackport0.m(value, getLast()) <= 0;
    }

    @Override // kotlin.ranges.ULongProgression, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return kotlin.UByte$.ExternalSyntheticBackport0.m(getFirst(), getLast()) > 0;
    }

    @Override // kotlin.ranges.ULongProgression
    public boolean equals(java.lang.Object other) {
        if (other instanceof kotlin.ranges.ULongRange) {
            if (!isEmpty() || !((kotlin.ranges.ULongRange) other).isEmpty()) {
                kotlin.ranges.ULongRange uLongRange = (kotlin.ranges.ULongRange) other;
                if (getFirst() != uLongRange.getFirst() || getLast() != uLongRange.getLast()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // kotlin.ranges.ULongProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((int) kotlin.ULong.constructor-impl(getFirst() ^ kotlin.ULong.constructor-impl(getFirst() >>> 32))) * 31) + ((int) kotlin.ULong.constructor-impl(getLast() ^ kotlin.ULong.constructor-impl(getLast() >>> 32)));
    }

    @Override // kotlin.ranges.ULongProgression
    public java.lang.String toString() {
        return ((java.lang.Object) kotlin.ULong.toString-impl(getFirst())) + ".." + ((java.lang.Object) kotlin.ULong.toString-impl(getLast()));
    }

    /* compiled from: ULongRange.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlin.ranges.ULongRange getEMPTY() {
            return kotlin.ranges.ULongRange.EMPTY;
        }
    }
}
