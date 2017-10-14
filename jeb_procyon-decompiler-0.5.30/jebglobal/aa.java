// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.EOFException;
import java.math.BigInteger;
import java.util.Arrays;
import java.io.DataInput;
import java.util.ArrayList;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class aa
{
    private final hq dN;
    private final LP ld;
    private final MR QE;
    private final List wU;
    private final boolean fa;
    private lX zs;
    private wV mS;
    private wV OK;
    private wV LH;
    private cN KK;
    private Me EO;
    private NM cb;
    private int PF;
    private boolean[] Hw;
    
    public static uK dN(final InputStream inputStream, final boolean b, final boolean b2, final LP lp) {
        try {
            final aa aa = new aa(inputStream, lp, b, b2);
            return new uK(aa.dN(), (vd[])((aa.wU == null) ? null : ((vd[])aa.wU.toArray(new vd[0]))), lp);
        }
        catch (IOException ex) {
            throw new zX();
        }
    }
    
    private aa(InputStream inputStream, final LP ld, final boolean b, final boolean fa) {
        if (b) {
            final MR qe = new MR(inputStream);
            this.QE = qe;
            inputStream = qe;
            this.wU = new ArrayList();
        }
        else {
            this.QE = null;
            this.wU = null;
        }
        this.dN = new hq(new OZ(inputStream));
        this.ld = ld;
        this.fa = fa;
    }
    
    private cN[] dN() {
        this.ld(2);
        final int int1 = this.dN.readInt();
        this.mS = wV.dN(this.dN);
        final cN[] array = new cN[int1];
        this.KK();
        for (int i = 0; i < int1; ++i) {
            array[i] = this.ld();
        }
        return array;
    }
    
    private cN ld() {
        this.dN(512);
        final byte b = (byte)this.dN.readInt();
        final String dn = this.dN.dN(128, true);
        this.dN.dN();
        this.dN.dN();
        this.dN.dN();
        this.dN.dN();
        this.OK = wV.dN(this.dN);
        this.LH = wV.dN(this.dN);
        this.PF = b << 24;
        this.KK = new cN(this.ld, b, dn);
        this.KK();
        while (this.zs.dN == 514) {
            this.QE();
        }
        return this.KK;
    }
    
    private Me QE() {
        this.dN(514);
        final byte byte1 = this.dN.readByte();
        this.dN.skipBytes(3);
        final int int1 = this.dN.readInt();
        Arrays.fill(this.Hw = new boolean[int1], true);
        if (this.wU != null) {
            this.wU.add(new vd(this.QE.dN(), int1));
        }
        this.dN.skipBytes(int1 * 4);
        this.PF = ((0xFF000000 & this.PF) | byte1 << 16);
        this.EO = new Me(this.OK.dN(byte1 - 1), this.ld, this.KK);
        this.KK.dN(this.EO);
        while (this.KK().dN == 513) {
            this.wU();
        }
        this.LH();
        return this.EO;
    }
    
    private NM wU() {
        this.dN(513);
        this.dN.dN();
        final int int1 = this.dN.readInt();
        this.dN.dN();
        final Ja ok = this.OK();
        final int[] dn = this.dN.dN(int1);
        if (ok.dN) {
            final String string = this.EO.dN() + ok.dN();
            if (this.fa) {
                (new Object[1])[0] = string;
            }
            else {
                (new Object[1])[0] = string;
            }
        }
        this.cb = ((ok.dN && !this.fa) ? null : this.KK.dN(ok));
        for (int i = 0; i < dn.length; ++i) {
            if (dn[i] != -1) {
                this.Hw[i] = false;
                this.PF = ((this.PF & 0xFFFF0000) | i);
                this.fa();
            }
        }
        return this.cb;
    }
    
    private void fa() {
        this.dN.skipBytes(2);
        final short short1 = this.dN.readShort();
        final int int1 = this.dN.readInt();
        final ED ed = ((short1 & 0x1) == 0x0) ? this.mS() : this.zs();
        if (this.cb == null) {
            return;
        }
        final tz tz = new tz(this.PF);
        UW ld;
        if (this.KK.dN(tz)) {
            ld = this.KK.ld(tz);
        }
        else {
            ld = new UW(tz, this.LH.dN(int1), this.KK, this.EO);
            this.KK.dN(ld);
            this.EO.dN(ld);
        }
        final dx dx = new dx(this.cb, ld, ed);
        this.cb.dN(dx);
        ld.dN(dx);
        final cN kk = this.KK;
    }
    
    private Vi zs() {
        final int int1 = this.dN.readInt();
        final int int2 = this.dN.readInt();
        final dN ms = this.KK.mS();
        final PS[] array = new PS[int2];
        for (int i = 0; i < int2; ++i) {
            array[i] = new PS(this.dN.readInt(), this.mS());
        }
        return ms.dN(int1, array);
    }
    
    private ED mS() {
        this.dN.dN((short)8);
        this.dN.dN((byte)0);
        final byte byte1 = this.dN.readByte();
        final int int1 = this.dN.readInt();
        return (byte1 == 3) ? this.KK.mS().dN(this.mS.ld(int1)) : this.KK.mS().dN(byte1, int1, null);
    }
    
    private Ja OK() {
        final int int1 = this.dN.readInt();
        if (int1 < 28) {
            throw new zX("Config size < 28");
        }
        boolean b = false;
        final short short1 = this.dN.readShort();
        final short short2 = this.dN.readShort();
        final char[] array = { (char)this.dN.readByte(), (char)this.dN.readByte() };
        final char[] array2 = { (char)this.dN.readByte(), (char)this.dN.readByte() };
        final byte byte1 = this.dN.readByte();
        final byte byte2 = this.dN.readByte();
        final short short3 = this.dN.readShort();
        final byte byte3 = this.dN.readByte();
        final byte byte4 = this.dN.readByte();
        final byte byte5 = this.dN.readByte();
        this.dN.skipBytes(1);
        final short short4 = this.dN.readShort();
        final short short5 = this.dN.readShort();
        final short short6 = this.dN.readShort();
        this.dN.skipBytes(2);
        byte byte6 = 0;
        byte byte7 = 0;
        short short7 = 0;
        if (int1 >= 32) {
            byte6 = this.dN.readByte();
            byte7 = this.dN.readByte();
            short7 = this.dN.readShort();
        }
        short short8 = 0;
        short short9 = 0;
        if (int1 >= 36) {
            short8 = this.dN.readShort();
            short9 = this.dN.readShort();
        }
        final int n = int1 - 36;
        if (n > 0) {
            final byte[] array3 = new byte[n];
            this.dN.readFully(array3);
            final BigInteger bigInteger = new BigInteger(1, array3);
            if (bigInteger.equals(BigInteger.ZERO)) {
                (new Object[1])[0] = 36;
            }
            else {
                final Object[] array4 = { 36, bigInteger };
                b = true;
            }
        }
        return new Ja(short1, short2, array, array2, byte1, byte2, short3, byte3, byte4, byte5, short4, short5, short6, byte6, byte7, short7, short8, short9, b);
    }
    
    private void LH() {
        final int n = this.PF & 0xFFFF0000;
        for (int i = 0; i < this.Hw.length; ++i) {
            if (this.Hw[i]) {
                if (this.cb == null) {
                    break;
                }
                final UW uw = new UW(new tz(n | i), String.format("ARSC_DUMMY_%04x", i), this.KK, this.EO);
                this.KK.dN(uw);
                this.EO.dN(uw);
                final dx dx = new dx(this.KK.dN(new Ja()), uw, new MS(false, null));
                final cN kk = this.KK;
                this.cb.dN(dx);
                uw.dN(dx);
            }
        }
    }
    
    private lX KK() {
        return this.zs = lX.dN(this.dN);
    }
    
    private void dN(final int n) {
        if (this.zs.dN != n) {
            throw new zX(String.format("Invalid chunk type: expected=0x%08x, got=0x%08x", n, this.zs.dN));
        }
    }
    
    private void ld(final int n) {
        this.KK();
        this.dN(n);
    }
    
    public static final class lX
    {
        public final short dN;
        
        public lX(final short dn, final int n) {
            this.dN = dn;
        }
        
        public static lX dN(final hq hq) {
            short short1;
            try {
                short1 = hq.readShort();
            }
            catch (EOFException ex) {
                return new lX((short)(-1), 0);
            }
            hq.skipBytes(2);
            return new lX(short1, hq.readInt());
        }
    }
    
    public static final class vd
    {
        public vd(final int n, final int n2) {
        }
    }
    
    public static final class uK
    {
        private final cN[] dN;
        
        public uK(final cN[] dn, final vd[] array, final LP lp) {
            this.dN = dn;
        }
        
        public cN[] dN() {
            return this.dN;
        }
    }
}
