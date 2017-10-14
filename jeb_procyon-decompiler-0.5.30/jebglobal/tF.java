// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class tF extends as
{
    private Pl KK;
    
    public tF(final Pl kk) {
        super(kk, "Decompile a class");
        this.KK = kk;
        this.ld = 9;
        this.fa = HC.dN().dN("icon-code-context.png");
        this.zs = true;
        this.mS = 1;
        this.OK = true;
        this.LH = 4;
    }
    
    @Override
    public boolean OK() {
        return this.KK.Ux() != null;
    }
    
    @Override
    public boolean LH() {
        if (this.KK.Ux() == null) {
            return false;
        }
        this.KK.rK();
        return true;
    }
}
