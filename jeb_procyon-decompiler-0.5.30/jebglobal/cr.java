// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import org.eclipse.swt.widgets.Composite;

public abstract class cr extends yn
{
    public cr(final Composite composite, final yx yx) {
        super(composite, yx, yx.dN().XZ(), yx.dN().nA(), yx.dN().Ai());
    }
    
    public abstract int wU(final int p0);
    
    public String fa(final int n) {
        final StringBuilder sb = new StringBuilder();
        if ((n & 0x4) != 0x0) {
            sb.append("method ");
        }
        else if ((n & 0x2) != 0x0) {
            sb.append("field ");
        }
        else if ((n & 0x1) != 0x0) {
            sb.append("class ");
        }
        if ((n & 0x600) != 0x0) {
            sb.append("library ");
        }
        if ((n & 0x100) != 0x0) {
            sb.append("constant ");
        }
        if ((n & 0x800) != 0x0) {
            sb.append("alert ");
        }
        return sb.toString();
    }
}
