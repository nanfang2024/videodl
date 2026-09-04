package kotlin.collections;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/collections/State;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class State {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.collections.State[] $VALUES;
    public static final kotlin.collections.State Ready = new kotlin.collections.State("Ready", 0);
    public static final kotlin.collections.State NotReady = new kotlin.collections.State("NotReady", 1);
    public static final kotlin.collections.State Done = new kotlin.collections.State("Done", 2);
    public static final kotlin.collections.State Failed = new kotlin.collections.State("Failed", 3);

    private static final /* synthetic */ kotlin.collections.State[] $values() {
        return new kotlin.collections.State[]{Ready, NotReady, Done, Failed};
    }

    public static kotlin.enums.EnumEntries<kotlin.collections.State> getEntries() {
        return $ENTRIES;
    }

    public static kotlin.collections.State valueOf(java.lang.String str) {
        return (kotlin.collections.State) java.lang.Enum.valueOf(kotlin.collections.State.class, str);
    }

    public static kotlin.collections.State[] values() {
        return (kotlin.collections.State[]) $VALUES.clone();
    }

    private State(java.lang.String str, int i) {
    }

    static {
        kotlin.collections.State[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }
}
