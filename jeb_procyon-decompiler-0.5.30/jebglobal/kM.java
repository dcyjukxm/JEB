// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class kM extends UB
{
    private int ld;
    long dN;
    private String QE;
    private String wU;
    
    public kM(final long dn, final String qe, final String wu) {
        super(5526849);
        if (qe == null || wu == null) {
            throw new IllegalArgumentException();
        }
        this.ld = 0;
        this.dN = dn;
        this.QE = qe;
        this.wU = wu;
    }
    
    private kM() {
        super(5526849);
    }
    
    public String LH() {
        return this.QE;
    }
    
    public String KK() {
        return this.wU;
    }
    
    static kM dN(final byte[] array) {
        final kM km = new kM();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        km.ld = oz.readInt();
        km.dN = oz.readLong();
        km.QE = UB.wU(oz);
        km.wU = UB.wU(oz);
        return km;
    }
    
    @Override
    byte[] mS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(this.ld);
            hk.writeLong(this.dN);
            UB.dN(hk, this.QE);
            UB.dN(hk, this.wU);
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
}
