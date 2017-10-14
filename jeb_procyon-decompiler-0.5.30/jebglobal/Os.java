// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.events.TraverseEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.widgets.Composite;
import java.util.HashMap;

public final class Os extends cr
{
    private static final long LK = 844563159190538443L;
    private AR OK;
    private ZL LH;
    private String KK;
    private Ky EO;
    private oV cb;
    private HashMap PF;
    
    public Os(final Composite composite, final yx yx) {
        super(composite, yx);
        this.cb = new oV();
        this.PF = new HashMap();
        this.OK = yx.QE();
        this.dN(new gv(this));
        this.dN(new qO(this));
        this.dN(new vL(this));
        this.dN(new of(this));
        this.dN(new RL(this));
    }
    
    public ZL Hw() {
        return this.LH;
    }
    
    public String rK() {
        return this.KK;
    }
    
    @Override
    public void dN(final boolean b) {
        this.EO();
        if (this.KK == null) {
            return;
        }
        final yK eo = this.OK.EO(this.KK);
        if (eo == null) {
            return;
        }
        this.KK = eo.ld(false);
        this.LH = new ZL(this.ld);
        final XR xr = new XR(this.dN);
        xr.dN(this.KK, this.LH);
        xr.dN();
        this.LH.wU();
        this.fa = this.PF.get(this.KK);
        if (this.fa == null) {
            this.fa = new oV();
            this.PF.put(this.KK, this.fa);
        }
        int n = 0;
        if (this.EO != null) {
            hY hy = null;
            int n2 = -1;
            int zs = -1;
            if (this.EO.wU != null) {
                if (this.OK.QE(this.EO.wU) != null) {
                    n2 = this.OK.QE(this.EO.wU).ld();
                    hy = hY.ld;
                    zs = this.EO.zs;
                }
            }
            else if (this.EO.fa != null) {
                if (this.OK.dN(this.EO.fa) != null) {
                    n2 = this.OK.dN(this.EO.fa).dN();
                    hy = hY.QE;
                }
            }
            else if (this.EO.QE != null && this.OK.EO(this.EO.QE) != null) {
                n2 = this.OK.EO(this.EO.QE).zs();
                hy = hY.dN;
            }
            if (hy != null) {
                int abs = Integer.MAX_VALUE;
                for (int i = 0; i < this.LH.OK(); ++i) {
                    final PL pl = (PL)this.LH.zs(i);
                    if (pl != null && pl.dN() == hy && pl.ld() == n2) {
                        if (hy != hY.ld || zs < 0) {
                            n = i;
                            break;
                        }
                        final int n3 = pl.QE() - zs;
                        if (Math.abs(n3) < abs) {
                            abs = Math.abs(n3);
                            n = i;
                        }
                        if (n3 >= 0) {
                            break;
                        }
                    }
                }
            }
            this.EO = null;
        }
        if (b) {
            this.dN(this.LH, this.zs.getTopIndex(), this.zs.getCaretOffset());
        }
        else {
            this.dN(this.LH, n, -1);
        }
    }
    
    public void dN(final String s, final Ky ky) {
        this.dN(s, ky, true);
    }
    
    public void dN(final String kk, final Ky eo, final boolean b) {
        if (b && this.KK != null) {
            this.cb.dN(this.KK);
            this.fa.dN(new LW(this.QE, this.wU));
        }
        this.KK = kk;
        this.EO = eo;
        this.dN(false);
    }
    
    public oV Ux() {
        return this.cb;
    }
    
    @Override
    public void verifyKey(final VerifyEvent verifyEvent) {
        final int keyCode = verifyEvent.keyCode;
        super.verifyKey(verifyEvent);
    }
    
    @Override
    public void keyTraversed(final TraverseEvent traverseEvent) {
        if (traverseEvent.detail == 16) {
            final Ky zy = this.ZY();
            if (zy != null) {
                this.dN.OK().dN(zy);
            }
            this.dN.EO();
            traverseEvent.doit = true;
        }
    }
    
    @Override
    public void caretMoved(final CaretEvent caretEvent) {
        super.caretMoved(caretEvent);
        final Ky zy = this.ZY();
        if (zy == null) {
            return;
        }
        String s = "?";
        if (zy.ld != null) {
            s = zy.ld;
        }
        else if (zy.dN != null) {
            s = zy.dN;
        }
        this.dN.dN().zs("" + String.format("%d:%d  |  %s", this.QE, this.wU, s) + String.format("  |  %X", zy.zs));
        final yK eo = this.OK.EO(zy.QE);
        if (eo != null) {
            this.dN.mS().dN(eo.ld(true));
        }
    }
    
    public Ky QE(final int n) {
        if (this.LH == null) {
            return null;
        }
        final PL pl = (PL)this.LH.zs(n);
        if (pl == null) {
            return null;
        }
        final Ky ky = new Ky();
        final int ld = pl.ld();
        switch (Os$1.dN[pl.dN().ordinal()]) {
            case 1: {
                ky.QE = this.OK.QE(ld).dN(false);
                ky.dN = ky.QE;
                final yK eo = this.OK.EO(ky.dN);
                if (eo != null) {
                    ky.ld = eo.ld(true);
                    break;
                }
                break;
            }
            case 2: {
                ky.fa = this.OK.fa(ld).fa(false);
                ky.dN = ky.fa;
                final XV dn = this.OK.dN(ky.dN);
                if (dn != null) {
                    ky.ld = this.OK.fa(dn.dN()).fa(true);
                    break;
                }
                break;
            }
            case 3: {
                ky.wU = this.OK.mS(ld).wU(false);
                ky.dN = ky.wU;
                final AV qe = this.OK.QE(ky.dN);
                if (qe != null) {
                    ky.ld = this.OK.mS(qe.ld()).wU(true);
                    break;
                }
                break;
            }
        }
        ky.zs = pl.QE();
        if (ky.wU != null) {
            final AV qe2 = this.OK.QE(ky.wU);
            if (qe2 != null && qe2.wU() != null) {
                ky.mS = qe2.wU().ld();
            }
        }
        return ky;
    }
    
    public Ky ZY() {
        return this.QE(this.QE);
    }
    
    @Override
    public int wU(final int n) {
        return 0;
    }
}
