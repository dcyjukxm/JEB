// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.HashMap;

public class Am implements Runnable
{
    private static final long LK = 844563159190538443L;
    private HashMap dN;
    private int ld;
    private static long QE;
    private static long wU;
    
    public Am() {
        this.dN = new HashMap();
        this.ld = 1;
        cn.dN(String.format(rP.dN(new byte[] { 13, 0, 4, 28, 72, 73, 66, 12, 84, 67, 68, 10, 76, 78, 69, 17, 74, 26, 12, 77, 83, 73, 17, 64, 69, 77, 58, 30, 21, 2, 2, 0, 79, 20, 29, 8, 86, 79, 17, 79, 7, 26, 22, 67, 21, 70, 18, 6, 76, 29, 9, 29, 22, 83, 77, 79, 47, 24, 30, 79, 30, 5, 2, 26, 84, 26, 78, 1, 17, 18, 11, 17, 19 }, 2, 70), this.ld));
    }
    
    @Override
    public void run() {
        while (true) {
            this.ld();
            try {
                Thread.sleep(Am.QE);
            }
            catch (InterruptedException ex) {}
        }
    }
    
    private synchronized int ld() {
        int n = 0;
        final long currentTimeMillis = System.currentTimeMillis();
        for (final fZ fz : this.dN.values()) {
            if (currentTimeMillis - fz.QE() >= Am.wU && this.dN.remove(fz.dN()) != null) {
                ++n;
            }
        }
        return n;
    }
    
    public synchronized boolean dN(final long n, final long n2) {
        fZ fz = this.dN.get(n);
        if (fz == null) {
            if (this.dN.size() >= this.ld) {
                return false;
            }
            fz = new fZ(n);
            this.dN.put(n, fz);
        }
        fz.QE(n2);
        return true;
    }
    
    public synchronized boolean ld(final long n, final long n2) {
        final fZ fz = this.dN.get(n);
        if (fz != null) {
            fz.ld(n2);
            if (fz.ld() == 0 && this.dN.remove(n) != null) {
                return true;
            }
        }
        return false;
    }
    
    public synchronized uK dN() {
        final uK uk = new uK();
        uk.dN = this.ld;
        uk.ld = this.dN.size();
        return uk;
    }
    
    static {
        Am.QE = 3000L;
        Am.wU = 10000L;
    }
    
    public static final class uK
    {
        private int dN;
        private int ld;
        
        public int dN() {
            return this.dN;
        }
        
        public int ld() {
            return this.ld;
        }
    }
}
