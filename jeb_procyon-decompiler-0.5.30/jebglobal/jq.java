// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;

public final class jq implements Zq
{
    private final iR dN;
    private final ZJ ld;
    
    public jq(final iR dn, final ZJ ld) {
        this.dN = dn;
        this.ld = ld;
    }
    
    @Override
    public void dN(final InputStream inputStream, final OutputStream outputStream) {
        try {
            final GM dn = GM.dN();
            final XN dn2 = dn.dN(this.dN);
            final CL dn3 = dn.dN(this.ld);
            dn2.dN(inputStream, null);
            dn3.dN(outputStream, null);
            while (dn2.fa() != 1) {
                dn3.dN(dn2);
            }
            this.ld.dN();
            dn3.KK();
        }
        catch (lb lb) {
            throw new zX();
        }
        catch (IOException ex) {
            throw new zX();
        }
    }
}
