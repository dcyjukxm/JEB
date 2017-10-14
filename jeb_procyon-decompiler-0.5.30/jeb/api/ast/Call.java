// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.List;
import jebglobal.II;
import jebglobal.mi;

public class Call extends Statement implements IExpression
{
    mi object;
    
    Call(final mi object) {
        super(object);
        this.object = object;
    }
    
    public static Call build(final Method method, final boolean b, final List list) {
        return new Call(new mi(method.object, b, U.getWrappedExpressionList(list)));
    }
    
    public Method getMethod() {
        return new Method((Object)this.object.dN());
    }
    
    public void setMethod(final Method method, final boolean b) {
        this.object.dN(method.object, b);
    }
    
    public boolean isSuperCall() {
        return this.object.ld();
    }
    
    public List getArguments() {
        return U.wrapExpressionList(this.object.mS());
    }
    
    public void insertArgument(final int n, final IExpression expression) {
        this.object.ld(n, U.getWrappedExpression(expression));
    }
    
    public IExpression removeArgument(final int n) {
        return U.wrapExpression(this.object.ld(n));
    }
}
