// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class QA
{
    private Thread dN;
    private boolean ld;
    private Xp QE;
    private Runnable wU;
    private Runnable fa;
    private uK zs;
    private boolean mS;
    
    public QA(final Thread dn, final boolean ld, final Xp qe, final Runnable wu, final Runnable fa) {
        if (dn == null || qe == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = ld;
        this.QE = qe;
        this.wU = wu;
        this.fa = fa;
        this.zs = uK.dN;
    }
    
    public synchronized uK dN() {
        return this.zs;
    }
    
    private synchronized void dN(final uK zs) {
        this.zs = zs;
    }
    
    public synchronized boolean ld() {
        return this.zs == uK.QE || this.zs == uK.wU;
    }
    
    public synchronized Thread dN(final boolean b) {
        if (this.zs != uK.dN) {
            throw new RuntimeException();
        }
        this.dN(uK.ld);
        final Thread ld = TM.ld(new WT(this, b));
        if (b) {
            try {
                ld.join();
                this.dN(this.mS ? uK.QE : uK.wU);
            }
            catch (InterruptedException ex) {
                this.dN(uK.wU);
            }
        }
        return ld;
    }
    
    public enum uK
    {
        dN("READY", 0), 
        ld("MONITORING", 1), 
        QE("DONE", 2), 
        wU("ERROR", 3);
        
        private uK(final String s, final int n) {
        }
    }
}
