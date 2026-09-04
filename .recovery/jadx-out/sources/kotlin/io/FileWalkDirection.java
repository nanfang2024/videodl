package kotlin.io;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FileTreeWalk.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/FileWalkDirection;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "TOP_DOWN", "BOTTOM_UP", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FileWalkDirection {
    private static final /* synthetic */ kotlin.enums.EnumEntries $ENTRIES;
    private static final /* synthetic */ kotlin.io.FileWalkDirection[] $VALUES;
    public static final kotlin.io.FileWalkDirection TOP_DOWN = new kotlin.io.FileWalkDirection("TOP_DOWN", 0);
    public static final kotlin.io.FileWalkDirection BOTTOM_UP = new kotlin.io.FileWalkDirection("BOTTOM_UP", 1);

    private static final /* synthetic */ kotlin.io.FileWalkDirection[] $values() {
        return new kotlin.io.FileWalkDirection[]{TOP_DOWN, BOTTOM_UP};
    }

    public static kotlin.enums.EnumEntries<kotlin.io.FileWalkDirection> getEntries() {
        return $ENTRIES;
    }

    public static kotlin.io.FileWalkDirection valueOf(java.lang.String str) {
        return (kotlin.io.FileWalkDirection) java.lang.Enum.valueOf(kotlin.io.FileWalkDirection.class, str);
    }

    public static kotlin.io.FileWalkDirection[] values() {
        return (kotlin.io.FileWalkDirection[]) $VALUES.clone();
    }

    private FileWalkDirection(java.lang.String str, int i) {
    }

    static {
        kotlin.io.FileWalkDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.EnumEntriesKt.enumEntries($values);
    }
}
