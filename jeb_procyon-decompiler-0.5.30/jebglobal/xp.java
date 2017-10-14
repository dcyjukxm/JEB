// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.OutputStream;
import java.io.InputStream;
import java.io.IOException;

public final class xp
{
    private final Bl dN;
    
    public xp(final Bl dn) {
        this.dN = dn;
    }
    
    public void dN(final dx dx, final Sj sj, final Sj sj2) {
        final String dn = ((fa)dx.wU()).dN();
        final String dn2 = dx.dN();
        final String dn3 = dx.QE().mS().dN();
        String substring = null;
        final int lastIndex = dn.lastIndexOf(".");
        String s;
        if (lastIndex == -1) {
            s = dn2;
        }
        else {
            substring = dn.substring(lastIndex);
            s = dn2 + substring;
        }
        try {
            if (dn3.equals("raw")) {
                this.dN(sj, dn, sj2, s, "raw");
                return;
            }
            if (dn3.equals("drawable") || dn3.equals("mipmap")) {
                if (dn.toLowerCase().endsWith(".9.png")) {
                    s = dn2 + ".9" + substring;
                    try {
                        this.dN(sj, dn, sj2, s, "9patch");
                        return;
                    }
                    catch (Tn tn) {
                        final Object[] array = { dn, tn.toString() };
                        sj2.mS(s);
                        s = dn2 + substring;
                    }
                }
                if (!".xml".equals(substring)) {
                    this.dN(sj, dn, sj2, s, "raw");
                    return;
                }
            }
            this.dN(sj, dn, sj2, s, "xml");
        }
        catch (zX zx) {
            final Object[] array2 = { dn, s, zx.toString() };
            dx.dN(new MS(false, null));
        }
    }
    
    public void dN(final Sj sj, final String s, final Sj sj2, final String s2, final String s3) {
        try {
            final InputStream qe = sj.QE(s);
            final OutputStream wu = sj2.wU(s2);
            this.dN.dN(qe, wu, s3);
            qe.close();
            wu.close();
        }
        catch (IOException ex) {
            throw new zX(ex);
        }
        catch (oM om) {
            throw new zX(om);
        }
    }
}
