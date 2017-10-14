// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public final class os extends tu implements yX
{
    private tu ld;
    private List QE;
    
    public os(final YK yk, final hV dn, final tu ld, List qe) {
        if (qe == null) {
            qe = new ArrayList();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public tu zs() {
        return this.ld;
    }
    
    public List mS() {
        return this.QE;
    }
    
    public void dN(final List qe) {
        if (qe == null) {
            throw new IllegalArgumentException();
        }
        this.QE = qe;
    }
    
    @Override
    public HashSet fa() {
        final HashSet set = new HashSet();
        set.addAll(this.ld.fa());
        final Iterator<tu> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            set.addAll(iterator.next().fa());
        }
        return set;
    }
    
    public hV dN(final int n) {
        final ArrayList<tu> list = new ArrayList<tu>(1 + this.QE.size());
        list.add(this.ld);
        list.addAll((Collection<?>)this.QE);
        for (final tu tu : list) {
            if (!(tu instanceof xy) && !(tu instanceof ie)) {
                throw new RuntimeException();
            }
            final hV dn = tu.dN(n);
            if (!dn.EO()) {
                continue;
            }
            if (!dn.cb()) {
                throw new RuntimeException();
            }
            return dn;
        }
        return hV.dN;
    }
    
    public boolean dN(final int n, final hV hv) {
        boolean dn = this.ld.dN(n, hv);
        final Iterator<tu> iterator = (Iterator<tu>)this.QE.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().dN(n, hv)) {
                dn = true;
            }
        }
        return dn;
    }
    
    public boolean ld() {
        return true;
    }
    
    public boolean QE() {
        return true;
    }
    
    @Override
    int dN(final xy xy) {
        int dn = this.ld.dN(xy);
        final Iterator<tu> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            dn += iterator.next().dN(xy);
        }
        return dn;
    }
    
    @Override
    int dN(final xy xy, final tu ld) {
        int n = 0;
        if (this.ld instanceof xy) {
            if (xy.ld((xy)this.ld)) {
                this.ld = ld;
                ++n;
            }
        }
        else {
            n = 0 + this.ld.dN(xy, ld);
        }
        for (int i = 0; i < this.QE.size(); ++i) {
            final tu tu = this.QE.get(i);
            if (tu instanceof xy) {
                if (xy.ld((xy)tu)) {
                    this.QE.set(i, ld);
                    ++n;
                }
            }
            else {
                n += tu.dN(xy, ld);
            }
        }
        return n;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        int n2 = 0;
        if (this.ld instanceof xy) {
            if (xy.QE((xy)this.ld)) {
                final hV dn = this.ld.dN();
                if (ie.ld(dn)) {
                    this.ld = new ie(n, dn);
                    ++n2;
                }
            }
        }
        else {
            n2 = 0 + this.ld.dN(xy, n);
        }
        for (int i = 0; i < this.QE.size(); ++i) {
            final tu tu = this.QE.get(i);
            if (tu instanceof xy) {
                if (xy.QE((xy)tu)) {
                    final hV dn2 = tu.dN();
                    if (ie.ld(dn2)) {
                        this.QE.set(i, new ie(n, dn2));
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
        this.ld.dN(hv, hv2);
        final Iterator<tu> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(hv, hv2);
        }
    }
    
    @Override
    public List wU() {
        return ZF.dN(ZF.dN(this.ld), this.QE);
    }
    
    @Override
    public boolean dN(final tu tu, final tu ld) {
        if (this.ld == tu) {
            this.ld = ld;
            return true;
        }
        for (int i = 0; i < this.QE.size(); ++i) {
            if (this.QE.get(i) == tu) {
                this.QE.set(i, ld);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("new ");
        sb.append(this.dN.dN(new String[] { this.ld.toString() }));
        if (!this.QE.isEmpty()) {
            sb.append("{");
            int n = 0;
            for (final tu tu : this.QE) {
                if (n > 0) {
                    sb.append(", ");
                }
                sb.append(tu);
                ++n;
            }
            sb.append("}");
        }
        return sb.toString();
    }
    
    public Xf dN(final TB tb) {
        this.dN.ld(false);
        if (this.QE.isEmpty()) {
            return new jK(this.dN, this.ld.dN(tb));
        }
        final ArrayList<Xf> list = new ArrayList<Xf>();
        final Iterator<tu> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().dN(tb));
        }
        return new jK(this.dN, false, list);
    }
}
