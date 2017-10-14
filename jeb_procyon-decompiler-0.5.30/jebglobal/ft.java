// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class ft
{
    List dN;
    List ld;
    List QE;
    List wU;
    List fa;
    List zs;
    List mS;
    
    public ft() {
        this.dN = new ArrayList();
        this.ld = new ArrayList();
        this.QE = new ArrayList();
        this.wU = new ArrayList();
        this.fa = new ArrayList();
        this.zs = new ArrayList();
        this.mS = new ArrayList();
    }
    
    public int dN() {
        return this.dN.size();
    }
    
    public boolean ld() {
        return this.dN.isEmpty();
    }
    
    public bm dN(final int n) {
        return this.dN.get(n);
    }
    
    public bm QE() {
        return this.dN.get(this.dN.size() - 1);
    }
    
    public List wU() {
        return new ArrayList(this.dN);
    }
    
    public boolean ld(final int n) {
        this.dN.remove(n);
        if (!this.dN.isEmpty()) {
            return false;
        }
        if (this.KK() != 1) {
            throw new RuntimeException();
        }
        return true;
    }
    
    public void dN(final bm bm) {
        this.dN.add(bm);
    }
    
    public int fa() {
        return this.wU.size();
    }
    
    public int zs() {
        return this.zs.size();
    }
    
    public int mS() {
        return this.wU.size() + this.zs.size();
    }
    
    public List OK() {
        return new ArrayList(this.wU);
    }
    
    public List LH() {
        final ArrayList list = new ArrayList(this.wU);
        list.addAll(this.zs);
        return list;
    }
    
    public int KK() {
        return this.fa.size();
    }
    
    public int EO() {
        return this.mS.size();
    }
    
    public int cb() {
        return this.fa.size() + this.mS.size();
    }
    
    public ft QE(final int n) {
        return this.fa.get(n);
    }
    
    public List PF() {
        return new ArrayList(this.fa);
    }
    
    public List Hw() {
        return new ArrayList(this.mS);
    }
    
    public List rK() {
        final ArrayList list = new ArrayList(this.fa);
        list.addAll(this.mS);
        return list;
    }
    
    public boolean Ux() {
        if (this.fa.size() > 0 && this.wU.size() > 0) {
            final Iterator<ft> iterator = this.fa.iterator();
            while (iterator.hasNext()) {
                if (this.wU.contains(iterator.next())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        if (this.dN.size() == 0) {
            return "(Empty block)";
        }
        return String.format("(%X-%X,%d)", this.dN.get(0).dN(), this.dN.get(this.dN.size() - 1).dN(), this.dN.size());
    }
}
