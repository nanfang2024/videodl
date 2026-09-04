package kotlinx.coroutines.channels;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public /* synthetic */ class BufferedChannel$onReceiveOrNull$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function3<kotlinx.coroutines.channels.BufferedChannel<?>, java.lang.Object, java.lang.Object, java.lang.Object> {
    public static final kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2 INSTANCE = new kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2();

    BufferedChannel$onReceiveOrNull$2() {
        super(3, kotlinx.coroutines.channels.BufferedChannel.class, "processResultSelectReceiveOrNull", "processResultSelectReceiveOrNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public final java.lang.Object invoke(kotlinx.coroutines.channels.BufferedChannel<?> bufferedChannel, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object processResultSelectReceiveOrNull;
        processResultSelectReceiveOrNull = bufferedChannel.processResultSelectReceiveOrNull(obj, obj2);
        return processResultSelectReceiveOrNull;
    }
}
