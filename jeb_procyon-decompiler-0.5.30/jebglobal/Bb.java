// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class Bb extends UB
{
    private int QE;
    int dN;
    byte[] ld;
    
    public Bb(final int dn, final byte[] ld) {
        super(4932181);
        if (ld == null) {
            throw new IllegalArgumentException();
        }
        this.QE = 0;
        this.dN = dn;
        this.ld = ld;
    }
    
    private Bb() {
        super(4932181);
    }
    
    static Bb dN(final byte[] array) {
        final Bb bb = new Bb();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        bb.QE = oz.readInt();
        bb.dN = oz.readInt();
        bb.ld = UB.QE(oz);
        return bb;
    }
    
    @Override
    byte[] mS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(this.QE);
            hk.writeInt(this.dN);
            UB.ld(hk, this.ld);
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
}
