// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.List;

public final class Js
{
    public List dN;
    public List ld;
    public List QE;
    
    public Js() {
        this.dN = new ArrayList();
        this.ld = new ArrayList();
        this.QE = new ArrayList();
    }
    
    @Override
    public String toString() {
        return String.format("(cnt=%d, dstoff=%s, idstoff=%s)", this.dN.size(), this.ld, this.QE);
    }
}
