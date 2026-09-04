package tool.wu.heng.ui.screens.details;

/* compiled from: LazyDsl.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "T", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "invoke", "androidx/compose/foundation/lazy/LazyDslKt$items$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object> {
    final /* synthetic */ java.util.List $items;
    final /* synthetic */ kotlin.jvm.functions.Function1 $key;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$2(kotlin.jvm.functions.Function1 function1, java.util.List list) {
        super(1);
        this.$key = function1;
        this.$items = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
        return invoke(num.intValue());
    }

    public final java.lang.Object invoke(int i) {
        return this.$key.invoke(this.$items.get(i));
    }
}
