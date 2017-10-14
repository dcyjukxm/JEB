// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class sX extends II
{
    private wm dN;
    private HI ld;
    
    public sX(final Xf xf) {
        if (xf instanceof wm) {
            this.dN = (wm)xf;
        }
        else {
            if (!(xf instanceof HI)) {
                throw new RuntimeException();
            }
            this.ld = (HI)xf;
        }
    }
    
    public HI dN() {
        if (this.dN != null) {
            return this.dN.zs();
        }
        return this.ld;
    }
    
    @Override
    public void dN(final ZL zl) {
        throw new RuntimeException();
    }
}
