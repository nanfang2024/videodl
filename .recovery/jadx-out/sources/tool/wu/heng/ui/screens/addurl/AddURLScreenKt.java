package tool.wu.heng.ui.screens.addurl;

/* compiled from: AddURLScreen.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a3\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0006X\u008a\u008e\u0002²\u0006\u0016\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0014X\u008a\u0084\u0002"}, d2 = {"AddURLScreen", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onNavigateBack", "Lkotlin/Function0;", "onNavigateToDetails", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "viewModel", "Ltool/wu/heng/viewmodel/MainViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ltool/wu/heng/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "ParsedVideoCard", "video", "Ltool/wu/heng/data/model/VideoInfo;", "onDownloadClick", "(Ltool/wu/heng/data/model/VideoInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "app_release", "uiState", "Ltool/wu/heng/viewmodel/MainViewModel$ParseUiState;", "urlText", "pendingMap", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class AddURLScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AddURLScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> onNavigateBack, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onNavigateToDetails, tool.wu.heng.viewmodel.MainViewModel mainViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.lifecycle.viewmodel.CreationExtras creationExtras;
        tool.wu.heng.viewmodel.MainViewModel mainViewModel2;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        java.lang.Object rememberedValue3;
        androidx.compose.runtime.Composer composer2;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateBack, "onNavigateBack");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onNavigateToDetails, "onNavigateToDetails");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(977896547);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changedInstance(onNavigateBack) ? 4 : 2);
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
                    androidx.compose.runtime.ComposerKt.traceEventStart(977896547, i5, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen (AddURLScreen.kt:70)");
                }
                androidx.compose.runtime.CompositionLocal localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = startRestartGroup.consume(localContext);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                final android.content.Context context = (android.content.Context) consume;
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getParseUiState(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
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
                startRestartGroup.startReplaceableGroup(-818641145);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    rememberedValue2 = new androidx.compose.material3.SnackbarHostState();
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.material3.SnackbarHostState snackbarHostState = (androidx.compose.material3.SnackbarHostState) rememberedValue2;
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.startReplaceableGroup(-818641092);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                    rememberedValue3 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, (androidx.compose.runtime.SnapshotMutationPolicy) null, 2, (java.lang.Object) null);
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                startRestartGroup.endReplaceableGroup();
                final tool.wu.heng.viewmodel.MainViewModel mainViewModel4 = mainViewModel2;
                composer2 = startRestartGroup;
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1009368537, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$1
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
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1009368537, i6, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous> (AddURLScreen.kt:81)");
                            }
                            kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1388getLambda1$app_release = tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1388getLambda1$app_release();
                            final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onNavigateBack;
                            androidx.compose.material3.AppBarKt.TopAppBar(m1388getLambda1$app_release, (androidx.compose.ui.Modifier) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -560090847, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$1.1
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
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-560090847, i7, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous> (AddURLScreen.kt:84)");
                                        }
                                        androidx.compose.material3.IconButtonKt.IconButton(function0, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1389getLambda2$app_release(), composer4, 196608, 30);
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
                }), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1443874135, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$2
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
                        if ((i6 & 11) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1443874135, i6, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous> (AddURLScreen.kt:90)");
                        }
                        androidx.compose.material3.SnackbarHostKt.SnackbarHost(snackbarHostState, (androidx.compose.ui.Modifier) null, (kotlin.jvm.functions.Function3) null, composer3, 6, 6);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    }
                }), (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -288698958, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3
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

                    /* JADX WARN: Removed duplicated region for block: B:71:0x047f  */
                    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i6) {
                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$0;
                        int i7;
                        java.lang.Object obj;
                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel5;
                        final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state;
                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$02;
                        androidx.compose.runtime.Composer composer4;
                        int i8;
                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$03;
                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$04;
                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$05;
                        java.lang.Object obj2;
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        int i9 = (i6 & 14) == 0 ? i6 | (composer3.changed(paddingValues) ? 4 : 2) : i6;
                        if ((i9 & 91) != 18 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(-288698958, i9, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous> (AddURLScreen.kt:92)");
                            }
                            androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, (androidx.compose.foundation.gestures.FlingBehavior) null, false, 14, (java.lang.Object) null);
                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = tool.wu.heng.viewmodel.MainViewModel.this;
                            final androidx.compose.runtime.MutableState<java.lang.String> mutableState2 = mutableState;
                            final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state2 = collectAsState;
                            final android.content.Context context2 = context;
                            final kotlinx.coroutines.CoroutineScope coroutineScope2 = coroutineScope;
                            final androidx.compose.material3.SnackbarHostState snackbarHostState2 = snackbarHostState;
                            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = onNavigateToDetails;
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(verticalScroll$default);
                            if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                androidx.compose.runtime.ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                            androidx.compose.runtime.Updater.set-impl(composer5, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                                composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                                composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                            androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                            float f = 16;
                            androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f), 0.0f, 2, (java.lang.Object) null);
                            composer3.startReplaceableGroup(-483455358);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer3, 0);
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
                            androidx.compose.runtime.Composer composer6 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                            androidx.compose.runtime.Updater.set-impl(composer6, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                            kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                            if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                                composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                                composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                            composer3.startReplaceableGroup(2058660585);
                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                            androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = function1;
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -2141380220, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                    invoke(columnScope2, composer7, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:31:0x0253  */
                                /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer7, int i10) {
                                    java.lang.String AddURLScreen$lambda$3;
                                    java.lang.String AddURLScreen$lambda$32;
                                    boolean z;
                                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$06;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i10 & 81) != 16 || !composer7.getSkipping()) {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-2141380220, i10, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:110)");
                                        }
                                        androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(16));
                                        final androidx.compose.runtime.MutableState<java.lang.String> mutableState3 = mutableState2;
                                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel6;
                                        final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state3 = state2;
                                        final android.content.Context context3 = context2;
                                        final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                        final androidx.compose.material3.SnackbarHostState snackbarHostState3 = snackbarHostState2;
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
                                        AddURLScreen$lambda$3 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                        androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, false, 0, androidx.compose.ui.text.input.ImeAction.Companion.getDone-eUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, 23, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                        androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyboardActionScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
                                                invoke2(keyboardActionScope);
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(androidx.compose.foundation.text.KeyboardActionScope $receiver) {
                                                java.lang.String AddURLScreen$lambda$33;
                                                tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$07;
                                                java.lang.String AddURLScreen$lambda$34;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                                                AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$33)) {
                                                    AddURLScreen$lambda$07 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                                    if (AddURLScreen$lambda$07.isLoading()) {
                                                        return;
                                                    }
                                                    tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                    AddURLScreen$lambda$34 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                    mainViewModel8.parseVideo(kotlin.text.StringsKt.trim((java.lang.CharSequence) AddURLScreen$lambda$34).toString());
                                                }
                                            }
                                        }, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, 62, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                        androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                        composer7.startReplaceableGroup(-282432381);
                                        java.lang.Object rememberedValue4 = composer7.rememberedValue();
                                        if (rememberedValue4 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                            rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$2$1
                                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                                public final void invoke2(java.lang.String it) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                                    mutableState3.setValue(it);
                                                }
                                            };
                                            composer7.updateRememberedValue(rememberedValue4);
                                        }
                                        composer7.endReplaceableGroup();
                                        androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(AddURLScreen$lambda$3, (kotlin.jvm.functions.Function1) rememberedValue4, fillMaxWidth$default, false, false, (androidx.compose.ui.text.TextStyle) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1390getLambda3$app_release(), tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1391getLambda4$app_release(), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer7, 2115013303, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer9, java.lang.Integer num) {
                                                invoke(composer9, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.runtime.Composer composer9, int i11) {
                                                java.lang.String AddURLScreen$lambda$33;
                                                if ((i11 & 11) != 2 || !composer9.getSkipping()) {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(2115013303, i11, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:126)");
                                                    }
                                                    final android.content.Context context4 = context3;
                                                    final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                    final androidx.compose.runtime.MutableState<java.lang.String> mutableState4 = mutableState3;
                                                    final androidx.compose.material3.SnackbarHostState snackbarHostState4 = snackbarHostState3;
                                                    composer9.startReplaceableGroup(693286680);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer9, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                    androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.Companion;
                                                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.Companion.getTop(), composer9, 0);
                                                    composer9.startReplaceableGroup(-1323940314);
                                                    androidx.compose.runtime.ComposerKt.sourceInformation(composer9, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                    int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer9, 0);
                                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer9.getCurrentCompositionLocalMap();
                                                    kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                    kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                                    if (!(composer9.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                    }
                                                    composer9.startReusableNode();
                                                    if (composer9.getInserting()) {
                                                        composer9.createNode(constructor4);
                                                    } else {
                                                        composer9.useNode();
                                                    }
                                                    androidx.compose.runtime.Composer composer10 = androidx.compose.runtime.Updater.constructor-impl(composer9);
                                                    androidx.compose.runtime.Updater.set-impl(composer10, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                    androidx.compose.runtime.Updater.set-impl(composer10, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                    kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                    if (composer10.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer10.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                                        composer10.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                                        composer10.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                    }
                                                    modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer9)), composer9, 0);
                                                    composer9.startReplaceableGroup(2058660585);
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer9, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                    androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                    androidx.compose.material3.IconButtonKt.IconButton(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1
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
                                                            java.lang.String str;
                                                            java.lang.CharSequence coerceToText;
                                                            java.lang.Object systemService = context4.getSystemService("clipboard");
                                                            android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
                                                            android.content.ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
                                                            if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3(snackbarHostState4, null), 3, null);
                                                                return;
                                                            }
                                                            android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                                                            if (itemAt == null || (coerceToText = itemAt.coerceToText(context4)) == null || (str = coerceToText.toString()) == null) {
                                                                str = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                                                            }
                                                            java.lang.String str2 = str;
                                                            if (!(!kotlin.text.StringsKt.isBlank(str2))) {
                                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2(snackbarHostState4, null), 3, null);
                                                                return;
                                                            }
                                                            java.lang.String extract = tool.wu.heng.parser.UrlExtractor.INSTANCE.extract(str);
                                                            mutableState4.setValue(extract == null ? kotlin.text.StringsKt.trim((java.lang.CharSequence) str2).toString() : extract);
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1(snackbarHostState4, extract, null), 3, null);
                                                        }

                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* compiled from: AddURLScreen.kt */
                                                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$1", f = "AddURLScreen.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$1, reason: invalid class name */
                                                        /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                            final /* synthetic */ java.lang.String $extracted;
                                                            final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1> continuation) {
                                                                super(2, continuation);
                                                                this.$snackbarHostState = snackbarHostState;
                                                                this.$extracted = str;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1(this.$snackbarHostState, this.$extracted, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                    androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                    java.lang.String str = this.$extracted != null ? "已识别到链接" : "已粘贴剪贴板内容";
                                                                    this.label = 1;
                                                                    if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, str, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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

                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* compiled from: AddURLScreen.kt */
                                                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$2", f = "AddURLScreen.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$2, reason: invalid class name */
                                                        /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                        public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                            final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass2(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2> continuation) {
                                                                super(2, continuation);
                                                                this.$snackbarHostState = snackbarHostState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2(this.$snackbarHostState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "剪贴板为空", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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

                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        /* compiled from: AddURLScreen.kt */
                                                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$3", f = "AddURLScreen.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
                                                        /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$3, reason: invalid class name */
                                                        /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                        public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                            final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                            int label;

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            AnonymousClass3(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3> continuation) {
                                                                super(2, continuation);
                                                                this.$snackbarHostState = snackbarHostState;
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                                return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3(this.$snackbarHostState, continuation);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                                return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                            }

                                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                                int i = this.label;
                                                                if (i == 0) {
                                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                                    this.label = 1;
                                                                    if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "剪贴板为空", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                                    }, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1392getLambda5$app_release(), composer9, 196608, 30);
                                                    composer9.startReplaceableGroup(920237109);
                                                    AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState4);
                                                    if (AddURLScreen$lambda$33.length() > 0) {
                                                        composer9.startReplaceableGroup(1736001583);
                                                        java.lang.Object rememberedValue5 = composer9.rememberedValue();
                                                        if (rememberedValue5 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                                            rememberedValue5 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$2$1
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
                                                                    mutableState4.setValue(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
                                                                }
                                                            };
                                                            composer9.updateRememberedValue(rememberedValue5);
                                                        }
                                                        composer9.endReplaceableGroup();
                                                        androidx.compose.material3.IconButtonKt.IconButton((kotlin.jvm.functions.Function0) rememberedValue5, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1393getLambda6$app_release(), composer9, 196614, 30);
                                                    }
                                                    composer9.endReplaceableGroup();
                                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer9);
                                                    composer9.endReplaceableGroup();
                                                    composer9.endNode();
                                                    composer9.endReplaceableGroup();
                                                    composer9.endReplaceableGroup();
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer9.skipToGroupEnd();
                                            }
                                        }), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, false, (androidx.compose.ui.text.input.VisualTransformation) null, keyboardOptions, keyboardActions, true, 0, 0, (androidx.compose.foundation.interaction.MutableInteractionSource) null, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.TextFieldColors) null, composer7, 819462576, 12779520, 0, 8158520);
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer7, 6);
                                        AddURLScreen$lambda$32 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                        if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$32)) {
                                            AddURLScreen$lambda$06 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                            if (!AddURLScreen$lambda$06.isLoading()) {
                                                z = true;
                                                androidx.compose.material3.ButtonKt.Button(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4
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
                                                        java.lang.String AddURLScreen$lambda$33;
                                                        java.lang.String AddURLScreen$lambda$34;
                                                        AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                        if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$33)) {
                                                            tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                            AddURLScreen$lambda$34 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                            mainViewModel8.parseVideo(kotlin.text.StringsKt.trim((java.lang.CharSequence) AddURLScreen$lambda$34).toString());
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(snackbarHostState3, null), 3, null);
                                                        }
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: AddURLScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1", f = "AddURLScreen.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(this.$snackbarHostState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "正在解析链接...", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                                }, androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(48)), z, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer7, -1693057826, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$5
                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(3);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer9, java.lang.Integer num) {
                                                        invoke(rowScope, composer9, num.intValue());
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    public final void invoke(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer9, int i11) {
                                                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$07;
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                        if ((i11 & 81) != 16 || !composer9.getSkipping()) {
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(-1693057826, i11, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:181)");
                                                            }
                                                            AddURLScreen$lambda$07 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                                            if (AddURLScreen$lambda$07.isLoading()) {
                                                                composer9.startReplaceableGroup(920238364);
                                                                androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(4)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer9, androidx.compose.material3.MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0.0f, 0L, 0, composer9, 6, 28);
                                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                                androidx.compose.material3.TextKt.Text--4IGK_g("解析中...", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                                composer9.endReplaceableGroup();
                                                            } else {
                                                                composer9.startReplaceableGroup(920238764);
                                                                androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.PlayArrowKt.getPlayArrow(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, (androidx.compose.ui.Modifier) null, 0L, composer9, 48, 12);
                                                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                                androidx.compose.material3.TextKt.Text--4IGK_g("开始解析", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                                composer9.endReplaceableGroup();
                                                            }
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        composer9.skipToGroupEnd();
                                                    }
                                                }), composer7, 805306416, 504);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                                composer7.endReplaceableGroup();
                                                composer7.endNode();
                                                composer7.endReplaceableGroup();
                                                composer7.endReplaceableGroup();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    return;
                                                }
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                return;
                                            }
                                        }
                                        z = false;
                                        androidx.compose.material3.ButtonKt.Button(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4
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
                                                java.lang.String AddURLScreen$lambda$33;
                                                java.lang.String AddURLScreen$lambda$34;
                                                AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$33)) {
                                                    tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                    AddURLScreen$lambda$34 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                    mainViewModel8.parseVideo(kotlin.text.StringsKt.trim((java.lang.CharSequence) AddURLScreen$lambda$34).toString());
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(snackbarHostState3, null), 3, null);
                                                }
                                            }

                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* compiled from: AddURLScreen.kt */
                                            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1", f = "AddURLScreen.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
                                            /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1, reason: invalid class name */
                                            /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                            public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1> continuation) {
                                                    super(2, continuation);
                                                    this.$snackbarHostState = snackbarHostState;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                    return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(this.$snackbarHostState, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                    return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        kotlin.ResultKt.throwOnFailure(obj);
                                                        this.label = 1;
                                                        if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "正在解析链接...", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                        }, androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(48)), z, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer7, -1693057826, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$5
                                            /* JADX INFO: Access modifiers changed from: package-private */
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer9, java.lang.Integer num) {
                                                invoke(rowScope, composer9, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer9, int i11) {
                                                tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$07;
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                if ((i11 & 81) != 16 || !composer9.getSkipping()) {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1693057826, i11, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:181)");
                                                    }
                                                    AddURLScreen$lambda$07 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                                    if (AddURLScreen$lambda$07.isLoading()) {
                                                        composer9.startReplaceableGroup(920238364);
                                                        androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(4)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer9, androidx.compose.material3.MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0.0f, 0L, 0, composer9, 6, 28);
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                        androidx.compose.material3.TextKt.Text--4IGK_g("解析中...", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                        composer9.endReplaceableGroup();
                                                    } else {
                                                        composer9.startReplaceableGroup(920238764);
                                                        androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.PlayArrowKt.getPlayArrow(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, (androidx.compose.ui.Modifier) null, 0L, composer9, 48, 12);
                                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                        androidx.compose.material3.TextKt.Text--4IGK_g("开始解析", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                        composer9.endReplaceableGroup();
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer9.skipToGroupEnd();
                                            }
                                        }), composer7, 805306416, 504);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                        composer7.endReplaceableGroup();
                                        composer7.endNode();
                                        composer7.endReplaceableGroup();
                                        composer7.endReplaceableGroup();
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        }
                                    } else {
                                        composer7.skipToGroupEnd();
                                    }
                                }
                            }), composer3, 196614, 22);
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                            composer3.startReplaceableGroup(619972701);
                            AddURLScreen$lambda$0 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state2);
                            if (AddURLScreen$lambda$0.getErrorMessage() != null) {
                                obj = null;
                                mainViewModel5 = mainViewModel6;
                                state = state2;
                                androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0L, 0L, 0L, composer3, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1251367881, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$2
                                    /* JADX INFO: Access modifiers changed from: package-private */
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                        invoke(columnScope2, composer7, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer7, int i10) {
                                        tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$06;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                        if ((i10 & 81) != 16 || !composer7.getSkipping()) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1251367881, i10, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:207)");
                                            }
                                            androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(16));
                                            androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                                            androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                                            androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state3 = state;
                                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel5;
                                            composer7.startReplaceableGroup(693286680);
                                            androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer7, 54);
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
                                            androidx.compose.runtime.Updater.set-impl(composer8, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                            androidx.compose.runtime.Updater.set-impl(composer8, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                            kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                            if (composer8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                                composer8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                                composer8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                            }
                                            modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer7)), composer7, 0);
                                            composer7.startReplaceableGroup(2058660585);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer7, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                            androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                            AddURLScreen$lambda$06 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                            java.lang.String errorMessage = AddURLScreen$lambda$06.getErrorMessage();
                                            if (errorMessage == null) {
                                                errorMessage = "解析失败";
                                            }
                                            androidx.compose.material3.TextKt.Text--4IGK_g(errorMessage, androidx.compose.foundation.layout.RowScope.weight$default(rowScope, androidx.compose.ui.Modifier.Companion, 1.0f, false, 2, (java.lang.Object) null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer7, androidx.compose.material3.MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer7, 0, 0, 131064);
                                            androidx.compose.material3.ButtonKt.TextButton(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$2$1$1
                                                /* JADX INFO: Access modifiers changed from: package-private */
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
                                                    tool.wu.heng.viewmodel.MainViewModel.this.resetParseResult();
                                                }
                                            }, (androidx.compose.ui.Modifier) null, false, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1394getLambda7$app_release(), composer7, 805306368, 510);
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
                                }), composer3, 196614, 26);
                                androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f));
                                i7 = 6;
                                androidx.compose.foundation.layout.SpacerKt.Spacer(modifier2, composer3, 6);
                            } else {
                                i7 = 6;
                                obj = null;
                                mainViewModel5 = mainViewModel6;
                                state = state2;
                            }
                            composer3.endReplaceableGroup();
                            composer3.startReplaceableGroup(619973981);
                            AddURLScreen$lambda$02 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                            if (AddURLScreen$lambda$02.isParseSuccessful()) {
                                AddURLScreen$lambda$03 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                                if (!AddURLScreen$lambda$03.getVideos().isEmpty()) {
                                    AddURLScreen$lambda$04 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel5;
                                    composer4 = composer3;
                                    androidx.compose.material3.TextKt.Text--4IGK_g("解析到 " + AddURLScreen$lambda$04.getVideos().size() + " 个视频", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer3, 0, 0, 65534);
                                    i8 = 6;
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer4, 6);
                                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel7.getPendingVideos(), (kotlin.coroutines.CoroutineContext) null, composer4, 8, 1);
                                    AddURLScreen$lambda$05 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                                    for (final tool.wu.heng.data.model.VideoInfo videoInfo : AddURLScreen$lambda$05.getVideos()) {
                                        java.util.Iterator<T> it = invoke$lambda$5$lambda$4$lambda$0(collectAsState2).entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                obj2 = it.next();
                                                if (((java.util.Map.Entry) obj2).getValue() == videoInfo) {
                                                    break;
                                                }
                                            } else {
                                                obj2 = null;
                                                break;
                                            }
                                        }
                                        java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                                        final java.lang.String str = entry != null ? (java.lang.String) entry.getKey() : null;
                                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1
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
                                                tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                tool.wu.heng.data.model.VideoInfo videoInfo2 = videoInfo;
                                                final android.content.Context context3 = context2;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope2;
                                                final androidx.compose.material3.SnackbarHostState snackbarHostState3 = snackbarHostState2;
                                                final tool.wu.heng.data.model.VideoInfo videoInfo3 = videoInfo;
                                                mainViewModel8.createDownload(videoInfo2, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str2) {
                                                        invoke2(str2);
                                                        return kotlin.Unit.INSTANCE;
                                                    }

                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                    public final void invoke2(java.lang.String taskId) {
                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                        androidx.core.content.ContextCompat.startForegroundService(context3, tool.wu.heng.service.DownloadService.Companion.createIntent(context3, taskId));
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051(snackbarHostState3, videoInfo3, null), 3, null);
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: AddURLScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1$1$1", f = "AddURLScreen.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1$1$1, reason: invalid class name and collision with other inner class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class C00051 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        final /* synthetic */ tool.wu.heng.data.model.VideoInfo $video;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        C00051(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.model.VideoInfo videoInfo, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                            this.$video = videoInfo;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051(this.$snackbarHostState, this.$video, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                java.lang.String title = this.$video.getTitle();
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已开始下载: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                                });
                                            }
                                        };
                                        composer4.startReplaceableGroup(-380017950);
                                        final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function13 = function12;
                                        boolean changed = composer4.changed(str) | composer4.changedInstance(function13);
                                        java.lang.Object rememberedValue4 = composer3.rememberedValue();
                                        if (changed || rememberedValue4 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                            rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$2$1
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
                                                    java.lang.String str2 = str;
                                                    if (str2 != null) {
                                                        function13.invoke(str2);
                                                    }
                                                }
                                            };
                                            composer4.updateRememberedValue(rememberedValue4);
                                        }
                                        composer3.endReplaceableGroup();
                                        tool.wu.heng.ui.screens.addurl.AddURLScreenKt.ParsedVideoCard(videoInfo, function0, (kotlin.jvm.functions.Function0) rememberedValue4, composer3, 8, 0);
                                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer4, 6);
                                        function12 = function13;
                                    }
                                    composer3.endReplaceableGroup();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), composer4, i8);
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
                                        return;
                                    }
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    return;
                                }
                            }
                            composer4 = composer3;
                            i8 = i7;
                            composer3.endReplaceableGroup();
                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), composer4, i8);
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
                            }
                        } else {
                            composer3.skipToGroupEnd();
                        }
                    }

                    private static final java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo> invoke$lambda$5$lambda$4$lambda$0(androidx.compose.runtime.State<? extends java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo>> state) {
                        return (java.util.Map) state.getValue();
                    }
                }), composer2, 805309494, 500);
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
            final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel2.getParseUiState(), (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 8, 1);
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
            startRestartGroup.startReplaceableGroup(-818641145);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
            }
            final androidx.compose.material3.SnackbarHostState snackbarHostState2 = (androidx.compose.material3.SnackbarHostState) rememberedValue2;
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.startReplaceableGroup(-818641092);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
            }
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue3;
            startRestartGroup.endReplaceableGroup();
            final tool.wu.heng.viewmodel.MainViewModel mainViewModel42 = mainViewModel2;
            composer2 = startRestartGroup;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1009368537, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$1
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
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1009368537, i6, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous> (AddURLScreen.kt:81)");
                        }
                        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1388getLambda1$app_release = tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1388getLambda1$app_release();
                        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = onNavigateBack;
                        androidx.compose.material3.AppBarKt.TopAppBar(m1388getLambda1$app_release, (androidx.compose.ui.Modifier) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -560090847, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$1.1
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
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-560090847, i7, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous> (AddURLScreen.kt:84)");
                                    }
                                    androidx.compose.material3.IconButtonKt.IconButton(function0, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1389getLambda2$app_release(), composer4, 196608, 30);
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
            }), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1443874135, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$2
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
                    if ((i6 & 11) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1443874135, i6, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous> (AddURLScreen.kt:90)");
                    }
                    androidx.compose.material3.SnackbarHostKt.SnackbarHost(snackbarHostState2, (androidx.compose.ui.Modifier) null, (kotlin.jvm.functions.Function3) null, composer3, 6, 6);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                }
            }), (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -288698958, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3
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

                /* JADX WARN: Removed duplicated region for block: B:71:0x047f  */
                /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(androidx.compose.foundation.layout.PaddingValues paddingValues, androidx.compose.runtime.Composer composer3, int i6) {
                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$0;
                    int i7;
                    java.lang.Object obj;
                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel5;
                    final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state;
                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$02;
                    androidx.compose.runtime.Composer composer4;
                    int i8;
                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$03;
                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$04;
                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$05;
                    java.lang.Object obj2;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    int i9 = (i6 & 14) == 0 ? i6 | (composer3.changed(paddingValues) ? 4 : 2) : i6;
                    if ((i9 & 91) != 18 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(-288698958, i9, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous> (AddURLScreen.kt:92)");
                        }
                        androidx.compose.ui.Modifier verticalScroll$default = androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.Companion, paddingValues), 0.0f, 1, (java.lang.Object) null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer3, 0, 1), false, (androidx.compose.foundation.gestures.FlingBehavior) null, false, 14, (java.lang.Object) null);
                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = tool.wu.heng.viewmodel.MainViewModel.this;
                        final androidx.compose.runtime.MutableState<java.lang.String> mutableState22 = mutableState2;
                        final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state2 = collectAsState2;
                        final android.content.Context context22 = context2;
                        final kotlinx.coroutines.CoroutineScope coroutineScope22 = coroutineScope2;
                        final androidx.compose.material3.SnackbarHostState snackbarHostState22 = snackbarHostState2;
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function1 = onNavigateToDetails;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(verticalScroll$default);
                        if (!(composer3.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        androidx.compose.runtime.Composer composer5 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                        androidx.compose.runtime.Updater.set-impl(composer5, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        float f = 16;
                        androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-VpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(f), 0.0f, 2, (java.lang.Object) null);
                        composer3.startReplaceableGroup(-483455358);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer3, 0);
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
                        androidx.compose.runtime.Composer composer6 = androidx.compose.runtime.Updater.constructor-impl(composer3);
                        androidx.compose.runtime.Updater.set-impl(composer6, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer6, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (composer6.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer6.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                            composer6.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                            composer6.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer3)), composer3, 0);
                        composer3.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer3, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                        androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> function12 = function1;
                        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composer3, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -2141380220, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                invoke(columnScope2, composer7, num.intValue());
                                return kotlin.Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:31:0x0253  */
                            /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer7, int i10) {
                                java.lang.String AddURLScreen$lambda$3;
                                java.lang.String AddURLScreen$lambda$32;
                                boolean z;
                                tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$06;
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                if ((i10 & 81) != 16 || !composer7.getSkipping()) {
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(-2141380220, i10, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:110)");
                                    }
                                    androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(16));
                                    final androidx.compose.runtime.MutableState<java.lang.String> mutableState3 = mutableState22;
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel6;
                                    final androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state3 = state2;
                                    final android.content.Context context3 = context22;
                                    final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope22;
                                    final androidx.compose.material3.SnackbarHostState snackbarHostState3 = snackbarHostState22;
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
                                    AddURLScreen$lambda$3 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                    androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, false, 0, androidx.compose.ui.text.input.ImeAction.Companion.getDone-eUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, 23, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                    androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(new kotlin.jvm.functions.Function1<androidx.compose.foundation.text.KeyboardActionScope, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$1
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
                                            invoke2(keyboardActionScope);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.compose.foundation.text.KeyboardActionScope $receiver) {
                                            java.lang.String AddURLScreen$lambda$33;
                                            tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$07;
                                            java.lang.String AddURLScreen$lambda$34;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                                            AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                            if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$33)) {
                                                AddURLScreen$lambda$07 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                                if (AddURLScreen$lambda$07.isLoading()) {
                                                    return;
                                                }
                                                tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                AddURLScreen$lambda$34 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                mainViewModel8.parseVideo(kotlin.text.StringsKt.trim((java.lang.CharSequence) AddURLScreen$lambda$34).toString());
                                            }
                                        }
                                    }, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, 62, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                                    composer7.startReplaceableGroup(-282432381);
                                    java.lang.Object rememberedValue4 = composer7.rememberedValue();
                                    if (rememberedValue4 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                        rememberedValue4 = (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$2$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
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
                                            public final void invoke2(java.lang.String it) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                                mutableState3.setValue(it);
                                            }
                                        };
                                        composer7.updateRememberedValue(rememberedValue4);
                                    }
                                    composer7.endReplaceableGroup();
                                    androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField(AddURLScreen$lambda$3, (kotlin.jvm.functions.Function1) rememberedValue4, fillMaxWidth$default, false, false, (androidx.compose.ui.text.TextStyle) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1390getLambda3$app_release(), tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1391getLambda4$app_release(), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer7, 2115013303, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer9, java.lang.Integer num) {
                                            invoke(composer9, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.runtime.Composer composer9, int i11) {
                                            java.lang.String AddURLScreen$lambda$33;
                                            if ((i11 & 11) != 2 || !composer9.getSkipping()) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(2115013303, i11, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:126)");
                                                }
                                                final android.content.Context context4 = context3;
                                                final kotlinx.coroutines.CoroutineScope coroutineScope4 = coroutineScope3;
                                                final androidx.compose.runtime.MutableState<java.lang.String> mutableState4 = mutableState3;
                                                final androidx.compose.material3.SnackbarHostState snackbarHostState4 = snackbarHostState3;
                                                composer9.startReplaceableGroup(693286680);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer9, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                                androidx.compose.ui.Modifier modifier3 = androidx.compose.ui.Modifier.Companion;
                                                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.Companion.getTop(), composer9, 0);
                                                composer9.startReplaceableGroup(-1323940314);
                                                androidx.compose.runtime.ComposerKt.sourceInformation(composer9, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                                                int currentCompositeKeyHash4 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer9, 0);
                                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = composer9.getCurrentCompositionLocalMap();
                                                kotlin.jvm.functions.Function0 constructor4 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                                                kotlin.jvm.functions.Function3 modifierMaterializerOf4 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier3);
                                                if (!(composer9.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                                }
                                                composer9.startReusableNode();
                                                if (composer9.getInserting()) {
                                                    composer9.createNode(constructor4);
                                                } else {
                                                    composer9.useNode();
                                                }
                                                androidx.compose.runtime.Composer composer10 = androidx.compose.runtime.Updater.constructor-impl(composer9);
                                                androidx.compose.runtime.Updater.set-impl(composer10, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                                androidx.compose.runtime.Updater.set-impl(composer10, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                                kotlin.jvm.functions.Function2 setCompositeKeyHash4 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                                if (composer10.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer10.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash4))) {
                                                    composer10.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash4));
                                                    composer10.apply(java.lang.Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                                }
                                                modifierMaterializerOf4.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer9)), composer9, 0);
                                                composer9.startReplaceableGroup(2058660585);
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer9, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                                androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                                androidx.compose.material3.IconButtonKt.IconButton(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1
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
                                                        java.lang.String str;
                                                        java.lang.CharSequence coerceToText;
                                                        java.lang.Object systemService = context4.getSystemService("clipboard");
                                                        android.content.ClipboardManager clipboardManager = systemService instanceof android.content.ClipboardManager ? (android.content.ClipboardManager) systemService : null;
                                                        android.content.ClipData primaryClip = clipboardManager != null ? clipboardManager.getPrimaryClip() : null;
                                                        if (primaryClip == null || primaryClip.getItemCount() <= 0) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3(snackbarHostState4, null), 3, null);
                                                            return;
                                                        }
                                                        android.content.ClipData.Item itemAt = primaryClip.getItemAt(0);
                                                        if (itemAt == null || (coerceToText = itemAt.coerceToText(context4)) == null || (str = coerceToText.toString()) == null) {
                                                            str = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        java.lang.String str2 = str;
                                                        if (!(!kotlin.text.StringsKt.isBlank(str2))) {
                                                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2(snackbarHostState4, null), 3, null);
                                                            return;
                                                        }
                                                        java.lang.String extract = tool.wu.heng.parser.UrlExtractor.INSTANCE.extract(str);
                                                        mutableState4.setValue(extract == null ? kotlin.text.StringsKt.trim((java.lang.CharSequence) str2).toString() : extract);
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope4, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1(snackbarHostState4, extract, null), 3, null);
                                                    }

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: AddURLScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$1", f = "AddURLScreen.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$1, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ java.lang.String $extracted;
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, java.lang.String str, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                            this.$extracted = str;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1(this.$snackbarHostState, this.$extracted, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                                java.lang.String str = this.$extracted != null ? "已识别到链接" : "已粘贴剪贴板内容";
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, str, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: AddURLScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$2", f = "AddURLScreen.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$2, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass2(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2(this.$snackbarHostState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "剪贴板为空", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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

                                                    /* JADX INFO: Access modifiers changed from: package-private */
                                                    /* compiled from: AddURLScreen.kt */
                                                    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$3", f = "AddURLScreen.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
                                                    /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1$3, reason: invalid class name */
                                                    /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                        final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                        int label;

                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        AnonymousClass3(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3> continuation) {
                                                            super(2, continuation);
                                                            this.$snackbarHostState = snackbarHostState;
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                            return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3(this.$snackbarHostState, continuation);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                            return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$1.AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                        }

                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                            int i = this.label;
                                                            if (i == 0) {
                                                                kotlin.ResultKt.throwOnFailure(obj);
                                                                this.label = 1;
                                                                if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "剪贴板为空", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                                }, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1392getLambda5$app_release(), composer9, 196608, 30);
                                                composer9.startReplaceableGroup(920237109);
                                                AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState4);
                                                if (AddURLScreen$lambda$33.length() > 0) {
                                                    composer9.startReplaceableGroup(1736001583);
                                                    java.lang.Object rememberedValue5 = composer9.rememberedValue();
                                                    if (rememberedValue5 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                                        rememberedValue5 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$3$1$2$1
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
                                                                mutableState4.setValue(okhttp3.HttpUrl.FRAGMENT_ENCODE_SET);
                                                            }
                                                        };
                                                        composer9.updateRememberedValue(rememberedValue5);
                                                    }
                                                    composer9.endReplaceableGroup();
                                                    androidx.compose.material3.IconButtonKt.IconButton((kotlin.jvm.functions.Function0) rememberedValue5, (androidx.compose.ui.Modifier) null, false, (androidx.compose.material3.IconButtonColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1393getLambda6$app_release(), composer9, 196614, 30);
                                                }
                                                composer9.endReplaceableGroup();
                                                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer9);
                                                composer9.endReplaceableGroup();
                                                composer9.endNode();
                                                composer9.endReplaceableGroup();
                                                composer9.endReplaceableGroup();
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer9.skipToGroupEnd();
                                        }
                                    }), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, false, (androidx.compose.ui.text.input.VisualTransformation) null, keyboardOptions, keyboardActions, true, 0, 0, (androidx.compose.foundation.interaction.MutableInteractionSource) null, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.TextFieldColors) null, composer7, 819462576, 12779520, 0, 8158520);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer7, 6);
                                    AddURLScreen$lambda$32 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                    if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$32)) {
                                        AddURLScreen$lambda$06 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                        if (!AddURLScreen$lambda$06.isLoading()) {
                                            z = true;
                                            androidx.compose.material3.ButtonKt.Button(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4
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
                                                    java.lang.String AddURLScreen$lambda$33;
                                                    java.lang.String AddURLScreen$lambda$34;
                                                    AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                    if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$33)) {
                                                        tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                        AddURLScreen$lambda$34 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                        mainViewModel8.parseVideo(kotlin.text.StringsKt.trim((java.lang.CharSequence) AddURLScreen$lambda$34).toString());
                                                        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(snackbarHostState3, null), 3, null);
                                                    }
                                                }

                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* compiled from: AddURLScreen.kt */
                                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1", f = "AddURLScreen.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1, reason: invalid class name */
                                                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1> continuation) {
                                                        super(2, continuation);
                                                        this.$snackbarHostState = snackbarHostState;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(this.$snackbarHostState, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            this.label = 1;
                                                            if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "正在解析链接...", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                            }, androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(48)), z, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer7, -1693057826, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$5
                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(3);
                                                }

                                                @Override // kotlin.jvm.functions.Function3
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer9, java.lang.Integer num) {
                                                    invoke(rowScope, composer9, num.intValue());
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                public final void invoke(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer9, int i11) {
                                                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$07;
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                                    if ((i11 & 81) != 16 || !composer9.getSkipping()) {
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventStart(-1693057826, i11, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:181)");
                                                        }
                                                        AddURLScreen$lambda$07 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                                        if (AddURLScreen$lambda$07.isLoading()) {
                                                            composer9.startReplaceableGroup(920238364);
                                                            androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(4)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer9, androidx.compose.material3.MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0.0f, 0L, 0, composer9, 6, 28);
                                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                            androidx.compose.material3.TextKt.Text--4IGK_g("解析中...", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                            composer9.endReplaceableGroup();
                                                        } else {
                                                            composer9.startReplaceableGroup(920238764);
                                                            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.PlayArrowKt.getPlayArrow(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, (androidx.compose.ui.Modifier) null, 0L, composer9, 48, 12);
                                                            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                            androidx.compose.material3.TextKt.Text--4IGK_g("开始解析", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                            composer9.endReplaceableGroup();
                                                        }
                                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    composer9.skipToGroupEnd();
                                                }
                                            }), composer7, 805306416, 504);
                                            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                            composer7.endReplaceableGroup();
                                            composer7.endNode();
                                            composer7.endReplaceableGroup();
                                            composer7.endReplaceableGroup();
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                return;
                                            }
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            return;
                                        }
                                    }
                                    z = false;
                                    androidx.compose.material3.ButtonKt.Button(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4
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
                                            java.lang.String AddURLScreen$lambda$33;
                                            java.lang.String AddURLScreen$lambda$34;
                                            AddURLScreen$lambda$33 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                            if (!kotlin.text.StringsKt.isBlank(AddURLScreen$lambda$33)) {
                                                tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                                AddURLScreen$lambda$34 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$3(mutableState3);
                                                mainViewModel8.parseVideo(kotlin.text.StringsKt.trim((java.lang.CharSequence) AddURLScreen$lambda$34).toString());
                                                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(snackbarHostState3, null), 3, null);
                                            }
                                        }

                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* compiled from: AddURLScreen.kt */
                                        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1", f = "AddURLScreen.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
                                        /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4$1, reason: invalid class name */
                                        /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                            final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                            int label;

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            AnonymousClass1(androidx.compose.material3.SnackbarHostState snackbarHostState, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1> continuation) {
                                                super(2, continuation);
                                                this.$snackbarHostState = snackbarHostState;
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1(this.$snackbarHostState, continuation);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$4.AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                            }

                                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                            public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                int i = this.label;
                                                if (i == 0) {
                                                    kotlin.ResultKt.throwOnFailure(obj);
                                                    this.label = 1;
                                                    if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(this.$snackbarHostState, "正在解析链接...", (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                    }, androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(48)), z, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer7, -1693057826, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$1$1$5
                                        /* JADX INFO: Access modifiers changed from: package-private */
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer9, java.lang.Integer num) {
                                            invoke(rowScope, composer9, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.foundation.layout.RowScope Button, androidx.compose.runtime.Composer composer9, int i11) {
                                            tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$07;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                            if ((i11 & 81) != 16 || !composer9.getSkipping()) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1693057826, i11, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:181)");
                                                }
                                                AddURLScreen$lambda$07 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                                if (AddURLScreen$lambda$07.isLoading()) {
                                                    composer9.startReplaceableGroup(920238364);
                                                    androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(4)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer9, androidx.compose.material3.MaterialTheme.$stable).getOnPrimary-0d7_KjU(), 0.0f, 0L, 0, composer9, 6, 28);
                                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                    androidx.compose.material3.TextKt.Text--4IGK_g("解析中...", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                    composer9.endReplaceableGroup();
                                                } else {
                                                    composer9.startReplaceableGroup(920238764);
                                                    androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.PlayArrowKt.getPlayArrow(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, (androidx.compose.ui.Modifier) null, 0L, composer9, 48, 12);
                                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer9, 6);
                                                    androidx.compose.material3.TextKt.Text--4IGK_g("开始解析", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer9, 6, 0, 131070);
                                                    composer9.endReplaceableGroup();
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer9.skipToGroupEnd();
                                        }
                                    }), composer7, 805306416, 504);
                                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer7);
                                    composer7.endReplaceableGroup();
                                    composer7.endNode();
                                    composer7.endReplaceableGroup();
                                    composer7.endReplaceableGroup();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    }
                                } else {
                                    composer7.skipToGroupEnd();
                                }
                            }
                        }), composer3, 196614, 22);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f)), composer3, 6);
                        composer3.startReplaceableGroup(619972701);
                        AddURLScreen$lambda$0 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state2);
                        if (AddURLScreen$lambda$0.getErrorMessage() != null) {
                            obj = null;
                            mainViewModel5 = mainViewModel6;
                            state = state2;
                            androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, androidx.compose.material3.CardDefaults.INSTANCE.cardColors-ro_MJ88(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer3, androidx.compose.material3.MaterialTheme.$stable).getErrorContainer-0d7_KjU(), 0L, 0L, 0L, composer3, androidx.compose.material3.CardDefaults.$stable << 12, 14), (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, 1251367881, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$2
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope2, androidx.compose.runtime.Composer composer7, java.lang.Integer num) {
                                    invoke(columnScope2, composer7, num.intValue());
                                    return kotlin.Unit.INSTANCE;
                                }

                                public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer7, int i10) {
                                    tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$06;
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i10 & 81) != 16 || !composer7.getSkipping()) {
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1251367881, i10, -1, "tool.wu.heng.ui.screens.addurl.AddURLScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AddURLScreen.kt:207)");
                                        }
                                        androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(16));
                                        androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                                        androidx.compose.foundation.layout.Arrangement.Horizontal spaceBetween = androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween();
                                        androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state3 = state;
                                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel5;
                                        composer7.startReplaceableGroup(693286680);
                                        androidx.compose.runtime.ComposerKt.sourceInformation(composer7, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer7, 54);
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
                                        androidx.compose.runtime.Updater.set-impl(composer8, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                                        androidx.compose.runtime.Updater.set-impl(composer8, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                                        kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                                        if (composer8.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer8.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                                            composer8.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                                            composer8.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer7)), composer7, 0);
                                        composer7.startReplaceableGroup(2058660585);
                                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer7, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                                        androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                                        AddURLScreen$lambda$06 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state3);
                                        java.lang.String errorMessage = AddURLScreen$lambda$06.getErrorMessage();
                                        if (errorMessage == null) {
                                            errorMessage = "解析失败";
                                        }
                                        androidx.compose.material3.TextKt.Text--4IGK_g(errorMessage, androidx.compose.foundation.layout.RowScope.weight$default(rowScope, androidx.compose.ui.Modifier.Companion, 1.0f, false, 2, (java.lang.Object) null), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer7, androidx.compose.material3.MaterialTheme.$stable).getOnErrorContainer-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer7, 0, 0, 131064);
                                        androidx.compose.material3.ButtonKt.TextButton(new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$2$1$1
                                            /* JADX INFO: Access modifiers changed from: package-private */
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
                                                tool.wu.heng.viewmodel.MainViewModel.this.resetParseResult();
                                            }
                                        }, (androidx.compose.ui.Modifier) null, false, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1394getLambda7$app_release(), composer7, 805306368, 510);
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
                            }), composer3, 196614, 26);
                            androidx.compose.ui.Modifier modifier2 = androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f));
                            i7 = 6;
                            androidx.compose.foundation.layout.SpacerKt.Spacer(modifier2, composer3, 6);
                        } else {
                            i7 = 6;
                            obj = null;
                            mainViewModel5 = mainViewModel6;
                            state = state2;
                        }
                        composer3.endReplaceableGroup();
                        composer3.startReplaceableGroup(619973981);
                        AddURLScreen$lambda$02 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                        if (AddURLScreen$lambda$02.isParseSuccessful()) {
                            AddURLScreen$lambda$03 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                            if (!AddURLScreen$lambda$03.getVideos().isEmpty()) {
                                AddURLScreen$lambda$04 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = mainViewModel5;
                                composer4 = composer3;
                                androidx.compose.material3.TextKt.Text--4IGK_g("解析到 " + AddURLScreen$lambda$04.getVideos().size() + " 个视频", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer3, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer3, 0, 0, 65534);
                                i8 = 6;
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(8)), composer4, 6);
                                androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainViewModel7.getPendingVideos(), (kotlin.coroutines.CoroutineContext) null, composer4, 8, 1);
                                AddURLScreen$lambda$05 = tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen$lambda$0(state);
                                for (final tool.wu.heng.data.model.VideoInfo videoInfo : AddURLScreen$lambda$05.getVideos()) {
                                    java.util.Iterator<T> it = invoke$lambda$5$lambda$4$lambda$0(collectAsState22).entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj2 = it.next();
                                            if (((java.util.Map.Entry) obj2).getValue() == videoInfo) {
                                                break;
                                            }
                                        } else {
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                                    final java.lang.String str = entry != null ? (java.lang.String) entry.getKey() : null;
                                    kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1
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
                                            tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                            tool.wu.heng.data.model.VideoInfo videoInfo2 = videoInfo;
                                            final android.content.Context context3 = context22;
                                            final kotlinx.coroutines.CoroutineScope coroutineScope3 = coroutineScope22;
                                            final androidx.compose.material3.SnackbarHostState snackbarHostState3 = snackbarHostState22;
                                            final tool.wu.heng.data.model.VideoInfo videoInfo3 = videoInfo;
                                            mainViewModel8.createDownload(videoInfo2, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.String str2) {
                                                    invoke2(str2);
                                                    return kotlin.Unit.INSTANCE;
                                                }

                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(java.lang.String taskId) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                    androidx.core.content.ContextCompat.startForegroundService(context3, tool.wu.heng.service.DownloadService.Companion.createIntent(context3, taskId));
                                                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope3, null, null, new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051(snackbarHostState3, videoInfo3, null), 3, null);
                                                }

                                                /* JADX INFO: Access modifiers changed from: package-private */
                                                /* compiled from: AddURLScreen.kt */
                                                @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                                                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1$1$1", f = "AddURLScreen.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
                                                /* renamed from: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1$1$1, reason: invalid class name and collision with other inner class name */
                                                /* loaded from: /workspace/.recovery/dex/classes3.dex */
                                                public static final class C00051 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                                                    final /* synthetic */ androidx.compose.material3.SnackbarHostState $snackbarHostState;
                                                    final /* synthetic */ tool.wu.heng.data.model.VideoInfo $video;
                                                    int label;

                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    C00051(androidx.compose.material3.SnackbarHostState snackbarHostState, tool.wu.heng.data.model.VideoInfo videoInfo, kotlin.coroutines.Continuation<? super tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051> continuation) {
                                                        super(2, continuation);
                                                        this.$snackbarHostState = snackbarHostState;
                                                        this.$video = videoInfo;
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                                                        return new tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051(this.$snackbarHostState, this.$video, continuation);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                                                        return ((tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$1.AnonymousClass1.C00051) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                                                    }

                                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                                                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                        int i = this.label;
                                                        if (i == 0) {
                                                            kotlin.ResultKt.throwOnFailure(obj);
                                                            androidx.compose.material3.SnackbarHostState snackbarHostState = this.$snackbarHostState;
                                                            java.lang.String title = this.$video.getTitle();
                                                            this.label = 1;
                                                            if (androidx.compose.material3.SnackbarHostState.showSnackbar$default(snackbarHostState, "已开始下载: " + title, (java.lang.String) null, false, (androidx.compose.material3.SnackbarDuration) null, this, 14, (java.lang.Object) null) == coroutine_suspended) {
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
                                            });
                                        }
                                    };
                                    composer4.startReplaceableGroup(-380017950);
                                    final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function13 = function12;
                                    boolean changed = composer4.changed(str) | composer4.changedInstance(function13);
                                    java.lang.Object rememberedValue4 = composer3.rememberedValue();
                                    if (changed || rememberedValue4 == androidx.compose.runtime.Composer.Companion.getEmpty()) {
                                        rememberedValue4 = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$3$1$1$3$2$1
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
                                                java.lang.String str2 = str;
                                                if (str2 != null) {
                                                    function13.invoke(str2);
                                                }
                                            }
                                        };
                                        composer4.updateRememberedValue(rememberedValue4);
                                    }
                                    composer3.endReplaceableGroup();
                                    tool.wu.heng.ui.screens.addurl.AddURLScreenKt.ParsedVideoCard(videoInfo, function0, (kotlin.jvm.functions.Function0) rememberedValue4, composer3, 8, 0);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer4, 6);
                                    function12 = function13;
                                }
                                composer3.endReplaceableGroup();
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), composer4, i8);
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
                                    return;
                                }
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                        }
                        composer4 = composer3;
                        i8 = i7;
                        composer3.endReplaceableGroup();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), composer4, i8);
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
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }

                private static final java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo> invoke$lambda$5$lambda$4$lambda$0(androidx.compose.runtime.State<? extends java.util.Map<java.lang.String, tool.wu.heng.data.model.VideoInfo>> state) {
                    return (java.util.Map) state.getValue();
                }
            }), composer2, 805309494, 500);
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
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$AddURLScreen$4
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
                    tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen(onNavigateBack, onNavigateToDetails, mainViewModel3, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String AddURLScreen$lambda$3(androidx.compose.runtime.MutableState<java.lang.String> mutableState) {
        return (java.lang.String) ((androidx.compose.runtime.State) mutableState).getValue();
    }

    public static final void ParsedVideoCard(final tool.wu.heng.data.model.VideoInfo video, final kotlin.jvm.functions.Function0<kotlin.Unit> onDownloadClick, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(video, "video");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDownloadClick, "onDownloadClick");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1401594338);
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02 = (i2 & 4) != 0 ? new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$ParsedVideoCard$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }
        } : function0;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1401594338, i, -1, "tool.wu.heng.ui.screens.addurl.ParsedVideoCard (AddURLScreen.kt:276)");
        }
        androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, androidx.compose.material3.CardDefaults.INSTANCE.cardElevation-aqJV_2Y(androidx.compose.ui.unit.Dp.constructor-impl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (androidx.compose.material3.CardDefaults.$stable << 18) | 6, 62), (androidx.compose.foundation.BorderStroke) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1977267792, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$ParsedVideoCard$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer2, java.lang.Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer2, int i3) {
                java.lang.String str;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1977267792, i3, -1, "tool.wu.heng.ui.screens.addurl.ParsedVideoCard.<anonymous> (AddURLScreen.kt:281)");
                    }
                    float f = 16;
                    androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f));
                    tool.wu.heng.data.model.VideoInfo videoInfo = tool.wu.heng.data.model.VideoInfo.this;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
                    kotlin.jvm.functions.Function0<kotlin.Unit> function04 = onDownloadClick;
                    composer2.startReplaceableGroup(-483455358);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
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
                    tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(videoInfo.getThumbnail(), null, androidx.compose.ui.unit.Dp.constructor-impl(160), false, composer2, 384, 10);
                    float f2 = 8;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), composer2, 6);
                    java.lang.String title = videoInfo.getTitle();
                    if (kotlin.text.StringsKt.isBlank(title)) {
                        title = "未命名视频";
                    }
                    androidx.compose.material3.TextKt.Text--4IGK_g(title, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 2, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer2, 0, 3120, 55294);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(f2)), composer2, 6);
                    androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                    androidx.compose.foundation.layout.Arrangement.Horizontal horizontal = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f));
                    composer2.startReplaceableGroup(693286680);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(horizontal, androidx.compose.ui.Alignment.Companion.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
                    androidx.compose.runtime.Updater.set-impl(composer4, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.set-impl(composer4, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer4.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer4.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                        composer4.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                        composer4.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.material3.TextKt.Text--4IGK_g("时长 " + videoInfo.humanReadableDuration(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer2, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    tool.wu.heng.data.model.QualityOption bestQuality = videoInfo.getBestQuality();
                    if (bestQuality == null || (str = bestQuality.qualityLabel()) == null) {
                        str = "未知画质";
                    }
                    androidx.compose.material3.TextKt.Text--4IGK_g(str, (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer2, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    composer2.startReplaceableGroup(-714329954);
                    if (!kotlin.text.StringsKt.isBlank(videoInfo.getSource())) {
                        androidx.compose.material3.TextKt.Text--4IGK_g(videoInfo.getSource(), (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer2, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer2, androidx.compose.material3.MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    }
                    composer2.endReplaceableGroup();
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(12)), composer2, 6);
                    androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null);
                    androidx.compose.foundation.layout.Arrangement.Horizontal horizontal2 = androidx.compose.foundation.layout.Arrangement.INSTANCE.spacedBy-0680j_4(androidx.compose.ui.unit.Dp.constructor-impl(f2));
                    composer2.startReplaceableGroup(693286680);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(horizontal2, androidx.compose.ui.Alignment.Companion.getTop(), composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    androidx.compose.runtime.ComposerKt.sourceInformation(composer2, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                    int currentCompositeKeyHash3 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    kotlin.jvm.functions.Function0 constructor3 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                    kotlin.jvm.functions.Function3 modifierMaterializerOf3 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(fillMaxWidth$default2);
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
                    androidx.compose.runtime.Updater.set-impl(composer5, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.set-impl(composer5, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                    kotlin.jvm.functions.Function2 setCompositeKeyHash3 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                    if (composer5.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer5.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash3))) {
                        composer5.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash3));
                        composer5.apply(java.lang.Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    modifierMaterializerOf3.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer2, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                    androidx.compose.foundation.layout.RowScope rowScope2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.material3.ButtonKt.TextButton(function03, androidx.compose.foundation.layout.RowScope.weight$default(rowScope2, androidx.compose.ui.Modifier.Companion, 1.0f, false, 2, (java.lang.Object) null), false, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1395getLambda8$app_release(), composer2, 805306368, 508);
                    androidx.compose.material3.ButtonKt.Button(function04, androidx.compose.foundation.layout.RowScope.weight$default(rowScope2, androidx.compose.ui.Modifier.Companion, 1.0f, false, 2, (java.lang.Object) null), false, (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.ButtonColors) null, (androidx.compose.material3.ButtonElevation) null, (androidx.compose.foundation.BorderStroke) null, (androidx.compose.foundation.layout.PaddingValues) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, tool.wu.heng.ui.screens.addurl.ComposableSingletons$AddURLScreenKt.INSTANCE.m1396getLambda9$app_release(), composer2, 805306368, 508);
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
        }), startRestartGroup, 196614, 22);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final kotlin.jvm.functions.Function0<kotlin.Unit> function03 = function02;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.addurl.AddURLScreenKt$ParsedVideoCard$3
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i3) {
                    tool.wu.heng.ui.screens.addurl.AddURLScreenKt.ParsedVideoCard(tool.wu.heng.data.model.VideoInfo.this, onDownloadClick, function03, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tool.wu.heng.viewmodel.MainViewModel.ParseUiState AddURLScreen$lambda$0(androidx.compose.runtime.State<tool.wu.heng.viewmodel.MainViewModel.ParseUiState> state) {
        return (tool.wu.heng.viewmodel.MainViewModel.ParseUiState) state.getValue();
    }
}
