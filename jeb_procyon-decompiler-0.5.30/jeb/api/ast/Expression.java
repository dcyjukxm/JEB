// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.cI;
import jebglobal.Gy;

public class Expression extends NonStatement implements IExpression
{
    Gy object;
    
    Expression(final Gy object) {
        super(object);
        this.object = object;
    }
    
    public static Expression build(final IExpression expression, final Operator operator, final IExpression expression2) {
        return new Expression(new Gy(U.getWrappedExpression(expression), operator.object, U.getWrappedExpression(expression2)));
    }
    
    public IExpression getLeft() {
        return U.wrapExpression(this.object.ld());
    }
    
    public IExpression getRight() {
        return U.wrapExpression(this.object.QE());
    }
    
    public Operator getOperator() {
        return Operator.build(this.object.fa());
    }
}
