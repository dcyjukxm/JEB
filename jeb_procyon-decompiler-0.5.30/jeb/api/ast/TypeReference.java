// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.Vf;

public class TypeReference extends NonStatement implements IExpression
{
    Vf object;
    
    TypeReference(final Vf object) {
        super(object);
        this.object = object;
    }
    
    public String getType() {
        return this.object.ld().KK();
    }
}
