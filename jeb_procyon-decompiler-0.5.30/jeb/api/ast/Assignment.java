// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Xf;
import jebglobal.II;
import jebglobal.XM;

public class Assignment extends Statement
{
    XM object;
    
    Assignment(final XM object) {
        super(object);
        this.object = object;
    }
    
    public static Assignment build(final ILeftExpression leftExpression, final IExpression expression) {
        return new Assignment(new XM(U.getWrappedLeftExpression(leftExpression), U.getWrappedExpression(expression)));
    }
    
    public ILeftExpression getLeft() {
        return U.wrapLeftExpression(this.object.OK());
    }
    
    public IExpression getRight() {
        return U.wrapExpression(this.object.LH());
    }
    
    public void setLeft(final ILeftExpression leftExpression) {
        this.object.dN(U.getWrappedLeftExpression(leftExpression));
    }
    
    public void setRight(final IExpression expression) {
        this.object.dN(U.getWrappedExpression(expression));
    }
    
    public boolean isSimpleAssignment() {
        return this.object.dN();
    }
    
    public boolean isCompinedOperatorAssignment() {
        return this.object.ld();
    }
    
    public void setCombinedOperator(final Operator operator) {
        this.object.dN(operator.object, null);
    }
    
    public Operator getCompinedOperator() {
        return Operator.build(this.object.zs());
    }
    
    public boolean isUnaryOperatorAssignment() {
        return this.object.mS();
    }
    
    public void setUnaryOperator(final boolean b, final boolean b2) {
        this.object.dN(b, b2);
    }
    
    public void getUnaryOperator(final boolean[] array) {
        this.object.dN(array);
    }
}
