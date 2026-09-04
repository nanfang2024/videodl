package tool.wu.heng.data.db;

/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class DownloadRecordDao_Impl implements tool.wu.heng.data.db.DownloadRecordDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityDeletionOrUpdateAdapter<tool.wu.heng.data.db.DownloadRecord> __deletionAdapterOfDownloadRecord;
    private final androidx.room.EntityInsertionAdapter<tool.wu.heng.data.db.DownloadRecord> __insertionAdapterOfDownloadRecord;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteAll;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDeleteById;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfUpdateStatus;
    private final androidx.room.EntityDeletionOrUpdateAdapter<tool.wu.heng.data.db.DownloadRecord> __updateAdapterOfDownloadRecord;

    public DownloadRecordDao_Impl(final androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfDownloadRecord = new androidx.room.EntityInsertionAdapter<tool.wu.heng.data.db.DownloadRecord>(__db) { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.1
            protected java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `download_records` (`id`,`title`,`thumbnailUrl`,`downloadUrl`,`savePath`,`ext`,`source`,`status`,`progress`,`downloadedBytes`,`totalBytes`,`speedBps`,`errorMessage`,`createdAt`,`completedAt`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final androidx.sqlite.db.SupportSQLiteStatement statement, final tool.wu.heng.data.db.DownloadRecord entity) {
                if (entity.getId() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getId());
                }
                if (entity.getTitle() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getTitle());
                }
                if (entity.getThumbnailUrl() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getThumbnailUrl());
                }
                if (entity.getDownloadUrl() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getDownloadUrl());
                }
                if (entity.getSavePath() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getSavePath());
                }
                if (entity.getExt() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getExt());
                }
                if (entity.getSource() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getSource());
                }
                if (entity.getStatus() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getStatus());
                }
                statement.bindDouble(9, entity.getProgress());
                statement.bindLong(10, entity.getDownloadedBytes());
                statement.bindLong(11, entity.getTotalBytes());
                statement.bindLong(12, entity.getSpeedBps());
                if (entity.getErrorMessage() == null) {
                    statement.bindNull(13);
                } else {
                    statement.bindString(13, entity.getErrorMessage());
                }
                statement.bindLong(14, entity.getCreatedAt());
                if (entity.getCompletedAt() == null) {
                    statement.bindNull(15);
                } else {
                    statement.bindLong(15, entity.getCompletedAt().longValue());
                }
            }
        };
        this.__deletionAdapterOfDownloadRecord = new androidx.room.EntityDeletionOrUpdateAdapter<tool.wu.heng.data.db.DownloadRecord>(__db) { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.2
            protected java.lang.String createQuery() {
                return "DELETE FROM `download_records` WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final androidx.sqlite.db.SupportSQLiteStatement statement, final tool.wu.heng.data.db.DownloadRecord entity) {
                if (entity.getId() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getId());
                }
            }
        };
        this.__updateAdapterOfDownloadRecord = new androidx.room.EntityDeletionOrUpdateAdapter<tool.wu.heng.data.db.DownloadRecord>(__db) { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.3
            protected java.lang.String createQuery() {
                return "UPDATE OR ABORT `download_records` SET `id` = ?,`title` = ?,`thumbnailUrl` = ?,`downloadUrl` = ?,`savePath` = ?,`ext` = ?,`source` = ?,`status` = ?,`progress` = ?,`downloadedBytes` = ?,`totalBytes` = ?,`speedBps` = ?,`errorMessage` = ?,`createdAt` = ?,`completedAt` = ? WHERE `id` = ?";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(final androidx.sqlite.db.SupportSQLiteStatement statement, final tool.wu.heng.data.db.DownloadRecord entity) {
                if (entity.getId() == null) {
                    statement.bindNull(1);
                } else {
                    statement.bindString(1, entity.getId());
                }
                if (entity.getTitle() == null) {
                    statement.bindNull(2);
                } else {
                    statement.bindString(2, entity.getTitle());
                }
                if (entity.getThumbnailUrl() == null) {
                    statement.bindNull(3);
                } else {
                    statement.bindString(3, entity.getThumbnailUrl());
                }
                if (entity.getDownloadUrl() == null) {
                    statement.bindNull(4);
                } else {
                    statement.bindString(4, entity.getDownloadUrl());
                }
                if (entity.getSavePath() == null) {
                    statement.bindNull(5);
                } else {
                    statement.bindString(5, entity.getSavePath());
                }
                if (entity.getExt() == null) {
                    statement.bindNull(6);
                } else {
                    statement.bindString(6, entity.getExt());
                }
                if (entity.getSource() == null) {
                    statement.bindNull(7);
                } else {
                    statement.bindString(7, entity.getSource());
                }
                if (entity.getStatus() == null) {
                    statement.bindNull(8);
                } else {
                    statement.bindString(8, entity.getStatus());
                }
                statement.bindDouble(9, entity.getProgress());
                statement.bindLong(10, entity.getDownloadedBytes());
                statement.bindLong(11, entity.getTotalBytes());
                statement.bindLong(12, entity.getSpeedBps());
                if (entity.getErrorMessage() == null) {
                    statement.bindNull(13);
                } else {
                    statement.bindString(13, entity.getErrorMessage());
                }
                statement.bindLong(14, entity.getCreatedAt());
                if (entity.getCompletedAt() == null) {
                    statement.bindNull(15);
                } else {
                    statement.bindLong(15, entity.getCompletedAt().longValue());
                }
                if (entity.getId() == null) {
                    statement.bindNull(16);
                } else {
                    statement.bindString(16, entity.getId());
                }
            }
        };
        this.__preparedStmtOfUpdateStatus = new androidx.room.SharedSQLiteStatement(__db) { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.4
            public java.lang.String createQuery() {
                return "UPDATE download_records SET status = ? WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteById = new androidx.room.SharedSQLiteStatement(__db) { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.5
            public java.lang.String createQuery() {
                return "DELETE FROM download_records WHERE id = ?";
            }
        };
        this.__preparedStmtOfDeleteAll = new androidx.room.SharedSQLiteStatement(__db) { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.6
            public java.lang.String createQuery() {
                return "DELETE FROM download_records";
            }
        };
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object insert(final tool.wu.heng.data.db.DownloadRecord record, final kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return androidx.room.CoroutinesRoom.execute(this.__db, true, new java.util.concurrent.Callable<kotlin.Unit>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.7
            @Override // java.util.concurrent.Callable
            public kotlin.Unit call() throws java.lang.Exception {
                tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.beginTransaction();
                try {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__insertionAdapterOfDownloadRecord.insert(record);
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.setTransactionSuccessful();
                    return kotlin.Unit.INSTANCE;
                } finally {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object delete(final tool.wu.heng.data.db.DownloadRecord record, final kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return androidx.room.CoroutinesRoom.execute(this.__db, true, new java.util.concurrent.Callable<kotlin.Unit>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.8
            @Override // java.util.concurrent.Callable
            public kotlin.Unit call() throws java.lang.Exception {
                tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.beginTransaction();
                try {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__deletionAdapterOfDownloadRecord.handle(record);
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.setTransactionSuccessful();
                    return kotlin.Unit.INSTANCE;
                } finally {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object update(final tool.wu.heng.data.db.DownloadRecord record, final kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return androidx.room.CoroutinesRoom.execute(this.__db, true, new java.util.concurrent.Callable<kotlin.Unit>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.9
            @Override // java.util.concurrent.Callable
            public kotlin.Unit call() throws java.lang.Exception {
                tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.beginTransaction();
                try {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__updateAdapterOfDownloadRecord.handle(record);
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.setTransactionSuccessful();
                    return kotlin.Unit.INSTANCE;
                } finally {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.endTransaction();
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object updateStatus(final java.lang.String id, final java.lang.String status, final kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return androidx.room.CoroutinesRoom.execute(this.__db, true, new java.util.concurrent.Callable<kotlin.Unit>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.10
            @Override // java.util.concurrent.Callable
            public kotlin.Unit call() throws java.lang.Exception {
                androidx.sqlite.db.SupportSQLiteStatement acquire = tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__preparedStmtOfUpdateStatus.acquire();
                java.lang.String str = status;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                java.lang.String str2 = id;
                if (str2 == null) {
                    acquire.bindNull(2);
                } else {
                    acquire.bindString(2, str2);
                }
                try {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.setTransactionSuccessful();
                        return kotlin.Unit.INSTANCE;
                    } finally {
                        tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__preparedStmtOfUpdateStatus.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object deleteById(final java.lang.String id, final kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return androidx.room.CoroutinesRoom.execute(this.__db, true, new java.util.concurrent.Callable<kotlin.Unit>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.11
            @Override // java.util.concurrent.Callable
            public kotlin.Unit call() throws java.lang.Exception {
                androidx.sqlite.db.SupportSQLiteStatement acquire = tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__preparedStmtOfDeleteById.acquire();
                java.lang.String str = id;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                try {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.setTransactionSuccessful();
                        return kotlin.Unit.INSTANCE;
                    } finally {
                        tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__preparedStmtOfDeleteById.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object deleteAll(final kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return androidx.room.CoroutinesRoom.execute(this.__db, true, new java.util.concurrent.Callable<kotlin.Unit>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.12
            @Override // java.util.concurrent.Callable
            public kotlin.Unit call() throws java.lang.Exception {
                androidx.sqlite.db.SupportSQLiteStatement acquire = tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__preparedStmtOfDeleteAll.acquire();
                try {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.beginTransaction();
                    try {
                        acquire.executeUpdateDelete();
                        tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.setTransactionSuccessful();
                        return kotlin.Unit.INSTANCE;
                    } finally {
                        tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db.endTransaction();
                    }
                } finally {
                    tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__preparedStmtOfDeleteAll.release(acquire);
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public kotlinx.coroutines.flow.Flow<java.util.List<tool.wu.heng.data.db.DownloadRecord>> observeAll() {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM download_records ORDER BY createdAt DESC", 0);
        return androidx.room.CoroutinesRoom.createFlow(this.__db, false, new java.lang.String[]{"download_records"}, new java.util.concurrent.Callable<java.util.List<tool.wu.heng.data.db.DownloadRecord>>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.13
            @Override // java.util.concurrent.Callable
            public java.util.List<tool.wu.heng.data.db.DownloadRecord> call() throws java.lang.Exception {
                java.lang.String string;
                int i;
                java.lang.Long valueOf;
                android.database.Cursor query = androidx.room.util.DBUtil.query(tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db, acquire, false, (android.os.CancellationSignal) null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "thumbnailUrl");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "downloadUrl");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "savePath");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "ext");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "status");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "progress");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "downloadedBytes");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "totalBytes");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "speedBps");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "errorMessage");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "completedAt");
                    int i2 = columnIndexOrThrow14;
                    java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                    while (query.moveToNext()) {
                        java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                        java.lang.String string3 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                        java.lang.String string4 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                        java.lang.String string5 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                        java.lang.String string6 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                        java.lang.String string7 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                        java.lang.String string8 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                        java.lang.String string9 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                        float f = query.getFloat(columnIndexOrThrow9);
                        long j = query.getLong(columnIndexOrThrow10);
                        long j2 = query.getLong(columnIndexOrThrow11);
                        long j3 = query.getLong(columnIndexOrThrow12);
                        if (query.isNull(columnIndexOrThrow13)) {
                            i = i2;
                            string = null;
                        } else {
                            string = query.getString(columnIndexOrThrow13);
                            i = i2;
                        }
                        long j4 = query.getLong(i);
                        int i3 = columnIndexOrThrow;
                        int i4 = columnIndexOrThrow15;
                        if (query.isNull(i4)) {
                            columnIndexOrThrow15 = i4;
                            valueOf = null;
                        } else {
                            valueOf = java.lang.Long.valueOf(query.getLong(i4));
                            columnIndexOrThrow15 = i4;
                        }
                        arrayList.add(new tool.wu.heng.data.db.DownloadRecord(string2, string3, string4, string5, string6, string7, string8, string9, f, j, j2, j3, string, j4, valueOf));
                        columnIndexOrThrow = i3;
                        i2 = i;
                    }
                    return arrayList;
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object getById(final java.lang.String id, final kotlin.coroutines.Continuation<? super tool.wu.heng.data.db.DownloadRecord> $completion) {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM download_records WHERE id = ?", 1);
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        return androidx.room.CoroutinesRoom.execute(this.__db, false, androidx.room.util.DBUtil.createCancellationSignal(), new java.util.concurrent.Callable<tool.wu.heng.data.db.DownloadRecord>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.14
            @Override // java.util.concurrent.Callable
            public tool.wu.heng.data.db.DownloadRecord call() throws java.lang.Exception {
                tool.wu.heng.data.db.DownloadRecord downloadRecord;
                tool.wu.heng.data.db.DownloadRecordDao_Impl.AnonymousClass14 anonymousClass14 = this;
                android.database.Cursor query = androidx.room.util.DBUtil.query(tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db, acquire, false, (android.os.CancellationSignal) null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "thumbnailUrl");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "downloadUrl");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "savePath");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "ext");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "status");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "progress");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "downloadedBytes");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "totalBytes");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "speedBps");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "errorMessage");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    try {
                        int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "completedAt");
                        if (query.moveToFirst()) {
                            downloadRecord = new tool.wu.heng.data.db.DownloadRecord(query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3), query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4), query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5), query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6), query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7), query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8), query.getFloat(columnIndexOrThrow9), query.getLong(columnIndexOrThrow10), query.getLong(columnIndexOrThrow11), query.getLong(columnIndexOrThrow12), query.isNull(columnIndexOrThrow13) ? null : query.getString(columnIndexOrThrow13), query.getLong(columnIndexOrThrow14), query.isNull(columnIndexOrThrow15) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow15)));
                        } else {
                            downloadRecord = null;
                        }
                        query.close();
                        acquire.release();
                        return downloadRecord;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        anonymousClass14 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                }
            }
        }, $completion);
    }

    @Override // tool.wu.heng.data.db.DownloadRecordDao
    public java.lang.Object getActiveDownloads(final kotlin.coroutines.Continuation<? super java.util.List<tool.wu.heng.data.db.DownloadRecord>> $completion) {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM download_records WHERE status IN ('PENDING', 'DOWNLOADING') ORDER BY createdAt ASC", 0);
        return androidx.room.CoroutinesRoom.execute(this.__db, false, androidx.room.util.DBUtil.createCancellationSignal(), new java.util.concurrent.Callable<java.util.List<tool.wu.heng.data.db.DownloadRecord>>() { // from class: tool.wu.heng.data.db.DownloadRecordDao_Impl.15
            @Override // java.util.concurrent.Callable
            public java.util.List<tool.wu.heng.data.db.DownloadRecord> call() throws java.lang.Exception {
                tool.wu.heng.data.db.DownloadRecordDao_Impl.AnonymousClass15 anonymousClass15;
                java.lang.String string;
                int i;
                java.lang.Long valueOf;
                android.database.Cursor query = androidx.room.util.DBUtil.query(tool.wu.heng.data.db.DownloadRecordDao_Impl.this.__db, acquire, false, (android.os.CancellationSignal) null);
                try {
                    int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
                    int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "title");
                    int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "thumbnailUrl");
                    int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "downloadUrl");
                    int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "savePath");
                    int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "ext");
                    int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "source");
                    int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "status");
                    int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "progress");
                    int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "downloadedBytes");
                    int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "totalBytes");
                    int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "speedBps");
                    int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "errorMessage");
                    int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "createdAt");
                    try {
                        int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "completedAt");
                        int i2 = columnIndexOrThrow14;
                        java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            java.lang.String string2 = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                            java.lang.String string3 = query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2);
                            java.lang.String string4 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                            java.lang.String string5 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                            java.lang.String string6 = query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5);
                            java.lang.String string7 = query.isNull(columnIndexOrThrow6) ? null : query.getString(columnIndexOrThrow6);
                            java.lang.String string8 = query.isNull(columnIndexOrThrow7) ? null : query.getString(columnIndexOrThrow7);
                            java.lang.String string9 = query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8);
                            float f = query.getFloat(columnIndexOrThrow9);
                            long j = query.getLong(columnIndexOrThrow10);
                            long j2 = query.getLong(columnIndexOrThrow11);
                            long j3 = query.getLong(columnIndexOrThrow12);
                            if (query.isNull(columnIndexOrThrow13)) {
                                i = i2;
                                string = null;
                            } else {
                                string = query.getString(columnIndexOrThrow13);
                                i = i2;
                            }
                            long j4 = query.getLong(i);
                            int i3 = columnIndexOrThrow;
                            int i4 = columnIndexOrThrow15;
                            if (query.isNull(i4)) {
                                columnIndexOrThrow15 = i4;
                                valueOf = null;
                            } else {
                                valueOf = java.lang.Long.valueOf(query.getLong(i4));
                                columnIndexOrThrow15 = i4;
                            }
                            arrayList.add(new tool.wu.heng.data.db.DownloadRecord(string2, string3, string4, string5, string6, string7, string8, string9, f, j, j2, j3, string, j4, valueOf));
                            columnIndexOrThrow = i3;
                            i2 = i;
                        }
                        query.close();
                        acquire.release();
                        return arrayList;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        anonymousClass15 = this;
                        query.close();
                        acquire.release();
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    anonymousClass15 = this;
                }
            }
        }, $completion);
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
