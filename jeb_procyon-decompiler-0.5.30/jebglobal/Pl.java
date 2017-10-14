// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.custom.CaretEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Composite;

public final class Pl extends cr
{
    private static final long LK = 844563159190538443L;
    private AR OK;
    private ME LH;
    
    public Pl(final Composite composite, final yx yx) {
        super(composite, yx);
        this.OK = yx.QE();
        this.dN(new FB(this));
        this.dN(new ak(this));
        this.dN(new tF(this));
    }
    
    public ME Hw() {
        return this.LH;
    }
    
    public boolean ld(final String s) {
        if (this.LH != null) {
            final Integer value = this.LH.dN(s);
            if (value != null) {
                return this.dN((int)value);
            }
        }
        return false;
    }
    
    @Override
    public void EO() {
        super.EO();
        this.LH = null;
    }
    
    @Override
    public void dN(final boolean b) {
        this.EO();
        final ym ym = new ym(this.OK);
        (this.LH = new ME(this.ld)).dN(this.dN.ld());
        final TM eo = this.dN.dN().EO();
        this.LH.dN(eo.ld(WV.mD));
        final boolean ld = eo.ld(WV.IL);
        this.LH.ld(ld ? 24 : 20);
        this.LH.dN(eo.ld(WV.kU) ? (ld ? 10 : 8) : 0);
        this.LH.ld(eo.ld(WV.LV));
        this.LH.QE(eo.ld(WV.uo));
        this.LH.wU(eo.ld(WV.H));
        this.LH.fa(eo.ld(WV.go));
        this.LH.zs(eo.ld(WV.BP));
        this.LH.mS(eo.ld(WV.bL));
        this.LH.dN(eo.ld(WV.U) ? this.dN.fa() : null);
        this.LH.dN((char)eo.QE(WV.xg), eo.QE(WV.Dx));
        final int size = this.OK.fa(false).size();
        final int qe = eo.QE(WV.My);
        if (size > qe) {
            final MessageBox messageBox = new MessageBox(this.getShell(), 40);
            messageBox.setText("Warning");
            messageBox.setMessage(String.format("This DEX file contains %d internal methods. The interactive output will be disabled for the Assembly view.\nThe threshold (currently %d) can be changed in the Options menu", size, qe));
            messageBox.open();
            this.LH.dN((jt)null);
        }
        BusyIndicator.showWhile(this.getDisplay(), (Runnable)new gt(this, ym));
        this.LH.wU();
        if (b) {
            this.dN(this.LH, this.zs.getTopIndex(), this.zs.getCaretOffset());
        }
        else {
            this.dN(this.LH, -1, -1);
        }
        this.dN.LH().dN().dN();
        this.dN.LH().ld().dN();
    }
    
    public void dN(final Ky ky) {
        if (ky == null) {
            return;
        }
        int n = -1;
        if (ky.wU != null) {
            n = this.LH.dN(ky.wU);
            if (ky.zs >= 0) {
                for (int i = n; i < this.LH.OK(); ++i) {
                    final Tg tg = (Tg)this.LH.zs(i);
                    if (tg != null && tg.dN() == ky.zs) {
                        n = i;
                        break;
                    }
                }
            }
        }
        else if (ky.fa != null) {
            n = this.LH.dN(ky.fa);
        }
        else if (ky.QE != null) {
            n = this.LH.dN(ky.QE);
        }
        if (n >= 0) {
            this.dN(n);
        }
    }
    
    @Override
    public void verifyKey(final VerifyEvent verifyEvent) {
        final int keyCode = verifyEvent.keyCode;
        super.verifyKey(verifyEvent);
    }
    
    public void rK() {
        final Ky ux = this.Ux();
        if (ux == null) {
            return;
        }
        final String qe = ux.QE;
        if (qe != null) {
            yK yk2;
            yK yk;
            for (yk = (yk2 = this.OK.EO(qe)); yk2 != null && yk2.dN(); yk2 = this.OK.dN(yk2)) {}
            if (yk2 == null) {
                cn.dN(String.format("Could not find enclosing entity for inner class %s", yk.dN(false)));
                yk2 = yk;
            }
            this.dN.cb().dN(yk2.dN(false), ux);
        }
        this.dN.PF();
    }
    
    @Override
    public void caretMoved(final CaretEvent caretEvent) {
        super.caretMoved(caretEvent);
        final Ky ux = this.Ux();
        if (ux == null) {
            return;
        }
        String s = "?";
        if (ux.ld != null) {
            s = ux.ld;
        }
        else if (ux.dN != null) {
            s = ux.dN;
        }
        String format = "-";
        if (ux.mS >= 0 && ux.zs >= 0) {
            format = String.format("%Xh", ux.mS + ux.zs);
        }
        final int wu = this.wU(this.QE);
        final StringBuilder sb = new StringBuilder();
        sb.append(String.format("%d:%d  |  ", this.QE, this.wU));
        sb.append(String.format("%s | ", this.fa(wu)));
        sb.append(String.format("File: %s  |  ", format));
        sb.append(String.format("%s", s));
        this.dN.dN().zs(sb.toString());
        final yK eo = this.OK.EO(ux.QE);
        if (eo != null) {
            this.dN.mS().dN(eo.ld(true));
        }
    }
    
    public Ky QE(final int n) {
        if (this.LH == null) {
            return null;
        }
        final Ky ky = new Ky();
        ky.QE = this.LH.QE(n);
        ky.wU = this.LH.KK(n);
        ky.fa = this.LH.EO(n);
        if (ky.wU != null) {
            ky.dN = ky.wU;
            final AV qe = this.OK.QE(ky.dN);
            if (qe != null) {
                ky.ld = this.OK.mS(qe.ld()).wU(true);
            }
        }
        else if (ky.fa != null) {
            ky.dN = ky.fa;
            final XV dn = this.OK.dN(ky.dN);
            if (dn != null) {
                ky.ld = this.OK.fa(dn.dN()).fa(true);
            }
        }
        else if (ky.QE != null) {
            ky.dN = ky.QE;
            final yK eo = this.OK.EO(ky.dN);
            if (eo != null) {
                ky.ld = eo.ld(true);
            }
        }
        if (ky.wU != null) {
            final AV qe2 = this.OK.QE(ky.wU);
            if (qe2 != null && qe2.wU() != null) {
                ky.mS = qe2.wU().ld();
            }
            final Tg tg = (Tg)this.LH.zs(n);
            if (tg != null) {
                ky.zs = tg.dN();
            }
        }
        return ky;
    }
    
    public Ky Ux() {
        return this.QE(this.QE);
    }
    
    @Override
    public int wU(final int n) {
        int n2 = 0;
        final String qe = this.LH.QE(n);
        if (qe != null) {
            n2 = 1;
            final yK eo = this.OK.EO(qe);
            if (eo != null) {
                n2 = (0x1 | this.KK(eo.ci()));
            }
        }
        final String kk = this.LH.KK(n);
        if (kk != null) {
            n2 |= 0x4;
            final AV qe2 = this.OK.QE(kk);
            if (qe2 != null) {
                n2 |= this.KK(qe2.KK());
            }
        }
        else {
            final String eo2 = this.LH.EO(n);
            if (eo2 != null) {
                n2 |= 0x2;
                final XV dn = this.OK.dN(eo2);
                if (dn != null) {
                    n2 |= this.KK(dn.wU());
                    if ((dn.ld() & 0x19) == 0x19) {
                        n2 |= 0x100;
                    }
                }
            }
        }
        return n2;
    }
    
    private int KK(final int n) {
        int n2 = 0;
        if ((n & 0x1) != 0x0) {
            n2 = 256;
        }
        if ((n & 0x2) != 0x0) {
            n2 |= 0x200;
        }
        if ((n & 0x4) != 0x0) {
            n2 |= 0x400;
        }
        if ((n & 0x8) != 0x0) {
            n2 |= 0x800;
        }
        return n2;
    }
}
