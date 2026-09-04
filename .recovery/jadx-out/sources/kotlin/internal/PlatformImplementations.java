package kotlin.internal;

/* compiled from: PlatformImplementations.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0013"}, d2 = {"Lkotlin/internal/PlatformImplementations;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "addSuppressed", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "cause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "exception", "defaultPlatformRandom", "Lkotlin/random/Random;", "getMatchResultNamedGroup", "Lkotlin/text/MatchGroup;", "matchResult", "Ljava/util/regex/MatchResult;", "name", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSuppressed", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "ReflectThrowable", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class PlatformImplementations {

    /* compiled from: PlatformImplementations.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/internal/PlatformImplementations$ReflectThrowable;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "addSuppressed", "Ljava/lang/reflect/Method;", "getSuppressed", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    private static final class ReflectThrowable {
        public static final kotlin.internal.PlatformImplementations.ReflectThrowable INSTANCE = new kotlin.internal.PlatformImplementations.ReflectThrowable();
        public static final java.lang.reflect.Method addSuppressed;
        public static final java.lang.reflect.Method getSuppressed;

        private ReflectThrowable() {
        }

        static {
            java.lang.reflect.Method method;
            java.lang.reflect.Method method2;
            java.lang.reflect.Method[] methods = java.lang.Throwable.class.getMethods();
            kotlin.jvm.internal.Intrinsics.checkNotNull(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (kotlin.jvm.internal.Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                    java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.collections.ArraysKt.singleOrNull(parameterTypes), java.lang.Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            addSuppressed = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                java.lang.reflect.Method method3 = methods[i];
                if (kotlin.jvm.internal.Intrinsics.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            getSuppressed = method;
        }
    }

    public void addSuppressed(java.lang.Throwable cause, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.reflect.Method method = kotlin.internal.PlatformImplementations.ReflectThrowable.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public java.util.List<java.lang.Throwable> getSuppressed(java.lang.Throwable exception) {
        java.lang.Object invoke;
        java.util.List<java.lang.Throwable> asList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "exception");
        java.lang.reflect.Method method = kotlin.internal.PlatformImplementations.ReflectThrowable.getSuppressed;
        return (method == null || (invoke = method.invoke(exception, new java.lang.Object[0])) == null || (asList = kotlin.collections.ArraysKt.asList((java.lang.Throwable[]) invoke)) == null) ? kotlin.collections.CollectionsKt.emptyList() : asList;
    }

    public kotlin.text.MatchGroup getMatchResultNamedGroup(java.util.regex.MatchResult matchResult, java.lang.String name) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(matchResult, "matchResult");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        throw new java.lang.UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public kotlin.random.Random defaultPlatformRandom() {
        return new kotlin.random.FallbackThreadLocalRandom();
    }
}
