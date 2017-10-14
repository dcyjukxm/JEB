// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class fO
{
    private static final long LK = 844563159190538443L;
    private static Vm dN;
    private static Thread ld;
    private static Thread QE;
    
    public static void dN(final Vm dn) {
        if (fO.dN != null) {
            throw new RuntimeException();
        }
        fO.dN = dn;
    }
    
    public static synchronized void dN() {
        if (fO.ld == null) {
            (fO.ld = new De()).setDaemon(true);
            fO.ld.start();
        }
    }
    
    public static synchronized void ld() {
        if (fO.QE == null) {
            (fO.QE = new jN(120)).start();
        }
    }
    
    public static synchronized void QE() {
        if (fO.QE != null) {
            fO.QE.interrupt();
            try {
                fO.QE.join(5000L);
            }
            catch (InterruptedException ex) {
                return;
            }
            fO.QE = null;
        }
    }
}
