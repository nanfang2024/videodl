package tool.wu.heng;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014R(\u0010\u0003\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006 \u0007*\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Ltool/wu/heng/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "permissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlin.jvm.PlatformType", "onCreate", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class MainActivity extends androidx.activity.ComponentActivity {
    public static final int $stable = 8;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionLauncher;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void permissionLauncher$lambda$0(java.util.Map map) {
    }

    public MainActivity() {
        androidx.activity.result.ActivityResultLauncher<java.lang.String[]> registerForActivityResult = registerForActivityResult((androidx.activity.result.contract.ActivityResultContract) new androidx.activity.result.contract.ActivityResultContracts.RequestMultiplePermissions(), new androidx.activity.result.ActivityResultCallback() { // from class: tool.wu.heng.MainActivity$$ExternalSyntheticLambda0
            public final void onActivityResult(java.lang.Object obj) {
                tool.wu.heng.MainActivity.permissionLauncher$lambda$0((java.util.Map) obj);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResult(...)");
        this.permissionLauncher = registerForActivityResult;
    }

    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            this.permissionLauncher.launch(new java.lang.String[]{"android.permission.POST_NOTIFICATIONS"});
        } else if (android.os.Build.VERSION.SDK_INT <= 28) {
            this.permissionLauncher.launch(new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"});
        }
        androidx.activity.compose.ComponentActivityKt.setContent$default(this, (androidx.compose.runtime.CompositionContext) null, tool.wu.heng.ComposableSingletons$MainActivityKt.INSTANCE.m1376getLambda2$app_release(), 1, (java.lang.Object) null);
    }
}
