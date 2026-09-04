package tool.wu.heng.parser;

/* compiled from: UrlExtractor.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Ltool/wu/heng/parser/UrlExtractor;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "TRAILING_PUNCTUATION", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "URL_REGEX", "Lkotlin/text/Regex;", "extract", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "rawText", "extractAll", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "host", "url", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class UrlExtractor {
    public static final tool.wu.heng.parser.UrlExtractor INSTANCE = new tool.wu.heng.parser.UrlExtractor();
    private static final kotlin.text.Regex URL_REGEX = new kotlin.text.Regex("https?://[-\\w./?=&%#:@+~]+");
    private static final char[] TRAILING_PUNCTUATION = {65292, 12290, 12289, 65307, 65306, 65281, 65311, 65289, 12305, kotlin.text.Typography.rightDoubleQuote, kotlin.text.Typography.rightSingleQuote, ',', '.', ';', ':', '!', '?', ')', ']', kotlin.text.Typography.quote, '\'', '\\'};
    public static final int $stable = 8;

    private UrlExtractor() {
    }

    public final java.lang.String extract(java.lang.String rawText) {
        kotlin.text.MatchResult find$default;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawText, "rawText");
        java.lang.String obj = kotlin.text.StringsKt.trim((java.lang.CharSequence) rawText).toString();
        if (obj.length() == 0 || (find$default = kotlin.text.Regex.find$default(URL_REGEX, obj, 0, 2, null)) == null) {
            return null;
        }
        java.lang.String value = find$default.getValue();
        while (true) {
            str = value;
            if (str.length() <= 0 || !kotlin.collections.ArraysKt.contains(TRAILING_PUNCTUATION, kotlin.text.StringsKt.last(str))) {
                break;
            }
            value = kotlin.text.StringsKt.dropLast(value, 1);
        }
        return str.length() != 0 ? str : null;
    }

    public final java.util.List<java.lang.String> extractAll(java.lang.String rawText) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawText, "rawText");
        return kotlin.sequences.SequencesKt.toList(kotlin.sequences.SequencesKt.distinct(kotlin.sequences.SequencesKt.filter(kotlin.sequences.SequencesKt.map(kotlin.text.Regex.findAll$default(URL_REGEX, kotlin.text.StringsKt.trim((java.lang.CharSequence) rawText).toString(), 0, 2, null), new kotlin.jvm.functions.Function1<kotlin.text.MatchResult, java.lang.String>() { // from class: tool.wu.heng.parser.UrlExtractor$extractAll$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.String invoke(kotlin.text.MatchResult match) {
                char[] cArr;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(match, "match");
                java.lang.String value = match.getValue();
                while (true) {
                    java.lang.String str = value;
                    if (str.length() <= 0) {
                        break;
                    }
                    cArr = tool.wu.heng.parser.UrlExtractor.TRAILING_PUNCTUATION;
                    if (!kotlin.collections.ArraysKt.contains(cArr, kotlin.text.StringsKt.last(str))) {
                        break;
                    }
                    value = kotlin.text.StringsKt.dropLast(value, 1);
                }
                return value;
            }
        }), new kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean>() { // from class: tool.wu.heng.parser.UrlExtractor$extractAll$2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Boolean invoke(java.lang.String it) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                return java.lang.Boolean.valueOf(it.length() > 0);
            }
        })));
    }

    public final java.lang.String host(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String lowerCase = kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringBefore$default(kotlin.text.StringsKt.substringAfter(url, "://", url), '/', (java.lang.String) null, 2, (java.lang.Object) null), '?', (java.lang.String) null, 2, (java.lang.Object) null).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
