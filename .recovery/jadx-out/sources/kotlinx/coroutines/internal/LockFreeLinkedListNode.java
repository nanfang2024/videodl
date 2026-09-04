package kotlinx.coroutines.internal;

/* compiled from: LockFreeLinkedList.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u00010B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ%\u0010\u0017\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0086\bJ \u0010\u001a\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0001J\u0012\u0010\u001b\u001a\u00020\t2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000fJ\u001b\u0010\u001c\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0082\u0010J\u0019\u0010\u001f\u001a\u00060\u0000j\u0002`\u000f2\n\u0010 \u001a\u00060\u0000j\u0002`\u000fH\u0082\u0010J\u0014\u0010!\u001a\u00020\u00152\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0002J%\u0010\"\u001a\u00020#2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u0019H\u0081\bJ\u0010\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0014J\b\u0010%\u001a\u00020\tH\u0016J\u0010\u0010&\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u000fH\u0001J\b\u0010'\u001a\u00020\u0007H\u0002J\b\u0010(\u001a\u00020)H\u0016J(\u0010*\u001a\u00020+2\n\u0010\u0016\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000f2\u0006\u0010,\u001a\u00020#H\u0001J%\u0010-\u001a\u00020\u00152\n\u0010.\u001a\u00060\u0000j\u0002`\u000f2\n\u0010\u000b\u001a\u00060\u0000j\u0002`\u000fH\u0000¢\u0006\u0002\b/R\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004R\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u0082\u0004R\u0011\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u0082\u0004R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0015\u0010\u000e\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0012\u001a\u00060\u0000j\u0002`\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u00061"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "_next", "Lkotlinx/atomicfu/AtomicRef;", "_prev", "_removedRef", "Lkotlinx/coroutines/internal/Removed;", "isRemoved", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()Z", "next", "getNext", "()Ljava/lang/Object;", "nextNode", "Lkotlinx/coroutines/internal/Node;", "getNextNode", "()Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "prevNode", "getPrevNode", "addLast", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "node", "addLastIf", "condition", "Lkotlin/Function0;", "addNext", "addOneIfEmpty", "correctPrev", "op", "Lkotlinx/coroutines/internal/OpDescriptor;", "findPrevNonRemoved", "current", "finishAdd", "makeCondAddOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "nextIfRemoved", "remove", "removeOrNext", "removed", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "tryCondAddNext", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "condAdd", "validateNode", "prev", "validateNode$kotlinx_coroutines_core", "CondAddOp", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class LockFreeLinkedListNode {
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _next$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_next");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _prev$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_prev");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _removedRef$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.LockFreeLinkedListNode.class, java.lang.Object.class, "_removedRef");

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _next = this;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _prev = this;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _removedRef;

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final kotlinx.coroutines.internal.Removed removed() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _removedRef$FU;
        kotlinx.coroutines.internal.Removed removed = (kotlinx.coroutines.internal.Removed) atomicReferenceFieldUpdater.get(this);
        if (removed != null) {
            return removed;
        }
        kotlinx.coroutines.internal.Removed removed2 = new kotlinx.coroutines.internal.Removed(this);
        atomicReferenceFieldUpdater.lazySet(this, removed2);
        return removed2;
    }

    /* compiled from: LockFreeLinkedList.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0011\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002j\u0002`\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u0014\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListNode$CondAddOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "newNode", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "oldNext", "complete", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "affected", "failure", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static abstract class CondAddOp extends kotlinx.coroutines.internal.AtomicOp<kotlinx.coroutines.internal.LockFreeLinkedListNode> {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode newNode;
        public kotlinx.coroutines.internal.LockFreeLinkedListNode oldNext;

        public CondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode) {
            this.newNode = lockFreeLinkedListNode;
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(kotlinx.coroutines.internal.LockFreeLinkedListNode affected, java.lang.Object failure) {
            boolean z = failure == null;
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = z ? this.newNode : this.oldNext;
            if (lockFreeLinkedListNode != null && androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(kotlinx.coroutines.internal.LockFreeLinkedListNode._next$FU, affected, this, lockFreeLinkedListNode) && z) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = this.newNode;
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = this.oldNext;
                kotlin.jvm.internal.Intrinsics.checkNotNull(lockFreeLinkedListNode3);
                lockFreeLinkedListNode2.finishAdd(lockFreeLinkedListNode3);
            }
        }
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp makeCondAddOp(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        return new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
    }

    public boolean isRemoved() {
        return getNext() instanceof kotlinx.coroutines.internal.Removed;
    }

    public final java.lang.Object getNext() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof kotlinx.coroutines.internal.OpDescriptor)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(this);
        }
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getNextNode() {
        return kotlinx.coroutines.internal.LockFreeLinkedListKt.unwrap(getNext());
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode getPrevNode() {
        kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev = correctPrev(null);
        return correctPrev == null ? findPrevNonRemoved((kotlinx.coroutines.internal.LockFreeLinkedListNode) _prev$FU.get(this)) : correctPrev;
    }

    private final kotlinx.coroutines.internal.LockFreeLinkedListNode findPrevNonRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode current) {
        while (current.isRemoved()) {
            current = (kotlinx.coroutines.internal.LockFreeLinkedListNode) _prev$FU.get(current);
        }
        return current;
    }

    public final boolean addOneIfEmpty(kotlinx.coroutines.internal.LockFreeLinkedListNode node) {
        _prev$FU.lazySet(node, this);
        _next$FU.lazySet(node, this);
        while (getNext() == this) {
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, this, node)) {
                node.finishAdd(this);
                return true;
            }
        }
        return false;
    }

    public final void addLast(kotlinx.coroutines.internal.LockFreeLinkedListNode node) {
        do {
        } while (!getPrevNode().addNext(node, this));
    }

    public final boolean addNext(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        if (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, next, node)) {
            return false;
        }
        node.finishAdd(next);
        return true;
    }

    public final int tryCondAddNext(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlinx.coroutines.internal.LockFreeLinkedListNode next, kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp condAdd) {
        _prev$FU.lazySet(node, this);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
        atomicReferenceFieldUpdater.lazySet(node, next);
        condAdd.oldNext = next;
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, next, condAdd)) {
            return condAdd.perform(this) == null ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: remove */
    public boolean mo1202remove() {
        return removeOrNext() == null;
    }

    public final kotlinx.coroutines.internal.LockFreeLinkedListNode removeOrNext() {
        java.lang.Object next;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        do {
            next = getNext();
            if (next instanceof kotlinx.coroutines.internal.Removed) {
                return ((kotlinx.coroutines.internal.Removed) next).ref;
            }
            if (next == this) {
                return (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_next$FU, this, next, lockFreeLinkedListNode.removed()));
        lockFreeLinkedListNode.correctPrev(null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdd(kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _prev$FU;
        do {
            lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) atomicReferenceFieldUpdater.get(next);
            if (getNext() != next) {
                return;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_prev$FU, next, lockFreeLinkedListNode, this));
        if (isRemoved()) {
            next.correctPrev(null);
        }
    }

    protected kotlinx.coroutines.internal.LockFreeLinkedListNode nextIfRemoved() {
        java.lang.Object next = getNext();
        kotlinx.coroutines.internal.Removed removed = next instanceof kotlinx.coroutines.internal.Removed ? (kotlinx.coroutines.internal.Removed) next : null;
        if (removed != null) {
            return removed.ref;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(r4, r3, r2, ((kotlinx.coroutines.internal.Removed) r5).ref) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final kotlinx.coroutines.internal.LockFreeLinkedListNode correctPrev(kotlinx.coroutines.internal.OpDescriptor op) {
        while (true) {
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) _prev$FU.get(this);
            kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = lockFreeLinkedListNode;
            while (true) {
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode3 = null;
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _next$FU;
                    java.lang.Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode2);
                    if (obj == this) {
                        if (lockFreeLinkedListNode == lockFreeLinkedListNode2 || androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(_prev$FU, this, lockFreeLinkedListNode, lockFreeLinkedListNode2)) {
                            return lockFreeLinkedListNode2;
                        }
                    } else {
                        if (isRemoved()) {
                            return null;
                        }
                        if (obj == op) {
                            return lockFreeLinkedListNode2;
                        }
                        if (obj instanceof kotlinx.coroutines.internal.OpDescriptor) {
                            ((kotlinx.coroutines.internal.OpDescriptor) obj).perform(lockFreeLinkedListNode2);
                            break;
                        }
                        if (!(obj instanceof kotlinx.coroutines.internal.Removed)) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                            lockFreeLinkedListNode3 = lockFreeLinkedListNode2;
                            lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) obj;
                        } else {
                            if (lockFreeLinkedListNode3 != null) {
                                break;
                            }
                            lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) _prev$FU.get(lockFreeLinkedListNode2);
                        }
                    }
                }
                lockFreeLinkedListNode2 = lockFreeLinkedListNode3;
            }
        }
    }

    public final void validateNode$kotlinx_coroutines_core(kotlinx.coroutines.internal.LockFreeLinkedListNode prev, kotlinx.coroutines.internal.LockFreeLinkedListNode next) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && prev != _prev$FU.get(this)) {
            throw new java.lang.AssertionError();
        }
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && next != _next$FU.get(this)) {
            throw new java.lang.AssertionError();
        }
    }

    public java.lang.String toString() {
        return new kotlin.jvm.internal.PropertyReference0Impl(this) { // from class: kotlinx.coroutines.internal.LockFreeLinkedListNode$toString$1
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public java.lang.Object get() {
                return kotlinx.coroutines.DebugStringsKt.getClassSimpleName(this.receiver);
            }
        } + '@' + kotlinx.coroutines.DebugStringsKt.getHexAddress(this);
    }

    public final boolean addLastIf(kotlinx.coroutines.internal.LockFreeLinkedListNode node, kotlin.jvm.functions.Function0<java.lang.Boolean> condition) {
        int tryCondAddNext;
        kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1 lockFreeLinkedListNode$makeCondAddOp$1 = new kotlinx.coroutines.internal.LockFreeLinkedListNode$makeCondAddOp$1(node, condition);
        do {
            tryCondAddNext = getPrevNode().tryCondAddNext(node, this, lockFreeLinkedListNode$makeCondAddOp$1);
            if (tryCondAddNext == 1) {
                return true;
            }
        } while (tryCondAddNext != 2);
        return false;
    }
}
