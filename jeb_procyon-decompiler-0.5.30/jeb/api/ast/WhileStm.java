// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.wz;
import jebglobal.zn;

public class WhileStm extends Compound
{
    zn object;
    
    WhileStm(final zn object) {
        super(object);
        this.object = object;
    }
    
    public static WhileStm build(final Predicate predicate, final Block block) {
        return new WhileStm(new zn(predicate.object, block.object));
    }
    
    public Predicate getPredicate() {
        return new Predicate(this.object.zs());
    }
    
    public Block getBody() {
        return new Block(this.object.mS());
    }
    
    public void setPredicate(final Predicate predicate) {
        this.object.dN(predicate.object);
    }
    
    public void setBody(final Block block) {
        this.object.dN(block.object);
    }
}
