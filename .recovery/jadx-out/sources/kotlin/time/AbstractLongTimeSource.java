package kotlin.time;

/* compiled from: TimeSources.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public abstract class AbstractLongTimeSource implements kotlin.time.TimeSource.WithComparableMarks {
    private final kotlin.time.DurationUnit unit;

    /* renamed from: zero$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy zero;

    /* JADX INFO: Access modifiers changed from: protected */
    public final kotlin.time.DurationUnit getUnit() {
        return this.unit;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract long read();

    public AbstractLongTimeSource(kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        this.unit = unit;
        this.zero = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.lang.Long>() { // from class: kotlin.time.AbstractLongTimeSource$zero$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Long invoke() {
                return java.lang.Long.valueOf(kotlin.time.AbstractLongTimeSource.this.read());
            }
        });
    }

    private final long getZero() {
        return ((java.lang.Number) this.zero.getValue()).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TimeSources.kt */
    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class LongTimeMark implements kotlin.time.ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final kotlin.time.AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j, kotlin.time.AbstractLongTimeSource abstractLongTimeSource, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        private LongTimeMark(long j, kotlin.time.AbstractLongTimeSource timeSource, long j2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = j;
            this.timeSource = timeSource;
            this.offset = j2;
        }

        @Override // java.lang.Comparable
        public int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasNotPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        public boolean hasPassedNow() {
            return kotlin.time.ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: minus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo962minusLRDsOJo(long j) {
            return kotlin.time.ComparableTimeMark.DefaultImpls.m966minusLRDsOJo(this, j);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: elapsedNow-UwyO8pc */
        public long mo961elapsedNowUwyO8pc() {
            return kotlin.time.Duration.m1006minusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override // kotlin.time.TimeMark
        /* renamed from: plus-LRDsOJo */
        public kotlin.time.ComparableTimeMark mo964plusLRDsOJo(long duration) {
            kotlin.time.DurationUnit unit = this.timeSource.getUnit();
            if (kotlin.time.Duration.m1003isInfiniteimpl(duration)) {
                return new kotlin.time.AbstractLongTimeSource.LongTimeMark(kotlin.time.LongSaturatedMathKt.m1100saturatingAddNuflL3o(this.startedAt, unit, duration), this.timeSource, kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc(), null);
            }
            long m1023truncateToUwyO8pc$kotlin_stdlib = kotlin.time.Duration.m1023truncateToUwyO8pc$kotlin_stdlib(duration, unit);
            long m1007plusLRDsOJo = kotlin.time.Duration.m1007plusLRDsOJo(kotlin.time.Duration.m1006minusLRDsOJo(duration, m1023truncateToUwyO8pc$kotlin_stdlib), this.offset);
            long m1100saturatingAddNuflL3o = kotlin.time.LongSaturatedMathKt.m1100saturatingAddNuflL3o(this.startedAt, unit, m1023truncateToUwyO8pc$kotlin_stdlib);
            long m1023truncateToUwyO8pc$kotlin_stdlib2 = kotlin.time.Duration.m1023truncateToUwyO8pc$kotlin_stdlib(m1007plusLRDsOJo, unit);
            long m1100saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m1100saturatingAddNuflL3o(m1100saturatingAddNuflL3o, unit, m1023truncateToUwyO8pc$kotlin_stdlib2);
            long m1006minusLRDsOJo = kotlin.time.Duration.m1006minusLRDsOJo(m1007plusLRDsOJo, m1023truncateToUwyO8pc$kotlin_stdlib2);
            long m991getInWholeNanosecondsimpl = kotlin.time.Duration.m991getInWholeNanosecondsimpl(m1006minusLRDsOJo);
            if (m1100saturatingAddNuflL3o2 != 0 && m991getInWholeNanosecondsimpl != 0 && (m1100saturatingAddNuflL3o2 ^ m991getInWholeNanosecondsimpl) < 0) {
                long duration2 = kotlin.time.DurationKt.toDuration(kotlin.math.MathKt.getSign(m991getInWholeNanosecondsimpl), unit);
                m1100saturatingAddNuflL3o2 = kotlin.time.LongSaturatedMathKt.m1100saturatingAddNuflL3o(m1100saturatingAddNuflL3o2, unit, duration2);
                m1006minusLRDsOJo = kotlin.time.Duration.m1006minusLRDsOJo(m1006minusLRDsOJo, duration2);
            }
            if ((1 | (m1100saturatingAddNuflL3o2 - 1)) == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) {
                m1006minusLRDsOJo = kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc();
            }
            return new kotlin.time.AbstractLongTimeSource.LongTimeMark(m1100saturatingAddNuflL3o2, this.timeSource, m1006minusLRDsOJo, null);
        }

        @Override // kotlin.time.ComparableTimeMark
        /* renamed from: minus-UwyO8pc */
        public long mo963minusUwyO8pc(kotlin.time.ComparableTimeMark other) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
            if (other instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) {
                kotlin.time.AbstractLongTimeSource.LongTimeMark longTimeMark = (kotlin.time.AbstractLongTimeSource.LongTimeMark) other;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.timeSource, longTimeMark.timeSource)) {
                    return kotlin.time.Duration.m1007plusLRDsOJo(kotlin.time.LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, longTimeMark.startedAt, this.timeSource.getUnit()), kotlin.time.Duration.m1006minusLRDsOJo(this.offset, longTimeMark.offset));
                }
            }
            throw new java.lang.IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // kotlin.time.ComparableTimeMark
        public boolean equals(java.lang.Object other) {
            return (other instanceof kotlin.time.AbstractLongTimeSource.LongTimeMark) && kotlin.jvm.internal.Intrinsics.areEqual(this.timeSource, ((kotlin.time.AbstractLongTimeSource.LongTimeMark) other).timeSource) && kotlin.time.Duration.m976equalsimpl0(mo963minusUwyO8pc((kotlin.time.ComparableTimeMark) other), kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc());
        }

        @Override // kotlin.time.ComparableTimeMark
        public int hashCode() {
            return (kotlin.time.Duration.m999hashCodeimpl(this.offset) * 37) + java.lang.Long.hashCode(this.startedAt);
        }

        public java.lang.String toString() {
            return "LongTimeMark(" + this.startedAt + kotlin.time.DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + ((java.lang.Object) kotlin.time.Duration.m1020toStringimpl(this.offset)) + ", " + this.timeSource + ')';
        }
    }

    @Override // kotlin.time.TimeSource
    public kotlin.time.ComparableTimeMark markNow() {
        return new kotlin.time.AbstractLongTimeSource.LongTimeMark(adjustedRead(), this, kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc(), null);
    }
}
