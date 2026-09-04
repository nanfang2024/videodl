package tool.wu.heng.ui.theme;

/* compiled from: Theme.kt */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DarkColorScheme", "Landroidx/compose/material3/ColorScheme;", "LightColorScheme", "WuHengTheme", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "darkTheme", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ThemeKt {
    private static final androidx.compose.material3.ColorScheme DarkColorScheme = androidx.compose.material3.ColorSchemeKt.darkColorScheme-C-Xl9yA$default(tool.wu.heng.ui.theme.ColorKt.getPurple80(), 0, 0, 0, 0, tool.wu.heng.ui.theme.ColorKt.getPurpleGrey80(), 0, 0, 0, tool.wu.heng.ui.theme.ColorKt.getPink80(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, (java.lang.Object) null);
    private static final androidx.compose.material3.ColorScheme LightColorScheme = androidx.compose.material3.ColorSchemeKt.lightColorScheme-C-Xl9yA$default(tool.wu.heng.ui.theme.ColorKt.getPurple40(), 0, 0, 0, 0, tool.wu.heng.ui.theme.ColorKt.getPurpleGrey40(), 0, 0, 0, tool.wu.heng.ui.theme.ColorKt.getPink40(), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -546, 15, (java.lang.Object) null);

    public static final void WuHengTheme(boolean z, boolean z2, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> content, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.material3.ColorScheme colorScheme;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "content");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-866830037);
        if ((i & 14) == 0) {
            i3 = (((i2 & 1) == 0 && startRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = androidx.compose.foundation.DarkThemeKt.isSystemInDarkTheme(startRestartGroup, 0);
                    i3 &= -15;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-866830037, i3, -1, "tool.wu.heng.ui.theme.WuHengTheme (Theme.kt:33)");
            }
            startRestartGroup.startReplaceableGroup(764044324);
            if (!z2 || android.os.Build.VERSION.SDK_INT < 31) {
                colorScheme = z ? DarkColorScheme : LightColorScheme;
            } else {
                androidx.compose.runtime.CompositionLocal localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                java.lang.Object consume = startRestartGroup.consume(localContext);
                androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                android.content.Context context = (android.content.Context) consume;
                colorScheme = z ? androidx.compose.material3.DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : androidx.compose.material3.DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            }
            startRestartGroup.endReplaceableGroup();
            androidx.compose.material3.MaterialThemeKt.MaterialTheme(colorScheme, (androidx.compose.material3.Shapes) null, tool.wu.heng.ui.theme.TypeKt.getTypography(), content, startRestartGroup, ((i3 << 3) & 7168) | 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final boolean z3 = z;
        final boolean z4 = z2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.theme.ThemeKt$WuHengTheme$1
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

                public final void invoke(androidx.compose.runtime.Composer composer2, int i5) {
                    tool.wu.heng.ui.theme.ThemeKt.WuHengTheme(z3, z4, content, composer2, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }
}
