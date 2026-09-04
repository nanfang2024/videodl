package kotlinx.coroutines.internal;

/* compiled from: InlineList.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ$\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000eH\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0086\u0002ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0003\u0092\u0001\u0004\u0018\u00010\u0002ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/internal/InlineList;", "E", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "holder", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "forEachReversed", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "action", "Lkotlin/Function1;", "forEachReversed-impl", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hashCode-impl", "(Ljava/lang/Object;)I", "plus", "element", "plus-FjFbRPM", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class InlineList<E> {
    private final java.lang.Object holder;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlinx.coroutines.internal.InlineList m1192boximpl(java.lang.Object obj) {
        return new kotlinx.coroutines.internal.InlineList(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> java.lang.Object m1193constructorimpl(java.lang.Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1195equalsimpl(java.lang.Object obj, java.lang.Object obj2) {
        return (obj2 instanceof kotlinx.coroutines.internal.InlineList) && kotlin.jvm.internal.Intrinsics.areEqual(obj, ((kotlinx.coroutines.internal.InlineList) obj2).getHolder());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1196equalsimpl0(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1198hashCodeimpl(java.lang.Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1200toStringimpl(java.lang.Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m1195equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m1198hashCodeimpl(this.holder);
    }

    public java.lang.String toString() {
        return m1200toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.Object getHolder() {
        return this.holder;
    }

    private /* synthetic */ InlineList(java.lang.Object obj) {
        this.holder = obj;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ java.lang.Object m1194constructorimpl$default(java.lang.Object obj, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m1193constructorimpl(obj);
    }

    /* renamed from: plus-FjFbRPM, reason: not valid java name */
    public static final java.lang.Object m1199plusFjFbRPM(java.lang.Object obj, E e) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(!(e instanceof java.util.List))) {
            throw new java.lang.AssertionError();
        }
        if (obj == null) {
            return m1193constructorimpl(e);
        }
        if (obj instanceof java.util.ArrayList) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ((java.util.ArrayList) obj).add(e);
            return m1193constructorimpl(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m1193constructorimpl(arrayList);
    }

    /* renamed from: forEachReversed-impl, reason: not valid java name */
    public static final void m1197forEachReversedimpl(java.lang.Object obj, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof java.util.ArrayList)) {
            function1.invoke(obj);
            return;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                function1.invoke((java.lang.Object) arrayList.get(size));
            }
        }
    }
}
