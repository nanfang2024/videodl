package tool.wu.heng.data.db;

/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class AppDatabase_Impl extends tool.wu.heng.data.db.AppDatabase {
    private volatile tool.wu.heng.data.db.DownloadRecordDao _downloadRecordDao;

    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(final androidx.room.DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new androidx.room.RoomOpenHelper(config, new androidx.room.RoomOpenHelper.Delegate(1) { // from class: tool.wu.heng.data.db.AppDatabase_Impl.1
            public void onPostMigrate(final androidx.sqlite.db.SupportSQLiteDatabase db) {
            }

            public void createAllTables(final androidx.sqlite.db.SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `download_records` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `thumbnailUrl` TEXT, `downloadUrl` TEXT NOT NULL, `savePath` TEXT, `ext` TEXT NOT NULL, `source` TEXT NOT NULL, `status` TEXT NOT NULL, `progress` REAL NOT NULL, `downloadedBytes` INTEGER NOT NULL, `totalBytes` INTEGER NOT NULL, `speedBps` INTEGER NOT NULL, `errorMessage` TEXT, `createdAt` INTEGER NOT NULL, `completedAt` INTEGER, PRIMARY KEY(`id`))");
                db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4c897439a1383459d4e1ec9828e8b158')");
            }

            public void dropAllTables(final androidx.sqlite.db.SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `download_records`");
                java.util.List list = tool.wu.heng.data.db.AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((androidx.room.RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            public void onCreate(final androidx.sqlite.db.SupportSQLiteDatabase db) {
                java.util.List list = tool.wu.heng.data.db.AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((androidx.room.RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            public void onOpen(final androidx.sqlite.db.SupportSQLiteDatabase db) {
                tool.wu.heng.data.db.AppDatabase_Impl.this.mDatabase = db;
                tool.wu.heng.data.db.AppDatabase_Impl.this.internalInitInvalidationTracker(db);
                java.util.List list = tool.wu.heng.data.db.AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((androidx.room.RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            public void onPreMigrate(final androidx.sqlite.db.SupportSQLiteDatabase db) {
                androidx.room.util.DBUtil.dropFtsSyncTriggers(db);
            }

            public androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(final androidx.sqlite.db.SupportSQLiteDatabase db) {
                java.util.HashMap hashMap = new java.util.HashMap(15);
                hashMap.put("id", new androidx.room.util.TableInfo.Column("id", "TEXT", true, 1, (java.lang.String) null, 1));
                hashMap.put("title", new androidx.room.util.TableInfo.Column("title", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("thumbnailUrl", new androidx.room.util.TableInfo.Column("thumbnailUrl", "TEXT", false, 0, (java.lang.String) null, 1));
                hashMap.put("downloadUrl", new androidx.room.util.TableInfo.Column("downloadUrl", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("savePath", new androidx.room.util.TableInfo.Column("savePath", "TEXT", false, 0, (java.lang.String) null, 1));
                hashMap.put("ext", new androidx.room.util.TableInfo.Column("ext", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("source", new androidx.room.util.TableInfo.Column("source", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("status", new androidx.room.util.TableInfo.Column("status", "TEXT", true, 0, (java.lang.String) null, 1));
                hashMap.put("progress", new androidx.room.util.TableInfo.Column("progress", "REAL", true, 0, (java.lang.String) null, 1));
                hashMap.put("downloadedBytes", new androidx.room.util.TableInfo.Column("downloadedBytes", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("totalBytes", new androidx.room.util.TableInfo.Column("totalBytes", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("speedBps", new androidx.room.util.TableInfo.Column("speedBps", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("errorMessage", new androidx.room.util.TableInfo.Column("errorMessage", "TEXT", false, 0, (java.lang.String) null, 1));
                hashMap.put("createdAt", new androidx.room.util.TableInfo.Column("createdAt", "INTEGER", true, 0, (java.lang.String) null, 1));
                hashMap.put("completedAt", new androidx.room.util.TableInfo.Column("completedAt", "INTEGER", false, 0, (java.lang.String) null, 1));
                androidx.room.util.TableInfo tableInfo = new androidx.room.util.TableInfo("download_records", hashMap, new java.util.HashSet(0), new java.util.HashSet(0));
                androidx.room.util.TableInfo read = androidx.room.util.TableInfo.read(db, "download_records");
                if (!tableInfo.equals(read)) {
                    return new androidx.room.RoomOpenHelper.ValidationResult(false, "download_records(tool.wu.heng.data.db.DownloadRecord).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                return new androidx.room.RoomOpenHelper.ValidationResult(true, (java.lang.String) null);
            }
        }, "4c897439a1383459d4e1ec9828e8b158", "4eafda78b47298c9739d966b42283305")).build());
    }

    protected androidx.room.InvalidationTracker createInvalidationTracker() {
        return new androidx.room.InvalidationTracker(this, new java.util.HashMap(0), new java.util.HashMap(0), new java.lang.String[]{"download_records"});
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `download_records`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(tool.wu.heng.data.db.DownloadRecordDao.class, tool.wu.heng.data.db.DownloadRecordDao_Impl.getRequiredConverters());
        return hashMap;
    }

    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new java.util.HashSet();
    }

    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(final java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs) {
        return new java.util.ArrayList();
    }

    @Override // tool.wu.heng.data.db.AppDatabase
    public tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao() {
        tool.wu.heng.data.db.DownloadRecordDao downloadRecordDao;
        if (this._downloadRecordDao != null) {
            return this._downloadRecordDao;
        }
        synchronized (this) {
            if (this._downloadRecordDao == null) {
                this._downloadRecordDao = new tool.wu.heng.data.db.DownloadRecordDao_Impl(this);
            }
            downloadRecordDao = this._downloadRecordDao;
        }
        return downloadRecordDao;
    }
}
