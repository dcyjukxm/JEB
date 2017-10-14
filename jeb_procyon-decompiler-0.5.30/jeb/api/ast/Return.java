// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.II;
import jebglobal.cq;

public class Return extends Statement
{
    cq object;
    
    Return(final cq object) {
        super(object);
        this.object = object;
    }
    
    public static Return build(final IExpression expression) {
        return new Return(new cq(U.getWrappedExpression(expression)));
    }
    
    public IExpression getExpression() {
        return U.wrapExpression(this.object.dN());
    }
    
    public void setExpression(final IExpression expression) {
        this.object.dN(U.getWrappedExpression(expression));
    }
}
