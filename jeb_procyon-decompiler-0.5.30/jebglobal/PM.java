// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.FontMetrics;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;

public final class PM extends fL
{
    private Font dN;
    private ew ld;
    
    public PM(final Shell shell, final Font dn, final ew ld) {
        super(shell, "Properties");
        this.dN = dn;
        this.ld = ld;
    }
    
    @Override
    protected void dN(final Shell shell) {
        shell.setLayout((Layout)new GridLayout(1, false));
        final lW lw = new lW((Composite)shell, this.dN, false);
        final GC gc = new GC((Drawable)lw);
        GridData layoutData;
        try {
            gc.setFont(lw.getFont());
            final FontMetrics fontMetrics = gc.getFontMetrics();
            layoutData = new GridData(120 * fontMetrics.getAverageCharWidth(), 20 * fontMetrics.getHeight());
        }
        finally {
            gc.dispose();
        }
        lw.setLayoutData((Object)layoutData);
        final StringBuilder sb = new StringBuilder();
        sb.append("> File properties\n");
        final k qe = this.ld.QE();
        sb.append(String.format("Original path: %s\n", qe.LH()));
        sb.append(String.format("MD5: %s\n", ZF.ld(qe.KK())));
        sb.append(String.format("SHA-1: %s\n", ZF.ld(qe.EO())));
        sb.append(String.format("SHA-256: %s\n", ZF.ld(qe.cb())));
        sb.append("\n");
        sb.append("> Analysts\n");
        for (int i = 0; i < this.ld.fa(); ++i) {
            final kM dn = this.ld.dN(i);
            sb.append(String.format("%s (%s)\n", dn.LH(), dn.KK()));
        }
        sb.append("\n");
        sb.append("> Version\n");
        final Ji wu = this.ld.wU();
        sb.append(String.format("%d.%d.%d\n", wu.LH(), wu.KK(), wu.EO()));
        lw.QE(sb.toString());
    }
}
