package kotlinx.coroutines.channels;

/* compiled from: BufferedChannel.kt */
@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\"\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0004Þ\u0001ß\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\"\b\u0002\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\u0010\u0010P\u001a\u00020\u001c2\u0006\u0010Q\u001a\u00020\u0010H\u0002J\u0006\u0010R\u001a\u00020\u0007J\u0010\u0010R\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016J\u0016\u0010R\u001a\u00020\u00072\u000e\u0010S\u001a\n\u0018\u00010Tj\u0004\u0018\u0001`UJ\u0017\u0010V\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0010¢\u0006\u0002\bWJ\u001e\u0010X\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010K\u001a\u00020\u0010H\u0002J\u0006\u0010Z\u001a\u00020\u0007J\u0012\u0010[\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001a\u0010]\u001a\u00020\u001c2\b\u0010S\u001a\u0004\u0018\u00010\u00162\u0006\u0010R\u001a\u00020\u001cH\u0014J\u0010\u0010^\u001a\u00020\u00072\u0006\u0010_\u001a\u00020\u0010H\u0002J\u0016\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010_\u001a\u00020\u0010H\u0002J\b\u0010a\u001a\u00020\u0007H\u0002J\u0010\u0010b\u001a\u00020\u00072\u0006\u0010c\u001a\u00020\u0010H\u0004J\b\u0010d\u001a\u00020\u0007H\u0002J.\u0010e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010h\u001a\u00020\u0010H\u0002J&\u0010i\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J&\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00142\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\r\u0010k\u001a\u00020\u001cH\u0000¢\u0006\u0002\blJ\u0012\u0010m\u001a\u00020\u00072\b\b\u0002\u0010n\u001a\u00020\u0010H\u0002J\b\u0010o\u001a\u00020\u0007H\u0002J-\u0010p\u001a\u00020\u00072#\u0010q\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(S\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J&\u0010r\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0006\u0010u\u001a\u00020\u0010H\u0002J\u0018\u0010v\u001a\u00020\u001c2\u0006\u0010w\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0096\u0002J\u0016\u0010z\u001a\u00020\u00102\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010{\u001a\u00020\u0007H\u0002J\b\u0010|\u001a\u00020\u0007H\u0002J\b\u0010}\u001a\u00020\u0007H\u0002J\u001e\u0010~\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00102\f\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\b\u0010\u007f\u001a\u00020\u0007H\u0014J\"\u0010\u0080\u0001\u001a\u00020\u00072\u0014\u0010\u0081\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0\u0082\u0001H\u0002ø\u0001\u0000J\u0019\u0010\u0083\u0001\u001a\u00020\u00072\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0082\u0001H\u0002J\u0015\u0010\u0084\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002J$\u0010\u0085\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0003\u0010\u0087\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J(\u0010\u008a\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u000e\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0082\u0001H\u0002¢\u0006\u0003\u0010\u008b\u0001J\t\u0010\u008c\u0001\u001a\u00020\u0007H\u0014J\t\u0010\u008d\u0001\u001a\u00020\u0007H\u0014J!\u0010\u008e\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0091\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J!\u0010\u0093\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\f2\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\fH\u0002J\u0013\u0010\u0094\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0095\u0001J%\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0096@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0095\u0001JD\u0010\u0098\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u008c\u0002\u0010\u009c\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2$\u0010\u009f\u0001\u001a\u001f\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0005\u0012\u0003H\u009d\u00010\u00062V\u0010 \u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u0001082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012X\b\u0002\u0010¥\u0001\u001aQ\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0099\u0001\u0012\u0005\u0012\u0003H\u009d\u000108H\u0082\b¢\u0006\u0003\u0010¦\u0001Jh\u0010§\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012#\u0010\u009f\u0001\u001a\u001e\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\bJ2\u0010©\u0001\u001a\u00028\u00002\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010\u009b\u0001J \u0010ª\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u008f\u0001\u001a\u0004\u0018\u00010\fH\u0002J \u0010«\u0001\u001a\u00020\u00072\n\u0010<\u001a\u0006\u0012\u0002\b\u0003092\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\fH\u0014J\u0017\u0010¬\u0001\u001a\u00020\u00072\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001c\u0010\u00ad\u0001\u001a\u00020\u00072\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0003\u0010\u0089\u0001J\u001f\u0010®\u0001\u001a\u00020\u001c2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0090@ø\u0001\u0000¢\u0006\u0006\b¯\u0001\u0010\u0089\u0001J\u0082\u0002\u0010°\u0001\u001a\u0003H\u009d\u0001\"\u0005\b\u0001\u0010\u009d\u00012\u0007\u0010\u0086\u0001\u001a\u00028\u00002\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u000f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012A\u0010 \u0001\u001a<\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0005\u0012\u0003H\u009d\u00010²\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u0003H\u009d\u00010¤\u00012o\b\u0002\u0010¥\u0001\u001ah\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¡\u0001\u0012\u0014\u0012\u00120\u0004¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(¢\u0001\u0012\u0014\u0012\u00128\u0000¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(\u0086\u0001\u0012\u0014\u0012\u00120\u0010¢\u0006\r\b:\u0012\t\b;\u0012\u0005\b\b(´\u0001\u0012\u0005\u0012\u0003H\u009d\u00010³\u0001H\u0084\b¢\u0006\u0003\u0010µ\u0001Jb\u0010¶\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\b\u0010\u009e\u0001\u001a\u00030¨\u00012\u000e\u0010±\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u00012\u000e\u0010£\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070¤\u0001H\u0082\b¢\u0006\u0003\u0010·\u0001J;\u0010¸\u0001\u001a\u00020\u00072\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0003\u0010¹\u0001J\u000f\u0010º\u0001\u001a\u00020\u001cH\u0010¢\u0006\u0003\b»\u0001J\u0012\u0010º\u0001\u001a\u00020\u001c2\u0007\u0010¼\u0001\u001a\u00020\u0010H\u0003J\n\u0010½\u0001\u001a\u00030¾\u0001H\u0016J\u0010\u0010¿\u0001\u001a\u00030¾\u0001H\u0000¢\u0006\u0003\bÀ\u0001J!\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000,H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J*\u0010Ä\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070,2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0016ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J(\u0010Ç\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J(\u0010É\u0001\u001a\u00020\u001c2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010È\u0001\u001a\u00020\u0010H\u0002J5\u0010Ê\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002J5\u0010Ë\u0001\u001a\u0004\u0018\u00010\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0099\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\fH\u0002JK\u0010Ì\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001JK\u0010Ï\u0001\u001a\u00020\u00042\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u00042\u0007\u0010\u0086\u0001\u001a\u00028\u00002\u0007\u0010´\u0001\u001a\u00020\u00102\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\f2\u0007\u0010Í\u0001\u001a\u00020\u001cH\u0002¢\u0006\u0003\u0010Î\u0001J\u0012\u0010Ð\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0012\u0010Ò\u0001\u001a\u00020\u00072\u0007\u0010Ñ\u0001\u001a\u00020\u0010H\u0002J\u0017\u0010Ó\u0001\u001a\u00020\u00072\u0006\u0010u\u001a\u00020\u0010H\u0000¢\u0006\u0003\bÔ\u0001J$\u0010Õ\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J$\u0010Ö\u0001\u001a\u00020\u0007*\u00030¨\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002J\u000e\u0010×\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u000e\u0010Ø\u0001\u001a\u00020\u0007*\u00030¨\u0001H\u0002J\u0017\u0010Ù\u0001\u001a\u00020\u0007*\u00030¨\u00012\u0007\u0010Ú\u0001\u001a\u00020\u001cH\u0002J\u001c\u0010Û\u0001\u001a\u00020\u001c*\u00020\f2\u0007\u0010\u0086\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0003\u0010Ü\u0001J#\u0010Ý\u0001\u001a\u00020\u001c*\u00020\f2\f\u0010s\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0006\u0010t\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u0082\u0004R\t\u0010\u001a\u001a\u00020\u000eX\u0082\u0004R\u001a\u0010\u001b\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u001a\u0010 \u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020\u001c8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001c8VX\u0097\u0004¢\u0006\f\u0012\u0004\b$\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010*R)\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0'8VX\u0096\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b-\u0010\u001e\u001a\u0004\b.\u0010*R\"\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000'8VX\u0096\u0004¢\u0006\f\u0012\u0004\b0\u0010\u001e\u001a\u0004\b1\u0010*R,\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000038VX\u0096\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b5\u00106R*\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000Ru\u00107\u001ac\u0012\u0017\u0012\u0015\u0012\u0002\b\u000309¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(<\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(=\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b:\u0012\b\b;\u0012\u0004\b\b(>\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u000108j\u0004\u0018\u0001`?X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b@\u0010\u001eR\u0014\u0010A\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0018R\u0015\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010D\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010E\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010\u0012R\u0014\u0010G\u001a\u00020\u00168DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u0018R\u0015\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00140\u000bX\u0082\u0004R\t\u0010J\u001a\u00020\u000eX\u0082\u0004R\u0014\u0010K\u001a\u00020\u00108@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0012R\u0018\u0010M\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0018\u0010O\u001a\u00020\u001c*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bO\u0010N\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006à\u0001"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "capacity", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "onUndeliveredElement", "Lkotlin/Function1;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(ILkotlin/jvm/functions/Function1;)V", "_closeCause", "Lkotlinx/atomicfu/AtomicRef;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "bufferEnd", "Lkotlinx/atomicfu/AtomicLong;", "bufferEndCounter", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getBufferEndCounter", "()J", "bufferEndSegment", "Lkotlinx/coroutines/channels/ChannelSegment;", "closeCause", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "getCloseCause", "()Ljava/lang/Throwable;", "closeHandler", "completedExpandBuffersAndPauseFlag", "isClosedForReceive", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "isClosedForReceive$annotations", "()V", "()Z", "isClosedForSend", "isClosedForSend$annotations", "isConflatedDropOldest", "isEmpty", "isEmpty$annotations", "isRendezvousOrUnlimited", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive$annotations", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching$annotations", "getOnReceiveCatching", "onReceiveOrNull", "getOnReceiveOrNull$annotations", "getOnReceiveOrNull", "onSend", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend$annotations", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onUndeliveredElementReceiveCancellationConstructor", "Lkotlin/Function3;", "Lkotlinx/coroutines/selects/SelectInstance;", "Lkotlin/ParameterName;", "name", "select", "param", "internalResult", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "receiveException", "getReceiveException", "receiveSegment", "receivers", "receiversCounter", "getReceiversCounter$kotlinx_coroutines_core", "sendException", "getSendException", "sendSegment", "sendersAndCloseStatus", "sendersCounter", "getSendersCounter$kotlinx_coroutines_core", "isClosedForReceive0", "(J)Z", "isClosedForSend0", "bufferOrRendezvousSend", "curSenders", "cancel", "cause", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelSuspendedReceiveRequests", "lastSegment", "checkSegmentStructureInvariants", "close", "closeLinkedList", "closeOrCancelImpl", "completeCancel", "sendersCur", "completeClose", "completeCloseOrCancel", "dropFirstElementUntilTheSpecifiedCellIsInTheBuffer", "globalCellIndex", "expandBuffer", "findSegmentBufferEnd", "id", "startFrom", "currentBufferEndCounter", "findSegmentReceive", "findSegmentSend", "hasElements", "hasElements$kotlinx_coroutines_core", "incCompletedExpandBufferAttempts", "nAttempts", "invokeCloseHandler", "invokeOnClose", "handler", "isCellNonEmpty", "segment", "index", "globalIndex", "isClosed", "sendersAndCloseStatusCur", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "markAllEmptyCellsAsClosed", "markCancellationStarted", "markCancelled", "markClosed", "moveSegmentBufferEndToSpecifiedOrLast", "onClosedIdempotent", "onClosedReceiveCatchingOnNoWaiterSuspend", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "onClosedReceiveOnNoWaiterSuspend", "onClosedSelectOnReceive", "onClosedSelectOnSend", "element", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)V", "onClosedSend", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClosedSendOnNoWaiterSuspend", "(Ljava/lang/Object;Lkotlinx/coroutines/CancellableContinuation;)V", "onReceiveDequeued", "onReceiveEnqueued", "processResultSelectReceive", "ignoredParam", "selectResult", "processResultSelectReceiveCatching", "processResultSelectReceiveOrNull", "processResultSelectSend", "receive", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveCatchingOnNoWaiterSuspend", "r", "receiveCatchingOnNoWaiterSuspend-GKJJFZk", "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveImpl", "R", "waiter", "onElementRetrieved", "onSuspend", "segm", "i", "onClosed", "Lkotlin/Function0;", "onNoWaiterSuspend", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "receiveImplOnNoWaiter", "Lkotlinx/coroutines/Waiter;", "receiveOnNoWaiterSuspend", "registerSelectForReceive", "registerSelectForSend", "removeUnprocessedElements", "send", "sendBroadcast", "sendBroadcast$kotlinx_coroutines_core", "sendImpl", "onRendezvousOrBuffered", "Lkotlin/Function2;", "Lkotlin/Function4;", "s", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "sendImplOnNoWaiter", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlinx/coroutines/Waiter;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "sendOnNoWaiterSuspend", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldSendSuspend", "shouldSendSuspend$kotlinx_coroutines_core", "curSendersAndCloseStatus", "toString", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "toStringDebug", "toStringDebug$kotlinx_coroutines_core", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "trySend", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "updateCellExpandBuffer", "b", "updateCellExpandBufferSlow", "updateCellReceive", "updateCellReceiveSlow", "updateCellSend", "closed", "(Lkotlinx/coroutines/channels/ChannelSegment;ILjava/lang/Object;JLjava/lang/Object;Z)I", "updateCellSendSlow", "updateReceiversCounterIfLower", "value", "updateSendersCounterIfLower", "waitExpandBufferCompletion", "waitExpandBufferCompletion$kotlinx_coroutines_core", "prepareReceiverForSuspension", "prepareSenderForSuspension", "resumeReceiverOnClosedChannel", "resumeSenderOnCancelledChannel", "resumeWaiterOnClosedChannel", "receiver", "tryResumeReceiver", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "tryResumeSender", "BufferedChannelIterator", "SendBroadcast", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public class BufferedChannel<E> implements kotlinx.coroutines.channels.Channel<E> {

    @kotlin.jvm.Volatile
    private volatile java.lang.Object _closeCause;

    @kotlin.jvm.Volatile
    private volatile long bufferEnd;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object bufferEndSegment;
    private final int capacity;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object closeHandler;

    @kotlin.jvm.Volatile
    private volatile long completedExpandBuffersAndPauseFlag;
    public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>> onUndeliveredElementReceiveCancellationConstructor;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object receiveSegment;

    @kotlin.jvm.Volatile
    private volatile long receivers;

    @kotlin.jvm.Volatile
    private volatile java.lang.Object sendSegment;

    @kotlin.jvm.Volatile
    private volatile long sendersAndCloseStatus;
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater sendersAndCloseStatus$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "sendersAndCloseStatus");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater receivers$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "receivers");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater bufferEnd$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "bufferEnd");
    private static final java.util.concurrent.atomic.AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$FU = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, "completedExpandBuffersAndPauseFlag");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater sendSegment$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "sendSegment");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater receiveSegment$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "receiveSegment");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater bufferEndSegment$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "bufferEndSegment");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater _closeCause$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "_closeCause");
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater closeHandler$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.channels.BufferedChannel.class, java.lang.Object.class, "closeHandler");

    private final java.lang.Object getAndUpdate$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> function1, java.lang.Object obj) {
        java.lang.Object obj2;
        do {
            obj2 = atomicReferenceFieldUpdater.get(obj);
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, obj, obj2, function1.invoke(obj2)));
        return obj2;
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    public static /* synthetic */ void isEmpty$annotations() {
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(java.lang.Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final void loop$atomicfu(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> function1, java.lang.Object obj) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void update$atomicfu(java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.Long> function1, java.lang.Object obj) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, function1.invoke(java.lang.Long.valueOf(j)).longValue()));
    }

    protected boolean isConflatedDropOldest() {
        return false;
    }

    protected void onClosedIdempotent() {
    }

    protected void onReceiveDequeued() {
    }

    protected void onReceiveEnqueued() {
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public java.lang.Object receive(kotlin.coroutines.Continuation<? super E> continuation) {
        return receive$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public java.lang.Object mo1152receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        return m1150receiveCatchingJP2dKIU$suspendImpl(this, continuation);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return send$suspendImpl(this, e, continuation);
    }

    public java.lang.Object sendBroadcast$kotlinx_coroutines_core(E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return sendBroadcast$suspendImpl(this, e, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BufferedChannel(int i, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> function1) {
        long initialBufferEnd;
        kotlinx.coroutines.internal.Symbol symbol;
        this.capacity = i;
        this.onUndeliveredElement = function1;
        if (i >= 0) {
            initialBufferEnd = kotlinx.coroutines.channels.BufferedChannelKt.initialBufferEnd(i);
            this.bufferEnd = initialBufferEnd;
            this.completedExpandBuffersAndPauseFlag = getBufferEndCounter();
            kotlinx.coroutines.channels.ChannelSegment channelSegment = new kotlinx.coroutines.channels.ChannelSegment(0L, null, this, 3);
            this.sendSegment = channelSegment;
            this.receiveSegment = channelSegment;
            if (isRendezvousOrUnlimited()) {
                channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
                kotlin.jvm.internal.Intrinsics.checkNotNull(channelSegment, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment = channelSegment;
            this.onUndeliveredElementReceiveCancellationConstructor = function1 != 0 ? (kotlin.jvm.functions.Function3) new kotlin.jvm.functions.Function3<kotlinx.coroutines.selects.SelectInstance<?>, java.lang.Object, java.lang.Object, kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends kotlin.Unit>>(this) { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1
                final /* synthetic */ kotlinx.coroutines.channels.BufferedChannel<E> this$0;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                    this.this$0 = this;
                }

                @Override // kotlin.jvm.functions.Function3
                public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> invoke(final kotlinx.coroutines.selects.SelectInstance<?> selectInstance, java.lang.Object obj, final java.lang.Object obj2) {
                    final kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = this.this$0;
                    return new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: kotlinx.coroutines.channels.BufferedChannel$onUndeliveredElementReceiveCancellationConstructor$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                            invoke2(th);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(java.lang.Throwable th) {
                            if (obj2 != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                                kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj2, selectInstance.getContext());
                            }
                        }
                    };
                }
            } : null;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE;
            this._closeCause = symbol;
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid channel capacity: " + i + ", should be >=0").toString());
    }

    public /* synthetic */ BufferedChannel(int i, kotlin.jvm.functions.Function1 function1, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : function1);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E e) {
        return kotlinx.coroutines.channels.Channel.DefaultImpls.offer(this, e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
        return (E) kotlinx.coroutines.channels.Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> continuation) {
        return kotlinx.coroutines.channels.Channel.DefaultImpls.receiveOrNull(this, continuation);
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$FU.get(this) & 1152921504606846975L;
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$FU.get(this);
    }

    private final long getBufferEndCounter() {
        return bufferEnd$FU.get(this);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
    }

    static /* synthetic */ <E> java.lang.Object send$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment<E> findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    java.lang.Object onClosedSend = bufferedChannel.onClosedSend(e, continuation);
                    if (onClosedSend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend;
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, null, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    java.lang.Object sendOnNoWaiterSuspend = bufferedChannel.sendOnNoWaiterSuspend(channelSegment, i, e, j, continuation);
                    if (sendOnNoWaiterSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return sendOnNoWaiterSuspend;
                    }
                } else if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else {
                    if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    java.lang.Object onClosedSend2 = bufferedChannel.onClosedSend(e, continuation);
                    if (onClosedSend2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return onClosedSend2;
                    }
                }
            } else if (!isClosedForSend0) {
                if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
                    throw new java.lang.AssertionError();
                }
            } else {
                channelSegment.onSlotCleaned();
                java.lang.Object onClosedSend3 = bufferedChannel.onClosedSend(e, continuation);
                if (onClosedSend3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return onClosedSend3;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(kotlinx.coroutines.Waiter waiter, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E element, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cont) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element, cont.getContext());
        }
        kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> cancellableContinuation = cont;
        java.lang.Throwable sendException = getSendException();
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            sendException = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(sendException, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) cancellableContinuation);
        }
        kotlin.Result.Companion companion = kotlin.Result.Companion;
        cancellableContinuation.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(sendException)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
    
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(kotlin.Unit.INSTANCE);
     */
    @Override // kotlinx.coroutines.channels.SendChannel
    /* renamed from: trySend-JP2dKIU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object mo1148trySendJP2dKIU(E element) {
        java.lang.Object obj;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        if (shouldSendSuspend(sendersAndCloseStatus$FU.get(this))) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1172failurePtdJZtk();
        }
        obj = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, obj, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
            } else {
                kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                }
                channelSegment.onSlotCleaned();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1172failurePtdJZtk();
            }
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(getSendException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u001d\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/CancellableContinuation;)V", "getCont", "()Lkotlinx/coroutines/CancellableContinuation;", "invokeOnCancellation", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "segment", "Lkotlinx/coroutines/internal/Segment;", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public static final class SendBroadcast implements kotlinx.coroutines.Waiter {
        private final /* synthetic */ kotlinx.coroutines.CancellableContinuationImpl<java.lang.Boolean> $$delegate_0;
        private final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;

        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            this.$$delegate_0.invokeOnCancellation(segment, index);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> cancellableContinuation) {
            this.cont = cancellableContinuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlin.Boolean>");
            this.$$delegate_0 = (kotlinx.coroutines.CancellableContinuationImpl) cancellableContinuation;
        }
    }

    public static /* synthetic */ java.lang.Object sendImpl$default(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, java.lang.Object obj2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function4 function4, int i, java.lang.Object obj3) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        if (obj3 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendImpl");
        }
        kotlin.jvm.functions.Function4 function42 = (i & 32) != 0 ? new kotlin.jvm.functions.Function4() { // from class: kotlinx.coroutines.channels.BufferedChannel$sendImpl$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
                return invoke((kotlinx.coroutines.channels.ChannelSegment<int>) obj4, ((java.lang.Number) obj5).intValue(), (int) obj6, ((java.lang.Number) obj7).longValue());
            }

            public final java.lang.Void invoke(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2, int i2, E e, long j) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
        } : function4;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return function02.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i2, obj, j, obj2, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return function0.invoke();
            }
            if (updateCellSend == 1) {
                return function0.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return function02.invoke();
                }
                kotlinx.coroutines.Waiter waiter = obj2 instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                return function2.invoke(channelSegment, java.lang.Integer.valueOf(i2));
            }
            if (updateCellSend == 3) {
                return function42.invoke(channelSegment, java.lang.Integer.valueOf(i2), obj, java.lang.Long.valueOf(j));
            }
            if (updateCellSend == 4) {
                if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return function02.invoke();
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    protected final <R> R sendImpl(E element, java.lang.Object waiter, kotlin.jvm.functions.Function0<? extends R> onRendezvousOrBuffered, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? extends R> onSuspend, kotlin.jvm.functions.Function0<? extends R> onClosed, kotlin.jvm.functions.Function4<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super E, ? super java.lang.Long, ? extends R> onNoWaiterSuspend) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    return onClosed.invoke();
                }
            } else {
                channelSegment = channelSegment2;
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, waiter, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                return onRendezvousOrBuffered.invoke();
            }
            if (updateCellSend == 1) {
                return onRendezvousOrBuffered.invoke();
            }
            if (updateCellSend == 2) {
                if (isClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return onClosed.invoke();
                }
                kotlinx.coroutines.Waiter waiter2 = waiter instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareSenderForSuspension(waiter2, channelSegment, i);
                }
                return onSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i));
            }
            if (updateCellSend == 3) {
                return onNoWaiterSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i), element, java.lang.Long.valueOf(j));
            }
            if (updateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return onClosed.invoke();
            }
            if (updateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
    }

    private final void sendImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, E element, long s, kotlinx.coroutines.Waiter waiter, kotlin.jvm.functions.Function0<kotlin.Unit> onRendezvousOrBuffered, kotlin.jvm.functions.Function0<kotlin.Unit> onClosed) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.Waiter waiter2 = waiter;
        int updateCellSend = updateCellSend(segment, index, element, s, waiter, false);
        if (updateCellSend == 0) {
            segment.cleanPrev();
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (updateCellSend == 1) {
            onRendezvousOrBuffered.invoke();
            return;
        }
        if (updateCellSend == 2) {
            prepareSenderForSuspension(waiter2, segment, index);
            return;
        }
        if (updateCellSend == 4) {
            if (s < getReceiversCounter$kotlinx_coroutines_core()) {
                segment.cleanPrev();
            }
            onClosed.invoke();
            return;
        }
        if (updateCellSend == 5) {
            segment.cleanPrev();
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(this);
            while (true) {
                long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
                long j = andIncrement & 1152921504606846975L;
                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j2) {
                    kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment2);
                    if (findSegmentSend != null) {
                        channelSegment = findSegmentSend;
                    } else if (isClosedForSend0) {
                        onClosed.invoke();
                        return;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                kotlinx.coroutines.channels.ChannelSegment channelSegment3 = channelSegment;
                int updateCellSend2 = updateCellSend(channelSegment, i, element, j, waiter, isClosedForSend0);
                if (updateCellSend2 == 0) {
                    channelSegment3.cleanPrev();
                    onRendezvousOrBuffered.invoke();
                    return;
                }
                if (updateCellSend2 == 1) {
                    onRendezvousOrBuffered.invoke();
                    return;
                }
                if (updateCellSend2 == 2) {
                    if (isClosedForSend0) {
                        channelSegment3.onSlotCleaned();
                        onClosed.invoke();
                        return;
                    }
                    if (!(waiter2 instanceof kotlinx.coroutines.Waiter)) {
                        waiter2 = null;
                    }
                    if (waiter2 != null) {
                        prepareSenderForSuspension(waiter2, channelSegment3, i);
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    return;
                }
                if (updateCellSend2 == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend2 == 4) {
                    if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment3.cleanPrev();
                    }
                    onClosed.invoke();
                    return;
                } else {
                    if (updateCellSend2 == 5) {
                        channelSegment3.cleanPrev();
                    }
                    channelSegment2 = channelSegment3;
                }
            }
        } else {
            throw new java.lang.IllegalStateException("unexpected".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, E element, long s, java.lang.Object waiter, boolean closed) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        segment.storeElement$kotlinx_coroutines_core(index, element);
        if (closed) {
            return updateCellSendSlow(segment, index, element, s, waiter, closed);
        }
        java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(s)) {
                if (segment.casState$kotlinx_coroutines_core(index, null, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) {
            segment.cleanElement$kotlinx_coroutines_core(index);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                segment.setState$kotlinx_coroutines_core(index, symbol3);
                onReceiveDequeued();
                return 0;
            }
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
            java.lang.Object andSetState$kotlinx_coroutines_core = segment.getAndSetState$kotlinx_coroutines_core(index, symbol);
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
            if (andSetState$kotlinx_coroutines_core != symbol2) {
                segment.onCancelledRequest(index, true);
            }
            return 5;
        }
        return updateCellSendSlow(segment, index, element, s, waiter, closed);
    }

    private final int updateCellSendSlow(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, E element, long s, java.lang.Object waiter, boolean closed) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(s) || closed) {
                    if (closed) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                        if (segment.casState$kotlinx_coroutines_core(index, null, symbol)) {
                            segment.onCancelledRequest(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.casState$kotlinx_coroutines_core(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.casState$kotlinx_coroutines_core(index, null, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core == symbol2) {
                    if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED)) {
                        return 1;
                    }
                } else {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                    if (state$kotlinx_coroutines_core == symbol3) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        return 5;
                    }
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == symbol4) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                        segment.cleanElement$kotlinx_coroutines_core(index);
                        completeCloseOrCancel();
                        return 4;
                    }
                    if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB)) {
                        throw new java.lang.AssertionError();
                    }
                    segment.cleanElement$kotlinx_coroutines_core(index);
                    if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                        state$kotlinx_coroutines_core = ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, element)) {
                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                        segment.setState$kotlinx_coroutines_core(index, symbol7);
                        onReceiveDequeued();
                        return 0;
                    }
                    symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                    java.lang.Object andSetState$kotlinx_coroutines_core = segment.getAndSetState$kotlinx_coroutines_core(index, symbol5);
                    symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                    if (andSetState$kotlinx_coroutines_core != symbol6) {
                        segment.onCancelledRequest(index, true);
                    }
                    return 5;
                }
            }
        }
    }

    private final boolean shouldSendSuspend(long curSendersAndCloseStatus) {
        if (isClosedForSend0(curSendersAndCloseStatus)) {
            return false;
        }
        return !bufferOrRendezvousSend(curSendersAndCloseStatus & 1152921504606846975L);
    }

    private final boolean bufferOrRendezvousSend(long curSenders) {
        return curSenders < getBufferEndCounter() || curSenders < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$FU.get(this));
    }

    private final boolean tryResumeReceiver(java.lang.Object obj, E e) {
        boolean tryResume0;
        boolean tryResume02;
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            return ((kotlinx.coroutines.selects.SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof kotlinx.coroutines.channels.ReceiveCatching) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.channels.ReceiveCatching receiveCatching = (kotlinx.coroutines.channels.ReceiveCatching) obj;
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl = receiveCatching.cont;
            kotlinx.coroutines.channels.ChannelResult m1158boximpl = kotlinx.coroutines.channels.ChannelResult.m1158boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(e));
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
            tryResume02 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0(cancellableContinuationImpl, m1158boximpl, function1 != null ? kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function1, e, receiveCatching.cont.getContext()) : null);
            return tryResume02;
        }
        if (obj instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) obj).tryResumeHasNext(e);
        }
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            kotlinx.coroutines.CancellableContinuation cancellableContinuation = (kotlinx.coroutines.CancellableContinuation) obj;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
            tryResume0 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0(cancellableContinuation, e, function12 != null ? kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function12, e, cancellableContinuation.getContext()) : null);
            return tryResume0;
        }
        throw new java.lang.IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    static /* synthetic */ <E> java.lang.Object receive$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j) {
                kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, null);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                throw new java.lang.IllegalStateException("unexpected".toString());
            }
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    return bufferedChannel.receiveOnNoWaiterSuspend(channelSegment, i, andIncrement, continuation);
                }
                channelSegment.cleanPrev();
                return updateCellReceive;
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
        throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(kotlinx.coroutines.Waiter waiter, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super E> cont) {
        kotlin.Result.Companion companion = kotlin.Result.Companion;
        cont.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(getReceiveException())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ <E> java.lang.Object m1150receiveCatchingJP2dKIU$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        int i;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        if (continuation instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1) continuation;
            if ((bufferedChannel$receiveCatching$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$12 = bufferedChannel$receiveCatching$1;
                java.lang.Object obj = bufferedChannel$receiveCatching$12.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bufferedChannel$receiveCatching$12.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
                }
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
                    long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                    int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                    if (channelSegment2.id != j) {
                        kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                        if (findSegmentReceive == null) {
                            continue;
                        } else {
                            channelSegment = findSegmentReceive;
                        }
                    } else {
                        channelSegment = channelSegment2;
                    }
                    java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, null);
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    if (updateCellReceive == symbol) {
                        throw new java.lang.IllegalStateException("unexpected".toString());
                    }
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    if (updateCellReceive != symbol2) {
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                        if (updateCellReceive == symbol3) {
                            bufferedChannel$receiveCatching$12.label = 1;
                            java.lang.Object m1151receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel.m1151receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i2, andIncrement, bufferedChannel$receiveCatching$12);
                            return m1151receiveCatchingOnNoWaiterSuspendGKJJFZk == coroutine_suspended ? coroutine_suspended : m1151receiveCatchingOnNoWaiterSuspendGKJJFZk;
                        }
                        channelSegment.cleanPrev();
                        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(updateCellReceive);
                    }
                    if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    channelSegment2 = channelSegment;
                }
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(bufferedChannel.getCloseCause());
            }
        }
        bufferedChannel$receiveCatching$1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1(bufferedChannel, continuation);
        kotlinx.coroutines.channels.BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$122 = bufferedChannel$receiveCatching$1;
        java.lang.Object obj2 = bufferedChannel$receiveCatching$122.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bufferedChannel$receiveCatching$122.label;
        if (i == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m1151receiveCatchingOnNoWaiterSuspendGKJJFZk(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> continuation) {
        kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        int i2;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.channels.ChannelResult m1158boximpl;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        if (continuation instanceof kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuation;
            if ((bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label & kotlin.jvm.internal.IntCompanionObject.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label -= kotlin.jvm.internal.IntCompanionObject.MIN_VALUE;
                java.lang.Object obj = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
                    bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
                    kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$12 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
                    kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12));
                    try {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(orCreateCancellableContinuation, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel.receiveCatchingOnNoWaiterSuspend_GKJJFZk$lambda$35>>");
                        kotlinx.coroutines.channels.ReceiveCatching receiveCatching = new kotlinx.coroutines.channels.ReceiveCatching(orCreateCancellableContinuation);
                        java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                        if (updateCellReceive == symbol) {
                            prepareReceiverForSuspension(receiveCatching, channelSegment, i);
                        } else {
                            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1 = null;
                            function1 = null;
                            if (updateCellReceive == symbol2) {
                                if (j < getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment.cleanPrev();
                                }
                                kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
                                while (true) {
                                    if (isClosedForReceive()) {
                                        onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                        break;
                                    }
                                    long andIncrement = receivers$FU.getAndIncrement(this);
                                    long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                    int i3 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                    if (channelSegment2.id != j2) {
                                        kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                                        if (findSegmentReceive != null) {
                                            channelSegment2 = findSegmentReceive;
                                        }
                                    }
                                    java.lang.Object updateCellReceive2 = updateCellReceive(channelSegment2, i3, andIncrement, receiveCatching);
                                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                                    if (updateCellReceive2 == symbol3) {
                                        kotlinx.coroutines.channels.ReceiveCatching receiveCatching2 = receiveCatching instanceof kotlinx.coroutines.Waiter ? receiveCatching : null;
                                        if (receiveCatching2 != null) {
                                            prepareReceiverForSuspension(receiveCatching2, channelSegment2, i3);
                                        }
                                    } else {
                                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                                        if (updateCellReceive2 != symbol4) {
                                            symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                                            if (updateCellReceive2 == symbol5) {
                                                throw new java.lang.IllegalStateException("unexpected".toString());
                                            }
                                            channelSegment2.cleanPrev();
                                            m1158boximpl = kotlinx.coroutines.channels.ChannelResult.m1158boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(updateCellReceive2));
                                            kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
                                            if (function12 != null) {
                                                function1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                            }
                                        } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment2.cleanPrev();
                                        }
                                    }
                                }
                            } else {
                                channelSegment.cleanPrev();
                                m1158boximpl = kotlinx.coroutines.channels.ChannelResult.m1158boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(updateCellReceive));
                                kotlin.jvm.functions.Function1<E, kotlin.Unit> function13 = this.onUndeliveredElement;
                                if (function13 != null) {
                                    function1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            }
                            orCreateCancellableContinuation.resume(m1158boximpl, function1);
                        }
                        obj = orCreateCancellableContinuation.getResult();
                        if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(bufferedChannel$receiveCatchingOnNoWaiterSuspend$12);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (java.lang.Throwable th) {
                        orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                        throw th;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0;
                    int i4 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return ((kotlinx.coroutines.channels.ChannelResult) obj).getHolder();
            }
        }
        bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new kotlinx.coroutines.channels.BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuation);
        java.lang.Object obj2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i2 != 0) {
        }
        return ((kotlinx.coroutines.channels.ChannelResult) obj2).getHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(kotlinx.coroutines.CancellableContinuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> cont) {
        kotlin.Result.Companion companion = kotlin.Result.Companion;
        cont.resumeWith(kotlin.Result.constructor-impl(kotlinx.coroutines.channels.ChannelResult.m1158boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(getCloseCause()))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public java.lang.Object mo1153tryReceivePtdJZtk() {
        java.lang.Object obj;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        long j = receivers$FU.get(this);
        long j2 = sendersAndCloseStatus$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(getCloseCause());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1172failurePtdJZtk();
        }
        obj = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            long j3 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j3) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j3, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, andIncrement, obj);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegment.onSlotCleaned();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1172failurePtdJZtk();
            }
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(updateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
        return kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(getCloseCause());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long globalCellIndex) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && !isConflatedDropOldest()) {
            throw new java.lang.AssertionError();
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
        while (true) {
            java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
            long j = atomicLongFieldUpdater.get(this);
            if (globalCellIndex < java.lang.Math.max(this.capacity + j, getBufferEndCounter())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j, j + 1)) {
                long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment.id != j2) {
                    kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = findSegmentReceive(j2, channelSegment);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                }
                java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, j, null);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol) {
                    channelSegment.cleanPrev();
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
                    if (function1 != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, updateCellReceive, null, 2, null)) != null) {
                        throw callUndeliveredElementCatchingException$default;
                    }
                } else if (j < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            }
        }
    }

    static /* synthetic */ java.lang.Object receiveImpl$default(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, java.lang.Object obj, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function3 function32, int i, java.lang.Object obj2) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: receiveImpl");
        }
        if ((i & 16) != 0) {
            function32 = new kotlin.jvm.functions.Function3() { // from class: kotlinx.coroutines.channels.BufferedChannel$receiveImpl$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return invoke((kotlinx.coroutines.channels.ChannelSegment) obj3, ((java.lang.Number) obj4).intValue(), ((java.lang.Number) obj5).longValue());
                }

                public final java.lang.Void invoke(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i2, long j) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
            };
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i2, andIncrement, obj);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                kotlinx.coroutines.Waiter waiter = obj instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) obj : null;
                if (waiter != null) {
                    bufferedChannel.prepareReceiverForSuspension(waiter, channelSegment, i2);
                }
                return function3.invoke(channelSegment, java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(andIncrement));
            }
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    return function32.invoke(channelSegment, java.lang.Integer.valueOf(i2), java.lang.Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return function1.invoke(updateCellReceive);
            }
            if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        return function0.invoke();
    }

    private final <R> R receiveImpl(java.lang.Object waiter, kotlin.jvm.functions.Function1<? super E, ? extends R> onElementRetrieved, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> onSuspend, kotlin.jvm.functions.Function0<? extends R> onClosed, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.channels.ChannelSegment<E>, ? super java.lang.Integer, ? super java.lang.Long, ? extends R> onNoWaiterSuspend) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment2);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            kotlinx.coroutines.internal.Symbol symbol4 = (java.lang.Object) updateCellReceive(channelSegment, i, andIncrement, waiter);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (symbol4 == symbol) {
                kotlinx.coroutines.Waiter waiter2 = waiter instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) waiter : null;
                if (waiter2 != null) {
                    prepareReceiverForSuspension(waiter2, channelSegment, i);
                }
                return onSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(andIncrement));
            }
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (symbol4 != symbol2) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                if (symbol4 == symbol3) {
                    return onNoWaiterSuspend.invoke(channelSegment, java.lang.Integer.valueOf(i), java.lang.Long.valueOf(andIncrement));
                }
                channelSegment.cleanPrev();
                return onElementRetrieved.invoke(symbol4);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
        }
        return onClosed.invoke();
    }

    private final void receiveImplOnNoWaiter(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long r, kotlinx.coroutines.Waiter waiter, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> onElementRetrieved, kotlin.jvm.functions.Function0<kotlin.Unit> onClosed) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6 = (java.lang.Object) updateCellReceive(segment, index, r, waiter);
        symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
        if (symbol6 == symbol) {
            prepareReceiverForSuspension(waiter, segment, index);
            return;
        }
        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
        if (symbol6 != symbol2) {
            segment.cleanPrev();
            onElementRetrieved.invoke(symbol6);
            return;
        }
        if (r < getSendersCounter$kotlinx_coroutines_core()) {
            segment.cleanPrev();
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            kotlinx.coroutines.internal.Symbol symbol7 = (java.lang.Object) updateCellReceive(channelSegment, i, andIncrement, waiter);
            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (symbol7 == symbol3) {
                if (!(waiter instanceof kotlinx.coroutines.Waiter)) {
                    waiter = null;
                }
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i);
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                return;
            }
            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (symbol7 != symbol4) {
                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                if (symbol7 == symbol5) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                onElementRetrieved.invoke(symbol7);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        onClosed.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object updateCellReceive(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long r, java.lang.Object waiter) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if (state$kotlinx_coroutines_core == null) {
            if (r >= (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    return symbol2;
                }
            }
        } else if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                expandBuffer();
                return segment.retrieveElement$kotlinx_coroutines_core(index);
            }
        }
        return updateCellReceiveSlow(segment, index, r, waiter);
    }

    private final java.lang.Object updateCellReceiveSlow(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long r, java.lang.Object waiter) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        kotlinx.coroutines.internal.Symbol symbol8;
        kotlinx.coroutines.internal.Symbol symbol9;
        kotlinx.coroutines.internal.Symbol symbol10;
        kotlinx.coroutines.internal.Symbol symbol11;
        kotlinx.coroutines.internal.Symbol symbol12;
        kotlinx.coroutines.internal.Symbol symbol13;
        kotlinx.coroutines.internal.Symbol symbol14;
        kotlinx.coroutines.internal.Symbol symbol15;
        kotlinx.coroutines.internal.Symbol symbol16;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol5) {
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                        if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol6)) {
                            expandBuffer();
                            return segment.retrieveElement$kotlinx_coroutines_core(index);
                        }
                    } else {
                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                        if (state$kotlinx_coroutines_core == symbol7) {
                            symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            return symbol8;
                        }
                        symbol9 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol9) {
                            symbol10 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            return symbol10;
                        }
                        if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            symbol11 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            return symbol11;
                        }
                        symbol12 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                        if (state$kotlinx_coroutines_core != symbol12) {
                            symbol13 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol13)) {
                                boolean z = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB;
                                if (z) {
                                    state$kotlinx_coroutines_core = ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter;
                                }
                                if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                                    symbol16 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                                    segment.setState$kotlinx_coroutines_core(index, symbol16);
                                    expandBuffer();
                                    return segment.retrieveElement$kotlinx_coroutines_core(index);
                                }
                                symbol14 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                                segment.setState$kotlinx_coroutines_core(index, symbol14);
                                segment.onCancelledRequest(index, false);
                                if (z) {
                                    expandBuffer();
                                }
                                symbol15 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                                return symbol15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (r < (sendersAndCloseStatus$FU.get(this) & 1152921504606846975L)) {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                    expandBuffer();
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    return symbol2;
                }
            } else {
                if (waiter == null) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    return symbol3;
                }
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, waiter)) {
                    expandBuffer();
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                    return symbol4;
                }
            }
        }
    }

    private final boolean tryResumeSender(java.lang.Object obj, kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i) {
        if (obj instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default((kotlinx.coroutines.CancellableContinuation) obj, kotlin.Unit.INSTANCE, null, 2, null);
        }
        if (obj instanceof kotlinx.coroutines.selects.SelectInstance) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            kotlinx.coroutines.selects.TrySelectDetailedResult trySelectDetailed = ((kotlinx.coroutines.selects.SelectImplementation) obj).trySelectDetailed(this, kotlin.Unit.INSTANCE);
            if (trySelectDetailed == kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailed == kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
            return kotlinx.coroutines.channels.BufferedChannelKt.tryResume0$default(((kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) obj).getCont(), true, null, 2, null);
        }
        throw new java.lang.IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) bufferEndSegment$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$FU.getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd = findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (findSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = findSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final boolean updateCellExpandBuffer(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long b) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
        if ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) && b >= receivers$FU.get(this)) {
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
            if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                    segment.setState$kotlinx_coroutines_core(index, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED);
                    return true;
                }
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                segment.setState$kotlinx_coroutines_core(index, symbol2);
                segment.onCancelledRequest(index, false);
                return false;
            }
        }
        return updateCellExpandBufferSlow(segment, index, b);
    }

    private final boolean updateCellExpandBufferSlow(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long b) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        kotlinx.coroutines.internal.Symbol symbol8;
        while (true) {
            java.lang.Object state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                if (state$kotlinx_coroutines_core != symbol3) {
                    if (state$kotlinx_coroutines_core == null) {
                        symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol4)) {
                            return true;
                        }
                    } else if (state$kotlinx_coroutines_core != kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                        if (state$kotlinx_coroutines_core == symbol5) {
                            break;
                        }
                        symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                        if (state$kotlinx_coroutines_core == symbol6) {
                            break;
                        }
                        symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                        if (state$kotlinx_coroutines_core == symbol7 || state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                            return true;
                        }
                        symbol8 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                        if (state$kotlinx_coroutines_core != symbol8) {
                            throw new java.lang.IllegalStateException(("Unexpected cell state: " + state$kotlinx_coroutines_core).toString());
                        }
                    } else {
                        return true;
                    }
                } else {
                    return false;
                }
            } else if (b < receivers$FU.get(this)) {
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, new kotlinx.coroutines.channels.WaiterEB((kotlinx.coroutines.Waiter) state$kotlinx_coroutines_core))) {
                    return true;
                }
            } else {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                if (segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, segment, index)) {
                        segment.setState$kotlinx_coroutines_core(index, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                    segment.setState$kotlinx_coroutines_core(index, symbol2);
                    segment.onCancelledRequest(index, false);
                    return false;
                }
            }
        }
    }

    static /* synthetic */ void incCompletedExpandBufferAttempts$default(kotlinx.coroutines.channels.BufferedChannel bufferedChannel, long j, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void incCompletedExpandBufferAttempts(long nAttempts) {
        if ((completedExpandBuffersAndPauseFlag$FU.addAndGet(this, nAttempts) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((completedExpandBuffersAndPauseFlag$FU.get(this) & 4611686018427387904L) != 0);
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long globalIndex) {
        int i;
        long j;
        long constructEBCompletedAndPauseFlag;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater;
        long constructEBCompletedAndPauseFlag2;
        long j2;
        long constructEBCompletedAndPauseFlag3;
        if (isRendezvousOrUnlimited()) {
            return;
        }
        do {
        } while (getBufferEndCounter() <= globalIndex);
        i = kotlinx.coroutines.channels.BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = getBufferEndCounter();
            if (bufferEndCounter == (kotlin.time.DurationKt.MAX_MILLIS & completedExpandBuffersAndPauseFlag$FU.get(this)) && bufferEndCounter == getBufferEndCounter()) {
                return;
            }
        }
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$FU;
        do {
            j = atomicLongFieldUpdater2.get(this);
            constructEBCompletedAndPauseFlag = kotlinx.coroutines.channels.BufferedChannelKt.constructEBCompletedAndPauseFlag(j & kotlin.time.DurationKt.MAX_MILLIS, true);
        } while (!atomicLongFieldUpdater2.compareAndSet(this, j, constructEBCompletedAndPauseFlag));
        while (true) {
            long bufferEndCounter2 = getBufferEndCounter();
            atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$FU;
            long j3 = atomicLongFieldUpdater.get(this);
            long j4 = j3 & kotlin.time.DurationKt.MAX_MILLIS;
            boolean z = (4611686018427387904L & j3) != 0;
            if (bufferEndCounter2 == j4 && bufferEndCounter2 == getBufferEndCounter()) {
                break;
            } else if (!z) {
                constructEBCompletedAndPauseFlag2 = kotlinx.coroutines.channels.BufferedChannelKt.constructEBCompletedAndPauseFlag(j4, true);
                atomicLongFieldUpdater.compareAndSet(this, j3, constructEBCompletedAndPauseFlag2);
            }
        }
        do {
            j2 = atomicLongFieldUpdater.get(this);
            constructEBCompletedAndPauseFlag3 = kotlinx.coroutines.channels.BufferedChannelKt.constructEBCompletedAndPauseFlag(j2 & kotlin.time.DurationKt.MAX_MILLIS, false);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, constructEBCompletedAndPauseFlag3));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.BufferedChannel<E>> getOnSend() {
        kotlinx.coroutines.channels.BufferedChannel$onSend$1 bufferedChannel$onSend$1 = kotlinx.coroutines.channels.BufferedChannel$onSend$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onSend$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onSend$2 bufferedChannel$onSend$2 = kotlinx.coroutines.channels.BufferedChannel$onSend$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onSend$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.SelectClause2Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onSend$2, 3), null, 8, null);
    }

    private final void onClosedSelectOnSend(E element, kotlinx.coroutines.selects.SelectInstance<?> select) {
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        if (function1 != null) {
            kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(function1, element, select.getContext());
        }
        select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectSend(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
        kotlinx.coroutines.channels.BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = kotlinx.coroutines.channels.BufferedChannel$onReceive$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceive$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = kotlinx.coroutines.channels.BufferedChannel$onReceive$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceive$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceive$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
        kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = kotlinx.coroutines.channels.BufferedChannel$onReceiveCatching$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveCatching$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveCatching$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
        kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$1.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        kotlin.jvm.functions.Function3 function3 = (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$1, 3);
        kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = kotlinx.coroutines.channels.BufferedChannel$onReceiveOrNull$2.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(bufferedChannel$onReceiveOrNull$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new kotlinx.coroutines.selects.SelectClause1Impl(this, function3, (kotlin.jvm.functions.Function3) kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(bufferedChannel$onReceiveOrNull$2, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    private final void onClosedSelectOnReceive(kotlinx.coroutines.selects.SelectInstance<?> select) {
        select.selectInRegistrationPhase(kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectReceive(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectReceiveOrNull(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        if (selectResult != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
            return selectResult;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object processResultSelectReceiveCatching(java.lang.Object ignoredParam, java.lang.Object selectResult) {
        return kotlinx.coroutines.channels.ChannelResult.m1158boximpl(selectResult == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED() ? kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(getCloseCause()) : kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1173successJP2dKIU(selectResult));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
        return new kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BufferedChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0011\u0010\t\u001a\u00020\u0006H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\nJ/\u0010\u000b\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0013\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0014R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "(Lkotlinx/coroutines/channels/BufferedChannel;)V", "continuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "receiveResult", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "hasNext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextOnNoWaiterSuspend", "segment", "Lkotlinx/coroutines/channels/ChannelSegment;", "index", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "r", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "(Lkotlinx/coroutines/channels/ChannelSegment;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invokeOnCancellation", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/Segment;", "next", "()Ljava/lang/Object;", "onClosedHasNext", "onClosedHasNextNoWaiterSuspend", "tryResumeHasNext", "element", "(Ljava/lang/Object;)Z", "tryResumeHasNextOnClosedChannel", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: /workspace/.recovery/dex/classes3.dex */
    public final class BufferedChannelIterator implements kotlinx.coroutines.channels.ChannelIterator<E>, kotlinx.coroutines.Waiter {
        private kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> continuation;
        private java.lang.Object receiveResult;

        public BufferedChannelIterator() {
            kotlinx.coroutines.internal.Symbol symbol;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = symbol;
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation continuation) {
            return kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(this, continuation);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment;
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            kotlinx.coroutines.internal.Symbol symbol3;
            kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = kotlinx.coroutines.channels.BufferedChannel.this;
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU.get(bufferedChannel);
            while (!bufferedChannel.isClosedForReceive()) {
                long andIncrement = kotlinx.coroutines.channels.BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                if (channelSegment2.id != j) {
                    kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                    if (findSegmentReceive == null) {
                        continue;
                    } else {
                        channelSegment = findSegmentReceive;
                    }
                } else {
                    channelSegment = channelSegment2;
                }
                java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, andIncrement, null);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                if (updateCellReceive == symbol) {
                    throw new java.lang.IllegalStateException("unreachable".toString());
                }
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                if (updateCellReceive != symbol2) {
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                    if (updateCellReceive == symbol3) {
                        return hasNextOnNoWaiterSuspend(channelSegment, i, andIncrement, continuation);
                    }
                    channelSegment.cleanPrev();
                    this.receiveResult = updateCellReceive;
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                }
                if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                channelSegment2 = channelSegment;
            }
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(onClosedHasNext());
        }

        private final boolean onClosedHasNext() {
            this.receiveResult = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(kotlinx.coroutines.internal.Segment<?> segment, int index) {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, index);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                cancellableContinuationImpl.resumeWith(kotlin.Result.constructor-impl(false));
                return;
            }
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                closeCause = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(closeCause)));
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            E e = (E) this.receiveResult;
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e == symbol) {
                throw new java.lang.IllegalStateException("`hasNext()` has not been invoked".toString());
            }
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.NO_RECEIVE_RESULT;
            this.receiveResult = symbol2;
            if (e != kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e;
            }
            throw kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(kotlinx.coroutines.channels.BufferedChannel.this.getReceiveException());
        }

        public final boolean tryResumeHasNext(E element) {
            boolean tryResume0;
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = element;
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = kotlinx.coroutines.channels.BufferedChannel.this.onUndeliveredElement;
            tryResume0 = kotlinx.coroutines.channels.BufferedChannelKt.tryResume0(cancellableContinuationImpl2, true, function1 != null ? kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function1, element, cancellableContinuationImpl.getContext()) : null);
            return tryResume0;
        }

        public final void tryResumeHasNextOnClosedChannel() {
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl = this.continuation;
            kotlin.jvm.internal.Intrinsics.checkNotNull(cancellableContinuationImpl);
            this.continuation = null;
            this.receiveResult = kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED();
            java.lang.Throwable closeCause = kotlinx.coroutines.channels.BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                cancellableContinuationImpl.resumeWith(kotlin.Result.constructor-impl(false));
                return;
            }
            kotlinx.coroutines.CancellableContinuationImpl<? super java.lang.Boolean> cancellableContinuationImpl2 = cancellableContinuationImpl;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl2 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                closeCause = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(closeCause, cancellableContinuationImpl2);
            }
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            cancellableContinuationImpl2.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(closeCause)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.Object hasNextOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
            kotlinx.coroutines.internal.Symbol symbol;
            kotlinx.coroutines.internal.Symbol symbol2;
            java.lang.Boolean boxBoolean;
            kotlinx.coroutines.internal.Symbol symbol3;
            kotlinx.coroutines.internal.Symbol symbol4;
            kotlinx.coroutines.internal.Symbol symbol5;
            kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel = kotlinx.coroutines.channels.BufferedChannel.this;
            kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
            try {
                this.continuation = orCreateCancellableContinuation;
                java.lang.Object updateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j, this);
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                if (updateCellReceive == symbol) {
                    bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                } else {
                    symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                    kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1 = null;
                    function1 = null;
                    if (updateCellReceive == symbol2) {
                        if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.channels.BufferedChannel.receiveSegment$FU.get(bufferedChannel);
                        while (true) {
                            if (bufferedChannel.isClosedForReceive()) {
                                onClosedHasNextNoWaiterSuspend();
                                break;
                            }
                            long andIncrement = kotlinx.coroutines.channels.BufferedChannel.receivers$FU.getAndIncrement(bufferedChannel);
                            long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                            int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                            if (channelSegment2.id != j2) {
                                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment2);
                                if (findSegmentReceive != null) {
                                    channelSegment2 = findSegmentReceive;
                                }
                            }
                            java.lang.Object updateCellReceive2 = bufferedChannel.updateCellReceive(channelSegment2, i2, andIncrement, this);
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                            if (updateCellReceive2 == symbol3) {
                                kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator bufferedChannelIterator = this instanceof kotlinx.coroutines.Waiter ? this : null;
                                if (bufferedChannelIterator != null) {
                                    bufferedChannel.prepareReceiverForSuspension(bufferedChannelIterator, channelSegment2, i2);
                                }
                            } else {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                                if (updateCellReceive2 != symbol4) {
                                    symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                                    if (updateCellReceive2 == symbol5) {
                                        throw new java.lang.IllegalStateException("unexpected".toString());
                                    }
                                    channelSegment2.cleanPrev();
                                    this.receiveResult = updateCellReceive2;
                                    this.continuation = null;
                                    boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = bufferedChannel.onUndeliveredElement;
                                    if (function12 != null) {
                                        function1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive2, orCreateCancellableContinuation.getContext());
                                    }
                                } else if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                    channelSegment2.cleanPrev();
                                }
                            }
                        }
                    } else {
                        channelSegment.cleanPrev();
                        this.receiveResult = updateCellReceive;
                        this.continuation = null;
                        boxBoolean = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        kotlin.jvm.functions.Function1<E, kotlin.Unit> function13 = bufferedChannel.onUndeliveredElement;
                        if (function13 != null) {
                            function1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                        }
                    }
                    orCreateCancellableContinuation.resume(boxBoolean, function1);
                }
                java.lang.Object result = orCreateCancellableContinuation.getResult();
                if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return result;
            } catch (java.lang.Throwable th) {
                orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final java.lang.Throwable getCloseCause() {
        return (java.lang.Throwable) _closeCause$FU.get(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final java.lang.Throwable getSendException() {
        java.lang.Throwable closeCause = getCloseCause();
        return closeCause == null ? new kotlinx.coroutines.channels.ClosedSendChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Throwable getReceiveException() {
        java.lang.Throwable closeCause = getCloseCause();
        return closeCause == null ? new kotlinx.coroutines.channels.ClosedReceiveChannelException(kotlinx.coroutines.channels.ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable cause) {
        return closeOrCancelImpl(cause, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(java.lang.Throwable cause) {
        return cancelImpl$kotlinx_coroutines_core(cause);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(java.util.concurrent.CancellationException cause) {
        cancelImpl$kotlinx_coroutines_core(cause);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(java.lang.Throwable cause) {
        if (cause == null) {
            cause = new java.util.concurrent.CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(cause, true);
    }

    protected boolean closeOrCancelImpl(java.lang.Throwable cause, boolean cancel) {
        kotlinx.coroutines.internal.Symbol symbol;
        if (cancel) {
            markCancellationStarted();
        }
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$FU;
        symbol = kotlinx.coroutines.channels.BufferedChannelKt.NO_CLOSE_CAUSE;
        boolean m = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol, cause);
        if (cancel) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (m) {
            invokeCloseHandler();
        }
        return m;
    }

    private final void invokeCloseHandler() {
        java.lang.Object obj;
        kotlinx.coroutines.internal.Symbol symbol;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$FU;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            } else {
                symbol = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, obj, symbol));
        if (obj == null) {
            return;
        }
        ((kotlin.jvm.functions.Function1) obj).invoke(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> handler) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$FU;
        if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, (java.lang.Object) null, handler)) {
            return;
        }
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater2.get(this);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED;
            if (obj == symbol) {
                atomicReferenceFieldUpdater = closeHandler$FU;
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            } else {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                if (obj != symbol2) {
                    throw new java.lang.IllegalStateException(("Another handler is already registered: " + obj).toString());
                }
                throw new java.lang.IllegalStateException("Another handler was already registered and successfully invoked".toString());
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, symbol3, symbol4));
        handler.invoke(getCloseCause());
    }

    private final void markClosed() {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 2);
            } else if (i != 1) {
                return;
            } else {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(j & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void markCancelled() {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void markCancellationStarted() {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            } else {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> completeClose(long sendersCur) {
        kotlinx.coroutines.channels.ChannelSegment<E> closeLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long markAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(closeLinkedList);
            if (markAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(markAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(closeLinkedList, sendersCur);
        return closeLinkedList;
    }

    private final void completeCancel(long sendersCur) {
        removeUnprocessedElements(completeClose(sendersCur));
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> closeLinkedList() {
        java.lang.Object obj = bufferEndSegment$FU.get(this);
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(this);
        if (channelSegment.id > ((kotlinx.coroutines.channels.ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
        if (channelSegment2.id > ((kotlinx.coroutines.channels.ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.ConcurrentLinkedListKt.close((kotlinx.coroutines.internal.ConcurrentLinkedListNode) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (kotlinx.coroutines.channels.ChannelSegment) r8.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long markAllEmptyCellsAsClosed(kotlinx.coroutines.channels.ChannelSegment<E> lastSegment) {
        kotlinx.coroutines.internal.Symbol symbol;
        do {
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 >= i) {
                    break;
                }
                long j = (lastSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i;
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    return -1L;
                }
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                                return j;
                            }
                        }
                    }
                    if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                        lastSegment.onSlotCleaned();
                        break;
                    }
                }
            }
        } while (lastSegment != null);
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (kotlinx.coroutines.channels.ChannelSegment) r12.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void removeUnprocessedElements(kotlinx.coroutines.channels.ChannelSegment<E> lastSegment) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException = null;
        java.lang.Object m1194constructorimpl$default = kotlinx.coroutines.internal.InlineList.m1194constructorimpl$default(null, 1, null);
        loop0: do {
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1;
            while (true) {
                if (-1 >= i) {
                    break;
                }
                long j = (lastSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i;
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (function1 != null) {
                                undeliveredElementException = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, lastSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementException);
                            }
                            lastSegment.cleanElement$kotlinx_coroutines_core(i);
                            lastSegment.onSlotCleaned();
                        }
                    } else {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core == symbol2 || state$kotlinx_coroutines_core == null) {
                            if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                lastSegment.onSlotCleaned();
                                break;
                            }
                        } else if ((state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter) || (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB)) {
                            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            kotlinx.coroutines.Waiter waiter = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB ? ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter : (kotlinx.coroutines.Waiter) state$kotlinx_coroutines_core;
                            if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                if (function1 != null) {
                                    undeliveredElementException = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(function1, lastSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementException);
                                }
                                m1194constructorimpl$default = kotlinx.coroutines.internal.InlineList.m1199plusFjFbRPM(m1194constructorimpl$default, waiter);
                                lastSegment.cleanElement$kotlinx_coroutines_core(i);
                                lastSegment.onSlotCleaned();
                            }
                        } else {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core == symbol3) {
                                break loop0;
                            }
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                            if (state$kotlinx_coroutines_core == symbol4) {
                                break loop0;
                            }
                            symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                            if (state$kotlinx_coroutines_core != symbol5) {
                                break;
                            }
                        }
                    }
                }
                i--;
            }
        } while (lastSegment != null);
        if (m1194constructorimpl$default != null) {
            if (!(m1194constructorimpl$default instanceof java.util.ArrayList)) {
                resumeSenderOnCancelledChannel((kotlinx.coroutines.Waiter) m1194constructorimpl$default);
            } else {
                kotlin.jvm.internal.Intrinsics.checkNotNull(m1194constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                java.util.ArrayList arrayList = (java.util.ArrayList) m1194constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((kotlinx.coroutines.Waiter) arrayList.get(size));
                }
            }
        }
        if (undeliveredElementException != null) {
            throw undeliveredElementException;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(kotlinx.coroutines.channels.ChannelSegment<E> lastSegment, long sendersCounter) {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.Object m1194constructorimpl$default = kotlinx.coroutines.internal.InlineList.m1194constructorimpl$default(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((lastSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    java.lang.Object state$kotlinx_coroutines_core = lastSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null) {
                        symbol = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                        if (state$kotlinx_coroutines_core != symbol) {
                            if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                                if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m1194constructorimpl$default = kotlinx.coroutines.internal.InlineList.m1199plusFjFbRPM(m1194constructorimpl$default, ((kotlinx.coroutines.channels.WaiterEB) state$kotlinx_coroutines_core).waiter);
                                    lastSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            } else {
                                if (!(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                                    break;
                                }
                                if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    m1194constructorimpl$default = kotlinx.coroutines.internal.InlineList.m1199plusFjFbRPM(m1194constructorimpl$default, state$kotlinx_coroutines_core);
                                    lastSegment.onCancelledRequest(i, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (lastSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                        lastSegment.onSlotCleaned();
                        break;
                    }
                }
            }
            lastSegment = (kotlinx.coroutines.channels.ChannelSegment) lastSegment.getPrev();
        }
        if (m1194constructorimpl$default != null) {
            if (!(m1194constructorimpl$default instanceof java.util.ArrayList)) {
                resumeReceiverOnClosedChannel((kotlinx.coroutines.Waiter) m1194constructorimpl$default);
                return;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(m1194constructorimpl$default, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            java.util.ArrayList arrayList = (java.util.ArrayList) m1194constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((kotlinx.coroutines.Waiter) arrayList.get(size));
            }
        }
    }

    private final void resumeReceiverOnClosedChannel(kotlinx.coroutines.Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(kotlinx.coroutines.Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(kotlinx.coroutines.Waiter waiter, boolean z) {
        if (waiter instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
            kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont = ((kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) waiter).getCont();
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            cont.resumeWith(kotlin.Result.constructor-impl(false));
            return;
        }
        if (waiter instanceof kotlinx.coroutines.CancellableContinuation) {
            kotlin.coroutines.Continuation continuation = (kotlin.coroutines.Continuation) waiter;
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            continuation.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(z ? getReceiveException() : getSendException())));
        } else if (waiter instanceof kotlinx.coroutines.channels.ReceiveCatching) {
            kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<? extends E>> cancellableContinuationImpl = ((kotlinx.coroutines.channels.ReceiveCatching) waiter).cont;
            kotlin.Result.Companion companion3 = kotlin.Result.Companion;
            cancellableContinuationImpl.resumeWith(kotlin.Result.constructor-impl(kotlinx.coroutines.channels.ChannelResult.m1158boximpl(kotlinx.coroutines.channels.ChannelResult.INSTANCE.m1171closedJP2dKIU(getCloseCause()))));
        } else if (waiter instanceof kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) {
            ((kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else {
            if (!(waiter instanceof kotlinx.coroutines.selects.SelectInstance)) {
                throw new java.lang.IllegalStateException(("Unexpected waiter: " + waiter).toString());
            }
            ((kotlinx.coroutines.selects.SelectInstance) waiter).trySelect(this, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED());
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$FU.get(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$FU.get(this));
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    private final boolean isClosed(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i = (int) (sendersAndCloseStatusCur >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(sendersAndCloseStatusCur & 1152921504606846975L);
            if (isClosedForReceive && hasElements$kotlinx_coroutines_core()) {
                return false;
            }
        } else if (i == 3) {
            completeCancel(sendersAndCloseStatusCur & 1152921504606846975L);
        } else {
            throw new java.lang.IllegalStateException(("unexpected close status: " + i).toString());
        }
        return true;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
            kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) atomicReferenceFieldUpdater.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            long j = receiversCounter$kotlinx_coroutines_core / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            if (channelSegment.id == j || (channelSegment = findSegmentReceive(j, channelSegment)) != null) {
                channelSegment.cleanPrev();
                if (isCellNonEmpty(channelSegment, (int) (receiversCounter$kotlinx_coroutines_core % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, receiversCounter$kotlinx_coroutines_core + 1);
            } else if (((kotlinx.coroutines.channels.ChannelSegment) atomicReferenceFieldUpdater.get(this)).id < j) {
                return false;
            }
        }
    }

    private final boolean isCellNonEmpty(kotlinx.coroutines.channels.ChannelSegment<E> segment, int index, long globalIndex) {
        java.lang.Object state$kotlinx_coroutines_core;
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        do {
            state$kotlinx_coroutines_core = segment.getState$kotlinx_coroutines_core(index);
            if (state$kotlinx_coroutines_core != null) {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                if (state$kotlinx_coroutines_core != symbol2) {
                    if (state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) {
                        return true;
                    }
                    symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                    if (state$kotlinx_coroutines_core == symbol3 || state$kotlinx_coroutines_core == kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return false;
                    }
                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                    if (state$kotlinx_coroutines_core == symbol4) {
                        return false;
                    }
                    symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                    if (state$kotlinx_coroutines_core == symbol5) {
                        return false;
                    }
                    symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                    if (state$kotlinx_coroutines_core == symbol6) {
                        return true;
                    }
                    symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                    return state$kotlinx_coroutines_core != symbol7 && globalIndex == getReceiversCounter$kotlinx_coroutines_core();
                }
            }
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
        } while (!segment.casState$kotlinx_coroutines_core(index, state$kotlinx_coroutines_core, symbol));
        expandBuffer();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentSend(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m1209getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m1209getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1209getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
        if (channelSegment.id > id) {
            updateSendersCounterIfLower(channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getReceiversCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment.id == id) {
            return channelSegment;
        }
        throw new java.lang.AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentReceive(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$FU;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m1209getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m1209getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1209getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            if (startFrom.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            startFrom.cleanPrev();
            return null;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
        if (!isRendezvousOrUnlimited() && id <= getBufferEndCounter() / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$FU;
            while (true) {
                kotlinx.coroutines.internal.Segment segment2 = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater2.get(this);
                kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2 = channelSegment;
                if (segment2.id >= channelSegment2.id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater2, this, segment2, channelSegment2)) {
                    if (segment2.decPointers$kotlinx_coroutines_core()) {
                        segment2.remove();
                    }
                } else if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                    channelSegment2.remove();
                }
            }
        }
        if (channelSegment.id > id) {
            updateReceiversCounterIfLower(channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE >= getSendersCounter$kotlinx_coroutines_core()) {
                return null;
            }
            channelSegment.cleanPrev();
            return null;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment.id == id) {
            return channelSegment;
        }
        throw new java.lang.AssertionError();
    }

    private final kotlinx.coroutines.channels.ChannelSegment<E> findSegmentBufferEnd(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom, long currentBufferEndCounter) {
        java.lang.Object findSegmentInternal;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) kotlinx.coroutines.channels.BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            findSegmentInternal = kotlinx.coroutines.internal.ConcurrentLinkedListKt.findSegmentInternal(startFrom, id, function2);
            if (!kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
                kotlinx.coroutines.internal.Segment m1209getSegmentimpl = kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= m1209getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1209getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, m1209getSegmentimpl)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                        }
                    } else if (m1209getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1209getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        if (kotlinx.coroutines.internal.SegmentOrClosed.m1211isClosedimpl(findSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(id, startFrom);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment = (kotlinx.coroutines.channels.ChannelSegment) kotlinx.coroutines.internal.SegmentOrClosed.m1209getSegmentimpl(findSegmentInternal);
        if (channelSegment.id > id) {
            if (bufferEnd$FU.compareAndSet(this, currentBufferEndCounter + 1, channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE)) {
                incCompletedExpandBufferAttempts((channelSegment.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) - currentBufferEndCounter);
                return null;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        if (!kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() || channelSegment.id == id) {
            return channelSegment;
        }
        throw new java.lang.AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long id, kotlinx.coroutines.channels.ChannelSegment<E> startFrom) {
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment;
        kotlinx.coroutines.channels.ChannelSegment<E> channelSegment2;
        while (startFrom.id < id && (channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) startFrom.getNext()) != null) {
            startFrom = channelSegment2;
        }
        while (true) {
            if (!startFrom.isRemoved() || (channelSegment = (kotlinx.coroutines.channels.ChannelSegment) startFrom.getNext()) == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$FU;
                while (true) {
                    kotlinx.coroutines.internal.Segment segment = (kotlinx.coroutines.internal.Segment) atomicReferenceFieldUpdater.get(this);
                    kotlinx.coroutines.channels.ChannelSegment<E> channelSegment3 = startFrom;
                    if (segment.id >= channelSegment3.id) {
                        return;
                    }
                    if (!channelSegment3.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$.ExternalSyntheticBackportWithForwarding0.m(atomicReferenceFieldUpdater, this, segment, channelSegment3)) {
                        if (segment.decPointers$kotlinx_coroutines_core()) {
                            segment.remove();
                            return;
                        }
                        return;
                    } else if (channelSegment3.decPointers$kotlinx_coroutines_core()) {
                        channelSegment3.remove();
                    }
                }
            } else {
                startFrom = channelSegment;
            }
        }
    }

    private final void updateSendersCounterIfLower(long value) {
        long j;
        long constructSendersAndCloseStatus;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            long j2 = 1152921504606846975L & j;
            if (j2 >= value) {
                return;
            } else {
                constructSendersAndCloseStatus = kotlinx.coroutines.channels.BufferedChannelKt.constructSendersAndCloseStatus(j2, (int) (j >> 60));
            }
        } while (!sendersAndCloseStatus$FU.compareAndSet(this, j, constructSendersAndCloseStatus));
    }

    private final void updateReceiversCounterIfLower(long value) {
        long j;
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (j >= value) {
                return;
            }
        } while (!receivers$FU.compareAndSet(this, j, value));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01dd, code lost:
    
        r3 = (kotlinx.coroutines.channels.ChannelSegment) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e4, code lost:
    
        if (r3 != null) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String toString() {
        kotlinx.coroutines.internal.Symbol symbol;
        java.lang.String str;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.internal.Symbol symbol6;
        kotlinx.coroutines.internal.Symbol symbol7;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i = (int) (sendersAndCloseStatus$FU.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i2 = 0;
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{receiveSegment$FU.get(this), sendSegment$FU.get(this), bufferEndSegment$FU.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) obj;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            int i3 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i4 = i2;
            while (true) {
                if (i4 >= i3) {
                    break;
                }
                long j3 = (channelSegment3.id * kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE) + i4;
                if (j3 >= sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                java.lang.Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i4);
                java.lang.Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i4);
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancellableContinuation) {
                    str = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.SelectInstance) {
                    str = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.ReceiveCatching) {
                    str = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
                    str = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB) {
                    str = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_RCV;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.RESUMING_BY_EB;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2)) {
                            if (state$kotlinx_coroutines_core != null) {
                                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.IN_BUFFER;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                    symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4)) {
                                        symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol5)) {
                                            symbol6 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol6)) {
                                                symbol7 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol7) && !kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                                                    str = state$kotlinx_coroutines_core.toString();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i4++;
                        }
                    }
                    str = "resuming_sender";
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb.append("(" + str + ',' + element$kotlinx_coroutines_core + "),");
                } else {
                    sb.append(str + ',');
                }
                i4++;
            }
            i2 = 0;
        }
        if (kotlin.text.StringsKt.last(sb) == ',') {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb.deleteCharAt(sb.length() - 1), "this.deleteCharAt(index)");
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String toStringDebug$kotlinx_coroutines_core() {
        java.lang.String str;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.StringBuilder append = new java.lang.StringBuilder("S=").append(getSendersCounter$kotlinx_coroutines_core()).append(",R=").append(getReceiversCounter$kotlinx_coroutines_core()).append(",B=").append(getBufferEndCounter()).append(",B'=").append(completedExpandBuffersAndPauseFlag$FU.get(this)).append(",C=");
        java.util.concurrent.atomic.AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$FU;
        sb.append(append.append((int) (atomicLongFieldUpdater.get(this) >> 60)).append(',').toString());
        int i = (int) (atomicLongFieldUpdater.get(this) >> 60);
        if (i == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb.append("CLOSED,");
        } else if (i == 3) {
            sb.append("CANCELLED,");
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("SEND_SEGM=");
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$FU;
        java.lang.StringBuilder append2 = sb2.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater.get(this))).append(",RCV_SEGM=");
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = receiveSegment$FU;
        sb.append(append2.append(kotlinx.coroutines.DebugStringsKt.getHexAddress(atomicReferenceFieldUpdater2.get(this))).toString());
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + kotlinx.coroutines.DebugStringsKt.getHexAddress(bufferEndSegment$FU.get(this)));
        }
        sb.append("  ");
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{atomicReferenceFieldUpdater2.get(this), atomicReferenceFieldUpdater.get(this), bufferEndSegment$FU.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) obj;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment2 != channelSegment) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) next;
        do {
            java.lang.StringBuilder append3 = new java.lang.StringBuilder().append(kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment3)).append("=[").append(channelSegment3.isRemoved() ? "*" : okhttp3.HttpUrl.FRAGMENT_ENCODE_SET).append(channelSegment3.id).append(",prev=");
            kotlinx.coroutines.channels.ChannelSegment channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getPrev();
            sb.append(append3.append(channelSegment4 != null ? kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment4) : null).append(',').toString());
            int i2 = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            for (int i3 = 0; i3 < i2; i3++) {
                java.lang.Object state$kotlinx_coroutines_core = channelSegment3.getState$kotlinx_coroutines_core(i3);
                java.lang.Object element$kotlinx_coroutines_core = channelSegment3.getElement$kotlinx_coroutines_core(i3);
                if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.CancellableContinuation) {
                    str = "cont";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.selects.SelectInstance) {
                    str = "select";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.ReceiveCatching) {
                    str = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.BufferedChannel.SendBroadcast) {
                    str = "send(broadcast)";
                } else {
                    str = state$kotlinx_coroutines_core instanceof kotlinx.coroutines.channels.WaiterEB ? "EB(" + state$kotlinx_coroutines_core + ')' : java.lang.String.valueOf(state$kotlinx_coroutines_core);
                }
                sb.append("[" + i3 + "]=(" + str + ',' + element$kotlinx_coroutines_core + "),");
            }
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("next=");
            kotlinx.coroutines.channels.ChannelSegment channelSegment5 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getNext();
            sb.append(sb3.append(channelSegment5 != null ? kotlinx.coroutines.DebugStringsKt.getHexAddress(channelSegment5) : null).append("]  ").toString());
            channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) channelSegment3.getNext();
        } while (channelSegment3 != null);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2;
        if (isRendezvousOrUnlimited()) {
            java.lang.Object obj = bufferEndSegment$FU.get(this);
            channelSegment2 = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (obj != channelSegment2) {
                throw new java.lang.IllegalStateException(("bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: " + this).toString());
            }
        } else if (((kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this)).id > ((kotlinx.coroutines.channels.ChannelSegment) bufferEndSegment$FU.get(this)).id) {
            throw new java.lang.IllegalStateException(("bufferEndSegment should not have lower id than receiveSegment.\nChannel state: " + this).toString());
        }
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new kotlinx.coroutines.channels.ChannelSegment[]{receiveSegment$FU.get(this), sendSegment$FU.get(this), bufferEndSegment$FU.get(this)});
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : listOf) {
            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) obj2;
            channelSegment = kotlinx.coroutines.channels.BufferedChannelKt.NULL_SEGMENT;
            if (channelSegment3 != channelSegment) {
                arrayList.add(obj2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object next = it.next();
        if (it.hasNext()) {
            long j = ((kotlinx.coroutines.channels.ChannelSegment) next).id;
            do {
                java.lang.Object next2 = it.next();
                long j2 = ((kotlinx.coroutines.channels.ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        kotlinx.coroutines.channels.ChannelSegment channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) next;
        if (channelSegment4.getPrev() != 0) {
            throw new java.lang.IllegalStateException(("All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: " + this).toString());
        }
        while (channelSegment4.getNext() != 0) {
            S next3 = channelSegment4.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next3);
            if (((kotlinx.coroutines.channels.ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment4.getNext();
                kotlin.jvm.internal.Intrinsics.checkNotNull(next4);
                if (((kotlinx.coroutines.channels.ChannelSegment) next4).getPrev() != channelSegment4) {
                    throw new java.lang.IllegalStateException(("The `segment.next.prev === segment` invariant is violated.\nChannel state: " + this).toString());
                }
            }
            int i = kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                java.lang.Object state$kotlinx_coroutines_core = channelSegment4.getState$kotlinx_coroutines_core(i3);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof kotlinx.coroutines.Waiter)) {
                    symbol = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_RCV;
                    if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol)) {
                        symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.INTERRUPTED_SEND;
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol2) && !kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, kotlinx.coroutines.channels.BufferedChannelKt.getCHANNEL_CLOSED())) {
                            symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.POISONED;
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol3)) {
                                symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.DONE_RCV;
                                if (!kotlin.jvm.internal.Intrinsics.areEqual(state$kotlinx_coroutines_core, symbol4)) {
                                    throw new java.lang.IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                                }
                            }
                            if (channelSegment4.getElement$kotlinx_coroutines_core(i3) != null) {
                                throw new java.lang.IllegalStateException("Check failed.".toString());
                            }
                        }
                    }
                    if (channelSegment4.getElement$kotlinx_coroutines_core(i3) != null) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    i2++;
                }
            }
            if (i2 == kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE && channelSegment4 != receiveSegment$FU.get(this) && channelSegment4 != sendSegment$FU.get(this) && channelSegment4 != bufferEndSegment$FU.get(this)) {
                throw new java.lang.IllegalStateException(("Logically removed segment is reachable.\nChannel state: " + this).toString());
            }
            S next5 = channelSegment4.getNext();
            kotlin.jvm.internal.Intrinsics.checkNotNull(next5);
            channelSegment4 = (kotlinx.coroutines.channels.ChannelSegment) next5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object onClosedSend(E e, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.internal.UndeliveredElementException callUndeliveredElementCatchingException$default;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        kotlin.jvm.functions.Function1<E, kotlin.Unit> function1 = this.onUndeliveredElement;
        if (function1 != null && (callUndeliveredElementCatchingException$default = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(function1, e, null, 2, null)) != null) {
            kotlinx.coroutines.internal.UndeliveredElementException undeliveredElementException = callUndeliveredElementCatchingException$default;
            kotlin.ExceptionsKt.addSuppressed(undeliveredElementException, getSendException());
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = cancellableContinuationImpl2;
            kotlin.Result.Companion companion = kotlin.Result.Companion;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                undeliveredElementException = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(undeliveredElementException, cancellableContinuationImpl3);
            }
            cancellableContinuationImpl3.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(undeliveredElementException)));
        } else {
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl4 = cancellableContinuationImpl2;
            java.lang.Throwable sendException = getSendException();
            kotlin.Result.Companion companion2 = kotlin.Result.Companion;
            if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (cancellableContinuationImpl4 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                sendException = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverFromStackFrame(sendException, cancellableContinuationImpl4);
            }
            cancellableContinuationImpl4.resumeWith(kotlin.Result.constructor-impl(kotlin.ResultKt.createFailure(sendException)));
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, E e, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl;
        java.lang.Object obj;
        java.lang.Object result;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2;
        kotlinx.coroutines.channels.ChannelSegment channelSegment2;
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            int updateCellSend = updateCellSend(channelSegment, i, e, j, orCreateCancellableContinuation, false);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                cancellableContinuationImpl = orCreateCancellableContinuation;
                kotlin.Result.Companion companion = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
            } else {
                if (updateCellSend != 1) {
                    if (updateCellSend != 2) {
                        if (updateCellSend == 4) {
                            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            cancellableContinuationImpl2 = orCreateCancellableContinuation;
                        } else {
                            if (updateCellSend != 5) {
                                throw new java.lang.IllegalStateException("unexpected".toString());
                            }
                            channelSegment.cleanPrev();
                            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
                                long j2 = andIncrement & 1152921504606846975L;
                                boolean isClosedForSend0 = isClosedForSend0(andIncrement);
                                long j3 = j2 / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                                int i2 = (int) (j2 % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                                if (channelSegment3.id != j3) {
                                    kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j3, channelSegment3);
                                    if (findSegmentSend != null) {
                                        channelSegment2 = findSegmentSend;
                                    } else if (isClosedForSend0) {
                                        cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                        break;
                                    }
                                } else {
                                    channelSegment2 = channelSegment3;
                                }
                                kotlinx.coroutines.channels.ChannelSegment channelSegment4 = channelSegment2;
                                int updateCellSend2 = updateCellSend(channelSegment2, i2, e, j2, orCreateCancellableContinuation, isClosedForSend0);
                                if (updateCellSend2 == 0) {
                                    channelSegment4.cleanPrev();
                                    cancellableContinuationImpl = orCreateCancellableContinuation;
                                    kotlin.Result.Companion companion2 = kotlin.Result.Companion;
                                    obj = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
                                    break;
                                }
                                if (updateCellSend2 == 1) {
                                    cancellableContinuationImpl = orCreateCancellableContinuation;
                                    kotlin.Result.Companion companion3 = kotlin.Result.Companion;
                                    obj = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
                                    break;
                                }
                                if (updateCellSend2 != 2) {
                                    if (updateCellSend2 == 3) {
                                        throw new java.lang.IllegalStateException("unexpected".toString());
                                    }
                                    if (updateCellSend2 != 4) {
                                        if (updateCellSend2 == 5) {
                                            channelSegment4.cleanPrev();
                                        }
                                        channelSegment3 = channelSegment4;
                                    } else {
                                        if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                            channelSegment4.cleanPrev();
                                        }
                                        cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                    }
                                } else if (isClosedForSend0) {
                                    channelSegment4.onSlotCleaned();
                                    cancellableContinuationImpl2 = orCreateCancellableContinuation;
                                } else {
                                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl3 = orCreateCancellableContinuation instanceof kotlinx.coroutines.Waiter ? orCreateCancellableContinuation : null;
                                    if (cancellableContinuationImpl3 != null) {
                                        prepareSenderForSuspension(cancellableContinuationImpl3, channelSegment4, i2);
                                    }
                                }
                            }
                        }
                        onClosedSendOnNoWaiterSuspend(e, cancellableContinuationImpl2);
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
                    }
                    return result != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
                }
                cancellableContinuationImpl = orCreateCancellableContinuation;
                kotlin.Result.Companion companion4 = kotlin.Result.Companion;
                obj = kotlin.Result.constructor-impl(kotlin.Unit.INSTANCE);
            }
            cancellableContinuationImpl.resumeWith(obj);
            result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
            if (result != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            }
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c3, code lost:
    
        r0 = kotlin.Result.Companion;
        r11.resumeWith(kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ <E> java.lang.Object sendBroadcast$suspendImpl(kotlinx.coroutines.channels.BufferedChannel<E> bufferedChannel, E e, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment;
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        if (bufferedChannel.onUndeliveredElement != null) {
            throw new java.lang.IllegalStateException("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`".toString());
        }
        kotlinx.coroutines.channels.BufferedChannel.SendBroadcast sendBroadcast = new kotlinx.coroutines.channels.BufferedChannel.SendBroadcast(cancellableContinuationImpl2);
        kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean isClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment2.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            } else {
                channelSegment = channelSegment2;
            }
            kotlinx.coroutines.channels.ChannelSegment channelSegment3 = channelSegment;
            int updateCellSend = bufferedChannel.updateCellSend(channelSegment, i, e, j, sendBroadcast, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment3.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment3.cleanPrev();
                    }
                    channelSegment2 = channelSegment3;
                } else if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment3.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment3.onSlotCleaned();
            } else {
                kotlinx.coroutines.channels.BufferedChannel.SendBroadcast sendBroadcast2 = sendBroadcast instanceof kotlinx.coroutines.Waiter ? sendBroadcast : null;
                if (sendBroadcast2 != null) {
                    bufferedChannel.prepareSenderForSuspension(sendBroadcast2, channelSegment3, i);
                }
            }
        }
        kotlin.Result.Companion companion = kotlin.Result.Companion;
        cancellableContinuationImpl2.resumeWith(kotlin.Result.constructor-impl(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false)));
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object receiveOnNoWaiterSuspend(kotlinx.coroutines.channels.ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.Continuation<? super E> continuation) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.internal.Symbol symbol4;
        kotlinx.coroutines.internal.Symbol symbol5;
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            } else {
                symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> function1 = null;
                function1 = null;
                if (updateCellReceive == symbol2) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    kotlinx.coroutines.channels.ChannelSegment channelSegment2 = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = receivers$FU.getAndIncrement(this);
                        long j2 = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
                        int i2 = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
                        if (channelSegment2.id != j2) {
                            kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j2, channelSegment2);
                            if (findSegmentReceive != null) {
                                channelSegment2 = findSegmentReceive;
                            }
                        }
                        updateCellReceive = updateCellReceive(channelSegment2, i2, andIncrement, orCreateCancellableContinuation);
                        symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
                        if (updateCellReceive == symbol3) {
                            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation instanceof kotlinx.coroutines.Waiter ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl != null) {
                                prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment2, i2);
                            }
                        } else {
                            symbol4 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
                            if (updateCellReceive != symbol4) {
                                symbol5 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                                if (updateCellReceive == symbol5) {
                                    throw new java.lang.IllegalStateException("unexpected".toString());
                                }
                                channelSegment2.cleanPrev();
                                kotlin.jvm.functions.Function1<E, kotlin.Unit> function12 = this.onUndeliveredElement;
                                if (function12 != null) {
                                    function1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function12, updateCellReceive, orCreateCancellableContinuation.getContext());
                                }
                            } else if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment2.cleanPrev();
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    kotlin.jvm.functions.Function1<E, kotlin.Unit> function13 = this.onUndeliveredElement;
                    if (function13 != null) {
                        function1 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(function13, updateCellReceive, orCreateCancellableContinuation.getContext());
                    }
                }
                orCreateCancellableContinuation.resume(updateCellReceive, function1);
            }
            java.lang.Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008a, code lost:
    
        r14.selectInRegistrationPhase(kotlin.Unit.INSTANCE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void registerSelectForSend(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object element) {
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) sendSegment$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$FU.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean isClosedForSend0 = isClosedForSend0(andIncrement);
            long j2 = j / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (j % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j2) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentSend = findSegmentSend(j2, channelSegment);
                if (findSegmentSend != null) {
                    channelSegment = findSegmentSend;
                } else if (isClosedForSend0) {
                    break;
                }
            }
            int updateCellSend = updateCellSend(channelSegment, i, element, j, select, isClosedForSend0);
            if (updateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (updateCellSend == 1) {
                break;
            }
            if (updateCellSend != 2) {
                if (updateCellSend == 3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                if (updateCellSend != 4) {
                    if (updateCellSend == 5) {
                        channelSegment.cleanPrev();
                    }
                } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
            } else if (isClosedForSend0) {
                channelSegment.onSlotCleaned();
            } else {
                kotlinx.coroutines.Waiter waiter = select instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) select : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i);
                    return;
                }
                return;
            }
        }
        onClosedSelectOnSend(element, select);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(kotlinx.coroutines.selects.SelectInstance<?> select, java.lang.Object ignoredParam) {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        kotlinx.coroutines.internal.Symbol symbol3;
        kotlinx.coroutines.channels.ChannelSegment channelSegment = (kotlinx.coroutines.channels.ChannelSegment) receiveSegment$FU.get(this);
        while (!isClosedForReceive()) {
            long andIncrement = receivers$FU.getAndIncrement(this);
            long j = andIncrement / kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE;
            int i = (int) (andIncrement % kotlinx.coroutines.channels.BufferedChannelKt.SEGMENT_SIZE);
            if (channelSegment.id != j) {
                kotlinx.coroutines.channels.ChannelSegment findSegmentReceive = findSegmentReceive(j, channelSegment);
                if (findSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = findSegmentReceive;
                }
            }
            java.lang.Object updateCellReceive = updateCellReceive(channelSegment, i, andIncrement, select);
            symbol = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND;
            if (updateCellReceive == symbol) {
                kotlinx.coroutines.Waiter waiter = select instanceof kotlinx.coroutines.Waiter ? (kotlinx.coroutines.Waiter) select : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment, i);
                    return;
                }
                return;
            }
            symbol2 = kotlinx.coroutines.channels.BufferedChannelKt.FAILED;
            if (updateCellReceive != symbol2) {
                symbol3 = kotlinx.coroutines.channels.BufferedChannelKt.SUSPEND_NO_WAITER;
                if (updateCellReceive == symbol3) {
                    throw new java.lang.IllegalStateException("unexpected".toString());
                }
                channelSegment.cleanPrev();
                select.selectInRegistrationPhase(updateCellReceive);
                return;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
        }
        onClosedSelectOnReceive(select);
    }
}
