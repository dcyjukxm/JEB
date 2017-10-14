// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;

public final class Dn
{
    private HashMap dN;
    private HashMap ld;
    private HashMap QE;
    private HashMap wU;
    private boolean fa;
    
    public Dn() {
        this.fa = false;
        this.dN = new HashMap();
        this.ld = new HashMap();
        this.QE = new HashMap();
        this.wU = new HashMap();
    }
    
    public void dN(final AR ar) {
        if (this.fa) {
            throw new RuntimeException();
        }
        for (final int intValue : this.QE.keySet()) {
            this.dN(ar.fa(intValue).fa(), (List)this.QE.get(intValue));
        }
        for (final int intValue2 : this.wU.keySet()) {
            final nh.vd vd = (nh.vd)ar.mS().dN(ar.mS(intValue2).zs().zs());
            if (vd != null) {
                this.dN(vd.dN(), this.wU.get(intValue2));
            }
        }
        this.fa = true;
    }
    
    public void dN(final int n, final int n2) {
        List<Integer> list = this.dN.get(n);
        if (list == null) {
            list = new ArrayList<Integer>();
            this.dN.put(n, list);
        }
        list.add(n2);
    }
    
    public void ld(final int n, final int n2) {
        List<Integer> list = this.ld.get(n);
        if (list == null) {
            list = new ArrayList<Integer>();
            this.ld.put(n, list);
        }
        list.add(n2);
    }
    
    public void dN(final int n, final List list) {
        List list2 = this.ld.get(n);
        if (list2 == null) {
            list2 = new ArrayList();
            this.ld.put(n, list2);
        }
        list2.addAll(list);
    }
    
    public void QE(final int n, final int n2) {
        List<Integer> list = this.QE.get(n);
        if (list == null) {
            list = new ArrayList<Integer>();
            this.QE.put(n, list);
        }
        list.add(n2);
    }
    
    public void wU(final int n, final int n2) {
        List<Integer> list = this.wU.get(n);
        if (list == null) {
            list = new ArrayList<Integer>();
            this.wU.put(n, list);
        }
        list.add(n2);
    }
    
    public HashMap dN() {
        return this.ld;
    }
    
    public HashMap ld() {
        return this.QE;
    }
    
    public HashMap QE() {
        return this.wU;
    }
}
