// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Qa;
import jebglobal.II;
import jebglobal.yg;

public class Break extends Statement
{
    yg object;
    
    Break(final yg object) {
        super(object);
        this.object = object;
    }
    
    public static Break build(final Label label) {
        return new Break(new yg((label == null) ? null : label.object));
    }
    
    public Label getLabel() {
        final Qa dn = this.object.dN();
        return (dn == null) ? null : new Label(dn);
    }
    
    public void setLabel(final Label label) {
        this.object.dN((label == null) ? null : label.object);
    }
}
