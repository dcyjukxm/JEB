// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.List;

public final class oV
{
    private List dN;
    private int ld;
    
    public oV() {
        this.dN = new ArrayList();
        this.ld = 0;
    }
    
    public int dN() {
        return this.dN.size();
    }
    
    public int ld() {
        return this.ld;
    }
    
    public void dN(final Object o) {
        while (this.ld < this.dN.size()) {
            this.dN.remove(this.ld);
        }
        this.dN.add(o);
        ++this.ld;
    }
    
    public Object ld(final Object o) {
        if (this.ld == 0) {
            return null;
        }
        --this.ld;
        final Object value = this.dN.get(this.ld);
        if (o != null) {
            this.dN.set(this.ld, o);
        }
        return value;
    }
    
    public Object QE(final Object o) {
        if (this.ld == this.dN.size()) {
            return null;
        }
        final Object value = this.dN.get(this.ld);
        if (o != null) {
            this.dN.set(this.ld, o);
        }
        ++this.ld;
        return value;
    }
    
    public boolean QE() {
        return this.ld > 0;
    }
    
    public boolean wU() {
        return this.ld < this.dN.size();
    }
    
    @Override
    public String toString() {
        return String.format("size=%d pos=%d", this.dN(), this.ld());
    }
}
