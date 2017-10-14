// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashMap;

final class rO implements lo
{
    private HashMap dN;
    
    rO() {
        this.dN = new HashMap();
    }
    
    @Override
    public void dN() {
        this.dN.clear();
    }
    
    @Override
    public String dN(final hV hv, final int n) {
        String s = "v" + n;
        final Integer n2 = this.dN.get(n);
        if (n2 == null) {
            this.dN.put(n, 0);
        }
        else {
            final Integer value;
            this.dN.put(n, value = n2 + 1);
            s = s + "_" + value;
        }
        return s;
    }
}
