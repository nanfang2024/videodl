package kotlin.sequences;

/* JADX INFO: Add missing generic type declarations: [E] */
/* compiled from: Sequences.kt */
@kotlin.Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\t\u001a\u00020\nH\u0002J\t\u0010\u000b\u001a\u00020\nH\u0096\u0002J\u000e\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\u000e"}, d2 = {"kotlin/sequences/FlatteningSequence$iterator$1", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "itemIterator", "getItemIterator", "()Ljava/util/Iterator;", "setItemIterator", "(Ljava/util/Iterator;)V", "iterator", "getIterator", "ensureItemIterator", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class FlatteningSequence$iterator$1<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMappedMarker {
    private java.util.Iterator<? extends E> itemIterator;
    private final java.util.Iterator<T> iterator;
    final /* synthetic */ kotlin.sequences.FlatteningSequence<T, R, E> this$0;

    public final java.util.Iterator<E> getItemIterator() {
        return this.itemIterator;
    }

    public final java.util.Iterator<T> getIterator() {
        return this.iterator;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setItemIterator(java.util.Iterator<? extends E> it) {
        this.itemIterator = it;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlatteningSequence$iterator$1(kotlin.sequences.FlatteningSequence<T, R, E> flatteningSequence) {
        kotlin.sequences.Sequence sequence;
        this.this$0 = flatteningSequence;
        sequence = ((kotlin.sequences.FlatteningSequence) flatteningSequence).sequence;
        this.iterator = sequence.iterator();
    }

    @Override // java.util.Iterator
    public E next() {
        if (!ensureItemIterator()) {
            throw new java.util.NoSuchElementException();
        }
        java.util.Iterator<? extends E> it = this.itemIterator;
        kotlin.jvm.internal.Intrinsics.checkNotNull(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return ensureItemIterator();
    }

    private final boolean ensureItemIterator() {
        kotlin.jvm.functions.Function1 function1;
        kotlin.jvm.functions.Function1 function12;
        java.util.Iterator<? extends E> it = this.itemIterator;
        if (it != null && !it.hasNext()) {
            this.itemIterator = null;
        }
        while (true) {
            if (this.itemIterator != null) {
                break;
            }
            if (!this.iterator.hasNext()) {
                return false;
            }
            java.lang.Object next = this.iterator.next();
            function1 = ((kotlin.sequences.FlatteningSequence) this.this$0).iterator;
            function12 = ((kotlin.sequences.FlatteningSequence) this.this$0).transformer;
            java.util.Iterator<? extends E> it2 = (java.util.Iterator) function1.invoke(function12.invoke(next));
            if (it2.hasNext()) {
                this.itemIterator = it2;
                break;
            }
        }
        return true;
    }
}
