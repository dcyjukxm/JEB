// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public final class JP
{
    public List dN;
    
    public JP() {
        this.dN = new ArrayList();
    }
    
    public int dN() {
        return this.dN.size();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        final Iterator<List<?>> iterator = this.dN.iterator();
        while (iterator.hasNext()) {
            sb.append(String.format("%d=%s ", n, iterator.next()));
            ++n;
        }
        return sb.toString();
    }
}
