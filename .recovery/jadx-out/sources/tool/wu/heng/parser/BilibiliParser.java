package tool.wu.heng.parser;

/* compiled from: BilibiliParser.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J<\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bH\u0016J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0018\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"Ltool/wu/heng/parser/BilibiliParser;", "Ltool/wu/heng/parser/LocalVideoParser;", "()V", "avidRegex", "Lkotlin/text/Regex;", "bvidRegex", "pageRegex", "platform", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getPlatform", "()Ljava/lang/String;", "fetchQuality", "Ltool/wu/heng/data/model/QualityOption;", "bvid", "avid", "cid", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "qn", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "referer", "aspect", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "matches", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "url", "parse", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestJson", "Lcom/google/gson/JsonObject;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class BilibiliParser implements tool.wu.heng.parser.LocalVideoParser {
    public static final java.lang.String SOURCE = "bilibili";
    public static final int $stable = 8;
    private static final java.util.List<java.lang.Integer> QN_LIST = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Integer[]{80, 64, 32, 16});
    private static final java.util.Map<java.lang.Integer, java.lang.Integer> QN_HEIGHT = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(120, 2160), kotlin.TuplesKt.to(116, 1080), kotlin.TuplesKt.to(112, 1080), kotlin.TuplesKt.to(80, 1080), kotlin.TuplesKt.to(74, 720), kotlin.TuplesKt.to(64, 720), kotlin.TuplesKt.to(32, 480), kotlin.TuplesKt.to(16, 360));
    private final java.lang.String platform = "哔哩哔哩";
    private final kotlin.text.Regex bvidRegex = new kotlin.text.Regex("(BV[0-9A-Za-z]{10})");
    private final kotlin.text.Regex avidRegex = new kotlin.text.Regex("/av(\\d+)", kotlin.text.RegexOption.IGNORE_CASE);
    private final kotlin.text.Regex pageRegex = new kotlin.text.Regex("[?&]p=(\\d+)");

    @Override // tool.wu.heng.parser.LocalVideoParser
    public java.lang.String getPlatform() {
        return this.platform;
    }

    @Override // tool.wu.heng.parser.LocalVideoParser
    public boolean matches(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String host = tool.wu.heng.parser.UrlExtractor.INSTANCE.host(url);
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "bilibili.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "b23.tv", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "acg.tv", false, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0189, code lost:
    
        if (r1 != null) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b5  */
    @Override // tool.wu.heng.parser.LocalVideoParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object parse(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.model.VideoInfo>> continuation) {
        long asLong;
        java.lang.String str2;
        java.lang.String asString;
        java.lang.String str3;
        com.google.gson.JsonElement jsonElement;
        java.lang.Long l;
        long asLong2;
        java.util.Iterator<java.lang.Integer> it;
        java.util.ArrayList arrayList;
        com.google.gson.JsonElement jsonElement2;
        com.google.gson.JsonElement jsonElement3;
        com.google.gson.JsonElement jsonElement4;
        com.google.gson.JsonElement jsonElement5;
        com.google.gson.JsonElement jsonElement6;
        java.util.List<java.lang.String> groupValues;
        java.lang.String str4;
        java.lang.Integer intOrNull;
        java.lang.String str5;
        java.util.List<java.lang.String> groupValues2;
        java.util.List<java.lang.String> groupValues3;
        java.lang.String str6 = str;
        java.lang.String str7 = str6;
        if (!this.bvidRegex.containsMatchIn(str7) && !this.avidRegex.containsMatchIn(str7)) {
            str6 = tool.wu.heng.parser.ParserHttp.INSTANCE.resolveRedirect(str6, tool.wu.heng.parser.ParserHttp.UA_DESKTOP);
        }
        java.lang.String str8 = str6;
        java.lang.Object obj = null;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(this.bvidRegex, str8, 0, 2, null);
        java.lang.String str9 = (find$default == null || (groupValues3 = find$default.getGroupValues()) == null) ? null : groupValues3.get(1);
        kotlin.text.MatchResult find$default2 = kotlin.text.Regex.find$default(this.avidRegex, str8, 0, 2, null);
        java.lang.String str10 = (find$default2 == null || (groupValues2 = find$default2.getGroupValues()) == null) ? null : groupValues2.get(1);
        if (str9 == null && str10 == null) {
            throw new tool.wu.heng.parser.ParseException("链接无效，请确认是哔哩哔哩视频链接", null, 2, null);
        }
        com.google.gson.JsonObject requestJson$default = requestJson$default(this, "https://api.bilibili.com/x/web-interface/view?" + (str9 != null ? new java.lang.StringBuilder("bvid=").append(str9) : new java.lang.StringBuilder("aid=").append(str10)).toString(), null, 2, null);
        com.google.gson.JsonElement jsonElement7 = requestJson$default.get("code");
        int asInt = jsonElement7 != null ? jsonElement7.getAsInt() : -1;
        java.lang.String str11 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
        if (asInt != 0) {
            com.google.gson.JsonElement jsonElement8 = requestJson$default.get("message");
            java.lang.String asString2 = jsonElement8 != null ? jsonElement8.getAsString() : null;
            if (asString2 != null) {
                str11 = asString2;
            }
            if (asInt == -404) {
                str5 = "视频不存在或已被删除";
            } else if (asInt != -403) {
                java.lang.String str12 = str11;
                if (kotlin.text.StringsKt.isBlank(str12)) {
                    str12 = java.lang.String.valueOf(asInt);
                }
                str5 = "哔哩哔哩返回错误：" + ((java.lang.Object) str12);
            } else {
                str5 = "该视频需要登录或大会员权限，暂不支持";
            }
            throw new tool.wu.heng.parser.ParseException(str5, null, 2, null);
        }
        com.google.gson.JsonObject asJsonObject = requestJson$default.getAsJsonObject("data");
        if (asJsonObject == null) {
            throw new tool.wu.heng.parser.ParseException("未解析到视频信息", null, 2, null);
        }
        kotlin.text.MatchResult find$default3 = kotlin.text.Regex.find$default(this.pageRegex, str8, 0, 2, null);
        int intValue = (find$default3 == null || (groupValues = find$default3.getGroupValues()) == null || (str4 = groupValues.get(1)) == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(str4)) == null) ? 1 : intOrNull.intValue();
        com.google.gson.JsonArray asJsonArray = asJsonObject.getAsJsonArray("pages");
        com.google.gson.JsonObject asJsonObject2 = (asJsonArray == null || asJsonArray.size() == 0) ? null : (1 > intValue || intValue > asJsonArray.size()) ? asJsonArray.get(0).getAsJsonObject() : asJsonArray.get(intValue - 1).getAsJsonObject();
        if (asJsonObject2 == null || (jsonElement6 = asJsonObject2.get("cid")) == null) {
            com.google.gson.JsonElement jsonElement9 = asJsonObject.get("cid");
            if (jsonElement9 == null) {
                throw new tool.wu.heng.parser.ParseException("未获取到分P信息", null, 2, null);
            }
            asLong = jsonElement9.getAsLong();
        } else {
            asLong = jsonElement6.getAsLong();
        }
        long j = asLong;
        if (str9 == null) {
            com.google.gson.JsonElement jsonElement10 = asJsonObject.get("bvid");
            str9 = jsonElement10 != null ? jsonElement10.getAsString() : null;
            if (str9 == null) {
                str2 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                if (asJsonObject2 != null && (jsonElement5 = asJsonObject2.get("part")) != null && (asString = jsonElement5.getAsString()) != null) {
                    if (asJsonArray != null || asJsonArray.size() <= 1 || !(true ^ kotlin.text.StringsKt.isBlank(asString))) {
                        asString = null;
                    }
                }
                com.google.gson.JsonElement jsonElement11 = asJsonObject.get("title");
                asString = jsonElement11 == null ? jsonElement11.getAsString() : null;
                if (asString == null) {
                    str3 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                    com.google.gson.JsonElement jsonElement12 = asJsonObject.get("pic");
                    java.lang.String asString3 = jsonElement12 != null ? jsonElement12.getAsString() : null;
                    if (asJsonObject2 != null || (jsonElement4 = asJsonObject2.get("duration")) == null) {
                        jsonElement = asJsonObject.get("duration");
                        if (jsonElement == null) {
                            l = null;
                            com.google.gson.JsonObject asJsonObject3 = asJsonObject2 == null ? asJsonObject2.getAsJsonObject("dimension") : null;
                            int asInt2 = (asJsonObject3 != null || (jsonElement3 = asJsonObject3.get("width")) == null) ? 0 : jsonElement3.getAsInt();
                            int asInt3 = (asJsonObject3 != null || (jsonElement2 = asJsonObject3.get("height")) == null) ? 0 : jsonElement2.getAsInt();
                            double d = (asInt2 > 0 || asInt3 <= 0) ? 1.7777777777777777d : asInt2 / asInt3;
                            java.lang.String str13 = "https://www.bilibili.com/video/" + str2;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            it = QN_LIST.iterator();
                            while (it.hasNext()) {
                                java.lang.String str14 = str2;
                                java.util.ArrayList arrayList3 = arrayList2;
                                tool.wu.heng.data.model.QualityOption fetchQuality = fetchQuality(str2, str10, j, it.next().intValue(), str13, d);
                                if (fetchQuality != null) {
                                    java.util.ArrayList arrayList4 = arrayList3;
                                    if (!(arrayList4 instanceof java.util.Collection) || !arrayList4.isEmpty()) {
                                        java.util.Iterator it2 = arrayList4.iterator();
                                        while (it2.hasNext()) {
                                            if (kotlin.jvm.internal.Intrinsics.areEqual(((tool.wu.heng.data.model.QualityOption) it2.next()).getResolution(), fetchQuality.getResolution())) {
                                                break;
                                            }
                                        }
                                    }
                                    arrayList3.add(fetchQuality);
                                }
                                arrayList2 = arrayList3;
                                str2 = str14;
                            }
                            arrayList = arrayList2;
                            if (!arrayList.isEmpty()) {
                                throw new tool.wu.heng.parser.ParseException("未获取到可用播放地址，该视频可能需要登录或为付费内容", null, 2, null);
                            }
                            java.util.ArrayList arrayList5 = arrayList;
                            java.util.Iterator it3 = arrayList5.iterator();
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (it3.hasNext()) {
                                    java.lang.Integer height = ((tool.wu.heng.data.model.QualityOption) obj).getHeight();
                                    int intValue2 = height != null ? height.intValue() : 0;
                                    do {
                                        java.lang.Object next = it3.next();
                                        java.lang.Integer height2 = ((tool.wu.heng.data.model.QualityOption) next).getHeight();
                                        int intValue3 = height2 != null ? height2.intValue() : 0;
                                        if (intValue2 < intValue3) {
                                            obj = next;
                                            intValue2 = intValue3;
                                        }
                                    } while (it3.hasNext());
                                }
                            }
                            tool.wu.heng.data.model.QualityOption qualityOption = (tool.wu.heng.data.model.QualityOption) obj;
                            if (qualityOption == null) {
                                qualityOption = (tool.wu.heng.data.model.QualityOption) kotlin.collections.CollectionsKt.first((java.util.List) arrayList);
                            }
                            java.lang.String str15 = str3;
                            if (kotlin.text.StringsKt.isBlank(str15)) {
                                str15 = "哔哩哔哩视频";
                            }
                            return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(str15, asString3, l, kotlin.collections.CollectionsKt.sortedWith(arrayList5, new java.util.Comparator() { // from class: tool.wu.heng.parser.BilibiliParser$parse$$inlined$sortedByDescending$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    java.lang.Integer height3 = ((tool.wu.heng.data.model.QualityOption) t2).getHeight();
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(height3 != null ? height3.intValue() : 0);
                                    java.lang.Integer height4 = ((tool.wu.heng.data.model.QualityOption) t).getHeight();
                                    return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(height4 != null ? height4.intValue() : 0));
                                }
                            }), qualityOption.getUrl(), null, "mp4", SOURCE, false, false, false, qualityOption.getFilesize(), 1824, null));
                        }
                        asLong2 = jsonElement.getAsLong();
                    } else {
                        asLong2 = jsonElement4.getAsLong();
                    }
                    l = kotlin.coroutines.jvm.internal.Boxing.boxLong(asLong2);
                    if (asJsonObject2 == null) {
                    }
                    if (asJsonObject3 != null) {
                    }
                    if (asJsonObject3 != null) {
                    }
                    double d2 = (asInt2 > 0 || asInt3 <= 0) ? 1.7777777777777777d : asInt2 / asInt3;
                    java.lang.String str132 = "https://www.bilibili.com/video/" + str2;
                    java.util.ArrayList arrayList22 = new java.util.ArrayList();
                    it = QN_LIST.iterator();
                    while (it.hasNext()) {
                    }
                    arrayList = arrayList22;
                    if (!arrayList.isEmpty()) {
                    }
                }
                str3 = asString;
                com.google.gson.JsonElement jsonElement122 = asJsonObject.get("pic");
                if (jsonElement122 != null) {
                }
                if (asJsonObject2 != null) {
                }
                jsonElement = asJsonObject.get("duration");
                if (jsonElement == null) {
                }
            }
        }
        str2 = str9;
        if (asJsonObject2 != null) {
            if (asJsonArray != null) {
            }
            asString = null;
        }
        com.google.gson.JsonElement jsonElement112 = asJsonObject.get("title");
        if (jsonElement112 == null) {
        }
        if (asString == null) {
        }
        str3 = asString;
        com.google.gson.JsonElement jsonElement1222 = asJsonObject.get("pic");
        if (jsonElement1222 != null) {
        }
        if (asJsonObject2 != null) {
        }
        jsonElement = asJsonObject.get("duration");
        if (jsonElement == null) {
        }
    }

    private final tool.wu.heng.data.model.QualityOption fetchQuality(java.lang.String bvid, java.lang.String avid, long cid, int qn, java.lang.String referer, double aspect) {
        com.google.gson.JsonObject asJsonObject;
        com.google.gson.JsonArray asJsonArray;
        try {
            com.google.gson.JsonObject requestJson = requestJson("https://api.bilibili.com/x/player/playurl?" + (kotlin.text.StringsKt.isBlank(bvid) ^ true ? new java.lang.StringBuilder("bvid=").append(bvid) : new java.lang.StringBuilder("avid=").append(avid)).toString() + "&cid=" + cid + "&qn=" + qn + "&platform=html5&high_quality=1&fnval=0&fourk=1", referer);
            com.google.gson.JsonElement jsonElement = requestJson.get("code");
            if (jsonElement == null || jsonElement.getAsInt() != 0 || (asJsonObject = requestJson.getAsJsonObject("data")) == null || (asJsonArray = asJsonObject.getAsJsonArray("durl")) == null || asJsonArray.size() == 0) {
                return null;
            }
            com.google.gson.JsonObject asJsonObject2 = asJsonArray.get(0).getAsJsonObject();
            com.google.gson.JsonElement jsonElement2 = asJsonObject2.get("url");
            java.lang.String asString = jsonElement2 != null ? jsonElement2.getAsString() : null;
            if (asString == null) {
                return null;
            }
            com.google.gson.JsonElement jsonElement3 = asJsonObject2.get("size");
            long asLong = jsonElement3 != null ? jsonElement3.getAsLong() : 0L;
            com.google.gson.JsonElement jsonElement4 = asJsonObject.get("quality");
            int asInt = jsonElement4 != null ? jsonElement4.getAsInt() : qn;
            java.lang.Integer num = QN_HEIGHT.get(java.lang.Integer.valueOf(asInt));
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            return new tool.wu.heng.data.model.QualityOption("bilibili-" + asInt, kotlin.ranges.RangesKt.coerceAtLeast((int) (intValue * aspect), 1) + "x" + intValue, "mp4", asLong, asString);
        } catch (java.lang.Exception e) {
            timber.log.Timber.INSTANCE.w(e, "哔哩哔哩 qn=%d 请求失败", java.lang.Integer.valueOf(qn));
            return null;
        }
    }

    static /* synthetic */ com.google.gson.JsonObject requestJson$default(tool.wu.heng.parser.BilibiliParser bilibiliParser, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return bilibiliParser.requestJson(str, str2);
    }

    private final com.google.gson.JsonObject requestJson(java.lang.String url, java.lang.String referer) {
        tool.wu.heng.parser.ParserHttp parserHttp = tool.wu.heng.parser.ParserHttp.INSTANCE;
        if (referer == null) {
            referer = "https://www.bilibili.com/";
        }
        java.lang.String string$default = tool.wu.heng.parser.ParserHttp.getString$default(parserHttp, url, tool.wu.heng.parser.ParserHttp.UA_DESKTOP, referer, null, 8, null);
        if (kotlin.text.StringsKt.isBlank(string$default)) {
            throw new tool.wu.heng.parser.ParseException("哔哩哔哩接口返回为空，请稍后重试", null, 2, null);
        }
        com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(string$default).getAsJsonObject();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "getAsJsonObject(...)");
        return asJsonObject;
    }
}
