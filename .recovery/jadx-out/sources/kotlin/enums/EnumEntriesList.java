package kotlin.enums;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnumEntries.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\b\u0003\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\u00060\u0005j\u0002`\u0006B\u0013\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\fH\u0096\u0002¢\u0006\u0002\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0019\u001a\u00020\u001aH\u0002R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"Lkotlin/enums/EnumEntriesList;", "T", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/enums/EnumEntries;", "Lkotlin/collections/AbstractList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "entries", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Enum;)V", "[Ljava/lang/Enum;", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "contains", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Enum;)Z", "get", "index", "(I)Ljava/lang/Enum;", "indexOf", "(Ljava/lang/Enum;)I", "lastIndexOf", "writeReplace", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class EnumEntriesList<T extends java.lang.Enum<T>> extends kotlin.collections.AbstractList<T> implements kotlin.enums.EnumEntries<T>, java.io.Serializable {
    private final T[] entries;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return contains((kotlin.enums.EnumEntriesList<T>) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return indexOf((kotlin.enums.EnumEntriesList<T>) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof java.lang.Enum) {
            return lastIndexOf((kotlin.enums.EnumEntriesList<T>) obj);
        }
        return -1;
    }

    public EnumEntriesList(T[] entries) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entries, "entries");
        this.entries = entries;
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        return this.entries.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public T get(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, this.entries.length);
        return this.entries[index];
    }

    public boolean contains(T element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        return ((java.lang.Enum) kotlin.collections.ArraysKt.getOrNull(this.entries, element.ordinal())) == element;
    }

    public int indexOf(T element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        int ordinal = element.ordinal();
        if (((java.lang.Enum) kotlin.collections.ArraysKt.getOrNull(this.entries, ordinal)) == element) {
            return ordinal;
        }
        return -1;
    }

    public int lastIndexOf(T element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "element");
        return indexOf((java.lang.Object) element);
    }

    private final java.lang.Object writeReplace() {
        return new kotlin.enums.EnumEntriesSerializationProxy(this.entries);
    }
}
