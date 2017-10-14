// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.wD;

public class ArrayElt extends NonStatement implements ILeftExpression
{
    wD object;
    
    ArrayElt(final wD object) {
        super(object);
        this.object = object;
    }
    
    public static ArrayElt build(final IExpression expression, final IExpression expression2) {
        return new ArrayElt(new wD(U.getWrappedExpression(expression), U.getWrappedExpression(expression2)));
    }
    
    public IExpression getArray() {
        return U.wrapExpression(this.object.ld());
    }
    
    public IExpression getIndex() {
        return U.wrapExpression(this.object.QE());
    }
    
    public void setArray(final IExpression expression) {
        this.object.dN(U.getWrappedExpression(expression));
    }
    
    public void setIndex(final IExpression expression) {
        this.object.ld(U.getWrappedExpression(expression));
    }
}
