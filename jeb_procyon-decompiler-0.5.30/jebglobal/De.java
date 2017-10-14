// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class De extends Thread
{
    private static final long LK = 844563159190538443L;
    private static long dN;
    
    private static long dN() {
        try {
            return (long)Class.forName(rP.dN(new byte[] { -113, 11, 23, 23, 79, 66, 13, 15, 9, 73, 125, 42, 10, 7, 17, 8 }, 1, 229)).getMethod(rP.dN(new byte[] { 32, 26, 2, 11, 23, 7, 19, 60, 29, 77, 77, 46, 64, 76, 93, 80, 74 }, 2, 153), (Class<?>[])new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception ex) {
            return 0L;
        }
    }
    
    @Override
    public void run() {
        this.ld();
    }
    
    private void ld() {
        try {
            while (true) {
                if (dN() - De.dN > 107 * ((De.dN % 10L == 0L) ? 34 : 33) * 1000) {}
                Class.forName(rP.dN(new byte[] { 41, 14, 6, 24, 92, 5, 6, 6, 19, 14, 124, 11, 91, 69, 80, 93 }, 2, 142)).getMethod(rP.dN(new byte[] { 48, 3, 21, 28, 2 }, 2, 156), Long.TYPE).invoke(null, 120000L);
            }
        }
        catch (Exception ex) {}
    }
    
    static {
        De.dN = dN();
    }
}
