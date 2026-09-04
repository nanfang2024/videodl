package kotlinx.coroutines.internal;

/* compiled from: ExceptionsConstructor.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a.\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a!\u0010\r\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u000e\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u000f\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0012\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0014\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0015"}, d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "createConstructor", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache ctorCache;
    private static final int throwableFields = fieldsCountOrDefault(java.lang.Throwable.class, -1);

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$createConstructor(java.lang.Class cls) {
        return createConstructor(cls);
    }

    static {
        kotlinx.coroutines.internal.WeakMapCtorCache weakMapCtorCache;
        try {
            weakMapCtorCache = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED() ? kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE : kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE;
        } catch (java.lang.Throwable unused) {
            weakMapCtorCache = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE;
        }
        ctorCache = weakMapCtorCache;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends java.lang.Throwable> E tryCopyException(E e) {
        java.lang.Object obj;
        if (e instanceof kotlinx.coroutines.CopyableThrowable) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(((kotlinx.coroutines.CopyableThrowable) e).createCopy());
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
            }
            if (kotlin.Result.isFailure-impl(obj)) {
                obj = null;
            }
            return (E) obj;
        }
        return (E) ctorCache.get(e.getClass()).invoke(e);
    }

    public static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> cls) {
        java.lang.Object obj;
        kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function1;
        kotlin.Pair pair;
        kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 exceptionsConstructorKt$createConstructor$nullResult$1 = new kotlin.jvm.functions.Function1() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(java.lang.Throwable th) {
                return null;
            }
        };
        if (throwableFields != fieldsCountOrDefault(cls, 0)) {
            return exceptionsConstructorKt$createConstructor$nullResult$1;
        }
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        java.util.ArrayList arrayList = new java.util.ArrayList(constructors.length);
        int length = constructors.length;
        int i = 0;
        while (true) {
            obj = null;
            if (i >= length) {
                break;
            }
            final java.lang.reflect.Constructor<?> constructor = constructors[i];
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Throwable invoke(java.lang.Throwable th) {
                        java.lang.Object newInstance = constructor.newInstance(new java.lang.Object[0]);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                        java.lang.Throwable th2 = (java.lang.Throwable) newInstance;
                        th2.initCause(th);
                        return th2;
                    }
                }), 0);
            } else if (length2 == 1) {
                java.lang.Class<?> cls2 = parameterTypes[0];
                if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.String.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$2
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable th) {
                            java.lang.Object newInstance = constructor.newInstance(th.getMessage());
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            java.lang.Throwable th2 = (java.lang.Throwable) newInstance;
                            th2.initCause(th);
                            return th2;
                        }
                    }), 2);
                } else if (kotlin.jvm.internal.Intrinsics.areEqual(cls2, java.lang.Throwable.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$3
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable th) {
                            java.lang.Object newInstance = constructor.newInstance(th);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            return (java.lang.Throwable) newInstance;
                        }
                    }), 1);
                } else {
                    pair = kotlin.TuplesKt.to((java.lang.Object) null, -1);
                }
            } else if (length2 == 2) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[0], java.lang.String.class) && kotlin.jvm.internal.Intrinsics.areEqual(parameterTypes[1], java.lang.Throwable.class)) {
                    pair = kotlin.TuplesKt.to(safeCtor(new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$1$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Throwable invoke(java.lang.Throwable th) {
                            java.lang.Object newInstance = constructor.newInstance(th.getMessage(), th);
                            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                            return (java.lang.Throwable) newInstance;
                        }
                    }), 3);
                } else {
                    pair = kotlin.TuplesKt.to((java.lang.Object) null, -1);
                }
            } else {
                pair = kotlin.TuplesKt.to((java.lang.Object) null, -1);
            }
            arrayList.add(pair);
            i++;
        }
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            obj = it.next();
            if (it.hasNext()) {
                int intValue = ((java.lang.Number) ((kotlin.Pair) obj).getSecond()).intValue();
                do {
                    java.lang.Object next = it.next();
                    int intValue2 = ((java.lang.Number) ((kotlin.Pair) next).getSecond()).intValue();
                    if (intValue < intValue2) {
                        obj = next;
                        intValue = intValue2;
                    }
                } while (it.hasNext());
            }
        }
        kotlin.Pair pair2 = (kotlin.Pair) obj;
        return (pair2 == null || (function1 = (kotlin.jvm.functions.Function1) pair2.getFirst()) == null) ? exceptionsConstructorKt$createConstructor$nullResult$1 : function1;
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(final kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> function1) {
        return new kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable>() { // from class: kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Throwable invoke(java.lang.Throwable th) {
                java.lang.Object obj;
                kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> function12 = function1;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.Companion;
                    java.lang.Throwable invoke = function12.invoke(th);
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(th.getMessage(), invoke.getMessage()) && !kotlin.jvm.internal.Intrinsics.areEqual(invoke.getMessage(), th.toString())) {
                        invoke = null;
                    }
                    obj = kotlin.Result.constructor-impl(invoke);
                } catch (java.lang.Throwable th2) {
                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                    obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th2));
                }
                return (java.lang.Throwable) (kotlin.Result.isFailure-impl(obj) ? null : obj);
            }
        };
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> cls, int i) {
        java.lang.Object obj;
        kotlin.jvm.JvmClassMappingKt.getKotlinClass(cls);
        try {
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(java.lang.Integer.valueOf(fieldsCount$default(cls, 0, 1, null)));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            obj = kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(th));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
        if (kotlin.Result.isFailure-impl(obj)) {
            obj = valueOf;
        }
        return ((java.lang.Number) obj).intValue();
    }

    static /* synthetic */ int fieldsCount$default(java.lang.Class cls, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return fieldsCount(cls, i);
    }

    private static final int fieldsCount(java.lang.Class<?> cls, int i) {
        do {
            int length = cls.getDeclaredFields().length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (!java.lang.reflect.Modifier.isStatic(r0[i3].getModifiers())) {
                    i2++;
                }
            }
            i += i2;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i;
    }
}
