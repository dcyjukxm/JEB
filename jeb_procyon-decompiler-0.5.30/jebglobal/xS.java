// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class xS implements bm
{
    private static final long LK = 844563159190538443L;
    private Qz dN;
    private GS ld;
    private GS QE;
    private int wU;
    private int fa;
    private int zs;
    private boolean mS;
    
    public xS(final Qz dn, final GS ld, final GS qe) {
        this.wU = -1;
        this.fa = 1;
        this.zs = -1;
        this.mS = false;
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        switch (xS$1.dN[dn.ordinal()]) {
            case 1: {
                if (!(ld instanceof Ts) || !(qe instanceof tu)) {
                    throw new RuntimeException();
                }
                break;
            }
            case 2: {
                if (!(ld instanceof Cs) || qe != null) {
                    throw new RuntimeException();
                }
                break;
            }
            case 3: {
                if (!(ld instanceof Cs) || !(qe instanceof vC)) {
                    throw new RuntimeException();
                }
                break;
            }
            case 4: {
                if (!(ld instanceof iz) || !(qe instanceof tu)) {
                    throw new RuntimeException();
                }
                break;
            }
            case 5: {
                if (ld != null || (qe != null && !(qe instanceof tu))) {
                    throw new RuntimeException();
                }
                break;
            }
            case 6: {
                if (ld != null || !(qe instanceof yX)) {
                    throw new RuntimeException();
                }
                break;
            }
            case 7: {
                if (ld != null || !(qe instanceof tu)) {
                    throw new RuntimeException();
                }
                break;
            }
            case 8: {
                if (!(ld instanceof xy) || qe != null) {
                    throw new RuntimeException();
                }
                break;
            }
            case 9:
            case 10: {
                if (ld != null || !(qe instanceof tu)) {
                    throw new RuntimeException();
                }
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public Qz wU() {
        return this.dN;
    }
    
    public GS fa() {
        return this.ld;
    }
    
    public GS zs() {
        return this.QE;
    }
    
    @Override
    public int dN() {
        return this.wU;
    }
    
    public void dN(final int wu) {
        this.wU = wu;
    }
    
    public int mS() {
        return this.zs;
    }
    
    public void ld(final int zs) {
        this.zs = zs;
    }
    
    @Override
    public int ld() {
        return this.fa;
    }
    
    public void QE(final int fa) {
        if (fa <= 0) {
            throw new RuntimeException();
        }
        this.fa = fa;
    }
    
    public void wU(final int n) {
        if (this.fa + n <= 0) {
            throw new RuntimeException();
        }
        this.fa += n;
    }
    
    public void dN(final boolean ms) {
        this.mS = ms;
    }
    
    @Override
    public boolean QE() {
        return this.mS;
    }
    
    public boolean dN(final tu qe) {
        if (this.dN != Qz.dN) {
            return false;
        }
        this.QE = qe;
        return true;
    }
    
    public boolean OK() {
        if (this.dN != Qz.dN || !(this.ld instanceof xy) || !(this.QE instanceof yX)) {
            return false;
        }
        this.dN = Qz.ld;
        this.ld = null;
        return true;
    }
    
    public boolean LH() {
        if (this.dN != Qz.wU) {
            return false;
        }
        this.dN = Qz.QE;
        this.QE = null;
        return true;
    }
    
    public boolean KK() {
        if (this.dN != Qz.fa) {
            return false;
        }
        final iz iz = (iz)this.ld;
        if (iz.dN() != 1) {
            return false;
        }
        final int intValue = iz.ld().iterator().next();
        final Cs ld = iz.QE().iterator().next();
        final tu tu = (tu)this.QE;
        this.dN = Qz.wU;
        this.ld = ld;
        this.QE = new vC(tu, kn.Hv, new ie(intValue, tu.dN()));
        return true;
    }
    
    public iz EO() {
        if (this.dN != Qz.fa) {
            return null;
        }
        return (iz)this.ld;
    }
    
    public boolean fa(final int n) {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 4:
            case 5:
            case 7: {
                return false;
            }
            case 2:
            case 3: {
                ((Cs)this.ld).dN(n);
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    public int cb() {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 4:
            case 5:
            case 7: {
                return -1;
            }
            case 2:
            case 3: {
                return ((Cs)this.ld).dN();
            }
            default: {
                return -1;
            }
        }
    }
    
    @Override
    public boolean dN(final List list) {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 5:
            case 7: {
                return true;
            }
            case 2: {
                if (list != null) {
                    list.add(((Cs)this.ld).dN());
                }
                return true;
            }
            case 3: {
                if (list != null) {
                    list.add(this.wU + this.fa);
                    list.add(((Cs)this.ld).dN());
                }
                return true;
            }
            case 4: {
                if (list != null) {
                    list.add(this.wU + this.fa);
                    final Iterator<Cs> iterator = (Iterator<Cs>)((iz)this.ld).QE().iterator();
                    while (iterator.hasNext()) {
                        list.add(iterator.next().dN());
                    }
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public void dN(final List list, final List list2, final Object o) {
        list.clear();
        list2.clear();
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                final HashSet fa = this.ld.fa();
                if (this.ld instanceof xy) {
                    list.addAll(fa);
                }
                else {
                    list2.addAll(fa);
                }
                list2.addAll(this.QE.fa());
                break;
            }
            case 2: {
                break;
            }
            case 3:
            case 4: {
                list2.addAll(this.QE.fa());
                break;
            }
            case 5: {
                if (this.QE != null) {
                    list2.addAll(this.QE.fa());
                    break;
                }
                break;
            }
            case 6: {
                list2.addAll(this.QE.fa());
                break;
            }
            case 7: {
                list2.addAll(this.QE.fa());
                break;
            }
            case 8: {
                list.addAll(this.ld.fa());
                break;
            }
            case 9:
            case 10: {
                list2.addAll(this.QE.fa());
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public hV zs(final int n) {
        hV hv = hV.dN;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                if (this.ld instanceof xy) {
                    hv = ((xy)this.ld).dN(n);
                    break;
                }
                break;
            }
            case 8: {
                hv = ((xy)this.ld).dN(n);
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10: {
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        if (hv == hV.dN) {
            throw new RuntimeException();
        }
        return hv;
    }
    
    public boolean dN(final int n, final hV hv) {
        boolean b = false;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                if (!(this.ld instanceof xy)) {
                    break;
                }
                b = ((xy)this.ld).dN(n, hv);
                if (b) {
                    final hV dn = ((xy)this.ld).dN();
                    if (dn.cb()) {
                        ((tu)this.QE).dN(hV.dN(dn, false));
                    }
                    break;
                }
                break;
            }
            case 8: {
                b = ((xy)this.ld).dN(n, hv);
                break;
            }
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10: {
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return b;
    }
    
    public hV mS(final int n) {
        hV hv = hV.dN;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                hv = ((tu)this.QE).dN(n);
                if (!(this.ld instanceof xy)) {
                    hv = hV.dN(hv, ((Ts)this.ld).dN(n));
                    break;
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                hv = ((vC)this.QE).dN(n);
                break;
            }
            case 4: {
                hv = ((tu)this.QE).dN(n);
                break;
            }
            case 5: {
                if (this.QE != null) {
                    hv = ((tu)this.QE).dN(n);
                    break;
                }
                break;
            }
            case 6: {
                hv = ((tu)this.QE).dN(n);
                break;
            }
            case 7: {
                hv = ((tu)this.QE).dN(n);
                break;
            }
            case 8: {
                break;
            }
            case 9:
            case 10: {
                hv = ((tu)this.QE).dN(n);
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        if (hv == hV.dN) {
            throw new RuntimeException();
        }
        return hv;
    }
    
    public boolean ld(final int n, final hV hv) {
        boolean b = false;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                b = ((tu)this.QE).dN(n, hv);
                if (b) {
                    final hV dn = ((tu)this.QE).dN();
                    if (dn.cb()) {
                        ((Ts)this.ld).dN(hV.dN(dn, true));
                    }
                }
                if (!(this.ld instanceof xy)) {
                    if (((Ts)this.ld).dN(n, hv)) {
                        final hV dn2 = ((tu)this.ld).dN();
                        if (dn2.cb()) {
                            ((tu)this.QE).dN(hV.dN(dn2, false));
                        }
                        b = true;
                    }
                    break;
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                b = ((vC)this.QE).dN(n, hv);
                break;
            }
            case 4: {
                b = ((tu)this.QE).dN(n, hv);
                break;
            }
            case 5: {
                if (this.QE != null) {
                    b = ((tu)this.QE).dN(n, hv);
                    break;
                }
                break;
            }
            case 6: {
                b = ((tu)this.QE).dN(n, hv);
                break;
            }
            case 7: {
                b = ((tu)this.QE).dN(n, hv);
                break;
            }
            case 8: {
                break;
            }
            case 9:
            case 10: {
                b = ((tu)this.QE).dN(n, hv);
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return b;
    }
    
    public boolean PF() {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                return ((tu)this.QE).ld() || ((Ts)this.ld).ld();
            }
            case 2: {
                return false;
            }
            case 3: {
                return ((vC)this.QE).ld();
            }
            case 4: {
                return ((tu)this.QE).ld();
            }
            case 5: {
                return this.QE != null && ((tu)this.QE).ld();
            }
            case 6: {
                return ((tu)this.QE).ld();
            }
            case 7: {
                return ((tu)this.QE).ld();
            }
            case 8: {
                return ((xy)this.ld).ld();
            }
            case 9:
            case 10: {
                return ((tu)this.QE).ld();
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public boolean Hw() {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                return ((tu)this.QE).QE() || ((Ts)this.ld).QE();
            }
            case 2: {
                return false;
            }
            case 3: {
                return ((vC)this.QE).QE();
            }
            case 4: {
                return ((tu)this.QE).QE();
            }
            case 5: {
                return this.QE != null && ((tu)this.QE).QE();
            }
            case 6: {
                return ((tu)this.QE).QE();
            }
            case 7: {
                return ((tu)this.QE).QE();
            }
            case 8: {
                return ((xy)this.ld).QE();
            }
            case 9:
            case 10: {
                return ((tu)this.QE).QE();
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public int dN(final xy xy) {
        int n = 0;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                if (!(this.ld instanceof xy)) {
                    n = ((Ts)this.ld).dN(xy);
                }
                n += ((tu)this.QE).dN(xy);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                n = ((vC)this.QE).dN(xy);
                break;
            }
            case 4: {
                n = ((tu)this.QE).dN(xy);
                break;
            }
            case 5: {
                if (this.QE != null) {
                    n = ((tu)this.QE).dN(xy);
                    break;
                }
                break;
            }
            case 6: {
                n = ((tu)this.QE).dN(xy);
                break;
            }
            case 7: {
                n = ((tu)this.QE).dN(xy);
                break;
            }
            case 8: {
                break;
            }
            case 9:
            case 10: {
                n = ((tu)this.QE).dN(xy);
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return n;
    }
    
    public int dN(final xy xy, final long n) {
        int n2 = 0;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                if (!(this.ld instanceof xy)) {
                    n2 = 0 + ((tu)this.ld).dN(xy, n);
                }
                if (!(this.QE instanceof xy)) {
                    n2 += ((tu)this.QE).dN(xy, n);
                    break;
                }
                if (xy.QE((xy)this.QE)) {
                    final hV dn = ((xy)this.QE).dN();
                    if (ie.ld(dn)) {
                        this.QE = new ie(n, dn);
                        ++n2;
                    }
                    break;
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                n2 = 0 + ((vC)this.QE).dN(xy, n);
                break;
            }
            case 4: {
                if (!(this.QE instanceof xy)) {
                    n2 = 0 + ((tu)this.QE).dN(xy, n);
                    break;
                }
                if (xy.QE((xy)this.QE)) {
                    final hV dn2 = ((xy)this.QE).dN();
                    if (ie.ld(dn2)) {
                        this.QE = new ie(n, dn2);
                        ++n2;
                    }
                    break;
                }
                break;
            }
            case 5: {
                if (this.QE instanceof xy) {
                    if (xy.QE((xy)this.QE)) {
                        final hV dn3 = ((xy)this.QE).dN();
                        if (ie.ld(dn3)) {
                            this.QE = new ie(n, dn3);
                            ++n2;
                        }
                        break;
                    }
                    break;
                }
                else {
                    if (this.QE != null) {
                        n2 = 0 + ((tu)this.QE).dN(xy, n);
                        break;
                    }
                    break;
                }
                break;
            }
            case 6: {
                n2 = 0 + ((tu)this.QE).dN(xy, n);
                break;
            }
            case 7: {
                if (!(this.QE instanceof xy)) {
                    n2 = 0 + ((tu)this.QE).dN(xy, n);
                    break;
                }
                if (xy.QE((xy)this.QE)) {
                    final hV dn4 = ((xy)this.QE).dN();
                    if (ie.ld(dn4)) {
                        this.QE = new ie(n, dn4);
                        ++n2;
                    }
                    break;
                }
                break;
            }
            case 8: {
                break;
            }
            case 9:
            case 10: {
                if (!(this.QE instanceof xy)) {
                    n2 = 0 + ((tu)this.QE).dN(xy, n);
                    break;
                }
                if (xy.QE((xy)this.QE)) {
                    final hV dn5 = ((xy)this.QE).dN();
                    if (ie.ld(dn5)) {
                        this.QE = new ie(n, dn5);
                        ++n2;
                    }
                    break;
                }
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return n2;
    }
    
    public int dN(final xy xy, final tu qe) {
        int n = 0;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                if (!(this.ld instanceof xy)) {
                    n = 0 + ((tu)this.ld).dN(xy, qe);
                }
                if (!(this.QE instanceof xy)) {
                    n += ((tu)this.QE).dN(xy, qe);
                    break;
                }
                if (xy.ld((xy)this.QE)) {
                    this.QE = qe;
                    ++n;
                    break;
                }
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                n = 0 + ((vC)this.QE).dN(xy, qe);
                break;
            }
            case 4: {
                if (!(this.QE instanceof xy)) {
                    n = 0 + ((tu)this.QE).dN(xy, qe);
                    break;
                }
                if (xy.ld((xy)this.QE)) {
                    this.QE = qe;
                    ++n;
                    break;
                }
                break;
            }
            case 5: {
                if (this.QE instanceof xy) {
                    if (xy.ld((xy)this.QE)) {
                        this.QE = qe;
                        ++n;
                        break;
                    }
                    break;
                }
                else {
                    if (this.QE != null) {
                        n = 0 + ((tu)this.QE).dN(xy, qe);
                        break;
                    }
                    break;
                }
                break;
            }
            case 6: {
                n = 0 + ((tu)this.QE).dN(xy, qe);
                break;
            }
            case 7: {
                if (!(this.QE instanceof xy)) {
                    n = 0 + ((tu)this.QE).dN(xy, qe);
                    break;
                }
                if (xy.ld((xy)this.QE)) {
                    this.QE = qe;
                    ++n;
                    break;
                }
                break;
            }
            case 8: {
                break;
            }
            case 9:
            case 10: {
                if (!(this.QE instanceof xy)) {
                    n = 0 + ((tu)this.QE).dN(xy, qe);
                    break;
                }
                if (xy.ld((xy)this.QE)) {
                    this.QE = qe;
                    ++n;
                    break;
                }
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return n;
    }
    
    public void dN(final hV hv, final hV hv2) {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                ((Ts)this.ld).dN(hv, hv2);
                ((tu)this.QE).dN(hv, hv2);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                ((vC)this.QE).dN(hv, hv2);
                break;
            }
            case 4: {
                ((tu)this.QE).dN(hv, hv2);
                break;
            }
            case 5: {
                if (this.QE != null) {
                    ((tu)this.QE).dN(hv, hv2);
                    break;
                }
                break;
            }
            case 6: {
                ((tu)this.QE).dN(hv, hv2);
                break;
            }
            case 7: {
                ((tu)this.QE).dN(hv, hv2);
                break;
            }
            case 8: {
                ((xy)this.ld).dN(hv, hv2);
                break;
            }
            case 9:
            case 10: {
                ((tu)this.QE).dN(hv, hv2);
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public List rK() {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                return ZF.dN((Ts)this.ld, (tu)this.QE);
            }
            case 2: {
                return ZF.dN(new tu[0]);
            }
            case 3: {
                return ZF.dN((vC)this.QE);
            }
            case 4: {
                return ZF.dN((tu)this.QE);
            }
            case 5: {
                return ZF.dN((tu)this.QE);
            }
            case 6: {
                return ZF.dN((tu)this.QE);
            }
            case 7: {
                return ZF.dN((tu)this.QE);
            }
            case 8: {
                return ZF.dN((xy)this.ld);
            }
            case 9:
            case 10: {
                return ZF.dN((tu)this.QE);
            }
            default: {
                throw new RuntimeException();
            }
        }
    }
    
    public boolean dN(final tu tu, final tu tu2) {
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                if (this.ld == tu) {
                    this.ld = tu2;
                    return true;
                }
                if (this.QE == tu) {
                    this.QE = tu2;
                    return true;
                }
                break;
            }
            case 2: {
                break;
            }
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10: {
                if (this.QE == tu) {
                    this.QE = tu2;
                    return true;
                }
                break;
            }
            case 8: {
                if (this.ld == tu) {
                    this.ld = tu2;
                    return true;
                }
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                sb.append(String.format("%s = %s", this.ld, this.QE));
                break;
            }
            case 2: {
                sb.append(String.format("jump %s", this.ld));
                break;
            }
            case 3: {
                sb.append(String.format("jcond %s, %s", this.ld, this.QE));
                break;
            }
            case 4: {
                sb.append(String.format("switch %s, %s", this.ld, this.QE));
                break;
            }
            case 5: {
                sb.append("return");
                if (this.QE != null) {
                    sb.append(" " + this.QE);
                    break;
                }
                break;
            }
            case 6: {
                sb.append(this.QE);
                break;
            }
            case 7: {
                sb.append(String.format("throw %s", this.QE));
                break;
            }
            case 8: {
                sb.append(String.format("catch %s", this.ld));
                break;
            }
            case 9: {
                sb.append(String.format("monitor-enter %s", this.QE));
                break;
            }
            case 10: {
                sb.append(String.format("monitor-exit %s", this.QE));
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        return sb.toString();
    }
    
    public II dN(final TB tb) {
        final ArrayList<II> list = new ArrayList<II>(2);
        tb.EO = this;
        II ii = null;
        switch (xS$1.dN[this.dN.ordinal()]) {
            case 1: {
                Xf xf;
                if (this.ld instanceof xy) {
                    tb.cb = true;
                    xf = ((xy)this.ld).dN(tb);
                    tb.cb = false;
                }
                else {
                    xf = ((Ts)this.ld).dN(tb);
                }
                ii = new XM((Rx)xf, ((tu)this.QE).dN(tb));
                break;
            }
            case 2: {
                final int dn = ((Cs)this.ld).dN();
                ii = new KO(tb.KK.dN(dn, "label_" + dn));
                break;
            }
            case 3: {
                final int dn2 = ((Cs)this.ld).dN();
                final KO ko = new KO(tb.KK.dN(dn2, "label_" + dn2));
                list.add(ko);
                ii = new tE((lk)((vC)this.QE).dN(tb), ko);
                break;
            }
            case 4: {
                final Dq dq = new Dq(((tu)this.QE).dN(tb));
                for (final Cs cs : ((iz)this.ld).QE()) {
                    final List dn3 = ((iz)this.ld).dN(cs);
                    final int dn4 = cs.dN();
                    final KO ko2 = new KO(tb.KK.dN(dn4, "label_" + dn4));
                    list.add(ko2);
                    dq.dN(dn3, new EG(ko2));
                }
                ii = dq;
                break;
            }
            case 5: {
                Xf dn5 = null;
                if (this.QE != null) {
                    dn5 = ((tu)this.QE).dN(tb);
                }
                ii = new cq(dn5);
                break;
            }
            case 6: {
                ii = (II)((tu)this.QE).dN(tb);
                break;
            }
            case 7: {
                ii = new vE(((tu)this.QE).dN(tb));
                break;
            }
            case 8: {
                tb.cb = true;
                final Xf dn6 = ((xy)this.ld).dN(tb);
                tb.cb = false;
                ii = new sX(dn6);
                break;
            }
            case 9:
            case 10: {
                ii = new mA(this.dN == Qz.LH, ((tu)this.QE).dN(tb));
                break;
            }
            default: {
                throw new RuntimeException();
            }
        }
        if (ii != null) {
            list.add(ii);
        }
        for (final II ii2 : list) {
            ii2.dN(this.wU, this.fa);
            ii2.dN(this.zs);
        }
        tb.EO = null;
        return ii;
    }
}
