package kotlin.text;

/* compiled from: Regex.kt */
@kotlin.Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "get", "index", "name", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isEmpty", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "iterator", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MatcherMatchResult$groups$1 extends kotlin.collections.AbstractCollection<kotlin.text.MatchGroup> implements kotlin.text.MatchNamedGroupCollection {
    final /* synthetic */ kotlin.text.MatcherMatchResult this$0;

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MatcherMatchResult$groups$1(kotlin.text.MatcherMatchResult matcherMatchResult) {
        this.this$0 = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj == null || (obj instanceof kotlin.text.MatchGroup)) {
            return contains((kotlin.text.MatchGroup) obj);
        }
        return false;
    }

    public /* bridge */ boolean contains(kotlin.text.MatchGroup matchGroup) {
        return super.contains((kotlin.text.MatcherMatchResult$groups$1) matchGroup);
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public int get_size() {
        java.util.regex.MatchResult matchResult;
        matchResult = this.this$0.getMatchResult();
        return matchResult.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<kotlin.text.MatchGroup> iterator() {
        return kotlin.sequences.SequencesKt.map(kotlin.collections.CollectionsKt.asSequence(kotlin.collections.CollectionsKt.getIndices(this)), new kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.text.MatchGroup>() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlin.text.MatchGroup invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final kotlin.text.MatchGroup invoke(int i) {
                return kotlin.text.MatcherMatchResult$groups$1.this.get(i);
            }
        }).iterator();
    }

    @Override // kotlin.text.MatchGroupCollection
    public kotlin.text.MatchGroup get(int index) {
        java.util.regex.MatchResult matchResult;
        kotlin.ranges.IntRange range;
        java.util.regex.MatchResult matchResult2;
        matchResult = this.this$0.getMatchResult();
        range = kotlin.text.RegexKt.range(matchResult, index);
        if (range.getStart().intValue() < 0) {
            return null;
        }
        matchResult2 = this.this$0.getMatchResult();
        java.lang.String group = matchResult2.group(index);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(group, "group(...)");
        return new kotlin.text.MatchGroup(group, range);
    }

    @Override // kotlin.text.MatchNamedGroupCollection
    public kotlin.text.MatchGroup get(java.lang.String name) {
        java.util.regex.MatchResult matchResult;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        kotlin.internal.PlatformImplementations platformImplementations = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS;
        matchResult = this.this$0.getMatchResult();
        return platformImplementations.getMatchResultNamedGroup(matchResult, name);
    }
}
