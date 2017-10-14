// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.List;
import jebglobal.II;
import jebglobal.jK;

public class NewArray extends Statement implements IExpression
{
    jK object;
    
    NewArray(final jK object) {
        super(object);
        this.object = object;
    }
    
    public String getType() {
        return this.object.dN().KK();
    }
    
    public List getSizes() {
        if (this.object.ld() == null) {
            return null;
        }
        return U.wrapExpressionList(this.object.ld());
    }
    
    public List getInitialValues() {
        if (this.object.zs() == null) {
            return null;
        }
        return U.wrapExpressionList(this.object.zs());
    }
}
