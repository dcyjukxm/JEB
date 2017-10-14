// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;
import java.util.Map;

public final class jl extends sm
{
    private final PS[] ld;
    private final Map QE;
    
    jl(final UD ud, final int n, final Integer n2, final Integer n3, final Boolean b, final PS[] ld) {
        super(ud, n, n2, n3, b);
        this.QE = new HashMap();
        this.ld = ld;
    }
    
    @Override
    public String dN(final fv fv) {
        if (fv instanceof Vp) {
            final String dn = this.dN(((Vp)fv).ld());
            if (dn != null) {
                return dn;
            }
        }
        return super.dN(fv);
    }
    
    @Override
    protected void ld(final Kf kf, final dx dx) {
        for (final PS ps : this.ld) {
            final int ld2 = ((Vp)ps.ld).ld();
            kf.ld(null, "enum");
            kf.dN(null, "name", ((UD)ps.dN).QE().fa());
            kf.dN(null, "value", String.valueOf(ld2));
            kf.QE(null, "enum");
        }
    }
    
    private String dN(final int n) {
        String fa = this.QE.get(n);
        if (fa == null) {
            UD ud = null;
            for (final PS ps : this.ld) {
                if (((Vp)ps.ld).ld() == n) {
                    ud = (UD)ps.dN;
                    break;
                }
            }
            if (ud != null) {
                fa = ud.QE().fa();
                this.QE.put(n, fa);
            }
        }
        return fa;
    }
}
