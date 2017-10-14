// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.CZ;

public class InstanceField extends NonStatement implements ILeftExpression
{
    CZ object;
    
    InstanceField(final CZ object) {
        super(object);
        this.object = object;
    }
    
    public static InstanceField build(final IExpression expression, final Field field) {
        return new InstanceField(new CZ(U.getWrappedExpression(expression), field.object));
    }
    
    public IExpression getInstance() {
        return U.wrapExpression(this.object.ld());
    }
    
    public Field getField() {
        return new Field(this.object.QE());
    }
    
    public void setInstance(final IExpression expression) {
        this.object.dN(U.getWrappedExpression(expression));
    }
    
    public void setField(final Field field) {
        this.object.dN(field.object);
    }
}
