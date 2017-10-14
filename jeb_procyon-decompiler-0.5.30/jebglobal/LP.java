// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.LinkedHashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public final class LP
{
    private final Qj dN;
    private final Map ld;
    private final Map QE;
    private final Set wU;
    private final Set fa;
    private String zs;
    
    public LP() {
        this.ld = new HashMap();
        this.QE = new HashMap();
        this.wU = new LinkedHashSet();
        this.fa = new LinkedHashSet();
        this.dN = null;
    }
    
    public LP(final Qj dn) {
        this.ld = new HashMap();
        this.QE = new HashMap();
        this.wU = new LinkedHashSet();
        this.fa = new LinkedHashSet();
        this.dN = dn;
    }
    
    public UW dN(final int n) {
        return this.dN(new tz(n));
    }
    
    public UW dN(final tz tz) {
        return this.ld(tz.dN).ld(tz);
    }
    
    public Set dN() {
        return this.wU;
    }
    
    public cN ld(final int n) {
        final cN cn = this.ld.get(n);
        if (cn != null) {
            return cn;
        }
        if (this.dN != null) {
            return this.dN.dN(this, n, this.zs);
        }
        throw new Gd();
    }
    
    public void dN(final cN cn, final boolean b) {
        final Integer value = cn.fa();
        if (this.ld.containsKey(value)) {
            throw new zX();
        }
        final String zs = cn.zs();
        if (this.QE.containsKey(zs)) {
            throw new zX();
        }
        this.ld.put(value, cn);
        this.QE.put(zs, cn);
        if (b) {
            this.wU.add(cn);
        }
        else {
            this.fa.add(cn);
        }
    }
    
    public void dN(final String zs) {
        this.zs = zs;
    }
}
