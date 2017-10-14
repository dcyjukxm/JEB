// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class k extends UB
{
    private int dN;
    private String ld;
    private byte[] QE;
    private byte[] wU;
    private byte[] fa;
    private byte[] zs;
    
    public k(final String ld, final byte[] array, final boolean b) {
        super(4606278);
        if (ld == null || array == null) {
            throw new IllegalArgumentException();
        }
        this.dN = 0;
        if (b) {
            this.dN |= 0x1;
        }
        this.ld = ld;
        this.QE = TM.ld(array);
        this.wU = TM.QE(array);
        this.fa = TM.wU(array);
        this.zs = (byte[])(b ? ((byte[])array.clone()) : null);
    }
    
    private k() {
        super(4606278);
    }
    
    public String LH() {
        return this.ld;
    }
    
    public byte[] KK() {
        return this.QE;
    }
    
    public byte[] EO() {
        return this.wU;
    }
    
    public byte[] cb() {
        return this.fa;
    }
    
    static k dN(final byte[] array) {
        final k k = new k();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        k.dN = oz.readInt();
        k.ld = UB.wU(oz);
        oz.readFully(k.QE = new byte[16]);
        oz.readFully(k.wU = new byte[20]);
        oz.readFully(k.fa = new byte[32]);
        k.zs = null;
        if ((k.dN & 0x1) != 0x0) {
            k.zs = UB.QE(oz);
        }
        return k;
    }
    
    @Override
    byte[] mS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(this.dN);
            UB.dN(hk, this.ld);
            hk.write(this.QE);
            hk.write(this.wU);
            hk.write(this.fa);
            if ((this.dN & 0x1) != 0x0) {
                UB.ld(hk, this.zs);
            }
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
}
