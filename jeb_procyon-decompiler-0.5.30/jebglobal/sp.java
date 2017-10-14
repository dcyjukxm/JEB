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

public final class sp extends fL
{
    private String dN;
    private Font ld;
    private int QE;
    private String wU;
    private byte[] fa;
    private TH zs;
    private rl mS;
    
    public sp(final Shell shell, final Font ld, final String s, final String wu, final byte[] fa) {
        super(shell, s);
        this.ld = ld;
        this.QE = 1;
        this.wU = wu;
        this.fa = fa;
    }
    
    public OD.uK dN() {
        super.ld();
        if (this.dN == null) {
            return null;
        }
        String dn = null;
        if (this.dN != null && this.dN.length() > 0) {
            dn = this.dN;
        }
        byte[] byteArray = null;
        try {
            if (this.zs.ld()) {
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (this.zs.dN(byteArrayOutputStream)) {
                    byteArray = byteArrayOutputStream.toByteArray();
                }
            }
        }
        catch (IOException ex) {}
        return new OD.uK(dn, byteArray);
    }
    
    public void dN(final Shell shell) {
        shell.setLayout((Layout)new RowLayout(512));
        final Composite composite = new Composite((Composite)shell, 0);
        composite.setLayout((Layout)new GridLayout(4, false));
        final Composite composite2 = new Composite((Composite)shell, 0);
        composite2.setLayout((Layout)new RowLayout(256));
        this.zs = new TH();
        if (this.fa != null) {
            try {
                this.zs.dN(new ByteArrayInputStream(this.fa));
            }
            catch (UnsupportedAudioFileException ex) {}
            catch (IOException ex2) {}
        }
        this.mS = new rl(composite, this.zs);
        Text text;
        if (this.QE >= 2) {
            text = new Text(composite, 2626);
        }
        else {
            text = new Text(composite, 2052);
        }
        text.setFont(this.ld);
        final GC gc = new GC((Drawable)text);
        GridData layoutData;
        try {
            gc.setFont(text.getFont());
            layoutData = new GridData(200, this.QE * gc.getFontMetrics().getHeight());
        }
        finally {
            gc.dispose();
        }
        text.setLayoutData((Object)layoutData);
        if (this.wU != null) {
            text.setText(this.wU);
        }
        text.selectAll();
        final Button defaultButton = new Button(composite2, 8);
        defaultButton.setText("   OK   ");
        defaultButton.addSelectionListener((SelectionListener)new UX(this, text, shell));
        final Button button = new Button(composite2, 8);
        button.setText("   Cancel   ");
        button.addSelectionListener((SelectionListener)new Lm(this, shell));
        shell.setDefaultButton(defaultButton);
        shell.addDisposeListener((DisposeListener)new Bj(this));
    }
}
