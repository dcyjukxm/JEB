// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.IOException;
import java.io.DataInput;
import java.io.InputStream;

public class zB implements iR
{
    public hq dN;
    public wb ld;
    public zX QE;
    public boolean wU;
    public wV fa;
    public int[] zs;
    public fh mS;
    public boolean OK;
    public int LH;
    public int KK;
    public int EO;
    public int cb;
    public int[] PF;
    public int Hw;
    
    public zB() {
        this.wU = false;
        this.mS = new fh();
        this.Ux();
    }
    
    public zX dN() {
        return this.QE;
    }
    
    public wb ld() {
        return this.ld;
    }
    
    public void dN(final wb ld) {
        this.ld = ld;
    }
    
    public void dN(final InputStream inputStream) {
        this.QE();
        if (inputStream != null) {
            this.dN = new hq(new OZ(inputStream));
        }
    }
    
    public void QE() {
        if (!this.wU) {
            return;
        }
        this.wU = false;
        this.dN = null;
        this.fa = null;
        this.zs = null;
        this.mS.dN();
        this.Ux();
    }
    
    public int wU() {
        if (this.dN == null) {
            throw new lb("", this, null);
        }
        try {
            this.ZY();
            return this.LH;
        }
        catch (IOException ex) {
            this.QE();
            throw ex;
        }
    }
    
    @Override
    public int fa() {
        return this.wU();
    }
    
    @Override
    public int zs() {
        return this.mS.wU() - 1;
    }
    
    @Override
    public int mS() {
        return this.LH;
    }
    
    @Override
    public int OK() {
        return this.KK;
    }
    
    @Override
    public String LH() {
        if (this.EO == -1 || (this.LH != 2 && this.LH != 3)) {
            return null;
        }
        return this.fa.dN(this.EO);
    }
    
    @Override
    public String KK() {
        if (this.EO == -1 || this.LH != 4) {
            return null;
        }
        return this.fa.dN(this.EO);
    }
    
    @Override
    public String EO() {
        return this.fa.dN(this.cb);
    }
    
    @Override
    public String cb() {
        return "XML line #" + this.OK();
    }
    
    @Override
    public int dN(final int n) {
        return this.mS.dN(n);
    }
    
    @Override
    public String ld(final int n) {
        return this.fa.dN(this.mS.ld(n));
    }
    
    @Override
    public String QE(final int n) {
        return this.fa.dN(this.mS.QE(n));
    }
    
    @Override
    public int PF() {
        if (this.LH != 2) {
            return -1;
        }
        return this.PF.length / 5;
    }
    
    @Override
    public String wU(final int n) {
        final int n2 = this.PF[this.LH(n) + 0];
        if (n2 == -1) {
            return "";
        }
        return this.fa.dN(n2);
    }
    
    public String fa(final int n) {
        final int wu = this.mS.wU(this.PF[this.LH(n) + 0]);
        if (wu == -1) {
            return "";
        }
        return this.fa.dN(wu);
    }
    
    @Override
    public String zs(final int n) {
        String s = null;
        final int n2 = this.PF[this.LH(n) + 1];
        if (n2 != -1) {
            s = this.fa.dN(n2);
        }
        if (s != null) {
            if (s.length() != 0) {
                return s;
            }
        }
        try {
            final int ms = this.mS(n);
            if (this.ld != null) {
                final UW dn = this.ld.dN().wU().dN(ms);
                if (dn != null) {
                    s = dn.fa();
                }
            }
            if (s == null || s.length() == 0) {
                s = String.format("__rid_%08x", ms);
            }
        }
        catch (zX zx) {}
        return s;
    }
    
    public int mS(final int n) {
        final int n2 = this.PF[this.LH(n) + 1];
        if (this.zs == null || n2 < 0 || n2 >= this.zs.length) {
            return 0;
        }
        return this.zs[n2];
    }
    
    @Override
    public String OK(final int n) {
        final int lh = this.LH(n);
        final int n2 = this.PF[lh + 3];
        final int n3 = this.PF[lh + 4];
        final int n4 = this.PF[lh + 2];
        if (this.ld != null) {
            try {
                return this.ld.dN(n2, n3, (n4 == -1) ? null : TM.dN(this.fa.dN(n4)), this.mS(n));
            }
            catch (zX zx) {
                this.dN(zx);
                final Object[] array = { this.fa(n), this.zs(n), n3, zx.toString() };
            }
        }
        return Ig.dN(n2, n3);
    }
    
    @Override
    public void dN(final InputStream inputStream, final String s) {
        this.dN(inputStream);
    }
    
    @Override
    public String Hw() {
        return null;
    }
    
    @Override
    public int rK() {
        return -1;
    }
    
    @Override
    public Object dN(final String s) {
        return null;
    }
    
    @Override
    public boolean ld(final String s) {
        return false;
    }
    
    @Override
    public void dN(final String s, final boolean b) {
        throw new lb("");
    }
    
    public int LH(final int n) {
        if (this.LH != 2) {
            throw new IndexOutOfBoundsException();
        }
        final int n2 = n * 5;
        if (n2 >= this.PF.length) {
            throw new IndexOutOfBoundsException();
        }
        return n2;
    }
    
    public void Ux() {
        this.LH = -1;
        this.KK = -1;
        this.EO = -1;
        this.cb = -1;
        this.PF = null;
        this.Hw = -1;
    }
    
    public void ZY() {
        if (this.fa == null) {
            this.dN.ld(524291);
            this.dN.dN();
            this.fa = wV.dN(this.dN);
            this.mS.fa();
            this.wU = true;
        }
        if (this.LH == 1) {
            return;
        }
        final int lh = this.LH;
        this.Ux();
        while (true) {
            if (this.OK) {
                this.OK = false;
                this.mS.zs();
            }
            if (lh == 3 && this.mS.wU() == 1 && this.mS.ld() == 0) {
                this.LH = 1;
                break;
            }
            int int1;
            if (lh == 0) {
                int1 = 1048834;
            }
            else {
                int1 = this.dN.readInt();
            }
            if (int1 == 524672) {
                final int int2 = this.dN.readInt();
                if (int2 < 8 || int2 % 4 != 0) {
                    throw new IOException();
                }
                this.zs = this.dN.dN(int2 / 4 - 2);
            }
            else {
                if (int1 < 1048832 || int1 > 1048836) {
                    throw new IOException();
                }
                if (int1 == 1048834 && lh == -1) {
                    this.LH = 0;
                    break;
                }
                this.dN.dN();
                final int int3 = this.dN.readInt();
                this.dN.dN();
                if (int1 == 1048832 || int1 == 1048833) {
                    if (int1 == 1048832) {
                        this.mS.dN(this.dN.readInt(), this.dN.readInt());
                    }
                    else {
                        this.dN.dN();
                        this.dN.dN();
                        this.mS.QE();
                    }
                }
                else {
                    this.KK = int3;
                    if (int1 == 1048834) {
                        this.cb = this.dN.readInt();
                        this.EO = this.dN.readInt();
                        this.dN.dN();
                        final int n = this.dN.readInt() & 0xFFFF;
                        this.Hw = this.dN.readInt();
                        final int hw = this.Hw;
                        this.Hw = (this.Hw & 0xFFFF) - 1;
                        this.PF = this.dN.dN(n * 5);
                        for (int i = 3; i < this.PF.length; i += 5) {
                            this.PF[i] >>>= 24;
                        }
                        this.mS.fa();
                        this.LH = 2;
                        break;
                    }
                    if (int1 == 1048835) {
                        this.cb = this.dN.readInt();
                        this.EO = this.dN.readInt();
                        this.LH = 3;
                        this.OK = true;
                        break;
                    }
                    if (int1 == 1048836) {
                        this.EO = this.dN.readInt();
                        this.dN.dN();
                        this.dN.dN();
                        this.LH = 4;
                        break;
                    }
                    continue;
                }
            }
        }
    }
    
    public void dN(final zX qe) {
        if (this.QE == null) {
            this.QE = qe;
        }
    }
}
