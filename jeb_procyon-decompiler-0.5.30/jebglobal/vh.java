// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolTip;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.MouseTrackListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Canvas;

public final class vh extends Canvas implements MouseListener, MouseMoveListener, MouseTrackListener, PaintListener
{
    private cr dN;
    private int ld;
    private boolean QE;
    private boolean wU;
    private int fa;
    private int[] zs;
    private int[] mS;
    private ToolTip OK;
    
    public vh(final Composite composite) {
        super(composite, 2048);
        this.ld = -1;
        this.addPaintListener((PaintListener)this);
        this.addMouseListener((MouseListener)this);
        this.addMouseMoveListener((MouseMoveListener)this);
        this.addMouseTrackListener((MouseTrackListener)this);
    }
    
    public void dN(final cr dn) {
        (this.dN = dn).dN(new Ns(this));
    }
    
    public void dN() {
        this.fa = 0;
        this.redraw();
    }
    
    public void paintControl(final PaintEvent paintEvent) {
        final Rectangle clientArea = this.getClientArea();
        final int width = clientArea.width;
        final int height = clientArea.height;
        if (!this.wU && this.fa != width) {
            this.fa = width;
            this.ld();
        }
        this.dN(paintEvent.gc, this.mS, height, true);
        this.dN(paintEvent.gc, this.zs, height, false);
        if (this.ld >= 0 && this.ld < width) {
            final Color dn = HC.dN().dN(16776960);
            paintEvent.gc.setForeground(dn);
            paintEvent.gc.setBackground(dn);
            paintEvent.gc.fillPolygon(new int[] { this.ld - 5, height, this.ld + 5, height, this.ld, height - 7 });
        }
    }
    
    private void ld() {
        final int fa = this.fa;
        final int bq = this.dN.BQ();
        int n = -2;
        this.zs = new int[fa * 2 + 1];
        int n2 = -2;
        this.mS = new int[fa * 2 + 1];
        for (int i = 0; i < fa; ++i) {
            final int wu = this.dN.wU(i * bq / fa);
            int n3 = 0;
            if ((wu & 0x1) != 0x0) {
                if ((wu & 0x800) != 0x0) {
                    n3 = 16724736;
                }
                else if ((wu & 0x200) != 0x0) {
                    n3 = 10092339;
                }
                else if ((wu & 0x400) != 0x0) {
                    n3 = 10092339;
                }
                else if ((wu & 0x4) != 0x0) {
                    n3 = 255;
                }
                else if ((wu & 0x100) != 0x0) {
                    n3 = 13408512;
                }
            }
            if (n < 0 || this.zs[n + 1] != n3) {
                n += 2;
                this.zs[n] = 1;
                this.zs[n + 1] = n3;
            }
            else {
                final int[] zs = this.zs;
                final int n4 = n;
                ++zs[n4];
            }
            int n5 = 0;
            if ((wu & 0x6) != 0x0) {
                if ((wu & 0x800) != 0x0) {
                    n5 = 16724736;
                }
                else if ((wu & 0x200) != 0x0) {
                    n5 = 10092339;
                }
                else if ((wu & 0x4) != 0x0) {
                    n5 = 255;
                }
                else if ((wu & 0x100) != 0x0) {
                    n5 = 13408512;
                }
            }
            if (n2 < 0 || this.mS[n2 + 1] != n5) {
                n2 += 2;
                this.mS[n2] = 1;
                this.mS[n2 + 1] = n5;
            }
            else {
                final int[] ms = this.mS;
                final int n6 = n2;
                ++ms[n6];
            }
        }
        this.zs[n + 2] = -1;
        this.mS[n2 + 2] = -1;
    }
    
    private void dN(final GC gc, final int[] array, final int n, final boolean b) {
        final int n2 = b ? 0 : (n / 2);
        final int n3 = b ? (n / 2) : n;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            final int n6 = array[n5];
            if (n6 < 0) {
                break;
            }
            final Color dn = HC.dN().dN(array[n5 + 1]);
            gc.setForeground(dn);
            if (n6 == 1) {
                gc.drawLine(n4, n2, n4, n3);
                ++n4;
            }
            else {
                gc.setBackground(dn);
                gc.fillRectangle(n4, n2, n6, n / 2);
                n4 += n6;
            }
            n5 += 2;
        }
    }
    
    public void mouseDoubleClick(final MouseEvent mouseEvent) {
    }
    
    public void mouseDown(final MouseEvent mouseEvent) {
        this.QE = true;
        this.dN(mouseEvent.x);
    }
    
    public void mouseUp(final MouseEvent mouseEvent) {
        this.QE = false;
        this.wU = false;
    }
    
    public void mouseMove(final MouseEvent mouseEvent) {
        if (this.QE) {
            this.wU = true;
            this.dN(mouseEvent.x);
        }
    }
    
    private void dN(final int n) {
        this.dN.LH(this.dN.BQ() * n / this.getClientArea().width);
    }
    
    public void mouseEnter(final MouseEvent mouseEvent) {
    }
    
    public void mouseExit(final MouseEvent mouseEvent) {
    }
    
    public void mouseHover(final MouseEvent mouseEvent) {
        if (this.OK != null) {
            this.OK.setVisible(false);
            this.OK.dispose();
        }
        (this.OK = new ToolTip(this.dN.QE().LR(), 0)).setMessage(this.dN.fa(this.dN.wU(this.dN.BQ() * mouseEvent.x / this.getClientArea().width)));
        this.OK.setAutoHide(true);
        this.OK.setVisible(true);
    }
}
