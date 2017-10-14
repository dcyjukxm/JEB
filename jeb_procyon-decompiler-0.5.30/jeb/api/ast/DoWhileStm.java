// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.wz;
import jebglobal.jM;

public class DoWhileStm extends Compound
{
    jM object;
    
    DoWhileStm(final jM object) {
        super(object);
        this.object = object;
    }
    
    public static DoWhileStm build(final Predicate predicate, final Block block) {
        return new DoWhileStm(new jM(block.object, predicate.object));
    }
    
    public Predicate getPredicate() {
        return new Predicate(this.object.mS());
    }
    
    public Block getBody() {
        return new Block(this.object.zs());
    }
    
    public void setPredicate(final Predicate predicate) {
        this.object.dN(predicate.object);
    }
    
    public void setBody(final Block block) {
        this.object.dN(block.object);
    }
}
