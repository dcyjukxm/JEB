// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.File;

public final class Qu
{
    private final Qj dN;
    private static final String[] ld;
    
    public Qu() {
        this.dN = new Qj();
    }
    
    public LP dN(final vl vl) {
        return this.dN.dN(vl);
    }
    
    public void dN(final vl vl, final File file) {
        try {
            vl.dN();
            vl.dN().dN(file, Qu.ld);
        }
        catch (oM om) {
            throw new zX(om);
        }
    }
    
    public void dN(final vl vl, final File file, final LP lp) {
        this.dN.dN(lp, vl, file);
    }
    
    public void ld(final vl vl, final File file) {
        try {
            final Sj dn = vl.dN();
            if (dn.ld("assets")) {
                dn.dN(file, "assets");
            }
            if (dn.ld("lib")) {
                dn.dN(file, "lib");
            }
        }
        catch (oM om) {
            throw new zX(om);
        }
    }
    
    static {
        ld = new String[] { "resources.arsc", "AndroidManifest.xml", "res" };
    }
}
