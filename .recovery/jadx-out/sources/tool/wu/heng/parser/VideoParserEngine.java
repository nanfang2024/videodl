package tool.wu.heng.parser;

/* compiled from: VideoParserEngine.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000b2\u0006\u0010\f\u001a\u00020\u0007J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u000e2\u0006\u0010\u0010\u001a\u00020\u0007H\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Ltool/wu/heng/parser/VideoParserEngine;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "parsers", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/parser/LocalVideoParser;", "supportedPlatforms", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSupportedPlatforms", "()Ljava/util/List;", "downloadHeaders", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "source", "parse", "Lkotlin/Result;", "Ltool/wu/heng/data/model/VideoInfo;", "rawText", "parse-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoParserEngine {
    public static final int $stable;
    public static final tool.wu.heng.parser.VideoParserEngine INSTANCE = new tool.wu.heng.parser.VideoParserEngine();
    private static final java.util.List<tool.wu.heng.parser.LocalVideoParser> parsers;
    private static final java.util.List<java.lang.String> supportedPlatforms;

    public final java.util.List<java.lang.String> getSupportedPlatforms() {
        return supportedPlatforms;
    }

    private VideoParserEngine() {
    }

    static {
        java.util.List<tool.wu.heng.parser.LocalVideoParser> listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new tool.wu.heng.parser.LocalVideoParser[]{new tool.wu.heng.parser.DouyinParser(), new tool.wu.heng.parser.BilibiliParser(), new tool.wu.heng.parser.KuaishouParser(), new tool.wu.heng.parser.XiaohongshuParser()});
        parsers = listOf;
        java.util.List<tool.wu.heng.parser.LocalVideoParser> list = listOf;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((tool.wu.heng.parser.LocalVideoParser) it.next()).getPlatform());
        }
        supportedPlatforms = arrayList;
        $stable = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: parse-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m1385parsegIAlus(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<tool.wu.heng.data.model.VideoInfo>>> continuation) {
        tool.wu.heng.parser.VideoParserEngine$parse$1 videoParserEngine$parse$1;
        int i;
        if (continuation instanceof tool.wu.heng.parser.VideoParserEngine$parse$1) {
            videoParserEngine$parse$1 = (tool.wu.heng.parser.VideoParserEngine$parse$1) continuation;
            if ((videoParserEngine$parse$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                videoParserEngine$parse$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = videoParserEngine$parse$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = videoParserEngine$parse$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.CoroutineDispatcher io = kotlinx.coroutines.Dispatchers.getIO();
                    tool.wu.heng.parser.VideoParserEngine$parse$2 videoParserEngine$parse$2 = new tool.wu.heng.parser.VideoParserEngine$parse$2(str, null);
                    videoParserEngine$parse$1.label = 1;
                    obj = kotlinx.coroutines.BuildersKt.withContext(io, videoParserEngine$parse$2, videoParserEngine$parse$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlin.Result) obj).unbox-impl();
            }
        }
        videoParserEngine$parse$1 = new tool.wu.heng.parser.VideoParserEngine$parse$1(this, continuation);
        java.lang.Object obj2 = videoParserEngine$parse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = videoParserEngine$parse$1.label;
        if (i != 0) {
        }
        return ((kotlin.Result) obj2).unbox-impl();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0012. Please report as an issue. */
    public final java.util.Map<java.lang.String, java.lang.String> downloadHeaders(java.lang.String source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
        switch (source.hashCode()) {
            case -1325936172:
                if (source.equals(tool.wu.heng.parser.DouyinParser.SOURCE)) {
                    return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE), kotlin.TuplesKt.to("Referer", "https://www.douyin.com/"));
                }
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE));
            case 887268872:
                if (source.equals(tool.wu.heng.parser.BilibiliParser.SOURCE)) {
                    return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_DESKTOP), kotlin.TuplesKt.to("Referer", "https://www.bilibili.com/"));
                }
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE));
            case 1138387213:
                if (source.equals(tool.wu.heng.parser.KuaishouParser.SOURCE)) {
                    return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE), kotlin.TuplesKt.to("Referer", "https://www.kuaishou.com/"));
                }
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE));
            case 1997822977:
                if (source.equals(tool.wu.heng.parser.XiaohongshuParser.SOURCE)) {
                    return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE), kotlin.TuplesKt.to("Referer", "https://www.xiaohongshu.com/"));
                }
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE));
            default:
                return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("User-Agent", tool.wu.heng.parser.ParserHttp.UA_IPHONE));
        }
    }
}
