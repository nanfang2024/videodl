package tool.wu.heng.receiver;

/* compiled from: BootReceiver.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Ltool/wu/heng/receiver/BootReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class BootReceiver extends android.content.BroadcastReceiver {
    public static final int $stable = 0;
    private static final java.lang.String ACTION_QUICKBOOT_POWERON = "android.intent.action.QUICKBOOT_POWERON";

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "intent");
        if (kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || kotlin.jvm.internal.Intrinsics.areEqual(intent.getAction(), ACTION_QUICKBOOT_POWERON)) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(kotlinx.coroutines.Dispatchers.getIO())), null, null, new tool.wu.heng.receiver.BootReceiver$onReceive$1(context, goAsync(), null), 3, null);
        }
    }
}
