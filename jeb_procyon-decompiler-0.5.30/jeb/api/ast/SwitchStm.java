// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.Iterator;
import jebglobal.EG;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import jebglobal.wz;
import jebglobal.Dq;

public class SwitchStm extends Compound
{
    Dq object;
    
    SwitchStm(final Dq object) {
        super(object);
        this.object = object;
    }
    
    public static SwitchStm build(final IExpression expression) {
        return new SwitchStm(new Dq(U.getWrappedExpression(expression)));
    }
    
    public IExpression getSwitchedExpression() {
        return U.wrapExpression(this.object.zs());
    }
    
    public void setSwitchedExpression(final IExpression expression) {
        this.object.dN(U.getWrappedExpression(expression));
    }
    
    public HashSet getCaseKeys() {
        return this.object.mS();
    }
    
    public List getCaseBodies() {
        final ArrayList<Block> list = new ArrayList<Block>();
        final Iterator<EG> iterator = this.object.OK().iterator();
        while (iterator.hasNext()) {
            list.add(new Block(iterator.next()));
        }
        return list;
    }
    
    public Block getCaseBody(final int n) {
        final EG ld = this.object.ld(n);
        return (ld == null) ? null : new Block(ld);
    }
    
    public boolean hasDefaultBody() {
        return this.object.LH();
    }
    
    public Block getDefaultBody() {
        final EG kk = this.object.KK();
        return (kk == null) ? null : new Block(kk);
    }
    
    public void addCase(final List list, final Block block) {
        this.object.dN(list, block.object);
    }
    
    public void setDefaultBody(final Block block) {
        this.object.dN((block == null) ? null : block.object);
    }
}
