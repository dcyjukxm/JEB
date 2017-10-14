// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.ByteArrayInputStream;

public final class OD extends UB
{
    private int dN;
    private int ld;
    private int QE;
    private int wU;
    private int fa;
    private String zs;
    private byte[] mS;
    
    public OD(final vd vd, final int wu, final int fa, final String zs, final byte[] ms, final int qe) {
        super(5524803);
        this.dN = (vd.ordinal() & 0xFF);
        this.ld = UB.OK();
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        if (zs != null && zs.length() > 0) {
            this.dN |= 0x100;
            this.zs = zs;
        }
        if (ms != null && ms.length > 0) {
            this.dN |= 0x200;
            this.mS = ms;
        }
    }
    
    private OD() {
        super(5524803);
    }
    
    public vd LH() {
        return vd.values()[this.dN & 0xFF];
    }
    
    public int KK() {
        return this.wU;
    }
    
    public int EO() {
        return this.fa;
    }
    
    public uK cb() {
        return new uK(this.zs, this.mS);
    }
    
    public String PF() {
        return this.zs;
    }
    
    public byte[] Hw() {
        return this.mS;
    }
    
    void dN(final String zs, final int qe) {
        if (zs != null && zs.length() > 0) {
            this.dN |= 0x100;
            this.zs = zs;
        }
        else {
            this.dN &= 0xFFFFFEFF;
            this.zs = null;
        }
        this.ld = UB.OK();
        this.QE = qe;
    }
    
    void dN(final byte[] ms, final int qe) {
        if (ms != null && ms.length > 0) {
            this.dN |= 0x200;
            this.mS = ms;
        }
        else {
            this.dN &= 0xFFFFFDFF;
            this.mS = null;
        }
        this.ld = UB.OK();
        this.QE = qe;
    }
    
    static OD dN(final byte[] array) {
        final OD od = new OD();
        final OZ oz = new OZ(new ByteArrayInputStream(array));
        od.dN = oz.readInt();
        od.ld = oz.readInt();
        od.QE = oz.readInt();
        od.wU = oz.readInt();
        od.fa = oz.readInt();
        od.zs = (((od.dN & 0x100) != 0x0) ? UB.wU(oz) : null);
        od.mS = (byte[])(((od.dN & 0x200) != 0x0) ? UB.ld(oz) : null);
        return od;
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
            if ((this.dN & 0x100) != 0x0) {
                UB.dN(hk, this.zs);
            }
            if ((this.dN & 0x200) != 0x0) {
                UB.dN(hk, this.mS);
            }
            hk.dN();
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public enum vd
    {
        dN("GLOBAL", 0), 
        ld("CLASS", 1), 
        QE("METHOD", 2), 
        wU("FIELD", 3), 
        fa("INSTRUCTION", 4);
        
        private vd(final String s, final int n) {
        }
    }
    
    public static final class uK
    {
        public String dN;
        public byte[] ld;
        
        public uK(final String dn, final byte[] ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public String dN() {
            return this.dN;
        }
        
        public byte[] ld() {
            return this.ld;
        }
    }
}
