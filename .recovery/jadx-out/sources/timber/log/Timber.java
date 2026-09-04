package timber.log;

/* compiled from: Timber.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0006"}, d2 = {"Ltimber/log/Timber;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DebugTree", "Forest", "Tree", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class Timber {

    /* renamed from: Forest, reason: from kotlin metadata */
    public static final timber.log.Timber.Companion INSTANCE = new timber.log.Timber.Companion(null);
    private static final java.util.ArrayList<timber.log.Timber.Tree> trees = new java.util.ArrayList<>();
    private static volatile timber.log.Timber.Tree[] treeArray = new timber.log.Timber.Tree[0];

    @kotlin.jvm.JvmStatic
    public static timber.log.Timber.Tree asTree() {
        return INSTANCE.asTree();
    }

    @kotlin.jvm.JvmStatic
    public static void d(java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.d(str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void d(java.lang.Throwable th) {
        INSTANCE.d(th);
    }

    @kotlin.jvm.JvmStatic
    public static void d(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.d(th, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void e(java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.e(str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void e(java.lang.Throwable th) {
        INSTANCE.e(th);
    }

    @kotlin.jvm.JvmStatic
    public static void e(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.e(th, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<timber.log.Timber.Tree> forest() {
        return INSTANCE.forest();
    }

    @kotlin.jvm.JvmStatic
    public static void i(java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.i(str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void i(java.lang.Throwable th) {
        INSTANCE.i(th);
    }

    @kotlin.jvm.JvmStatic
    public static void i(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.i(th, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void log(int i, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.log(i, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void log(int i, java.lang.Throwable th) {
        INSTANCE.log(i, th);
    }

    @kotlin.jvm.JvmStatic
    public static void log(int i, java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.log(i, th, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static final void plant(timber.log.Timber.Tree tree) {
        INSTANCE.plant(tree);
    }

    @kotlin.jvm.JvmStatic
    public static final void plant(timber.log.Timber.Tree... treeArr) {
        INSTANCE.plant(treeArr);
    }

    @kotlin.jvm.JvmStatic
    public static final timber.log.Timber.Tree tag(java.lang.String str) {
        return INSTANCE.tag(str);
    }

    @kotlin.jvm.JvmStatic
    public static final int treeCount() {
        return INSTANCE.treeCount();
    }

    @kotlin.jvm.JvmStatic
    public static final void uproot(timber.log.Timber.Tree tree) {
        INSTANCE.uproot(tree);
    }

    @kotlin.jvm.JvmStatic
    public static final void uprootAll() {
        INSTANCE.uprootAll();
    }

    @kotlin.jvm.JvmStatic
    public static void v(java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.v(str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void v(java.lang.Throwable th) {
        INSTANCE.v(th);
    }

    @kotlin.jvm.JvmStatic
    public static void v(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.v(th, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void w(java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.w(str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void w(java.lang.Throwable th) {
        INSTANCE.w(th);
    }

    @kotlin.jvm.JvmStatic
    public static void w(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.w(th, str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void wtf(java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.wtf(str, objArr);
    }

    @kotlin.jvm.JvmStatic
    public static void wtf(java.lang.Throwable th) {
        INSTANCE.wtf(th);
    }

    @kotlin.jvm.JvmStatic
    public static void wtf(java.lang.Throwable th, java.lang.String str, java.lang.Object... objArr) {
        INSTANCE.wtf(th, str, objArr);
    }

    private Timber() {
        throw new java.lang.AssertionError();
    }

    /* compiled from: Timber.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J/\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\u000b\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J/\u0010\u0014\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J'\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000fH\u0014¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J/\u0010\u0018\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\u0018\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0015J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0014J7\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u001eJ,\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H$J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016JA\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u001fJA\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0002\u0010\u001fJ/\u0010!\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010!\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010!\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J/\u0010\"\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010\"\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010\"\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013J/\u0010#\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0012\u0010#\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J9\u0010#\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u00052\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0002\u0010\u0013R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006$"}, d2 = {"Ltimber/log/Timber$Tree;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "explicitTag", "Ljava/lang/ThreadLocal;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", "tag", "getTag$timber_release", "()Ljava/lang/String;", "d", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "message", "args", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "getStackTraceString", "i", "isLoggable", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "priority", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "prepareLog", "v", "w", "wtf", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static abstract class Tree {
        private final java.lang.ThreadLocal<java.lang.String> explicitTag = new java.lang.ThreadLocal<>();

        /* renamed from: getExplicitTag$timber_release, reason: from getter */
        public final /* synthetic */ java.lang.ThreadLocal getExplicitTag() {
            return this.explicitTag;
        }

        @kotlin.Deprecated(message = "Use isLoggable(String, int)", replaceWith = @kotlin.ReplaceWith(expression = "this.isLoggable(null, priority)", imports = {}))
        protected boolean isLoggable(int priority) {
            return true;
        }

        protected abstract void log(int priority, java.lang.String tag, java.lang.String message, java.lang.Throwable t);

        public /* synthetic */ java.lang.String getTag$timber_release() {
            java.lang.String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void v(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(2, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void v(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(2, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void v(java.lang.Throwable t) {
            prepareLog(2, t, null, new java.lang.Object[0]);
        }

        public void d(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void d(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(3, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void d(java.lang.Throwable t) {
            prepareLog(3, t, null, new java.lang.Object[0]);
        }

        public void i(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void i(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(4, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void i(java.lang.Throwable t) {
            prepareLog(4, t, null, new java.lang.Object[0]);
        }

        public void w(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void w(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(5, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void w(java.lang.Throwable t) {
            prepareLog(5, t, null, new java.lang.Object[0]);
        }

        public void e(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void e(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(6, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void e(java.lang.Throwable t) {
            prepareLog(6, t, null, new java.lang.Object[0]);
        }

        public void wtf(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(7, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void wtf(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(7, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void wtf(java.lang.Throwable t) {
            prepareLog(7, t, null, new java.lang.Object[0]);
        }

        public void log(int priority, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(priority, null, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void log(int priority, java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            prepareLog(priority, t, message, java.util.Arrays.copyOf(args, args.length));
        }

        public void log(int priority, java.lang.Throwable t) {
            prepareLog(priority, t, null, new java.lang.Object[0]);
        }

        protected boolean isLoggable(java.lang.String tag, int priority) {
            return isLoggable(priority);
        }

        private final void prepareLog(int priority, java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            java.lang.String tag$timber_release = getTag$timber_release();
            if (isLoggable(tag$timber_release, priority)) {
                java.lang.String str = message;
                if (str != null && str.length() != 0) {
                    if (!(args.length == 0)) {
                        message = formatMessage(message, args);
                    }
                    if (t != null) {
                        message = ((java.lang.Object) message) + '\n' + getStackTraceString(t);
                    }
                } else if (t == null) {
                    return;
                } else {
                    message = getStackTraceString(t);
                }
                log(priority, tag$timber_release, message, t);
            }
        }

        protected java.lang.String formatMessage(java.lang.String message, java.lang.Object[] args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
            java.lang.String format = java.lang.String.format(message, java.util.Arrays.copyOf(copyOf, copyOf.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
            return format;
        }

        private final java.lang.String getStackTraceString(java.lang.Throwable t) {
            java.io.StringWriter stringWriter = new java.io.StringWriter(256);
            java.io.PrintWriter printWriter = new java.io.PrintWriter((java.io.Writer) stringWriter, false);
            t.printStackTrace(printWriter);
            printWriter.flush();
            java.lang.String stringWriter2 = stringWriter.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stringWriter2, "sw.toString()");
            return stringWriter2;
        }
    }

    /* compiled from: Timber.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0014J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Ltimber/log/Timber$DebugTree;", "Ltimber/log/Timber$Tree;", "()V", "fqcnIgnore", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "tag", "getTag$timber_release", "()Ljava/lang/String;", "createStackElementTag", "element", "Ljava/lang/StackTraceElement;", "log", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "priority", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "message", "t", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Companion", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static class DebugTree extends timber.log.Timber.Tree {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final java.util.List<java.lang.String> fqcnIgnore = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{timber.log.Timber.class.getName(), timber.log.Timber.Companion.class.getName(), timber.log.Timber.Tree.class.getName(), timber.log.Timber.DebugTree.class.getName()});
        private static final java.util.regex.Pattern ANONYMOUS_CLASS = java.util.regex.Pattern.compile("(\\$\\d+)+$");

        @Override // timber.log.Timber.Tree
        public java.lang.String getTag$timber_release() {
            java.lang.String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release != null) {
                return tag$timber_release;
            }
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "Throwable().stackTrace");
            for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
                if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                    return createStackElementTag(stackTraceElement);
                }
            }
            throw new java.util.NoSuchElementException("Array contains no element matching the predicate.");
        }

        protected java.lang.String createStackElementTag(java.lang.StackTraceElement element) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
            java.lang.String className = element.getClassName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(className, "element.className");
            java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(className, '.', (java.lang.String) null, 2, (java.lang.Object) null);
            java.util.regex.Matcher matcher = ANONYMOUS_CLASS.matcher(substringAfterLast$default);
            if (matcher.find()) {
                substringAfterLast$default = matcher.replaceAll(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substringAfterLast$default, "m.replaceAll(\"\")");
            }
            if (substringAfterLast$default.length() <= MAX_TAG_LENGTH || android.os.Build.VERSION.SDK_INT >= 26) {
                return substringAfterLast$default;
            }
            if (substringAfterLast$default == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String substring = substringAfterLast$default.substring(0, MAX_TAG_LENGTH);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @Override // timber.log.Timber.Tree
        protected void log(int priority, java.lang.String tag, java.lang.String message, java.lang.Throwable t) {
            int min;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            if (message.length() < MAX_LOG_LENGTH) {
                if (priority == 7) {
                    android.util.Log.wtf(tag, message);
                    return;
                } else {
                    android.util.Log.println(priority, tag, message);
                    return;
                }
            }
            int length = message.length();
            int i = 0;
            while (i < length) {
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) message, '\n', i, false, 4, (java.lang.Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = java.lang.Math.min(indexOf$default, i + MAX_LOG_LENGTH);
                    java.lang.String substring = message.substring(i, min);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (priority == 7) {
                        android.util.Log.wtf(tag, substring);
                    } else {
                        android.util.Log.println(priority, tag, substring);
                    }
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i = min;
                    }
                }
                i = min + 1;
            }
        }
    }

    /* compiled from: Timber.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u000b\u001a\u00020\u0001H\u0097\bJ1\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010\f\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J1\u0010\u0016\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010\u0016\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0007J1\u0010\u0019\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0019\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010\u0019\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J9\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u001cJ,\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017JC\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u001eJ!\u0010\u001f\u001a\u00020\r2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001H\u0007¢\u0006\u0002\u0010 J\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0001H\u0007J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u000fH\u0007J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0001H\u0007J\b\u0010#\u001a\u00020\rH\u0007J1\u0010$\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010$\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010$\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J1\u0010%\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010%\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010%\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015J1\u0010&\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0012\u0010&\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J;\u0010&\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\u0010\u0010\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00110\u0004\"\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0002\u0010\u0015R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0006\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Ltimber/log/Timber$Forest;", "Ltimber/log/Timber$Tree;", "()V", "treeArray", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "[Ltimber/log/Timber$Tree;", "treeCount", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()I", "trees", "Ljava/util/ArrayList;", "asTree", "d", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "message", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "args", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;[Ljava/lang/Object;)V", "t", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "e", "forest", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "i", "log", "priority", "(ILjava/lang/String;[Ljava/lang/Object;)V", "tag", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "plant", "([Ltimber/log/Timber$Tree;)V", "tree", "uproot", "uprootAll", "v", "w", "wtf", "timber_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: timber.log.Timber$Forest, reason: from kotlin metadata */
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion extends timber.log.Timber.Tree {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void v(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.v(message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void v(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.v(t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void v(java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.v(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void d(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.d(message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void d(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.d(t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void d(java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.d(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void i(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.i(message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void i(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.i(t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void i(java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.i(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void w(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.w(message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void w(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.w(t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void w(java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.w(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void e(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.e(message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void e(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.e(t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void e(java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.e(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void wtf(java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.wtf(message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void wtf(java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.wtf(t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void wtf(java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.wtf(t);
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void log(int priority, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.log(priority, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void log(int priority, java.lang.Throwable t, java.lang.String message, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.log(priority, t, message, java.util.Arrays.copyOf(args, args.length));
            }
        }

        @Override // timber.log.Timber.Tree
        @kotlin.jvm.JvmStatic
        public void log(int priority, java.lang.Throwable t) {
            for (timber.log.Timber.Tree tree : timber.log.Timber.treeArray) {
                tree.log(priority, t);
            }
        }

        @Override // timber.log.Timber.Tree
        protected void log(int priority, java.lang.String tag, java.lang.String message, java.lang.Throwable t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
            throw new java.lang.AssertionError();
        }

        @kotlin.jvm.JvmStatic
        public timber.log.Timber.Tree asTree() {
            return this;
        }

        @kotlin.jvm.JvmStatic
        public final timber.log.Timber.Tree tag(java.lang.String tag) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
            timber.log.Timber.Tree[] treeArr = timber.log.Timber.treeArray;
            int length = treeArr.length;
            int i = 0;
            while (i < length) {
                timber.log.Timber.Tree tree = treeArr[i];
                i++;
                tree.getExplicitTag().set(tag);
            }
            return this;
        }

        @kotlin.jvm.JvmStatic
        public final void plant(timber.log.Timber.Tree tree) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tree, "tree");
            if (!(tree != this)) {
                throw new java.lang.IllegalArgumentException("Cannot plant Timber into itself.".toString());
            }
            synchronized (timber.log.Timber.trees) {
                timber.log.Timber.trees.add(tree);
                timber.log.Timber.Companion companion = timber.log.Timber.INSTANCE;
                java.lang.Object[] array = timber.log.Timber.trees.toArray(new timber.log.Timber.Tree[0]);
                if (array != null) {
                    timber.log.Timber.treeArray = (timber.log.Timber.Tree[]) array;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        @kotlin.jvm.JvmStatic
        public final void plant(timber.log.Timber.Tree... trees) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trees, "trees");
            int length = trees.length;
            int i = 0;
            while (i < length) {
                timber.log.Timber.Tree tree = trees[i];
                i++;
                if (tree == null) {
                    throw new java.lang.IllegalArgumentException("trees contained null".toString());
                }
                if (!(tree != this)) {
                    throw new java.lang.IllegalArgumentException("Cannot plant Timber into itself.".toString());
                }
            }
            synchronized (timber.log.Timber.trees) {
                java.util.Collections.addAll(timber.log.Timber.trees, java.util.Arrays.copyOf(trees, trees.length));
                timber.log.Timber.Companion companion = timber.log.Timber.INSTANCE;
                java.lang.Object[] array = timber.log.Timber.trees.toArray(new timber.log.Timber.Tree[0]);
                if (array != null) {
                    timber.log.Timber.treeArray = (timber.log.Timber.Tree[]) array;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        @kotlin.jvm.JvmStatic
        public final void uproot(timber.log.Timber.Tree tree) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tree, "tree");
            synchronized (timber.log.Timber.trees) {
                if (!timber.log.Timber.trees.remove(tree)) {
                    throw new java.lang.IllegalArgumentException(kotlin.jvm.internal.Intrinsics.stringPlus("Cannot uproot tree which is not planted: ", tree).toString());
                }
                timber.log.Timber.Companion companion = timber.log.Timber.INSTANCE;
                java.lang.Object[] array = timber.log.Timber.trees.toArray(new timber.log.Timber.Tree[0]);
                if (array != null) {
                    timber.log.Timber.treeArray = (timber.log.Timber.Tree[]) array;
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } else {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }

        @kotlin.jvm.JvmStatic
        public final void uprootAll() {
            synchronized (timber.log.Timber.trees) {
                timber.log.Timber.trees.clear();
                timber.log.Timber.Companion companion = timber.log.Timber.INSTANCE;
                timber.log.Timber.treeArray = new timber.log.Timber.Tree[0];
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<timber.log.Timber.Tree> forest() {
            java.util.List<timber.log.Timber.Tree> unmodifiableList;
            synchronized (timber.log.Timber.trees) {
                unmodifiableList = java.util.Collections.unmodifiableList(kotlin.collections.CollectionsKt.toList(timber.log.Timber.trees));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(trees.toList())");
            }
            return unmodifiableList;
        }

        @kotlin.jvm.JvmStatic
        public final int treeCount() {
            return timber.log.Timber.treeArray.length;
        }
    }
}
