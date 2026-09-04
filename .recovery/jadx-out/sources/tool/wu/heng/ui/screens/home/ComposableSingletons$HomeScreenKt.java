package tool.wu.heng.ui.screens.home;

/* compiled from: HomeScreen.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ComposableSingletons$HomeScreenKt {
    public static final tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt INSTANCE = new tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f26lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2084434768, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2084434768, i, -1, "tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda-1.<anonymous> (HomeScreen.kt:60)");
            }
            androidx.compose.material3.TextKt.Text--4IGK_g(tool.wu.heng.service.DownloadService.SUB_DIR, (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer, 6, 0, 131070);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f27lambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(941222644, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(941222644, i, -1, "tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda-2.<anonymous> (HomeScreen.kt:59)");
                }
                androidx.compose.material3.AppBarKt.TopAppBar(tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.INSTANCE.m1408getLambda1$app_release(), (androidx.compose.ui.Modifier) null, (kotlin.jvm.functions.Function2) null, (kotlin.jvm.functions.Function3) null, (androidx.compose.foundation.layout.WindowInsets) null, (androidx.compose.material3.TopAppBarColors) null, (androidx.compose.material3.TopAppBarScrollBehavior) null, composer, 6, okhttp3.internal.ws.WebSocketProtocol.PAYLOAD_SHORT);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f28lambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1373461975, false, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(columnScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1373461975, i, -1, "tool.wu.heng.ui.screens.home.ComposableSingletons$HomeScreenKt.lambda-3.<anonymous> (HomeScreen.kt:80)");
                }
                androidx.compose.ui.Modifier modifier = androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), androidx.compose.ui.unit.Dp.constructor-impl(20));
                androidx.compose.ui.Alignment.Vertical centerVertically = androidx.compose.ui.Alignment.Companion.getCenterVertically();
                composer.startReplaceableGroup(693286680);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(Row)P(2,1,3)90@4553L58,91@4616L130:Row.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
                composer.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier);
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer composer2 = androidx.compose.runtime.Updater.constructor-impl(composer);
                androidx.compose.runtime.Updater.set-impl(composer2, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(composer2, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                    composer2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                    composer2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -326681643, "C92@4661L9:Row.kt#2w3rfo");
                androidx.compose.foundation.layout.RowScope rowScope = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.AddKt.getAdd(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(40)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), composer, 432, 0);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.width-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(16)), composer, 6);
                composer.startReplaceableGroup(-483455358);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(Column)P(2,3,1)77@3865L61,78@3931L133:Column.kt#2w3rfo");
                androidx.compose.ui.Modifier modifier2 = androidx.compose.ui.Modifier.Companion;
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.Companion.getStart(), composer, 0);
                composer.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(composer, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier2);
                if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                androidx.compose.runtime.Composer composer3 = androidx.compose.runtime.Updater.constructor-impl(composer);
                androidx.compose.runtime.Updater.set-impl(composer3, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(composer3, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (composer3.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer3.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash2))) {
                    composer3.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash2));
                    composer3.apply(java.lang.Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(composer)), composer, 0);
                composer.startReplaceableGroup(2058660585);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 276693656, "C79@3979L9:Column.kt#2w3rfo");
                androidx.compose.foundation.layout.ColumnScope columnScope = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                androidx.compose.material3.TextKt.Text--4IGK_g("添加视频链接", (androidx.compose.ui.Modifier) null, androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), androidx.compose.ui.unit.TextUnitKt.getSp(18), (androidx.compose.ui.text.font.FontStyle) null, androidx.compose.ui.text.font.FontWeight.Companion.getBold(), (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer, 199686, 0, 131026);
                androidx.compose.material3.TextKt.Text--4IGK_g("粘贴链接，解析并下载视频", (androidx.compose.ui.Modifier) null, androidx.compose.ui.graphics.Color.copy-wmQWz5c$default(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnPrimaryContainer-0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14, (java.lang.Object) null), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer, androidx.compose.material3.MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceableGroup();
                composer.endNode();
                composer.endReplaceableGroup();
                composer.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1408getLambda1$app_release() {
        return f26lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1409getLambda2$app_release() {
        return f27lambda2;
    }

    /* renamed from: getLambda-3$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1410getLambda3$app_release() {
        return f28lambda3;
    }
}
