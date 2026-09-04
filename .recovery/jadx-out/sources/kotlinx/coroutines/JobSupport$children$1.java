package kotlinx.coroutines;

/* compiled from: JobSupport.kt */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlin/sequences/SequenceScope;", "Lkotlinx/coroutines/Job;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", i = {1, 1, 1}, l = {956, 958}, m = "invokeSuspend", n = {"$this$sequence", "this_$iv", "cur$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: /workspace/.recovery/dex/classes3.dex */
final class JobSupport$children$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super kotlinx.coroutines.Job>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    final /* synthetic */ kotlinx.coroutines.JobSupport this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JobSupport$children$1(kotlinx.coroutines.JobSupport jobSupport, kotlin.coroutines.Continuation<? super kotlinx.coroutines.JobSupport$children$1> continuation) {
        super(2, continuation);
        this.this$0 = jobSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        kotlinx.coroutines.JobSupport$children$1 jobSupport$children$1 = new kotlinx.coroutines.JobSupport$children$1(this.this$0, continuation);
        jobSupport$children$1.L$0 = obj;
        return jobSupport$children$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super kotlinx.coroutines.Job> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((kotlinx.coroutines.JobSupport$children$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0072 -> B:6:0x0088). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0085 -> B:6:0x0088). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.NodeList list;
        kotlin.sequences.SequenceScope sequenceScope;
        kotlinx.coroutines.JobSupport$children$1 jobSupport$children$1;
        kotlinx.coroutines.internal.LockFreeLinkedListHead lockFreeLinkedListHead;
        kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.sequences.SequenceScope sequenceScope2 = (kotlin.sequences.SequenceScope) this.L$0;
            java.lang.Object state$kotlinx_coroutines_core = this.this$0.getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.ChildHandleNode) {
                this.label = 1;
                if (sequenceScope2.yield(((kotlinx.coroutines.ChildHandleNode) state$kotlinx_coroutines_core).childJob, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Incomplete) && (list = ((kotlinx.coroutines.Incomplete) state$kotlinx_coroutines_core).getList()) != null) {
                kotlinx.coroutines.NodeList nodeList = list;
                java.lang.Object next = nodeList.getNext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                kotlinx.coroutines.internal.LockFreeLinkedListNode lockFreeLinkedListNode2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) next;
                sequenceScope = sequenceScope2;
                jobSupport$children$1 = this;
                lockFreeLinkedListHead = nodeList;
                lockFreeLinkedListNode = lockFreeLinkedListNode2;
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                }
            }
        } else if (i == 1) {
            kotlin.ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lockFreeLinkedListNode = (kotlinx.coroutines.internal.LockFreeLinkedListNode) this.L$2;
            lockFreeLinkedListHead = (kotlinx.coroutines.internal.LockFreeLinkedListHead) this.L$1;
            sequenceScope = (kotlin.sequences.SequenceScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
            jobSupport$children$1 = this;
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                if (lockFreeLinkedListNode instanceof kotlinx.coroutines.ChildHandleNode) {
                    kotlinx.coroutines.ChildJob childJob = ((kotlinx.coroutines.ChildHandleNode) lockFreeLinkedListNode).childJob;
                    jobSupport$children$1.L$0 = sequenceScope;
                    jobSupport$children$1.L$1 = lockFreeLinkedListHead;
                    jobSupport$children$1.L$2 = lockFreeLinkedListNode;
                    jobSupport$children$1.label = 2;
                    if (sequenceScope.yield(childJob, jobSupport$children$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
                if (!kotlin.jvm.internal.Intrinsics.areEqual(lockFreeLinkedListNode, lockFreeLinkedListHead)) {
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }
}
