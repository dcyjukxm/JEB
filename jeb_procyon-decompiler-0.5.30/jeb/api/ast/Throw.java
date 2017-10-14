// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.II;
import jebglobal.vE;

public class Throw extends Statement
{
    vE object;
    
    Throw(final vE object) {
        super(object);
        this.object = object;
    }
    
    public static Throw build(final IExpression expression) {
        return new Throw(new vE(U.getWrappedExpression(expression)));
    }
    
    public IExpression getExpression() {
        return U.wrapExpression(this.object.dN());
    }
    
    public void setExpression(final IExpression expression) {
        this.object.dN(U.getWrappedExpression(expression));
    }
}
