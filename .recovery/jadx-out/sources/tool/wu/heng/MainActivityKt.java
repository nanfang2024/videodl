package tool.wu.heng;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005²\u0006\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u008a\u0084\u0002"}, d2 = {"WuHengAppContent", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "viewModel", "Ltool/wu/heng/viewmodel/MainViewModel;", "(Ltool/wu/heng/viewmodel/MainViewModel;Landroidx/compose/runtime/Composer;II)V", "app_release", "navBackStackEntry", "Landroidx/navigation/NavBackStackEntry;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MainActivityKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void WuHengAppContent(tool.wu.heng.viewmodel.MainViewModel mainViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel2;
        final tool.wu.heng.viewmodel.MainViewModel mainViewModel3;
        androidx.compose.runtime.Composer composer2;
        androidx.navigation.NavDestination destination;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-316918595);
        int i3 = i2 & 1;
        int i4 = i3 != 0 ? i | 2 : i;
        if (i3 == 1 && (i4 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            mainViewModel3 = mainViewModel;
            composer2 = startRestartGroup;
        } else {
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
                androidx.lifecycle.ViewModel viewModel = androidx.lifecycle.viewmodel.compose.ViewModelKt.viewModel(tool.wu.heng.viewmodel.MainViewModel.class, current, (java.lang.String) null, (androidx.lifecycle.ViewModelProvider.Factory) null, current instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory ? current.getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 36936, 0);
                startRestartGroup.endReplaceableGroup();
                i4 &= -15;
                mainViewModel2 = (tool.wu.heng.viewmodel.MainViewModel) viewModel;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-316918595, i4, -1, "tool.wu.heng.WuHengAppContent (MainActivity.kt:72)");
                }
                final androidx.navigation.NavController rememberNavController = androidx.navigation.compose.NavHostControllerKt.rememberNavController(new androidx.navigation.Navigator[0], startRestartGroup, 8);
                androidx.navigation.NavBackStackEntry WuHengAppContent$lambda$0 = WuHengAppContent$lambda$0(androidx.navigation.compose.NavHostControllerKt.currentBackStackEntryAsState(rememberNavController, startRestartGroup, 8));
                final java.lang.String route = (WuHengAppContent$lambda$0 != null || (destination = WuHengAppContent$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                final java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new tool.wu.heng.BottomNavItem[]{new tool.wu.heng.BottomNavItem("home", "首页", androidx.compose.material.icons.filled.HomeKt.getHome(androidx.compose.material.icons.Icons.INSTANCE.getDefault())), new tool.wu.heng.BottomNavItem("add_url", "添加", androidx.compose.material.icons.filled.AddKt.getAdd(androidx.compose.material.icons.Icons.INSTANCE.getDefault())), new tool.wu.heng.BottomNavItem("history", "下载", androidx.compose.material.icons.filled.DownloadKt.getDownload(androidx.compose.material.icons.Icons.INSTANCE.getDefault())), new tool.wu.heng.BottomNavItem("settings", "设置", androidx.compose.material.icons.filled.SettingsKt.getSettings(androidx.compose.material.icons.Icons.INSTANCE.getDefault()))});
                mainViewModel3 = mainViewModel2;
                composer2 = startRestartGroup;
                androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1497169922, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1
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
                        if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventStart(1497169922, i5, -1, "tool.wu.heng.WuHengAppContent.<anonymous> (MainActivity.kt:88)");
                            }
                            java.util.List<tool.wu.heng.BottomNavItem> list = listOf;
                            java.lang.String str = route;
                            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                                java.util.Iterator<T> it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(((tool.wu.heng.BottomNavItem) it.next()).getRoute(), str)) {
                                        final java.util.List<tool.wu.heng.BottomNavItem> list2 = listOf;
                                        final java.lang.String str2 = route;
                                        final androidx.navigation.NavHostController navHostController = rememberNavController;
                                        androidx.compose.material3.NavigationBarKt.NavigationBar-HsRjFd4((androidx.compose.ui.Modifier) null, 0L, 0L, 0.0f, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -1184711100, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                                invoke(rowScope, composer4, num.intValue());
                                                return kotlin.Unit.INSTANCE;
                                            }

                                            public final void invoke(androidx.compose.foundation.layout.RowScope NavigationBar, androidx.compose.runtime.Composer composer4, int i6) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
                                                int i7 = (i6 & 14) == 0 ? i6 | (composer4.changed(NavigationBar) ? 4 : 2) : i6;
                                                if ((i7 & 91) != 18 || !composer4.getSkipping()) {
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventStart(-1184711100, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous> (MainActivity.kt:90)");
                                                    }
                                                    java.util.List<tool.wu.heng.BottomNavItem> list3 = list2;
                                                    java.lang.String str3 = str2;
                                                    final androidx.navigation.NavHostController navHostController2 = navHostController;
                                                    for (final tool.wu.heng.BottomNavItem bottomNavItem : list3) {
                                                        androidx.compose.material3.NavigationBarKt.NavigationBarItem(NavigationBar, kotlin.jvm.internal.Intrinsics.areEqual(str3, bottomNavItem.getRoute()), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$1
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
                                                                navHostController2.navigate(bottomNavItem.getRoute(), new kotlin.jvm.functions.Function1<androidx.navigation.NavOptionsBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$1.1
                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.NavOptionsBuilder navOptionsBuilder) {
                                                                        invoke2(navOptionsBuilder);
                                                                        return kotlin.Unit.INSTANCE;
                                                                    }

                                                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                    public final void invoke2(androidx.navigation.NavOptionsBuilder navigate) {
                                                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                                                        navigate.popUpTo("home", new kotlin.jvm.functions.Function1<androidx.navigation.PopUpToBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.1.2.1.1.1.1
                                                                            @Override // kotlin.jvm.functions.Function1
                                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.PopUpToBuilder popUpToBuilder) {
                                                                                invoke2(popUpToBuilder);
                                                                                return kotlin.Unit.INSTANCE;
                                                                            }

                                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                            public final void invoke2(androidx.navigation.PopUpToBuilder popUpTo) {
                                                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                                                                                popUpTo.setSaveState(true);
                                                                            }
                                                                        });
                                                                        navigate.setLaunchSingleTop(true);
                                                                        navigate.setRestoreState(true);
                                                                    }
                                                                });
                                                            }
                                                        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1234996483, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$2
                                                            /* JADX INFO: Access modifiers changed from: package-private */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            public final void invoke(androidx.compose.runtime.Composer composer5, int i8) {
                                                                if ((i8 & 11) == 2 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1234996483, i8, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:93)");
                                                                }
                                                                androidx.compose.material3.IconKt.Icon-ww6aTOc(tool.wu.heng.BottomNavItem.this.getIcon(), tool.wu.heng.BottomNavItem.this.getLabel(), (androidx.compose.ui.Modifier) null, 0L, composer5, 0, 12);
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }), (androidx.compose.ui.Modifier) null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, 108616090, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$3
                                                            /* JADX INFO: Access modifiers changed from: package-private */
                                                            {
                                                                super(2);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                                invoke(composer5, num.intValue());
                                                                return kotlin.Unit.INSTANCE;
                                                            }

                                                            public final void invoke(androidx.compose.runtime.Composer composer5, int i8) {
                                                                if ((i8 & 11) == 2 && composer5.getSkipping()) {
                                                                    composer5.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventStart(108616090, i8, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:95)");
                                                                }
                                                                androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.BottomNavItem.this.getLabel(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer5, 0, 0, 131070);
                                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }), false, (androidx.compose.material3.NavigationBarItemColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, composer4, (i7 & 14) | 1575936, 472);
                                                        navHostController2 = navHostController2;
                                                        i7 = i7;
                                                        str3 = str3;
                                                    }
                                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 196608, 31);
                                        break;
                                    }
                                }
                            }
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1048739380, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2
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
                                androidx.compose.runtime.ComposerKt.traceEventStart(-1048739380, i6, -1, "tool.wu.heng.WuHengAppContent.<anonymous> (MainActivity.kt:110)");
                            }
                            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), paddingValues);
                            final androidx.navigation.NavHostController navHostController = rememberNavController;
                            final tool.wu.heng.viewmodel.MainViewModel mainViewModel4 = mainViewModel2;
                            composer3.startReplaceableGroup(733328855);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), false, composer3, 0);
                            composer3.startReplaceableGroup(-1323940314);
                            androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                            kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(padding);
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
                            androidx.navigation.compose.NavHostKt.NavHost(navHostController, "home", (androidx.compose.ui.Modifier) null, (androidx.compose.ui.Alignment) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, new kotlin.jvm.functions.Function1<androidx.navigation.NavGraphBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.NavGraphBuilder navGraphBuilder) {
                                    invoke2(navGraphBuilder);
                                    return kotlin.Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(androidx.navigation.NavGraphBuilder NavHost) {
                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel5 = tool.wu.heng.viewmodel.MainViewModel.this;
                                    final androidx.navigation.NavHostController navHostController2 = navHostController;
                                    androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "home", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1881709032, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1881709032, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:120)");
                                            }
                                            final androidx.navigation.NavHostController navHostController3 = navHostController2;
                                            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.1.1
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
                                                    androidx.navigation.NavController.navigate$default(navHostController3, "add_url", (androidx.navigation.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
                                                }
                                            };
                                            final androidx.navigation.NavHostController navHostController4 = navHostController2;
                                            tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen(function0, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.1.2
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
                                                public final void invoke2(java.lang.String taskId) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                    androidx.navigation.NavController.navigate$default(navHostController4, "video_details/" + taskId, (androidx.navigation.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
                                                }
                                            }, tool.wu.heng.viewmodel.MainViewModel.this, composer5, kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = tool.wu.heng.viewmodel.MainViewModel.this;
                                    final androidx.navigation.NavHostController navHostController3 = navHostController;
                                    androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "add_url", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-809862881, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-809862881, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:130)");
                                            }
                                            final androidx.navigation.NavHostController navHostController4 = navHostController3;
                                            kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.2.1
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
                                                    navHostController4.popBackStack();
                                                }
                                            };
                                            final androidx.navigation.NavHostController navHostController5 = navHostController3;
                                            tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen(function0, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.2.2
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
                                                public final void invoke2(java.lang.String taskId) {
                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                    androidx.navigation.NavController.navigate$default(navHostController5, "video_details/" + taskId, (androidx.navigation.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
                                                }
                                            }, tool.wu.heng.viewmodel.MainViewModel.this, composer5, kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = tool.wu.heng.viewmodel.MainViewModel.this;
                                    androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "history", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-161635424, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.3
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(-161635424, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:140)");
                                            }
                                            tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen(tool.wu.heng.viewmodel.MainViewModel.this, composer5, 8, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                    androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "settings", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(486592033, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.4
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(486592033, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:144)");
                                            }
                                            tool.wu.heng.ui.screens.settings.SettingsScreenKt.SettingsScreen(tool.wu.heng.viewmodel.MainViewModel.this, composer5, 8, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                    java.util.List listOf2 = kotlin.collections.CollectionsKt.listOf(androidx.navigation.NamedNavArgumentKt.navArgument("taskId", new kotlin.jvm.functions.Function1<androidx.navigation.NavArgumentBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.5
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.NavArgumentBuilder navArgumentBuilder) {
                                            invoke2(navArgumentBuilder);
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(androidx.navigation.NavArgumentBuilder navArgument) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
                                            navArgument.setType(androidx.navigation.NavType.StringType);
                                        }
                                    }));
                                    final tool.wu.heng.viewmodel.MainViewModel mainViewModel9 = tool.wu.heng.viewmodel.MainViewModel.this;
                                    final androidx.navigation.NavHostController navHostController4 = navHostController;
                                    androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "video_details/{taskId}", listOf2, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1134819490, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                            invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry backStackEntry, androidx.compose.runtime.Composer composer5, int i7) {
                                            java.lang.String string;
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventStart(1134819490, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:151)");
                                            }
                                            android.os.Bundle arguments = backStackEntry.getArguments();
                                            if (arguments == null || (string = arguments.getString("taskId")) == null) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            } else {
                                                final androidx.navigation.NavHostController navHostController5 = navHostController4;
                                                tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen(string, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.6.1
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
                                                        navHostController5.popBackStack();
                                                    }
                                                }, tool.wu.heng.viewmodel.MainViewModel.this, composer5, kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE, 0);
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }
                                    }), 124, (java.lang.Object) null);
                                }
                            }, composer3, 56, 508);
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
                }), startRestartGroup, 805306758, 506);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            mainViewModel2 = mainViewModel;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            final androidx.navigation.NavHostController rememberNavController2 = androidx.navigation.compose.NavHostControllerKt.rememberNavController(new androidx.navigation.Navigator[0], startRestartGroup, 8);
            androidx.navigation.NavBackStackEntry WuHengAppContent$lambda$02 = WuHengAppContent$lambda$0(androidx.navigation.compose.NavHostControllerKt.currentBackStackEntryAsState(rememberNavController2, startRestartGroup, 8));
            if (WuHengAppContent$lambda$02 != null) {
            }
            final java.util.List<tool.wu.heng.BottomNavItem> listOf2 = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new tool.wu.heng.BottomNavItem[]{new tool.wu.heng.BottomNavItem("home", "首页", androidx.compose.material.icons.filled.HomeKt.getHome(androidx.compose.material.icons.Icons.INSTANCE.getDefault())), new tool.wu.heng.BottomNavItem("add_url", "添加", androidx.compose.material.icons.filled.AddKt.getAdd(androidx.compose.material.icons.Icons.INSTANCE.getDefault())), new tool.wu.heng.BottomNavItem("history", "下载", androidx.compose.material.icons.filled.DownloadKt.getDownload(androidx.compose.material.icons.Icons.INSTANCE.getDefault())), new tool.wu.heng.BottomNavItem("settings", "设置", androidx.compose.material.icons.filled.SettingsKt.getSettings(androidx.compose.material.icons.Icons.INSTANCE.getDefault()))});
            mainViewModel3 = mainViewModel2;
            composer2 = startRestartGroup;
            androidx.compose.material3.ScaffoldKt.Scaffold-TvnljyQ(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (kotlin.jvm.functions.Function2) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, 1497169922, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1
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
                    if ((i5 & 11) != 2 || !composer3.getSkipping()) {
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1497169922, i5, -1, "tool.wu.heng.WuHengAppContent.<anonymous> (MainActivity.kt:88)");
                        }
                        java.util.List<tool.wu.heng.BottomNavItem> list = listOf2;
                        java.lang.String str = route;
                        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                            java.util.Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (kotlin.jvm.internal.Intrinsics.areEqual(((tool.wu.heng.BottomNavItem) it.next()).getRoute(), str)) {
                                    final java.util.List<tool.wu.heng.BottomNavItem> list2 = listOf2;
                                    final java.lang.String str2 = route;
                                    final androidx.navigation.NavHostController navHostController = rememberNavController2;
                                    androidx.compose.material3.NavigationBarKt.NavigationBar-HsRjFd4((androidx.compose.ui.Modifier) null, 0L, 0L, 0.0f, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer3, -1184711100, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.RowScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.RowScope rowScope, androidx.compose.runtime.Composer composer4, java.lang.Integer num) {
                                            invoke(rowScope, composer4, num.intValue());
                                            return kotlin.Unit.INSTANCE;
                                        }

                                        public final void invoke(androidx.compose.foundation.layout.RowScope NavigationBar, androidx.compose.runtime.Composer composer4, int i6) {
                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
                                            int i7 = (i6 & 14) == 0 ? i6 | (composer4.changed(NavigationBar) ? 4 : 2) : i6;
                                            if ((i7 & 91) != 18 || !composer4.getSkipping()) {
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1184711100, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous> (MainActivity.kt:90)");
                                                }
                                                java.util.List<tool.wu.heng.BottomNavItem> list3 = list2;
                                                java.lang.String str3 = str2;
                                                final androidx.navigation.NavHostController navHostController2 = navHostController;
                                                for (final tool.wu.heng.BottomNavItem bottomNavItem : list3) {
                                                    androidx.compose.material3.NavigationBarKt.NavigationBarItem(NavigationBar, kotlin.jvm.internal.Intrinsics.areEqual(str3, bottomNavItem.getRoute()), new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$1
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
                                                            navHostController2.navigate(bottomNavItem.getRoute(), new kotlin.jvm.functions.Function1<androidx.navigation.NavOptionsBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$1.1
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.NavOptionsBuilder navOptionsBuilder) {
                                                                    invoke2(navOptionsBuilder);
                                                                    return kotlin.Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(androidx.navigation.NavOptionsBuilder navigate) {
                                                                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                                                                    navigate.popUpTo("home", new kotlin.jvm.functions.Function1<androidx.navigation.PopUpToBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.1.2.1.1.1.1
                                                                        @Override // kotlin.jvm.functions.Function1
                                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.PopUpToBuilder popUpToBuilder) {
                                                                            invoke2(popUpToBuilder);
                                                                            return kotlin.Unit.INSTANCE;
                                                                        }

                                                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                        public final void invoke2(androidx.navigation.PopUpToBuilder popUpTo) {
                                                                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                                                                            popUpTo.setSaveState(true);
                                                                        }
                                                                    });
                                                                    navigate.setLaunchSingleTop(true);
                                                                    navigate.setRestoreState(true);
                                                                }
                                                            });
                                                        }
                                                    }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, -1234996483, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$2
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i8) {
                                                            if ((i8 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(-1234996483, i8, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:93)");
                                                            }
                                                            androidx.compose.material3.IconKt.Icon-ww6aTOc(tool.wu.heng.BottomNavItem.this.getIcon(), tool.wu.heng.BottomNavItem.this.getLabel(), (androidx.compose.ui.Modifier) null, 0L, composer5, 0, 12);
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }), (androidx.compose.ui.Modifier) null, false, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(composer4, 108616090, true, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$1$2$1$3
                                                        /* JADX INFO: Access modifiers changed from: package-private */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                                            invoke(composer5, num.intValue());
                                                            return kotlin.Unit.INSTANCE;
                                                        }

                                                        public final void invoke(androidx.compose.runtime.Composer composer5, int i8) {
                                                            if ((i8 & 11) == 2 && composer5.getSkipping()) {
                                                                composer5.skipToGroupEnd();
                                                                return;
                                                            }
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventStart(108616090, i8, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:95)");
                                                            }
                                                            androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.BottomNavItem.this.getLabel(), (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer5, 0, 0, 131070);
                                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                            }
                                                        }
                                                    }), false, (androidx.compose.material3.NavigationBarItemColors) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, composer4, (i7 & 14) | 1575936, 472);
                                                    navHostController2 = navHostController2;
                                                    i7 = i7;
                                                    str3 = str3;
                                                }
                                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer4.skipToGroupEnd();
                                        }
                                    }), composer3, 196608, 31);
                                    break;
                                }
                            }
                        }
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }), (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function2) null, 0, 0L, 0L, (androidx.compose.foundation.layout.WindowInsets) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(startRestartGroup, -1048739380, true, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2
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
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1048739380, i6, -1, "tool.wu.heng.WuHengAppContent.<anonymous> (MainActivity.kt:110)");
                        }
                        androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), paddingValues);
                        final androidx.navigation.NavHostController navHostController = rememberNavController2;
                        final tool.wu.heng.viewmodel.MainViewModel mainViewModel4 = mainViewModel2;
                        composer3.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(androidx.compose.ui.Alignment.Companion.getTopStart(), false, composer3, 0);
                        composer3.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(composer3, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(padding);
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
                        androidx.navigation.compose.NavHostKt.NavHost(navHostController, "home", (androidx.compose.ui.Modifier) null, (androidx.compose.ui.Alignment) null, (java.lang.String) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, new kotlin.jvm.functions.Function1<androidx.navigation.NavGraphBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1
                            /* JADX INFO: Access modifiers changed from: package-private */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.NavGraphBuilder navGraphBuilder) {
                                invoke2(navGraphBuilder);
                                return kotlin.Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(androidx.navigation.NavGraphBuilder NavHost) {
                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel5 = tool.wu.heng.viewmodel.MainViewModel.this;
                                final androidx.navigation.NavHostController navHostController2 = navHostController;
                                androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "home", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1881709032, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1881709032, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:120)");
                                        }
                                        final androidx.navigation.NavHostController navHostController3 = navHostController2;
                                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.1.1
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
                                                androidx.navigation.NavController.navigate$default(navHostController3, "add_url", (androidx.navigation.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
                                            }
                                        };
                                        final androidx.navigation.NavHostController navHostController4 = navHostController2;
                                        tool.wu.heng.ui.screens.home.HomeScreenKt.HomeScreen(function0, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.1.2
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
                                            public final void invoke2(java.lang.String taskId) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                androidx.navigation.NavController.navigate$default(navHostController4, "video_details/" + taskId, (androidx.navigation.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
                                            }
                                        }, tool.wu.heng.viewmodel.MainViewModel.this, composer5, kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE, 0);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel6 = tool.wu.heng.viewmodel.MainViewModel.this;
                                final androidx.navigation.NavHostController navHostController3 = navHostController;
                                androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "add_url", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-809862881, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-809862881, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:130)");
                                        }
                                        final androidx.navigation.NavHostController navHostController4 = navHostController3;
                                        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.2.1
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
                                                navHostController4.popBackStack();
                                            }
                                        };
                                        final androidx.navigation.NavHostController navHostController5 = navHostController3;
                                        tool.wu.heng.ui.screens.addurl.AddURLScreenKt.AddURLScreen(function0, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.2.2
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
                                            public final void invoke2(java.lang.String taskId) {
                                                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskId, "taskId");
                                                androidx.navigation.NavController.navigate$default(navHostController5, "video_details/" + taskId, (androidx.navigation.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
                                            }
                                        }, tool.wu.heng.viewmodel.MainViewModel.this, composer5, kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE, 0);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel7 = tool.wu.heng.viewmodel.MainViewModel.this;
                                androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "history", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-161635424, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.3
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(-161635424, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:140)");
                                        }
                                        tool.wu.heng.ui.screens.history.DownloadHistoryScreenKt.DownloadHistoryScreen(tool.wu.heng.viewmodel.MainViewModel.this, composer5, 8, 0);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel8 = tool.wu.heng.viewmodel.MainViewModel.this;
                                androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "settings", (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(486592033, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.4
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry it, androidx.compose.runtime.Composer composer5, int i7) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(486592033, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:144)");
                                        }
                                        tool.wu.heng.ui.screens.settings.SettingsScreenKt.SettingsScreen(tool.wu.heng.viewmodel.MainViewModel.this, composer5, 8, 0);
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                                        }
                                    }
                                }), okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT, (java.lang.Object) null);
                                java.util.List listOf22 = kotlin.collections.CollectionsKt.listOf(androidx.navigation.NamedNavArgumentKt.navArgument("taskId", new kotlin.jvm.functions.Function1<androidx.navigation.NavArgumentBuilder, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.5
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.navigation.NavArgumentBuilder navArgumentBuilder) {
                                        invoke2(navArgumentBuilder);
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(androidx.navigation.NavArgumentBuilder navArgument) {
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
                                        navArgument.setType(androidx.navigation.NavType.StringType);
                                    }
                                }));
                                final tool.wu.heng.viewmodel.MainViewModel mainViewModel9 = tool.wu.heng.viewmodel.MainViewModel.this;
                                final androidx.navigation.NavHostController navHostController4 = navHostController;
                                androidx.navigation.compose.NavGraphBuilderKt.composable$default(NavHost, "video_details/{taskId}", listOf22, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1134819490, true, new kotlin.jvm.functions.Function4<androidx.compose.animation.AnimatedContentScope, androidx.navigation.NavBackStackEntry, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$2$1$1.6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.navigation.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer5, java.lang.Integer num) {
                                        invoke(animatedContentScope, navBackStackEntry, composer5, num.intValue());
                                        return kotlin.Unit.INSTANCE;
                                    }

                                    public final void invoke(androidx.compose.animation.AnimatedContentScope composable, androidx.navigation.NavBackStackEntry backStackEntry, androidx.compose.runtime.Composer composer5, int i7) {
                                        java.lang.String string;
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(composable, "$this$composable");
                                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
                                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                            androidx.compose.runtime.ComposerKt.traceEventStart(1134819490, i7, -1, "tool.wu.heng.WuHengAppContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:151)");
                                        }
                                        android.os.Bundle arguments = backStackEntry.getArguments();
                                        if (arguments == null || (string = arguments.getString("taskId")) == null) {
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        } else {
                                            final androidx.navigation.NavHostController navHostController5 = navHostController4;
                                            tool.wu.heng.ui.screens.details.VideoDetailsScreenKt.VideoDetailsScreen(string, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt.WuHengAppContent.2.1.1.6.1
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
                                                    navHostController5.popBackStack();
                                                }
                                            }, tool.wu.heng.viewmodel.MainViewModel.this, composer5, kotlin.io.ConstantsKt.MINIMUM_BLOCK_SIZE, 0);
                                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                                androidx.compose.runtime.ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }
                                }), 124, (java.lang.Object) null);
                            }
                        }, composer3, 56, 508);
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
            }), startRestartGroup, 805306758, 506);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.MainActivityKt$WuHengAppContent$3
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
                    tool.wu.heng.MainActivityKt.WuHengAppContent(tool.wu.heng.viewmodel.MainViewModel.this, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    private static final androidx.navigation.NavBackStackEntry WuHengAppContent$lambda$0(androidx.compose.runtime.State<androidx.navigation.NavBackStackEntry> state) {
        return (androidx.navigation.NavBackStackEntry) state.getValue();
    }
}
