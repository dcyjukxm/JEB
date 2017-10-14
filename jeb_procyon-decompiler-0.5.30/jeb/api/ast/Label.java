// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.II;
import jebglobal.Qa;

public class Label extends Statement
{
    Qa object;
    
    Label(final Qa object) {
        super(object);
        this.object = object;
    }
    
    public String getName() {
        return this.object.dN(true);
    }
}
