// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class eY
{
    int dN;
    List ld;
    List QE;
    List wU;
    List fa;
    Object zs;
    HashSet mS;
    List OK;
    List LH;
    
    eY(final int dn) {
        this.dN = -1;
        this.ld = new ArrayList();
        this.QE = new ArrayList();
        this.wU = new ArrayList();
        this.fa = new ArrayList();
        this.zs = null;
        this.mS = new HashSet();
        this.OK = new ArrayList();
        this.LH = new ArrayList();
        if (dn <= 0) {
            throw new IllegalArgumentException();
        }
        this.dN = dn;
    }
    
    List dN() {
        final ArrayList list = new ArrayList(this.QE);
        list.addAll(this.fa);
        return list;
    }
    
    List ld() {
        final ArrayList list = new ArrayList(this.ld);
        list.addAll(this.wU);
        return list;
    }
    
    int QE() {
        return this.QE.size() + this.fa.size();
    }
}
