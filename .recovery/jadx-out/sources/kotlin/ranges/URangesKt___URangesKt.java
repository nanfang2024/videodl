package kotlin.ranges;

/* compiled from: _URanges.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001b\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u001b\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001b\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0012\u0010\n\u001a\u001b\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\r\u001a#\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a!\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a#\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\n¢\u0006\u0002\b*\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002¢\u0006\u0004\b+\u0010,\u001a\u001c\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b-\u0010.\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b0\u00101\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002¢\u0006\u0004\b2\u00103\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\n¢\u0006\u0002\b4\u001a\u001c\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002¢\u0006\u0004\b5\u00106\u001a\u001c\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\b:\u0010;\u001a\u001c\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\b<\u0010=\u001a\u001c\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\b?\u0010@\u001a\u001c\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010C\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010C\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0011\u0010G\u001a\u00020\u0005*\u000208H\u0007¢\u0006\u0002\u0010D\u001a\u0011\u0010G\u001a\u00020\b*\u00020>H\u0007¢\u0006\u0002\u0010E\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007\u001a\u000e\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007\u001a\u0012\u0010I\u001a\u00020\u0005*\u00020%H\u0087\b¢\u0006\u0002\u0010J\u001a\u0019\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010L\u001a\u0012\u0010I\u001a\u00020\b*\u00020/H\u0087\b¢\u0006\u0002\u0010M\u001a\u0019\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007¢\u0006\u0002\u0010N\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007\u001a\u000f\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\b\u001a\u0016\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004¢\u0006\u0004\bU\u0010V\u001a\u001c\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004¢\u0006\u0004\bW\u0010X\u001a\u001c\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004¢\u0006\u0004\b[\u0010\\¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: /workspace/.recovery/dex/classes3.dex */
class URangesKt___URangesKt {
    public static final int first(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + uIntProgression + " is empty.");
        }
        return uIntProgression.getFirst();
    }

    public static final long first(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + uLongProgression + " is empty.");
        }
        return uLongProgression.getFirst();
    }

    public static final kotlin.UInt firstOrNull(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return kotlin.UInt.box-impl(uIntProgression.getFirst());
    }

    public static final kotlin.ULong firstOrNull(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return kotlin.ULong.box-impl(uLongProgression.getFirst());
    }

    public static final int last(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + uIntProgression + " is empty.");
        }
        return uIntProgression.getLast();
    }

    public static final long last(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            throw new java.util.NoSuchElementException("Progression " + uLongProgression + " is empty.");
        }
        return uLongProgression.getLast();
    }

    public static final kotlin.UInt lastOrNull(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        if (uIntProgression.isEmpty()) {
            return null;
        }
        return kotlin.UInt.box-impl(uIntProgression.getLast());
    }

    public static final kotlin.ULong lastOrNull(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        if (uLongProgression.isEmpty()) {
            return null;
        }
        return kotlin.ULong.box-impl(uLongProgression.getLast());
    }

    private static final int random(kotlin.ranges.UIntRange uIntRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return kotlin.ranges.URangesKt.random(uIntRange, kotlin.random.Random.INSTANCE);
    }

    private static final long random(kotlin.ranges.ULongRange uLongRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return kotlin.ranges.URangesKt.random(uLongRange, kotlin.random.Random.INSTANCE);
    }

    public static final int random(kotlin.ranges.UIntRange uIntRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.URandomKt.nextUInt(random, uIntRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    public static final long random(kotlin.ranges.ULongRange uLongRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        try {
            return kotlin.random.URandomKt.nextULong(random, uLongRange);
        } catch (java.lang.IllegalArgumentException e) {
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }

    private static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange uIntRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        return kotlin.ranges.URangesKt.randomOrNull(uIntRange, kotlin.random.Random.INSTANCE);
    }

    private static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange uLongRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        return kotlin.ranges.URangesKt.randomOrNull(uLongRange, kotlin.random.Random.INSTANCE);
    }

    public static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange uIntRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (uIntRange.isEmpty()) {
            return null;
        }
        return kotlin.UInt.box-impl(kotlin.random.URandomKt.nextUInt(random, uIntRange));
    }

    public static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange uLongRange, kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongRange, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "random");
        if (uLongRange.isEmpty()) {
            return null;
        }
        return kotlin.ULong.box-impl(kotlin.random.URandomKt.nextULong(random, uLongRange));
    }

    /* renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m906containsbiwQdVI(kotlin.ranges.UIntRange contains, kotlin.UInt uInt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uInt != null && contains.m874containsWZ4Q5Ns(uInt.unbox-impl());
    }

    /* renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m902containsGYNo2lE(kotlin.ranges.ULongRange contains, kotlin.ULong uLong) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return uLong != null && contains.m883containsVKZWuLQ(uLong.unbox-impl());
    }

    /* renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m901contains68kG9v0(kotlin.ranges.UIntRange contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m874containsWZ4Q5Ns(kotlin.UInt.constructor-impl(b & 255));
    }

    /* renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m904containsULbyJY(kotlin.ranges.ULongRange contains, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m883containsVKZWuLQ(kotlin.ULong.constructor-impl(b & 255));
    }

    /* renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m903containsGab390E(kotlin.ranges.ULongRange contains, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m883containsVKZWuLQ(kotlin.ULong.constructor-impl(i & 4294967295L));
    }

    /* renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m907containsfz5IDCE(kotlin.ranges.UIntRange contains, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return kotlin.ULong.constructor-impl(j >>> 32) == 0 && contains.m874containsWZ4Q5Ns(kotlin.UInt.constructor-impl((int) j));
    }

    /* renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m905containsZsK3CEQ(kotlin.ranges.UIntRange contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m874containsWZ4Q5Ns(kotlin.UInt.constructor-impl(s & 65535));
    }

    /* renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m908containsuhHAxoY(kotlin.ranges.ULongRange contains, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m883containsVKZWuLQ(kotlin.ULong.constructor-impl(s & okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m911downToKr8caGY(byte b, byte b2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m871fromClosedRangeNkh28Cs(kotlin.UInt.constructor-impl(b & 255), kotlin.UInt.constructor-impl(b2 & 255), -1);
    }

    /* renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m910downToJ1ME1BU(int i, int i2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m871fromClosedRangeNkh28Cs(i, i2, -1);
    }

    /* renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongProgression m912downToeb3DHEI(long j, long j2) {
        return kotlin.ranges.ULongProgression.INSTANCE.m880fromClosedRange7ftBX0g(j, j2, -1L);
    }

    /* renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m909downTo5PvTz6A(short s, short s2) {
        return kotlin.ranges.UIntProgression.INSTANCE.m871fromClosedRangeNkh28Cs(kotlin.UInt.constructor-impl(s & 65535), kotlin.UInt.constructor-impl(s2 & 65535), -1);
    }

    public static final kotlin.ranges.UIntProgression reversed(kotlin.ranges.UIntProgression uIntProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        return kotlin.ranges.UIntProgression.INSTANCE.m871fromClosedRangeNkh28Cs(uIntProgression.getLast(), uIntProgression.getFirst(), -uIntProgression.getStep());
    }

    public static final kotlin.ranges.ULongProgression reversed(kotlin.ranges.ULongProgression uLongProgression) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        return kotlin.ranges.ULongProgression.INSTANCE.m880fromClosedRange7ftBX0g(uLongProgression.getLast(), uLongProgression.getFirst(), -uLongProgression.getStep());
    }

    public static final kotlin.ranges.UIntProgression step(kotlin.ranges.UIntProgression uIntProgression, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uIntProgression, "<this>");
        kotlin.ranges.RangesKt.checkStepIsPositive(i > 0, java.lang.Integer.valueOf(i));
        kotlin.ranges.UIntProgression.Companion companion = kotlin.ranges.UIntProgression.INSTANCE;
        int first = uIntProgression.getFirst();
        int last = uIntProgression.getLast();
        if (uIntProgression.getStep() <= 0) {
            i = -i;
        }
        return companion.m871fromClosedRangeNkh28Cs(first, last, i);
    }

    public static final kotlin.ranges.ULongProgression step(kotlin.ranges.ULongProgression uLongProgression, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uLongProgression, "<this>");
        kotlin.ranges.RangesKt.checkStepIsPositive(j > 0, java.lang.Long.valueOf(j));
        kotlin.ranges.ULongProgression.Companion companion = kotlin.ranges.ULongProgression.INSTANCE;
        long first = uLongProgression.getFirst();
        long last = uLongProgression.getLast();
        if (uLongProgression.getStep() <= 0) {
            j = -j;
        }
        return companion.m880fromClosedRange7ftBX0g(first, last, j);
    }

    /* renamed from: until-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m915untilKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b2 & 255, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(kotlin.UInt.constructor-impl(b & 255), kotlin.UInt.constructor-impl(kotlin.UInt.constructor-impl(r3) - 1), null);
    }

    /* renamed from: until-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m914untilJ1ME1BU(int i, int i2) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i2, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(i, kotlin.UInt.constructor-impl(i2 - 1), null);
    }

    /* renamed from: until-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongRange m916untileb3DHEI(long j, long j2) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m(j2, 0L) <= 0 ? kotlin.ranges.ULongRange.INSTANCE.getEMPTY() : new kotlin.ranges.ULongRange(j, kotlin.ULong.constructor-impl(j2 - kotlin.ULong.constructor-impl(1 & 4294967295L)), null);
    }

    /* renamed from: until-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m913until5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s2 & 65535, 0) <= 0 ? kotlin.ranges.UIntRange.INSTANCE.getEMPTY() : new kotlin.ranges.UIntRange(kotlin.UInt.constructor-impl(s & 65535), kotlin.UInt.constructor-impl(kotlin.UInt.constructor-impl(r3) - 1), null);
    }

    /* renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m888coerceAtLeastJ1ME1BU(int i, int i2) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, i2) < 0 ? i2 : i;
    }

    /* renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m890coerceAtLeasteb3DHEI(long j, long j2) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m(j, j2) < 0 ? j2 : j;
    }

    /* renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m889coerceAtLeastKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) < 0 ? b2 : b;
    }

    /* renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m887coerceAtLeast5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & 65535, 65535 & s2) < 0 ? s2 : s;
    }

    /* renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m892coerceAtMostJ1ME1BU(int i, int i2) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, i2) > 0 ? i2 : i;
    }

    /* renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m894coerceAtMosteb3DHEI(long j, long j2) {
        return kotlin.UByte$.ExternalSyntheticBackport0.m(j, j2) > 0 ? j2 : j;
    }

    /* renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m893coerceAtMostKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) > 0 ? b2 : b;
    }

    /* renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m891coerceAtMost5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & 65535, 65535 & s2) > 0 ? s2 : s;
    }

    /* renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m897coerceInWZ9TVnA(int i, int i2, int i3) {
        if (kotlin.UByte$.ExternalSyntheticBackport0.m$2(i2, i3) <= 0) {
            return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, i2) < 0 ? i2 : kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, i3) > 0 ? i3 : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((java.lang.Object) kotlin.UInt.toString-impl(i3)) + " is less than minimum " + ((java.lang.Object) kotlin.UInt.toString-impl(i2)) + '.');
    }

    /* renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m899coerceInsambcqE(long j, long j2, long j3) {
        if (kotlin.UByte$.ExternalSyntheticBackport0.m(j2, j3) <= 0) {
            return kotlin.UByte$.ExternalSyntheticBackport0.m(j, j2) < 0 ? j2 : kotlin.UByte$.ExternalSyntheticBackport0.m(j, j3) > 0 ? j3 : j;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((java.lang.Object) kotlin.ULong.toString-impl(j3)) + " is less than minimum " + ((java.lang.Object) kotlin.ULong.toString-impl(j2)) + '.');
    }

    /* renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m898coerceInb33U2AM(byte b, byte b2, byte b3) {
        int i = b2 & 255;
        int i2 = b3 & 255;
        if (kotlin.jvm.internal.Intrinsics.compare(i, i2) > 0) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((java.lang.Object) kotlin.UByte.toString-impl(b3)) + " is less than minimum " + ((java.lang.Object) kotlin.UByte.toString-impl(b2)) + '.');
        }
        int i3 = b & 255;
        return kotlin.jvm.internal.Intrinsics.compare(i3, i) < 0 ? b2 : kotlin.jvm.internal.Intrinsics.compare(i3, i2) > 0 ? b3 : b;
    }

    /* renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m896coerceInVKSA0NQ(short s, short s2, short s3) {
        int i = s2 & 65535;
        int i2 = s3 & 65535;
        if (kotlin.jvm.internal.Intrinsics.compare(i, i2) > 0) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((java.lang.Object) kotlin.UShort.toString-impl(s3)) + " is less than minimum " + ((java.lang.Object) kotlin.UShort.toString-impl(s2)) + '.');
        }
        int i3 = 65535 & s;
        return kotlin.jvm.internal.Intrinsics.compare(i3, i) < 0 ? s2 : kotlin.jvm.internal.Intrinsics.compare(i3, i2) > 0 ? s3 : s;
    }

    /* renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m900coerceInwuiCnnA(int i, kotlin.ranges.ClosedRange<kotlin.UInt> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return kotlin.ranges.RangesKt.coerceIn(kotlin.UInt.box-impl(i), (kotlin.ranges.ClosedFloatingPointRange<kotlin.UInt>) range).unbox-impl();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, range.getStart().unbox-impl()) < 0 ? range.getStart().unbox-impl() : kotlin.UByte$.ExternalSyntheticBackport0.m$2(i, range.getEndInclusive().unbox-impl()) > 0 ? range.getEndInclusive().unbox-impl() : i;
    }

    /* renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m895coerceInJPwROB0(long j, kotlin.ranges.ClosedRange<kotlin.ULong> range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof kotlin.ranges.ClosedFloatingPointRange) {
            return kotlin.ranges.RangesKt.coerceIn(kotlin.ULong.box-impl(j), (kotlin.ranges.ClosedFloatingPointRange<kotlin.ULong>) range).unbox-impl();
        }
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return kotlin.UByte$.ExternalSyntheticBackport0.m(j, range.getStart().unbox-impl()) < 0 ? range.getStart().unbox-impl() : kotlin.UByte$.ExternalSyntheticBackport0.m(j, range.getEndInclusive().unbox-impl()) > 0 ? range.getEndInclusive().unbox-impl() : j;
    }
}
