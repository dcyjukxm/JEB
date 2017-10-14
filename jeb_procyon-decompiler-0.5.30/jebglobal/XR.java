// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

public final class XR implements KT, Xp
{
    private yx dN;
    private Rg ld;
    private String QE;
    private ZL wU;
    private GE fa;
    private long zs;
    
    public XR(final yx dn) {
        this.zs = 0L;
        if (dn == null) {
            throw new RuntimeException();
        }
        this.dN = dn;
        this.ld = dn.wU();
    }
    
    public void dN(final String qe, final ZL wu) {
        this.QE = qe;
        this.wU = wu;
        this.dN.dN().dN(wu);
    }
    
    public void dN() {
        if (this.QE == null) {
            return;
        }
        this.fa = new GE(this.dN.getShell(), this, "Decompilation", "Press the button below to interrupt the decompilation...");
        this.ld.dN(this);
        final QA qa = new QA(TM.ld(new nO(this)), true, this, null, new BP(this));
        qa.dN(false);
        if (this.fa.dN()) {
            cn.dN("The decompilation was interrupted by the user");
        }
        while (!qa.ld()) {
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException ex) {}
        }
        if (qa.dN() != QA.uK.QE) {
            cn.dN("An error occurred, the decompilation could not be terminated");
        }
        this.ld.ld(this);
        this.fa = null;
    }
    
    @Override
    public synchronized long De() {
        return this.zs;
    }
    
    @Override
    public synchronized void ld(final long zs) {
        this.zs = zs;
    }
    
    @Override
    public void dN(final uK uk) {
        switch (XR$1.dN[uk.dN.ordinal()]) {
            case 1: {
                cn.dN(String.format("Decompiling class %s", uk.ld));
                break;
            }
            case 2: {
                cn.dN(String.format("Decompiling method %s", uk.ld));
            }
            case 3: {}
            case 4: {}
            case 5: {}
            case 7: {
                (new Object[1])[0] = uk.ld;
                break;
            }
            case 8: {
                (new Object[1])[0] = uk.ld;
                break;
            }
        }
    }
}
