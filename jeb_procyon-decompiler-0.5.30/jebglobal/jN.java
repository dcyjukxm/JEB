// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public class jN extends Thread
{
    private int dN;
    
    public jN(int dn) {
        if (dn < 0) {
            dn = 0;
        }
        this.dN = dn;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(this.dN * 1000);
        }
        catch (InterruptedException ex) {}
    }
}
