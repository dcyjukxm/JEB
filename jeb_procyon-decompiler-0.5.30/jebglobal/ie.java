// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.HashSet;

public final class ie extends tu
{
    private long ld;
    private YK QE;
    
    public ie(final long ld, final hV dn) {
        this.dN = dn;
        this.ld = ld;
        this.QE = null;
        if (!dn.EO()) {
            throw new RuntimeException();
        }
        if (dn.zs() && ld != 0L) {
            throw new RuntimeException();
        }
    }
    
    public ie(final YK qe, final hV dn) {
        this.dN = dn;
        this.ld = 0L;
        this.QE = qe;
        if (!this.dN.mS() || !this.dN.dN().equals("Ljava/lang/String;")) {
            throw new RuntimeException();
        }
    }
    
    public static boolean ld(final hV hv) {
        return hv.EO() && !hv.zs();
    }
    
    public long zs() {
        return this.ld;
    }
    
    @Override
    public HashSet fa() {
        return new HashSet();
    }
    
    @Override
    hV dN(final int n) {
        return hV.dN;
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        return false;
    }
    
    public boolean ld() {
        return false;
    }
    
    public boolean QE() {
        return false;
    }
    
    @Override
    int dN(final xy xy) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        return 0;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(new tu[0]);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        return false;
    }
    
    @Override
    public String toString() {
        if (this.QE != null) {
            return String.format("#%X", this.QE.dN());
        }
        return String.format("%X<%s>", this.ld, this.dN);
    }
    
    public Xf dN(final TB tb) {
        OX ox;
        if (this.QE != null) {
            ox = tb.zs.dN(tb.dN.dN(this.QE.dN()));
        }
        else if (this.dN == hV.ld) {
            ox = tb.zs.dN((this.ld & 0x1L) != 0x0L);
        }
        else if (this.dN == hV.QE) {
            ox = tb.zs.dN((byte)this.ld);
        }
        else if (this.dN == hV.wU) {
            ox = tb.zs.dN((char)this.ld);
        }
        else if (this.dN == hV.fa) {
            ox = tb.zs.dN((short)this.ld);
        }
        else if (this.dN == hV.zs || (this.dN == hV.cb && tb.QE)) {
            ox = tb.zs.dN((int)this.ld);
        }
        else if (this.dN == hV.mS) {
            ox = tb.zs.dN(this.ld);
        }
        else if (this.dN == hV.OK) {
            ox = tb.zs.dN(Float.intBitsToFloat((int)this.ld));
        }
        else if (this.dN == hV.LH) {
            ox = tb.zs.dN(Double.longBitsToDouble(this.ld));
        }
        else {
            ox = tb.zs.dN();
        }
        return ox;
    }
}
