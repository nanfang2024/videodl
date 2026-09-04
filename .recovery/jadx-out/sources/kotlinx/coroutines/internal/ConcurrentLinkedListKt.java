package kotlinx.coroutines.internal;

/* compiled from: ConcurrentLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a8\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00050\tH\u0082\b\u001a!\u0010\r\u001a\u0002H\u000e\"\u000e\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f*\u0002H\u000eH\u0000¢\u0006\u0002\u0010\u0010\u001av\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u0002H\u001328\b\b\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0080\bø\u0001\u0000\u001aj\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00130\u0012\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\u0002H\u00132\u0006\u0010\u0016\u001a\u00020\u001726\u0010\u0019\u001a2\u0012\u0013\u0012\u00110\u0017¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0016\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u0002H\u00130\u001aH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a+\u0010\u001e\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u0002H\u00130\u0014*\b\u0012\u0004\u0012\u0002H\u00130\u00152\u0006\u0010\u001f\u001a\u0002H\u0013H\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"CLOSED", "Lkotlinx/coroutines/internal/Symbol;", "POINTERS_SHIFT", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "addConditionally", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/atomicfu/AtomicInt;", "delta", "condition", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "cur", "close", "N", "Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "(Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;)Lkotlinx/coroutines/internal/ConcurrentLinkedListNode;", "findSegmentAndMoveForward", "Lkotlinx/coroutines/internal/SegmentOrClosed;", "S", "Lkotlinx/coroutines/internal/Segment;", "Lkotlinx/atomicfu/AtomicRef;", "id", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "startFrom", "createNewSegment", "Lkotlin/Function2;", "prev", "findSegmentInternal", "(Lkotlinx/coroutines/internal/Segment;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "moveForward", "to", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ConcurrentLinkedListKt {
    private static final kotlinx.coroutines.internal.Symbol CLOSED = new kotlinx.coroutines.internal.Symbol("CLOSED");
    private static final int POINTERS_SHIFT = 16;

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getCLOSED$p() {
        return CLOSED;
    }

    public static final <S extends kotlinx.coroutines.internal.Segment<S>> java.lang.Object findSegmentInternal(S s, long j, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s.id >= j && !s.isRemoved()) {
                return kotlinx.coroutines.internal.SegmentOrClosed.m1206constructorimpl(s);
            }
            java.lang.Object nextOrClosed = s.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return kotlinx.coroutines.internal.SegmentOrClosed.m1206constructorimpl(CLOSED);
            }
            S s2 = (S) ((kotlinx.coroutines.internal.ConcurrentLinkedListNode) nextOrClosed);
            if (s2 == null) {
                s2 = function2.invoke(java.lang.Long.valueOf(s.id + 1), s);
                if (s.trySetNext(s2)) {
                    if (s.isRemoved()) {
                        s.remove();
                    }
                }
            }
            s = s2;
        }
    }

    public static final boolean moveForward$atomicfu(java.lang.Object obj, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlinx.coroutines.internal.Segment segment) {
        while (true) {
            kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(obj);
            if (segment2.id >= segment.id) {
                return true;
            }
            if (!segment.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, segment2, segment)) {
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
                return true;
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
        }
    }

    public static final boolean moveForward$atomicfu$array(java.lang.Object obj, java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, kotlinx.coroutines.internal.Segment segment) {
        while (true) {
            kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceArray.get(i);
            if (segment2.id >= segment.id) {
                return true;
            }
            if (!segment.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, segment2, segment)) {
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
                return true;
            }
            if (segment.decPointers$kotlinx_coroutines_core()) {
                segment.remove();
            }
        }
    }

    public static final java.lang.Object findSegmentAndMoveForward$atomicfu(java.lang.Object obj, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j, kotlinx.coroutines.internal.Segment segment, kotlin.jvm.functions.Function2 function2) {
        java.lang.Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(segment, j, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(obj);
                    if (segment2.id >= m1209getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, segment2, m1209getSegmentimpl)) {
                        if (segment2.decPointers$kotlinx_coroutines_core()) {
                            segment2.remove();
                        }
                    } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1209getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    public static final java.lang.Object findSegmentAndMoveForward$atomicfu$array(java.lang.Object obj, java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray, int i, long j, kotlinx.coroutines.internal.Segment segment, kotlin.jvm.functions.Function2 function2) {
        java.lang.Object findSegmentInternal;
        loop0: while (true) {
            findSegmentInternal = findSegmentInternal(segment, j, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceArray.get(i);
                    if (segment2.id >= m1209getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i, segment2, m1209getSegmentimpl)) {
                        if (segment2.decPointers$kotlinx_coroutines_core()) {
                            segment2.remove();
                        }
                    } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1209getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return findSegmentInternal;
    }

    private static final boolean addConditionally$atomicfu(java.lang.Object obj, java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, int i, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        int i2;
        do {
            i2 = atomicIntegerFieldUpdater.get(obj);
            if (!function1.invoke(java.lang.Integer.valueOf(i2)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i2, i2 + i));
        return true;
    }

    private static final boolean addConditionally$atomicfu$array(java.lang.Object obj, java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray, int i, int i2, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> function1) {
        int i3;
        do {
            i3 = atomicIntegerArray.get(i);
            if (!function1.invoke(java.lang.Integer.valueOf(i3)).booleanValue()) {
                return false;
            }
        } while (!atomicIntegerArray.compareAndSet(i, i3, i3 + i2));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.ConcurrentLinkedListNode] */
    public static final <N extends kotlinx.coroutines.internal.ConcurrentLinkedListNode<N>> N close(N n) {
        while (true) {
            java.lang.Object nextOrClosed = n.getNextOrClosed();
            if (nextOrClosed == CLOSED) {
                return n;
            }
            ?? r0 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) nextOrClosed;
            if (r0 != 0) {
                n = r0;
            } else if (n.markAsClosed()) {
                return n;
            }
        }
    }
}
