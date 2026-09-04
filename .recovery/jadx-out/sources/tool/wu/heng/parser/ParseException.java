package tool.wu.heng.parser;

/* compiled from: LocalVideoParser.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Ltool/wu/heng/parser/ParseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Ljava/lang/Throwable;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ParseException extends java.lang.Exception {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParseException(java.lang.String message, java.lang.Throwable th) {
        super(message, th);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ ParseException(java.lang.String str, java.lang.Throwable th, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
