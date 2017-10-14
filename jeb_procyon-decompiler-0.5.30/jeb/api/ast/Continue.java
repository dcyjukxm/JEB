// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Qa;
import jebglobal.II;
import jebglobal.PZ;

public class Continue extends Statement
{
    PZ object;
    
    Continue(final PZ object) {
        super(object);
        this.object = object;
    }
    
    public static Continue build(final Label label) {
        return new Continue(new PZ((label == null) ? null : label.object));
    }
    
    public Label getLabel() {
        final Qa dn = this.object.dN();
        return (dn == null) ? null : new Label(dn);
    }
    
    public void setLabel(final Label label) {
        this.object.dN((label == null) ? null : label.object);
    }
}
