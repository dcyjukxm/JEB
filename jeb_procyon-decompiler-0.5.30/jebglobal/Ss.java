// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.GridLayout;
import java.util.Iterator;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Shell;
import java.util.List;

public final class Ss extends fL
{
    private static int dN;
    private int ld;
    private int QE;
    private String[] wU;
    private List fa;
    private Integer zs;
    private lF mS;
    
    public Ss(final Shell shell, final int n, final List list, final int qe, final String s, final String s2, final String s3) {
        super(shell, s, 67696);
        this.zs = -1;
        this.ld = ((n >= 1) ? n : Ss.dN);
        this.QE = qe;
        this.wU = new String[] { s2, s3 };
        this.fa = new ArrayList(list.size());
        for (final uK uk : list) {
            this.fa.add(new String[] { Integer.toString(uk.ld), uk.QE });
        }
    }
    
    public Integer dN() {
        super.ld();
        return this.zs;
    }
    
    public void dN(final Shell shell) {
        shell.setLayout((Layout)new GridLayout(1, false));
        this.mS = new lF((Composite)shell, true, this.wU, this.fa, this.QE);
        final Point point = new Point(shell.getClientArea().width, shell.getClientArea().height);
        final Point computeSize = this.mS.computeSize(-1, -1);
        final GridData layoutData = new GridData(4, 4, true, true);
        if (computeSize.x > point.x) {
            layoutData.widthHint = point.x;
        }
        if (this.ld >= 0) {
            layoutData.heightHint = (this.ld + 1) * this.mS.wU();
            if (layoutData.heightHint > point.y) {
                layoutData.heightHint = point.y;
            }
        }
        else if (computeSize.y > point.y) {
            layoutData.heightHint = point.y;
        }
        this.mS.setLayoutData((Object)layoutData);
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new RowLayout(256));
        final Button dn = TM.dN(composite, "OK", (SelectionListener)new vU(this, shell));
        TM.dN(composite, "Cancel", (SelectionListener)new Do(this, shell));
        shell.setDefaultButton(dn);
        this.mS.dN((SelectionListener)new yA(this, shell));
    }
    
    static {
        Ss.dN = 8;
    }
    
    public static final class uK
    {
        public int dN;
        public int ld;
        public String QE;
        
        public uK(final int dn, final int ld, final String qe) {
            this.dN = dn;
            this.ld = ld;
            this.QE = qe;
        }
    }
}
