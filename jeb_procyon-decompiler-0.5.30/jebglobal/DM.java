// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Composite;

public final class DM extends lW
{
    public DM(final Composite composite, final Font font) {
        super(composite, font, false);
    }
    
    public void dN(final byte[] array) {
        this.zs.setText(ZF.dN(array, 0, array.length, 0));
    }
}
