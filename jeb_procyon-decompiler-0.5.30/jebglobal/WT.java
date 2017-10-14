// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

final class WT implements Runnable
{
    private /* synthetic */ boolean dN;
    private /* synthetic */ QA ld;
    
    WT(final QA ld, final boolean dn) {
        this.ld = ld;
        this.dN = dn;
    }
    
    @Override
    public void run() {
        if (this.ld.wU != null) {
            this.ld.wU.run();
        }
        if (!this.ld.ld) {
            this.ld.dN.start();
        }
        this.ld.mS = TM.dN(this.ld.dN, this.ld.QE);
        (new Object[1])[0] = this.ld.mS;
        if (this.ld.fa != null) {
            this.ld.fa.run();
        }
        if (!this.dN) {
            this.ld.dN(this.ld.mS ? QA.uK.QE : QA.uK.wU);
        }
    }
}
