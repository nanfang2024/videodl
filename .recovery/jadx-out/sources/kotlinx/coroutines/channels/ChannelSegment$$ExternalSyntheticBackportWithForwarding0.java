package kotlinx.coroutines.channels;

/* compiled from: D8$$SyntheticClass */
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* synthetic */ class ChannelSegment$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ boolean m(java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i, obj, obj2)) {
            if (atomicReferenceArray.get(i) != obj) {
                return false;
            }
        }
        return true;
    }
}
