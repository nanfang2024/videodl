package tool.wu.heng.ui.screens.history;

/* compiled from: DownloadHistoryScreen.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aM\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010X\u008a\u0084\u0002"}, d2 = {"DownloadHistoryScreen", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "viewModel", "Ltool/wu/heng/viewmodel/MainViewModel;", "(Ltool/wu/heng/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "DownloadRecordCard", "record", "Ltool/wu/heng/data/db/DownloadRecord;", "onPause", "Lkotlin/Function0;", "onResume", "onRetry", "onDelete", "(Ltool/wu/heng/data/db/DownloadRecord;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "downloads", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DownloadHistoryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DownloadHistoryScreen(tool.wu.heng.viewmodel.MainViewModel mainViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.lifecycle.viewmodel.CreationExtras creationExtras;
        tool.wu.heng.viewmodel.MainViewModel mainViewModel2;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.Composer composer2;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-936585214);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if (i3 != 1 || (i4 & 11) != 2 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if (i3 != 0) {
                    i4 &= -15;
                }
            } else if (i3 != 0) {
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
                i4 &= -15;
                mainViewModel2 = (tool.wu.heng.viewmodel.MainViewModel) viewModel;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-936585214, i4, -1, "tool.wu.heng.ui.screens.history.DownloadHistoryScreen (DownloadHistoryScreen.kt:64)");
                }
                androidx.compose.runtime.CompositionLocal localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = startRestartGroup.consume(localContext);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final android.content.Context context = (android.content.Context) consume;
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getDownloads(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
                startRestartGroup.startReplaceableGroup(773894976);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
                startRestartGroup.startReplaceableGroup(-492369756);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller(androidx.compose.runtime.EffectsKt.createCompositionCoroutineScope(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, startRestartGroup));
                    startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                    rememberedValue = compositionScopedCoroutineScopeCanceller;
                }
                startRestartGroup.endReplaceableGroup();
                final kotlinx.coroutines.CoroutineScope coroutineScope = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(443175483);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    rememberedValue2 = new androidx.compose.material3.SnackbarHostState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.material3.SnackbarHostState snackbarHostState = (androidx.compose.material3.SnackbarHostState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                final tool.wu.heng.viewmodel.MainViewModel mainViewModel4 = mainViewModel2;
                composer2 = startRestartGroup;
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), tool.wu.heng.ui.screens.history.ComposableSingletons$DownloadHistoryScreenKt.INSTANCE.m1403getLambda2$app_release(), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -44875524, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$1
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

                    public final void invoke(androidx.compose.runtime.Composer composer3, int i5) {
                        if ((i5 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-44875524, i5, -1, "tool.wu.heng.ui.screens.history.DownloadHistoryScreen.<anonymous> (DownloadHistoryScreen.kt:75)");
                        }
                        androidx.compose.material3.SnackbarHostKt.SnackbarHost(snackbarHostState, (androidx.compose.ui.Modifier) null, (kotlin.jvm.functions.Function3) null, composer3, 6, 6);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }), (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -423253805, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i5) {
                        int i6;
                        java.util.List DownloadHistoryScreen$lambda$0;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 14) == 0) {
                            i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-423253805, i6, -1, "tool.wu.heng.ui.screens.history.DownloadHistoryScreen.<anonymous> (DownloadHistoryScreen.kt:77)");
                            }
                            DownloadHistoryScreen$lambda$0 = tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen$lambda$0(collectAsState);
                            if (DownloadHistoryScreen$lambda$0.isEmpty()) {
                                composer3.startReplaceableGroup(-1285741062);
                                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
                                androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.DownloadKt.getDownload(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(64)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), composer3, 432, 0);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(16)), composer3, 6);
                                androidx.compose.material3.TextKt.Text--4IGK_g("暂无下载记录", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer3, 6, 0, 65534);
                                androidx.compose.material3.TextKt.Text--4IGK_g("去「添加」页面解析视频链接开始下载", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodyMedium(), composer3, 6, 0, 65530);
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
                                composer3.endReplaceableGroup();
                            } else {
                                composer3.startReplaceableGroup(-1285740002);
                                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                                float f = 8;
                                androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-YgX7TsA(androidx.compose.ui.unit.Dp.constructor-impl(16), androidx.compose.ui.unit.Dp.constructor-impl(f));
                                androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f));
                                final androidx.compose.runtime.State<java.util.List<tool.wu.heng.data.db.DownloadRecord>> state = collectAsState;
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel5 = mainViewModel4;
                                final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                                final androidx.compose.material3.SnackbarHostState snackbarHostState2 = snackbarHostState;
                                final android.content.Context context2 = context;
                                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default2, (androidx.compose.foundation.lazy.LazyListState) null, paddingValues2, false, vertical, (androidx.compose.ui.Alignment.Horizontal) null, (androidx.compose.foundation.gestures.FlingBehavior) null, false, new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
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
                                        final java.util.List DownloadHistoryScreen$lambda$02;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                        DownloadHistoryScreen$lambda$02 = tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen$lambda$0(state);
                                        final tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2.AnonymousClass2.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function1<tool.wu.heng.data.db.DownloadRecord, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen.2.2.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(tool.wu.heng.data.db.DownloadRecord it) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                                return it.getId();
                                            }
                                        };
                                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = mainViewModel5;
                                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                        final androidx.compose.material3.SnackbarHostState snackbarHostState3 = snackbarHostState2;
                                        final android.content.Context context3 = context2;
                                        final tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$1 downloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Void invoke(tool.wu.heng.data.db.DownloadRecord downloadRecord) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                                return invoke((tool.wu.heng.data.db.DownloadRecord) obj);
                                            }
                                        };
                                        LazyColumn.items(DownloadHistoryScreen$lambda$02.size(), anonymousClass1 != null ? new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final java.lang.Object invoke(int i7) {
                                                return kotlin.jvm.functions.Function1.this.invoke(DownloadHistoryScreen$lambda$02.get(i7));
                                            }
                                        } : null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final java.lang.Object invoke(int i7) {
                                                return kotlin.jvm.functions.Function1.this.invoke(DownloadHistoryScreen$lambda$02.get(i7));
                                            }
                                        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                                invoke(lazyItemScope, num.intValue(), composer6, num2.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i7, androidx.compose.runtime.Composer composer6, int i8) {
                                                int i9;
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C148@6730L22:LazyDsl.kt#428nma");
                                                if ((i8 & 14) == 0) {
                                                    i9 = (composer6.changed(lazyItemScope) ? 4 : 2) | i8;
                                                } else {
                                                    i9 = i8;
                                                }
                                                if ((i8 & 112) == 0) {
                                                    i9 |= composer6.changed(i7) ? 32 : 16;
                                                }
                                                if ((i9 & 731) == 146 && composer6.getSkipping()) {
                                                    composer6.skipToGroupEnd();
                                                    return;
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                                }
                                                final tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) DownloadHistoryScreen$lambda$02.get(i7);
                                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel6;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                final androidx.compose.material3.SnackbarHostState snackbarHostState4 = snackbarHostState3;
                                                kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1
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

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: DownloadHistoryScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1$1", f = "DownloadHistoryScreen.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1$1, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                            this.$record = downloadRecord;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                java.lang.String title = this.$record.getTitle();
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已暂停: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                            }
                                                            return kotlin.Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        tool.wu.heng.viewmodel.MainViewModel.this.pauseDownload(downloadRecord.getId());
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1(snackbarHostState4, downloadRecord, null), 3, null);
                                                    }
                                                };
                                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = mainViewModel6;
                                                final android.content.Context context4 = context3;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope3;
                                                final androidx.compose.material3.SnackbarHostState snackbarHostState5 = snackbarHostState3;
                                                kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2
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
                                                        tool.wu.heng.viewmodel.MainViewModel.this.resumeDownload(downloadRecord.getId());
                                                        androidx.core.content.ContextCompat.startForegroundService(context4, tool.wu.heng.service.DownloadService.Companion.createIntent(context4, downloadRecord.getId()));
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1(snackbarHostState5, downloadRecord, null), 3, null);
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: DownloadHistoryScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2$1", f = "DownloadHistoryScreen.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2$1, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                            this.$record = downloadRecord;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                java.lang.String title = this.$record.getTitle();
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已恢复: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                            }
                                                            return kotlin.Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel9 = mainViewModel6;
                                                final android.content.Context context5 = context3;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope6 = coroutineScope3;
                                                final androidx.compose.material3.SnackbarHostState snackbarHostState6 = snackbarHostState3;
                                                kotlin.jvm.functions.Function0<kotlin.Unit> function03 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3
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
                                                        tool.wu.heng.viewmodel.MainViewModel.this.retryDownload(downloadRecord.getId());
                                                        androidx.core.content.ContextCompat.startForegroundService(context5, tool.wu.heng.service.DownloadService.Companion.createIntent(context5, downloadRecord.getId()));
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1(snackbarHostState6, downloadRecord, null), 3, null);
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: DownloadHistoryScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3$1", f = "DownloadHistoryScreen.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3$1, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                            this.$record = downloadRecord;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                java.lang.String title = this.$record.getTitle();
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "正在重试: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                            }
                                                            return kotlin.Unit.INSTANCE;
                                                        }
                                                    }
                                                };
                                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel10 = mainViewModel6;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope7 = coroutineScope3;
                                                final androidx.compose.material3.SnackbarHostState snackbarHostState7 = snackbarHostState3;
                                                tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadRecordCard(downloadRecord, function0, function02, function03, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4
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

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: DownloadHistoryScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4$1", f = "DownloadHistoryScreen.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4$1, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                            this.$record = downloadRecord;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                java.lang.String title = this.$record.getTitle();
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已删除: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                    return coroutine_suspended;
                                                                }
                                                            } else {
                                                                if (i != 1) {
                                                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                }
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                            }
                                                            return kotlin.Unit.INSTANCE;
                                                        }
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2() {
                                                        tool.wu.heng.viewmodel.MainViewModel.this.deleteDownload(downloadRecord.getId());
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope7, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1(snackbarHostState7, downloadRecord, null), 3, null);
                                                    }
                                                }, composer6, ((i9 & 14) >> 3) & 14);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    }
                                }, composer3, 24576, 234);
                                composer3.endReplaceableGroup();
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), startRestartGroup, 805309494, 500);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                mainViewModel3 = mainViewModel2;
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
            final androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getDownloads(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
            startRestartGroup.startReplaceableGroup(773894976);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(rememberCoroutineScope)489@20472L144:Effects.kt#9igjgp");
            startRestartGroup.startReplaceableGroup(-492369756);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.Companion.getEmpty()) {
            }
            startRestartGroup.endReplaceableGroup();
            final kotlinx.coroutines.CoroutineScope coroutineScope2 = ((androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(443175483);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
            }
            final androidx.compose.material3.SnackbarHostState snackbarHostState2 = (androidx.compose.material3.SnackbarHostState) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            final tool.wu.heng.viewmodel.MainViewModel mainViewModel42 = mainViewModel2;
            composer2 = startRestartGroup;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), tool.wu.heng.ui.screens.history.ComposableSingletons$DownloadHistoryScreenKt.INSTANCE.m1403getLambda2$app_release(), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -44875524, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$1
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i5) {
                    if ((i5 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-44875524, i5, -1, "tool.wu.heng.ui.screens.history.DownloadHistoryScreen.<anonymous> (DownloadHistoryScreen.kt:75)");
                    }
                    androidx.compose.material3.SnackbarHostKt.SnackbarHost(snackbarHostState2, (androidx.compose.ui.Modifier) null, (kotlin.jvm.functions.Function3) null, composer3, 6, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }), (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -423253805, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i5) {
                    int i6;
                    java.util.List DownloadHistoryScreen$lambda$0;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 14) == 0) {
                        i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-423253805, i6, -1, "tool.wu.heng.ui.screens.history.DownloadHistoryScreen.<anonymous> (DownloadHistoryScreen.kt:77)");
                        }
                        DownloadHistoryScreen$lambda$0 = tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen$lambda$0(collectAsState2);
                        if (DownloadHistoryScreen$lambda$0.isEmpty()) {
                            composer3.startReplaceableGroup(-1285741062);
                            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default);
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
                            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.DownloadKt.getDownload(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(64)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), composer3, 432, 0);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(16)), composer3, 6);
                            androidx.compose.material3.TextKt.Text--4IGK_g("暂无下载记录", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer3, 6, 0, 65534);
                            androidx.compose.material3.TextKt.Text--4IGK_g("去「添加」页面解析视频链接开始下载", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodyMedium(), composer3, 6, 0, 65530);
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
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(-1285740002);
                            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null);
                            float f = 8;
                            androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-YgX7TsA(androidx.compose.ui.unit.Dp.constructor-impl(16), androidx.compose.ui.unit.Dp.constructor-impl(f));
                            androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f));
                            final androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> state = collectAsState2;
                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel5 = mainViewModel42;
                            final kotlinx.coroutines.CoroutineScope coroutineScope22 = coroutineScope2;
                            final androidx.compose.material3.SnackbarHostState snackbarHostState22 = snackbarHostState2;
                            final android.content.Context context22 = context2;
                            androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(fillMaxSize$default2, (androidx.compose.foundation.lazy.LazyListState) null, paddingValues2, false, vertical, (androidx.compose.ui.Alignment.Horizontal) null, (androidx.compose.foundation.gestures.FlingBehavior) null, false, new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.LazyListScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
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
                                    final java.util.List DownloadHistoryScreen$lambda$02;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                                    DownloadHistoryScreen$lambda$02 = tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen$lambda$0(state);
                                    final kotlin.jvm.functions.Function1 anonymousClass1 = new kotlin.jvm.functions.Function1<tool.wu.heng.data.db.DownloadRecord, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen.2.2.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(tool.wu.heng.data.db.DownloadRecord it) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                            return it.getId();
                                        }
                                    };
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = mainViewModel5;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope22;
                                    final androidx.compose.material3.SnackbarHostState snackbarHostState3 = snackbarHostState22;
                                    final android.content.Context context3 = context22;
                                    final kotlin.jvm.functions.Function1 downloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Void invoke(tool.wu.heng.data.db.DownloadRecord downloadRecord) {
                                            return null;
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                            return invoke((tool.wu.heng.data.db.DownloadRecord) obj);
                                        }
                                    };
                                    LazyColumn.items(DownloadHistoryScreen$lambda$02.size(), anonymousClass1 != null ? new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final java.lang.Object invoke(int i7) {
                                            return kotlin.jvm.functions.Function1.this.invoke(DownloadHistoryScreen$lambda$02.get(i7));
                                        }
                                    } : null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                            return invoke(num.intValue());
                                        }

                                        public final java.lang.Object invoke(int i7) {
                                            return kotlin.jvm.functions.Function1.this.invoke(DownloadHistoryScreen$lambda$02.get(i7));
                                        }
                                    }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-632812321, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$invoke$$inlined$items$default$4
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer6, java.lang.Integer num2) {
                                            invoke(lazyItemScope, num.intValue(), composer6, num2.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i7, androidx.compose.runtime.Composer composer6, int i8) {
                                            int i9;
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer6, "C148@6730L22:LazyDsl.kt#428nma");
                                            if ((i8 & 14) == 0) {
                                                i9 = (composer6.changed(lazyItemScope) ? 4 : 2) | i8;
                                            } else {
                                                i9 = i8;
                                            }
                                            if ((i8 & 112) == 0) {
                                                i9 |= composer6.changed(i7) ? 32 : 16;
                                            }
                                            if ((i9 & 731) == 146 && composer6.getSkipping()) {
                                                composer6.skipToGroupEnd();
                                                return;
                                            }
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-632812321, i9, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                                            }
                                            final tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) DownloadHistoryScreen$lambda$02.get(i7);
                                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel6;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                            final androidx.compose.material3.SnackbarHostState snackbarHostState4 = snackbarHostState3;
                                            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1
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

                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* compiled from: DownloadHistoryScreen.kt */
                                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1$1", f = "DownloadHistoryScreen.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1$1, reason: invalid class name */
                                                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                    final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$snackbarHostState = snackbarHostState;
                                                        this.$record = downloadRecord;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                            java.lang.String title = this.$record.getTitle();
                                                            this.label = 1;
                                                            if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已暂停: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    tool.wu.heng.viewmodel.MainViewModel.this.pauseDownload(downloadRecord.getId());
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$1.AnonymousClass1(snackbarHostState4, downloadRecord, null), 3, null);
                                                }
                                            };
                                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = mainViewModel6;
                                            final android.content.Context context4 = context3;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope5 = coroutineScope3;
                                            final androidx.compose.material3.SnackbarHostState snackbarHostState5 = snackbarHostState3;
                                            kotlin.jvm.functions.Function0<kotlin.Unit> function02 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2
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
                                                    tool.wu.heng.viewmodel.MainViewModel.this.resumeDownload(downloadRecord.getId());
                                                    androidx.core.content.ContextCompat.startForegroundService(context4, tool.wu.heng.service.DownloadService.Companion.createIntent(context4, downloadRecord.getId()));
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope5, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1(snackbarHostState5, downloadRecord, null), 3, null);
                                                }

                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* compiled from: DownloadHistoryScreen.kt */
                                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2$1", f = "DownloadHistoryScreen.kt", i = {}, l = {127}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2$1, reason: invalid class name */
                                                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                    final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$snackbarHostState = snackbarHostState;
                                                        this.$record = downloadRecord;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$2.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                            java.lang.String title = this.$record.getTitle();
                                                            this.label = 1;
                                                            if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已恢复: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel9 = mainViewModel6;
                                            final android.content.Context context5 = context3;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope6 = coroutineScope3;
                                            final androidx.compose.material3.SnackbarHostState snackbarHostState6 = snackbarHostState3;
                                            kotlin.jvm.functions.Function0<kotlin.Unit> function03 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3
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
                                                    tool.wu.heng.viewmodel.MainViewModel.this.retryDownload(downloadRecord.getId());
                                                    androidx.core.content.ContextCompat.startForegroundService(context5, tool.wu.heng.service.DownloadService.Companion.createIntent(context5, downloadRecord.getId()));
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope6, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1(snackbarHostState6, downloadRecord, null), 3, null);
                                                }

                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* compiled from: DownloadHistoryScreen.kt */
                                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3$1", f = "DownloadHistoryScreen.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3$1, reason: invalid class name */
                                                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                    final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$snackbarHostState = snackbarHostState;
                                                        this.$record = downloadRecord;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$3.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                            java.lang.String title = this.$record.getTitle();
                                                            this.label = 1;
                                                            if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "正在重试: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }
                                            };
                                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel10 = mainViewModel6;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope7 = coroutineScope3;
                                            final androidx.compose.material3.SnackbarHostState snackbarHostState7 = snackbarHostState3;
                                            tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadRecordCard(downloadRecord, function0, function02, function03, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4
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

                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* compiled from: DownloadHistoryScreen.kt */
                                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4$1", f = "DownloadHistoryScreen.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4$1, reason: invalid class name */
                                                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ tool.wu.heng.data.db.DownloadRecord $record;
                                                    final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.db.DownloadRecord downloadRecord, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$snackbarHostState = snackbarHostState;
                                                        this.$record = downloadRecord;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1(this.$snackbarHostState, this.$record, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                            java.lang.String title = this.$record.getTitle();
                                                            this.label = 1;
                                                            if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已删除: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                        } else {
                                                            if (i != 1) {
                                                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                            }
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                        }
                                                        return kotlin.Unit.INSTANCE;
                                                    }
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2() {
                                                    tool.wu.heng.viewmodel.MainViewModel.this.deleteDownload(downloadRecord.getId());
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope7, null, null, new tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$2$2$2$4.AnonymousClass1(snackbarHostState7, downloadRecord, null), 3, null);
                                                }
                                            }, composer6, ((i9 & 14) >> 3) & 14);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }));
                                }
                            }, composer3, 24576, 234);
                            composer3.endReplaceableGroup();
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), startRestartGroup, 805309494, 500);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            mainViewModel3 = mainViewModel2;
        } else {
            startRestartGroup.skipToGroupEnd();
            mainViewModel3 = mainViewModel;
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadHistoryScreen$3
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

                public final void invoke(androidx.compose.runtime.Composer composer3, int i5) {
                    tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen(tool.wu.heng.viewmodel.MainViewModel.this, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    public static final void DownloadRecordCard(final tool.wu.heng.data.db.DownloadRecord record, final kotlin.jvm.functions.Function0<kotlin.Unit> onPause, final kotlin.jvm.functions.Function0<kotlin.Unit> onResume, final kotlin.jvm.functions.Function0<kotlin.Unit> onRetry, final kotlin.jvm.functions.Function0<kotlin.Unit> onDelete, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        long j;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onPause, "onPause");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResume, "onResume");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onRetry, "onRetry");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDelete, "onDelete");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(388307765);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(record) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onPause) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onResume) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(onRetry) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onDelete) ? okhttp3.internal.http2.Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((46811 & i2) != 9362 || !startRestartGroup.getSkipping()) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(388307765, i2, -1, "tool.wu.heng.ui.screens.history.DownloadRecordCard (DownloadHistoryScreen.kt:160)");
            }
            final boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(record.getStatus(), "DOWNLOADING");
            final boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(record.getStatus(), "FAILED");
            final boolean areEqual3 = kotlin.jvm.internal.Intrinsics.areEqual(record.getStatus(), "PAUSED");
            final boolean areEqual4 = kotlin.jvm.internal.Intrinsics.areEqual(record.getStatus(), "PENDING");
            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
            androidx.compose.material3.CardDefaults cardDefaults = androidx.compose.material3.CardDefaults.INSTANCE;
            if (areEqual2) {
                startRestartGroup.startReplaceableGroup(422084929);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getErrorContainer-0d7_KjU();
                startRestartGroup.endReplaceableGroup();
            } else {
                startRestartGroup.startReplaceableGroup(422084987);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getSurface-0d7_KjU();
                startRestartGroup.endReplaceableGroup();
            }
            composer2 = startRestartGroup;
            androidx.compose.material3.CardKt.Card(fillMaxWidth$default, (androidx.compose.ui.graphics.Shape) null, cardDefaults.cardColors-ro_MJ88(j, 0L, 0L, 0L, startRestartGroup, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer2, -363759485, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadRecordCard$1
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
                            androidx.compose.runtime.ComposerKt.traceEventStart(-363759485, i3, -1, "tool.wu.heng.ui.screens.history.DownloadRecordCard.<anonymous> (DownloadHistoryScreen.kt:173)");
                        }
                        float f = 12;
                        androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f));
                        androidx.compose.ui.Alignment.Vertical top = androidx.compose.ui.Alignment.Companion.getTop();
                        tool.wu.heng.data.db.DownloadRecord downloadRecord = tool.wu.heng.data.db.DownloadRecord.this;
                        boolean z = areEqual;
                        boolean z2 = areEqual3;
                        boolean z3 = areEqual2;
                        boolean z4 = areEqual4;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onPause;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function02 = onResume;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function03 = onRetry;
                        kotlin.jvm.functions.Function0<kotlin.Unit> function04 = onDelete;
                        composer3.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), top, composer3, 48);
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
                        androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        float f2 = 80;
                        tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(downloadRecord.getThumbnailUrl(), androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), androidx.compose.ui.unit.Dp.constructor-impl(f2), z, composer3, 432, 0);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScope, androidx.compose.ui.Modifier.Companion, 1.0f, false, 2, (java.lang.Object) null);
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
                        final tool.wu.heng.data.db.DownloadRecord downloadRecord2 = downloadRecord;
                        androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.getTitle(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getTitleSmall(), composer3, 0, 3120, 55294);
                        float f3 = 4;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer3, 6);
                        androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f));
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                        composer3.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(horizontal, centerVertically, composer3, 54);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer composer6 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                        androidx.compose.runtime.Updater.set-impl(composer6, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                            composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                            composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScope rowScope2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.ui.screens.home.HomeScreenKt.statusLabel(downloadRecord2.getStatus()), (androidx.compose.ui.Modifier) null, tool.wu.heng.ui.screens.home.HomeScreenKt.statusColor(downloadRecord2.getStatus(), composer3, 0), androidx.compose.ui.unit.TextUnitKt.getSp(12), (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.Companion.getMedium(), (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 199680, 0, 131026);
                        androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord2.humanReadableSize(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(12), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 3072, 0, 131058);
                        composer3.startReplaceableGroup(-493011790);
                        if (z) {
                            androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord2.humanReadableSpeed(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(12), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 3072, 0, 131058);
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-493011442);
                        if (z || z2) {
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer3, 6);
                            composer3.startReplaceableGroup(-493011268);
                            boolean changed = composer3.changed(downloadRecord2);
                            java.lang.Object rememberedValue = composer3.rememberedValue();
                            if (changed || rememberedValue == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.Float>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadRecordCard$1$1$1$2$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Float invoke() {
                                        return java.lang.Float.valueOf(tool.wu.heng.data.db.DownloadRecord.this.getProgress() / 100.0f);
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            composer3.endReplaceableGroup();
                            androidx.compose.material3.ProgressIndicatorKt.LinearProgressIndicator-_5eSR-E((kotlin.jvm.functions.Function0) rememberedValue, androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), 0L, 0L, 0, composer3, 48, 28);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer3, 6);
                            downloadRecord2 = downloadRecord2;
                            androidx.compose.material3.TextKt.Text--4IGK_g(((int) downloadRecord2.getProgress()) + "%", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(12), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 3072, 0, 131058);
                        }
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(-493010812);
                        if (z3 && downloadRecord2.getErrorMessage() != null) {
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer3, 6);
                            androidx.compose.material3.TextKt.Text--4IGK_g("错误: " + downloadRecord2.getErrorMessage(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(12), (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 2, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 3072, 3120, 120818);
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.ui.Modifier fillMaxWidth$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                        androidx.compose.foundation.layout.Arrangement.Horizontal end = androidx.compose.foundation.layout.Arrangement.INSTANCE.getEnd();
                        composer3.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy3 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(end, androidx.compose.ui.Alignment.Companion.getTop(), composer3, 6);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default3);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor4);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer composer7 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                        androidx.compose.runtime.Updater.set-impl(composer7, rowMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer7, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                            composer7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                            composer7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                        }
                        modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScope rowScope3 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        if (z || z4) {
                            composer3.startReplaceableGroup(1855685071);
                            androidx.compose.material3.IconButtonKt.IconButton(function0, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.history.ComposableSingletons$DownloadHistoryScreenKt.INSTANCE.m1404getLambda3$app_release(), composer3, 196608, 30);
                            composer3.endReplaceableGroup();
                        } else if (z2) {
                            composer3.startReplaceableGroup(1855685454);
                            androidx.compose.material3.IconButtonKt.IconButton(function02, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.history.ComposableSingletons$DownloadHistoryScreenKt.INSTANCE.m1405getLambda4$app_release(), composer3, 196608, 30);
                            composer3.endReplaceableGroup();
                        } else if (z3) {
                            composer3.startReplaceableGroup(1855685833);
                            androidx.compose.material3.IconButtonKt.IconButton(function03, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.history.ComposableSingletons$DownloadHistoryScreenKt.INSTANCE.m1406getLambda5$app_release(), composer3, 196608, 30);
                            composer3.endReplaceableGroup();
                        } else {
                            composer3.startReplaceableGroup(1855686189);
                            composer3.endReplaceableGroup();
                        }
                        androidx.compose.material3.IconButtonKt.IconButton(function04, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.history.ComposableSingletons$DownloadHistoryScreenKt.INSTANCE.m1407getLambda6$app_release(), composer3, 196608, 30);
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
            }), composer2, 196614, 26);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt$DownloadRecordCard$2
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
                    tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadRecordCard(tool.wu.heng.data.db.DownloadRecord.this, onPause, onResume, onRetry, onDelete, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<tool.wu.heng.data.db.DownloadRecord> DownloadHistoryScreen$lambda$0(androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> state) {
        return (java.util.List) state.getValue();
    }
}
