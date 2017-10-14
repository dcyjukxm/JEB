// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class yK implements Oa
{
    private AR dN;
    private int ld;
    private int QE;
    private int wU;
    private int[] fa;
    private int zs;
    private xd mS;
    private Uk OK;
    private ub[] LH;
    private boolean KK;
    private int EO;
    private int cb;
    private int[] PF;
    private String Hw;
    private String rK;
    private int Ux;
    
    yK(final AR dn, final int n, final int ld, final int qe, final int wu, final int[] array, final int zs, final xd ms, final Uk ok, final ub[] array2) {
        this.KK = false;
        this.EO = -1;
        this.cb = -1;
        this.PF = null;
        this.Hw = null;
        this.rK = "";
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = ((array == null) ? new int[0] : array);
        this.zs = zs;
        this.mS = ms;
        this.OK = ok;
        this.LH = ((array2 == null) ? new ub[0] : array2);
        if (ms != null) {
            this.bG();
        }
        final String dn2 = dn.dN(ld, false);
        int lastIndex = dn2.lastIndexOf(47);
        if (lastIndex < 0) {
            lastIndex = 0;
        }
        final String substring = dn2.substring(lastIndex + 1, dn2.length() - 1);
        if (!this.KK) {
            this.Hw = substring;
        }
        else if (!this.BQ()) {
            this.Hw = substring;
        }
    }
    
    private void bG() {
        final xd.vd dn = this.mS.dN();
        if (dn != null) {
            for (int i = 0; i < dn.dN(); ++i) {
                final xd.uK dn2 = dn.dN(i);
                if (dn2.dN() == 2) {
                    final kg ld = dn2.ld();
                    final String dn3 = this.dN.dN(ld.dN(), false);
                    if (dn3.equals("Ldalvik/annotation/InnerClass;")) {
                        this.KK = true;
                        boolean b = false;
                        for (final kg.uK uk : ld.ld()) {
                            if (this.dN.dN(uk.dN()).equals("name")) {
                                if (uk.ld().ld()) {
                                    this.Hw = "";
                                }
                                else {
                                    this.Hw = this.dN.dN(uk.ld().KK());
                                }
                                b = true;
                            }
                        }
                        if (!b) {
                            throw new yL();
                        }
                    }
                    else if (dn3.equals("Ldalvik/annotation/EnclosingClass;")) {
                        boolean b2 = false;
                        for (final kg.uK uk2 : ld.ld()) {
                            if (this.dN.dN(uk2.dN()).equals("value")) {
                                this.EO = uk2.ld().EO();
                                b2 = true;
                            }
                        }
                        if (!b2) {
                            throw new yL();
                        }
                    }
                    else if (dn3.equals("Ldalvik/annotation/EnclosingMethod;")) {
                        boolean b3 = false;
                        for (final kg.uK uk3 : ld.ld()) {
                            if (this.dN.dN(uk3.dN()).equals("value")) {
                                this.cb = uk3.ld().PF();
                                b3 = true;
                            }
                        }
                        if (!b3) {
                            throw new yL();
                        }
                    }
                    else if (dn3.equals("Ldalvik/annotation/MemberClasses;")) {
                        boolean b4 = false;
                        for (final kg.uK uk4 : ld.ld()) {
                            if (this.dN.dN(uk4.dN()).equals("value")) {
                                this.PF = new int[uk4.ld().rK().length];
                                int n2 = 0;
                                final ub[] rk = uk4.ld().rK();
                                for (int length5 = rk.length, n3 = 0; n3 < length5; ++n3) {
                                    this.PF[n2++] = rk[n3].EO();
                                }
                                b4 = true;
                            }
                        }
                        if (!b4) {
                            throw new yL();
                        }
                    }
                }
            }
            if (this.KK) {
                if (this.EO < 0) {
                    final int cb = this.cb;
                }
                if (this.EO >= 0 && this.cb >= 0) {
                    throw new yL();
                }
            }
        }
        final xd.eI[] qe = this.mS.QE();
        if (qe != null) {
            for (final xd.eI ei : qe) {
                final AV qe2 = this.dN.QE(this.dN.mS(ei.dN()).wU(false));
                if (qe2 == null) {
                    throw new yL();
                }
                for (final xd.uK uk5 : ei.ld().ld()) {
                    if (uk5.dN() == 2) {
                        final kg ld7 = uk5.ld();
                        if (this.dN.dN(ld7.dN(), false).equals("Ldalvik/annotation/Throws;")) {
                            int[] array2 = null;
                            for (final kg.uK uk6 : ld7.ld()) {
                                if (this.dN.dN(uk6.dN()).equals("value")) {
                                    array2 = new int[uk6.ld().rK().length];
                                    int n7 = 0;
                                    final ub[] rk2 = uk6.ld().rK();
                                    for (int length9 = rk2.length, n8 = 0; n8 < length9; ++n8) {
                                        array2[n7++] = rk2[n8].EO();
                                    }
                                }
                            }
                            if (array2 == null) {
                                throw new yL();
                            }
                            qe2.dN(array2);
                        }
                    }
                }
            }
        }
    }
    
    private boolean BQ() {
        final String dn = this.dN(false);
        if (!dn.endsWith(this.Hw + ";")) {
            return false;
        }
        final int n = dn.length() - 1 - this.Hw.length();
        int char1 = 32;
        int i;
        for (i = n - 1; i >= 0; --i) {
            char1 = dn.charAt(i);
            if (char1 == 47) {
                break;
            }
            if (char1 == 36) {
                break;
            }
        }
        if (char1 != 36) {
            return false;
        }
        this.rK = dn.substring(i + 1, n);
        for (int j = 0; j < this.rK.length(); ++j) {
            if (!Character.isDigit(this.rK.charAt(j))) {
                return false;
            }
        }
        return true;
    }
    
    public boolean dN() {
        return this.KK;
    }
    
    public boolean ld() {
        return this.KK && this.Hw == "";
    }
    
    public int QE() {
        return this.EO;
    }
    
    public int wU() {
        return this.cb;
    }
    
    public int[] fa() {
        return this.PF;
    }
    
    public String dN(final boolean b) {
        return this.dN.dN(this.ld, b);
    }
    
    public String ld(final boolean b) {
        return this.dN.dN(this.ld, b);
    }
    
    public int zs() {
        return this.ld;
    }
    
    public String QE(final boolean b) {
        if (!b) {
            return this.Hw;
        }
        return ((nh.vd)this.dN.mS().dN(this.ld)).ld(true);
    }
    
    public String mS() {
        return this.rK;
    }
    
    public boolean dN(final String s) {
        return ((nh.vd)this.dN.mS().dN(this.ld)).dN(s);
    }
    
    public boolean OK() {
        return ((nh.vd)this.dN.mS().dN(this.ld)).LH();
    }
    
    public int LH() {
        return this.QE;
    }
    
    public boolean KK() {
        return (this.QE & 0x6200) == 0x0;
    }
    
    public boolean EO() {
        return (this.QE & 0x4000) != 0x0;
    }
    
    public boolean cb() {
        return (this.QE & 0x200) != 0x0;
    }
    
    public boolean PF() {
        return (this.QE & 0x2000) != 0x0;
    }
    
    public String wU(final boolean b) {
        return (this.wU < 0) ? "Ljava/lang/Object;" : this.dN.dN(this.wU, b);
    }
    
    public int Hw() {
        return this.wU;
    }
    
    public String[] fa(final boolean b) {
        final String[] array = new String[this.fa.length];
        int n = 0;
        final int[] fa = this.fa;
        for (int length = fa.length, i = 0; i < length; ++i) {
            array[n] = this.dN.dN(fa[i], b);
            ++n;
        }
        return array;
    }
    
    public int[] rK() {
        return this.fa;
    }
    
    public int Ux() {
        return this.zs;
    }
    
    public ub[] ZY() {
        return this.LH;
    }
    
    public Uk s() {
        return this.OK;
    }
    
    public xd Hv() {
        return this.mS;
    }
    
    public xd.uK[] VX() {
        if (this.mS != null) {
            final xd.vd dn = this.mS.dN();
            if (dn != null) {
                return dn.ld();
            }
        }
        return null;
    }
    
    public xd.uK[] dN(final int n) {
        if (this.mS != null) {
            for (final xd.lX lx : this.mS.ld()) {
                final int dn = lx.dN();
                if (dn == n) {
                    return lx.ld().ld();
                }
                if (dn > n) {
                    break;
                }
            }
        }
        return null;
    }
    
    public xd.uK[] ld(final int n) {
        if (this.mS != null) {
            for (final xd.eI ei : this.mS.QE()) {
                final int dn = ei.dN();
                if (dn == n) {
                    return ei.ld().ld();
                }
                if (dn > n) {
                    break;
                }
            }
        }
        return null;
    }
    
    public xd.vd[] QE(final int n) {
        if (this.mS != null) {
            for (final xd.vn vn : this.mS.wU()) {
                final int dn = vn.dN();
                if (dn == n) {
                    return vn.ld();
                }
                if (dn > n) {
                    break;
                }
            }
        }
        return null;
    }
    
    public int ci() {
        return this.Ux;
    }
    
    public void wU(final int ux) {
        this.Ux = ux;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
