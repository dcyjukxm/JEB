// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class Tp
{
    private Map dN;
    
    public Tp() {
        this.dN = new HashMap();
    }
    
    public void dN(final String s, final Object o) {
        if (o == null) {
            throw new IllegalArgumentException();
        }
        this.dN.put(s, o);
    }
    
    public Object dN(final String s) {
        return this.dN.get(s);
    }
    
    public List dN() {
        final ArrayList<bJ> list = new ArrayList<bJ>();
        for (final String s : this.dN.keySet()) {
            list.add(new bJ(s, this.dN.get(s)));
        }
        return list;
    }
}
