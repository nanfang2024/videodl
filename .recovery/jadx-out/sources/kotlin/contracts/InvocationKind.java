package kotlin.contracts;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContractBuilder.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class InvocationKind {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.contracts.InvocationKind[] $VALUES;
    public static final kotlin.contracts.InvocationKind AT_MOST_ONCE = new kotlin.contracts.InvocationKind("AT_MOST_ONCE", 0);
    public static final kotlin.contracts.InvocationKind AT_LEAST_ONCE = new kotlin.contracts.InvocationKind("AT_LEAST_ONCE", 1);
    public static final kotlin.contracts.InvocationKind EXACTLY_ONCE = new kotlin.contracts.InvocationKind("EXACTLY_ONCE", 2);
    public static final kotlin.contracts.InvocationKind UNKNOWN = new kotlin.contracts.InvocationKind("UNKNOWN", 3);

    private static final /* synthetic */ kotlin.contracts.InvocationKind[] $values() {
        return new kotlin.contracts.InvocationKind[]{AT_MOST_ONCE, AT_LEAST_ONCE, EXACTLY_ONCE, UNKNOWN};
    }

    public static kotlin.enums.EnumEntries<kotlin.contracts.InvocationKind> getEntries() {
        return $ENTRIES;
    }

    public static kotlin.contracts.InvocationKind valueOf(java.lang.String str) {
        return (kotlin.contracts.InvocationKind) java.lang.Enum.valueOf(kotlin.contracts.InvocationKind.class, str);
    }

    public static kotlin.contracts.InvocationKind[] values() {
        return (kotlin.contracts.InvocationKind[]) $VALUES.clone();
    }

    private InvocationKind(java.lang.String str, int i) {
    }

    static {
        kotlin.contracts.InvocationKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }
}
