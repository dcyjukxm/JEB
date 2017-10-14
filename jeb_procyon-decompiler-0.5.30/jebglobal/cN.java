// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map;

public final class cN
{
    private final LP dN;
    private final int ld;
    private final String QE;
    private final Map wU;
    private final Map fa;
    private final Map zs;
    private final Set mS;
    private dN OK;
    
    public cN(final LP dn, final int ld, final String qe) {
        this.wU = new LinkedHashMap();
        this.fa = new LinkedHashMap();
        this.zs = new LinkedHashMap();
        this.mS = new HashSet();
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
    }
    
    public List dN() {
        return new ArrayList(this.wU.values());
    }
    
    public boolean dN(final tz tz) {
        return this.wU.containsKey(tz);
    }
    
    public UW ld(final tz tz) {
        final UW uw = this.wU.get(tz);
        if (uw == null) {
            throw new Gd();
        }
        return uw;
    }
    
    public NM dN(final Ja ja) {
        NM nm = this.fa.get(ja);
        if (nm == null) {
            nm = new NM(ja);
            this.fa.put(ja, nm);
        }
        return nm;
    }
    
    public Set ld() {
        final HashSet<dx> set = new HashSet<dx>();
        final Iterator<UW> iterator = this.wU.values().iterator();
        while (iterator.hasNext()) {
            for (final dx dx : iterator.next().dN()) {
                if (dx.wU() instanceof fa) {
                    set.add(dx);
                }
            }
        }
        return set;
    }
    
    public Collection QE() {
        final HashMap<PS, Ug> hashMap = (HashMap<PS, Ug>)new HashMap<Object, Ug>();
        final Iterator<UW> iterator = this.wU.values().iterator();
        while (iterator.hasNext()) {
            for (final dx dx : iterator.next().dN()) {
                if (dx.wU() instanceof Mt) {
                    final Me ms = dx.QE().mS();
                    final NM ld = dx.ld();
                    final PS ps = new PS(ms, ld);
                    Ug ug = hashMap.get(ps);
                    if (ug == null) {
                        ug = new Ug(this, ms, ld);
                        hashMap.put(ps, ug);
                    }
                    ug.ld(dx);
                }
            }
        }
        return hashMap.values();
    }
    
    public LP wU() {
        return this.dN;
    }
    
    public int fa() {
        return this.ld;
    }
    
    public String zs() {
        return this.QE;
    }
    
    boolean QE(final tz tz) {
        return this.mS.contains(tz);
    }
    
    public void dN(final UW uw) {
        if (this.wU.put(uw.wU(), uw) != null) {
            throw new zX();
        }
    }
    
    public void dN(final Me me) {
        if (this.zs.put(me.dN(), me) != null) {
            throw new zX();
        }
    }
    
    public void dN(final int n) {
        this.mS.add(new tz(n));
    }
    
    @Override
    public String toString() {
        return this.QE;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        final cN cn = (cN)o;
        return (this.dN == cn.dN || (this.dN != null && this.dN.equals(cn.dN))) && this.ld == cn.ld;
    }
    
    @Override
    public int hashCode() {
        return 37 * (259 + ((this.dN != null) ? this.dN.hashCode() : 0)) + this.ld;
    }
    
    public dN mS() {
        if (this.OK == null) {
            this.OK = new dN(this);
        }
        return this.OK;
    }
}
