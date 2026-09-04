package tool.wu.heng.parser;

/* compiled from: KuaishouParser.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000f\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\u0013J\f\u0010\u0014\u001a\u00020\t*\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Ltool/wu/heng/parser/KuaishouParser;", "Ltool/wu/heng/parser/LocalVideoParser;", "()V", "coverRegex", "Lkotlin/text/Regex;", "durationRegex", "mp4Regex", "photoIdRegex", "platform", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getPlatform", "()Ljava/lang/String;", "titleRegex", "matches", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "url", "parse", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unescapeSlash", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class KuaishouParser implements tool.wu.heng.parser.LocalVideoParser {
    public static final java.lang.String SOURCE = "kuaishou";
    public static final int $stable = 8;
    private final java.lang.String platform = "快手";
    private final kotlin.text.Regex photoIdRegex = new kotlin.text.Regex("(?:photo|short-video|video)/([-\\w]+)");
    private final kotlin.text.Regex mp4Regex = new kotlin.text.Regex("https?://[-\\w./?=&%#:@+~\\\\]*?\\.mp4[-\\w./?=&%#:@+~\\\\]*");
    private final kotlin.text.Regex titleRegex = new kotlin.text.Regex("<title[^>]*>(.*?)</title>", kotlin.text.RegexOption.DOT_MATCHES_ALL);
    private final kotlin.text.Regex coverRegex = new kotlin.text.Regex("\"coverUrls?\"\\s*:\\s*\\[?\\s*\\{?\\s*\"url\"\\s*:\\s*\"(https?://[^\"]+)\"");
    private final kotlin.text.Regex durationRegex = new kotlin.text.Regex("\"duration\"\\s*:\\s*(\\d+)");

    @Override // tool.wu.heng.parser.LocalVideoParser
    public java.lang.String getPlatform() {
        return this.platform;
    }

    @Override // tool.wu.heng.parser.LocalVideoParser
    public boolean matches(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String host = tool.wu.heng.parser.UrlExtractor.INSTANCE.host(url);
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "kuaishou.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "gifshow.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "chenzhongtech.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "kwai.com", false, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012e, code lost:
    
        if (r1 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    @Override // tool.wu.heng.parser.LocalVideoParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object parse(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.model.VideoInfo>> continuation) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str2;
        java.lang.String str3;
        java.util.List<java.lang.String> groupValues2;
        java.lang.String str4;
        java.lang.Long longOrNull;
        java.util.List<java.lang.String> groupValues3;
        java.lang.String str5;
        java.util.List<java.lang.String> groupValues4;
        java.lang.String str6;
        java.lang.String value;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(this.photoIdRegex, tool.wu.heng.parser.ParserHttp.resolveRedirect$default(tool.wu.heng.parser.ParserHttp.INSTANCE, str, null, 2, null), 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str2 = groupValues.get(1)) == null) {
            throw new tool.wu.heng.parser.ParseException("链接无效，请确认是快手视频链接", null, 2, null);
        }
        java.util.Iterator it = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"https://v.m.chenzhongtech.com/fw/photo/" + str2, "https://m.gifshow.com/fw/photo/" + str2, "https://www.kuaishou.com/short-video/" + str2}).iterator();
        boolean z = false;
        while (it.hasNext()) {
            try {
                java.lang.String string$default = tool.wu.heng.parser.ParserHttp.getString$default(tool.wu.heng.parser.ParserHttp.INSTANCE, (java.lang.String) it.next(), tool.wu.heng.parser.ParserHttp.UA_IPHONE, "https://www.kuaishou.com/", null, 8, null);
                if (kotlin.text.StringsKt.isBlank(string$default)) {
                    continue;
                } else {
                    if (kotlin.text.StringsKt.contains((java.lang.CharSequence) string$default, (java.lang.CharSequence) "captcha", true) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) string$default, (java.lang.CharSequence) "需要验证", false, 2, (java.lang.Object) null)) {
                        z = true;
                    }
                    kotlin.text.MatchResult find$default2 = kotlin.text.Regex.find$default(this.mp4Regex, string$default, 0, 2, null);
                    java.lang.String unescapeSlash = (find$default2 == null || (value = find$default2.getValue()) == null) ? null : unescapeSlash(value);
                    if (unescapeSlash != null) {
                        kotlin.text.MatchResult find$default3 = kotlin.text.Regex.find$default(this.titleRegex, string$default, 0, 2, null);
                        if (find$default3 != null && (groupValues4 = find$default3.getGroupValues()) != null && (str6 = groupValues4.get(1)) != null) {
                            java.lang.String replace = new kotlin.text.Regex("[-_|]\\s*快手.*$").replace(str6, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
                            if (replace != null) {
                                str3 = kotlin.text.StringsKt.trim((java.lang.CharSequence) replace).toString();
                                kotlin.text.MatchResult find$default4 = kotlin.text.Regex.find$default(this.coverRegex, string$default, 0, 2, null);
                                java.lang.String unescapeSlash2 = (find$default4 != null || (groupValues3 = find$default4.getGroupValues()) == null || (str5 = groupValues3.get(1)) == null) ? null : unescapeSlash(str5);
                                kotlin.text.MatchResult find$default5 = kotlin.text.Regex.find$default(this.durationRegex, string$default, 0, 2, null);
                                long longValue = (find$default5 != null || (groupValues2 = find$default5.getGroupValues()) == null || (str4 = groupValues2.get(1)) == null || (longOrNull = kotlin.text.StringsKt.toLongOrNull(str4)) == null) ? 0L : longOrNull.longValue();
                                if (str3 != null) {
                                    if (!(!kotlin.text.StringsKt.isBlank(str3))) {
                                        str3 = null;
                                    }
                                }
                                str3 = "快手视频";
                                return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(str3, unescapeSlash2, longValue > 1000 ? kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue / 1000) : null, kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("kuaishou-default", null, "mp4", 0L, unescapeSlash)), unescapeSlash, null, "mp4", SOURCE, false, false, false, 0L, 3872, null));
                            }
                        }
                        str3 = null;
                        kotlin.text.MatchResult find$default42 = kotlin.text.Regex.find$default(this.coverRegex, string$default, 0, 2, null);
                        if (find$default42 != null) {
                        }
                        kotlin.text.MatchResult find$default52 = kotlin.text.Regex.find$default(this.durationRegex, string$default, 0, 2, null);
                        if (find$default52 != null) {
                        }
                        if (str3 != null) {
                        }
                        str3 = "快手视频";
                        return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(str3, unescapeSlash2, longValue > 1000 ? kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue / 1000) : null, kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("kuaishou-default", null, "mp4", 0L, unescapeSlash)), unescapeSlash, null, "mp4", SOURCE, false, false, false, 0L, 3872, null));
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        throw new tool.wu.heng.parser.ParseException(z ? "快手已开启验证码风控，当前无法免登录解析该视频" : "快手未返回播放地址（平台风控），暂时无法解析", null, 2, null);
    }

    private final java.lang.String unescapeSlash(java.lang.String str) {
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "\\u002F", "/", false, 4, (java.lang.Object) null), "\\u002f", "/", false, 4, (java.lang.Object) null), "\\/", "/", false, 4, (java.lang.Object) null);
    }
}
