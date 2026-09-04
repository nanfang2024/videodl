package kotlinx.coroutines;

/* compiled from: DefaultExecutor.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\b\u001a\u00020\u0001H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay$annotations", "()V", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "defaultMainDelayOptIn", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "initializeDefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DefaultExecutorKt {
    private static final boolean defaultMainDelayOptIn = kotlinx.coroutines.internal.SystemPropsKt.systemProp("kotlinx.coroutines.main.delay", false);
    private static final kotlinx.coroutines.Delay DefaultDelay = initializeDefaultDelay();

    public static final kotlinx.coroutines.Delay getDefaultDelay() {
        return DefaultDelay;
    }

    public static /* synthetic */ void getDefaultDelay$annotations() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r1 == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final kotlinx.coroutines.Delay initializeDefaultDelay() {
        java.lang.Object obj;
        if (!defaultMainDelayOptIn) {
            return kotlinx.coroutines.DefaultExecutor.INSTANCE;
        }
        kotlinx.coroutines.MainCoroutineDispatcher main = kotlinx.coroutines.Dispatchers.getMain();
        if (!kotlinx.coroutines.internal.MainDispatchersKt.isMissing(main)) {
            boolean z = main instanceof kotlinx.coroutines.Delay;
            obj = main;
        }
        obj = kotlinx.coroutines.DefaultExecutor.INSTANCE;
        return (kotlinx.coroutines.Delay) obj;
    }
}
