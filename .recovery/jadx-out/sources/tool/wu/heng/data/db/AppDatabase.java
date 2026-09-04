package tool.wu.heng.data.db;

/* compiled from: AppDatabase.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Ltool/wu/heng/data/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "downloadRecordDao", "Ltool/wu/heng/data/db/DownloadRecordDao;", "Companion", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final tool.wu.heng.data.db.AppDatabase.Companion INSTANCE = new tool.wu.heng.data.db.AppDatabase.Companion(null);
    private static final java.lang.String DATABASE_NAME = "wuheng.db";
    private static volatile tool.wu.heng.data.db.AppDatabase INSTANCE;

    public abstract tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao();

    /* compiled from: AppDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Ltool/wu/heng/data/db/AppDatabase$Companion;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "()V", "DATABASE_NAME", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "INSTANCE", "Ltool/wu/heng/data/db/AppDatabase;", "getInstance", "context", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final tool.wu.heng.data.db.AppDatabase getInstance(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            tool.wu.heng.data.db.AppDatabase appDatabase = tool.wu.heng.data.db.AppDatabase.INSTANCE;
            if (appDatabase == null) {
                synchronized (this) {
                    appDatabase = tool.wu.heng.data.db.AppDatabase.INSTANCE;
                    if (appDatabase == null) {
                        android.content.Context applicationContext = context.getApplicationContext();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        androidx.room.RoomDatabase build = androidx.room.Room.databaseBuilder(applicationContext, tool.wu.heng.data.db.AppDatabase.class, tool.wu.heng.data.db.AppDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build();
                        tool.wu.heng.data.db.AppDatabase.Companion companion = tool.wu.heng.data.db.AppDatabase.INSTANCE;
                        tool.wu.heng.data.db.AppDatabase.INSTANCE = (tool.wu.heng.data.db.AppDatabase) build;
                        appDatabase = (tool.wu.heng.data.db.AppDatabase) build;
                    }
                }
            }
            return appDatabase;
        }
    }
}
