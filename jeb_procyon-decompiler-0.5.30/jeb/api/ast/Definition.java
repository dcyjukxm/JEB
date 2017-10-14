// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.II;
import jebglobal.wm;

public class Definition extends Statement implements ILeftExpression
{
    wm object;
    
    Definition(final wm object) {
        super(object);
        this.object = object;
    }
    
    public String getType() {
        return this.object.ld().KK();
    }
    
    public Identifier getIdentifier() {
        return new Identifier(this.object.zs());
    }
}
