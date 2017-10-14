// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.Iterator;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.graphics.Font;
import java.util.ArrayList;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.widgets.Composite;

public class lW extends Composite implements QW, ZE, VerifyKeyListener, FocusListener, PaintListener
{
    private static final long LK = 844563159190538443L;
    protected StyledText zs;
    protected Menu mS;
    private oa dN;
    private boolean ld;
    private ArrayList QE;
    
    public lW(final Composite composite, final Font font, final boolean b) {
        this(composite, 2818, font, b);
    }
    
    public lW(final Composite composite, final int n, final Font font, final boolean editable) {
        super(composite, 0);
        this.dN = null;
        this.QE = new ArrayList();
        this.setLayout((Layout)new FillLayout());
        (this.zs = new StyledText((Composite)this, n)).setFont(font);
        this.zs.setEditable(editable);
        this.zs.setData((Object)this);
        this.zs.addFocusListener((FocusListener)this);
        this.zs.addVerifyKeyListener((VerifyKeyListener)this);
        this.zs.addPaintListener((PaintListener)this);
        this.zs.setCursor(new Cursor((Device)this.getDisplay(), editable ? 19 : 0));
        if (!editable) {
            this.zs.setBackground(HC.dN().dN(15790320));
            this.zs.setForeground(Display.getDefault().getSystemColor(2));
        }
        this.mS = new Menu((Control)this.zs);
        final MenuItem menuItem = new MenuItem(this.mS, 0);
        menuItem.setText("Select all\tCtrl+A");
        menuItem.setAccelerator(SWT.MOD1 | 0x41);
        menuItem.addSelectionListener((SelectionListener)new fi(this));
        final MenuItem menuItem2 = new MenuItem(this.mS, 0);
        menuItem2.setText("&Copy\tCtrl+C");
        menuItem2.setAccelerator(SWT.MOD1 | 0x43);
        menuItem2.addSelectionListener((SelectionListener)new kb(this));
        this.zs.setMenu(this.mS);
        this.layout();
    }
    
    public void KK() {
    }
    
    public Menu s() {
        return this.mS;
    }
    
    public void focusGained(final FocusEvent focusEvent) {
        this.ld = true;
    }
    
    public void focusLost(final FocusEvent focusEvent) {
        this.ld = false;
    }
    
    public boolean Hv() {
        return this.ld;
    }
    
    public void verifyKey(final VerifyEvent verifyEvent) {
        switch (verifyEvent.keyCode) {
            case 97: {
                if (verifyEvent.stateMask == 262144) {
                    this.VX();
                    break;
                }
                break;
            }
            case 99:
            case 118:
            case 120: {
                if (verifyEvent.stateMask == 262144 || verifyEvent.stateMask == 4194304) {
                    verifyEvent.doit = false;
                    break;
                }
                break;
            }
            case 16777217: {
                if (verifyEvent.stateMask == 262144) {
                    final int topIndex = this.zs.getTopIndex();
                    if (topIndex >= 1) {
                        this.zs.setTopIndex(topIndex - 1);
                    }
                    break;
                }
                break;
            }
            case 16777218: {
                if (verifyEvent.stateMask == 262144) {
                    final int topIndex2 = this.zs.getTopIndex();
                    if (topIndex2 < this.zs.getLineCount() - 1) {
                        this.zs.setTopIndex(topIndex2 + 1);
                    }
                    break;
                }
                break;
            }
            case 103: {
                if (verifyEvent.stateMask != 262144) {
                    break;
                }
                final String dn = new Zf(this.getShell(), this.zs.getFont(), "Line number").dN();
                if (dn == null) {
                    break;
                }
                int int1 = -1;
                try {
                    int1 = Integer.parseInt(dn);
                }
                catch (NumberFormatException ex) {}
                if (int1 >= 0) {
                    this.dN(int1);
                    break;
                }
                break;
            }
        }
    }
    
    public void VX() {
        final int topIndex = this.zs.getTopIndex();
        this.zs.selectAll();
        this.zs.setTopIndex(topIndex);
    }
    
    public void ci() {
        this.zs.copy();
    }
    
    public void EO() {
        this.zs.setText("");
    }
    
    public void QE(final String text) {
        this.zs.setText(text);
    }
    
    public String bG() {
        return this.zs.getText();
    }
    
    public boolean dN(final int n) {
        if (n < 0 || n >= this.zs.getLineCount()) {
            return false;
        }
        final int height = this.zs.getClientArea().height;
        final int linePixel = this.zs.getLinePixel(n);
        if (linePixel < 0 || linePixel >= height) {
            this.zs.setTopIndex(Math.max(0, n - height / this.zs.getLineHeight() / 2));
        }
        this.zs.setCaretOffset(this.zs.getOffsetAtLine(n));
        return true;
    }
    
    public boolean ld(final int caretOffset) {
        final int lineAtOffset = this.zs.getLineAtOffset(caretOffset);
        if (lineAtOffset < 0 || lineAtOffset >= this.zs.getLineCount()) {
            return false;
        }
        final Point locationAtOffset = this.zs.getLocationAtOffset(caretOffset);
        final int y = locationAtOffset.y;
        final int x = locationAtOffset.x;
        final Rectangle clientArea = this.zs.getClientArea();
        if (y < 0 || y >= clientArea.height) {
            this.zs.setTopIndex(Math.max(0, lineAtOffset - clientArea.height / this.zs.getLineHeight() / 2));
        }
        if (x < 0 || x >= clientArea.width) {
            int horizontalPixel = this.zs.getHorizontalPixel() + x;
            if (horizontalPixel < clientArea.width) {
                horizontalPixel = 0;
            }
            this.zs.setHorizontalPixel(horizontalPixel);
        }
        this.zs.setCaretOffset(caretOffset);
        return true;
    }
    
    public int fa() {
        return this.zs.getCaretOffset();
    }
    
    public void zs(final int caretOffset) {
        this.zs.setCaretOffset(caretOffset);
    }
    
    public boolean dN(final int n, final int n2) {
        if (n < 0 || n >= this.zs.getLineCount()) {
            return false;
        }
        final int caretOffset = this.zs.getOffsetAtLine(n) + n2;
        if (caretOffset < 0 || caretOffset > this.zs.getCharCount()) {
            return false;
        }
        this.zs.setCaretOffset(caretOffset);
        return true;
    }
    
    public int zs() {
        final int caretOffset = this.zs.getCaretOffset();
        if (caretOffset < 0) {
            return -1;
        }
        return this.zs.getLineAtOffset(caretOffset);
    }
    
    public oa dN() {
        return this.dN;
    }
    
    public void dN(oa dn) {
        if (dn == null) {
            dn = this.dN;
            if (dn == null) {
                return;
            }
        }
        int n = this.zs.getCaretOffset() + (dn.QE ? -1 : 1);
        if (n < 0) {
            n = 0;
        }
        else if (n >= this.zs.getCharCount()) {
            n = this.zs.getCharCount() - 1;
        }
        cn.dN(String.format("Searching for \"%s\" (case sensitive: %s, reverse order: %s)", dn.dN, dn.ld, dn.QE));
        int n2 = TM.dN(this.zs.getText(), n, dn.dN, dn.ld, dn.QE);
        if (n2 < 0 && dn.wU) {
            n2 = TM.dN(this.zs.getText(), dn.QE ? (this.zs.getCharCount() - 1) : 0, dn.dN, dn.ld, dn.QE);
            if (n2 >= 0) {
                Display.getCurrent().beep();
            }
        }
        if (n2 >= 0) {
            cn.dN(String.format("Found on line %d", this.zs.getLineAtOffset(n2)));
            this.ld(n2);
            this.zs.setSelection(n2, n2 + dn.dN.length());
        }
        else {
            Display.getCurrent().beep();
            cn.dN("Nothing found.");
        }
        this.dN = dn;
    }
    
    public void dispose() {
        super.dispose();
    }
    
    public Point computeSize(final int n, final int n2, final boolean b) {
        return this.zs.computeSize(n, n2, b);
    }
    
    public Color getBackground() {
        return this.zs.getBackground();
    }
    
    public boolean getDragDetect() {
        return this.zs.getDragDetect();
    }
    
    public Color getForeground() {
        return this.zs.getForeground();
    }
    
    public int getOrientation() {
        return this.zs.getOrientation();
    }
    
    public void redraw() {
        this.zs.redraw();
    }
    
    public void redraw(final int n, final int n2, final int n3, final int n4, final boolean b) {
        this.zs.redraw(n, n2, n3, n4, b);
    }
    
    public void setFont(final Font font) {
        this.zs.setFont(font);
    }
    
    public void setForeground(final Color foreground) {
        this.zs.setForeground(foreground);
    }
    
    public void setBackground(final Color background) {
        this.zs.setBackground(background);
    }
    
    public void setCursor(final Cursor cursor) {
        this.zs.setCursor(cursor);
    }
    
    public String mS(final int n) {
        return this.zs.getLine(n);
    }
    
    public int BQ() {
        return this.zs.getLineCount();
    }
    
    public int Ee() {
        return this.zs.getLineHeight();
    }
    
    public int OK(final int n) {
        return this.zs.getOffsetAtLine(n);
    }
    
    public void dN(final int n, final int n2, final String s) {
        this.zs.replaceTextRange(n, n2, s);
    }
    
    public void LH(final int topIndex) {
        this.zs.setTopIndex(topIndex);
    }
    
    public void paintControl(final PaintEvent paintEvent) {
        if (this.QE.isEmpty()) {
            return;
        }
        int offsetAtLocation;
        try {
            offsetAtLocation = this.zs.getOffsetAtLocation(new Point(0, 0));
        }
        catch (IllegalArgumentException ex) {
            return;
        }
        final int lineAtOffset = this.zs.getLineAtOffset(offsetAtLocation);
        final Iterator<uK> iterator = (Iterator<uK>)this.QE.iterator();
        while (iterator.hasNext()) {
            iterator.next().dN(lineAtOffset);
        }
    }
    
    public void dN(final uK uk) {
        this.QE.add(uk);
    }
    
    public boolean setFocus() {
        return this.zs.setFocus();
    }
    
    public interface uK
    {
        void dN(final int p0);
    }
}
