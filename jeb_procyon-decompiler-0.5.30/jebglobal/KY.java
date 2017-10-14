// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class KY extends YO implements CL
{
    private int ld;
    private String[] QE;
    private String[] wU;
    private int[] fa;
    
    public KY(final Kf kf, final GM gm) {
        super(kf);
        this.ld = 0;
        this.QE = new String[8];
        this.wU = new String[this.QE.length];
        this.fa = new int[this.QE.length];
    }
    
    private void dN() {
        final int n = (this.ld > 7) ? (2 * this.ld) : 8;
        final String[] qe = new String[n];
        final String[] wu = new String[n];
        final int[] fa = new int[n];
        if (this.QE != null) {
            System.arraycopy(this.QE, 0, qe, 0, this.ld);
            System.arraycopy(this.wU, 0, wu, 0, this.ld);
            System.arraycopy(this.fa, 0, fa, 0, this.ld);
        }
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
    }
    
    @Override
    public void dN(final String s, final String s2) {
        super.dN.dN(s, s2);
        for (int ok = this.OK(), n = this.ld - 1; n >= 0 && this.fa[n] > ok; --n) {
            --this.ld;
        }
        if (this.ld >= this.QE.length) {
            this.dN();
        }
        this.QE[this.ld] = s;
        this.wU[this.ld] = s2;
        ++this.ld;
    }
    
    @Override
    public void dN(final iR ir) {
        switch (ir.mS()) {
            case 0: {
                this.dN(ir.Hw(), (Boolean)ir.dN("http://xmlpull.org/v1/doc/features.html#xmldecl-standalone"));
                break;
            }
            case 1: {
                this.mS();
                break;
            }
            case 2: {
                this.ld(ir);
                break;
            }
            case 3: {
                this.QE(ir.EO(), ir.LH());
                break;
            }
            case 7: {
                this.OK(ir.KK());
                break;
            }
            case 4: {
                if (ir.zs() > 0) {
                    this.ld(ir.KK());
                    break;
                }
                this.OK(ir.KK());
                break;
            }
            case 6: {
                this.wU(ir.LH());
                break;
            }
            case 5: {
                this.QE(ir.KK());
                break;
            }
            case 8: {
                this.fa(ir.KK());
                break;
            }
            case 9: {
                this.zs(ir.KK());
                break;
            }
            case 10: {
                this.mS(ir.KK());
                break;
            }
        }
    }
    
    private void ld(final iR ir) {
        if (!ir.ld("http://xmlpull.org/v1/doc/features.html#report-namespace-prefixes")) {
            final int dn = ir.dN(ir.zs() - 1);
            for (int dn2 = ir.dN(ir.zs()), i = dn; i < dn2; ++i) {
                this.dN(ir.ld(i), ir.QE(i));
            }
        }
        this.ld(ir.EO(), ir.LH());
        for (int j = 0; j < ir.PF(); ++j) {
            this.dN(ir.wU(j), ir.zs(j), ir.OK(j));
        }
    }
}
