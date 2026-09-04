package tool.wu.heng;

/* compiled from: MainActivity.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Ltool/wu/heng/BottomNavItem;", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "route", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "label", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;)V", "getIcon", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "getLabel", "()Ljava/lang/String;", "getRoute", "component1", "component2", "component3", "copy", "equals", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "other", "hashCode", okhttp3.HttpUrl.FRAGMENT_ENCODE_SET, "toString", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: /workspace/.recovery/dex/classes3.dex */
public final /* data */ class BottomNavItem {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.vector.ImageVector icon;
    private final java.lang.String label;
    private final java.lang.String route;

    public static /* synthetic */ tool.wu.heng.BottomNavItem copy$default(tool.wu.heng.BottomNavItem bottomNavItem, java.lang.String str, java.lang.String str2, androidx.compose.ui.graphics.vector.ImageVector imageVector, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bottomNavItem.route;
        }
        if ((i & 2) != 0) {
            str2 = bottomNavItem.label;
        }
        if ((i & 4) != 0) {
            imageVector = bottomNavItem.icon;
        }
        return bottomNavItem.copy(str, str2, imageVector);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getRoute() {
        return this.route;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLabel() {
        return this.label;
    }

    /* renamed from: component3, reason: from getter */
    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return this.icon;
    }

    public final tool.wu.heng.BottomNavItem copy(java.lang.String route, java.lang.String label, androidx.compose.ui.graphics.vector.ImageVector icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "icon");
        return new tool.wu.heng.BottomNavItem(route, label, icon);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof tool.wu.heng.BottomNavItem)) {
            return false;
        }
        tool.wu.heng.BottomNavItem bottomNavItem = (tool.wu.heng.BottomNavItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.route, bottomNavItem.route) && kotlin.jvm.internal.Intrinsics.areEqual(this.label, bottomNavItem.label) && kotlin.jvm.internal.Intrinsics.areEqual(this.icon, bottomNavItem.icon);
    }

    public final androidx.compose.ui.graphics.vector.ImageVector getIcon() {
        return this.icon;
    }

    public final java.lang.String getLabel() {
        return this.label;
    }

    public final java.lang.String getRoute() {
        return this.route;
    }

    public int hashCode() {
        return (((this.route.hashCode() * 31) + this.label.hashCode()) * 31) + this.icon.hashCode();
    }

    public java.lang.String toString() {
        return "BottomNavItem(route=" + this.route + ", label=" + this.label + ", icon=" + this.icon + ")";
    }

    public BottomNavItem(java.lang.String route, java.lang.String label, androidx.compose.ui.graphics.vector.ImageVector icon) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(route, "route");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(label, "label");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "icon");
        this.route = route;
        this.label = label;
        this.icon = icon;
    }
}
