// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class Ji extends UB
{
    private int wU;
    int dN;
    int ld;
    int QE;
    
    public Ji(final int dn, final int ld, final int qe) {
        super(5391702);
        this.wU = 0;
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    private Ji() {
        super(5391702);
    }
    
    public int LH() {
        return this.dN;
    }
    
    public int KK() {
        return this.ld;
    }
    
    public int EO() {
        return this.QE;
    }
    
    static Ji dN(final byte[] array) {
        final Ji ji = new Ji();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        ji.wU = oz.readInt();
        ji.dN = oz.readInt();
        ji.ld = oz.readInt();
        ji.QE = oz.readInt();
        return ji;
    }
    
    @Override
    byte[] mS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(this.wU);
            hk.writeInt(this.dN);
            hk.writeInt(this.ld);
            hk.writeInt(this.QE);
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
}
