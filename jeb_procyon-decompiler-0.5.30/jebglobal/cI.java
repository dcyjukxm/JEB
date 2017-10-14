// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;

public abstract class cI implements IK
{
    private Tp dN;
    
    public cI() {
        this.dN = null;
    }
    
    public Tp dN() {
        if (this.dN == null) {
            this.dN = new Tp();
        }
        return this.dN;
    }
    
    public void a_(final ZL zl) {
        if (this.dN != null) {
            final Iterator<bJ> iterator = this.dN.dN().iterator();
            while (iterator.hasNext()) {
                zl.dN(iterator.next());
            }
        }
    }
}
