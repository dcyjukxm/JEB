// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class CH extends UB
{
    private int QE;
    String dN;
    byte[] ld;
    
    public CH(final String dn, final byte[] ld) {
        super(4541510);
        if (dn == null || ld == null) {
            throw new IllegalArgumentException();
        }
        this.QE = 0;
        this.dN = dn;
        this.ld = ld;
    }
    
    private CH() {
        super(4541510);
    }
    
    static CH dN(final byte[] array) {
        final CH ch = new CH();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        ch.QE = oz.readInt();
        ch.dN = UB.wU(oz);
        ch.ld = UB.QE(oz);
        return ch;
    }
    
    @Override
    byte[] mS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(this.QE);
            UB.dN(hk, this.dN);
            UB.ld(hk, this.ld);
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
}
