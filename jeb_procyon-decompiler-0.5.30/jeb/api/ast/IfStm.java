// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.wz;
import jebglobal.tE;

public class IfStm extends Compound
{
    tE object;
    
    IfStm(final tE object) {
        super(object);
        this.object = object;
    }
    
    public static IfStm build(final Predicate predicate, final Block block) {
        return new IfStm(new tE(predicate.object, block.object));
    }
    
    public int size() {
        return this.object.LH();
    }
    
    public Predicate getBranchPredicate(final int n) {
        return new Predicate(this.object.ld(n));
    }
    
    public Block getBranchBody(final int n) {
        return new Block(this.object.QE(n));
    }
    
    public Block getDefaultBlock() {
        if (!this.object.mS()) {
            return null;
        }
        return new Block(this.object.OK());
    }
    
    public void setBranchPredicate(final int n, final Predicate predicate) {
        this.object.dN(n, predicate.object);
    }
    
    public void setBranchBody(final int n, final Block block) {
        this.object.dN(n, block.object);
    }
    
    public void insertBranch(final int n, final Predicate predicate, final Block block) {
        this.object.dN(n, predicate.object, block.object);
    }
    
    public void removeBranch(final int n) {
        this.object.wU(n);
    }
}
