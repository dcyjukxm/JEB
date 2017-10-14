// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.HashSet;

public final class fZ
{
    private long dN;
    private long ld;
    private long QE;
    private HashSet wU;
    
    public fZ(final long dn) {
        this.dN = dn;
        System.currentTimeMillis();
        this.ld = 0L;
        this.QE = 0L;
        this.wU = new HashSet();
    }
    
    public synchronized long dN() {
        return this.dN;
    }
    
    public synchronized int ld() {
        return this.wU.size();
    }
    
    public synchronized void dN(final long n) {
        this.wU.add(n);
    }
    
    public synchronized boolean ld(final long n) {
        return this.wU.remove(n);
    }
    
    public synchronized long QE() {
        return this.ld;
    }
    
    public synchronized void wU() {
        this.ld = System.currentTimeMillis();
        ++this.QE;
    }
    
    public synchronized void QE(final long n) {
        this.dN(n);
        this.wU();
    }
}
