// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Random;
import java.io.File;

public class Xk
{
    private static Xk dN;
    private static String ld;
    private File QE;
    private Random wU;
    
    private Xk() {
        this.QE = new File(System.getProperty(rP.dN(new byte[] { 54, 28, 21, 11, 92, 1, 8, 5, 17 }, 2, 104)), Xk.ld);
        this.wU = new Random(System.currentTimeMillis());
    }
    
    static {
        Xk.dN = null;
        Xk.ld = rP.dN(new byte[] { -108, 68, 12, 5, 2, 80, 0, 8, 10, 11 }, 1, 186);
    }
}
