// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.File;
import java.security.cert.Certificate;

public final class vd extends AM
{
    private Certificate[] ld;
    
    public vd(final String s, final boolean b) {
        super(s, b);
    }
    
    public Certificate[] dN() {
        if (this.ld == null) {
            this.ld = this.QE("AndroidManifest.xml");
        }
        return this.ld;
    }
    
    public boolean dN(final File file) {
        try {
            final Uw uw = new Uw(this.dN);
            uw.dN(true);
            uw.ld(file);
            uw.dN((short)0);
            uw.ld((short)257);
            uw.dN();
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
}
