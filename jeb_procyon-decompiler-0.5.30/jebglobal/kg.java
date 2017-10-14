// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class kg
{
    private int dN;
    private uK[] ld;
    
    private kg(final int dn, final int n) {
        this.dN = dn;
        this.ld = new uK[n];
    }
    
    public int dN() {
        return this.dN;
    }
    
    public uK[] ld() {
        return this.ld;
    }
    
    static kg dN(final byte[] array, final int n, final int[] array2) {
        final int[] array3 = { 0 };
        final int ld = AR.ld(array, n, array3);
        final int n2 = n + array3[0];
        final int ld2 = AR.ld(array, n2, array3);
        int n3 = n2 + array3[0];
        final kg kg = new kg(ld, ld2);
        for (int i = 0; i < ld2; ++i) {
            final int ld3 = AR.ld(array, n3, array3);
            final int n4 = n3 + array3[0];
            final ub dn = ub.dN(array, n4, array3);
            n3 = n4 + array3[0];
            kg.ld[i] = new uK(ld3, dn);
        }
        array2[0] = n3 - n;
        return kg;
    }
    
    public static final class uK
    {
        private int dN;
        private ub ld;
        
        uK(final int dn, final ub ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public int dN() {
            return this.dN;
        }
        
        public ub ld() {
            return this.ld;
        }
    }
}
