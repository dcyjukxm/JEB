// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.SWT;

public final class ER extends as
{
    public ER(final yn yn) {
        super(yn, "Navigate forward");
        this.ld = 13;
        this.QE = SWT.MOD1;
        this.fa = HC.dN().dN("icon-arrow-right.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        return this.dN.LH().wU() || (this.dN instanceof Os && ((Os)this.dN).Ux().wU());
    }
    
    @Override
    public boolean LH() {
        final LW lw = (LW)this.dN.LH().QE(new LW(this.dN.zs(), this.dN.mS()));
        if (lw != null) {
            this.dN.dN(lw, false);
            return true;
        }
        if (this.dN instanceof Os) {
            final Os os = (Os)this.dN;
            final String s = (String)os.Ux().QE(os.rK());
            if (s != null) {
                os.dN(s, null, false);
                final LW lw2 = (LW)os.LH().QE(null);
                if (lw2 != null) {
                    os.dN(lw2, false);
                }
                return true;
            }
        }
        return false;
    }
}
