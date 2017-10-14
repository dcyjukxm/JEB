// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.II;
import jebglobal.mA;

public class Monitor extends Statement
{
    mA object;
    
    Monitor(final mA object) {
        super(object);
        this.object = object;
    }
    
    public boolean isEnter() {
        return this.object.dN();
    }
    
    public IExpression getLock() {
        return U.wrapExpression(this.object.ld());
    }
}
