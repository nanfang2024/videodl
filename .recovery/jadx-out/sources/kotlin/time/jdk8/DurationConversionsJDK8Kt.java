package kotlin.time.jdk8;

/* compiled from: DurationConversions.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0002*\u00020\u0001H\u0087\b¢\u0006\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"toJavaDuration", "Ljava/time/Duration;", "Lkotlin/time/Duration;", "toJavaDuration-LRDsOJo", "(J)Ljava/time/Duration;", "toKotlinDuration", "(Ljava/time/Duration;)J", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.time", xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DurationConversionsJDK8Kt {
    private static final long toKotlinDuration(java.time.Duration duration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(duration, "<this>");
        return kotlin.time.Duration.m1007plusLRDsOJo(kotlin.time.DurationKt.toDuration(duration.getSeconds(), kotlin.time.DurationUnit.SECONDS), kotlin.time.DurationKt.toDuration(duration.getNano(), kotlin.time.DurationUnit.NANOSECONDS));
    }

    /* renamed from: toJavaDuration-LRDsOJo, reason: not valid java name */
    private static final java.time.Duration m1133toJavaDurationLRDsOJo(long j) {
        java.time.Duration ofSeconds = java.time.Duration.ofSeconds(kotlin.time.Duration.m992getInWholeSecondsimpl(j), kotlin.time.Duration.m994getNanosecondsComponentimpl(j));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(ofSeconds, "toComponents-impl(...)");
        return ofSeconds;
    }
}
