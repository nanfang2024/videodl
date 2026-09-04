package tool.wu.heng.ui.screens.settings;

/* compiled from: SettingsScreen.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"SettingsScreen", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "viewModel", "Ltool/wu/heng/viewmodel/MainViewModel;", "(Ltool/wu/heng/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class SettingsScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SettingsScreen(tool.wu.heng.viewmodel.MainViewModel mainViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.lifecycle.viewmodel.CreationExtras creationExtras;
        tool.wu.heng.viewmodel.MainViewModel mainViewModel2;
        androidx.compose.runtime.Composer composer2;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1445576675);
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1445576675, i4, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen (SettingsScreen.kt:42)");
                }
                final java.util.List<java.lang.String> supportedPlatforms = mainViewModel2.getSupportedPlatforms();
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1413getLambda2$app_release = tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1413getLambda2$app_release();
                kotlin.jvm.functions.Function3 composableLambda = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1116041132, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$1
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

                    public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i5) {
                        int i6;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i5 & 14) == 0) {
                            i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1116041132, i6, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:51)");
                            }
                            float f = 16;
                            androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, (androidx.compose.foundation.gestures.FlingBehavior) null, false, 14, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f), 0.0f, 2, (java.lang.Object) null);
                            final java.util.List<java.lang.String> list = supportedPlatforms;
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
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, composer3, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1414getLambda3$app_release(), composer3, 196614, 26);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1633227053, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                    invoke(columnScope2, composer5, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer5, int i7) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i7 & 81) != 16 || !composer5.getSkipping()) {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1633227053, i7, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:100)");
                                        }
                                        float f2 = 16;
                                        androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2));
                                        java.util.List<java.lang.String> list2 = list;
                                        composer5.startReplaceableGroup(-483455358);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer5, 0);
                                        composer5.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                        int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                        kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                        kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor2);
                                        } else {
                                            composer5.useNode();
                                        }
                                        androidx.compose.runtime.Composer composer6 = androidx.compose.runtime.Updater.constructor-impl(composer5);
                                        androidx.compose.runtime.Updater.set-impl(composer6, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                            composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                            composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer5)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                        androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                        androidx.compose.material3.TextKt.Text--4IGK_g("支持的平台", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer5, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer5, 6, 0, 65534);
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer5, 6);
                                        float f3 = 6;
                                        androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                                        androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                                        composer5.startReplaceableGroup(1098475987);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                        androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.Companion;
                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper = androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementHelper(horizontal, vertical, Integer.MAX_VALUE, composer5, 54);
                                        composer5.startReplaceableGroup(-1323940314);
                                        java.lang.String str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, str);
                                        int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                        kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                        kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor3);
                                        } else {
                                            composer5.useNode();
                                        }
                                        androidx.compose.runtime.Composer composer7 = androidx.compose.runtime.Updater.constructor-impl(composer5);
                                        androidx.compose.runtime.Updater.set-impl(composer7, rowMeasurementHelper, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.set-impl(composer7, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composer7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                            composer7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                            composer7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer5)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                        androidx.compose.foundation.layout.FlowRowScope flowRowScope = androidx.compose.foundation.layout.FlowRowScopeInstance.INSTANCE;
                                        composer5.startReplaceableGroup(1476680696);
                                        for (final java.lang.String str2 : list2) {
                                            androidx.compose.material3.CardKt.Card((androidx.compose.ui.Modifier) null, (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer5, androidx.compose.material3.MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0L, 0L, 0L, composer5, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -605162606, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$1$1$1$1$1$1$1
                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope3, androidx.compose.runtime.Composer composer8, java.lang.Integer num) {
                                                    invoke(columnScope3, composer8, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card2, androidx.compose.runtime.Composer composer8, int i8) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card2, "$this$Card");
                                                    if ((i8 & 81) != 16 || !composer8.getSkipping()) {
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(-605162606, i8, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:116)");
                                                        }
                                                        androidx.compose.ui.text.TextStyle labelMedium = androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer8, androidx.compose.material3.MaterialTheme.$stable).getLabelMedium();
                                                        androidx.compose.material3.TextKt.Text--4IGK_g(str2, androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(10), androidx.compose.ui.unit.Dp.constructor-impl(6)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer8, androidx.compose.material3.MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, labelMedium, composer8, 48, 0, 65528);
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer8.skipToGroupEnd();
                                                }
                                            }), composer5, 196608, 27);
                                            str = str;
                                        }
                                        composer5.endReplaceableGroup();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(10)), composer5, 6);
                                        androidx.compose.ui.Alignment.Vertical top = androidx.compose.ui.Alignment.Companion.getTop();
                                        composer5.startReplaceableGroup(693286680);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        androidx.compose.ui.Modifier modifier4 = androidx.compose.ui.Modifier.Companion;
                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), top, composer5, 48);
                                        composer5.startReplaceableGroup(-1323940314);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer5, str);
                                        int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                        kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                        kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier4);
                                        if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor4);
                                        } else {
                                            composer5.useNode();
                                        }
                                        androidx.compose.runtime.Composer composer8 = androidx.compose.runtime.Updater.constructor-impl(composer5);
                                        androidx.compose.runtime.Updater.set-impl(composer8, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.set-impl(composer8, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composer8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                            composer8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                            composer8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                        }
                                        modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer5)), composer5, 0);
                                        composer5.startReplaceableGroup(2058660585);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                        androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.InfoKt.getInfo(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer5, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer5, 432, 0);
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer5, 6);
                                        androidx.compose.material3.TextKt.Text--4IGK_g("抖音、哔哩哔哩解析稳定；快手已开启验证码风控，免登录经常拿不到地址；小红书仅支持可公开访问的视频笔记。解析失败时会给出具体原因。", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer5, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer5, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer5, 6, 0, 65530);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                        composer5.endReplaceableGroup();
                                        composer5.endNode();
                                        composer5.endReplaceableGroup();
                                        composer5.endReplaceableGroup();
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer5.skipToGroupEnd();
                                }
                            }), composer3, 196614, 30);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1415getLambda4$app_release(), composer3, 196614, 30);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1416getLambda5$app_release(), composer3, 196614, 30);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), composer3, 6);
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
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(fillMaxSize$default, m1413getLambda2$app_release, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, composableLambda, startRestartGroup, 805306422, 508);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                mainViewModel3 = mainViewModel2;
            }
            mainViewModel2 = mainViewModel;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final java.util.List<java.lang.String> supportedPlatforms2 = mainViewModel2.getSupportedPlatforms();
            androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1413getLambda2$app_release2 = tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1413getLambda2$app_release();
            kotlin.jvm.functions.Function3 composableLambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1116041132, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$1
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

                public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i5) {
                    int i6;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i5 & 14) == 0) {
                        i6 = i5 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1116041132, i6, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:51)");
                        }
                        float f = 16;
                        androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, (androidx.compose.foundation.gestures.FlingBehavior) null, false, 14, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f), 0.0f, 2, (java.lang.Object) null);
                        final java.util.List<java.lang.String> list = supportedPlatforms2;
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
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getPrimaryContainer-0d7_KjU(), 0L, 0L, 0L, composer3, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1414getLambda3$app_release(), composer3, 196614, 26);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1633227053, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                invoke(columnScope2, composer5, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer5, int i7) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                if ((i7 & 81) != 16 || !composer5.getSkipping()) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1633227053, i7, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:100)");
                                    }
                                    float f2 = 16;
                                    androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2));
                                    java.util.List<java.lang.String> list2 = list;
                                    composer5.startReplaceableGroup(-483455358);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer5, 0);
                                    composer5.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                    kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    androidx.compose.runtime.Composer composer6 = androidx.compose.runtime.Updater.constructor-impl(composer5);
                                    androidx.compose.runtime.Updater.set-impl(composer6, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                        composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                        composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                                    androidx.compose.foundation.layout.ColumnScope columnScope2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                    androidx.compose.material3.TextKt.Text--4IGK_g("支持的平台", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer5, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer5, 6, 0, 65534);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer5, 6);
                                    float f3 = 6;
                                    androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                                    androidx.compose.foundation.layout.Arrangement.Vertical vertical = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f3));
                                    composer5.startReplaceableGroup(1098475987);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(FlowRow)P(3,1,4,2)66@2954L113,71@3072L134:FlowLayout.kt#2w3rfo");
                                    androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.Companion;
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurementHelper = androidx.compose.foundation.layout.FlowLayoutKt.rowMeasurementHelper(horizontal, vertical, Integer.MAX_VALUE, composer5, 54);
                                    composer5.startReplaceableGroup(-1323940314);
                                    java.lang.String str = "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh";
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, str);
                                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                    kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    androidx.compose.runtime.Composer composer7 = androidx.compose.runtime.Updater.constructor-impl(composer5);
                                    androidx.compose.runtime.Updater.set-impl(composer7, rowMeasurementHelper, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.set-impl(composer7, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer7.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer7.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                        composer7.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                        composer7.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, 483375643, "C72@3121L9:FlowLayout.kt#2w3rfo");
                                    androidx.compose.foundation.layout.FlowRowScope flowRowScope = androidx.compose.foundation.layout.FlowRowScopeInstance.INSTANCE;
                                    composer5.startReplaceableGroup(1476680696);
                                    for (final java.lang.String str2 : list2) {
                                        androidx.compose.material3.CardKt.Card((androidx.compose.ui.Modifier) null, (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer5, androidx.compose.material3.MaterialTheme.$stable).getSecondaryContainer-0d7_KjU(), 0L, 0L, 0L, composer5, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer5, -605162606, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$1$1$1$1$1$1$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope3, androidx.compose.runtime.Composer composer8, java.lang.Integer num) {
                                                invoke(columnScope3, composer8, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.foundation.layout.ColumnScope Card2, androidx.compose.runtime.Composer composer8, int i8) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card2, "$this$Card");
                                                if ((i8 & 81) != 16 || !composer8.getSkipping()) {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-605162606, i8, -1, "tool.wu.heng.ui.screens.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:116)");
                                                    }
                                                    androidx.compose.ui.text.TextStyle labelMedium = androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer8, androidx.compose.material3.MaterialTheme.$stable).getLabelMedium();
                                                    androidx.compose.material3.TextKt.Text--4IGK_g(str2, androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(10), androidx.compose.ui.unit.Dp.constructor-impl(6)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer8, androidx.compose.material3.MaterialTheme.$stable).getOnSecondaryContainer-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, labelMedium, composer8, 48, 0, 65528);
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer8.skipToGroupEnd();
                                            }
                                        }), composer5, 196608, 27);
                                        str = str;
                                    }
                                    composer5.endReplaceableGroup();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(10)), composer5, 6);
                                    androidx.compose.ui.Alignment.Vertical top = androidx.compose.ui.Alignment.Companion.getTop();
                                    composer5.startReplaceableGroup(693286680);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                    androidx.compose.ui.Modifier modifier4 = androidx.compose.ui.Modifier.Companion;
                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), top, composer5, 48);
                                    composer5.startReplaceableGroup(-1323940314);
                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer5, str);
                                    int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer5, 0);
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                    kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                    kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier4);
                                    if (!(composer5.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer5.useNode();
                                    }
                                    androidx.compose.runtime.Composer composer8 = androidx.compose.runtime.Updater.constructor-impl(composer5);
                                    androidx.compose.runtime.Updater.set-impl(composer8, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.set-impl(composer8, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                    kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                    if (composer8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                        composer8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                        composer8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer5)), composer5, 0);
                                    composer5.startReplaceableGroup(2058660585);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer5, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                    androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                    androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.InfoKt.getInfo(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer5, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), composer5, 432, 0);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f3)), composer5, 6);
                                    androidx.compose.material3.TextKt.Text--4IGK_g("抖音、哔哩哔哩解析稳定；快手已开启验证码风控，免登录经常拿不到地址；小红书仅支持可公开访问的视频笔记。解析失败时会给出具体原因。", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer5, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer5, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer5, 6, 0, 65530);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer5);
                                    composer5.endReplaceableGroup();
                                    composer5.endNode();
                                    composer5.endReplaceableGroup();
                                    composer5.endReplaceableGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer5.skipToGroupEnd();
                            }
                        }), composer3, 196614, 30);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1415getLambda4$app_release(), composer3, 196614, 30);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.settings.ComposableSingletons$SettingsScreenKt.INSTANCE.m1416getLambda5$app_release(), composer3, 196614, 30);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), composer3, 6);
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
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(fillMaxSize$default2, m1413getLambda2$app_release2, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, composableLambda2, startRestartGroup, 805306422, 508);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.settings.SettingsScreenKt$SettingsScreen$2
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
                    tool.wu.heng.ui.screens.settings.SettingsScreenKt.SettingsScreen(tool.wu.heng.viewmodel.MainViewModel.this, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
