// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.widgets.Canvas;

public final class rn extends Canvas implements MouseTrackListener, PaintListener
{
    private cr dN;
    private int ld;
    private int QE;
    private int wU;
    private int[] fa;
    private int[] zs;
    private ToolTip mS;
    
    public rn(final Composite composite) {
        super(composite, 2048);
        this.QE = -1;
        this.addPaintListener((PaintListener)this);
        this.addMouseTrackListener((MouseTrackListener)this);
    }
    
    public void dN(final cr dn) {
        (this.dN = dn).dN(new pM(this));
    }
    
    public void dN() {
        this.wU = 0;
        this.redraw();
    }
    
    public void paintControl(final PaintEvent paintEvent) {
        final Rectangle clientArea = this.getClientArea();
        final int width = clientArea.width;
        final int height = clientArea.height;
        this.ld = this.dN.Ee();
        if (this.wU != height) {
            this.wU = height;
            this.ld();
        }
        this.dN(paintEvent.gc, this.zs, width, this.ld, true);
        this.dN(paintEvent.gc, this.fa, width, this.ld, false);
    }
    
    private void ld() {
        final int n = this.wU / this.ld;
        int n2 = -2;
        this.fa = new int[n * 2 + 1];
        int n3 = -2;
        this.zs = new int[n * 2 + 1];
        for (int i = 0; i < n; ++i) {
            final int wu = this.dN.wU(this.QE + i);
            int n4 = 0;
            if ((wu & 0x1) != 0x0) {
                if ((wu & 0x800) != 0x0) {
                    n4 = 16724736;
                }
                else if ((wu & 0x200) != 0x0) {
                    n4 = 10092339;
                }
                else if ((wu & 0x400) != 0x0) {
                    n4 = 10092339;
                }
                else if ((wu & 0x4) != 0x0) {
                    n4 = 255;
                }
                else if ((wu & 0x100) != 0x0) {
                    n4 = 13408512;
                }
            }
            if (n2 < 0 || this.fa[n2 + 1] != n4) {
                n2 += 2;
                this.fa[n2] = 1;
                this.fa[n2 + 1] = n4;
            }
            else {
                final int[] fa = this.fa;
                final int n5 = n2;
                ++fa[n5];
            }
            int n6 = 0;
            if ((wu & 0x6) != 0x0) {
                if ((wu & 0x800) != 0x0) {
                    n6 = 16724736;
                }
                else if ((wu & 0x200) != 0x0) {
                    n6 = 10092339;
                }
                else if ((wu & 0x4) != 0x0) {
                    n6 = 255;
                }
                else if ((wu & 0x100) != 0x0) {
                    n6 = 13408512;
                }
            }
            if (n3 < 0 || this.zs[n3 + 1] != n6) {
                n3 += 2;
                this.zs[n3] = 1;
                this.zs[n3 + 1] = n6;
            }
            else {
                final int[] zs = this.zs;
                final int n7 = n3;
                ++zs[n7];
            }
        }
        this.fa[n2 + 2] = -1;
        this.zs[n3 + 2] = -1;
    }
    
    private void dN(final GC gc, final int[] array, final int n, final int n2, final boolean b) {
        final int n3 = b ? 0 : (n / 2);
        int n4 = 0;
        int n5 = 0;
        while (true) {
            final int n6 = array[n5];
            if (n6 < 0) {
                break;
            }
            final int n7 = n6 * n2;
            final Color dn = HC.dN().dN(array[n5 + 1]);
            gc.setForeground(dn);
            gc.setBackground(dn);
            gc.fillRectangle(n3, n4 + 2, n / 2, n7);
            n4 += n7;
            n5 += 2;
        }
    }
    
    public void mouseEnter(final MouseEvent mouseEvent) {
    }
    
    public void mouseExit(final MouseEvent mouseEvent) {
    }
    
    public void mouseHover(final MouseEvent mouseEvent) {
        if (this.mS != null) {
            this.mS.setVisible(false);
            this.mS.dispose();
        }
        (this.mS = new ToolTip(this.dN.QE().LR(), 0)).setMessage(this.dN.fa(this.dN.wU(this.QE + mouseEvent.y / this.ld)));
        this.mS.setAutoHide(true);
        this.mS.setVisible(true);
    }
}
