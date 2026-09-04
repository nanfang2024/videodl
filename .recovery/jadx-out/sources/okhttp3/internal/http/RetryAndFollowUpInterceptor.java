package okhttp3.internal.http;

/* compiled from: RetryAndFollowUpInterceptor.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J(\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/Interceptor;", "client", "Lokhttp3/OkHttpClient;", "(Lokhttp3/OkHttpClient;)V", "buildRedirectRequest", "Lokhttp3/Request;", "userResponse", "Lokhttp3/Response;", "method", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "followUpRequest", "exchange", "Lokhttp3/internal/connection/Exchange;", "intercept", "chain", "Lokhttp3/Interceptor$Chain;", "isRecoverable", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "e", "Ljava/io/IOException;", "requestSendStarted", "recover", "call", "Lokhttp3/internal/connection/RealCall;", "userRequest", "requestIsOneShot", "retryAfter", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "defaultDelay", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class RetryAndFollowUpInterceptor implements okhttp3.Interceptor {
    private static final int MAX_FOLLOW_UPS = 20;
    private final okhttp3.OkHttpClient client;

    public RetryAndFollowUpInterceptor(okhttp3.OkHttpClient client) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(client, "client");
        this.client = client;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r7 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        r0 = r0.newBuilder().priorResponse(r7.newBuilder().body(null).build()).build();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = r0;
        r0 = r1.getInterceptorScopedExchange();
        r6 = followUpRequest(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r6 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r0 = r6.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r0 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (r0.isOneShot() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        r0 = r7.body();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r0 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        okhttp3.internal.Util.closeQuietly(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r8 > okhttp3.internal.http.RetryAndFollowUpInterceptor.MAX_FOLLOW_UPS) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        if (r0 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0051, code lost:
    
        if (r0.getIsDuplex() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        r1.timeoutEarlyExit();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0056, code lost:
    
        r1.exitNetworkInterceptorExchange$okhttp(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        return r7;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws java.io.IOException {
        okhttp3.Request followUpRequest;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chain, "chain");
        okhttp3.internal.http.RealInterceptorChain realInterceptorChain = (okhttp3.internal.http.RealInterceptorChain) chain;
        okhttp3.Request request = realInterceptorChain.getRequest();
        okhttp3.internal.connection.RealCall call = realInterceptorChain.getCall();
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        int i = 0;
        okhttp3.Response response = null;
        while (true) {
            boolean z = true;
            while (true) {
                call.enterNetworkInterceptorExchange(request, z);
                try {
                    if (call.getCanceled()) {
                        throw new java.io.IOException("Canceled");
                    }
                    try {
                        okhttp3.Response proceed = realInterceptorChain.proceed(request);
                        break;
                    } catch (java.io.IOException e) {
                        if (!recover(e, call, request, !(e instanceof okhttp3.internal.http2.ConnectionShutdownException))) {
                            throw okhttp3.internal.Util.withSuppressed(e, emptyList);
                        }
                        emptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.io.IOException>) emptyList, e);
                    } catch (okhttp3.internal.connection.RouteException e2) {
                        if (!recover(e2.getLastConnectException(), call, request, false)) {
                            throw okhttp3.internal.Util.withSuppressed(e2.getFirstConnectException(), emptyList);
                        }
                        emptyList = kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends java.io.IOException>) emptyList, e2.getFirstConnectException());
                    }
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    z = false;
                } catch (java.lang.Throwable th) {
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    throw th;
                }
            }
            call.exitNetworkInterceptorExchange$okhttp(true);
            request = followUpRequest;
        }
    }

    private final boolean recover(java.io.IOException e, okhttp3.internal.connection.RealCall call, okhttp3.Request userRequest, boolean requestSendStarted) {
        if (this.client.retryOnConnectionFailure()) {
            return !(requestSendStarted && requestIsOneShot(e, userRequest)) && isRecoverable(e, requestSendStarted) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(java.io.IOException e, okhttp3.Request userRequest) {
        okhttp3.RequestBody body = userRequest.body();
        return (body != null && body.isOneShot()) || (e instanceof java.io.FileNotFoundException);
    }

    private final boolean isRecoverable(java.io.IOException e, boolean requestSendStarted) {
        if (e instanceof java.net.ProtocolException) {
            return false;
        }
        return e instanceof java.io.InterruptedIOException ? (e instanceof java.net.SocketTimeoutException) && !requestSendStarted : (((e instanceof javax.net.ssl.SSLHandshakeException) && (e.getCause() instanceof java.security.cert.CertificateException)) || (e instanceof javax.net.ssl.SSLPeerUnverifiedException)) ? false : true;
    }

    private final okhttp3.Request followUpRequest(okhttp3.Response userResponse, okhttp3.internal.connection.Exchange exchange) throws java.io.IOException {
        okhttp3.internal.connection.RealConnection connection;
        okhttp3.Route route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int code = userResponse.code();
        java.lang.String method = userResponse.request().method();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.authenticator().authenticate(route, userResponse);
            }
            if (code == 421) {
                okhttp3.RequestBody body = userResponse.request().body();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection().noCoalescedConnections$okhttp();
                return userResponse.request();
            }
            if (code == 503) {
                okhttp3.Response priorResponse = userResponse.priorResponse();
                if ((priorResponse == null || priorResponse.code() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.request();
                }
                return null;
            }
            if (code == 407) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(route);
                if (route.proxy().type() != java.net.Proxy.Type.HTTP) {
                    throw new java.net.ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
                return this.client.proxyAuthenticator().authenticate(route, userResponse);
            }
            if (code == 408) {
                if (!this.client.retryOnConnectionFailure()) {
                    return null;
                }
                okhttp3.RequestBody body2 = userResponse.request().body();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                okhttp3.Response priorResponse2 = userResponse.priorResponse();
                if ((priorResponse2 == null || priorResponse2.code() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.request();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, method);
    }

    private final okhttp3.Request buildRedirectRequest(okhttp3.Response userResponse, java.lang.String method) {
        java.lang.String header$default;
        okhttp3.HttpUrl resolve;
        if (!this.client.followRedirects() || (header$default = okhttp3.Response.header$default(userResponse, "Location", null, 2, null)) == null || (resolve = userResponse.request().url().resolve(header$default)) == null) {
            return null;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(resolve.scheme(), userResponse.request().url().scheme()) && !this.client.followSslRedirects()) {
            return null;
        }
        okhttp3.Request.Builder newBuilder = userResponse.request().newBuilder();
        if (okhttp3.internal.http.HttpMethod.permitsRequestBody(method)) {
            int code = userResponse.code();
            boolean z = okhttp3.internal.http.HttpMethod.INSTANCE.redirectsWithBody(method) || code == 308 || code == 307;
            if (okhttp3.internal.http.HttpMethod.INSTANCE.redirectsToGet(method) && code != 308 && code != 307) {
                newBuilder.method("GET", null);
            } else {
                newBuilder.method(method, z ? userResponse.request().body() : null);
            }
            if (!z) {
                newBuilder.removeHeader("Transfer-Encoding");
                newBuilder.removeHeader("Content-Length");
                newBuilder.removeHeader("Content-Type");
            }
        }
        if (!okhttp3.internal.Util.canReuseConnectionFor(userResponse.request().url(), resolve)) {
            newBuilder.removeHeader("Authorization");
        }
        return newBuilder.url(resolve).build();
    }

    private final int retryAfter(okhttp3.Response userResponse, int defaultDelay) {
        java.lang.String header$default = okhttp3.Response.header$default(userResponse, "Retry-After", null, 2, null);
        if (header$default == null) {
            return defaultDelay;
        }
        if (!new kotlin.text.Regex("\\d+").matches(header$default)) {
            return Integer.MAX_VALUE;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(header$default);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }
}
