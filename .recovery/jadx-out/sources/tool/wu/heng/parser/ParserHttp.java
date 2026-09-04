package tool.wu.heng.parser;

/* compiled from: ParserHttp.kt */
@kotlin.Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017JD\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 J:\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001eJ\u0018\u0010\"\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004J\u0010\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0014\u0010\t¨\u0006%"}, d2 = {"Ltool/wu/heng/parser/ParserHttp;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "UA_DESKTOP", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "UA_IPHONE", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "client$delegate", "Lkotlin/Lazy;", "cookieStore", "Ljava/util/concurrent/ConcurrentHashMap;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lokhttp3/Cookie;", "memoryCookieJar", "tool/wu/heng/parser/ParserHttp$memoryCookieJar$1", "Ltool/wu/heng/parser/ParserHttp$memoryCookieJar$1;", "noRedirectClient", "getNoRedirectClient", "noRedirectClient$delegate", "clearCookies", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "get", "Lokhttp3/Response;", "url", "userAgent", "referer", "extraHeaders", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "followRedirects", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getString", "resolveRedirect", "rootDomain", "host", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ParserHttp {
    public static final java.lang.String UA_DESKTOP = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36";
    public static final java.lang.String UA_IPHONE = "Mozilla/5.0 (iPhone; CPU iPhone OS 16_6 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/16.6 Mobile/15E148 Safari/604.1";
    public static final tool.wu.heng.parser.ParserHttp INSTANCE = new tool.wu.heng.parser.ParserHttp();
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<okhttp3.Cookie>> cookieStore = new java.util.concurrent.ConcurrentHashMap<>();
    private static final tool.wu.heng.parser.ParserHttp$memoryCookieJar$1 memoryCookieJar = new okhttp3.CookieJar() { // from class: tool.wu.heng.parser.ParserHttp$memoryCookieJar$1
        @Override // okhttp3.CookieJar
        public void saveFromResponse(okhttp3.HttpUrl url, java.util.List<okhttp3.Cookie> cookies) {
            java.lang.String rootDomain;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap;
            java.lang.Object putIfAbsent;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cookies, "cookies");
            rootDomain = tool.wu.heng.parser.ParserHttp.INSTANCE.rootDomain(url.host());
            concurrentHashMap = tool.wu.heng.parser.ParserHttp.cookieStore;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            java.util.ArrayList arrayList = concurrentHashMap2.get(rootDomain);
            if (arrayList == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(rootDomain, (arrayList = new java.util.ArrayList()))) != null) {
                arrayList = putIfAbsent;
            }
            java.util.List list = (java.util.List) arrayList;
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            synchronized (list) {
                for (final okhttp3.Cookie cookie : cookies) {
                    kotlin.collections.CollectionsKt.removeAll(list, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<okhttp3.Cookie, java.lang.Boolean>() { // from class: tool.wu.heng.parser.ParserHttp$memoryCookieJar$1$saveFromResponse$1$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Boolean invoke(okhttp3.Cookie it) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                            return java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(it.name(), okhttp3.Cookie.this.name()) && kotlin.jvm.internal.Intrinsics.areEqual(it.path(), okhttp3.Cookie.this.path()));
                        }
                    });
                    list.add(cookie);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
        }

        @Override // okhttp3.CookieJar
        public java.util.List<okhttp3.Cookie> loadForRequest(okhttp3.HttpUrl url) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap;
            java.lang.String rootDomain;
            java.util.List<okhttp3.Cookie> list;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
            concurrentHashMap = tool.wu.heng.parser.ParserHttp.cookieStore;
            rootDomain = tool.wu.heng.parser.ParserHttp.INSTANCE.rootDomain(url.host());
            java.util.List list2 = (java.util.List) concurrentHashMap.get(rootDomain);
            if (list2 == null) {
                return kotlin.collections.CollectionsKt.emptyList();
            }
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized (list2) {
                kotlin.collections.CollectionsKt.removeAll(list2, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<okhttp3.Cookie, java.lang.Boolean>() { // from class: tool.wu.heng.parser.ParserHttp$memoryCookieJar$1$loadForRequest$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Boolean invoke(okhttp3.Cookie it) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                        return java.lang.Boolean.valueOf(it.expiresAt() < currentTimeMillis);
                    }
                });
                list = kotlin.collections.CollectionsKt.toList(list2);
            }
            return list;
        }
    };

    /* renamed from: client$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy client = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: tool.wu.heng.parser.ParserHttp$client$2
        @Override // kotlin.jvm.functions.Function0
        public final okhttp3.OkHttpClient invoke() {
            tool.wu.heng.parser.ParserHttp$memoryCookieJar$1 parserHttp$memoryCookieJar$1;
            okhttp3.OkHttpClient.Builder builder = new okhttp3.OkHttpClient.Builder();
            parserHttp$memoryCookieJar$1 = tool.wu.heng.parser.ParserHttp.memoryCookieJar;
            return builder.cookieJar(parserHttp$memoryCookieJar$1).connectTimeout(15L, java.util.concurrent.TimeUnit.SECONDS).readTimeout(20L, java.util.concurrent.TimeUnit.SECONDS).followRedirects(true).followSslRedirects(true).build();
        }
    });

    /* renamed from: noRedirectClient$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy noRedirectClient = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<okhttp3.OkHttpClient>() { // from class: tool.wu.heng.parser.ParserHttp$noRedirectClient$2
        @Override // kotlin.jvm.functions.Function0
        public final okhttp3.OkHttpClient invoke() {
            return tool.wu.heng.parser.ParserHttp.INSTANCE.getClient().newBuilder().followRedirects(false).followSslRedirects(false).build();
        }
    });
    public static final int $stable = 8;

    private ParserHttp() {
    }

    public final okhttp3.OkHttpClient getClient() {
        return (okhttp3.OkHttpClient) client.getValue();
    }

    private final okhttp3.OkHttpClient getNoRedirectClient() {
        return (okhttp3.OkHttpClient) noRedirectClient.getValue();
    }

    public final java.lang.String rootDomain(java.lang.String host) {
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) host, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
        if (split$default.size() <= 2) {
            return host;
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.takeLast(split$default, 2), ".", null, null, 0, null, null, 62, null);
        return (!kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"com.cn", "net.cn", "org.cn", "gov.cn"}).contains(joinToString$default) || split$default.size() < 3) ? joinToString$default : kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.takeLast(split$default, 3), ".", null, null, 0, null, null, 62, null);
    }

    public final void clearCookies() {
        cookieStore.clear();
    }

    public static /* synthetic */ okhttp3.Response get$default(tool.wu.heng.parser.ParserHttp parserHttp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = UA_IPHONE;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            str3 = null;
        }
        java.lang.String str5 = str3;
        if ((i & 8) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        java.util.Map map2 = map;
        if ((i & 16) != 0) {
            z = true;
        }
        return parserHttp.get(str, str4, str5, map2, z);
    }

    public final okhttp3.Response get(java.lang.String url, java.lang.String userAgent, java.lang.String referer, java.util.Map<java.lang.String, java.lang.String> extraHeaders, boolean followRedirects) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraHeaders, "extraHeaders");
        okhttp3.Request.Builder header = new okhttp3.Request.Builder().url(url).header("User-Agent", userAgent).header("Accept", "text/html,application/json,application/xhtml+xml,*/*;q=0.8").header("Accept-Language", "zh-CN,zh;q=0.9,en;q=0.8");
        if (referer != null) {
            header.header("Referer", referer);
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraHeaders.entrySet()) {
            header.header(entry.getKey(), entry.getValue());
        }
        return (followRedirects ? getClient() : getNoRedirectClient()).newCall(header.build()).execute();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.lang.String getString$default(tool.wu.heng.parser.ParserHttp parserHttp, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = UA_IPHONE;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        return parserHttp.getString(str, str2, str3, map);
    }

    public final java.lang.String getString(java.lang.String url, java.lang.String userAgent, java.lang.String referer, java.util.Map<java.lang.String, java.lang.String> extraHeaders) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraHeaders, "extraHeaders");
        okhttp3.Response response = get$default(this, url, userAgent, referer, extraHeaders, false, 16, null);
        try {
            okhttp3.ResponseBody body = response.body();
            java.lang.String string = body != null ? body.string() : null;
            if (string == null) {
                string = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
            }
            kotlin.io.CloseableKt.closeFinally(response, null);
            return string;
        } finally {
        }
    }

    public static /* synthetic */ java.lang.String resolveRedirect$default(tool.wu.heng.parser.ParserHttp parserHttp, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = UA_IPHONE;
        }
        return parserHttp.resolveRedirect(str, str2);
    }

    public final java.lang.String resolveRedirect(java.lang.String url, java.lang.String userAgent) {
        java.lang.String url2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAgent, "userAgent");
        int i = 0;
        while (i < 5) {
            try {
                okhttp3.Response response = get$default(INSTANCE, url, userAgent, null, null, false, 12, null);
                try {
                    okhttp3.Response response2 = response;
                    if (!response2.isRedirect()) {
                        kotlin.io.CloseableKt.closeFinally(response, null);
                        return url;
                    }
                    java.lang.String header$default = okhttp3.Response.header$default(response2, "Location", null, 2, null);
                    if (header$default == null) {
                        kotlin.io.CloseableKt.closeFinally(response, null);
                        return url;
                    }
                    okhttp3.HttpUrl resolve = response2.request().url().resolve(header$default);
                    if (resolve != null && (url2 = resolve.getUrl()) != null) {
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(response, null);
                        i++;
                        url = url2;
                    }
                    kotlin.io.CloseableKt.closeFinally(response, null);
                    return url;
                } finally {
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return url;
    }
}
