// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Gy;
import jebglobal.lk;

public class Predicate extends Expression
{
    lk object;
    
    Predicate(final lk object) {
        super(object);
        this.object = object;
    }
    
    public static Predicate build(final IExpression expression, final Operator operator, final IExpression expression2) {
        return new Predicate(new lk(U.getWrappedExpression(expression), operator.object, U.getWrappedExpression(expression2)));
    }
    
    public boolean isLitteralTrue() {
        return this.object.zs();
    }
    
    public boolean isLitteralFalse() {
        return this.object.mS();
    }
    
    public void reverse() {
        this.object.LH();
    }
}
