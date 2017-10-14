// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.HashSet;

public final class Dm extends tu
{
    private YK ld;
    private hV QE;
    
    public Dm(final YK ld, final hV qe) {
        this.ld = ld;
        this.QE = qe;
        this.dN = hV.dN;
    }
    
    @Override
    public HashSet fa() {
        return new HashSet();
    }
    
    @Override
    hV dN(final int n) {
        return hV.dN;
    }
    
    @Override
    boolean dN(final int n, final hV hv) {
        return false;
    }
    
    public boolean ld() {
        return false;
    }
    
    public boolean QE() {
        return false;
    }
    
    @Override
    int dN(final xy xy) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final tu tu) {
        return 0;
    }
    
    @Override
    int dN(final xy xy, final long n) {
        return 0;
    }
    
    @Override
    void dN(final hV hv, final hV hv2) {
        super.dN(hv, hv2);
    }
    
    @Override
    public List wU() {
        return ZF.dN(new tu[0]);
    }
    
    @Override
    public boolean dN(final tu tu, final tu tu2) {
        return false;
    }
    
    @Override
    public String toString() {
        if (this.QE == null) {
            return String.format("<%s>", this.ld);
        }
        return String.format("<%s>", this.QE);
    }
    
    public Xf dN(final TB tb) {
        return new Vf(this.QE);
    }
}
