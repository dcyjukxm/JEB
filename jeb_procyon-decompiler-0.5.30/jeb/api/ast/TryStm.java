// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.HI;
import jebglobal.wz;
import jebglobal.SP;

public class TryStm extends Compound
{
    SP object;
    
    TryStm(final SP object) {
        super(object);
        this.object = object;
    }
    
    public Block getTryBody() {
        return new Block(this.object.zs());
    }
    
    public int getCatchCount() {
        return this.object.mS();
    }
    
    public Block getCatchBody(final int n) {
        return new Block(this.object.QE(n));
    }
    
    public String getCatchType(final int n) {
        return this.object.ld(n).KK();
    }
    
    public Identifier getCatchIdentifier(final int n) {
        final HI wu = this.object.wU(n);
        return (wu == null) ? null : new Identifier(wu);
    }
    
    public Block getFinallyBody() {
        return new Block(this.object.OK());
    }
}
