// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class xd
{
    private vd dN;
    private lX[] ld;
    private eI[] QE;
    private vn[] wU;
    
    private xd() {
        this.dN = null;
        this.ld = null;
        this.QE = null;
        this.wU = null;
    }
    
    public vd dN() {
        return this.dN;
    }
    
    public lX[] ld() {
        return this.ld;
    }
    
    public eI[] QE() {
        return this.QE;
    }
    
    public vn[] wU() {
        return this.wU;
    }
    
    static xd dN(final byte[] array, final int n) {
        final int ld = AR.ld(array, n);
        final int ld2 = AR.ld(array, n + 4);
        final int ld3 = AR.ld(array, n + 8);
        final int ld4 = AR.ld(array, n + 12);
        final xd xd = new xd();
        if (ld > 0) {
            xd.dN = vd.dN(array, ld);
        }
        int n2 = n + 16;
        xd.ld = new lX[ld2];
        for (int i = 0; i < ld2; ++i) {
            xd.ld[i] = new lX(AR.ld(array, n2), vd.dN(array, AR.ld(array, n2 + 4)));
            n2 += 8;
        }
        xd.QE = new eI[ld3];
        for (int j = 0; j < ld3; ++j) {
            xd.QE[j] = new eI(AR.ld(array, n2), vd.dN(array, AR.ld(array, n2 + 4)));
            n2 += 8;
        }
        xd.wU = new vn[ld4];
        for (int k = 0; k < ld4; ++k) {
            final int ld5 = AR.ld(array, n2);
            final int ld6 = AR.ld(array, n2 + 4);
            final int ld7 = AR.ld(array, ld6);
            xd.wU[k] = new vn(ld5, ld7);
            for (int l = 0; l < ld7; ++l) {
                xd.wU[k].ld[l] = vd.dN(array, AR.ld(array, ld6 + 4 + 4 * l));
            }
            n2 += 8;
        }
        return xd;
    }
    
    public static final class uK
    {
        private int dN;
        private kg ld;
        
        uK(final int dn, final kg ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public int dN() {
            return this.dN;
        }
        
        public kg ld() {
            return this.ld;
        }
    }
    
    public static final class vd
    {
        private uK[] dN;
        
        private vd(final int n) {
            this.dN = new uK[n];
        }
        
        public int dN() {
            return this.dN.length;
        }
        
        public uK dN(final int n) {
            return this.dN[n];
        }
        
        public uK[] ld() {
            return this.dN;
        }
        
        static vd dN(final byte[] array, final int n) {
            final int ld = AR.ld(array, n);
            final vd vd = new vd(ld);
            for (int i = 0; i < ld; ++i) {
                final int ld2 = AR.ld(array, n + 4 + 4 * i);
                int n2 = array[ld2] & 0xFF;
                if (n2 < 0 || n2 > 2) {
                    cn.dN(String.format("Invalid visibility for annotation (%d), forcing to BUILD", n2));
                    n2 = 0;
                }
                vd.dN[i] = new uK(n2, kg.dN(array, ld2 + 1, new int[1]));
            }
            return vd;
        }
    }
    
    public static final class lX
    {
        private int dN;
        private vd ld;
        
        lX(final int dn, final vd ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public int dN() {
            return this.dN;
        }
        
        public vd ld() {
            return this.ld;
        }
    }
    
    public static final class eI
    {
        private int dN;
        private vd ld;
        
        eI(final int dn, final vd ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public int dN() {
            return this.dN;
        }
        
        public vd ld() {
            return this.ld;
        }
    }
    
    public static final class vn
    {
        private int dN;
        private vd[] ld;
        
        vn(final int dn, final int n) {
            this.dN = dn;
            this.ld = new vd[n];
        }
        
        public int dN() {
            return this.dN;
        }
        
        public vd[] ld() {
            return this.ld;
        }
    }
}
