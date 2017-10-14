// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.Yx;
import jeb.api.JebInstance;
import jebglobal.zd;
import jebglobal.EG;
import java.util.Iterator;
import jebglobal.wm;
import java.util.ArrayList;
import java.util.List;
import jebglobal.cI;
import jebglobal.Fu;

public class Method extends NonStatement
{
    Fu object;
    
    public Method(final Object o) {
        super((cI)o);
        if (!(o instanceof Fu)) {
            throw new RuntimeException();
        }
        this.object = (Fu)o;
    }
    
    public String getName() {
        return this.object.mS();
    }
    
    public String getSignature() {
        return this.object.OK();
    }
    
    public List getParameters() {
        final ArrayList<Definition> list = new ArrayList<Definition>();
        if (!this.object.KK()) {
            final Iterator<wm> iterator = this.object.fa().iterator();
            while (iterator.hasNext()) {
                list.add(new Definition(iterator.next()));
            }
        }
        return list;
    }
    
    public Block getBody() {
        if (this.object.KK()) {
            return null;
        }
        final EG vx = this.object.VX();
        return (vx == null) ? null : new Block(vx);
    }
    
    public Class getContainingClass() {
        final zd lh = this.object.LH();
        if (lh == null) {
            return null;
        }
        return new Class((Object)lh);
    }
    
    public boolean isStatic() {
        return this.object.cb();
    }
    
    public static class Builder
    {
        Fu.uK mf;
        
        public Builder(final JebInstance jebInstance) {
            this.mf = ((Yx)jebInstance.getGO()).fa();
        }
        
        public Method build(final int n, final boolean b) {
            final Fu dn = this.mf.dN(n, b);
            return (dn == null) ? null : new Method((Object)dn);
        }
    }
}
