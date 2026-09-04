package tool.wu.heng.parser;

/* compiled from: LocalVideoParser.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H&J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\b\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Ltool/wu/heng/parser/LocalVideoParser;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "platform", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getPlatform", "()Ljava/lang/String;", "matches", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "url", "parse", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public interface LocalVideoParser {
    java.lang.String getPlatform();

    boolean matches(java.lang.String url);

    java.lang.Object parse(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.model.VideoInfo>> continuation);
}
