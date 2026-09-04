package tool.wu.heng.ui.components;

/* compiled from: ThumbnailImage.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a:\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"ThumbnailImage", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "thumbnailUrl", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "modifier", "Landroidx/compose/ui/Modifier;", "height", "Landroidx/compose/ui/unit/Dp;", "isLoading", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "ThumbnailImage-942rkJo", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;FZLandroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ThumbnailImageKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0049  */
    /* renamed from: ThumbnailImage-942rkJo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1387ThumbnailImage942rkJo(final java.lang.String str, androidx.compose.ui.Modifier modifier, float f, boolean z, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        float f2;
        int i5;
        boolean z2;
        boolean z3;
        int currentCompositeKeyHash;
        androidx.compose.runtime.Composer composer2;
        float f3;
        androidx.compose.ui.Modifier modifier3;
        final float f4;
        final boolean z4;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(599042788);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                f2 = f;
                i3 |= startRestartGroup.changed(f2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    z2 = z;
                    i3 |= startRestartGroup.changed(z2) ? 2048 : 1024;
                    if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                        androidx.compose.ui.Modifier modifier4 = i6 == 0 ? (androidx.compose.ui.Modifier) androidx.compose.ui.Modifier.Companion : modifier2;
                        float f5 = i4 == 0 ? androidx.compose.ui.unit.Dp.constructor-impl(180) : f2;
                        z3 = i5 == 0 ? false : z2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(599042788, i3, -1, "tool.wu.heng.ui.components.ThumbnailImage (ThumbnailImage.kt:33)");
                        }
                        androidx.compose.runtime.CompositionLocal localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                        java.lang.Object consume = startRestartGroup.consume(localContext);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        android.content.Context context = (android.content.Context) consume;
                        androidx.compose.ui.Modifier modifier5 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, (java.lang.Object) null), f5), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (androidx.compose.ui.graphics.Shape) null, 2, (java.lang.Object) null);
                        androidx.compose.ui.Alignment center = androidx.compose.ui.Alignment.Companion.getCenter();
                        startRestartGroup.startReplaceableGroup(733328855);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center, false, startRestartGroup, 6);
                        startRestartGroup.startReplaceableGroup(-1323940314);
                        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        kotlin.jvm.functions.Function0 constructor = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                        kotlin.jvm.functions.Function3 modifierMaterializerOf = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier5);
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (!startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor);
                        } else {
                            startRestartGroup.useNode();
                        }
                        composer2 = androidx.compose.runtime.Updater.constructor-impl(startRestartGroup);
                        androidx.compose.runtime.Updater.set-impl(composer2, rememberBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.set-impl(composer2, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                        kotlin.jvm.functions.Function2 setCompositeKeyHash = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                        if (!composer2.getInserting() || !kotlin.jvm.internal.Intrinsics.areEqual(composer2.rememberedValue(), java.lang.Integer.valueOf(currentCompositeKeyHash))) {
                            composer2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                            composer2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        modifierMaterializerOf.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(startRestartGroup)), startRestartGroup, 0);
                        startRestartGroup.startReplaceableGroup(2058660585);
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                        androidx.compose.foundation.layout.BoxScope boxScope = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        if (!z3) {
                            startRestartGroup.startReplaceableGroup(-349283435);
                            f3 = f5;
                            modifier3 = modifier4;
                            androidx.compose.material3.ProgressIndicatorKt.CircularProgressIndicator-LxG7B9w(androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(32)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getPrimary-0d7_KjU(), androidx.compose.ui.unit.Dp.constructor-impl(2), 0L, 0, startRestartGroup, 390, 24);
                            startRestartGroup.endReplaceableGroup();
                        } else {
                            f3 = f5;
                            modifier3 = modifier4;
                            java.lang.String str2 = str;
                            if (str2 != null && !kotlin.text.StringsKt.isBlank(str2)) {
                                startRestartGroup.startReplaceableGroup(-349283187);
                                coil.compose.SingletonAsyncImageKt.AsyncImage-3HmZ8SU(new coil.request.ImageRequest.Builder(context).data(str).crossfade(true).build(), "缩略图", androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.Alignment) null, androidx.compose.ui.layout.ContentScale.Companion.getCrop(), 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, 0, startRestartGroup, 1573304, 952);
                                startRestartGroup.endReplaceableGroup();
                            } else {
                                startRestartGroup.startReplaceableGroup(-349282827);
                                androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.filled.VideoLibraryKt.getVideoLibrary(androidx.compose.material.icons.Icons.INSTANCE.getDefault()), (java.lang.String) null, androidx.compose.foundation.layout.SizeKt.size-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(48)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getOutline-0d7_KjU(), startRestartGroup, 432, 0);
                                startRestartGroup.endReplaceableGroup();
                            }
                        }
                        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceableGroup();
                        startRestartGroup.endReplaceableGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        f4 = f3;
                        z4 = z3;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        f4 = f2;
                        z4 = z2;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        final androidx.compose.ui.Modifier modifier6 = modifier3;
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.components.ThumbnailImageKt$ThumbnailImage$2
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

                            public final void invoke(androidx.compose.runtime.Composer composer3, int i7) {
                                tool.wu.heng.ui.components.ThumbnailImageKt.m1387ThumbnailImage942rkJo(str, modifier6, f4, z4, composer3, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                z2 = z;
                if ((i3 & 5851) == 1170) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.CompositionLocal localContext2 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume2 = startRestartGroup.consume(localContext2);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                android.content.Context context2 = (android.content.Context) consume2;
                androidx.compose.ui.Modifier modifier52 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, (java.lang.Object) null), f5), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (androidx.compose.ui.graphics.Shape) null, 2, (java.lang.Object) null);
                androidx.compose.ui.Alignment center2 = androidx.compose.ui.Alignment.Companion.getCenter();
                startRestartGroup.startReplaceableGroup(733328855);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
                androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center2, false, startRestartGroup, 6);
                startRestartGroup.startReplaceableGroup(-1323940314);
                androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
                currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                kotlin.jvm.functions.Function0 constructor2 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
                kotlin.jvm.functions.Function3 modifierMaterializerOf2 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier52);
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                }
                composer2 = androidx.compose.runtime.Updater.constructor-impl(startRestartGroup);
                androidx.compose.runtime.Updater.set-impl(composer2, rememberBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.set-impl(composer2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
                kotlin.jvm.functions.Function2 setCompositeKeyHash2 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
                if (!composer2.getInserting()) {
                }
                composer2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
                composer2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                modifierMaterializerOf2.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(startRestartGroup)), startRestartGroup, 0);
                startRestartGroup.startReplaceableGroup(2058660585);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
                androidx.compose.foundation.layout.BoxScope boxScope2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (!z3) {
                }
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endNode();
                startRestartGroup.endReplaceableGroup();
                startRestartGroup.endReplaceableGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                f4 = f3;
                z4 = z3;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            f2 = f;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            z2 = z;
            if ((i3 & 5851) == 1170) {
            }
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.CompositionLocal localContext22 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            java.lang.Object consume22 = startRestartGroup.consume(localContext22);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            android.content.Context context22 = (android.content.Context) consume22;
            androidx.compose.ui.Modifier modifier522 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, (java.lang.Object) null), f5), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (androidx.compose.ui.graphics.Shape) null, 2, (java.lang.Object) null);
            androidx.compose.ui.Alignment center22 = androidx.compose.ui.Alignment.Companion.getCenter();
            startRestartGroup.startReplaceableGroup(733328855);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
            androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center22, false, startRestartGroup, 6);
            startRestartGroup.startReplaceableGroup(-1323940314);
            androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
            currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            kotlin.jvm.functions.Function0 constructor22 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
            kotlin.jvm.functions.Function3 modifierMaterializerOf22 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier522);
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
            }
            composer2 = androidx.compose.runtime.Updater.constructor-impl(startRestartGroup);
            androidx.compose.runtime.Updater.set-impl(composer2, rememberBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.set-impl(composer2, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
            kotlin.jvm.functions.Function2 setCompositeKeyHash22 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
            if (!composer2.getInserting()) {
            }
            composer2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
            composer2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
            modifierMaterializerOf22.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
            androidx.compose.foundation.layout.BoxScope boxScope22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            if (!z3) {
            }
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            f4 = f3;
            z4 = z3;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f2 = f;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        z2 = z;
        if ((i3 & 5851) == 1170) {
        }
        if (i6 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        androidx.compose.runtime.CompositionLocal localContext222 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume222 = startRestartGroup.consume(localContext222);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        android.content.Context context222 = (android.content.Context) consume222;
        androidx.compose.ui.Modifier modifier5222 = androidx.compose.foundation.BackgroundKt.background-bw27NRU$default(androidx.compose.foundation.layout.SizeKt.height-3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, (java.lang.Object) null), f5), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, androidx.compose.material3.MaterialTheme.$stable).getSurfaceVariant-0d7_KjU(), (androidx.compose.ui.graphics.Shape) null, 2, (java.lang.Object) null);
        androidx.compose.ui.Alignment center222 = androidx.compose.ui.Alignment.Companion.getCenter();
        startRestartGroup.startReplaceableGroup(733328855);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Box)P(2,1,3)71@3309L67,72@3381L130:Box.kt#2w3rfo");
        androidx.compose.ui.layout.MeasurePolicy rememberBoxMeasurePolicy222 = androidx.compose.foundation.layout.BoxKt.rememberBoxMeasurePolicy(center222, false, startRestartGroup, 6);
        startRestartGroup.startReplaceableGroup(-1323940314);
        androidx.compose.runtime.ComposerKt.sourceInformation(startRestartGroup, "CC(Layout)P(!1,2)78@3182L23,80@3272L420:Layout.kt#80mrfh");
        currentCompositeKeyHash = androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        kotlin.jvm.functions.Function0 constructor222 = androidx.compose.ui.node.ComposeUiNode.Companion.getConstructor();
        kotlin.jvm.functions.Function3 modifierMaterializerOf222 = androidx.compose.ui.layout.LayoutKt.modifierMaterializerOf(modifier5222);
        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        composer2 = androidx.compose.runtime.Updater.constructor-impl(startRestartGroup);
        androidx.compose.runtime.Updater.set-impl(composer2, rememberBoxMeasurePolicy222, androidx.compose.ui.node.ComposeUiNode.Companion.getSetMeasurePolicy());
        androidx.compose.runtime.Updater.set-impl(composer2, currentCompositionLocalMap222, androidx.compose.ui.node.ComposeUiNode.Companion.getSetResolvedCompositionLocals());
        kotlin.jvm.functions.Function2 setCompositeKeyHash222 = androidx.compose.ui.node.ComposeUiNode.Companion.getSetCompositeKeyHash();
        if (!composer2.getInserting()) {
        }
        composer2.updateRememberedValue(java.lang.Integer.valueOf(currentCompositeKeyHash));
        composer2.apply(java.lang.Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash222);
        modifierMaterializerOf222.invoke(androidx.compose.runtime.SkippableUpdater.box-impl(androidx.compose.runtime.SkippableUpdater.constructor-impl(startRestartGroup)), startRestartGroup, 0);
        startRestartGroup.startReplaceableGroup(2058660585);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1253629263, "C73@3426L9:Box.kt#2w3rfo");
        androidx.compose.foundation.layout.BoxScope boxScope222 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
        if (!z3) {
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        startRestartGroup.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
        }
        f4 = f3;
        z4 = z3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }
}
