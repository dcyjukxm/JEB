// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.logging.Level;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.custom.VerifyKeyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

public final class l extends lW implements rB
{
    private Display dN;
    private Thread ld;
    private boolean QE;
    
    public l(final Composite composite, final Font font) {
        super(composite, font, false);
        this.dN = composite.getDisplay();
        this.ld = this.dN.getThread();
        this.zs.addVerifyKeyListener((VerifyKeyListener)new yO(this));
        final MenuItem menuItem = new MenuItem(this.mS, 0);
        menuItem.setText("C&lear\tCtrl+L");
        menuItem.addSelectionListener((SelectionListener)new AO(this));
    }
    
    public void dN(final boolean qe) {
        this.QE = qe;
    }
    
    public void dN(final String s) {
        this.zs.append(s);
        if (this.QE) {
            final int topIndex = this.zs.getLineCount() - 2;
            if (topIndex >= 0) {
                this.zs.setTopIndex(topIndex);
            }
        }
    }
    
    @Override
    public void dN(final Level level, final String s) {
        if (level != Level.INFO) {
            return;
        }
        if (Thread.currentThread() != this.ld) {
            this.dN.asyncExec((Runnable)new dd(this, s));
        }
        else {
            this.dN(s);
        }
    }
}
