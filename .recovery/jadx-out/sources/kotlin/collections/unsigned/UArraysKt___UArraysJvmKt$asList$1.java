package kotlin.collections.unsigned;

/* compiled from: _UArraysJvm.kt */
@kotlin.Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0006H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0017"}, d2 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt$asList$1", "Lkotlin/collections/AbstractList;", "Lkotlin/UInt;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "contains", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "element", "contains-WZ4Q5Ns", "(I)Z", "get", "index", "get-pVg5ArA", "(I)I", "indexOf", "indexOf-WZ4Q5Ns", "isEmpty", "lastIndexOf", "lastIndexOf-WZ4Q5Ns", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class UArraysKt___UArraysJvmKt$asList$1 extends kotlin.collections.AbstractList<kotlin.UInt> implements java.util.RandomAccess {
    final /* synthetic */ int[] $this_asList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public UArraysKt___UArraysJvmKt$asList$1(int[] iArr) {
        this.$this_asList = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m153containsWZ4Q5Ns(((kotlin.UInt) obj).unbox-impl());
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int i) {
        return kotlin.UInt.box-impl(m154getpVg5ArA(i));
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m155indexOfWZ4Q5Ns(((kotlin.UInt) obj).unbox-impl());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof kotlin.UInt) {
            return m156lastIndexOfWZ4Q5Ns(((kotlin.UInt) obj).unbox-impl());
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return kotlin.UIntArray.getSize-impl(this.$this_asList);
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return kotlin.UIntArray.isEmpty-impl(this.$this_asList);
    }

    /* renamed from: contains-WZ4Q5Ns, reason: not valid java name */
    public boolean m153containsWZ4Q5Ns(int element) {
        return kotlin.UIntArray.contains-WZ4Q5Ns(this.$this_asList, element);
    }

    /* renamed from: get-pVg5ArA, reason: not valid java name */
    public int m154getpVg5ArA(int index) {
        return kotlin.UIntArray.get-pVg5ArA(this.$this_asList, index);
    }

    /* renamed from: indexOf-WZ4Q5Ns, reason: not valid java name */
    public int m155indexOfWZ4Q5Ns(int element) {
        return kotlin.collections.ArraysKt.indexOf(this.$this_asList, element);
    }

    /* renamed from: lastIndexOf-WZ4Q5Ns, reason: not valid java name */
    public int m156lastIndexOfWZ4Q5Ns(int element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.$this_asList, element);
    }
}
