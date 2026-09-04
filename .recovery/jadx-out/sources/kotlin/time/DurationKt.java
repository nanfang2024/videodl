package kotlin.time;

/* compiled from: Duration.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010&\u001a\u0015\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a\u001d\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\bB\u0010C\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010G\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010H\u001a\u0019\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"\u001e\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"\u001e\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"\u001e\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"\u001e\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"\u001e\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010¨\u0006J"}, d2 = {"MAX_MILLIS", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "days", "Lkotlin/time/Duration;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "strictIso", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(long j) {
    }

    @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(long j) {
    }

    @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(long j) {
    }

    @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(long j) {
    }

    @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(long j) {
    }

    @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(long j) {
    }

    @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(double d) {
    }

    @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(int i) {
    }

    @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(long j) {
    }

    public static final long millisToNanos(long j) {
        return j * NANOS_IN_MILLIS;
    }

    public static final long toDuration(int i, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (unit.compareTo(kotlin.time.DurationUnit.SECONDS) <= 0) {
            return durationOfNanos(kotlin.time.DurationUnitKt.convertDurationUnitOverflow(i, unit, kotlin.time.DurationUnit.NANOSECONDS));
        }
        return toDuration(i, unit);
    }

    public static final long toDuration(long j, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        long convertDurationUnitOverflow = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(MAX_NANOS, kotlin.time.DurationUnit.NANOSECONDS, unit);
        if (new kotlin.ranges.LongRange(-convertDurationUnitOverflow, convertDurationUnitOverflow).contains(j)) {
            return durationOfNanos(kotlin.time.DurationUnitKt.convertDurationUnitOverflow(j, unit, kotlin.time.DurationUnit.NANOSECONDS));
        }
        return durationOfMillis(kotlin.ranges.RangesKt.coerceIn(kotlin.time.DurationUnitKt.convertDurationUnit(j, unit, kotlin.time.DurationUnit.MILLISECONDS), -4611686018427387903L, MAX_MILLIS));
    }

    public static final long toDuration(double d, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        double convertDurationUnit = kotlin.time.DurationUnitKt.convertDurationUnit(d, unit, kotlin.time.DurationUnit.NANOSECONDS);
        if (!(!java.lang.Double.isNaN(convertDurationUnit))) {
            throw new java.lang.IllegalArgumentException("Duration value cannot be NaN.".toString());
        }
        long roundToLong = kotlin.math.MathKt.roundToLong(convertDurationUnit);
        if (new kotlin.ranges.LongRange(-4611686018426999999L, MAX_NANOS).contains(roundToLong)) {
            return durationOfNanos(roundToLong);
        }
        return durationOfMillisNormalized(kotlin.math.MathKt.roundToLong(kotlin.time.DurationUnitKt.convertDurationUnit(d, unit, kotlin.time.DurationUnit.MILLISECONDS)));
    }

    /* renamed from: times-mvk6XK0 */
    private static final long m1098timesmvk6XK0(int i, long j) {
        return kotlin.time.Duration.m1009timesUwyO8pc(j, i);
    }

    /* renamed from: times-kIfJnKk */
    private static final long m1097timeskIfJnKk(double d, long j) {
        return kotlin.time.Duration.m1008timesUwyO8pc(j, d);
    }

    public static final long parseDuration(java.lang.String str, boolean z) {
        boolean z2;
        kotlin.time.DurationUnit durationUnit;
        boolean z3;
        boolean z4;
        java.lang.String str2 = str;
        int length = str.length();
        if (length == 0) {
            throw new java.lang.IllegalArgumentException("The string is empty");
        }
        long m1074getZEROUwyO8pc = kotlin.time.Duration.INSTANCE.m1074getZEROUwyO8pc();
        char charAt = str2.charAt(0);
        boolean z5 = true;
        int i = (charAt == '+' || charAt == '-') ? 1 : 0;
        boolean z6 = i > 0;
        boolean z7 = z6 && kotlin.text.StringsKt.startsWith$default((java.lang.CharSequence) str2, '-', false, 2, (java.lang.Object) null);
        if (length <= i) {
            throw new java.lang.IllegalArgumentException("No components");
        }
        char c = '9';
        char c2 = '0';
        if (str2.charAt(i) == 'P') {
            int i2 = i + 1;
            if (i2 == length) {
                throw new java.lang.IllegalArgumentException();
            }
            boolean z8 = false;
            kotlin.time.DurationUnit durationUnit2 = null;
            while (i2 < length) {
                if (str2.charAt(i2) != 'T') {
                    int i3 = i2;
                    while (true) {
                        if (i3 >= str.length()) {
                            z3 = z7;
                            break;
                        }
                        char charAt2 = str2.charAt(i3);
                        if (!new kotlin.ranges.CharRange(c2, c).contains(charAt2)) {
                            z3 = z7;
                            if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "+-.", charAt2, false, 2, (java.lang.Object) null)) {
                                break;
                            }
                        } else {
                            z3 = z7;
                        }
                        i3++;
                        z7 = z3;
                        c2 = '0';
                        c = '9';
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                    java.lang.String substring = str2.substring(i2, i3);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    java.lang.String str3 = substring;
                    if (str3.length() == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int length2 = i2 + substring.length();
                    java.lang.String str4 = str2;
                    if (length2 < 0 || length2 > kotlin.text.StringsKt.getLastIndex(str4)) {
                        throw new java.lang.IllegalArgumentException("Missing unit for value " + substring);
                    }
                    char charAt3 = str4.charAt(length2);
                    i2 = length2 + 1;
                    kotlin.time.DurationUnit durationUnitByIsoChar = kotlin.time.DurationUnitKt.durationUnitByIsoChar(charAt3, z8);
                    if (durationUnit2 != null && durationUnit2.compareTo(durationUnitByIsoChar) <= 0) {
                        throw new java.lang.IllegalArgumentException("Unexpected order of duration components");
                    }
                    int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str3, '.', 0, false, 6, (java.lang.Object) null);
                    if (durationUnitByIsoChar == kotlin.time.DurationUnit.SECONDS && indexOf$default > 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String substring2 = substring.substring(0, indexOf$default);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        z4 = z8;
                        long m1007plusLRDsOJo = kotlin.time.Duration.m1007plusLRDsOJo(m1074getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(substring2), durationUnitByIsoChar));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String substring3 = substring.substring(indexOf$default);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                        m1074getZEROUwyO8pc = kotlin.time.Duration.m1007plusLRDsOJo(m1007plusLRDsOJo, toDuration(java.lang.Double.parseDouble(substring3), durationUnitByIsoChar));
                    } else {
                        z4 = z8;
                        m1074getZEROUwyO8pc = kotlin.time.Duration.m1007plusLRDsOJo(m1074getZEROUwyO8pc, toDuration(parseOverLongIsoComponent(substring), durationUnitByIsoChar));
                    }
                    z8 = z4;
                    durationUnit2 = durationUnitByIsoChar;
                    z7 = z3;
                    c2 = '0';
                    c = '9';
                    z5 = true;
                } else {
                    if (z8 || (i2 = i2 + 1) == length) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    z8 = z5;
                }
            }
            z2 = z7;
        } else {
            z2 = z7;
            if (z) {
                throw new java.lang.IllegalArgumentException();
            }
            java.lang.String str5 = "Unexpected order of duration components";
            if (kotlin.text.StringsKt.regionMatches(str, i, "Infinity", 0, java.lang.Math.max(length - i, 8), true)) {
                m1074getZEROUwyO8pc = kotlin.time.Duration.INSTANCE.m1072getINFINITEUwyO8pc();
            } else {
                boolean z9 = !z6;
                if (z6 && str2.charAt(i) == '(' && kotlin.text.StringsKt.last(str2) == ')') {
                    i++;
                    length--;
                    if (i == length) {
                        throw new java.lang.IllegalArgumentException("No components");
                    }
                    durationUnit = null;
                    z9 = true;
                } else {
                    durationUnit = null;
                }
                boolean z10 = false;
                while (i < length) {
                    if (z10 && z9) {
                        while (i < str.length() && str2.charAt(i) == ' ') {
                            i++;
                        }
                    }
                    int i4 = i;
                    while (i4 < str.length()) {
                        char charAt4 = str2.charAt(i4);
                        if (!new kotlin.ranges.CharRange('0', '9').contains(charAt4) && charAt4 != '.') {
                            break;
                        }
                        i4++;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                    java.lang.String substring4 = str2.substring(i, i4);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
                    java.lang.String str6 = substring4;
                    if (str6.length() == 0) {
                        throw new java.lang.IllegalArgumentException();
                    }
                    int length3 = i + substring4.length();
                    int i5 = length3;
                    while (i5 < str.length()) {
                        if (!new kotlin.ranges.CharRange('a', 'z').contains(str2.charAt(i5))) {
                            break;
                        }
                        i5++;
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type java.lang.String");
                    java.lang.String substring5 = str2.substring(length3, i5);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring5, "substring(...)");
                    i = length3 + substring5.length();
                    kotlin.time.DurationUnit durationUnitByShortName = kotlin.time.DurationUnitKt.durationUnitByShortName(substring5);
                    if (durationUnit != null && durationUnit.compareTo(durationUnitByShortName) <= 0) {
                        throw new java.lang.IllegalArgumentException(str5);
                    }
                    java.lang.String str7 = str5;
                    int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str6, '.', 0, false, 6, (java.lang.Object) null);
                    if (indexOf$default2 > 0) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(substring4, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String substring6 = substring4.substring(0, indexOf$default2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring6, "substring(...)");
                        long m1007plusLRDsOJo2 = kotlin.time.Duration.m1007plusLRDsOJo(m1074getZEROUwyO8pc, toDuration(java.lang.Long.parseLong(substring6), durationUnitByShortName));
                        kotlin.jvm.internal.Intrinsics.checkNotNull(substring4, "null cannot be cast to non-null type java.lang.String");
                        java.lang.String substring7 = substring4.substring(indexOf$default2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring7, "substring(...)");
                        m1074getZEROUwyO8pc = kotlin.time.Duration.m1007plusLRDsOJo(m1007plusLRDsOJo2, toDuration(java.lang.Double.parseDouble(substring7), durationUnitByShortName));
                        if (i < length) {
                            throw new java.lang.IllegalArgumentException("Fractional component must be last");
                        }
                    } else {
                        m1074getZEROUwyO8pc = kotlin.time.Duration.m1007plusLRDsOJo(m1074getZEROUwyO8pc, toDuration(java.lang.Long.parseLong(substring4), durationUnitByShortName));
                    }
                    str2 = str;
                    str5 = str7;
                    durationUnit = durationUnitByShortName;
                    z10 = true;
                }
            }
        }
        return z2 ? kotlin.time.Duration.m1024unaryMinusUwyO8pc(m1074getZEROUwyO8pc) : m1074getZEROUwyO8pc;
    }

    private static final long parseOverLongIsoComponent(java.lang.String str) {
        int length = str.length();
        int i = (length <= 0 || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) "+-", str.charAt(0), false, 2, (java.lang.Object) null)) ? 0 : 1;
        if (length - i > 16) {
            java.lang.Iterable intRange = new kotlin.ranges.IntRange(i, kotlin.text.StringsKt.getLastIndex(str));
            if (!(intRange instanceof java.util.Collection) || !((java.util.Collection) intRange).isEmpty()) {
                java.util.Iterator it = intRange.iterator();
                while (it.hasNext()) {
                    if (!new kotlin.ranges.CharRange('0', '9').contains(str.charAt(((kotlin.collections.IntIterator) it).nextInt()))) {
                    }
                }
            }
            if (str.charAt(0) == '-') {
                return Long.MIN_VALUE;
            }
            return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        }
        if (kotlin.text.StringsKt.startsWith$default(str, "+", false, 2, (java.lang.Object) null)) {
            str = kotlin.text.StringsKt.drop(str, 1);
        }
        return java.lang.Long.parseLong(str);
    }

    private static final int skipWhile(java.lang.String str, int i, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        while (i < str.length() && function1.invoke(java.lang.Character.valueOf(str.charAt(i))).booleanValue()) {
            i++;
        }
        return i;
    }

    public static final long nanosToMillis(long j) {
        return j / NANOS_IN_MILLIS;
    }

    public static final long durationOfNanos(long j) {
        return kotlin.time.Duration.m971constructorimpl(j << 1);
    }

    public static final long durationOfMillis(long j) {
        return kotlin.time.Duration.m971constructorimpl((j << 1) + 1);
    }

    public static final long durationOf(long j, int i) {
        return kotlin.time.Duration.m971constructorimpl((j << 1) + i);
    }

    public static final long durationOfNanosNormalized(long j) {
        if (new kotlin.ranges.LongRange(-4611686018426999999L, MAX_NANOS).contains(j)) {
            return durationOfNanos(j);
        }
        return durationOfMillis(nanosToMillis(j));
    }

    public static final long durationOfMillisNormalized(long j) {
        if (new kotlin.ranges.LongRange(-4611686018426L, MAX_NANOS_IN_MILLIS).contains(j)) {
            return durationOfNanos(millisToNanos(j));
        }
        return durationOfMillis(kotlin.ranges.RangesKt.coerceIn(j, -4611686018427387903L, MAX_MILLIS));
    }

    private static final java.lang.String substringWhile(java.lang.String str, int i, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> function1) {
        int i2 = i;
        while (i2 < str.length() && function1.invoke(java.lang.Character.valueOf(str.charAt(i2))).booleanValue()) {
            i2++;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }
}
