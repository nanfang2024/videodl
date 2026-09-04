package kotlin.io.path;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CopyActionResult.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/io/path/CopyActionResult;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CONTINUE", "SKIP_SUBTREE", "TERMINATE", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CopyActionResult {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.io.path.CopyActionResult[] $VALUES;
    public static final kotlin.io.path.CopyActionResult CONTINUE = new kotlin.io.path.CopyActionResult("CONTINUE", 0);
    public static final kotlin.io.path.CopyActionResult SKIP_SUBTREE = new kotlin.io.path.CopyActionResult("SKIP_SUBTREE", 1);
    public static final kotlin.io.path.CopyActionResult TERMINATE = new kotlin.io.path.CopyActionResult("TERMINATE", 2);

    private static final /* synthetic */ kotlin.io.path.CopyActionResult[] $values() {
        return new kotlin.io.path.CopyActionResult[]{CONTINUE, SKIP_SUBTREE, TERMINATE};
    }

    public static kotlin.enums.EnumEntries<kotlin.io.path.CopyActionResult> getEntries() {
        return $ENTRIES;
    }

    public static kotlin.io.path.CopyActionResult valueOf(java.lang.String str) {
        return (kotlin.io.path.CopyActionResult) java.lang.Enum.valueOf(kotlin.io.path.CopyActionResult.class, str);
    }

    public static kotlin.io.path.CopyActionResult[] values() {
        return (kotlin.io.path.CopyActionResult[]) $VALUES.clone();
    }

    private CopyActionResult(java.lang.String str, int i) {
    }

    static {
        kotlin.io.path.CopyActionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }
}
