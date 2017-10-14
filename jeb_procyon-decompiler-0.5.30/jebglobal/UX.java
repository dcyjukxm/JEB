// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.RowLayout;
import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.SelectionAdapter;

final class UX extends SelectionAdapter
{
    private /* synthetic */ Text dN;
    private /* synthetic */ Shell ld;
    private /* synthetic */ sp QE;
    
    UX(final sp qe, final Text dn, final Shell ld) {
        this.QE = qe;
        this.dN = dn;
        this.ld = ld;
    }
    
    public void widgetSelected(final SelectionEvent selectionEvent) {
        this.QE.dN = this.dN.getText();
        this.ld.close();
    }
}
