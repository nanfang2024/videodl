package tool.wu.heng.parser;

/* compiled from: DouyinParser.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\u0006\u0010\u0012\u001a\u00020\u0006H\u0096@¢\u0006\u0002\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Ltool/wu/heng/parser/DouyinParser;", "Ltool/wu/heng/parser/LocalVideoParser;", "()V", "awemeIdRegex", "Lkotlin/text/Regex;", "platform", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getPlatform", "()Ljava/lang/String;", "routerDataRegex", "buildVideoInfo", "Ltool/wu/heng/data/model/VideoInfo;", "item", "Lcom/google/gson/JsonObject;", "extractItem", "html", "matches", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "url", "parse", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolveAwemeId", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DouyinParser implements tool.wu.heng.parser.LocalVideoParser {
    private static final int MAX_ATTEMPT = 3;
    public static final java.lang.String SOURCE = "douyin";
    public static final int $stable = 8;
    private final java.lang.String platform = "抖音";
    private final kotlin.text.Regex routerDataRegex = new kotlin.text.Regex("window\\._ROUTER_DATA\\s*=\\s*(\\{.*?\\})\\s*</script>", kotlin.text.RegexOption.DOT_MATCHES_ALL);
    private final kotlin.text.Regex awemeIdRegex = new kotlin.text.Regex("(\\d{15,})");

    @Override // tool.wu.heng.parser.LocalVideoParser
    public java.lang.String getPlatform() {
        return this.platform;
    }

    @Override // tool.wu.heng.parser.LocalVideoParser
    public boolean matches(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String host = tool.wu.heng.parser.UrlExtractor.INSTANCE.host(url);
        return kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "douyin.com", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) host, (java.lang.CharSequence) "iesdouyin.com", false, 2, (java.lang.Object) null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:19|20|21|22|23|24|(1:26)|(1:28)(1:41)|(3:32|(1:34)|(2:36|(1:38)(4:39|10|11|(4:13|(1:15)|16|17)(0)))(3:40|11|(0)(0)))(2:30|31)) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0097, code lost:
    
        timber.log.Timber.INSTANCE.w(r0, "抖音第 %d 次请求失败", kotlin.coroutines.jvm.internal.Boxing.boxInt(r4 + 1));
        r9.element = "网络请求失败，请检查网络后重试";
        r0 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:10:0x00f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fc -> B:11:0x0100). Please report as a decompilation issue!!! */
    @Override // tool.wu.heng.parser.LocalVideoParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object parse(java.lang.String str, kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.model.VideoInfo>> continuation) {
        tool.wu.heng.parser.DouyinParser$parse$1 douyinParser$parse$1;
        tool.wu.heng.parser.DouyinParser douyinParser;
        int i;
        int i2;
        java.lang.String str2;
        tool.wu.heng.parser.DouyinParser douyinParser2;
        kotlin.jvm.internal.Ref.ObjectRef objectRef;
        int i3;
        tool.wu.heng.parser.DouyinParser douyinParser3;
        java.lang.String str3;
        if (continuation instanceof tool.wu.heng.parser.DouyinParser$parse$1) {
            douyinParser$parse$1 = (tool.wu.heng.parser.DouyinParser$parse$1) continuation;
            if ((douyinParser$parse$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                douyinParser$parse$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                douyinParser = this;
                java.lang.Object obj = douyinParser$parse$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = douyinParser$parse$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.String resolveAwemeId = resolveAwemeId(str);
                    if (resolveAwemeId == null) {
                        throw new tool.wu.heng.parser.ParseException("链接无效或已失效，请重新复制分享链接", null, 2, null);
                    }
                    i2 = 3;
                    str2 = "https://www.iesdouyin.com/share/video/" + resolveAwemeId + "/";
                    douyinParser2 = douyinParser;
                    objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                    i3 = 0;
                    if (i3 >= i2) {
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = douyinParser$parse$1.I$1;
                    i2 = douyinParser$parse$1.I$0;
                    objectRef = (kotlin.jvm.internal.Ref.ObjectRef) douyinParser$parse$1.L$2;
                    java.lang.String str4 = (java.lang.String) douyinParser$parse$1.L$1;
                    tool.wu.heng.parser.DouyinParser douyinParser4 = (tool.wu.heng.parser.DouyinParser) douyinParser$parse$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str2 = str4;
                    douyinParser2 = douyinParser4;
                    i3++;
                    if (i3 >= i2) {
                        try {
                        } catch (java.lang.Exception e) {
                            e = e;
                            douyinParser3 = douyinParser2;
                            str3 = str2;
                        }
                        douyinParser3 = douyinParser2;
                        str3 = str2;
                        java.lang.String str5 = tool.wu.heng.parser.ParserHttp.getString$default(tool.wu.heng.parser.ParserHttp.INSTANCE, str2, tool.wu.heng.parser.ParserHttp.UA_IPHONE, "https://www.douyin.com/", null, 8, null);
                        java.lang.String str6 = str5;
                        if (!(!kotlin.text.StringsKt.isBlank(str6))) {
                            str5 = null;
                        }
                        com.google.gson.JsonObject extractItem = str5 == null ? douyinParser3.extractItem(str5) : null;
                        if (extractItem != null) {
                            return kotlin.collections.CollectionsKt.listOf(douyinParser3.buildVideoInfo(extractItem));
                        }
                        if (!kotlin.text.StringsKt.isBlank(str6)) {
                            objectRef.element = "抖音返回了风控页面，请稍后重试";
                        }
                        if (i3 < 2) {
                            douyinParser$parse$1.L$0 = douyinParser3;
                            java.lang.String str7 = str3;
                            douyinParser$parse$1.L$1 = str7;
                            douyinParser$parse$1.L$2 = objectRef;
                            douyinParser$parse$1.I$0 = i2;
                            douyinParser$parse$1.I$1 = i3;
                            douyinParser$parse$1.label = 1;
                            if (kotlinx.coroutines.DelayKt.delay((i3 + 1) * 600, douyinParser$parse$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            douyinParser4 = douyinParser3;
                            str4 = str7;
                            str2 = str4;
                            douyinParser2 = douyinParser4;
                            i3++;
                            if (i3 >= i2) {
                                java.lang.String str8 = (java.lang.String) objectRef.element;
                                if (str8 == null) {
                                    str8 = "未解析到视频，请确认链接是视频而非图文";
                                }
                                throw new tool.wu.heng.parser.ParseException(str8, null, 2, null);
                            }
                        } else {
                            douyinParser2 = douyinParser3;
                            str2 = str3;
                            i3++;
                            if (i3 >= i2) {
                            }
                        }
                    }
                }
            }
        }
        douyinParser = this;
        douyinParser$parse$1 = new tool.wu.heng.parser.DouyinParser$parse$1(douyinParser, continuation);
        java.lang.Object obj2 = douyinParser$parse$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = douyinParser$parse$1.label;
        if (i != 0) {
        }
    }

    private final java.lang.String resolveAwemeId(java.lang.String url) {
        java.util.List<java.lang.String> groupValues;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(this.awemeIdRegex, url, 0, 2, null);
        if (find$default != null) {
            return find$default.getGroupValues().get(1);
        }
        kotlin.text.MatchResult find$default2 = kotlin.text.Regex.find$default(this.awemeIdRegex, tool.wu.heng.parser.ParserHttp.resolveRedirect$default(tool.wu.heng.parser.ParserHttp.INSTANCE, url, null, 2, null), 0, 2, null);
        if (find$default2 == null || (groupValues = find$default2.getGroupValues()) == null) {
            return null;
        }
        return groupValues.get(1);
    }

    private final com.google.gson.JsonObject extractItem(java.lang.String html) {
        java.util.List<java.lang.String> groupValues;
        java.lang.String str;
        com.google.gson.JsonObject asJsonObject;
        com.google.gson.JsonArray asJsonArray;
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(this.routerDataRegex, html, 0, 2, null);
        if (find$default != null && (groupValues = find$default.getGroupValues()) != null && (str = groupValues.get(1)) != null) {
            try {
                com.google.gson.JsonObject asJsonObject2 = com.google.gson.JsonParser.parseString(str).getAsJsonObject().getAsJsonObject("loaderData");
                if (asJsonObject2 == null) {
                    return null;
                }
                for (java.util.Map.Entry entry : asJsonObject2.entrySet()) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(entry);
                    com.google.gson.JsonObject jsonObject = (com.google.gson.JsonElement) entry.getValue();
                    com.google.gson.JsonObject jsonObject2 = jsonObject instanceof com.google.gson.JsonObject ? jsonObject : null;
                    if (jsonObject2 != null && (asJsonObject = jsonObject2.getAsJsonObject("videoInfoRes")) != null && (asJsonArray = asJsonObject.getAsJsonArray("item_list")) != null && asJsonArray.size() > 0) {
                        return asJsonArray.get(0).getAsJsonObject();
                    }
                }
                return null;
            } catch (java.lang.Exception e) {
                timber.log.Timber.INSTANCE.w(e, "抖音 _ROUTER_DATA 解析失败", new java.lang.Object[0]);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final tool.wu.heng.data.model.VideoInfo buildVideoInfo(com.google.gson.JsonObject item) {
        java.lang.String str;
        com.google.gson.JsonObject asJsonObject;
        com.google.gson.JsonObject asJsonObject2;
        java.lang.Iterable asJsonArray;
        java.util.Iterator it;
        java.lang.Object obj;
        com.google.gson.JsonElement jsonElement;
        java.lang.String asString;
        java.lang.String replace$default;
        com.google.gson.JsonObject asJsonObject3;
        java.lang.String str2;
        com.google.gson.JsonElement jsonElement2;
        long j;
        com.google.gson.JsonElement jsonElement3;
        int i;
        int i2;
        com.google.gson.JsonElement jsonElement4;
        com.google.gson.JsonObject asJsonObject4;
        long j2;
        java.lang.String str3;
        com.google.gson.JsonElement jsonElement5;
        java.lang.Iterable asJsonArray2;
        java.util.Iterator it2;
        java.lang.Object obj2;
        com.google.gson.JsonElement jsonElement6;
        java.lang.String asString2;
        com.google.gson.JsonElement jsonElement7 = item.get("desc");
        if (jsonElement7 != null) {
            if (!(!jsonElement7.isJsonNull())) {
                jsonElement7 = null;
            }
            if (jsonElement7 != null && (asString2 = jsonElement7.getAsString()) != null) {
                str = kotlin.text.StringsKt.trim((java.lang.CharSequence) asString2).toString();
                if (str == null) {
                    str = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                }
                asJsonObject = item.getAsJsonObject("video");
                if (asJsonObject != null && (asJsonObject2 = asJsonObject.getAsJsonObject("play_addr")) != null && (asJsonArray = asJsonObject2.getAsJsonArray("url_list")) != null) {
                    it = asJsonArray.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (!((com.google.gson.JsonElement) obj).isJsonNull()) {
                            break;
                        }
                    }
                    jsonElement = (com.google.gson.JsonElement) obj;
                    if (jsonElement != null && (asString = jsonElement.getAsString()) != null && (replace$default = kotlin.text.StringsKt.replace$default(asString, "/aweme/v1/playwm/", "/aweme/v1/play/", false, 4, (java.lang.Object) null)) != null) {
                        asJsonObject3 = asJsonObject.getAsJsonObject("cover");
                        if (asJsonObject3 != null && (asJsonArray2 = asJsonObject3.getAsJsonArray("url_list")) != null) {
                            it2 = asJsonArray2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (!((com.google.gson.JsonElement) obj2).isJsonNull()) {
                                    break;
                                }
                            }
                            jsonElement6 = (com.google.gson.JsonElement) obj2;
                            if (jsonElement6 != null) {
                                str2 = jsonElement6.getAsString();
                                jsonElement2 = asJsonObject.get("duration");
                                if (jsonElement2 != null) {
                                    if (!(!jsonElement2.isJsonNull())) {
                                        jsonElement2 = null;
                                    }
                                    if (jsonElement2 != null) {
                                        j = jsonElement2.getAsLong();
                                        jsonElement3 = asJsonObject.get("width");
                                        i = 0;
                                        if (jsonElement3 != null) {
                                            if (!(!jsonElement3.isJsonNull())) {
                                                jsonElement3 = null;
                                            }
                                            if (jsonElement3 != null) {
                                                i2 = jsonElement3.getAsInt();
                                                jsonElement4 = asJsonObject.get("height");
                                                if (jsonElement4 != null) {
                                                    if (!(!jsonElement4.isJsonNull())) {
                                                        jsonElement4 = null;
                                                    }
                                                    if (jsonElement4 != null) {
                                                        i = jsonElement4.getAsInt();
                                                    }
                                                }
                                                asJsonObject4 = asJsonObject.getAsJsonObject("play_addr");
                                                if (asJsonObject4 != null && (jsonElement5 = asJsonObject4.get("data_size")) != null) {
                                                    if (!(!jsonElement5.isJsonNull())) {
                                                        jsonElement5 = null;
                                                    }
                                                    if (jsonElement5 != null) {
                                                        j2 = jsonElement5.getAsLong();
                                                        java.lang.String str4 = (i2 > 0 || i <= 0) ? null : i2 + "x" + i;
                                                        str3 = str;
                                                        if (kotlin.text.StringsKt.isBlank(str3)) {
                                                            str3 = "抖音视频";
                                                        }
                                                        return new tool.wu.heng.data.model.VideoInfo(str3, str2, j <= 0 ? java.lang.Long.valueOf(j / 1000) : null, str4 != null ? kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("douyin-nowatermark", str4, "mp4", j2, replace$default)) : null, replace$default, null, "mp4", SOURCE, false, false, false, j2, 1824, null);
                                                    }
                                                }
                                                j2 = 0;
                                                if (i2 > 0) {
                                                }
                                                str3 = str;
                                                if (kotlin.text.StringsKt.isBlank(str3)) {
                                                }
                                                return new tool.wu.heng.data.model.VideoInfo(str3, str2, j <= 0 ? java.lang.Long.valueOf(j / 1000) : null, str4 != null ? kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("douyin-nowatermark", str4, "mp4", j2, replace$default)) : null, replace$default, null, "mp4", SOURCE, false, false, false, j2, 1824, null);
                                            }
                                        }
                                        i2 = 0;
                                        jsonElement4 = asJsonObject.get("height");
                                        if (jsonElement4 != null) {
                                        }
                                        asJsonObject4 = asJsonObject.getAsJsonObject("play_addr");
                                        if (asJsonObject4 != null) {
                                            if (!(!jsonElement5.isJsonNull())) {
                                            }
                                            if (jsonElement5 != null) {
                                            }
                                        }
                                        j2 = 0;
                                        if (i2 > 0) {
                                        }
                                        str3 = str;
                                        if (kotlin.text.StringsKt.isBlank(str3)) {
                                        }
                                        return new tool.wu.heng.data.model.VideoInfo(str3, str2, j <= 0 ? java.lang.Long.valueOf(j / 1000) : null, str4 != null ? kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("douyin-nowatermark", str4, "mp4", j2, replace$default)) : null, replace$default, null, "mp4", SOURCE, false, false, false, j2, 1824, null);
                                    }
                                }
                                j = 0;
                                jsonElement3 = asJsonObject.get("width");
                                i = 0;
                                if (jsonElement3 != null) {
                                }
                                i2 = 0;
                                jsonElement4 = asJsonObject.get("height");
                                if (jsonElement4 != null) {
                                }
                                asJsonObject4 = asJsonObject.getAsJsonObject("play_addr");
                                if (asJsonObject4 != null) {
                                }
                                j2 = 0;
                                if (i2 > 0) {
                                }
                                str3 = str;
                                if (kotlin.text.StringsKt.isBlank(str3)) {
                                }
                                return new tool.wu.heng.data.model.VideoInfo(str3, str2, j <= 0 ? java.lang.Long.valueOf(j / 1000) : null, str4 != null ? kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("douyin-nowatermark", str4, "mp4", j2, replace$default)) : null, replace$default, null, "mp4", SOURCE, false, false, false, j2, 1824, null);
                            }
                        }
                        str2 = null;
                        jsonElement2 = asJsonObject.get("duration");
                        if (jsonElement2 != null) {
                        }
                        j = 0;
                        jsonElement3 = asJsonObject.get("width");
                        i = 0;
                        if (jsonElement3 != null) {
                        }
                        i2 = 0;
                        jsonElement4 = asJsonObject.get("height");
                        if (jsonElement4 != null) {
                        }
                        asJsonObject4 = asJsonObject.getAsJsonObject("play_addr");
                        if (asJsonObject4 != null) {
                        }
                        j2 = 0;
                        if (i2 > 0) {
                        }
                        str3 = str;
                        if (kotlin.text.StringsKt.isBlank(str3)) {
                        }
                        return new tool.wu.heng.data.model.VideoInfo(str3, str2, j <= 0 ? java.lang.Long.valueOf(j / 1000) : null, str4 != null ? kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("douyin-nowatermark", str4, "mp4", j2, replace$default)) : null, replace$default, null, "mp4", SOURCE, false, false, false, j2, 1824, null);
                    }
                }
                throw new tool.wu.heng.parser.ParseException("未获取到视频地址，可能是图文或已被删除", null, 2, null);
            }
        }
        str = null;
        if (str == null) {
        }
        asJsonObject = item.getAsJsonObject("video");
        if (asJsonObject != null) {
            it = asJsonArray.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            jsonElement = (com.google.gson.JsonElement) obj;
            if (jsonElement != null) {
                asJsonObject3 = asJsonObject.getAsJsonObject("cover");
                if (asJsonObject3 != null) {
                    it2 = asJsonArray2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                        }
                    }
                    jsonElement6 = (com.google.gson.JsonElement) obj2;
                    if (jsonElement6 != null) {
                    }
                }
                str2 = null;
                jsonElement2 = asJsonObject.get("duration");
                if (jsonElement2 != null) {
                }
                j = 0;
                jsonElement3 = asJsonObject.get("width");
                i = 0;
                if (jsonElement3 != null) {
                }
                i2 = 0;
                jsonElement4 = asJsonObject.get("height");
                if (jsonElement4 != null) {
                }
                asJsonObject4 = asJsonObject.getAsJsonObject("play_addr");
                if (asJsonObject4 != null) {
                }
                j2 = 0;
                if (i2 > 0) {
                }
                str3 = str;
                if (kotlin.text.StringsKt.isBlank(str3)) {
                }
                return new tool.wu.heng.data.model.VideoInfo(str3, str2, j <= 0 ? java.lang.Long.valueOf(j / 1000) : null, str4 != null ? kotlin.collections.CollectionsKt.listOf(new tool.wu.heng.data.model.QualityOption("douyin-nowatermark", str4, "mp4", j2, replace$default)) : null, replace$default, null, "mp4", SOURCE, false, false, false, j2, 1824, null);
            }
        }
        throw new tool.wu.heng.parser.ParseException("未获取到视频地址，可能是图文或已被删除", null, 2, null);
    }
}
