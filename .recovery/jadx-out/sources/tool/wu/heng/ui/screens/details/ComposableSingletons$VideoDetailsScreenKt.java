package tool.wu.heng.ui.screens.details;

/* compiled from: VideoDetailsScreen.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ComposableSingletons$VideoDetailsScreenKt {
    public static final tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt INSTANCE = new tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f15lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1245242281, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1245242281, i, -1, "tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.lambda-1.<anonymous> (VideoDetailsScreen.kt:93)");
                }
                androidx.compose.material3.TextKt.Text--4IGK_g("视频详情", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, androidx.compose.ui.text.style.TextOverflow.Companion.getEllipsis-gIe3tQ8(), false, 1, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer, 6, 3120, 120830);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f16lambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-822380758, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt$lambda-2$1
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-822380758, i, -1, "tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.lambda-2.<anonymous> (VideoDetailsScreen.kt:101)");
            }
            androidx.compose.material3.IconKt.Icon-ww6aTOc(androidx.compose.material.icons.automirrored.filled.ArrowBackKt.getArrowBack(androidx.compose.material.icons.Icons.AutoMirrored.Filled.INSTANCE), "返回", (androidx.compose.ui.Modifier) null, 0L, composer, 48, 12);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f17lambda3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1363012339, false, new kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.foundation.lazy.LazyItemScope item, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1363012339, i, -1, "tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.lambda-3.<anonymous> (VideoDetailsScreen.kt:177)");
                }
                androidx.compose.material3.TextKt.Text--4IGK_g("画质选择", (androidx.compose.ui.Modifier) null, 0L, 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, androidx.compose.material3.MaterialTheme.INSTANCE.getTypography(composer, androidx.compose.material3.MaterialTheme.$stable).getTitleMedium(), composer, 6, 0, 65534);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f18lambda4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(3843767, false, new kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.layout.ColumnScope columnScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(columnScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.foundation.layout.ColumnScope Card, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Card, "$this$Card");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(3843767, i, -1, "tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.lambda-4.<anonymous> (VideoDetailsScreen.kt:186)");
                }
                androidx.compose.material3.TextKt.Text--4IGK_g("仅提供单一画质", androidx.compose.foundation.layout.PaddingKt.padding-3ABfNKs(androidx.compose.ui.Modifier.Companion, androidx.compose.ui.unit.Dp.constructor-impl(16)), androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, androidx.compose.material3.MaterialTheme.$stable).getOnSurfaceVariant-0d7_KjU(), 0L, (androidx.compose.ui.text.font.FontStyle) null, (androidx.compose.ui.text.font.FontWeight) null, (androidx.compose.ui.text.font.FontFamily) null, 0L, (androidx.compose.ui.text.style.TextDecoration) null, (androidx.compose.ui.text.style.TextAlign) null, 0L, 0, false, 0, 0, (kotlin.jvm.functions.Function1) null, (androidx.compose.ui.text.TextStyle) null, composer, 54, 0, 131064);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f19lambda5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1136057449, false, new kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt$lambda-5$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.foundation.lazy.LazyItemScope item, androidx.compose.runtime.Composer composer, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 81) != 16 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1136057449, i, -1, "tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.lambda-5.<anonymous> (VideoDetailsScreen.kt:185)");
                }
                androidx.compose.material3.CardKt.Card(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.Companion, 0.0f, 1, (java.lang.Object) null), (androidx.compose.ui.graphics.Shape) null, (androidx.compose.material3.CardColors) null, (androidx.compose.material3.CardElevation) null, (androidx.compose.foundation.BorderStroke) null, tool.wu.heng.ui.screens.details.ComposableSingletons$VideoDetailsScreenKt.INSTANCE.m1400getLambda4$app_release(), composer, 196614, 30);
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
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1397getLambda1$app_release() {
        return f15lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1398getLambda2$app_release() {
        return f16lambda2;
    }

    /* renamed from: getLambda-3$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1399getLambda3$app_release() {
        return f17lambda3;
    }

    /* renamed from: getLambda-4$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1400getLambda4$app_release() {
        return f18lambda4;
    }

    /* renamed from: getLambda-5$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function3<androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1401getLambda5$app_release() {
        return f19lambda5;
    }
}
