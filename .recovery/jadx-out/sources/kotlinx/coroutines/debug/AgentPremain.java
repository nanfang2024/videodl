package kotlinx.coroutines.debug;

/* compiled from: AgentPremain.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "enableCreationStackTraces", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "installSignalHandler", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "premain", "args", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "instrumentation", "Ljava/lang/instrument/Instrumentation;", "DebugProbesTransformer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class AgentPremain {
    public static final kotlinx.coroutines.debug.AgentPremain INSTANCE = new kotlinx.coroutines.debug.AgentPremain();
    private static final boolean enableCreationStackTraces;

    private AgentPremain() {
    }

    static {
        java.lang.Object obj;
        boolean enableCreationStackTraces$kotlinx_coroutines_core;
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            java.lang.String property = java.lang.System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            obj = kotlin.Result.constructor-impl(property != null ? java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(property)) : null);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Boolean bool = (java.lang.Boolean) (kotlin.Result.isFailure-impl(obj) ? null : obj);
        if (bool != null) {
            enableCreationStackTraces$kotlinx_coroutines_core = bool.booleanValue();
        } else {
            enableCreationStackTraces$kotlinx_coroutines_core = kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.getEnableCreationStackTraces$kotlinx_coroutines_core();
        }
        enableCreationStackTraces = enableCreationStackTraces$kotlinx_coroutines_core;
    }

    @kotlin.jvm.JvmStatic
    public static final void premain(java.lang.String args, java.lang.instrument.Instrumentation instrumentation) {
        kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer.INSTANCE);
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.setEnableCreationStackTraces$kotlinx_coroutines_core(enableCreationStackTraces);
        kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.install$kotlinx_coroutines_core();
        INSTANCE.installSignalHandler();
    }

    /* compiled from: AgentPremain.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "()V", "transform", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "loader", "Ljava/lang/ClassLoader;", "className", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class DebugProbesTransformer implements java.lang.instrument.ClassFileTransformer {
        public static final kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer INSTANCE = new kotlinx.coroutines.debug.AgentPremain.DebugProbesTransformer();

        private DebugProbesTransformer() {
        }

        public byte[] transform(java.lang.ClassLoader loader, java.lang.String className, java.lang.Class<?> classBeingRedefined, java.security.ProtectionDomain protectionDomain, byte[] classfileBuffer) {
            if (loader == null || !kotlin.jvm.internal.Intrinsics.areEqual(className, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            kotlinx.coroutines.debug.internal.AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
            return kotlin.io.ByteStreamsKt.readBytes(loader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    private final void installSignalHandler() {
        try {
            sun.misc.Signal.handle(new sun.misc.Signal("TRAP"), new sun.misc.SignalHandler() { // from class: kotlinx.coroutines.debug.AgentPremain$$ExternalSyntheticLambda0
                public final void handle(sun.misc.Signal signal) {
                    kotlinx.coroutines.debug.AgentPremain.installSignalHandler$lambda$1(signal);
                }
            });
        } catch (java.lang.Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void installSignalHandler$lambda$1(sun.misc.Signal signal) {
        if (kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.isInstalled$kotlinx_coroutines_debug()) {
            kotlinx.coroutines.debug.internal.DebugProbesImpl.INSTANCE.dumpCoroutines(java.lang.System.out);
        } else {
            java.lang.System.out.println((java.lang.Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }
}
