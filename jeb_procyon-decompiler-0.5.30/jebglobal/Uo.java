// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.Collection;
import java.util.HashSet;

public class Uo extends tu implements yX
{
    YK ld;
    tu[] QE;
    private String wU;
    private uK fa;
    
    public Uo(final YK ld, final tu[] qe, final hV dn, final String wu, final uK fa) {
        this.ld = ld;
        this.QE = qe;
        this.dN = dn;
        this.wU = wu;
        this.fa = fa;
    }
    
    @Override
    public HashSet fa() {
        final HashSet set = new HashSet();
        final tu[] qe = this.QE;
        for (int length = qe.length, i = 0; i < length; ++i) {
            set.addAll(qe[i].fa());
        }
        return set;
    }
    
    public hV dN(final int n) {
        final tu[] qe = this.QE;
        final int length = qe.length;
        int i = 0;
        while (i < length) {
            final tu tu = qe[i];
            if (!(tu instanceof xy) && !(tu instanceof ie)) {
                throw new RuntimeException();
            }
            final hV dn = tu.dN(n);
            if (dn.EO()) {
                if (!dn.cb()) {
                    throw new RuntimeException();
                }
                return dn;
            }
            else {
                ++i;
            }
        }
        return hV.dN;
    }
    
    public boolean dN(final int n, final hV hv) {
        boolean b = false;
        final tu[] qe = this.QE;
        for (int length = qe.length, i = 0; i < length; ++i) {
            if (qe[i].dN(n, hv)) {
                b = true;
            }
        }
        return b;
    }
    
    public boolean ld() {
        return true;
    }
    
    public boolean QE() {
        return true;
    }
    
    @Override
    int dN(final xy xy) {
        int n = 0;
        final tu[] qe = this.QE;
        for (int length = qe.length, i = 0; i < length; ++i) {
            n += qe[i].dN(xy);
        }
        return n;
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        int n = 0;
        for (int i = 0; i < this.QE.length; ++i) {
            final tu tu2 = this.QE[i];
            if (tu2 instanceof xy) {
                if (xy.ld((xy)tu2)) {
                    this.QE[i] = tu;
                    ++n;
                }
            }
            else {
                n += tu2.dN(xy, tu);
            }
        }
        return n;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        int n2 = 0;
        for (int i = 0; i < this.QE.length; ++i) {
            final tu tu = this.QE[i];
            if (tu instanceof xy) {
                if (xy.QE((xy)tu)) {
                    final hV dn = tu.dN();
                    if (ie.ld(dn)) {
                        this.QE[i] = new ie(n, dn);
                        ++n2;
                    }
                }
            }
            else {
                n2 += tu.dN(xy, n);
            }
        }
        return n2;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
        final tu[] qe = this.QE;
        for (int length = qe.length, i = 0; i < length; ++i) {
            qe[i].dN(hv, hv2);
        }
    }
    
    @Override
    public List wU() {
        return ZF.dN(this.QE);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        for (int i = 0; i < this.QE.length; ++i) {
            if (this.QE[i] == tu) {
                this.QE[i] = tu2;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        if (this.wU == null) {
            sb.append("method_" + this.ld);
        }
        else {
            sb.append(this.wU);
        }
        sb.append("(");
        int n = 0;
        for (final tu tu : this.QE) {
            if (n > 0) {
                sb.append(", ");
            }
            sb.append(tu);
            ++n;
        }
        sb.append(")");
        return String.format("(%s)<%s>", sb, this.dN);
    }
    
    public Xf dN(final TB tb) {
        final mi mi = new mi(tb.mS.dN(this.ld.dN(), this.fa == uK.wU), this.fa == uK.ld);
        final tu[] qe = this.QE;
        for (int length = qe.length, i = 0; i < length; ++i) {
            mi.dN(qe[i].dN(tb));
        }
        return mi;
    }
    
    public enum uK
    {
        dN("VIRTUAL", 0), 
        ld("SUPER", 1), 
        QE("DIRECT", 2), 
        wU("STATIC", 3), 
        fa("INTERFACE", 4);
        
        private uK(final String s, final int n) {
        }
    }
}
