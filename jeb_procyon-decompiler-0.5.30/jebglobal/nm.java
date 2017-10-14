// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class nm
{
    private int dN;
    private int ld;
    private List QE;
    
    public nm(final int dn, final int ld, final List qe) {
        if (dn < 0 || ld < 0 || qe == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        for (int n = 0; n < qe.size() && qe.get(n).dN(); ++n) {}
    }
    
    public int dN() {
        return this.dN;
    }
    
    public int ld() {
        return this.ld;
    }
    
    public int QE() {
        return this.dN + this.ld;
    }
    
    public List wU() {
        return new ArrayList(this.QE);
    }
    
    public List fa() {
        final ArrayList<Integer> list = new ArrayList<Integer>(this.QE.size());
        final Iterator<bt> iterator = this.QE.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().QE());
        }
        return list;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("try=[%X-%X[ handlers=[", this.dN, this.dN + this.ld));
        int n = 0;
        for (final bt bt : this.QE) {
            if (n++ >= 1) {
                sb.append(", ");
            }
            sb.append(bt.toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
