// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.io.FileNotFoundException;
import org.eclipse.swt.SWTException;
import java.io.InputStream;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.Image;
import java.io.FileInputStream;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.layout.FillLayout;
import java.io.File;
import org.eclipse.swt.widgets.Composite;

public final class qS extends Composite
{
    public qS(final Composite composite, final File file) {
        super(composite, 0);
        this.setLayout((Layout)new FillLayout());
        final Label label = new Label((Composite)this, 16777216);
        try {
            label.setImage(new Image((Device)composite.getDisplay(), (InputStream)new FileInputStream(file)));
        }
        catch (SWTException ex) {}
        catch (FileNotFoundException ex2) {}
    }
    
    public qS(final Composite composite, final Image image) {
        super(composite, 0);
        this.setLayout((Layout)new FillLayout());
        final Label label = new Label((Composite)this, 16777216);
        try {
            label.setImage(image);
        }
        catch (SWTException ex) {}
    }
}
