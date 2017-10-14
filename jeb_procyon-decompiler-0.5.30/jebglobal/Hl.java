// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class Hl
{
    private int dN;
    private uK ld;
    
    public Hl(final int dn, final uK ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    public int dN() {
        return this.dN;
    }
    
    public uK ld() {
        return this.ld;
    }
    
    public static final class uK
    {
        private wk dN;
        private String ld;
        private byte[] QE;
        private String wU;
        
        public uK(final wk dn, final String ld, final byte[] qe, final String wu) {
            if (dn == null || ld == null || ld.length() == 0 || qe == null || qe.length != 32) {
                throw new IllegalArgumentException();
            }
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
            this.wU = wu;
        }
        
        public wk dN() {
            return this.dN;
        }
        
        public String ld() {
            return this.ld;
        }
        
        public byte[] QE() {
            return this.QE;
        }
        
        public String wU() {
            return this.wU;
        }
    }
}
