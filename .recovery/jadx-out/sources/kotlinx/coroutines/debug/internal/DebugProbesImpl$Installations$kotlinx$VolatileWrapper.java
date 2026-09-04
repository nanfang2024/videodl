package kotlinx.coroutines.debug.internal;

/* JADX INFO: Access modifiers changed from: private */
/* compiled from: DebugProbesImpl.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DebugProbesImpl$Installations$kotlinx$VolatileWrapper {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater installations$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.DebugProbesImpl$Installations$kotlinx$VolatileWrapper.class, "installations");

    @kotlin.jvm.Volatile
    private volatile int installations;

    private DebugProbesImpl$Installations$kotlinx$VolatileWrapper() {
    }

    public /* synthetic */ DebugProbesImpl$Installations$kotlinx$VolatileWrapper(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
