// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.rY;

public class ConditionalExpression extends NonStatement implements IExpression
{
    rY object;
    
    ConditionalExpression(final rY object) {
        super(object);
        this.object = object;
    }
    
    public static ConditionalExpression build(final IExpression expression, final IExpression expression2, final IExpression expression3) {
        return new ConditionalExpression(new rY(U.getWrappedExpression(expression), U.getWrappedExpression(expression2), U.getWrappedExpression(expression3)));
    }
    
    public IExpression getLeft() {
        return U.wrapExpression(this.object.ld());
    }
    
    public IExpression getRight0() {
        return U.wrapExpression(this.object.QE());
    }
    
    public IExpression getRight1() {
        return U.wrapExpression(this.object.fa());
    }
}
