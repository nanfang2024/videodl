package kotlin.collections;

/* compiled from: ReversedViews.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0000\b\u0012\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0002\u0010\fJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lkotlin/collections/ReversedListReadOnly;", "T", "Lkotlin/collections/AbstractList;", "delegate", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/util/List;)V", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "iterator", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "listIterator", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
class ReversedListReadOnly<T> extends kotlin.collections.AbstractList<T> {
    private final java.util.List<T> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public ReversedListReadOnly(java.util.List<? extends T> delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.delegate.size();
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        int reverseElementIndex$CollectionsKt__ReversedViewsKt;
        java.util.List<T> list = this.delegate;
        reverseElementIndex$CollectionsKt__ReversedViewsKt = kotlin.collections.CollectionsKt__ReversedViewsKt.reverseElementIndex$CollectionsKt__ReversedViewsKt(this, index);
        return list.get(reverseElementIndex$CollectionsKt__ReversedViewsKt);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public java.util.ListIterator<T> listIterator(int index) {
        return new kotlin.collections.ReversedListReadOnly$listIterator$1(this, index);
    }
}
