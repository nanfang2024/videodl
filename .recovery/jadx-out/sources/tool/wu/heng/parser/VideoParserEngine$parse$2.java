package tool.wu.heng.parser;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VideoParserEngine.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/model/VideoInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.parser.VideoParserEngine$parse$2", f = "VideoParserEngine.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"parser"}, s = {"L$0"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoParserEngine$parse$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends tool.wu.heng.data.model.VideoInfo>>>, java.lang.Object> {
    final /* synthetic */ java.lang.String $rawText;
    java.lang.Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoParserEngine$parse$2(java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.parser.VideoParserEngine$parse$2> continuation) {
        super(2, continuation);
        this.$rawText = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new tool.wu.heng.parser.VideoParserEngine$parse$2(this.$rawText, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<? extends tool.wu.heng.data.model.VideoInfo>>> continuation) {
        return invoke2(coroutineScope, (kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<tool.wu.heng.data.model.VideoInfo>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<tool.wu.heng.data.model.VideoInfo>>> continuation) {
        return ((tool.wu.heng.parser.VideoParserEngine$parse$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, tool.wu.heng.parser.LocalVideoParser] */
    /* JADX WARN: Type inference failed for: r2v17, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object obj2;
        java.util.List list;
        java.lang.Object obj3;
        tool.wu.heng.parser.LocalVideoParser localVideoParser;
        java.lang.Object parse;
        java.util.List list2;
        java.lang.Object obj4;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        try {
            if (r2 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                ?? extract = tool.wu.heng.parser.UrlExtractor.INSTANCE.extract(this.$rawText);
                if (extract == 0) {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    return kotlin.Result.box-impl(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new tool.wu.heng.parser.ParseException("未识别到链接，请粘贴包含 http 链接的分享内容", null, 2, null))));
                }
                kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
                objectRef.element = extract;
                list = tool.wu.heng.parser.VideoParserEngine.parsers;
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (((tool.wu.heng.parser.LocalVideoParser) obj3).matches((java.lang.String) objectRef.element)) {
                        break;
                    }
                }
                tool.wu.heng.parser.LocalVideoParser localVideoParser2 = (tool.wu.heng.parser.LocalVideoParser) obj3;
                if (localVideoParser2 == null) {
                    objectRef.element = tool.wu.heng.parser.ParserHttp.resolveRedirect$default(tool.wu.heng.parser.ParserHttp.INSTANCE, extract, null, 2, null);
                    list2 = tool.wu.heng.parser.VideoParserEngine.parsers;
                    java.util.Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj4 = null;
                            break;
                        }
                        obj4 = it2.next();
                        if (((tool.wu.heng.parser.LocalVideoParser) obj4).matches((java.lang.String) objectRef.element)) {
                            break;
                        }
                    }
                    localVideoParser = (tool.wu.heng.parser.LocalVideoParser) obj4;
                } else {
                    localVideoParser = localVideoParser2;
                }
                if (localVideoParser == null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    return kotlin.Result.box-impl(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new tool.wu.heng.parser.ParseException("暂不支持该平台，当前支持：" + kotlin.collections.CollectionsKt.joinToString$default(tool.wu.heng.parser.VideoParserEngine.INSTANCE.getSupportedPlatforms(), "、", null, null, 0, null, null, 62, null), null, 2, null))));
                }
                this.L$0 = localVideoParser;
                this.label = 1;
                parse = localVideoParser.parse((java.lang.String) objectRef.element, this);
                if (parse == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (r2 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                parse = obj;
            }
            java.util.List list3 = (java.util.List) parse;
            if (list3.isEmpty()) {
                kotlin.Result.Companion companion3 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new tool.wu.heng.parser.ParseException("未解析到视频内容", null, 2, null)));
            } else {
                kotlin.Result.Companion companion4 = kotlin.Result.Companion;
                obj2 = kotlin.Result.constructor-impl(list3);
            }
        } catch (tool.wu.heng.parser.ParseException e) {
            timber.log.Timber.INSTANCE.w("【%s】解析失败：%s", r2.getPlatform(), e.getMessage());
            kotlin.Result.Companion companion5 = kotlin.Result.Companion;
            obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new tool.wu.heng.parser.ParseException("【" + r2.getPlatform() + "】" + e.getMessage(), null, 2, null)));
        } catch (java.lang.Exception e2) {
            timber.log.Timber.INSTANCE.e(e2, "【%s】解析异常", r2.getPlatform());
            kotlin.Result.Companion companion6 = kotlin.Result.Companion;
            java.lang.String platform = r2.getPlatform();
            java.lang.String message = e2.getMessage();
            if (message == null) {
                message = "未知错误";
            }
            obj2 = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(new tool.wu.heng.parser.ParseException("【" + platform + "】解析失败：" + message, null, 2, null)));
        }
        return kotlin.Result.box-impl(obj2);
    }
}
