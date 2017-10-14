// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.List;
import java.util.ArrayList;

public final class lM
{
    private hV dN;
    private ArrayList ld;
    
    public lM(final hV dn) {
        this.dN = dn;
        this.ld = new ArrayList();
    }
    
    public void dN(final OX ox, final Xf xf) {
        this.ld.add(new uK(ox, xf));
    }
    
    public hV dN() {
        return this.dN;
    }
    
    public List ld() {
        return this.ld;
    }
    
    public static final class uK
    {
        private OX dN;
        private Xf ld;
        
        public uK(final OX dn, final Xf ld) {
            this.dN = dn;
            this.ld = ld;
        }
        
        public OX dN() {
            return this.dN;
        }
        
        public Xf ld() {
            return this.ld;
        }
    }
}
