package tool.wu.heng.ui.screens.home;

/* compiled from: HomeScreen.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a/\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u0010\u001a\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0014\u001a\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0018X\u008a\u0084\u0002"}, d2 = {"HomeScreen", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onNavigateToAddUrl", "Lkotlin/Function0;", "onNavigateToDetails", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "viewModel", "Ltool/wu/heng/viewmodel/MainViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ltool/wu/heng/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "VideoGridCard", "record", "Ltool/wu/heng/data/db/DownloadRecord;", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "(Ltool/wu/heng/data/db/DownloadRecord;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "statusColor", "Landroidx/compose/ui/graphics/Color;", "status", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)J", "statusLabel", "app_release", "downloads", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class HomeScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HomeScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateToAddUrl, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToDetails, tool.wu.heng.viewmodel.MainViewModel mainViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras creationExtras;
        tool.wu.heng.viewmodel.MainViewModel mainViewModel2;
        androidx.compose.runtime.Composer composer2;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateToAddUrl, "onNavigateToAddUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateToDetails, "onNavigateToDetails");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1305119280);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changedInstance(onNavigateToAddUrl) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onNavigateToDetails) ? 32 : 16;
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(1305119280, i5, -1, "tool.wu.heng.ui.screens.home.HomeScreen (HomeScreen.kt:53)");
                }
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getDownloads(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1409getLambda2$app_release = tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.INSTANCE.m1409getLambda2$app_release();
                kotlin.jvm.functions.Function3 composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 706001599, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1
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

                    public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i6) {
                        int i7;
                        java.util.List HomeScreen$lambda$0;
                        java.util.List HomeScreen$lambda$02;
                        java.util.List HomeScreen$lambda$03;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 14) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 91) != 18 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(706001599, i7, -1, "tool.wu.heng.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:64)");
                            }
                            float f = 16;
                            androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f), 0.0f, 2, (java.lang.Object) null);
                            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onNavigateToAddUrl;
                            final androidx.compose.runtime.State<java.util.List<tool.wu.heng.data.db.DownloadRecord>> state = collectAsState;
                            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = onNavigateToDetails;
                            composer3.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer3, 0);
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
                            androidx.compose.runtime.Updater.set-impl(composer4, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            float f2 = 4;
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), false, (java.lang.String) null, (androidx.compose.ui.semantics.Role) null, function0, 7, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, composer3, androidx.compose.material3.CardDefaults.$stable << 12, 14), androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(f2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.INSTANCE.m1410getLambda3$app_release(), composer3, 196608, 18);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(24)), composer3, 6);
                            androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                            androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                            composer3.startReplaceableGroup(693286680);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                            androidx.compose.runtime.Updater.set-impl(composer5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                            androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                            androidx.compose.material3.TextKt.Text--4IGK_g("最近下载", (androidx.compose.ui.Modifier) null, 0L, androidx.compose.ui.unit.TextUnitKt.getSp(20), (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 199686, 0, 131030);
                            composer3.startReplaceableGroup(-2144914543);
                            HomeScreen$lambda$0 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                            if (!HomeScreen$lambda$0.isEmpty()) {
                                HomeScreen$lambda$03 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                                androidx.compose.material3.TextKt.Text--4IGK_g("共 " + HomeScreen$lambda$03.size() + " 个", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                            }
                            composer3.endReplaceableGroup();
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endReplaceableGroup();
                            composer3.endNode();
                            composer3.endReplaceableGroup();
                            composer3.endReplaceableGroup();
                            float f3 = 12;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer3, 6);
                            HomeScreen$lambda$02 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                            if (HomeScreen$lambda$02.isEmpty()) {
                                composer3.startReplaceableGroup(-2144914141);
                                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                                composer3.startReplaceableGroup(733328855);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default2);
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
                                androidx.compose.runtime.Updater.set-impl(composer6, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                    composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                    composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                                androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
                                composer3.startReplaceableGroup(-483455358);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                androidx.compose.ui.Modifier modifier2 = androidx.compose.ui.Modifier.Companion;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                                composer3.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
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
                                androidx.compose.runtime.Updater.set-impl(composer7, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer7, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                    composer7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                    composer7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                                composer3.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.VideoLibraryKt.getVideoLibrary(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(64)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), composer3, 432, 0);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer3, 6);
                                androidx.compose.material3.TextKt.Text--4IGK_g("暂无下载记录", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 6, 0, 131066);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), composer3, 6);
                                androidx.compose.material3.TextKt.Text--4IGK_g("点击上方「添加视频链接」开始", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
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
                                composer3.startReplaceableGroup(-2144912988);
                                androidx.compose.foundation.lazy.grid.GridCells fixed = new androidx.compose.foundation.lazy.grid.GridCells.Fixed(2);
                                androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                                androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                                androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.constructor-impl(f), 7, (java.lang.Object) null);
                                androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                androidx.compose.foundation.lazy.grid.GridCells gridCells = fixed;
                                androidx.compose.foundation.layout.Arrangement.Vertical vertical2 = vertical;
                                androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = horizontal;
                                composer3.startReplaceableGroup(-2144912537);
                                boolean changed = composer3.changed(state) | composer3.changedInstance(function1);
                                java.lang.Object rememberedValue = composer3.rememberedValue();
                                if (changed || rememberedValue == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                    rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope) {
                                            invoke2(lazyGridScope);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.foundation.lazy.grid.LazyGridScope LazyVerticalGrid) {
                                            final java.util.List HomeScreen$lambda$04;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                            HomeScreen$lambda$04 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                                            final tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1.AnonymousClass1 anonymousClass1 = new kotlin.jvm.functions.Function1<tool.wu.heng.data.db.DownloadRecord, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1.1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(tool.wu.heng.data.db.DownloadRecord it) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                                    return it.getId();
                                                }
                                            };
                                            final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = function1;
                                            final tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$1 homeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Void invoke(tool.wu.heng.data.db.DownloadRecord downloadRecord) {
                                                    return null;
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                                    return invoke((tool.wu.heng.data.db.DownloadRecord) obj);
                                                }
                                            };
                                            LazyVerticalGrid.items(HomeScreen$lambda$04.size(), anonymousClass1 != null ? new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$2
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                    return invoke(num.intValue());
                                                }

                                                public final java.lang.Object invoke(int i8) {
                                                    return kotlin.jvm.functions.Function1.this.invoke(HomeScreen$lambda$04.get(i8));
                                                }
                                            } : null, (kotlin.jvm.functions.Function2) null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$4
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                    return invoke(num.intValue());
                                                }

                                                public final java.lang.Object invoke(int i8) {
                                                    return kotlin.jvm.functions.Function1.this.invoke(HomeScreen$lambda$04.get(i8));
                                                }
                                            }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(699646206, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(4);
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer8, java.lang.Integer num2) {
                                                    invoke(lazyGridItemScope, num.intValue(), composer8, num2.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, int i8, androidx.compose.runtime.Composer composer8, int i9) {
                                                    int i10;
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer8, "C461@19441L22:LazyGridDsl.kt#7791vq");
                                                    if ((i9 & 14) == 0) {
                                                        i10 = (composer8.changed(lazyGridItemScope) ? 4 : 2) | i9;
                                                    } else {
                                                        i10 = i9;
                                                    }
                                                    if ((i9 & 112) == 0) {
                                                        i10 |= composer8.changed(i8) ? 32 : 16;
                                                    }
                                                    if ((i10 & 731) == 146 && composer8.getSkipping()) {
                                                        composer8.skipToGroupEnd();
                                                        return;
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(699646206, i10, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                                                    }
                                                    int i11 = i10 & 14;
                                                    final tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) HomeScreen$lambda$04.get(i8);
                                                    composer8.startReplaceableGroup(-1824191352);
                                                    boolean changedInstance = composer8.changedInstance(function12) | composer8.changed(downloadRecord);
                                                    java.lang.Object rememberedValue2 = composer8.rememberedValue();
                                                    if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                                        final kotlin.jvm.functions.Function1 function13 = function12;
                                                        rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$2$1$1
                                                            /* JADX INFO: Access modifiers changed from: package-private */
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
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
                                                                function13.invoke(downloadRecord.getId());
                                                            }
                                                        };
                                                        composer8.updateRememberedValue(rememberedValue2);
                                                    }
                                                    composer8.endReplaceableGroup();
                                                    tool.wu.heng.ui.screens.home.HomeScreenKt.VideoGridCard(downloadRecord, null, (kotlin.jvm.functions.Function0) rememberedValue2, composer8, (i11 >> 3) & 14, 2);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    }
                                                }
                                            }));
                                        }
                                    };
                                    composer3.updateRememberedValue(rememberedValue);
                                }
                                composer3.endReplaceableGroup();
                                androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(gridCells, fillMaxSize$default3, (androidx.compose.foundation.lazy.grid.LazyGridState) null, paddingValues2, false, vertical2, horizontal2, (androidx.compose.foundation.gestures.FlingBehavior) null, false, (kotlin.jvm.functions.Function1) rememberedValue, composer3, 1772592, 404);
                                composer3.endReplaceableGroup();
                            }
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
                });
                composer2 = startRestartGroup;
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(fillMaxSize$default, m1409getLambda2$app_release, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, composableLambda, startRestartGroup, 805306422, 508);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                mainViewModel3 = mainViewModel2;
            }
            mainViewModel2 = mainViewModel;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getDownloads(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1409getLambda2$app_release2 = tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.INSTANCE.m1409getLambda2$app_release();
            kotlin.jvm.functions.Function3 composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 706001599, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1
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

                public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i6) {
                    int i7;
                    java.util.List HomeScreen$lambda$0;
                    java.util.List HomeScreen$lambda$02;
                    java.util.List HomeScreen$lambda$03;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 14) == 0) {
                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 91) != 18 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(706001599, i7, -1, "tool.wu.heng.ui.screens.home.HomeScreen.<anonymous> (HomeScreen.kt:64)");
                        }
                        float f = 16;
                        androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f), 0.0f, 2, (java.lang.Object) null);
                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onNavigateToAddUrl;
                        final androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> state = collectAsState2;
                        final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1 = onNavigateToDetails;
                        composer3.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer3, 0);
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
                        androidx.compose.runtime.Updater.set-impl(composer4, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        float f2 = 4;
                        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), false, (java.lang.String) null, (androidx.compose.ui.semantics.Role) null, function0, 7, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, composer3, androidx.compose.material3.CardDefaults.$stable << 12, 14), androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(f2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.INSTANCE.m1410getLambda3$app_release(), composer3, 196608, 18);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(24)), composer3, 6);
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                        androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                        composer3.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                        androidx.compose.runtime.Updater.set-impl(composer5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                            composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        androidx.compose.material3.TextKt.Text--4IGK_g("最近下载", (androidx.compose.ui.Modifier) null, 0L, androidx.compose.ui.unit.TextUnitKt.getSp(20), (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 199686, 0, 131030);
                        composer3.startReplaceableGroup(-2144914543);
                        HomeScreen$lambda$0 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                        if (!HomeScreen$lambda$0.isEmpty()) {
                            HomeScreen$lambda$03 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                            androidx.compose.material3.TextKt.Text--4IGK_g("共 " + HomeScreen$lambda$03.size() + " 个", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                        }
                        composer3.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        float f3 = 12;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer3, 6);
                        HomeScreen$lambda$02 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                        if (HomeScreen$lambda$02.isEmpty()) {
                            composer3.startReplaceableGroup(-2144914141);
                            androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                            androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxSize$default22);
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
                            androidx.compose.runtime.Updater.set-impl(composer6, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            androidx.compose.ui.Alignment.Horizontal centerHorizontally = androidx.compose.ui.Alignment.Companion.getCenterHorizontally();
                            composer3.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            androidx.compose.ui.Modifier modifier2 = androidx.compose.ui.Modifier.Companion;
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
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
                            androidx.compose.runtime.Updater.set-impl(composer7, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer7, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                composer7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                composer7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.VideoLibraryKt.getVideoLibrary(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(64)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), composer3, 432, 0);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer3, 6);
                            androidx.compose.material3.TextKt.Text--4IGK_g("暂无下载记录", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer3, 6, 0, 131066);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), composer3, 6);
                            androidx.compose.material3.TextKt.Text--4IGK_g("点击上方「添加视频链接」开始", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65530);
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
                            composer3.startReplaceableGroup(-2144912988);
                            androidx.compose.foundation.lazy.grid.GridCells fixed = new androidx.compose.foundation.lazy.grid.GridCells.Fixed(2);
                            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                            androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                            androidx.compose.foundation.layout.PaddingValues paddingValues2 = androidx.compose.foundation.layout.PaddingKt.PaddingValues-a9UjIt4$default(0.0f, 0.0f, 0.0f, androidx.compose.ui.unit.Dp.constructor-impl(f), 7, (java.lang.Object) null);
                            androidx.compose.ui.Modifier fillMaxSize$default3 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                            androidx.compose.foundation.lazy.grid.GridCells gridCells = fixed;
                            androidx.compose.foundation.layout.Arrangement.Vertical vertical2 = vertical;
                            androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = horizontal;
                            composer3.startReplaceableGroup(-2144912537);
                            boolean changed = composer3.changed(state) | composer3.changedInstance(function1);
                            java.lang.Object rememberedValue = composer3.rememberedValue();
                            if (changed || rememberedValue == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                rememberedValue = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<androidx.compose.foundation.lazy.grid.LazyGridScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridScope lazyGridScope) {
                                        invoke2(lazyGridScope);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.compose.foundation.lazy.grid.LazyGridScope LazyVerticalGrid) {
                                        final java.util.List HomeScreen$lambda$04;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                                        HomeScreen$lambda$04 = tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen$lambda$0(state);
                                        final kotlin.jvm.functions.Function1 anonymousClass1 = new kotlin.jvm.functions.Function1<tool.wu.heng.data.db.DownloadRecord, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1.1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(tool.wu.heng.data.db.DownloadRecord it) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                                return it.getId();
                                            }
                                        };
                                        final kotlin.jvm.functions.Function1 function12 = function1;
                                        final kotlin.jvm.functions.Function1 homeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Void invoke(tool.wu.heng.data.db.DownloadRecord downloadRecord) {
                                                return null;
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                                                return invoke((tool.wu.heng.data.db.DownloadRecord) obj);
                                            }
                                        };
                                        LazyVerticalGrid.items(HomeScreen$lambda$04.size(), anonymousClass1 != null ? new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final java.lang.Object invoke(int i8) {
                                                return kotlin.jvm.functions.Function1.this.invoke(HomeScreen$lambda$04.get(i8));
                                            }
                                        } : null, (kotlin.jvm.functions.Function2) null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$4
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                                                return invoke(num.intValue());
                                            }

                                            public final java.lang.Object invoke(int i8) {
                                                return kotlin.jvm.functions.Function1.this.invoke(HomeScreen$lambda$04.get(i8));
                                            }
                                        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(699646206, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.grid.LazyGridItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$invoke$$inlined$items$default$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(4);
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer8, java.lang.Integer num2) {
                                                invoke(lazyGridItemScope, num.intValue(), composer8, num2.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.foundation.lazy.grid.LazyGridItemScope lazyGridItemScope, int i8, androidx.compose.runtime.Composer composer8, int i9) {
                                                int i10;
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer8, "C461@19441L22:LazyGridDsl.kt#7791vq");
                                                if ((i9 & 14) == 0) {
                                                    i10 = (composer8.changed(lazyGridItemScope) ? 4 : 2) | i9;
                                                } else {
                                                    i10 = i9;
                                                }
                                                if ((i9 & 112) == 0) {
                                                    i10 |= composer8.changed(i8) ? 32 : 16;
                                                }
                                                if ((i10 & 731) == 146 && composer8.getSkipping()) {
                                                    composer8.skipToGroupEnd();
                                                    return;
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(699646206, i10, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:461)");
                                                }
                                                int i11 = i10 & 14;
                                                final tool.wu.heng.data.db.DownloadRecord downloadRecord = (tool.wu.heng.data.db.DownloadRecord) HomeScreen$lambda$04.get(i8);
                                                composer8.startReplaceableGroup(-1824191352);
                                                boolean changedInstance = composer8.changedInstance(function12) | composer8.changed(downloadRecord);
                                                java.lang.Object rememberedValue2 = composer8.rememberedValue();
                                                if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13 = function12;
                                                    rememberedValue2 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$1$1$3$1$2$1$1
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
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
                                                            function13.invoke(downloadRecord.getId());
                                                        }
                                                    };
                                                    composer8.updateRememberedValue(rememberedValue2);
                                                }
                                                composer8.endReplaceableGroup();
                                                tool.wu.heng.ui.screens.home.HomeScreenKt.VideoGridCard(downloadRecord, null, (kotlin.jvm.functions.Function0) rememberedValue2, composer8, (i11 >> 3) & 14, 2);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            composer3.endReplaceableGroup();
                            androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(gridCells, fillMaxSize$default3, (androidx.compose.foundation.lazy.grid.LazyGridState) null, paddingValues2, false, vertical2, horizontal2, (androidx.compose.foundation.gestures.FlingBehavior) null, false, (kotlin.jvm.functions.Function1) rememberedValue, composer3, 1772592, 404);
                            composer3.endReplaceableGroup();
                        }
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
            });
            composer2 = startRestartGroup;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(fillMaxSize$default2, m1409getLambda2$app_release2, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, composableLambda2, startRestartGroup, 805306422, 508);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$HomeScreen$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer3, java.lang.Integer num) {
                    invoke(composer3, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.runtime.Composer composer3, int i6) {
                    tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen(onNavigateToAddUrl, onNavigateToDetails, mainViewModel3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VideoGridCard(final tool.wu.heng.data.db.DownloadRecord record, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(record, "record");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1799910348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(record) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                function02 = function0;
                i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    modifier3 = i5 != 0 ? (androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion : modifier2;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function04 = i4 != 0 ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$VideoGridCard$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            invoke2();
                            return kotlin.Unit.INSTANCE;
                        }
                    } : function02;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1799910348, i3, -1, "tool.wu.heng.ui.screens.home.VideoGridCard (HomeScreen.kt:188)");
                    }
                    androidx.compose.material3.CardKt.Card(androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(modifier3, 0.75f, false, 2, (java.lang.Object) null), false, (java.lang.String) null, (androidx.compose.ui.semantics.Role) null, function04, 7, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1714040958, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$VideoGridCard$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer2, int i6) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i6 & 81) != 16 || !composer2.getSkipping()) {
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1714040958, i6, -1, "tool.wu.heng.ui.screens.home.VideoGridCard.<anonymous> (HomeScreen.kt:195)");
                                }
                                float f = 8;
                                androidx.compose.ui.Modifier modifier4 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f));
                                tool.wu.heng.data.db.DownloadRecord downloadRecord = tool.wu.heng.data.db.DownloadRecord.this;
                                composer2.startReplaceableGroup(-483455358);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier4);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer composer3 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                                androidx.compose.runtime.Updater.set-impl(composer3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer3, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                    composer3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                    composer3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(downloadRecord.getThumbnailUrl(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(120), kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord.getStatus(), "DOWNLOADING"), composer2, 432, 0);
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer2, 6);
                                composer2.startReplaceableGroup(-483455358);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.Companion;
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier5);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor2);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer composer4 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                                androidx.compose.runtime.Updater.set-impl(composer4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                    composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                    composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.getTitle(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getBodyMedium(), composer2, 0, 3120, 55294);
                                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                                composer2.startReplaceableGroup(693286680);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.Companion.getTop(), composer2, 6);
                                composer2.startReplaceableGroup(-1323940314);
                                androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor3);
                                } else {
                                    composer2.useNode();
                                }
                                androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                                androidx.compose.runtime.Updater.set-impl(composer5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                    composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                    composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                                composer2.startReplaceableGroup(2058660585);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.ui.screens.home.HomeScreenKt.statusLabel(downloadRecord.getStatus()), (androidx.compose.ui.Modifier) null, tool.wu.heng.ui.screens.home.HomeScreenKt.statusColor(downloadRecord.getStatus(), composer2, 0), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                                androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.humanReadableSize(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer2, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceableGroup();
                                composer2.endNode();
                                composer2.endReplaceableGroup();
                                composer2.endReplaceableGroup();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer2.skipToGroupEnd();
                        }
                    }), startRestartGroup, 196608, 22);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function03 = function04;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function03 = function02;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$VideoGridCard$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                            invoke(composer2, num.intValue());
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void invoke(androidx.compose.runtime.Composer composer2, int i6) {
                            tool.wu.heng.ui.screens.home.HomeScreenKt.VideoGridCard(tool.wu.heng.data.db.DownloadRecord.this, modifier4, function03, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            function02 = function0;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(modifier3, 0.75f, false, 2, (java.lang.Object) null), false, (java.lang.String) null, (androidx.compose.ui.semantics.Role) null, function04, 7, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1714040958, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$VideoGridCard$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return kotlin.Unit.INSTANCE;
                }

                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer2, int i6) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i6 & 81) != 16 || !composer2.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1714040958, i6, -1, "tool.wu.heng.ui.screens.home.VideoGridCard.<anonymous> (HomeScreen.kt:195)");
                        }
                        float f = 8;
                        androidx.compose.ui.Modifier modifier42 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f));
                        tool.wu.heng.data.db.DownloadRecord downloadRecord = tool.wu.heng.data.db.DownloadRecord.this;
                        composer2.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier42);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer composer3 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                        androidx.compose.runtime.Updater.set-impl(composer3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer3, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composer3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composer3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(downloadRecord.getThumbnailUrl(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(120), kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord.getStatus(), "DOWNLOADING"), composer2, 432, 0);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer2, 6);
                        composer2.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.Companion;
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier5);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer composer4 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                        androidx.compose.runtime.Updater.set-impl(composer4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                            composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.getTitle(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getBodyMedium(), composer2, 0, 3120, 55294);
                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                        androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                        composer2.startReplaceableGroup(693286680);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.Companion.getTop(), composer2, 6);
                        composer2.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor3);
                        } else {
                            composer2.useNode();
                        }
                        androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                        androidx.compose.runtime.Updater.set-impl(composer5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                            composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                            composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                        androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.ui.screens.home.HomeScreenKt.statusLabel(downloadRecord.getStatus()), (androidx.compose.ui.Modifier) null, tool.wu.heng.ui.screens.home.HomeScreenKt.statusColor(downloadRecord.getStatus(), composer2, 0), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                        androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.humanReadableSize(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer2, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), startRestartGroup, 196608, 22);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            function03 = function04;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function02 = function0;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.ClickableKt.clickable-XHw0xAI$default(androidx.compose.foundation.layout.AspectRatioKt.aspectRatio$default(modifier3, 0.75f, false, 2, (java.lang.Object) null), false, (java.lang.String) null, (androidx.compose.ui.semantics.Role) null, function04, 7, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1714040958, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.HomeScreenKt$VideoGridCard$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer2, int i6) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i6 & 81) != 16 || !composer2.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1714040958, i6, -1, "tool.wu.heng.ui.screens.home.VideoGridCard.<anonymous> (HomeScreen.kt:195)");
                    }
                    float f = 8;
                    androidx.compose.ui.Modifier modifier42 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f));
                    tool.wu.heng.data.db.DownloadRecord downloadRecord = tool.wu.heng.data.db.DownloadRecord.this;
                    composer2.startReplaceableGroup(-483455358);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier42);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer composer3 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                    androidx.compose.runtime.Updater.set-impl(composer3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.set-impl(composer3, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                        composer3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                        composer3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(downloadRecord.getThumbnailUrl(), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(120), kotlin.jvm.internal.Intrinsics.areEqual(downloadRecord.getStatus(), "DOWNLOADING"), composer2, 432, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer2, 6);
                    composer2.startReplaceableGroup(-483455358);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    androidx.compose.ui.Modifier modifier5 = androidx.compose.ui.Modifier.Companion;
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier5);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer composer4 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                    androidx.compose.runtime.Updater.set-impl(composer4, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                    androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.getTitle(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getBodyMedium(), composer2, 0, 3120, 55294);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                    androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                    composer2.startReplaceableGroup(693286680);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, androidx.compose.ui.Alignment.Companion.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer2);
                    androidx.compose.runtime.Updater.set-impl(composer5, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                        composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                        composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.ui.screens.home.HomeScreenKt.statusLabel(downloadRecord.getStatus()), (androidx.compose.ui.Modifier) null, tool.wu.heng.ui.screens.home.HomeScreenKt.statusColor(downloadRecord.getStatus(), composer2, 0), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                    androidx.compose.material3.TextKt.Text--4IGK_g(downloadRecord.humanReadableSize(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer2, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getLabelSmall(), composer2, 0, 0, 65530);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), startRestartGroup, 196608, 22);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        function03 = function04;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.String statusLabel(java.lang.String status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        switch (status.hashCode()) {
            case -1941992146:
                return !status.equals("PAUSED") ? "未知" : "已暂停";
            case -1031784143:
                if (status.equals("CANCELLED")) {
                    return "已取消";
                }
                break;
            case 35394935:
                if (status.equals("PENDING")) {
                    return "等待中";
                }
                break;
            case 941831738:
                if (status.equals("DOWNLOADING")) {
                    return "下载中";
                }
                break;
            case 1383663147:
                if (status.equals("COMPLETED")) {
                    return "已完成";
                }
                break;
            case 2066319421:
                if (status.equals("FAILED")) {
                    return "失败";
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final long statusColor(java.lang.String status, androidx.compose.runtime.Composer composer, int i) {
        long j;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
        composer.startReplaceableGroup(777443752);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(777443752, i, -1, "tool.wu.heng.ui.screens.home.statusColor (HomeScreen.kt:255)");
        }
        switch (status.hashCode()) {
            case -1941992146:
                if (status.equals("PAUSED")) {
                    composer.startReplaceableGroup(172108075);
                    j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getTertiary-0d7_KjU();
                    composer.endReplaceableGroup();
                    break;
                }
                composer.startReplaceableGroup(172108126);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                composer.endReplaceableGroup();
                break;
            case 941831738:
                if (status.equals("DOWNLOADING")) {
                    composer.startReplaceableGroup(172107845);
                    j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getPrimary-0d7_KjU();
                    composer.endReplaceableGroup();
                    break;
                }
                composer.startReplaceableGroup(172108126);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                composer.endReplaceableGroup();
                break;
            case 1383663147:
                if (status.equals("COMPLETED")) {
                    composer.startReplaceableGroup(172107923);
                    composer.endReplaceableGroup();
                    j = androidx.compose.ui.graphics.ColorKt.Color(4281236786L);
                    break;
                }
                composer.startReplaceableGroup(172108126);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                composer.endReplaceableGroup();
                break;
            case 2066319421:
                if (status.equals("FAILED")) {
                    composer.startReplaceableGroup(172108005);
                    j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getError-0d7_KjU();
                    composer.endReplaceableGroup();
                    break;
                }
                composer.startReplaceableGroup(172108126);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                composer.endReplaceableGroup();
                break;
            default:
                composer.startReplaceableGroup(172108126);
                j = androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU();
                composer.endReplaceableGroup();
                break;
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<tool.wu.heng.data.db.DownloadRecord> HomeScreen$lambda$0(androidx.compose.runtime.State<? extends java.util.List<tool.wu.heng.data.db.DownloadRecord>> state) {
        return (java.util.List) state.getValue();
    }
}
