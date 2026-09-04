package kotlin.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CharDirectionality.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lkotlin/text/CharDirectionality;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "value", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CharDirectionality {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.text.CharDirectionality[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.text.CharDirectionality.Companion INSTANCE;
    private static final kotlin.Lazy<java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality>> directionalityMap$delegate;
    private final int value;
    public static final kotlin.text.CharDirectionality UNDEFINED = new kotlin.text.CharDirectionality("UNDEFINED", 0, -1);
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT = new kotlin.text.CharDirectionality("LEFT_TO_RIGHT", 1, 0);
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT", 2, 1);
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_ARABIC = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER = new kotlin.text.CharDirectionality("EUROPEAN_NUMBER", 4, 3);
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_SEPARATOR = new kotlin.text.CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final kotlin.text.CharDirectionality EUROPEAN_NUMBER_TERMINATOR = new kotlin.text.CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final kotlin.text.CharDirectionality ARABIC_NUMBER = new kotlin.text.CharDirectionality("ARABIC_NUMBER", 7, 6);
    public static final kotlin.text.CharDirectionality COMMON_NUMBER_SEPARATOR = new kotlin.text.CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final kotlin.text.CharDirectionality NONSPACING_MARK = new kotlin.text.CharDirectionality("NONSPACING_MARK", 9, 8);
    public static final kotlin.text.CharDirectionality BOUNDARY_NEUTRAL = new kotlin.text.CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
    public static final kotlin.text.CharDirectionality PARAGRAPH_SEPARATOR = new kotlin.text.CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
    public static final kotlin.text.CharDirectionality SEGMENT_SEPARATOR = new kotlin.text.CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
    public static final kotlin.text.CharDirectionality WHITESPACE = new kotlin.text.CharDirectionality("WHITESPACE", 13, 12);
    public static final kotlin.text.CharDirectionality OTHER_NEUTRALS = new kotlin.text.CharDirectionality("OTHER_NEUTRALS", 14, 13);
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_EMBEDDING = new kotlin.text.CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final kotlin.text.CharDirectionality LEFT_TO_RIGHT_OVERRIDE = new kotlin.text.CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_EMBEDDING = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final kotlin.text.CharDirectionality RIGHT_TO_LEFT_OVERRIDE = new kotlin.text.CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final kotlin.text.CharDirectionality POP_DIRECTIONAL_FORMAT = new kotlin.text.CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);

    private static final /* synthetic */ kotlin.text.CharDirectionality[] $values() {
        return new kotlin.text.CharDirectionality[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    public static kotlin.enums.EnumEntries<kotlin.text.CharDirectionality> getEntries() {
        return $ENTRIES;
    }

    public static kotlin.text.CharDirectionality valueOf(java.lang.String str) {
        return (kotlin.text.CharDirectionality) java.lang.Enum.valueOf(kotlin.text.CharDirectionality.class, str);
    }

    public static kotlin.text.CharDirectionality[] values() {
        return (kotlin.text.CharDirectionality[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    private CharDirectionality(java.lang.String str, int i, int i2) {
        this.value = i2;
    }

    static {
        kotlin.text.CharDirectionality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
        INSTANCE = new kotlin.text.CharDirectionality.Companion(null);
        directionalityMap$delegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<java.util.Map<java.lang.Integer, ? extends kotlin.text.CharDirectionality>>() { // from class: kotlin.text.CharDirectionality$Companion$directionalityMap$2
            @Override // kotlin.jvm.functions.Function0
            public final java.util.Map<java.lang.Integer, ? extends kotlin.text.CharDirectionality> invoke() {
                kotlin.enums.EnumEntries<kotlin.text.CharDirectionality> entries = kotlin.text.CharDirectionality.getEntries();
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(entries, 10)), 16));
                for (java.lang.Object obj : entries) {
                    linkedHashMap.put(java.lang.Integer.valueOf(((kotlin.text.CharDirectionality) obj).getValue()), obj);
                }
                return linkedHashMap;
            }
        });
    }

    /* compiled from: CharDirectionality.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0005R'\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "directionalityMap", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/text/CharDirectionality;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap$delegate", "Lkotlin/Lazy;", "valueOf", "directionality", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final java.util.Map<java.lang.Integer, kotlin.text.CharDirectionality> getDirectionalityMap() {
            return (java.util.Map) kotlin.text.CharDirectionality.directionalityMap$delegate.getValue();
        }

        public final kotlin.text.CharDirectionality valueOf(int directionality) {
            kotlin.text.CharDirectionality charDirectionality = getDirectionalityMap().get(java.lang.Integer.valueOf(directionality));
            if (charDirectionality != null) {
                return charDirectionality;
            }
            throw new java.lang.IllegalArgumentException("Directionality #" + directionality + " is not defined.");
        }
    }
}
