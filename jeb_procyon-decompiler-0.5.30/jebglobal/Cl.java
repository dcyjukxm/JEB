// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class Cl implements Iterable
{
    protected AR dN;
    private int wU;
    protected ArrayList ld;
    protected HashMap QE;
    
    Cl(final AR dn, final int wu) {
        this.dN = dn;
        this.wU = wu;
        this.ld = new ArrayList(wu);
        this.QE = new HashMap();
    }
    
    public int dN() {
        return this.ld.size();
    }
    
    public int ld() {
        return this.wU;
    }
    
    public Oa dN(final int n) {
        if (n < 0 || n >= this.ld.size()) {
            return null;
        }
        return this.ld.get(n);
    }
    
    public Oa dN(final String s) {
        return this.QE.get(s);
    }
    
    public List QE() {
        return new ArrayList(this.ld);
    }
    
    @Override
    public Iterator iterator() {
        return this.ld.iterator();
    }
}
