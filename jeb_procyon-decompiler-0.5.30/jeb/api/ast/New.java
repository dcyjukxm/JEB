// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.Iterator;
import jebglobal.Xf;
import java.util.ArrayList;
import java.util.List;
import jebglobal.II;
import jebglobal.Pi;

public class New extends Statement implements IExpression
{
    Pi object;
    
    New(final Pi object) {
        super(object);
        this.object = object;
    }
    
    public String getType() {
        return this.object.dN().KK();
    }
    
    public Method getMethod() {
        return new Method((Object)this.object.ld());
    }
    
    public List getArguments() {
        final ArrayList<IExpression> list = new ArrayList<IExpression>();
        final Iterator<Xf> iterator = this.object.zs().iterator();
        while (iterator.hasNext()) {
            list.add(U.wrapExpression(iterator.next()));
        }
        return list;
    }
}
