// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;
import org.eclipse.swt.widgets.MessageBox;

public final class FB extends as
{
    private Pl KK;
    
    public FB(final Pl kk) {
        super(kk, "Rename item");
        this.KK = kk;
        this.ld = 110;
        this.fa = HC.dN().dN("icon-letter-n.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        return this.dN(true);
    }
    
    @Override
    public boolean LH() {
        return this.dN(false);
    }
    
    private boolean dN(final boolean b) {
        final YJ ok = this.KK.OK();
        if (ok == null) {
            return false;
        }
        final Object zs = ok.zs();
        if (zs == null) {
            return false;
        }
        if (zs instanceof yK) {
            return dN(this.KK, (yK)zs, b, null);
        }
        if (zs instanceof hO) {
            return dN(this.KK, (hO)zs, b, null);
        }
        if (zs instanceof gE) {
            return dN(this.KK, (gE)zs, b, null);
        }
        if (zs instanceof bm) {
            final bm bm = (bm)zs;
            final OM om = (OM)ok.mS();
            if (om != null) {
                if (b) {
                    return true;
                }
                final int dn = om.dN();
                final int dn2 = bm.dN();
                final u dn3 = this.KK.wU().ld().dN(dn, dn2);
                final Xa xa = new Xa(this.KK.getShell(), this.KK.QE().XZ(), "Rename label", (dn3 != null && dn3.LH()) ? dn3.Hw() : OM.QE(dn2));
                xa.ld(true);
                final String dn4 = xa.dN();
                if (dn4 != null && this.KK.wU().ld().dN(u.uK.wU, dn, dn2, -1, dn4.equals("") ? null : dn4)) {
                    final u dn5 = this.KK.wU().ld().dN(dn, dn2);
                    this.KK.dN(":" + ((dn5 != null && dn5.LH()) ? dn5.Hw() : OM.QE(dn2)));
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean dN(final yn yn, final yK yk, final boolean b, String dn) {
        if (yk.ld()) {
            return false;
        }
        if (b) {
            return true;
        }
        final String qe = yk.QE(true);
        final String s = "Rename class";
        if (dn == null) {
            final Xa xa = new Xa(yn.getShell(), yn.QE().XZ(), s, qe);
            xa.ld(true);
            dn = xa.dN();
            if (dn == null) {
                return false;
            }
        }
        final TM eo = yn.QE().EO();
        final String ld = yk.ld(true);
        if (!yk.dN(dn.equals("") ? null : dn)) {
            return false;
        }
        final String ld2 = yk.ld(true);
        final String substring = ld2.substring(1, ld2.length() - 1);
        final String substring2 = substring.substring(substring.lastIndexOf(47) + 1);
        if (yn instanceof Pl) {
            yn.dN(eo.ld(WV.bL) ? ld2 : substring2);
        }
        else {
            yn.dN(yk.QE(true));
        }
        if (!yn.wU().mS().dN(ld, ld2, substring2)) {
            yn.wU().mS().KK();
        }
        yn.wU().ld().dN(u.uK.dN, yk.zs(), -1, -1, dn);
        return true;
    }
    
    public static boolean dN(final yn yn, final hO ho, final boolean b, String dn) {
        final AV ld = ho.ld();
        if (ld == null || ld.fa()) {
            return false;
        }
        if (b) {
            return true;
        }
        final String ld2 = ho.ld(true);
        final String s = "Rename method";
        if (dn == null) {
            final Xa xa = new Xa(yn.getShell(), yn.QE().XZ(), s, ld2);
            xa.ld(true);
            dn = xa.dN();
            if (dn == null) {
                return false;
            }
        }
        final AR qe = yn.wU().QE();
        final List dn2 = new Cx(qe).dN(ho);
        final int dn3 = ho.dN();
        final int size = dn2.size();
        if (size <= 0 || !dn2.contains(dn3)) {
            return false;
        }
        final Iterator<Integer> iterator = dn2.iterator();
        while (iterator.hasNext()) {
            if (!qe.mS(iterator.next()).dN(dn.equals("") ? null : dn)) {
                return false;
            }
        }
        ho.ld(dn.equals("") ? null : dn);
        yn.wU().ld().dN(u.uK.ld, dn3, -1, -1, dn);
        yn.dN(ho.ld(true));
        boolean b2 = false;
        if (size >= 2) {
            final MessageBox messageBox = new MessageBox(yn.getShell(), 194);
            messageBox.setText("Confirmation");
            messageBox.setMessage(String.format("To maintain consistency, %d overrides or superclass methods should also be renamed.\nRename these extra items? (If yes, a manual refresh of the view is required.)", size - 1));
            if (messageBox.open() == 64) {
                b2 = true;
            }
        }
        if (b2) {
            for (final int intValue : dn2) {
                if (intValue == dn3) {
                    continue;
                }
                final hO ms = qe.mS(intValue);
                ms.ld(dn.equals("") ? null : dn);
                yn.wU().ld().dN(u.uK.ld, ms.dN(), -1, -1, dn);
            }
        }
        return true;
    }
    
    public static boolean dN(final yn yn, final gE ge, final boolean b, String dn) {
        final XV ld = ge.ld();
        if (ld == null) {
            return false;
        }
        if (b) {
            return true;
        }
        final String qe = ge.QE(true);
        final String s = "Rename field";
        if (dn == null) {
            final Xa xa = new Xa(yn.getShell(), yn.QE().XZ(), s, qe);
            xa.ld(true);
            dn = xa.dN();
            if (dn == null) {
                return false;
            }
        }
        if (!ge.dN(dn.equals("") ? null : dn)) {
            return false;
        }
        yn.dN(ge.QE(true));
        yn.wU().ld().dN(u.uK.QE, ld.dN(), -1, -1, dn);
        return true;
    }
}
