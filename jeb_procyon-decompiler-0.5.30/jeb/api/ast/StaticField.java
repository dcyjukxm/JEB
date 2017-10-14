// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.Np;

public class StaticField extends NonStatement implements ILeftExpression
{
    Np object;
    
    StaticField(final Np object) {
        super(object);
        this.object = object;
    }
    
    public Field getField() {
        return new Field(this.object.QE());
    }
}
