// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class Uk
{
    private XV[] dN;
    private XV[] ld;
    private AV[] QE;
    private AV[] wU;
    
    Uk(final XV[] dn, final XV[] ld, final AV[] qe, final AV[] wu) {
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
    }
    
    public List dN() {
        return new ArrayList(Arrays.asList(this.dN));
    }
    
    public List ld() {
        return new ArrayList(Arrays.asList(this.ld));
    }
    
    public List QE() {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(this.dN));
        list.addAll(Arrays.asList(this.ld));
        return list;
    }
    
    public List wU() {
        return new ArrayList(Arrays.asList(this.QE));
    }
    
    public List fa() {
        return new ArrayList(Arrays.asList(this.wU));
    }
    
    public List zs() {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(this.QE));
        list.addAll(Arrays.asList(this.wU));
        return list;
    }
}
