package kotlin.time;

/* compiled from: TimeSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lkotlin/time/TimeSource;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "markNow", "Lkotlin/time/TimeMark;", "Companion", "Monotonic", "WithComparableMarks", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public interface TimeSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.TimeSource.Companion INSTANCE = kotlin.time.TimeSource.Companion.$$INSTANCE;

    /* compiled from: TimeSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "markNow", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public interface WithComparableMarks extends kotlin.time.TimeSource {
        @Override // kotlin.time.TimeSource
        kotlin.time.ComparableTimeMark markNow();
    }

    kotlin.time.TimeMark markNow();

    /* compiled from: TimeSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "()V", "markNow", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "markNow-z9LOYto", "()J", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Monotonic implements kotlin.time.TimeSource.WithComparableMarks {
        public static final kotlin.time.TimeSource.Monotonic INSTANCE = new kotlin.time.TimeSource.Monotonic();

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark markNow() {
            return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1111boximpl(m1110markNowz9LOYto());
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ kotlin.time.TimeMark markNow() {
            return kotlin.time.TimeSource.Monotonic.ValueTimeMark.m1111boximpl(m1110markNowz9LOYto());
        }

        /* renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m1110markNowz9LOYto() {
            return kotlin.time.MonotonicTimeSource.INSTANCE.m1105markNowz9LOYto();
        }

        public java.lang.String toString() {
            return kotlin.time.MonotonicTimeSource.INSTANCE.toString();
        }

        /* compiled from: TimeSource.kt */
        @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0006J\u001a\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0018\u0010\u001c\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(R\u0012\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004\u0082\u0002\u0004\n\u0002\b!¨\u0006)"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/time/ValueTimeMarkReading;", "constructor-impl", "(J)J", "compareTo", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", "compareTo-6eNON_k", "(JJ)I", "elapsedNow", "Lkotlin/time/Duration;", "elapsedNow-UwyO8pc", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "equals-impl", "(JLjava/lang/Object;)Z", "hasNotPassedNow", "hasNotPassedNow-impl", "(J)Z", "hasPassedNow", "hasPassedNow-impl", "hashCode", "hashCode-impl", "(J)I", "minus", "minus-UwyO8pc", "(JLkotlin/time/ComparableTimeMark;)J", "duration", "minus-LRDsOJo", "(JJ)J", "minus-6eNON_k", "plus", "plus-LRDsOJo", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "toString-impl", "(J)Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @kotlin.jvm.JvmInline
        /* loaded from: /workspace/.recovery/dex/classes3.dex */
        public static final class ValueTimeMark implements kotlin.time.ComparableTimeMark {
            private final long reading;

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ kotlin.time.TimeSource.Monotonic.ValueTimeMark m1111boximpl(long j) {
                return new kotlin.time.TimeSource.Monotonic.ValueTimeMark(j);
            }

            /* renamed from: constructor-impl, reason: not valid java name */
            public static long m1114constructorimpl(long j) {
                return j;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1116equalsimpl(long j, java.lang.Object obj) {
                return (obj instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark) && j == ((kotlin.time.TimeSource.Monotonic.ValueTimeMark) obj).getReading();
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1117equalsimpl0(long j, long j2) {
                return j == j2;
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1120hashCodeimpl(long j) {
                return java.lang.Long.hashCode(j);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static java.lang.String m1125toStringimpl(long j) {
                return "ValueTimeMark(reading=" + j + ')';
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(java.lang.Object obj) {
                return m1116equalsimpl(this.reading, obj);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m1120hashCodeimpl(this.reading);
            }

            public java.lang.String toString() {
                return m1125toStringimpl(this.reading);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            @Override // java.lang.Comparable
            public int compareTo(kotlin.time.ComparableTimeMark comparableTimeMark) {
                return kotlin.time.ComparableTimeMark.DefaultImpls.compareTo(this, comparableTimeMark);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark mo962minusLRDsOJo(long j) {
                return m1111boximpl(m1126minusLRDsOJo(j));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo962minusLRDsOJo(long j) {
                return m1111boximpl(m1126minusLRDsOJo(j));
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.ComparableTimeMark mo964plusLRDsOJo(long j) {
                return m1111boximpl(m1127plusLRDsOJo(j));
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ kotlin.time.TimeMark mo964plusLRDsOJo(long j) {
                return m1111boximpl(m1127plusLRDsOJo(j));
            }

            private /* synthetic */ ValueTimeMark(long j) {
                this.reading = j;
            }

            /* renamed from: compareTo-impl, reason: not valid java name */
            public static int m1113compareToimpl(long j, kotlin.time.ComparableTimeMark other) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
                return m1111boximpl(j).compareTo(other);
            }

            /* renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m1115elapsedNowUwyO8pc(long j) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m1104elapsedFrom6eNON_k(j);
            }

            @Override // kotlin.time.TimeMark
            /* renamed from: elapsedNow-UwyO8pc */
            public long mo961elapsedNowUwyO8pc() {
                return m1115elapsedNowUwyO8pc(this.reading);
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m1124plusLRDsOJo(long j, long j2) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m1102adjustReading6QKq23U(j, j2);
            }

            /* renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m1127plusLRDsOJo(long j) {
                return m1124plusLRDsOJo(this.reading, j);
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m1122minusLRDsOJo(long j, long j2) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m1102adjustReading6QKq23U(j, kotlin.time.Duration.m1024unaryMinusUwyO8pc(j2));
            }

            /* renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m1126minusLRDsOJo(long j) {
                return m1122minusLRDsOJo(this.reading, j);
            }

            /* renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m1119hasPassedNowimpl(long j) {
                return !kotlin.time.Duration.m1004isNegativeimpl(m1115elapsedNowUwyO8pc(j));
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m1119hasPassedNowimpl(this.reading);
            }

            /* renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m1118hasNotPassedNowimpl(long j) {
                return kotlin.time.Duration.m1004isNegativeimpl(m1115elapsedNowUwyO8pc(j));
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m1118hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            /* renamed from: minus-UwyO8pc */
            public long mo963minusUwyO8pc(kotlin.time.ComparableTimeMark other) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
                return m1123minusUwyO8pc(this.reading, other);
            }

            /* renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m1123minusUwyO8pc(long j, kotlin.time.ComparableTimeMark other) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
                if (!(other instanceof kotlin.time.TimeSource.Monotonic.ValueTimeMark)) {
                    throw new java.lang.IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((java.lang.Object) m1125toStringimpl(j)) + " and " + other);
                }
                return m1121minus6eNON_k(j, ((kotlin.time.TimeSource.Monotonic.ValueTimeMark) other).getReading());
            }

            /* renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m1121minus6eNON_k(long j, long j2) {
                return kotlin.time.MonotonicTimeSource.INSTANCE.m1103differenceBetweenfRLX17w(j, j2);
            }

            /* renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m1112compareTo6eNON_k(long j, long j2) {
                return kotlin.time.Duration.m970compareToLRDsOJo(m1121minus6eNON_k(j, j2), kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc());
            }
        }
    }

    /* compiled from: TimeSource.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        static final /* synthetic */ kotlin.time.TimeSource.Companion $$INSTANCE = new kotlin.time.TimeSource.Companion();

        private Companion() {
        }
    }
}
