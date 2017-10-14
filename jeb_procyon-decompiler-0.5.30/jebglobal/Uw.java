// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.File;

public final class Uw
{
    private final Qu dN;
    private vl ld;
    private File QE;
    private LP wU;
    private short fa;
    private boolean zs;
    private boolean mS;
    
    public Uw() {
        this(new Qu());
    }
    
    public Uw(final Qu dn) {
        this.fa = 257;
        this.zs = false;
        this.mS = false;
        this.dN = dn;
    }
    
    public Uw(final File file) {
        this(file, new Qu());
    }
    
    public Uw(final File file, final Qu dn) {
        this.fa = 257;
        this.zs = false;
        this.mS = false;
        this.dN = dn;
        this.dN(file);
    }
    
    public void dN(final File file) {
        this.ld = new vl(file);
        this.wU = null;
    }
    
    public void ld(final File qe) {
        this.QE = qe;
    }
    
    public void dN() {
        final File qe = this.QE();
        if (!this.zs && qe.exists()) {
            throw new ID();
        }
        if (!this.ld.isFile() || !this.ld.canRead()) {
            throw new oA();
        }
        try {
            TM.dN(qe);
        }
        catch (QO qo) {
            throw new zX(qo);
        }
        qe.mkdirs();
        switch (this.fa) {
            case 256: {
                this.dN.dN(this.ld, qe);
                break;
            }
            case 257: {
                this.dN.dN(this.ld, qe, this.ld());
                break;
            }
        }
        this.dN.ld(this.ld, qe);
    }
    
    public void dN(final short n) {
        if (n != 0 && n != 1 && n != 2) {
            throw new zX();
        }
    }
    
    public void ld(final short fa) {
        if (fa != 256 && fa != 257) {
            throw new zX();
        }
        this.fa = fa;
    }
    
    public void dN(final boolean zs) {
        this.zs = zs;
    }
    
    public LP ld() {
        if (this.wU == null) {
            Qj.dN = false;
            (this.wU = this.dN.dN(this.ld)).dN((String)null);
        }
        return this.wU;
    }
    
    private File QE() {
        if (this.QE == null) {
            throw new zX();
        }
        return this.QE;
    }
}
