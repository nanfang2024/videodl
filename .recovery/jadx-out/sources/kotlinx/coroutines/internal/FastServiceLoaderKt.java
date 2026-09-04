package kotlinx.coroutines.internal;

/* compiled from: FastServiceLoader.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"ANDROID_DETECTED", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED;

    public static final boolean getANDROID_DETECTED() {
        return ANDROID_DETECTED;
    }

    static {
        java.lang.Object obj;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(java.lang.Class.forName("android.os.Build"));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        ANDROID_DETECTED = kotlin.Result.isSuccess-impl(obj);
    }
}
