package kotlin.time;

/* compiled from: Duration.kt */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u0018\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010jJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "rawValue", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class Duration implements java.lang.Comparable<kotlin.time.Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.time.Duration.Companion INSTANCE = new kotlin.time.Duration.Companion(null);
    private static final long ZERO = m971constructorimpl(0);
    private static final long INFINITE = kotlin.time.DurationKt.access$durationOfMillis(kotlin.time.DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = kotlin.time.DurationKt.access$durationOfMillis(-4611686018427387903L);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.time.Duration m969boximpl(long j) {
        return new kotlin.time.Duration(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m975equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof kotlin.time.Duration) && j == ((kotlin.time.Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m976equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInDays$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInHours$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @kotlin.Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @kotlin.ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m997getUnitDiscriminatorimpl(long j) {
        return ((int) j) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m998getValueimpl(long j) {
        return j >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m999hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m1001isInMillisimpl(long j) {
        return (((int) j) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m1002isInNanosimpl(long j) {
        return (((int) j) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m1003isInfiniteimpl(long j) {
        return j == INFINITE || j == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m1004isNegativeimpl(long j) {
        return j < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m1005isPositiveimpl(long j) {
        return j > 0;
    }

    public boolean equals(java.lang.Object obj) {
        return m975equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m999hashCodeimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(kotlin.time.Duration duration) {
        return m1025compareToLRDsOJo(duration.getRawValue());
    }

    private /* synthetic */ Duration(long j) {
        this.rawValue = j;
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final kotlin.time.DurationUnit m996getStorageUnitimpl(long j) {
        return m1002isInNanosimpl(j) ? kotlin.time.DurationUnit.NANOSECONDS : kotlin.time.DurationUnit.MILLISECONDS;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m971constructorimpl(long j) {
        if (kotlin.time.DurationJvmKt.getDurationAssertionsEnabled()) {
            if (m1002isInNanosimpl(j)) {
                if (!new kotlin.ranges.LongRange(-4611686018426999999L, kotlin.time.DurationKt.MAX_NANOS).contains(m998getValueimpl(j))) {
                    throw new java.lang.AssertionError(m998getValueimpl(j) + " ns is out of nanoseconds range");
                }
            } else {
                if (!new kotlin.ranges.LongRange(-4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS).contains(m998getValueimpl(j))) {
                    throw new java.lang.AssertionError(m998getValueimpl(j) + " ms is out of milliseconds range");
                }
                if (new kotlin.ranges.LongRange(-4611686018426L, 4611686018426L).contains(m998getValueimpl(j))) {
                    throw new java.lang.AssertionError(m998getValueimpl(j) + " ms is denormalized");
                }
            }
        }
        return j;
    }

    /* compiled from: Duration.kt */
    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u0018\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b<J\u0018\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b>J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\"\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\"\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\"\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\"\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\"\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\"\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\"\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(I)V", "(I)J", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1030getDaysUwyO8pc$annotations(double d) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1031getDaysUwyO8pc$annotations(int i) {
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1032getDaysUwyO8pc$annotations(long j) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1036getHoursUwyO8pc$annotations(double d) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1037getHoursUwyO8pc$annotations(int i) {
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1038getHoursUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1042getMicrosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1043getMicrosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1044getMicrosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1048getMillisecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1049getMillisecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1050getMillisecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1054getMinutesUwyO8pc$annotations(double d) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1055getMinutesUwyO8pc$annotations(int i) {
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1056getMinutesUwyO8pc$annotations(long j) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1060getNanosecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1061getNanosecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1062getNanosecondsUwyO8pc$annotations(long j) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1066getSecondsUwyO8pc$annotations(double d) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1067getSecondsUwyO8pc$annotations(int i) {
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m1068getSecondsUwyO8pc$annotations(long j) {
        }

        private Companion() {
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m1074getZEROUwyO8pc() {
            return kotlin.time.Duration.ZERO;
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m1072getINFINITEUwyO8pc() {
            return kotlin.time.Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m1073getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return kotlin.time.Duration.NEG_INFINITE;
        }

        public final double convert(double value, kotlin.time.DurationUnit sourceUnit, kotlin.time.DurationUnit targetUnit) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return kotlin.time.DurationUnitKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1058getNanosecondsUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1059getNanosecondsUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m1057getNanosecondsUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.NANOSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1040getMicrosecondsUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1041getMicrosecondsUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m1039getMicrosecondsUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1046getMillisecondsUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1047getMillisecondsUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m1045getMillisecondsUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.MILLISECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1064getSecondsUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1065getSecondsUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m1063getSecondsUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.SECONDS);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1052getMinutesUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1053getMinutesUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m1051getMinutesUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.MINUTES);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1034getHoursUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1035getHoursUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m1033getHoursUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.HOURS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1028getDaysUwyO8pc(int i) {
            return kotlin.time.DurationKt.toDuration(i, kotlin.time.DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1029getDaysUwyO8pc(long j) {
            return kotlin.time.DurationKt.toDuration(j, kotlin.time.DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m1027getDaysUwyO8pc(double d) {
            return kotlin.time.DurationKt.toDuration(d, kotlin.time.DurationUnit.DAYS);
        }

        @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1088nanosecondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.NANOSECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1089nanosecondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.NANOSECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1087nanosecondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.NANOSECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1079microsecondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MICROSECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1080microsecondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MICROSECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1078microsecondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MICROSECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1082millisecondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MILLISECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1083millisecondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MILLISECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1081millisecondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MILLISECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1095secondsUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.SECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1096secondsUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.SECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1094secondsUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.SECONDS);
        }

        @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1085minutesUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MINUTES);
        }

        @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1086minutesUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MINUTES);
        }

        @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1084minutesUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.MINUTES);
        }

        @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1076hoursUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.HOURS);
        }

        @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1077hoursUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.HOURS);
        }

        @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1075hoursUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.HOURS);
        }

        @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1070daysUwyO8pc(int value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.DAYS);
        }

        @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1071daysUwyO8pc(long value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.DAYS);
        }

        @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m1069daysUwyO8pc(double value) {
            return kotlin.time.DurationKt.toDuration(value, kotlin.time.DurationUnit.DAYS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m1090parseUwyO8pc(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            try {
                return kotlin.time.DurationKt.access$parseDuration(value, false);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Invalid duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m1091parseIsoStringUwyO8pc(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            try {
                return kotlin.time.DurationKt.access$parseDuration(value, true);
            } catch (java.lang.IllegalArgumentException e) {
                throw new java.lang.IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e);
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m1093parseOrNullFghU774(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            try {
                return kotlin.time.Duration.m969boximpl(kotlin.time.DurationKt.access$parseDuration(value, false));
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final kotlin.time.Duration m1092parseIsoStringOrNullFghU774(java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            try {
                return kotlin.time.Duration.m969boximpl(kotlin.time.DurationKt.access$parseDuration(value, true));
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m1024unaryMinusUwyO8pc(long j) {
        return kotlin.time.DurationKt.access$durationOf(-m998getValueimpl(j), ((int) j) & 1);
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m1007plusLRDsOJo(long j, long j2) {
        if (m1003isInfiniteimpl(j)) {
            if (m1000isFiniteimpl(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new java.lang.IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m1003isInfiniteimpl(j2)) {
            return j2;
        }
        if ((((int) j) & 1) == (((int) j2) & 1)) {
            long m998getValueimpl = m998getValueimpl(j) + m998getValueimpl(j2);
            if (m1002isInNanosimpl(j)) {
                return kotlin.time.DurationKt.access$durationOfNanosNormalized(m998getValueimpl);
            }
            return kotlin.time.DurationKt.access$durationOfMillisNormalized(m998getValueimpl);
        }
        if (m1001isInMillisimpl(j)) {
            return m967addValuesMixedRangesUwyO8pc(j, m998getValueimpl(j), m998getValueimpl(j2));
        }
        return m967addValuesMixedRangesUwyO8pc(j, m998getValueimpl(j2), m998getValueimpl(j));
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m967addValuesMixedRangesUwyO8pc(long j, long j2, long j3) {
        long access$nanosToMillis = kotlin.time.DurationKt.access$nanosToMillis(j3);
        long j4 = j2 + access$nanosToMillis;
        if (new kotlin.ranges.LongRange(-4611686018426L, 4611686018426L).contains(j4)) {
            return kotlin.time.DurationKt.access$durationOfNanos(kotlin.time.DurationKt.access$millisToNanos(j4) + (j3 - kotlin.time.DurationKt.access$millisToNanos(access$nanosToMillis)));
        }
        return kotlin.time.DurationKt.access$durationOfMillis(kotlin.ranges.RangesKt.coerceIn(j4, -4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS));
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m1006minusLRDsOJo(long j, long j2) {
        return m1007plusLRDsOJo(j, m1024unaryMinusUwyO8pc(j2));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1009timesUwyO8pc(long j, int i) {
        if (m1003isInfiniteimpl(j)) {
            if (i != 0) {
                return i > 0 ? j : m1024unaryMinusUwyO8pc(j);
            }
            throw new java.lang.IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i == 0) {
            return ZERO;
        }
        long m998getValueimpl = m998getValueimpl(j);
        long j2 = i;
        long j3 = m998getValueimpl * j2;
        if (!m1002isInNanosimpl(j)) {
            if (j3 / j2 == m998getValueimpl) {
                return kotlin.time.DurationKt.access$durationOfMillis(kotlin.ranges.RangesKt.coerceIn(j3, new kotlin.ranges.LongRange(-4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS)));
            }
            return kotlin.math.MathKt.getSign(m998getValueimpl) * kotlin.math.MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (new kotlin.ranges.LongRange(-2147483647L, 2147483647L).contains(m998getValueimpl)) {
            return kotlin.time.DurationKt.access$durationOfNanos(j3);
        }
        if (j3 / j2 == m998getValueimpl) {
            return kotlin.time.DurationKt.access$durationOfNanosNormalized(j3);
        }
        long access$nanosToMillis = kotlin.time.DurationKt.access$nanosToMillis(m998getValueimpl);
        long j4 = access$nanosToMillis * j2;
        long access$nanosToMillis2 = kotlin.time.DurationKt.access$nanosToMillis((m998getValueimpl - kotlin.time.DurationKt.access$millisToNanos(access$nanosToMillis)) * j2) + j4;
        if (j4 / j2 != access$nanosToMillis || (access$nanosToMillis2 ^ j4) < 0) {
            return kotlin.math.MathKt.getSign(m998getValueimpl) * kotlin.math.MathKt.getSign(i) > 0 ? INFINITE : NEG_INFINITE;
        }
        return kotlin.time.DurationKt.access$durationOfMillis(kotlin.ranges.RangesKt.coerceIn(access$nanosToMillis2, new kotlin.ranges.LongRange(-4611686018427387903L, kotlin.time.DurationKt.MAX_MILLIS)));
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m1008timesUwyO8pc(long j, double d) {
        int roundToInt = kotlin.math.MathKt.roundToInt(d);
        if (roundToInt == d) {
            return m1009timesUwyO8pc(j, roundToInt);
        }
        kotlin.time.DurationUnit m996getStorageUnitimpl = m996getStorageUnitimpl(j);
        return kotlin.time.DurationKt.toDuration(m1014toDoubleimpl(j, m996getStorageUnitimpl) * d, m996getStorageUnitimpl);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m974divUwyO8pc(long j, int i) {
        if (i == 0) {
            if (m1005isPositiveimpl(j)) {
                return INFINITE;
            }
            if (m1004isNegativeimpl(j)) {
                return NEG_INFINITE;
            }
            throw new java.lang.IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m1002isInNanosimpl(j)) {
            return kotlin.time.DurationKt.access$durationOfNanos(m998getValueimpl(j) / i);
        }
        if (m1003isInfiniteimpl(j)) {
            return m1009timesUwyO8pc(j, kotlin.math.MathKt.getSign(i));
        }
        long j2 = i;
        long m998getValueimpl = m998getValueimpl(j) / j2;
        if (new kotlin.ranges.LongRange(-4611686018426L, 4611686018426L).contains(m998getValueimpl)) {
            return kotlin.time.DurationKt.access$durationOfNanos(kotlin.time.DurationKt.access$millisToNanos(m998getValueimpl) + (kotlin.time.DurationKt.access$millisToNanos(m998getValueimpl(j) - (m998getValueimpl * j2)) / j2));
        }
        return kotlin.time.DurationKt.access$durationOfMillis(m998getValueimpl);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m973divUwyO8pc(long j, double d) {
        int roundToInt = kotlin.math.MathKt.roundToInt(d);
        if (roundToInt == d && roundToInt != 0) {
            return m974divUwyO8pc(j, roundToInt);
        }
        kotlin.time.DurationUnit m996getStorageUnitimpl = m996getStorageUnitimpl(j);
        return kotlin.time.DurationKt.toDuration(m1014toDoubleimpl(j, m996getStorageUnitimpl) / d, m996getStorageUnitimpl);
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m972divLRDsOJo(long j, long j2) {
        kotlin.time.DurationUnit durationUnit = (kotlin.time.DurationUnit) kotlin.comparisons.ComparisonsKt.maxOf(m996getStorageUnitimpl(j), m996getStorageUnitimpl(j2));
        return m1014toDoubleimpl(j, durationUnit) / m1014toDoubleimpl(j2, durationUnit);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m1023truncateToUwyO8pc$kotlin_stdlib(long j, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        kotlin.time.DurationUnit m996getStorageUnitimpl = m996getStorageUnitimpl(j);
        if (unit.compareTo(m996getStorageUnitimpl) <= 0 || m1003isInfiniteimpl(j)) {
            return j;
        }
        return kotlin.time.DurationKt.toDuration(m998getValueimpl(j) - (m998getValueimpl(j) % kotlin.time.DurationUnitKt.convertDurationUnit(1L, unit, m996getStorageUnitimpl)), m996getStorageUnitimpl);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m1000isFiniteimpl(long j) {
        return !m1003isInfiniteimpl(j);
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m977getAbsoluteValueUwyO8pc(long j) {
        return m1004isNegativeimpl(j) ? m1024unaryMinusUwyO8pc(j) : j;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m1025compareToLRDsOJo(long j) {
        return m970compareToLRDsOJo(this.rawValue, j);
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m970compareToLRDsOJo(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return kotlin.jvm.internal.Intrinsics.compare(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return m1004isNegativeimpl(j) ? -i : i;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1013toComponentsimpl(long j, kotlin.jvm.functions.Function5<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Long.valueOf(m986getInWholeDaysimpl(j)), java.lang.Integer.valueOf(m978getHoursComponentimpl(j)), java.lang.Integer.valueOf(m993getMinutesComponentimpl(j)), java.lang.Integer.valueOf(m995getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m994getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1012toComponentsimpl(long j, kotlin.jvm.functions.Function4<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Long.valueOf(m987getInWholeHoursimpl(j)), java.lang.Integer.valueOf(m993getMinutesComponentimpl(j)), java.lang.Integer.valueOf(m995getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m994getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1011toComponentsimpl(long j, kotlin.jvm.functions.Function3<? super java.lang.Long, ? super java.lang.Integer, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Long.valueOf(m990getInWholeMinutesimpl(j)), java.lang.Integer.valueOf(m995getSecondsComponentimpl(j)), java.lang.Integer.valueOf(m994getNanosecondsComponentimpl(j)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m1010toComponentsimpl(long j, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Integer, ? extends T> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(java.lang.Long.valueOf(m992getInWholeSecondsimpl(j)), java.lang.Integer.valueOf(m994getNanosecondsComponentimpl(j)));
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m978getHoursComponentimpl(long j) {
        if (m1003isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m987getInWholeHoursimpl(j) % 24);
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m993getMinutesComponentimpl(long j) {
        if (m1003isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m990getInWholeMinutesimpl(j) % 60);
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m995getSecondsComponentimpl(long j) {
        if (m1003isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m992getInWholeSecondsimpl(j) % 60);
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m994getNanosecondsComponentimpl(long j) {
        if (m1003isInfiniteimpl(j)) {
            return 0;
        }
        return (int) (m1001isInMillisimpl(j) ? kotlin.time.DurationKt.access$millisToNanos(m998getValueimpl(j) % 1000) : m998getValueimpl(j) % okhttp3.internal.http2.Http2Connection.DEGRADED_PONG_TIMEOUT_NS);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m1014toDoubleimpl(long j, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return kotlin.time.DurationUnitKt.convertDurationUnit(m998getValueimpl(j), m996getStorageUnitimpl(j), unit);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m1017toLongimpl(long j, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (j == INFINITE) {
            return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        }
        if (j == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return kotlin.time.DurationUnitKt.convertDurationUnit(m998getValueimpl(j), m996getStorageUnitimpl(j), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m1015toIntimpl(long j, kotlin.time.DurationUnit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) kotlin.ranges.RangesKt.coerceIn(m1017toLongimpl(j, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m986getInWholeDaysimpl(long j) {
        return m1017toLongimpl(j, kotlin.time.DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m987getInWholeHoursimpl(long j) {
        return m1017toLongimpl(j, kotlin.time.DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m990getInWholeMinutesimpl(long j) {
        return m1017toLongimpl(j, kotlin.time.DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m992getInWholeSecondsimpl(long j) {
        return m1017toLongimpl(j, kotlin.time.DurationUnit.SECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m989getInWholeMillisecondsimpl(long j) {
        return (m1001isInMillisimpl(j) && m1000isFiniteimpl(j)) ? m998getValueimpl(j) : m1017toLongimpl(j, kotlin.time.DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m988getInWholeMicrosecondsimpl(long j) {
        return m1017toLongimpl(j, kotlin.time.DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m991getInWholeNanosecondsimpl(long j) {
        long m998getValueimpl = m998getValueimpl(j);
        if (m1002isInNanosimpl(j)) {
            return m998getValueimpl;
        }
        if (m998getValueimpl > 9223372036854L) {
            return kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        }
        if (m998getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return kotlin.time.DurationKt.access$millisToNanos(m998getValueimpl);
    }

    public java.lang.String toString() {
        return m1020toStringimpl(this.rawValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1020toStringimpl(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == INFINITE) {
            return "Infinity";
        }
        if (j == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean m1004isNegativeimpl = m1004isNegativeimpl(j);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (m1004isNegativeimpl) {
            sb.append('-');
        }
        long m977getAbsoluteValueUwyO8pc = m977getAbsoluteValueUwyO8pc(j);
        long m986getInWholeDaysimpl = m986getInWholeDaysimpl(m977getAbsoluteValueUwyO8pc);
        int m978getHoursComponentimpl = m978getHoursComponentimpl(m977getAbsoluteValueUwyO8pc);
        int m993getMinutesComponentimpl = m993getMinutesComponentimpl(m977getAbsoluteValueUwyO8pc);
        int m995getSecondsComponentimpl = m995getSecondsComponentimpl(m977getAbsoluteValueUwyO8pc);
        int m994getNanosecondsComponentimpl = m994getNanosecondsComponentimpl(m977getAbsoluteValueUwyO8pc);
        int i = 0;
        boolean z = m986getInWholeDaysimpl != 0;
        boolean z2 = m978getHoursComponentimpl != 0;
        boolean z3 = m993getMinutesComponentimpl != 0;
        boolean z4 = (m995getSecondsComponentimpl == 0 && m994getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(m986getInWholeDaysimpl).append('d');
            i = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m978getHoursComponentimpl).append('h');
            i = i2;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(m993getMinutesComponentimpl).append('m');
            i = i3;
        }
        if (z4) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (m995getSecondsComponentimpl != 0 || z || z2 || z3) {
                m968appendFractionalimpl(j, sb, m995getSecondsComponentimpl, m994getNanosecondsComponentimpl, 9, "s", false);
            } else if (m994getNanosecondsComponentimpl >= 1000000) {
                m968appendFractionalimpl(j, sb, m994getNanosecondsComponentimpl / kotlin.time.DurationKt.NANOS_IN_MILLIS, m994getNanosecondsComponentimpl % kotlin.time.DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (m994getNanosecondsComponentimpl >= 1000) {
                m968appendFractionalimpl(j, sb, m994getNanosecondsComponentimpl / 1000, m994getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(m994getNanosecondsComponentimpl).append("ns");
            }
            i = i4;
        }
        if (m1004isNegativeimpl && i > 1) {
            sb.insert(1, '(').append(')');
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m968appendFractionalimpl(long j, java.lang.StringBuilder sb, int i, int i2, int i3, java.lang.String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            java.lang.String padStart = kotlin.text.StringsKt.padStart(java.lang.String.valueOf(i2), i3, '0');
            int i4 = -1;
            int length = padStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (padStart.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z && i6 < 3) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.append((java.lang.CharSequence) padStart, 0, i6), "append(...)");
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.append((java.lang.CharSequence) padStart, 0, ((i4 + 3) / 3) * 3), "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m1022toStringimpl$default(long j, kotlin.time.DurationUnit durationUnit, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return m1021toStringimpl(j, durationUnit, i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final java.lang.String m1021toStringimpl(long j, kotlin.time.DurationUnit unit, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "unit");
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("decimals must be not negative, but was " + i).toString());
        }
        double m1014toDoubleimpl = m1014toDoubleimpl(j, unit);
        return java.lang.Double.isInfinite(m1014toDoubleimpl) ? java.lang.String.valueOf(m1014toDoubleimpl) : kotlin.time.DurationJvmKt.formatToExactDecimals(m1014toDoubleimpl, kotlin.ranges.RangesKt.coerceAtMost(i, 12)) + kotlin.time.DurationUnitKt.shortName(unit);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final java.lang.String m1016toIsoStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (m1004isNegativeimpl(j)) {
            sb.append('-');
        }
        sb.append("PT");
        long m977getAbsoluteValueUwyO8pc = m977getAbsoluteValueUwyO8pc(j);
        long m987getInWholeHoursimpl = m987getInWholeHoursimpl(m977getAbsoluteValueUwyO8pc);
        int m993getMinutesComponentimpl = m993getMinutesComponentimpl(m977getAbsoluteValueUwyO8pc);
        int m995getSecondsComponentimpl = m995getSecondsComponentimpl(m977getAbsoluteValueUwyO8pc);
        int m994getNanosecondsComponentimpl = m994getNanosecondsComponentimpl(m977getAbsoluteValueUwyO8pc);
        if (m1003isInfiniteimpl(j)) {
            m987getInWholeHoursimpl = 9999999999999L;
        }
        boolean z = true;
        boolean z2 = m987getInWholeHoursimpl != 0;
        boolean z3 = (m995getSecondsComponentimpl == 0 && m994getNanosecondsComponentimpl == 0) ? false : true;
        if (m993getMinutesComponentimpl == 0 && (!z3 || !z2)) {
            z = false;
        }
        if (z2) {
            sb.append(m987getInWholeHoursimpl).append('H');
        }
        if (z) {
            sb.append(m993getMinutesComponentimpl).append('M');
        }
        if (z3 || (!z2 && !z)) {
            m968appendFractionalimpl(j, sb, m995getSecondsComponentimpl, m994getNanosecondsComponentimpl, 9, "S", true);
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
