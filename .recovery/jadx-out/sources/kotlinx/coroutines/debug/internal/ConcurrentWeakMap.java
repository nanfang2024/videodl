package kotlinx.coroutines.debug.internal;

/* compiled from: ConcurrentWeakMap.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0004:\u0003()*B\u000f\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0016J\b\u0010\u001e\u001a\u00020\u001aH\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010!J\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010$J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\b\u0010#\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0002\u0010$J\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\u0006\u0010'\u001a\u00020\u001aR\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u001f\u0010\n\u001a\u0018\u0012\u0014\u0012\u00120\fR\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00000\u000bX\u0082\u0004R&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "K", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "V", "Lkotlin/collections/AbstractMutableMap;", "weakRefQueue", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Z)V", "_size", "Lkotlinx/atomicfu/AtomicInt;", "core", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", "entries", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "Ljava/lang/ref/ReferenceQueue;", "cleanWeakRef", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "w", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "clear", "decrementSize", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putSynchronized", "remove", "runWeakRefQueueCleaningLoopUntilInterrupted", "Core", "Entry", "KeyValueSet", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ConcurrentWeakMap<K, V> extends kotlin.collections.AbstractMutableMap<K, V> {
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater _size$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.class, "_size");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater core$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.class, java.lang.Object.class, "core");

    @kotlin.jvm.Volatile
    private volatile int _size;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object core;
    private final java.lang.ref.ReferenceQueue<K> weakRefQueue;

    public ConcurrentWeakMap() {
        this(false, 1, null);
    }

    public /* synthetic */ ConcurrentWeakMap(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public ConcurrentWeakMap(boolean z) {
        this.core = new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core(16);
        this.weakRefQueue = z ? new java.lang.ref.ReferenceQueue<>() : null;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public int getSize() {
        return _size$FU.get(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementSize() {
        _size$FU.decrementAndGet(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object key) {
        if (key == null) {
            return null;
        }
        return (V) ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) core$FU.get(this)).getImpl(key);
    }

    @Override // kotlin.collections.AbstractMutableMap, java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        kotlinx.coroutines.internal.Symbol symbol;
        V v = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) core$FU.get(this), key, value, null, 4, null);
        symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
        if (v == symbol) {
            v = putSynchronized(key, value);
        }
        if (v == null) {
            _size$FU.incrementAndGet(this);
        }
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object key) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (key == 0) {
            return null;
        }
        V v = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) core$FU.get(this), key, null, null, 4, null);
        symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
        if (v == symbol) {
            v = putSynchronized(key, null);
        }
        if (v != null) {
            _size$FU.decrementAndGet(this);
        }
        return v;
    }

    private final synchronized V putSynchronized(K key, V value) {
        V v;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) core$FU.get(this);
        while (true) {
            v = (V) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.putImpl$default(core, key, value, null, 4, null);
            symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
            if (v == symbol) {
                core = core.rehash();
                core$FU.set(this, core);
            }
        }
        return v;
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Set<K> getKeys() {
        return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.KeyValueSet(new kotlin.jvm.functions.Function2<K, V, K>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$keys$1
            @Override // kotlin.jvm.functions.Function2
            public final K invoke(K k, V v) {
                return k;
            }
        });
    }

    @Override // kotlin.collections.AbstractMutableMap
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
        return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.KeyValueSet(new kotlin.jvm.functions.Function2<K, V, java.util.Map.Entry<K, V>>() { // from class: kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return invoke((kotlinx.coroutines.debug.internal.ConcurrentWeakMap$entries$1<K, V>) obj, obj2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final java.util.Map.Entry<K, V> invoke(K k, V v) {
                return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Entry(k, v);
            }
        });
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        java.util.Iterator<K> it = keySet().iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void runWeakRefQueueCleaningLoopUntilInterrupted() {
        if (this.weakRefQueue == null) {
            throw new java.lang.IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
        while (true) {
            try {
                java.lang.ref.Reference<? extends K> remove = this.weakRefQueue.remove();
                kotlin.jvm.internal.Intrinsics.checkNotNull(remove, "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                cleanWeakRef((kotlinx.coroutines.debug.internal.HashedWeakRef) remove);
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return;
            }
        }
    }

    private final void cleanWeakRef(kotlinx.coroutines.debug.internal.HashedWeakRef<?> w) {
        ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) core$FU.get(this)).cleanWeakRef(w);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0015\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002J,\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\u0004\b\u0002\u0010\u00172\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002H\u00170\u0019J1\u0010\u001a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fJ\u0010\u0010 \u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00070\u0006X\u0082\u0004R\t\u0010\b\u001a\u00020\tX\u0082\u0004R\u000e\u0010\n\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¨\u0006\""}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "allocated", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;I)V", "keys", "Lkotlinx/atomicfu/AtomicArray;", "Lkotlinx/coroutines/debug/internal/HashedWeakRef;", "load", "Lkotlinx/atomicfu/AtomicInt;", "shift", "threshold", "values", "cleanWeakRef", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "weakRef", "getImpl", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "index", "hash", "keyValueIterator", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "E", "factory", "Lkotlin/Function2;", "putImpl", "value", "weakKey0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlinx/coroutines/debug/internal/HashedWeakRef;)Ljava/lang/Object;", "rehash", "Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;", "removeCleanedAt", "KeyValueIterator", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public final class Core {
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater load$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.class, "load");
        private final int allocated;
        private final java.util.concurrent.atomic.AtomicReferenceArray keys;

        @kotlin.jvm.Volatile
        private volatile int load;
        private final int shift;
        private final int threshold;
        private final java.util.concurrent.atomic.AtomicReferenceArray values;

        private final int index(int hash) {
            return (hash * (-1640531527)) >>> this.shift;
        }

        private final void update$atomicfu(java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> function1, java.lang.Object obj) {
            int i;
            do {
                i = atomicIntegerFieldUpdater.get(obj);
            } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, function1.invoke(java.lang.Integer.valueOf(i)).intValue()));
        }

        public Core(int i) {
            this.allocated = i;
            this.shift = java.lang.Integer.numberOfLeadingZeros(i) + 1;
            this.threshold = (i * 2) / 3;
            this.keys = new java.util.concurrent.atomic.AtomicReferenceArray(i);
            this.values = new java.util.concurrent.atomic.AtomicReferenceArray(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final V getImpl(K key) {
            int index = index(key.hashCode());
            while (true) {
                kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) this.keys.get(index);
                if (hashedWeakRef == null) {
                    return null;
                }
                java.lang.Object obj = hashedWeakRef.get();
                if (kotlin.jvm.internal.Intrinsics.areEqual(key, obj)) {
                    V v = (V) this.values.get(index);
                    return v instanceof kotlinx.coroutines.debug.internal.Marked ? (V) ((kotlinx.coroutines.debug.internal.Marked) v).ref : v;
                }
                if (obj == null) {
                    removeCleanedAt(index);
                }
                if (index == 0) {
                    index = this.allocated;
                }
                index--;
            }
        }

        private final void removeCleanedAt(int index) {
            java.lang.Object obj;
            do {
                obj = this.values.get(index);
                if (obj == null || (obj instanceof kotlinx.coroutines.debug.internal.Marked)) {
                    return;
                }
            } while (!kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(this.values, index, obj, null));
            kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this.decrementSize();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.lang.Object putImpl$default(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core core, java.lang.Object obj, java.lang.Object obj2, kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef, int i, java.lang.Object obj3) {
            if ((i & 4) != 0) {
                hashedWeakRef = null;
            }
            return core.putImpl(obj, obj2, hashedWeakRef);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
        
            r6 = r5.values.get(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        
            if ((r6 instanceof kotlinx.coroutines.debug.internal.Marked) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(r5.values, r0, r6, r7) == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        
            return r6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        
            r6 = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        
            return r6;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object putImpl(K key, V value, kotlinx.coroutines.debug.internal.HashedWeakRef<K> weakKey0) {
            int i;
            kotlinx.coroutines.internal.Symbol symbol;
            int index = index(key.hashCode());
            boolean z = false;
            while (true) {
                kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) this.keys.get(index);
                if (hashedWeakRef != null) {
                    java.lang.Object obj = hashedWeakRef.get();
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(key, obj)) {
                        if (obj == null) {
                            removeCleanedAt(index);
                        }
                        if (index == 0) {
                            index = this.allocated;
                        }
                        index--;
                    } else if (z) {
                        load$FU.decrementAndGet(this);
                    }
                } else if (value != null) {
                    if (!z) {
                        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = load$FU;
                        do {
                            i = atomicIntegerFieldUpdater.get(this);
                            if (i >= this.threshold) {
                                symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
                                return symbol;
                            }
                        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1));
                        z = true;
                    }
                    if (weakKey0 == null) {
                        weakKey0 = new kotlinx.coroutines.debug.internal.HashedWeakRef<>(key, ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this).weakRefQueue);
                    }
                    if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(this.keys, index, null, weakKey0)) {
                        break;
                    }
                } else {
                    return null;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core rehash() {
            java.lang.Object obj;
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.debug.internal.Marked mark;
            while (true) {
                kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core core = (kotlinx.coroutines.debug.internal.ConcurrentWeakMap<K, V>.Core) new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core(java.lang.Integer.highestOneBit(kotlin.ranges.RangesKt.coerceAtLeast(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this.size(), 4)) * 4);
                int i = this.allocated;
                for (int i2 = 0; i2 < i; i2++) {
                    kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) this.keys.get(i2);
                    java.lang.Object obj2 = hashedWeakRef != null ? hashedWeakRef.get() : null;
                    if (hashedWeakRef != null && obj2 == null) {
                        removeCleanedAt(i2);
                    }
                    while (true) {
                        obj = this.values.get(i2);
                        if (!(obj instanceof kotlinx.coroutines.debug.internal.Marked)) {
                            java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.values;
                            mark = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.mark(obj);
                            if (kotlinx.coroutines.channels.ChannelSegment$$ExternalSyntheticBackportWithForwarding0.m(atomicReferenceArray, i2, obj, mark)) {
                                break;
                            }
                        } else {
                            obj = ((kotlinx.coroutines.debug.internal.Marked) obj).ref;
                            break;
                        }
                    }
                    if (obj2 != null && obj != null) {
                        java.lang.Object putImpl = core.putImpl(obj2, obj, hashedWeakRef);
                        symbol = kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.REHASH;
                        if (putImpl != symbol) {
                        }
                    }
                }
                return core;
            }
        }

        public final void cleanWeakRef(kotlinx.coroutines.debug.internal.HashedWeakRef<?> weakRef) {
            int index = index(weakRef.hash);
            while (true) {
                kotlinx.coroutines.debug.internal.HashedWeakRef<?> hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) this.keys.get(index);
                if (hashedWeakRef == null) {
                    return;
                }
                if (hashedWeakRef == weakRef) {
                    removeCleanedAt(index);
                    return;
                } else {
                    if (index == 0) {
                        index = this.allocated;
                    }
                    index--;
                }
            }
        }

        public final <E> java.util.Iterator<E> keyValueIterator(kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> factory) {
            return new kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.KeyValueIterator(factory);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: ConcurrentWeakMap.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\u000e\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00028\u0000X\u0082.¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00028\u0001X\u0082.¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator;", "E", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core;Lkotlin/jvm/functions/Function2;)V", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "key", "Ljava/lang/Object;", "value", "findNext", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "next", "()Ljava/lang/Object;", "remove", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: /workspace/.recovery/dex/classes3.dex */
        public final class KeyValueIterator<E> implements java.util.Iterator<E>, kotlin.jvm.internal.markers.KMutableIterator {
            private final kotlin.jvm.functions.Function2<K, V, E> factory;
            private int index = -1;
            private K key;
            private V value;

            /* JADX WARN: Multi-variable type inference failed */
            public KeyValueIterator(kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> function2) {
                this.factory = function2;
                findNext();
            }

            private final void findNext() {
                K k;
                while (true) {
                    int i = this.index + 1;
                    this.index = i;
                    if (i >= ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this).allocated) {
                        return;
                    }
                    kotlinx.coroutines.debug.internal.HashedWeakRef hashedWeakRef = (kotlinx.coroutines.debug.internal.HashedWeakRef) ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this).keys.get(this.index);
                    if (hashedWeakRef != null && (k = (K) hashedWeakRef.get()) != null) {
                        this.key = k;
                        java.lang.Object obj = (V) ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this).values.get(this.index);
                        if (obj instanceof kotlinx.coroutines.debug.internal.Marked) {
                            obj = (V) ((kotlinx.coroutines.debug.internal.Marked) obj).ref;
                        }
                        if (obj != null) {
                            this.value = (V) obj;
                            return;
                        }
                    }
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this).allocated;
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.index >= ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core.this).allocated) {
                    throw new java.util.NoSuchElementException();
                }
                kotlin.jvm.functions.Function2<K, V, E> function2 = this.factory;
                K k = this.key;
                if (k == false) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("key");
                    k = (K) kotlin.Unit.INSTANCE;
                }
                V v = this.value;
                if (v == false) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("value");
                    v = (V) kotlin.Unit.INSTANCE;
                }
                E e = (E) function2.invoke(k, v);
                findNext();
                return e;
            }

            @Override // java.util.Iterator
            public java.lang.Void remove() {
                kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.noImpl();
                throw new kotlin.KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00032\u0006\u0010\f\u001a\u00028\u0003H\u0016¢\u0006\u0002\u0010\rR\u0016\u0010\u0004\u001a\u00028\u0002X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00028\u0003X\u0096\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Entry;", "K", "V", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getValue", "setValue", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class Entry<K, V> implements java.util.Map.Entry<K, V>, kotlin.jvm.internal.markers.KMutableMap.Entry {
        private final K key;
        private final V value;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        public Entry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.noImpl();
            throw new kotlin.KotlinNothingValueException();
        }
    }

    /* compiled from: ConcurrentWeakMap.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\b\u0082\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\rJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fH\u0096\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap$KeyValueSet;", "E", "Lkotlin/collections/AbstractMutableSet;", "factory", "Lkotlin/Function2;", "(Lkotlinx/coroutines/debug/internal/ConcurrentWeakMap;Lkotlin/jvm/functions/Function2;)V", "size", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getSize", "()I", "add", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "element", "(Ljava/lang/Object;)Z", "iterator", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    private final class KeyValueSet<E> extends kotlin.collections.AbstractMutableSet<E> {
        private final kotlin.jvm.functions.Function2<K, V, E> factory;

        /* JADX WARN: Multi-variable type inference failed */
        public KeyValueSet(kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> function2) {
            this.factory = function2;
        }

        @Override // kotlin.collections.AbstractMutableSet
        public int getSize() {
            return kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this.size();
        }

        @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E element) {
            kotlinx.coroutines.debug.internal.ConcurrentWeakMapKt.noImpl();
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<E> iterator() {
            return ((kotlinx.coroutines.debug.internal.ConcurrentWeakMap.Core) kotlinx.coroutines.debug.internal.ConcurrentWeakMap.core$FU.get(kotlinx.coroutines.debug.internal.ConcurrentWeakMap.this)).keyValueIterator(this.factory);
        }
    }
}
