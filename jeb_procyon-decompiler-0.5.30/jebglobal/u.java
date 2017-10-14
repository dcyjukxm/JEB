// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class u extends UB
{
    private int dN;
    private int ld;
    private int QE;
    private int wU;
    private int fa;
    private int zs;
    private String mS;
    
    public u(final uK uk, final int wu, final String ms, final int fa, final int zs, final int qe) {
        super(5066313);
        this.dN = (0x100 | (uk.ordinal() & 0xFF));
        this.ld = UB.OK();
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = zs;
        this.mS = ms;
    }
    
    private u() {
        super(5066313);
    }
    
    public boolean LH() {
        return (this.dN & 0x100) != 0x0;
    }
    
    public uK KK() {
        return uK.values()[this.dN & 0xFF];
    }
    
    public int EO() {
        return this.wU;
    }
    
    public int cb() {
        return this.fa;
    }
    
    public int PF() {
        return this.zs;
    }
    
    public String Hw() {
        return this.mS;
    }
    
    void dN(final String ms, final int qe) {
        this.ld = UB.OK();
        this.mS = ms;
        this.QE = qe;
    }
    
    void QE(final boolean b) {
        if (b) {
            this.dN |= 0x100;
        }
        else {
            this.dN &= 0xFFFFFEFF;
        }
    }
    
    static u dN(final byte[] array) {
        final u u = new u();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        u.dN = oz.readInt();
        u.ld = oz.readInt();
        u.QE = oz.readInt();
        u.wU = oz.readInt();
        u.fa = oz.readInt();
        u.zs = oz.readInt();
        u.mS = UB.wU(oz);
        return u;
    }
    
    @Override
    byte[] mS() {
        try {
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            final Hk hk = new Hk(byteArrayOutputStream);
            hk.writeInt(this.dN);
            hk.writeInt(this.ld);
            hk.writeInt(this.QE);
            hk.writeInt(this.wU);
            hk.writeInt(this.fa);
            hk.writeInt(this.zs);
            UB.dN(hk, this.mS);
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public enum uK
    {
        dN("CLASS", 0), 
        ld("METHOD", 1), 
        QE("FIELD", 2), 
        wU("LABEL", 3), 
        fa("VARIABLE", 4);
        
        private uK(final String s, final int n) {
        }
    }
}
