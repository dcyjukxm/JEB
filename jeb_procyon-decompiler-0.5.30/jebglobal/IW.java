// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.LinkedHashMap;
import java.io.File;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public abstract class IW implements Sj
{
    protected Set dN;
    protected Map ld;
    
    public Set dN() {
        return this.dN(false);
    }
    
    @Override
    public Set dN(final boolean b) {
        if (this.dN == null) {
            this.QE();
        }
        if (!b) {
            return this.dN;
        }
        final LinkedHashSet<String> set = new LinkedHashSet<String>(this.dN);
        for (final Map.Entry<K, Sj> entry : this.ld().entrySet()) {
            final Iterator iterator2 = entry.getValue().dN(true).iterator();
            while (iterator2.hasNext()) {
                set.add((String)entry.getKey() + '/' + iterator2.next());
            }
        }
        return set;
    }
    
    @Override
    public boolean dN(final String s) {
        vd cb;
        try {
            cb = this.cb(s);
        }
        catch (By by) {
            return false;
        }
        if (cb.dN != null) {
            return cb.dN.dN(cb.ld);
        }
        return this.dN().contains(cb.ld);
    }
    
    @Override
    public boolean ld(final String s) {
        vd cb;
        try {
            cb = this.cb(s);
        }
        catch (By by) {
            return false;
        }
        if (cb.dN != null) {
            return cb.dN.ld(cb.ld);
        }
        return this.ld().containsKey(cb.ld);
    }
    
    @Override
    public InputStream QE(final String s) {
        final vd cb = this.cb(s);
        if (cb.dN != null) {
            return cb.dN.QE(cb.ld);
        }
        if (!this.dN().contains(cb.ld)) {
            throw new By(s);
        }
        return this.OK(cb.ld);
    }
    
    @Override
    public OutputStream wU(final String s) {
        final uK pf = this.PF(s);
        if (pf.dN == null) {
            this.dN().add(pf.ld);
            return this.LH(pf.ld);
        }
        Sj zs;
        try {
            zs = this.zs(pf.dN);
        }
        catch (vi vi) {
            zs = this.ld().get(pf.dN);
        }
        return zs.wU(pf.ld);
    }
    
    @Override
    public Sj fa(final String s) {
        final vd cb = this.cb(s);
        if (cb.dN != null) {
            return cb.dN.fa(cb.ld);
        }
        if (!this.ld().containsKey(cb.ld)) {
            throw new By(s);
        }
        return (Sj)this.ld().get(cb.ld);
    }
    
    @Override
    public Sj zs(final String s) {
        final uK pf = this.PF(s);
        if (pf.dN != null) {
            IW kk;
            if (this.ld().containsKey(pf.dN)) {
                kk = this.ld().get(pf.dN);
            }
            else {
                kk = this.KK(pf.dN);
                this.ld().put(pf.dN, kk);
            }
            return kk.zs(pf.ld);
        }
        if (this.ld().containsKey(pf.ld)) {
            throw new vi(s);
        }
        final IW kk2 = this.KK(pf.ld);
        this.ld().put(pf.ld, kk2);
        return kk2;
    }
    
    @Override
    public boolean mS(final String s) {
        vd cb;
        try {
            cb = this.cb(s);
        }
        catch (By by) {
            return false;
        }
        if (cb.dN != null) {
            return cb.dN.mS(cb.ld);
        }
        if (!this.dN().contains(cb.ld)) {
            return false;
        }
        this.EO(cb.ld);
        this.dN().remove(cb.ld);
        return true;
    }
    
    @Override
    public void dN(final File file) {
        TM.dN(this, file);
    }
    
    @Override
    public void dN(final File file, final String[] array) {
        TM.dN(this, file, array);
    }
    
    @Override
    public void dN(final File file, final String s) {
        TM.dN(this, file, s);
    }
    
    protected Map ld() {
        return this.ld(false);
    }
    
    protected Map ld(final boolean b) {
        if (this.ld == null) {
            this.wU();
        }
        if (!b) {
            return this.ld;
        }
        final LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>(this.ld);
        for (final Map.Entry<K, IW> entry : this.ld().entrySet()) {
            for (final Map.Entry<String, V> entry2 : entry.getValue().ld(true).entrySet()) {
                linkedHashMap.put((String)entry.getKey() + '/' + entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap;
    }
    
    private vd cb(final String s) {
        final uK pf = this.PF(s);
        if (pf.dN == null) {
            return new vd(null, pf.ld);
        }
        if (!this.ld().containsKey(pf.dN)) {
            throw new By(s);
        }
        return new vd((IW)this.ld().get(pf.dN), pf.ld);
    }
    
    private uK PF(final String s) {
        final int index = s.indexOf(47);
        if (index == -1) {
            return new uK(null, s);
        }
        return new uK(s.substring(0, index), s.substring(index + 1));
    }
    
    protected abstract void QE();
    
    protected abstract void wU();
    
    protected abstract InputStream OK(final String p0);
    
    protected abstract OutputStream LH(final String p0);
    
    protected abstract IW KK(final String p0);
    
    protected abstract void EO(final String p0);
    
    final class uK
    {
        public String dN;
        public String ld;
        
        public uK(final IW iw, final String dn, final String ld) {
            this.dN = dn;
            this.ld = ld;
        }
    }
    
    final class vd
    {
        public IW dN;
        public String ld;
        
        public vd(final IW iw, final IW dn, final String ld) {
            this.dN = dn;
            this.ld = ld;
        }
    }
}
