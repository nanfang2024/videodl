package tool.wu.heng.parser;

/* compiled from: XiaohongshuParser.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u0002J\f\u0010\u0017\u001a\u00020\u0006*\u00020\u0006H\u0002J\f\u0010\u0018\u001a\u00020\u0006*\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u001a"}, d2 = {"Ltool/wu/heng/parser/XiaohongshuParser;", "Ltool/wu/heng/parser/LocalVideoParser;", "()V", "initialStateRegex", "Lkotlin/text/Regex;", "platform", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getPlatform", "()Ljava/lang/String;", "extractNoteId", "url", "matches", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "parse", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseImageNote", "note", "Lcom/google/gson/JsonObject;", "title", "cover", "parseVideoNote", "unescapeJson", "unescapeUrl", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class XiaohongshuParser implements tool.wu.heng.parser.LocalVideoParser {
    public static final java.lang.String SOURCE = "xiaohongshu";
    public static final int $stable = 8;
    private final java.lang.String platform = "小红书";
    private final kotlin.text.Regex initialStateRegex = new kotlin.text.Regex("window\\.__INITIAL_STATE__\\s*=\\s*(\\{.+?\\})\\s*</script>", kotlin.text.RegexOption.DOT_MATCHES_ALL);

    @Override // tool.wu.heng.parser.LocalVideoParser
    public java.lang.String getPlatform() {
        return this.platform;
    }

    @Override // tool.wu.heng.parser.LocalVideoParser
    public boolean matches(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String host = tool.wu.heng.parser.UrlExtractor.INSTANCE.host(url);
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "xiaohongshu.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "xhslink.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "xhslink.cn", false, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        if (r2 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0112, code lost:
    
        if (r5 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0187, code lost:
    
        if (r5 != null) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ba  */
    @Override // tool.wu.heng.parser.LocalVideoParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object parse(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.model.VideoInfo>> continuation) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str2;
        com.google.gson.JsonObject jsonObject;
        java.lang.String str3;
        java.lang.String asString;
        com.google.gson.JsonObject asJsonObject;
        java.lang.Iterable asJsonArray;
        com.google.gson.JsonElement jsonElement;
        com.google.gson.JsonObject asJsonObject2;
        com.google.gson.JsonElement jsonElement2;
        java.lang.Iterable asJsonArray2;
        java.lang.String str4;
        com.google.gson.JsonElement jsonElement3;
        com.google.gson.JsonObject asJsonObject3;
        com.google.gson.JsonElement jsonElement4;
        java.lang.String str5;
        java.lang.String unescapeUrl;
        com.google.gson.JsonObject asJsonObject4;
        java.lang.String str6 = null;
        java.lang.String resolveRedirect$default = tool.wu.heng.parser.ParserHttp.resolveRedirect$default(tool.wu.heng.parser.ParserHttp.INSTANCE, str, null, 2, null);
        java.lang.String str7 = resolveRedirect$default;
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "/404", false, 2, (java.lang.Object) null)) {
            throw new tool.wu.heng.parser.ParseException("笔记不存在或已被删除", null, 2, null);
        }
        if (!kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str7, (java.lang.CharSequence) "xiaohongshu.com", false, 2, (java.lang.Object) null)) {
            java.lang.String extractNoteId = extractNoteId(resolveRedirect$default);
            if (extractNoteId == null) {
                throw new tool.wu.heng.parser.ParseException("链接无效，请确认是小红书笔记链接", null, 2, null);
            }
            resolveRedirect$default = "https://www.xiaohongshu.com/explore/" + extractNoteId;
        }
        try {
            java.lang.String string$default = tool.wu.heng.parser.ParserHttp.getString$default(tool.wu.heng.parser.ParserHttp.INSTANCE, resolveRedirect$default, tool.wu.heng.parser.ParserHttp.UA_IPHONE, "https://www.xiaohongshu.com/", null, 8, null);
            if (kotlin.text.StringsKt.isBlank(string$default)) {
                throw new tool.wu.heng.parser.ParseException("小红书返回为空，可能需要登录后才能查看", null, 2, null);
            }
            kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(this.initialStateRegex, string$default, 0, 2, null);
            if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str2 = groupValues.get(1)) == null) {
                throw new tool.wu.heng.parser.ParseException("无法解析小红书页面数据，请稍后重试或更新应用", null, 2, null);
            }
            try {
                com.google.gson.JsonObject asJsonObject5 = com.google.gson.JsonParser.parseString(unescapeJson(str2)).getAsJsonObject().getAsJsonObject("noteData");
                asJsonObject4 = asJsonObject5 != null ? asJsonObject5.getAsJsonObject("data") : null;
            } catch (java.lang.Exception unused) {
            }
            if (asJsonObject4 != null) {
                jsonObject = asJsonObject4.getAsJsonObject("noteData");
                if (jsonObject != null) {
                    throw new tool.wu.heng.parser.ParseException("小红书页面数据结构异常，请稍后重试", null, 2, null);
                }
                com.google.gson.JsonElement jsonElement5 = jsonObject.get("type");
                java.lang.String asString2 = jsonElement5 != null ? jsonElement5.getAsString() : null;
                if (asString2 == null) {
                    asString2 = "normal";
                }
                com.google.gson.JsonElement jsonElement6 = jsonObject.get("title");
                if (jsonElement6 != null) {
                    if (!(!jsonElement6.isJsonNull())) {
                        jsonElement6 = null;
                    }
                    if (jsonElement6 != null) {
                        java.lang.String asString3 = jsonElement6.getAsString();
                        if (asString3 != null) {
                            str3 = kotlin.text.StringsKt.trim((java.lang.CharSequence) asString3).toString();
                        }
                    }
                }
                com.google.gson.JsonElement jsonElement7 = jsonObject.get("desc");
                if (jsonElement7 != null) {
                    if (!(!jsonElement7.isJsonNull())) {
                        jsonElement7 = null;
                    }
                    if (jsonElement7 != null && (asString = jsonElement7.getAsString()) != null) {
                        str3 = kotlin.text.StringsKt.trim((java.lang.CharSequence) asString).toString();
                        java.lang.String take = kotlin.text.StringsKt.take(str3, 80);
                        asJsonObject = jsonObject.getAsJsonObject("cover");
                        if (asJsonObject != null) {
                            com.google.gson.JsonElement jsonElement8 = asJsonObject.get("urlDefault");
                            if (jsonElement8 != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement8);
                                if (!(!jsonElement8.isJsonNull())) {
                                    jsonElement8 = null;
                                }
                                if (jsonElement8 != null) {
                                    str5 = jsonElement8.getAsString();
                                }
                            }
                            com.google.gson.JsonElement jsonElement9 = asJsonObject.get("url_default");
                            if (jsonElement9 != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement9);
                                if (!(!jsonElement9.isJsonNull())) {
                                    jsonElement9 = null;
                                }
                                if (jsonElement9 != null) {
                                    str5 = jsonElement9.getAsString();
                                    if (str5 == null) {
                                        com.google.gson.JsonElement jsonElement10 = asJsonObject.get("url");
                                        if (jsonElement10 != null) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement10);
                                            if (!(!jsonElement10.isJsonNull())) {
                                                jsonElement10 = null;
                                            }
                                            if (jsonElement10 != null) {
                                                str5 = jsonElement10.getAsString();
                                            }
                                        }
                                        str5 = null;
                                    }
                                    if (str5 != null && (unescapeUrl = unescapeUrl(str5)) != null) {
                                        str6 = unescapeUrl;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString2, "video")) {
                                            return parseVideoNote(jsonObject, take, str6);
                                        }
                                        return parseImageNote(jsonObject, take, str6);
                                    }
                                }
                            }
                            str5 = null;
                            if (str5 == null) {
                            }
                            if (str5 != null) {
                                str6 = unescapeUrl;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(asString2, "video")) {
                                }
                            }
                        }
                        asJsonArray = jsonObject.getAsJsonArray("imageList");
                        if (asJsonArray != null && (jsonElement = (com.google.gson.JsonElement) kotlin.collections.CollectionsKt.firstOrNull(asJsonArray)) != null && (asJsonObject2 = jsonElement.getAsJsonObject()) != null) {
                            jsonElement2 = asJsonObject2.get("url");
                            if (jsonElement2 != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement2);
                                if (!(!jsonElement2.isJsonNull())) {
                                    jsonElement2 = null;
                                }
                                if (jsonElement2 != null) {
                                    str4 = jsonElement2.getAsString();
                                }
                            }
                            asJsonArray2 = asJsonObject2.getAsJsonArray("infoList");
                            if (asJsonArray2 != null && (jsonElement3 = (com.google.gson.JsonElement) kotlin.collections.CollectionsKt.firstOrNull(asJsonArray2)) != null && (asJsonObject3 = jsonElement3.getAsJsonObject()) != null && (jsonElement4 = asJsonObject3.get("url")) != null) {
                                if (!(true ^ jsonElement4.isJsonNull())) {
                                    jsonElement4 = null;
                                }
                                if (jsonElement4 != null) {
                                    str4 = jsonElement4.getAsString();
                                    if (str4 != null) {
                                        str6 = unescapeUrl(str4);
                                    }
                                }
                            }
                            str4 = null;
                            if (str4 != null) {
                            }
                        }
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(asString2, "video")) {
                        }
                    }
                }
                str3 = "小红书内容";
                java.lang.String take2 = kotlin.text.StringsKt.take(str3, 80);
                asJsonObject = jsonObject.getAsJsonObject("cover");
                if (asJsonObject != null) {
                }
                asJsonArray = jsonObject.getAsJsonArray("imageList");
                if (asJsonArray != null) {
                    jsonElement2 = asJsonObject2.get("url");
                    if (jsonElement2 != null) {
                    }
                    asJsonArray2 = asJsonObject2.getAsJsonArray("infoList");
                    if (asJsonArray2 != null) {
                        if (!(true ^ jsonElement4.isJsonNull())) {
                        }
                        if (jsonElement4 != null) {
                        }
                    }
                    str4 = null;
                    if (str4 != null) {
                    }
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(asString2, "video")) {
                }
            }
            jsonObject = null;
            if (jsonObject != null) {
            }
        } catch (java.lang.Exception unused2) {
            throw new tool.wu.heng.parser.ParseException("网络请求失败，请检查网络后重试", null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0245, code lost:
    
        if (r13 != null) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.List<tool.wu.heng.data.model.VideoInfo> parseVideoNote(com.google.gson.JsonObject note, java.lang.String title, java.lang.String cover) {
        java.lang.Long l;
        com.google.gson.JsonObject jsonObject;
        com.google.gson.JsonElement jsonElement;
        com.google.gson.JsonElement jsonElement2;
        java.lang.Long l2;
        java.util.Iterator it;
        java.lang.Object next;
        tool.wu.heng.data.model.QualityOption qualityOption;
        com.google.gson.JsonElement jsonElement3;
        java.lang.String str;
        java.util.Iterator it2;
        java.lang.String str2;
        java.lang.String str3;
        com.google.gson.JsonArray jsonArray;
        int i;
        java.lang.String str4;
        com.google.gson.JsonElement jsonElement4;
        int i2;
        com.google.gson.JsonElement jsonElement5;
        int i3;
        com.google.gson.JsonElement jsonElement6;
        long j;
        com.google.gson.JsonElement jsonElement7;
        java.lang.String str5;
        com.google.gson.JsonElement jsonElement8;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str6;
        com.google.gson.JsonObject asJsonObject = note.getAsJsonObject("video");
        if (asJsonObject == null) {
            throw new tool.wu.heng.parser.ParseException("该笔记不含可下载的视频内容", null, 2, null);
        }
        com.google.gson.JsonObject asJsonObject2 = asJsonObject.getAsJsonObject("media");
        if (asJsonObject2 == null) {
            asJsonObject2 = asJsonObject.getAsJsonObject("mediaV2");
        }
        if (asJsonObject2 == null) {
            throw new tool.wu.heng.parser.ParseException("未获取到视频流信息", null, 2, null);
        }
        com.google.gson.JsonObject asJsonObject3 = asJsonObject2.getAsJsonObject("stream");
        if (asJsonObject3 == null) {
            throw new tool.wu.heng.parser.ParseException("未获取到视频流信息", null, 2, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.lang.String str7 = "h265";
        java.util.Iterator it3 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"h264", "h265", "av1"}).iterator();
        while (it3.hasNext()) {
            java.lang.String str8 = (java.lang.String) it3.next();
            com.google.gson.JsonArray asJsonArray = asJsonObject3.getAsJsonArray(str8);
            if (asJsonArray != null) {
                int size = asJsonArray.size();
                int i4 = 0;
                while (i4 < size) {
                    com.google.gson.JsonObject asJsonObject4 = asJsonArray.get(i4).getAsJsonObject();
                    com.google.gson.JsonElement jsonElement9 = asJsonObject4.get("masterUrl");
                    if (jsonElement9 != null) {
                        if (!(!jsonElement9.isJsonNull())) {
                            jsonElement9 = null;
                        }
                        if (jsonElement9 != null) {
                            str = jsonElement9.getAsString();
                            if (str != null) {
                                it2 = it3;
                                str3 = str7;
                                jsonArray = asJsonArray;
                                i = size;
                            } else {
                                com.google.gson.JsonArray asJsonArray2 = asJsonObject4.getAsJsonArray("backupUrls");
                                if (asJsonArray2 == null || asJsonArray2.size() <= 0) {
                                    it2 = it3;
                                } else {
                                    it2 = it3;
                                    com.google.gson.JsonElement jsonElement10 = asJsonArray2.get(0);
                                    if (!(!jsonElement10.isJsonNull())) {
                                        jsonElement10 = null;
                                    }
                                    if (jsonElement10 != null) {
                                        str2 = jsonElement10.getAsString();
                                        str3 = str7;
                                        jsonArray = asJsonArray;
                                        i = size;
                                        if (!kotlin.text.StringsKt.startsWith$default(str, "http", false, 2, (java.lang.Object) null)) {
                                            str = null;
                                        }
                                        if (str != null) {
                                            if (str2 != null) {
                                                if (!kotlin.text.StringsKt.startsWith$default(str2, "http", false, 2, (java.lang.Object) null)) {
                                                    str2 = null;
                                                }
                                                str6 = str2;
                                            } else {
                                                str6 = null;
                                            }
                                            if (str6 != null) {
                                                str4 = str6;
                                            }
                                        } else {
                                            str4 = str;
                                        }
                                        jsonElement4 = asJsonObject4.get("width");
                                        if (jsonElement4 != null) {
                                            if (!(!jsonElement4.isJsonNull())) {
                                                jsonElement4 = null;
                                            }
                                            if (jsonElement4 != null) {
                                                i2 = jsonElement4.getAsInt();
                                                jsonElement5 = asJsonObject4.get("height");
                                                if (jsonElement5 != null) {
                                                    if (!(!jsonElement5.isJsonNull())) {
                                                        jsonElement5 = null;
                                                    }
                                                    if (jsonElement5 != null) {
                                                        i3 = jsonElement5.getAsInt();
                                                        jsonElement6 = asJsonObject4.get("size");
                                                        if (jsonElement6 != null) {
                                                            if (!(!jsonElement6.isJsonNull())) {
                                                                jsonElement6 = null;
                                                            }
                                                            if (jsonElement6 != null) {
                                                                j = jsonElement6.getAsLong();
                                                                long j2 = j;
                                                                jsonElement7 = asJsonObject4.get("format");
                                                                if (jsonElement7 != null) {
                                                                    if (!(!jsonElement7.isJsonNull())) {
                                                                        jsonElement7 = null;
                                                                    }
                                                                    if (jsonElement7 != null) {
                                                                        str5 = jsonElement7.getAsString();
                                                                        java.lang.String str9 = str5 != null ? "mp4" : str5;
                                                                        jsonElement8 = asJsonObject4.get("streamDesc");
                                                                        if (jsonElement8 != null) {
                                                                            if (!(!jsonElement8.isJsonNull())) {
                                                                                jsonElement8 = null;
                                                                            }
                                                                            if (jsonElement8 != null) {
                                                                                obj = jsonElement8.getAsString();
                                                                                java.lang.String str10 = (i2 > 0 || i3 <= 0) ? null : i2 + "x" + i3;
                                                                                obj2 = str10 == null ? obj == null ? str8 : obj : str10;
                                                                                if (!linkedHashSet.contains(obj2)) {
                                                                                    linkedHashSet.add(obj2);
                                                                                    if (obj == null) {
                                                                                        obj = java.lang.Integer.valueOf(i3);
                                                                                    }
                                                                                    arrayList.add(new tool.wu.heng.data.model.QualityOption("xhs-" + str8 + "-" + obj, str10, str9, j2, str4));
                                                                                }
                                                                            }
                                                                        }
                                                                        obj = null;
                                                                        if (i2 > 0) {
                                                                        }
                                                                        if (str10 == null) {
                                                                        }
                                                                        if (!linkedHashSet.contains(obj2)) {
                                                                        }
                                                                    }
                                                                }
                                                                str5 = null;
                                                                if (str5 != null) {
                                                                }
                                                                jsonElement8 = asJsonObject4.get("streamDesc");
                                                                if (jsonElement8 != null) {
                                                                }
                                                                obj = null;
                                                                if (i2 > 0) {
                                                                }
                                                                if (str10 == null) {
                                                                }
                                                                if (!linkedHashSet.contains(obj2)) {
                                                                }
                                                            }
                                                        }
                                                        j = 0;
                                                        long j22 = j;
                                                        jsonElement7 = asJsonObject4.get("format");
                                                        if (jsonElement7 != null) {
                                                        }
                                                        str5 = null;
                                                        if (str5 != null) {
                                                        }
                                                        jsonElement8 = asJsonObject4.get("streamDesc");
                                                        if (jsonElement8 != null) {
                                                        }
                                                        obj = null;
                                                        if (i2 > 0) {
                                                        }
                                                        if (str10 == null) {
                                                        }
                                                        if (!linkedHashSet.contains(obj2)) {
                                                        }
                                                    }
                                                }
                                                i3 = 0;
                                                jsonElement6 = asJsonObject4.get("size");
                                                if (jsonElement6 != null) {
                                                }
                                                j = 0;
                                                long j222 = j;
                                                jsonElement7 = asJsonObject4.get("format");
                                                if (jsonElement7 != null) {
                                                }
                                                str5 = null;
                                                if (str5 != null) {
                                                }
                                                jsonElement8 = asJsonObject4.get("streamDesc");
                                                if (jsonElement8 != null) {
                                                }
                                                obj = null;
                                                if (i2 > 0) {
                                                }
                                                if (str10 == null) {
                                                }
                                                if (!linkedHashSet.contains(obj2)) {
                                                }
                                            }
                                        }
                                        i2 = 0;
                                        jsonElement5 = asJsonObject4.get("height");
                                        if (jsonElement5 != null) {
                                        }
                                        i3 = 0;
                                        jsonElement6 = asJsonObject4.get("size");
                                        if (jsonElement6 != null) {
                                        }
                                        j = 0;
                                        long j2222 = j;
                                        jsonElement7 = asJsonObject4.get("format");
                                        if (jsonElement7 != null) {
                                        }
                                        str5 = null;
                                        if (str5 != null) {
                                        }
                                        jsonElement8 = asJsonObject4.get("streamDesc");
                                        if (jsonElement8 != null) {
                                        }
                                        obj = null;
                                        if (i2 > 0) {
                                        }
                                        if (str10 == null) {
                                        }
                                        if (!linkedHashSet.contains(obj2)) {
                                        }
                                    }
                                }
                                str2 = null;
                                str3 = str7;
                                jsonArray = asJsonArray;
                                i = size;
                                if (!kotlin.text.StringsKt.startsWith$default(str, "http", false, 2, (java.lang.Object) null)) {
                                }
                                if (str != null) {
                                }
                                jsonElement4 = asJsonObject4.get("width");
                                if (jsonElement4 != null) {
                                }
                                i2 = 0;
                                jsonElement5 = asJsonObject4.get("height");
                                if (jsonElement5 != null) {
                                }
                                i3 = 0;
                                jsonElement6 = asJsonObject4.get("size");
                                if (jsonElement6 != null) {
                                }
                                j = 0;
                                long j22222 = j;
                                jsonElement7 = asJsonObject4.get("format");
                                if (jsonElement7 != null) {
                                }
                                str5 = null;
                                if (str5 != null) {
                                }
                                jsonElement8 = asJsonObject4.get("streamDesc");
                                if (jsonElement8 != null) {
                                }
                                obj = null;
                                if (i2 > 0) {
                                }
                                if (str10 == null) {
                                }
                                if (!linkedHashSet.contains(obj2)) {
                                }
                            }
                            i4++;
                            it3 = it2;
                            asJsonArray = jsonArray;
                            size = i;
                            str7 = str3;
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                    i4++;
                    it3 = it2;
                    asJsonArray = jsonArray;
                    size = i;
                    str7 = str3;
                }
            }
        }
        java.lang.String str11 = str7;
        if (arrayList.isEmpty()) {
            throw new tool.wu.heng.parser.ParseException("未获取到可下载的视频流，该笔记可能需要登录后查看", null, 2, null);
        }
        com.google.gson.JsonObject asJsonObject5 = asJsonObject2.getAsJsonObject("video");
        if (asJsonObject5 != null && (jsonElement3 = asJsonObject5.get("duration")) != null) {
            if (!(!jsonElement3.isJsonNull())) {
                jsonElement3 = null;
            }
            if (jsonElement3 != null) {
                l = java.lang.Long.valueOf(jsonElement3.getAsLong());
                if (l == null) {
                    long longValue = l.longValue();
                    if (longValue > 43200) {
                        longValue /= 1000;
                    }
                    l2 = java.lang.Long.valueOf(longValue);
                } else {
                    l2 = null;
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (it.hasNext()) {
                        java.lang.Integer height = ((tool.wu.heng.data.model.QualityOption) next).getHeight();
                        int intValue = height != null ? height.intValue() : 0;
                        do {
                            java.lang.Object next2 = it.next();
                            java.lang.Integer height2 = ((tool.wu.heng.data.model.QualityOption) next2).getHeight();
                            int intValue2 = height2 != null ? height2.intValue() : 0;
                            if (intValue < intValue2) {
                                next = next2;
                                intValue = intValue2;
                            }
                        } while (it.hasNext());
                    }
                }
                qualityOption = (tool.wu.heng.data.model.QualityOption) next;
                if (qualityOption == null) {
                    qualityOption = (tool.wu.heng.data.model.QualityOption) arrayList.get(0);
                }
                return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(title, cover, l2, arrayList, qualityOption.getUrl(), null, qualityOption.getExt(), SOURCE, false, false, false, qualityOption.getFilesize(), 1824, null));
            }
        }
        com.google.gson.JsonObject asJsonObject6 = asJsonObject.getAsJsonObject("capa");
        if (asJsonObject6 != null && (jsonElement2 = asJsonObject6.get("duration")) != null) {
            if (!(!jsonElement2.isJsonNull())) {
                jsonElement2 = null;
            }
            if (jsonElement2 != null) {
                l = java.lang.Long.valueOf(jsonElement2.getAsLong());
                if (l == null) {
                }
                it = arrayList.iterator();
                if (it.hasNext()) {
                }
                qualityOption = (tool.wu.heng.data.model.QualityOption) next;
                if (qualityOption == null) {
                }
                return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(title, cover, l2, arrayList, qualityOption.getUrl(), null, qualityOption.getExt(), SOURCE, false, false, false, qualityOption.getFilesize(), 1824, null));
            }
        }
        if (((tool.wu.heng.data.model.QualityOption) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList)) != null) {
            java.lang.Iterable asJsonArray3 = asJsonObject3.getAsJsonArray("h264");
            if (asJsonArray3 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(asJsonArray3);
                com.google.gson.JsonElement jsonElement11 = (com.google.gson.JsonElement) kotlin.collections.CollectionsKt.firstOrNull(asJsonArray3);
                if (jsonElement11 != null) {
                    jsonObject = jsonElement11.getAsJsonObject();
                }
            }
            java.lang.Iterable asJsonArray4 = asJsonObject3.getAsJsonArray(str11);
            if (asJsonArray4 != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(asJsonArray4);
                com.google.gson.JsonElement jsonElement12 = (com.google.gson.JsonElement) kotlin.collections.CollectionsKt.firstOrNull(asJsonArray4);
                if (jsonElement12 != null) {
                    jsonObject = jsonElement12.getAsJsonObject();
                    if (jsonObject != null && (jsonElement = jsonObject.get("duration")) != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement);
                        if (!(!jsonElement.isJsonNull())) {
                            jsonElement = null;
                        }
                        if (jsonElement != null) {
                            l = java.lang.Long.valueOf(jsonElement.getAsLong());
                            if (l == null) {
                            }
                            it = arrayList.iterator();
                            if (it.hasNext()) {
                            }
                            qualityOption = (tool.wu.heng.data.model.QualityOption) next;
                            if (qualityOption == null) {
                            }
                            return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(title, cover, l2, arrayList, qualityOption.getUrl(), null, qualityOption.getExt(), SOURCE, false, false, false, qualityOption.getFilesize(), 1824, null));
                        }
                    }
                }
            }
            jsonObject = null;
            if (jsonObject != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement);
                if (!(!jsonElement.isJsonNull())) {
                }
                if (jsonElement != null) {
                }
            }
        }
        l = null;
        if (l == null) {
        }
        it = arrayList.iterator();
        if (it.hasNext()) {
        }
        qualityOption = (tool.wu.heng.data.model.QualityOption) next;
        if (qualityOption == null) {
        }
        return kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.VideoInfo(title, cover, l2, arrayList, qualityOption.getUrl(), null, qualityOption.getExt(), SOURCE, false, false, false, qualityOption.getFilesize(), 1824, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r10 != null) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.util.List<tool.wu.heng.data.model.VideoInfo> parseImageNote(com.google.gson.JsonObject note, java.lang.String title, java.lang.String cover) {
        int i;
        java.lang.String str;
        java.lang.String str2;
        com.google.gson.JsonElement jsonElement;
        java.lang.String asString;
        java.lang.String unescapeUrl;
        int i2;
        com.google.gson.JsonElement jsonElement2;
        int i3;
        com.google.gson.JsonArray asJsonArray = note.getAsJsonArray("imageList");
        if (asJsonArray == null) {
            throw new tool.wu.heng.parser.ParseException("该笔记不含图片内容", null, 2, null);
        }
        if (asJsonArray.size() == 0) {
            throw new tool.wu.heng.parser.ParseException("该笔记不含图片内容", null, 2, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = asJsonArray.size();
        while (i < size) {
            com.google.gson.JsonObject asJsonObject = asJsonArray.get(i).getAsJsonObject();
            com.google.gson.JsonElement jsonElement3 = asJsonObject.get("url");
            if (jsonElement3 != null) {
                if (!(!jsonElement3.isJsonNull())) {
                    jsonElement3 = null;
                }
                if (jsonElement3 != null) {
                    java.lang.String asString2 = jsonElement3.getAsString();
                    if (asString2 != null) {
                        str = unescapeUrl(asString2);
                    }
                }
            }
            com.google.gson.JsonArray asJsonArray2 = asJsonObject.getAsJsonArray("infoList");
            if (asJsonArray2 != null) {
                int size2 = asJsonArray2.size();
                java.lang.String str3 = null;
                for (int i4 = 0; i4 < size2; i4++) {
                    com.google.gson.JsonObject asJsonObject2 = asJsonArray2.get(i4).getAsJsonObject();
                    com.google.gson.JsonElement jsonElement4 = asJsonObject2.get("imageScene");
                    if (jsonElement4 != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement4);
                        if (!(!jsonElement4.isJsonNull())) {
                            jsonElement4 = null;
                        }
                        if (jsonElement4 != null) {
                            str2 = jsonElement4.getAsString();
                            if ((!kotlin.jvm.internal.Intrinsics.areEqual(str2, "H5_DTL") || kotlin.jvm.internal.Intrinsics.areEqual(str2, "WB_DTL") || str3 == null) && (jsonElement = asJsonObject2.get("url")) != null) {
                                kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement);
                                if (!(!jsonElement.isJsonNull())) {
                                    jsonElement = null;
                                }
                                if (jsonElement != null && (asString = jsonElement.getAsString()) != null) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNull(asString);
                                    unescapeUrl = unescapeUrl(asString);
                                    if (unescapeUrl != null && (str3 == null || kotlin.jvm.internal.Intrinsics.areEqual(str2, "H5_DTL") || kotlin.jvm.internal.Intrinsics.areEqual(str2, "WB_DTL"))) {
                                        str3 = unescapeUrl;
                                    }
                                }
                            }
                        }
                    }
                    str2 = null;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(str2, "H5_DTL")) {
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNull(jsonElement);
                    if (!(!jsonElement.isJsonNull())) {
                    }
                    if (jsonElement != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asString);
                        unescapeUrl = unescapeUrl(asString);
                        if (unescapeUrl != null) {
                            str3 = unescapeUrl;
                        }
                    }
                }
                str = str3;
            } else {
                str = null;
            }
            i = str == null ? i + 1 : 0;
            if (kotlin.text.StringsKt.startsWith$default(str, "http", false, 2, (java.lang.Object) null)) {
                com.google.gson.JsonElement jsonElement5 = asJsonObject.get("width");
                if (jsonElement5 != null) {
                    if (!(!jsonElement5.isJsonNull())) {
                        jsonElement5 = null;
                    }
                    if (jsonElement5 != null) {
                        i2 = jsonElement5.getAsInt();
                        jsonElement2 = asJsonObject.get("height");
                        if (jsonElement2 != null) {
                            if (!(!jsonElement2.isJsonNull())) {
                                jsonElement2 = null;
                            }
                            if (jsonElement2 != null) {
                                i3 = jsonElement2.getAsInt();
                                arrayList.add(new tool.wu.heng.data.model.VideoInfo(asJsonArray.size() > 1 ? title + "_第" + (i + 1) + "张" : title, cover == null ? str : cover, null, kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("xhs-img-" + i, (i2 > 0 || i3 <= 0) ? null : i2 + "x" + i3, "jpg", 0L, str)), str, null, "jpg", SOURCE, false, false, false, 0L, 1824, null));
                            }
                        }
                        i3 = 0;
                        if (i2 > 0) {
                        }
                        arrayList.add(new tool.wu.heng.data.model.VideoInfo(asJsonArray.size() > 1 ? title + "_第" + (i + 1) + "张" : title, cover == null ? str : cover, null, kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("xhs-img-" + i, (i2 > 0 || i3 <= 0) ? null : i2 + "x" + i3, "jpg", 0L, str)), str, null, "jpg", SOURCE, false, false, false, 0L, 1824, null));
                    }
                }
                i2 = 0;
                jsonElement2 = asJsonObject.get("height");
                if (jsonElement2 != null) {
                }
                i3 = 0;
                if (i2 > 0) {
                }
                arrayList.add(new tool.wu.heng.data.model.VideoInfo(asJsonArray.size() > 1 ? title + "_第" + (i + 1) + "张" : title, cover == null ? str : cover, null, kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("xhs-img-" + i, (i2 > 0 || i3 <= 0) ? null : i2 + "x" + i3, "jpg", 0L, str)), str, null, "jpg", SOURCE, false, false, false, 0L, 1824, null));
            }
        }
        if (arrayList.isEmpty()) {
            throw new tool.wu.heng.parser.ParseException("未获取到图片地址，该笔记可能需要登录后查看", null, 2, null);
        }
        return arrayList;
    }

    private final java.lang.String extractNoteId(java.lang.String url) {
        java.util.List<java.lang.String> groupValues;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(new kotlin.text.Regex("(?:explore|discovery/item|item)/([0-9a-f]{16,32})"), url, 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null) {
            return null;
        }
        return groupValues.get(1);
    }

    private final java.lang.String unescapeJson(java.lang.String str) {
        return new kotlin.text.Regex("\\bundefined\\b").replace(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "\\u002F", "/", false, 4, (java.lang.Object) null), "\\u002f", "/", false, 4, (java.lang.Object) null), "\\u0026", "&", false, 4, (java.lang.Object) null), "\\/", "/", false, 4, (java.lang.Object) null), "null");
    }

    private final java.lang.String unescapeUrl(java.lang.String str) {
        return kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str, "\\u002F", "/", false, 4, (java.lang.Object) null), "\\u002f", "/", false, 4, (java.lang.Object) null), "\\u0026", "&", false, 4, (java.lang.Object) null), "\\/", "/", false, 4, (java.lang.Object) null);
    }
}
