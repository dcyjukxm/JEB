// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Yx;
import jeb.api.JebInstance;
import jebglobal.cI;
import jebglobal.Dw;

public class Field extends NonStatement
{
    Dw object;
    
    Field(final Dw object) {
        super(object);
        this.object = object;
    }
    
    public String getType() {
        return this.object.OK().KK();
    }
    
    public String getName() {
        return this.object.zs();
    }
    
    public String getSignature() {
        return this.object.mS();
    }
    
    public IExpression getInitialValue() {
        return U.wrapExpression(this.object.LH());
    }
    
    public static class Builder
    {
        Dw.uK ff;
        
        public Builder(final JebInstance jebInstance) {
            this.ff = ((Yx)jebInstance.getGO()).zs();
        }
        
        public Field build(final int n) {
            final Dw dn = this.ff.dN(n);
            return (dn == null) ? null : new Field(dn);
        }
    }
}
