package okhttp3.internal.http;

/* compiled from: CallServerInterceptor.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "forWebSocket", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "shouldIgnoreAndWaitForRealResponse", "code", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class CallServerInterceptor implements okhttp3.Interceptor {
    private final boolean forWebSocket;

    private final boolean shouldIgnoreAndWaitForRealResponse(int code) {
        if (code == 100) {
            return true;
        }
        return 102 <= code && code < 200;
    }

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e2 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:63:0x00ab, B:65:0x00b4, B:22:0x00b8, B:24:0x00e2, B:26:0x00eb, B:27:0x00ee, B:28:0x0112, B:32:0x011d, B:33:0x013c, B:35:0x014a, B:43:0x0160, B:45:0x0166, B:48:0x0173, B:50:0x018a, B:51:0x0192, B:52:0x019d, B:60:0x0155, B:61:0x012c), top: B:62:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0166 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:63:0x00ab, B:65:0x00b4, B:22:0x00b8, B:24:0x00e2, B:26:0x00eb, B:27:0x00ee, B:28:0x0112, B:32:0x011d, B:33:0x013c, B:35:0x014a, B:43:0x0160, B:45:0x0166, B:48:0x0173, B:50:0x018a, B:51:0x0192, B:52:0x019d, B:60:0x0155, B:61:0x012c), top: B:62:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0173 A[Catch: IOException -> 0x019f, TryCatch #1 {IOException -> 0x019f, blocks: (B:63:0x00ab, B:65:0x00b4, B:22:0x00b8, B:24:0x00e2, B:26:0x00eb, B:27:0x00ee, B:28:0x0112, B:32:0x011d, B:33:0x013c, B:35:0x014a, B:43:0x0160, B:45:0x0166, B:48:0x0173, B:50:0x018a, B:51:0x0192, B:52:0x019d, B:60:0x0155, B:61:0x012c), top: B:62:0x00ab }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21, types: [okhttp3.Response$Builder] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        boolean z;
        ?? r10;
        okhttp3.Response.Builder builder;
        okhttp3.Response build;
        int code;
        okhttp3.Response build2;
        okhttp3.ResponseBody body;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.internal.connection.Exchange exchange = realInterceptorChain.getExchange();
        kotlin.jvm.internal.Intrinsics.checkNotNull(exchange);
        okhttp3.Request request = realInterceptorChain.getRequest();
        okhttp3.RequestBody body2 = request.body();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            exchange.writeRequestHeaders(request);
            r10 = okhttp3.internal.http.HttpMethod.permitsRequestBody(request.method());
            try {
                if (r10 != 0 && body2 != null) {
                    if (kotlin.text.StringsKt.equals("100-continue", request.header("Expect"), true)) {
                        exchange.flushRequest();
                        r10 = exchange.readResponseHeaders(true);
                        try {
                            exchange.responseHeadersStart();
                            z = false;
                            obj = r10;
                        } catch (java.io.IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof okhttp3.internal.http2.ConnectionShutdownException) {
                                throw e;
                            }
                            builder = r10;
                            if (!exchange.getHasFailure()) {
                                throw e;
                            }
                            if (builder == null) {
                            }
                            build = builder.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
                            code = build.code();
                            if (shouldIgnoreAndWaitForRealResponse(code)) {
                            }
                            exchange.responseHeadersEnd(build);
                            if (!this.forWebSocket) {
                            }
                            build2 = build.newBuilder().body(exchange.openResponseBody(build)).build();
                            if (!kotlin.text.StringsKt.equals("close", build2.request().header("Connection"), true)) {
                            }
                            exchange.noNewExchangesOnConnection();
                            if (code != 204) {
                            }
                            body = build2.body();
                            if ((body == null ? body.getContentLength() : -1L) > 0) {
                            }
                            return build2;
                        }
                    } else {
                        z = true;
                        obj = null;
                    }
                    if (obj == null) {
                        if (body2.isDuplex()) {
                            exchange.flushRequest();
                            body2.writeTo(okio.Okio.buffer(exchange.createRequestBody(request, true)));
                            r10 = obj;
                        } else {
                            okio.BufferedSink buffer = okio.Okio.buffer(exchange.createRequestBody(request, false));
                            body2.writeTo(buffer);
                            buffer.close();
                            r10 = obj;
                        }
                    } else {
                        exchange.noRequestBody();
                        r10 = obj;
                        if (!exchange.getConnection().isMultiplexed$okhttp()) {
                            exchange.noNewExchangesOnConnection();
                            r10 = obj;
                        }
                    }
                } else {
                    exchange.noRequestBody();
                    z = true;
                    r10 = 0;
                }
                if (body2 == null || !body2.isDuplex()) {
                    exchange.finishRequest();
                }
                e = null;
                builder = r10;
            } catch (java.io.IOException e2) {
                e = e2;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            z = true;
            r10 = 0;
        }
        if (builder == null) {
            try {
                builder = exchange.readResponseHeaders(false);
                kotlin.jvm.internal.Intrinsics.checkNotNull(builder);
                if (z) {
                    exchange.responseHeadersStart();
                    z = false;
                }
            } catch (java.io.IOException e4) {
                if (e != null) {
                    kotlin.ExceptionsKt.addSuppressed(e, e4);
                    throw e;
                }
                throw e4;
            }
        }
        build = builder.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
        code = build.code();
        if (shouldIgnoreAndWaitForRealResponse(code)) {
            okhttp3.Response.Builder readResponseHeaders = exchange.readResponseHeaders(false);
            kotlin.jvm.internal.Intrinsics.checkNotNull(readResponseHeaders);
            if (z) {
                exchange.responseHeadersStart();
            }
            build = readResponseHeaders.request(request).handshake(exchange.getConnection().getHandshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(java.lang.System.currentTimeMillis()).build();
            code = build.code();
        }
        exchange.responseHeadersEnd(build);
        if (!this.forWebSocket && code == 101) {
            build2 = build.newBuilder().body(okhttp3.internal.Util.EMPTY_RESPONSE).build();
        } else {
            build2 = build.newBuilder().body(exchange.openResponseBody(build)).build();
        }
        if (!kotlin.text.StringsKt.equals("close", build2.request().header("Connection"), true) || kotlin.text.StringsKt.equals("close", okhttp3.Response.header$default(build2, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (code != 204 || code == 205) {
            body = build2.body();
            if ((body == null ? body.getContentLength() : -1L) > 0) {
                java.lang.StringBuilder append = new java.lang.StringBuilder("HTTP ").append(code).append(" had non-zero Content-Length: ");
                okhttp3.ResponseBody body3 = build2.body();
                throw new java.net.ProtocolException(append.append(body3 != null ? java.lang.Long.valueOf(body3.getContentLength()) : null).toString());
            }
        }
        return build2;
    }
}
