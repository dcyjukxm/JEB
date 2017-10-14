// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.swt.widgets.MessageBox;

public final class aJ extends as
{
    public aJ(final yn yn) {
        super(yn, "Cross-references");
        this.ld = 120;
        this.fa = HC.dN().dN("icon-letter-x.png");
        this.OK = true;
    }
    
    @Override
    public boolean OK() {
        final YJ ok = this.dN.OK();
        return ok != null && this.dN.ld(ok) != null;
    }
    
    @Override
    public boolean LH() {
        final YJ ok = this.dN.OK();
        if (ok == null) {
            return false;
        }
        final List ld = this.dN.ld(ok);
        if (ld == null) {
            return false;
        }
        final int qe = this.dN.QE().EO().QE(WV.vW);
        final int size = ld.size();
        if (qe > 0 && size >= qe) {
            final MessageBox messageBox = new MessageBox(this.dN.getShell(), 200);
            messageBox.setText("Confirmation");
            messageBox.setMessage(String.format("%d visual cross-references are about to be displayed.\nThis may take a while. Proceed?", size));
            if (messageBox.open() == 128) {
                return false;
            }
        }
        final ArrayList list = new ArrayList<Object>(ld.size());
        int n = 0;
        int n2 = 0;
        for (final LW lw : ld) {
            final int dn = lw.dN();
            String s = null;
            if (this.dN instanceof Pl) {
                final Ky qe2 = ((Pl)this.dN).QE(dn);
                if (qe2 != null) {
                    if (qe2.ld != null) {
                        s = qe2.ld;
                    }
                    else if (qe2.dN != null) {
                        s = qe2.dN;
                    }
                }
            }
            if (s == null) {
                s = this.dN.mS(dn);
            }
            list.add(new Ss.uK(this.dN.OK(dn) + lw.ld(), dn, s));
            if (lw.QE() == ok) {
                n2 = n;
            }
            ++n;
        }
        final int intValue = new Ss(this.dN.getShell(), this.dN.QE().EO().QE(WV.nA), list, n2, "Cross references (visual)", "Line #", "Information").dN();
        if (intValue >= 0) {
            this.dN.ld(((Ss.uK)list.get(intValue)).dN);
        }
        return true;
    }
}
