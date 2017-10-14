// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.HI;

public class Identifier extends NonStatement implements ILeftExpression
{
    HI object;
    
    Identifier(final HI object) {
        super(object);
        this.object = object;
    }
    
    public String getName() {
        return this.object.dN(true);
    }
}
