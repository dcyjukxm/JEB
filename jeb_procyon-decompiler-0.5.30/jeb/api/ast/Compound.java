// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.Iterator;
import jebglobal.EG;
import java.util.ArrayList;
import java.util.List;
import jebglobal.II;
import jebglobal.wz;

public abstract class Compound extends Statement
{
    wz object;
    
    Compound(final wz object) {
        super(object);
        this.object = object;
    }
    
    public List getBlocks() {
        final ArrayList<Block> list = new ArrayList<Block>();
        final Iterator<EG> iterator = this.object.dN().iterator();
        while (iterator.hasNext()) {
            list.add(new Block(iterator.next()));
        }
        return list;
    }
}
