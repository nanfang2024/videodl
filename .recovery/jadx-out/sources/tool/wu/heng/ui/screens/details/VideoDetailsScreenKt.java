package tool.wu.heng.ui.screens.details;

/* compiled from: VideoDetailsScreen.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, d2 = {"QualityOptionCard", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "quality", "Ltool/wu/heng/data/model/QualityOption;", "isSelected", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onSelect", "Lkotlin/Function0;", "(Ltool/wu/heng/data/model/QualityOption;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "VideoDetailsScreen", "taskId", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onNavigateBack", "viewModel", "Ltool/wu/heng/viewmodel/MainViewModel;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ltool/wu/heng/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "uiState", "Ltool/wu/heng/viewmodel/MainViewModel$ParseUiState;", "downloads", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Ltool/wu/heng/data/db/DownloadRecord;", "selectedQuality"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class VideoDetailsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoDetailsScreen(final java.lang.String taskId, final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, tool.wu.heng.viewmodel.MainViewModel mainViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras creationExtras;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel2;
        boolean changed;
        java.lang.Object rememberedValue;
        final tool.wu.heng.data.model.VideoInfo videoInfo;
        boolean changed2;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer composer2;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel3;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateBack, "onNavigateBack");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1251369257);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(taskId) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateBack) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 128;
        }
        int i5 = i3;
        if (i4 != 4 || (i5 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if (i4 != 0) {
                    i5 &= -897;
                }
            } else if (i4 != 0) {
                startRestartGroup.startReplaceableGroup(1729797275);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                androidx.lifecycle.HasDefaultViewModelProviderFactory current = androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                if (current instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory) {
                    creationExtras = current.getDefaultViewModelCreationExtras();
                } else {
                    creationExtras = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                androidx.lifecycle.ViewModel viewModel = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(tool.wu.heng.viewmodel.MainViewModel.class, current, (java.lang.String) null, (androidx.lifecycle.ViewModelProvider.Factory) null, creationExtras, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                i5 &= -897;
                mainViewModel2 = (tool.wu.heng.viewmodel.MainViewModel) viewModel;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1251369257, i5, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen (VideoDetailsScreen.kt:57)");
                }
                androidx.compose.runtime.CompositionLocal localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = startRestartGroup.consume(localContext);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final android.content.Context context = (android.content.Context) consume;
                tool.wu.heng.viewmodel.MainViewModel.ParseUiState VideoDetailsScreen$lambda$0 = VideoDetailsScreen$lambda$0(androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getParseUiState(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1));
                startRestartGroup.startReplaceableGroup(141933805);
                changed = startRestartGroup.changed(VideoDetailsScreen$lambda$0) | ((i5 & 14) != 4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!changed || rememberedValue == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    rememberedValue = mainViewModel2.getVideoById(taskId);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                videoInfo = (tool.wu.heng.data.model.VideoInfo) rememberedValue;
                startRestartGroup.endReplaceableGroup();
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getDownloads(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
                if (videoInfo == null) {
                    java.util.Iterator<T> it = VideoDetailsScreen$lambda$2(collectAsState).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((tool.wu.heng.data.db.DownloadRecord) obj).getId(), taskId)) {
                                break;
                            }
                        }
                    }
                    tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) obj;
                    videoInfo = downloadRecord != null ? new tool.wu.heng.data.model.VideoInfo(downloadRecord.getTitle(), downloadRecord.getThumbnailUrl(), null, null, downloadRecord.getDownloadUrl(), null, downloadRecord.getExt(), downloadRecord.getSource(), false, false, false, 0L, 3884, null) : null;
                }
                startRestartGroup.startReplaceableGroup(141934460);
                changed2 = startRestartGroup.changed(videoInfo);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(videoInfo == null ? videoInfo.getBestQuality() : null, (androidx.compose.runtime.SnapshotMutationPolicy) null, 2, (java.lang.Object) null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                kotlin.jvm.functions.Function2 composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 741587437, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                        if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(741587437, i6, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous> (VideoDetailsScreen.kt:91)");
                            }
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1397getLambda1$app_release = tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1397getLambda1$app_release();
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onNavigateBack;
                            androidx.compose.material3.AppBarKt.TopAppBar(m1397getLambda1$app_release, (androidx.compose.ui.Modifier) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1717581927, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$3.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                    invoke(composer4, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.runtime.Composer composer4, int i7) {
                                    if ((i7 & 11) != 2 || !composer4.getSkipping()) {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1717581927, i7, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous> (VideoDetailsScreen.kt:100)");
                                        }
                                        androidx.compose.material3.IconButtonKt.IconButton(function0, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1398getLambda2$app_release(), composer4, 196608, 30);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }), (kotlin.jvm.functions.Function3) null, (androidx.compose.foundation.layout.WindowInsets) null, (androidx.compose.material3.TopAppBarColors) null, (androidx.compose.material3.TopAppBarScrollBehavior) null, composer3, 390, 122);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                kotlin.jvm.functions.Function3 composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 996381624, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i6) {
                        int i7;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 14) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 91) != 18 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(996381624, i7, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous> (VideoDetailsScreen.kt:107)");
                            }
                            composer3.startReplaceableGroup(456382280);
                            if (tool.wu.heng.data.model.VideoInfo.this == null) {
                                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                androidx.compose.runtime.Composer composer4 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                                androidx.compose.runtime.Updater.set-impl(composer4, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
                                composer3.startReplaceableGroup(-483455358);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                androidx.compose.ui.Modifier modifier = androidx.compose.ui.Modifier.Companion;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
                                if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                                androidx.compose.runtime.Updater.set-impl(composer5, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                    composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                    composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                androidx.compose.material3.TextKt.Text--4IGK_g("视频信息已失效", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 6, 0, 131070);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer3, 6);
                                androidx.compose.material3.TextKt.Text--4IGK_g("请重新解析视频链接", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                                composer3.endReplaceableGroup();
                                composer3.endNode();
                                composer3.endReplaceableGroup();
                                composer3.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                composer3.endReplaceableGroup();
                                return;
                            }
                            composer3.endReplaceableGroup();
                            androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                            androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(16));
                            androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(12));
                            final tool.wu.heng.data.model.VideoInfo videoInfo2 = tool.wu.heng.data.model.VideoInfo.this;
                            final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState2 = mutableState;
                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel4 = mainViewModel2;
                            final android.content.Context context2 = context;
                            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default3, (androidx.compose.foundation.lazy.LazyListState) null, paddingValues2, false, vertical, (androidx.compose.ui.Alignment.Horizontal) null, (androidx.compose.foundation.gestures.FlingBehavior) null, false, new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
                                    invoke2(lazyListScope);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.compose.foundation.lazy.LazyListScope LazyColumn) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    final tool.wu.heng.data.model.VideoInfo videoInfo3 = tool.wu.heng.data.model.VideoInfo.this;
                                    androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-516799324, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.1
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                            invoke(lazyItemScope, composer6, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.foundation.lazy.LazyItemScope item, androidx.compose.runtime.Composer composer6, int i8) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i8 & 81) != 16 || !composer6.getSkipping()) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-516799324, i8, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:137)");
                                                }
                                                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                                androidx.compose.material3.CardElevation cardElevation = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer6, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62);
                                                final tool.wu.heng.data.model.VideoInfo videoInfo4 = tool.wu.heng.data.model.VideoInfo.this;
                                                androidx.compose.material3.CardKt.Card(fillMaxWidth$default, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, cardElevation, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer6, 1735522418, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.1.1
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                                        invoke(columnScope2, composer7, num.intValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer7, int i9) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                                        if ((i9 & 81) != 16 || !composer7.getSkipping()) {
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(1735522418, i9, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:141)");
                                                            }
                                                            float f = 16;
                                                            androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f));
                                                            tool.wu.heng.data.model.VideoInfo videoInfo5 = tool.wu.heng.data.model.VideoInfo.this;
                                                            composer7.startReplaceableGroup(-483455358);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer7, 0);
                                                            composer7.startReplaceableGroup(-1323940314);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                                            kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                            kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
                                                            if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer7.startReusableNode();
                                                            if (composer7.getInserting()) {
                                                                composer7.createNode(constructor3);
                                                            } else {
                                                                composer7.useNode();
                                                            }
                                                            androidx.compose.runtime.Composer composer8 = androidx.compose.runtime.Updater.constructor-impl(composer7);
                                                            androidx.compose.runtime.Updater.set-impl(composer8, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.set-impl(composer8, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                            kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                            if (composer8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                                                composer8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                                                composer8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                            }
                                                            modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer7)), composer7, 0);
                                                            composer7.startReplaceableGroup(2058660585);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer7, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                                            androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                            tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(videoInfo5.getThumbnail(), null, androidx.compose.ui.unit.Dp.constructor-impl(180), false, composer7, 384, 10);
                                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer7, 6);
                                                            java.lang.String title = videoInfo5.getTitle();
                                                            if (kotlin.text.StringsKt.isBlank(title)) {
                                                                title = "未命名视频";
                                                            }
                                                            androidx.compose.material3.TextKt.Text--4IGK_g(title, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer7, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer7, 0, 0, 65534);
                                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer7, 6);
                                                            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f));
                                                            composer7.startReplaceableGroup(693286680);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                            androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.Companion;
                                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(horizontal, androidx.compose.ui.Alignment.Companion.getTop(), composer7, 6);
                                                            composer7.startReplaceableGroup(-1323940314);
                                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                            int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                                                            kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                            kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                                            if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                            }
                                                            composer7.startReusableNode();
                                                            if (composer7.getInserting()) {
                                                                composer7.createNode(constructor4);
                                                            } else {
                                                                composer7.useNode();
                                                            }
                                                            androidx.compose.runtime.Composer composer9 = androidx.compose.runtime.Updater.constructor-impl(composer7);
                                                            androidx.compose.runtime.Updater.set-impl(composer9, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                            androidx.compose.runtime.Updater.set-impl(composer9, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                            kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                            if (composer9.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer9.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                                                composer9.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                                                composer9.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                            }
                                                            modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer7)), composer7, 0);
                                                            composer7.startReplaceableGroup(2058660585);
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer7, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                            androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                            androidx.compose.material3.TextKt.Text--4IGK_g("时长 " + videoInfo5.humanReadableDuration(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer7, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer7, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer7, 0, 0, 65530);
                                                            composer7.startReplaceableGroup(-1434577516);
                                                            if (!kotlin.text.StringsKt.isBlank(videoInfo5.getSource())) {
                                                                androidx.compose.material3.TextKt.Text--4IGK_g("来源 " + videoInfo5.getSource(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer7, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer7, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer7, 0, 0, 65530);
                                                            }
                                                            composer7.endReplaceableGroup();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            composer7.endReplaceableGroup();
                                                            composer7.endNode();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                                            composer7.endReplaceableGroup();
                                                            composer7.endNode();
                                                            composer7.endReplaceableGroup();
                                                            composer7.endReplaceableGroup();
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer7.skipToGroupEnd();
                                                    }
                                                }), composer6, 196614, 22);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }), 3, (java.lang.Object) null);
                                    androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1399getLambda3$app_release(), 3, (java.lang.Object) null);
                                    java.util.List<tool.wu.heng.data.model.QualityOption> qualityOptions = tool.wu.heng.data.model.VideoInfo.this.getQualityOptions();
                                    if (qualityOptions == null || qualityOptions.isEmpty()) {
                                        androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1401getLambda5$app_release(), 3, (java.lang.Object) null);
                                    } else {
                                        final java.util.List<tool.wu.heng.data.model.QualityOption> qualityOptions2 = tool.wu.heng.data.model.VideoInfo.this.getQualityOptions();
                                        final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState3 = mutableState2;
                                        final tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$1 videoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Void invoke(tool.wu.heng.data.model.QualityOption qualityOption) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                                return invoke((tool.wu.heng.data.model.QualityOption) obj2);
                                            }
                                        };
                                        LazyColumn.items(qualityOptions2.size(), (kotlin.jvm.functions.Function1) null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final java.lang.Object invoke(int i8) {
                                                return kotlin.jvm.functions.Function1.this.invoke(qualityOptions2.get(i8));
                                            }
                                        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer6, num2.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i8, androidx.compose.runtime.Composer composer6, int i9) {
                                                int i10;
                                                tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6;
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C148@6730L22:LazyDsl.kt#428nma");
                                                if ((i9 & 14) == 0) {
                                                    i10 = (composer6.changed(lazyItemScope) ? 4 : 2) | i9;
                                                } else {
                                                    i10 = i9;
                                                }
                                                if ((i9 & 112) == 0) {
                                                    i10 |= composer6.changed(i8) ? 32 : 16;
                                                }
                                                if ((i10 & 731) == 146 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                                }
                                                int i11 = i10 & 14;
                                                final tool.wu.heng.data.model.QualityOption qualityOption = (tool.wu.heng.data.model.QualityOption) qualityOptions2.get(i8);
                                                VideoDetailsScreen$lambda$6 = tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen$lambda$6(mutableState3);
                                                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(VideoDetailsScreen$lambda$6, qualityOption);
                                                composer6.startReplaceableGroup(-1196993789);
                                                boolean changed3 = composer6.changed(mutableState3) | composer6.changed(qualityOption);
                                                java.lang.Object rememberedValue3 = composer6.rememberedValue();
                                                if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                                    final androidx.compose.runtime.MutableState mutableState4 = mutableState3;
                                                    rememberedValue3 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$2$1$1
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                            invoke2();
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2() {
                                                            mutableState4.setValue(tool.wu.heng.data.model.QualityOption.this);
                                                        }
                                                    };
                                                    composer6.updateRememberedValue(rememberedValue3);
                                                }
                                                composer6.endReplaceableGroup();
                                                tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.QualityOptionCard(qualityOption, areEqual, (kotlin.jvm.functions.Function0) rememberedValue3, composer6, (i11 >> 3) & 14);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    }
                                    final tool.wu.heng.data.model.VideoInfo videoInfo4 = tool.wu.heng.data.model.VideoInfo.this;
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel5 = mainViewModel4;
                                    final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState4 = mutableState2;
                                    final android.content.Context context3 = context2;
                                    androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1480649108, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                            invoke(lazyItemScope, composer6, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.foundation.lazy.LazyItemScope item, androidx.compose.runtime.Composer composer6, int i8) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$this$item");
                                            if ((i8 & 81) != 16 || !composer6.getSkipping()) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1480649108, i8, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:205)");
                                                }
                                                final tool.wu.heng.data.model.VideoInfo videoInfo5 = tool.wu.heng.data.model.VideoInfo.this;
                                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = mainViewModel5;
                                                final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState5 = mutableState4;
                                                final android.content.Context context4 = context3;
                                                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                        invoke2();
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6;
                                                        VideoDetailsScreen$lambda$6 = tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen$lambda$6(mutableState5);
                                                        tool.wu.heng.data.model.VideoInfo copy = VideoDetailsScreen$lambda$6 != null ? r2.copy((r29 & 1) != 0 ? r2.title : null, (r29 & 2) != 0 ? r2.thumbnail : null, (r29 & 4) != 0 ? r2.duration : null, (r29 & 8) != 0 ? r2.qualityOptions : null, (r29 & 16) != 0 ? r2.downloadUrl : VideoDetailsScreen$lambda$6.getUrl(), (r29 & 32) != 0 ? r2.savePath : null, (r29 & 64) != 0 ? r2.ext : VideoDetailsScreen$lambda$6.getExt(), (r29 & 128) != 0 ? r2.source : null, (r29 & 256) != 0 ? r2.isHls : false, (r29 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? r2.supportsFfmpeg : false, (r29 & 1024) != 0 ? r2.supportsAria2c : false, (r29 & 2048) != 0 ? tool.wu.heng.data.model.VideoInfo.this.fileSize : 0L) : tool.wu.heng.data.model.VideoInfo.this;
                                                        tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel6;
                                                        final android.content.Context context5 = context4;
                                                        mainViewModel7.createDownload(copy, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3.1.1
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                                                                invoke2(str);
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(java.lang.String recordId) {
                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordId, "recordId");
                                                                androidx.core.content.ContextCompat.startForegroundService(context5, tool.wu.heng.service.DownloadService.Companion.createIntent(context5, recordId));
                                                            }
                                                        });
                                                    }
                                                };
                                                androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(52));
                                                final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState6 = mutableState4;
                                                androidx.compose.material3.ButtonKt.Button(function0, modifier2, false, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer6, 1403863164, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3.2
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                                        invoke(rowScope, composer7, num.intValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    public final void invoke(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer7, int i9) {
                                                        tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6;
                                                        java.lang.String str;
                                                        java.lang.String qualityLabel;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                        if ((i9 & 81) != 16 || !composer7.getSkipping()) {
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(1403863164, i9, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:222)");
                                                            }
                                                            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.DownloadKt.getDownload(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, (androidx.compose.ui.Modifier) null, 0L, composer7, 48, 12);
                                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer7, 6);
                                                            VideoDetailsScreen$lambda$6 = tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen$lambda$6(mutableState6);
                                                            if (VideoDetailsScreen$lambda$6 == null || (qualityLabel = VideoDetailsScreen$lambda$6.qualityLabel()) == null || (str = "（" + qualityLabel + "）") == null) {
                                                                str = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                                                            }
                                                            androidx.compose.material3.TextKt.Text--4IGK_g("下载" + str, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer7, 0, 0, 131070);
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer7.skipToGroupEnd();
                                                    }
                                                }), composer6, 805306416, 508);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer6.skipToGroupEnd();
                                        }
                                    }), 3, (java.lang.Object) null);
                                }
                            }, composer3, 24960, 234);
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                });
                tool.wu.heng.viewmodel.MainViewModel mainViewModel4 = mainViewModel2;
                composer2 = startRestartGroup;
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(fillMaxSize$default, composableLambda, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, composableLambda2, startRestartGroup, 805306422, 508);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                mainViewModel3 = mainViewModel4;
            }
            mainViewModel2 = mainViewModel;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.CompositionLocal localContext2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume2 = startRestartGroup.consume(localContext2);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final android.content.Context context2 = (android.content.Context) consume2;
            tool.wu.heng.viewmodel.MainViewModel.ParseUiState VideoDetailsScreen$lambda$02 = VideoDetailsScreen$lambda$0(androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getParseUiState(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1));
            startRestartGroup.startReplaceableGroup(141933805);
            changed = startRestartGroup.changed(VideoDetailsScreen$lambda$02) | ((i5 & 14) != 4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
            }
            rememberedValue = mainViewModel2.getVideoById(taskId);
            startRestartGroup.updateRememberedValue(rememberedValue);
            videoInfo = (tool.wu.heng.data.model.VideoInfo) rememberedValue;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getDownloads(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
            if (videoInfo == null) {
            }
            startRestartGroup.startReplaceableGroup(141934460);
            changed2 = startRestartGroup.changed(videoInfo);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue2 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(videoInfo == null ? videoInfo.getBestQuality() : null, (androidx.compose.runtime.SnapshotMutationPolicy) null, 2, (java.lang.Object) null);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
            kotlin.jvm.functions.Function2 composableLambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 741587437, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(741587437, i6, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous> (VideoDetailsScreen.kt:91)");
                        }
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1397getLambda1$app_release = tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1397getLambda1$app_release();
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onNavigateBack;
                        androidx.compose.material3.AppBarKt.TopAppBar(m1397getLambda1$app_release, (androidx.compose.ui.Modifier) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1717581927, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                invoke(composer4, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.runtime.Composer composer4, int i7) {
                                if ((i7 & 11) != 2 || !composer4.getSkipping()) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1717581927, i7, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous> (VideoDetailsScreen.kt:100)");
                                    }
                                    androidx.compose.material3.IconButtonKt.IconButton(function0, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1398getLambda2$app_release(), composer4, 196608, 30);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), (kotlin.jvm.functions.Function3) null, (androidx.compose.foundation.layout.WindowInsets) null, (androidx.compose.material3.TopAppBarColors) null, (androidx.compose.material3.TopAppBarScrollBehavior) null, composer3, 390, 122);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            kotlin.jvm.functions.Function3 composableLambda22 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 996381624, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i6) {
                    int i7;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 14) == 0) {
                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 91) != 18 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(996381624, i7, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous> (VideoDetailsScreen.kt:107)");
                        }
                        composer3.startReplaceableGroup(456382280);
                        if (tool.wu.heng.data.model.VideoInfo.this == null) {
                            androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default22);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            androidx.compose.runtime.Composer composer4 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                            androidx.compose.runtime.Updater.set-impl(composer4, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
                            composer3.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            androidx.compose.ui.Modifier modifier = androidx.compose.ui.Modifier.Companion;
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                            androidx.compose.runtime.Updater.set-impl(composer5, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            androidx.compose.material3.TextKt.Text--4IGK_g("视频信息已失效", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 6, 0, 131070);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer3, 6);
                            androidx.compose.material3.TextKt.Text--4IGK_g("请重新解析视频链接", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                            }
                            composer3.endReplaceableGroup();
                            return;
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                        androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(16));
                        androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(12));
                        final tool.wu.heng.data.model.VideoInfo videoInfo2 = tool.wu.heng.data.model.VideoInfo.this;
                        final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState22 = mutableState2;
                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel42 = mainViewModel2;
                        final android.content.Context context22 = context2;
                        androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default3, (androidx.compose.foundation.lazy.LazyListState) null, paddingValues2, false, vertical, (androidx.compose.ui.Alignment.Horizontal) null, (androidx.compose.foundation.gestures.FlingBehavior) null, false, new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.compose.foundation.lazy.LazyListScope LazyColumn) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                final tool.wu.heng.data.model.VideoInfo videoInfo3 = tool.wu.heng.data.model.VideoInfo.this;
                                androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-516799324, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.1
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                        invoke(lazyItemScope, composer6, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope item, androidx.compose.runtime.Composer composer6, int i8) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i8 & 81) != 16 || !composer6.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-516799324, i8, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:137)");
                                            }
                                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                            androidx.compose.material3.CardElevation cardElevation = androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer6, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62);
                                            final tool.wu.heng.data.model.VideoInfo videoInfo4 = tool.wu.heng.data.model.VideoInfo.this;
                                            androidx.compose.material3.CardKt.Card(fillMaxWidth$default, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, cardElevation, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer6, 1735522418, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.1.1
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                                    invoke(columnScope2, composer7, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer7, int i9) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                                    if ((i9 & 81) != 16 || !composer7.getSkipping()) {
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(1735522418, i9, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:141)");
                                                        }
                                                        float f = 16;
                                                        androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f));
                                                        tool.wu.heng.data.model.VideoInfo videoInfo5 = tool.wu.heng.data.model.VideoInfo.this;
                                                        composer7.startReplaceableGroup(-483455358);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer7, 0);
                                                        composer7.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer7.getCurrentCompositionLocalMap();
                                                        kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                        kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
                                                        if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor3);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer composer8 = androidx.compose.runtime.Updater.constructor-impl(composer7);
                                                        androidx.compose.runtime.Updater.set-impl(composer8, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.set-impl(composer8, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                        if (composer8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                                            composer8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                                            composer8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                                        }
                                                        modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer7)), composer7, 0);
                                                        composer7.startReplaceableGroup(2058660585);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer7, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                                        androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                                        tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(videoInfo5.getThumbnail(), null, androidx.compose.ui.unit.Dp.constructor-impl(180), false, composer7, 384, 10);
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer7, 6);
                                                        java.lang.String title = videoInfo5.getTitle();
                                                        if (kotlin.text.StringsKt.isBlank(title)) {
                                                            title = "未命名视频";
                                                        }
                                                        androidx.compose.material3.TextKt.Text--4IGK_g(title, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer7, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer7, 0, 0, 65534);
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer7, 6);
                                                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f));
                                                        composer7.startReplaceableGroup(693286680);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                        androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.Companion;
                                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(horizontal, androidx.compose.ui.Alignment.Companion.getTop(), composer7, 6);
                                                        composer7.startReplaceableGroup(-1323940314);
                                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                        int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer7, 0);
                                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer7.getCurrentCompositionLocalMap();
                                                        kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                        kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                                        if (!(composer7.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                        }
                                                        composer7.startReusableNode();
                                                        if (composer7.getInserting()) {
                                                            composer7.createNode(constructor4);
                                                        } else {
                                                            composer7.useNode();
                                                        }
                                                        androidx.compose.runtime.Composer composer9 = androidx.compose.runtime.Updater.constructor-impl(composer7);
                                                        androidx.compose.runtime.Updater.set-impl(composer9, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                        androidx.compose.runtime.Updater.set-impl(composer9, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                        kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                        if (composer9.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer9.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                                            composer9.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                                            composer9.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                        }
                                                        modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer7)), composer7, 0);
                                                        composer7.startReplaceableGroup(2058660585);
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer7, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                        androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                        androidx.compose.material3.TextKt.Text--4IGK_g("时长 " + videoInfo5.humanReadableDuration(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer7, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer7, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer7, 0, 0, 65530);
                                                        composer7.startReplaceableGroup(-1434577516);
                                                        if (!kotlin.text.StringsKt.isBlank(videoInfo5.getSource())) {
                                                            androidx.compose.material3.TextKt.Text--4IGK_g("来源 " + videoInfo5.getSource(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer7, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer7, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer7, 0, 0, 65530);
                                                        }
                                                        composer7.endReplaceableGroup();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        composer7.endReplaceableGroup();
                                                        composer7.endNode();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                                        composer7.endReplaceableGroup();
                                                        composer7.endNode();
                                                        composer7.endReplaceableGroup();
                                                        composer7.endReplaceableGroup();
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer7.skipToGroupEnd();
                                                }
                                            }), composer6, 196614, 22);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), 3, (java.lang.Object) null);
                                androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1399getLambda3$app_release(), 3, (java.lang.Object) null);
                                java.util.List<tool.wu.heng.data.model.QualityOption> qualityOptions = tool.wu.heng.data.model.VideoInfo.this.getQualityOptions();
                                if (qualityOptions == null || qualityOptions.isEmpty()) {
                                    androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1401getLambda5$app_release(), 3, (java.lang.Object) null);
                                } else {
                                    final java.util.List qualityOptions2 = tool.wu.heng.data.model.VideoInfo.this.getQualityOptions();
                                    final androidx.compose.runtime.MutableState mutableState3 = mutableState22;
                                    final kotlin.jvm.functions.Function1 videoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Void invoke(tool.wu.heng.data.model.QualityOption qualityOption) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                                            return invoke((tool.wu.heng.data.model.QualityOption) obj2);
                                        }
                                    };
                                    LazyColumn.items(qualityOptions2.size(), (kotlin.jvm.functions.Function1) null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final java.lang.Object invoke(int i8) {
                                            return kotlin.jvm.functions.Function1.this.invoke(qualityOptions2.get(i8));
                                        }
                                    }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$invoke$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer6, num2.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i8, androidx.compose.runtime.Composer composer6, int i9) {
                                            int i10;
                                            tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C148@6730L22:LazyDsl.kt#428nma");
                                            if ((i9 & 14) == 0) {
                                                i10 = (composer6.changed(lazyItemScope) ? 4 : 2) | i9;
                                            } else {
                                                i10 = i9;
                                            }
                                            if ((i9 & 112) == 0) {
                                                i10 |= composer6.changed(i8) ? 32 : 16;
                                            }
                                            if ((i10 & 731) == 146 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, i10, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                            }
                                            int i11 = i10 & 14;
                                            final tool.wu.heng.data.model.QualityOption qualityOption = (tool.wu.heng.data.model.QualityOption) qualityOptions2.get(i8);
                                            VideoDetailsScreen$lambda$6 = tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen$lambda$6(mutableState3);
                                            boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(VideoDetailsScreen$lambda$6, qualityOption);
                                            composer6.startReplaceableGroup(-1196993789);
                                            boolean changed3 = composer6.changed(mutableState3) | composer6.changed(qualityOption);
                                            java.lang.Object rememberedValue3 = composer6.rememberedValue();
                                            if (changed3 || rememberedValue3 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                                final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState4 = mutableState3;
                                                rememberedValue3 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$4$2$2$1$1
                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(0);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function0
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                        invoke2();
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        mutableState4.setValue(tool.wu.heng.data.model.QualityOption.this);
                                                    }
                                                };
                                                composer6.updateRememberedValue(rememberedValue3);
                                            }
                                            composer6.endReplaceableGroup();
                                            tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.QualityOptionCard(qualityOption, areEqual, (kotlin.jvm.functions.Function0) rememberedValue3, composer6, (i11 >> 3) & 14);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                }
                                final tool.wu.heng.data.model.VideoInfo videoInfo4 = tool.wu.heng.data.model.VideoInfo.this;
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel5 = mainViewModel42;
                                final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState4 = mutableState22;
                                final android.content.Context context3 = context22;
                                androidx.compose.foundation.lazy.LazyListScope.item$default(LazyColumn, (java.lang.Object) null, (java.lang.Object) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1480649108, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer6, java.lang.Integer num) {
                                        invoke(lazyItemScope, composer6, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope item, androidx.compose.runtime.Composer composer6, int i8) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$this$item");
                                        if ((i8 & 81) != 16 || !composer6.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-1480649108, i8, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:205)");
                                            }
                                            final tool.wu.heng.data.model.VideoInfo videoInfo5 = tool.wu.heng.data.model.VideoInfo.this;
                                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = mainViewModel5;
                                            final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState5 = mutableState4;
                                            final android.content.Context context4 = context3;
                                            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                                                    invoke2();
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6;
                                                    VideoDetailsScreen$lambda$6 = tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen$lambda$6(mutableState5);
                                                    tool.wu.heng.data.model.VideoInfo copy = VideoDetailsScreen$lambda$6 != null ? r2.copy((r29 & 1) != 0 ? r2.title : null, (r29 & 2) != 0 ? r2.thumbnail : null, (r29 & 4) != 0 ? r2.duration : null, (r29 & 8) != 0 ? r2.qualityOptions : null, (r29 & 16) != 0 ? r2.downloadUrl : VideoDetailsScreen$lambda$6.getUrl(), (r29 & 32) != 0 ? r2.savePath : null, (r29 & 64) != 0 ? r2.ext : VideoDetailsScreen$lambda$6.getExt(), (r29 & 128) != 0 ? r2.source : null, (r29 & 256) != 0 ? r2.isHls : false, (r29 & kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? r2.supportsFfmpeg : false, (r29 & 1024) != 0 ? r2.supportsAria2c : false, (r29 & 2048) != 0 ? tool.wu.heng.data.model.VideoInfo.this.fileSize : 0L) : tool.wu.heng.data.model.VideoInfo.this;
                                                    tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel6;
                                                    final android.content.Context context5 = context4;
                                                    mainViewModel7.createDownload(copy, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3.1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str) {
                                                            invoke2(str);
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                        public final void invoke2(java.lang.String recordId) {
                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(recordId, "recordId");
                                                            androidx.core.content.ContextCompat.startForegroundService(context5, tool.wu.heng.service.DownloadService.Companion.createIntent(context5, recordId));
                                                        }
                                                    });
                                                }
                                            };
                                            androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(52));
                                            final androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState6 = mutableState4;
                                            androidx.compose.material3.ButtonKt.Button(function0, modifier2, false, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer6, 1403863164, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen.4.2.3.2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                                    invoke(rowScope, composer7, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer7, int i9) {
                                                    tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6;
                                                    java.lang.String str;
                                                    java.lang.String qualityLabel;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                    if ((i9 & 81) != 16 || !composer7.getSkipping()) {
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(1403863164, i9, -1, "tool.wu.heng.ui.screens.details.VideoDetailsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VideoDetailsScreen.kt:222)");
                                                        }
                                                        androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.DownloadKt.getDownload(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, (androidx.compose.ui.Modifier) null, 0L, composer7, 48, 12);
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer7, 6);
                                                        VideoDetailsScreen$lambda$6 = tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen$lambda$6(mutableState6);
                                                        if (VideoDetailsScreen$lambda$6 == null || (qualityLabel = VideoDetailsScreen$lambda$6.qualityLabel()) == null || (str = "（" + qualityLabel + "）") == null) {
                                                            str = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        androidx.compose.material3.TextKt.Text--4IGK_g("下载" + str, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer7, 0, 0, 131070);
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer7.skipToGroupEnd();
                                                }
                                            }), composer6, 805306416, 508);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer6.skipToGroupEnd();
                                    }
                                }), 3, (java.lang.Object) null);
                            }
                        }, composer3, 24960, 234);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            });
            tool.wu.heng.viewmodel.MainViewModel mainViewModel42 = mainViewModel2;
            composer2 = startRestartGroup;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(fillMaxSize$default2, composableLambda3, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, composableLambda22, startRestartGroup, 805306422, 508);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            mainViewModel3 = mainViewModel42;
        } else {
            startRestartGroup.skipToGroupEnd();
            mainViewModel3 = mainViewModel;
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$VideoDetailsScreen$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                    tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen(taskId, onNavigateBack, mainViewModel3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tool.wu.heng.data.model.QualityOption VideoDetailsScreen$lambda$6(androidx.compose.runtime.MutableState<tool.wu.heng.data.model.QualityOption> mutableState) {
        return (tool.wu.heng.data.model.QualityOption) ((androidx.compose.runtime.State) mutableState).getValue();
    }

    public static final void QualityOptionCard(final tool.wu.heng.data.model.QualityOption quality, final boolean z, final kotlin.jvm.functions.Function0<kotlin.Unit> onSelect, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        long j;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "quality");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSelect, "onSelect");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1438963760);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(quality) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onSelect) ? 256 : 128;
        }
        if ((i2 & 731) != 146 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1438963760, i2, -1, "tool.wu.heng.ui.screens.details.QualityOptionCard (VideoDetailsScreen.kt:242)");
            }
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
            androidx.compose.material3.CardDefaults cardDefaults = androidx.compose.material3.CardDefaults.INSTANCE;
            if (z) {
                startRestartGroup.startReplaceableGroup(476790881);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getPrimaryContainer-0d7_KjU();
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(476790961);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getSurface-0d7_KjU();
                startRestartGroup.endReplaceableGroup();
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.CardKt.Card(onSelect, fillMaxWidth$default, false, (androidx.compose.ui.graphics.Shape) null, cardDefaults.cardColors-ro_MJ88(j, 0L, 0L, 0L, startRestartGroup, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 255719973, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$QualityOptionCard$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer3, int i3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i3 & 81) != 16 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(255719973, i3, -1, "tool.wu.heng.ui.screens.details.QualityOptionCard.<anonymous> (VideoDetailsScreen.kt:254)");
                        }
                        androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(16));
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                        boolean z2 = z;
                        tool.wu.heng.data.model.QualityOption qualityOption = quality;
                        composer3.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer composer4 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                        androidx.compose.runtime.Updater.set-impl(composer4, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(androidx.compose.foundation.layout.RowScopeInstance.INSTANCE, androidx.compose.ui.Modifier.Companion, 1.0f, false, 2, (java.lang.Object) null);
                        composer3.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(weight$default);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                        androidx.compose.runtime.Updater.set-impl(composer5, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                            composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.material3.TextKt.Text--4IGK_g(qualityOption.qualityLabel(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer3, 0, 0, 65534);
                        androidx.compose.material3.TextKt.Text--4IGK_g("格式 " + qualityOption.getExt() + " · 大小 " + qualityOption.humanReadableFilesize(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(358776170);
                        if (z2) {
                            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.CheckKt.getCheck(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), "已选择", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getPrimary-0d7_KjU(), composer3, 48, 4);
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, ((i2 >> 6) & 14) | 100663344, 236);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.VideoDetailsScreenKt$QualityOptionCard$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i3) {
                    tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.QualityOptionCard(tool.wu.heng.data.model.QualityOption.this, z, onSelect, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    private static final tool.wu.heng.viewmodel.MainViewModel.ParseUiState VideoDetailsScreen$lambda$0(androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state) {
        return (tool.wu.heng.viewmodel.MainViewModel.ParseUiState) state.getValue();
    }

    private static final java.util.List<tool.wu.heng.data.db.DownloadRecord> VideoDetailsScreen$lambda$2(androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> state) {
        return (java.util.List) state.getValue();
    }
}
