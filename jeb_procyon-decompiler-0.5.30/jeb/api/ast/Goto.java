// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.II;
import jebglobal.KO;

public class Goto extends Statement
{
    KO object;
    
    Goto(final KO object) {
        super(object);
        this.object = object;
    }
    
    public static Goto build(final Label label) {
        return new Goto(new KO(label.object));
    }
    
    public Label getLabel() {
        return new Label(this.object.dN());
    }
    
    public void setLabel(final Label label) {
        this.object.dN(label.object);
    }
}
