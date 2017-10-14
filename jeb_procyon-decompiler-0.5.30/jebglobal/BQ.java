// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class BQ implements jt
{
    public MB ld(final int n, final int n2, final Zh zh, final int n3, final Object o, final Object o2) {
        if (n2 > 1023 || n > 4095 || n3 < 0 || n3 > 15) {
            return new Hu(n, n2, zh, n3, o, o2);
        }
        if (o == null) {
            if (o2 == null) {
                return new MB(n, n2, zh, n3);
            }
            throw new RuntimeException();
        }
        else {
            if (o2 == null) {
                return new Es(n, n2, zh, n3, o);
            }
            return new mD(n, n2, zh, n3, o, o2);
        }
    }
}
