// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.HashMap;

public final class iz implements GS
{
    private HashMap dN;
    
    public iz() {
        this.dN = new HashMap();
    }
    
    public void dN(final int n, final Cs cs) {
        if (this.dN.containsKey(n)) {
            throw new RuntimeException();
        }
        this.dN.put(n, cs);
    }
    
    public int dN() {
        return this.dN.size();
    }
    
    public HashSet ld() {
        return new HashSet(this.dN.keySet());
    }
    
    public List QE() {
        return new ArrayList(new HashSet(this.dN.values()));
    }
    
    public List dN(final Cs cs) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (final int intValue : this.dN.keySet()) {
            if (((Cs)this.dN.get(intValue)).equals(cs)) {
                list.add(intValue);
            }
        }
        return list;
    }
    
    public int dN(final int n) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (final int intValue : this.dN.keySet()) {
            if (((Cs)this.dN.get(intValue)).dN() == n) {
                list.add(intValue);
            }
        }
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            this.dN.remove((int)iterator2.next());
        }
        return list.size();
    }
    
    public int dN(final int n, final int n2) {
        int n3 = 0;
        for (final int intValue : this.dN.keySet()) {
            if (((Cs)this.dN.get(intValue)).dN() == n) {
                ((Cs)this.dN.get(intValue)).dN(n2);
                ++n3;
            }
        }
        return n3;
    }
    
    @Override
    public HashSet fa() {
        return new HashSet();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("(");
        int n = 0;
        for (final int intValue : this.dN.keySet()) {
            if (n >= 1) {
                sb.append(", ");
            }
            sb.append(String.format("%d:%s", intValue, this.dN.get(intValue)));
            ++n;
        }
        sb.append(")");
        return sb.toString();
    }
}
