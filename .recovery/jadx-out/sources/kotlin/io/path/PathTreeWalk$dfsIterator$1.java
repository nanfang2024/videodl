package kotlin.io.path;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PathTreeWalk.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/sequences/SequenceScope;", "Ljava/nio/file/Path;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlin.io.path.PathTreeWalk$dfsIterator$1", f = "PathTreeWalk.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {184, 190, 199, 205}, m = "invokeSuspend", n = {"$this$iterator", "stack", "entriesReader", "startNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader", "$this$iterator", "stack", "entriesReader", "pathNode", "this_$iv", "path$iv", "$this$iterator", "stack", "entriesReader"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final class PathTreeWalk$dfsIterator$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.nio.file.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    java.lang.Object L$4;
    java.lang.Object L$5;
    int label;
    final /* synthetic */ kotlin.io.path.PathTreeWalk this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathTreeWalk$dfsIterator$1(kotlin.io.path.PathTreeWalk pathTreeWalk, kotlin.coroutines.Continuation<? super kotlin.io.path.PathTreeWalk$dfsIterator$1> continuation) {
        super(2, continuation);
        this.this$0 = pathTreeWalk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlin.io.path.PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1 = new kotlin.io.path.PathTreeWalk$dfsIterator$1(this.this$0, continuation);
        pathTreeWalk$dfsIterator$1.L$0 = obj;
        return pathTreeWalk$dfsIterator$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.nio.file.Path> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlin.io.path.PathTreeWalk$dfsIterator$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0106  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x01d9 -> B:14:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01db -> B:14:0x0146). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.sequences.SequenceScope sequenceScope;
        kotlin.collections.ArrayDeque arrayDeque;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader;
        boolean followLinks;
        kotlin.io.path.PathNode pathNode;
        java.nio.file.Path path;
        java.nio.file.Path path2;
        java.lang.Object keyOf;
        kotlin.io.path.PathTreeWalk pathTreeWalk;
        java.nio.file.Path path3;
        boolean createsCycle;
        kotlin.io.path.PathTreeWalk pathTreeWalk2;
        kotlin.sequences.SequenceScope sequenceScope2;
        kotlin.io.path.PathNode pathNode2;
        kotlin.collections.ArrayDeque arrayDeque2;
        java.nio.file.Path path4;
        kotlin.collections.ArrayDeque arrayDeque3;
        kotlin.io.path.DirectoryEntriesReader directoryEntriesReader2;
        java.nio.file.LinkOption[] linkOptionArr;
        kotlin.io.path.PathTreeWalk$dfsIterator$1 pathTreeWalk$dfsIterator$1;
        boolean createsCycle2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
            arrayDeque = new kotlin.collections.ArrayDeque();
            followLinks = this.this$0.getFollowLinks();
            directoryEntriesReader = new kotlin.io.path.DirectoryEntriesReader(followLinks);
            path = this.this$0.start;
            path2 = this.this$0.start;
            keyOf = kotlin.io.path.PathTreeWalkKt.keyOf(path2, this.this$0.getLinkOptions());
            pathNode = new kotlin.io.path.PathNode(path, keyOf, null);
            pathTreeWalk = this.this$0;
            path3 = pathNode.getPath();
            java.nio.file.LinkOption[] linkOptions = pathTreeWalk.getLinkOptions();
            java.nio.file.LinkOption[] linkOptionArr2 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions, linkOptions.length);
            if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                createsCycle = kotlin.io.path.PathTreeWalkKt.createsCycle(pathNode);
                if (!createsCycle) {
                    if (pathTreeWalk.getIncludeDirectories()) {
                        this.L$0 = sequenceScope;
                        this.L$1 = arrayDeque;
                        this.L$2 = directoryEntriesReader;
                        this.L$3 = pathNode;
                        this.L$4 = pathTreeWalk;
                        this.L$5 = path3;
                        this.label = 1;
                        if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pathTreeWalk2 = pathTreeWalk;
                        sequenceScope2 = sequenceScope;
                        pathNode2 = pathNode;
                        arrayDeque2 = arrayDeque;
                        path4 = path3;
                    }
                    java.nio.file.LinkOption[] linkOptions2 = pathTreeWalk.getLinkOptions();
                    linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions2, linkOptions2.length);
                    if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
                        pathNode.setContentIterator(directoryEntriesReader.readEntries(pathNode).iterator());
                        arrayDeque.addLast(pathNode);
                    }
                    arrayDeque3 = arrayDeque;
                    directoryEntriesReader2 = directoryEntriesReader;
                    pathTreeWalk$dfsIterator$1 = this;
                    while (!arrayDeque3.isEmpty()) {
                    }
                    return kotlin.Unit.INSTANCE;
                }
                throw new java.nio.file.FileSystemLoopException(path3.toString());
            }
            if (java.nio.file.Files.exists(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
                this.L$0 = sequenceScope;
                this.L$1 = arrayDeque;
                this.L$2 = directoryEntriesReader;
                this.label = 2;
                if (sequenceScope.yield(path3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            arrayDeque3 = arrayDeque;
            directoryEntriesReader2 = directoryEntriesReader;
            pathTreeWalk$dfsIterator$1 = this;
            while (!arrayDeque3.isEmpty()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    java.nio.file.Path path5 = (java.nio.file.Path) this.L$5;
                    kotlin.io.path.PathTreeWalk pathTreeWalk3 = (kotlin.io.path.PathTreeWalk) this.L$4;
                    kotlin.io.path.PathNode pathNode3 = (kotlin.io.path.PathNode) this.L$3;
                    kotlin.io.path.DirectoryEntriesReader directoryEntriesReader3 = (kotlin.io.path.DirectoryEntriesReader) this.L$2;
                    kotlin.collections.ArrayDeque arrayDeque4 = (kotlin.collections.ArrayDeque) this.L$1;
                    kotlin.sequences.SequenceScope sequenceScope3 = (kotlin.sequences.SequenceScope) this.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlin.sequences.SequenceScope sequenceScope4 = sequenceScope3;
                    kotlin.collections.ArrayDeque arrayDeque5 = arrayDeque4;
                    kotlin.io.path.DirectoryEntriesReader directoryEntriesReader4 = directoryEntriesReader3;
                    pathTreeWalk$dfsIterator$1 = this;
                    kotlin.sequences.SequenceScope sequenceScope5 = sequenceScope4;
                    java.nio.file.Path path6 = path5;
                    directoryEntriesReader2 = directoryEntriesReader4;
                    kotlin.io.path.PathNode next = pathNode3;
                    sequenceScope = sequenceScope5;
                    kotlin.collections.ArrayDeque arrayDeque6 = arrayDeque5;
                    kotlin.io.path.PathTreeWalk pathTreeWalk4 = pathTreeWalk3;
                    arrayDeque3 = arrayDeque6;
                    java.nio.file.LinkOption[] linkOptions3 = pathTreeWalk4.getLinkOptions();
                    java.nio.file.LinkOption[] linkOptionArr3 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions3, linkOptions3.length);
                    if (java.nio.file.Files.isDirectory(path6, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr3, linkOptionArr3.length))) {
                        next.setContentIterator(directoryEntriesReader2.readEntries(next).iterator());
                        arrayDeque3.addLast(next);
                    }
                    while (!arrayDeque3.isEmpty()) {
                        java.util.Iterator<kotlin.io.path.PathNode> contentIterator = ((kotlin.io.path.PathNode) arrayDeque3.last()).getContentIterator();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(contentIterator);
                        if (contentIterator.hasNext()) {
                            next = contentIterator.next();
                            pathTreeWalk4 = pathTreeWalk$dfsIterator$1.this$0;
                            path6 = next.getPath();
                            java.nio.file.LinkOption[] linkOptions4 = pathTreeWalk4.getLinkOptions();
                            java.nio.file.LinkOption[] linkOptionArr4 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions4, linkOptions4.length);
                            if (java.nio.file.Files.isDirectory(path6, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr4, linkOptionArr4.length))) {
                                createsCycle2 = kotlin.io.path.PathTreeWalkKt.createsCycle(next);
                                if (!createsCycle2) {
                                    if (pathTreeWalk4.getIncludeDirectories()) {
                                        pathTreeWalk$dfsIterator$1.L$0 = sequenceScope;
                                        pathTreeWalk$dfsIterator$1.L$1 = arrayDeque3;
                                        pathTreeWalk$dfsIterator$1.L$2 = directoryEntriesReader2;
                                        pathTreeWalk$dfsIterator$1.L$3 = next;
                                        pathTreeWalk$dfsIterator$1.L$4 = pathTreeWalk4;
                                        pathTreeWalk$dfsIterator$1.L$5 = path6;
                                        pathTreeWalk$dfsIterator$1.label = 3;
                                        if (sequenceScope.yield(path6, pathTreeWalk$dfsIterator$1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        directoryEntriesReader4 = directoryEntriesReader2;
                                        path5 = path6;
                                        sequenceScope4 = sequenceScope;
                                        pathNode3 = next;
                                        arrayDeque5 = arrayDeque3;
                                        pathTreeWalk3 = pathTreeWalk4;
                                        kotlin.sequences.SequenceScope sequenceScope52 = sequenceScope4;
                                        java.nio.file.Path path62 = path5;
                                        directoryEntriesReader2 = directoryEntriesReader4;
                                        kotlin.io.path.PathNode next2 = pathNode3;
                                        sequenceScope = sequenceScope52;
                                        kotlin.collections.ArrayDeque arrayDeque62 = arrayDeque5;
                                        kotlin.io.path.PathTreeWalk pathTreeWalk42 = pathTreeWalk3;
                                        arrayDeque3 = arrayDeque62;
                                    }
                                    java.nio.file.LinkOption[] linkOptions32 = pathTreeWalk42.getLinkOptions();
                                    java.nio.file.LinkOption[] linkOptionArr32 = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions32, linkOptions32.length);
                                    if (java.nio.file.Files.isDirectory(path62, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr32, linkOptionArr32.length))) {
                                    }
                                    while (!arrayDeque3.isEmpty()) {
                                    }
                                } else {
                                    throw new java.nio.file.FileSystemLoopException(path62.toString());
                                }
                            } else if (java.nio.file.Files.exists(path62, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(new java.nio.file.LinkOption[]{java.nio.file.LinkOption.NOFOLLOW_LINKS}, 1))) {
                                pathTreeWalk$dfsIterator$1.L$0 = sequenceScope;
                                pathTreeWalk$dfsIterator$1.L$1 = arrayDeque3;
                                pathTreeWalk$dfsIterator$1.L$2 = directoryEntriesReader2;
                                pathTreeWalk$dfsIterator$1.L$3 = null;
                                pathTreeWalk$dfsIterator$1.L$4 = null;
                                pathTreeWalk$dfsIterator$1.L$5 = null;
                                pathTreeWalk$dfsIterator$1.label = 4;
                                if (sequenceScope.yield(path62, pathTreeWalk$dfsIterator$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            arrayDeque3.removeLast();
                        }
                    }
                    return kotlin.Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            directoryEntriesReader2 = (kotlin.io.path.DirectoryEntriesReader) this.L$2;
            arrayDeque3 = (kotlin.collections.ArrayDeque) this.L$1;
            sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            pathTreeWalk$dfsIterator$1 = this;
            while (!arrayDeque3.isEmpty()) {
            }
            return kotlin.Unit.INSTANCE;
        }
        path4 = (java.nio.file.Path) this.L$5;
        pathTreeWalk2 = (kotlin.io.path.PathTreeWalk) this.L$4;
        pathNode2 = (kotlin.io.path.PathNode) this.L$3;
        directoryEntriesReader = (kotlin.io.path.DirectoryEntriesReader) this.L$2;
        arrayDeque2 = (kotlin.collections.ArrayDeque) this.L$1;
        sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
        kotlin.ResultKt.throwOnFailure(obj);
        path3 = path4;
        arrayDeque = arrayDeque2;
        pathNode = pathNode2;
        sequenceScope = sequenceScope2;
        pathTreeWalk = pathTreeWalk2;
        java.nio.file.LinkOption[] linkOptions22 = pathTreeWalk.getLinkOptions();
        linkOptionArr = (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptions22, linkOptions22.length);
        if (java.nio.file.Files.isDirectory(path3, (java.nio.file.LinkOption[]) java.util.Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
        }
        arrayDeque3 = arrayDeque;
        directoryEntriesReader2 = directoryEntriesReader;
        pathTreeWalk$dfsIterator$1 = this;
        while (!arrayDeque3.isEmpty()) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
