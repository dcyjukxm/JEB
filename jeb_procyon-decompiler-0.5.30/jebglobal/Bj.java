// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.graphics.Drawable;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Text;
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
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;

final class Bj implements DisposeListener
{
    private /* synthetic */ sp dN;
    
    Bj(final sp dn) {
        this.dN = dn;
    }
    
    public void widgetDisposed(final DisposeEvent disposeEvent) {
        this.dN.mS.dispose();
    }
}
