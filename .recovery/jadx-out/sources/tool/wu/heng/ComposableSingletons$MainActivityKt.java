package tool.wu.heng;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ComposableSingletons$MainActivityKt {
    public static final tool.wu.heng.ComposableSingletons$MainActivityKt INSTANCE = new tool.wu.heng.ComposableSingletons$MainActivityKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f4lambda1 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-145591046, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ComposableSingletons$MainActivityKt$lambda-1$1
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
                androidx.compose.runtime.ComposerKt.traceEventStart(-145591046, i, -1, "tool.wu.heng.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:65)");
            }
            tool.wu.heng.MainActivityKt.WuHengAppContent(null, composer, 0, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> f5lambda2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-498255566, false, new kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: tool.wu.heng.ComposableSingletons$MainActivityKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.runtime.Composer composer, java.lang.Integer num) {
            invoke(composer, num.intValue());
            return kotlin.Unit.INSTANCE;
        }

        public final void invoke(androidx.compose.runtime.Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-498255566, i, -1, "tool.wu.heng.ComposableSingletons$MainActivityKt.lambda-2.<anonymous> (MainActivity.kt:64)");
                }
                tool.wu.heng.ui.theme.ThemeKt.WuHengTheme(false, false, tool.wu.heng.ComposableSingletons$MainActivityKt.INSTANCE.m1375getLambda1$app_release(), composer, 384, 3);
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
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1375getLambda1$app_release() {
        return f4lambda1;
    }

    /* renamed from: getLambda-2$app_release, reason: not valid java name */
    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m1376getLambda2$app_release() {
        return f5lambda2;
    }
}
