// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import jebglobal.IK;
import java.util.List;
import jebglobal.cI;

public abstract class NonStatement implements IElement
{
    cI object;
    
    NonStatement(final cI object) {
        if (object == null) {
            throw new IllegalArgumentException();
        }
        this.object = object;
    }
    
    @Override
    public List getSubElements() {
        return U.getSubElements(this.object);
    }
    
    @Override
    public boolean replaceSubElement(final IElement element, final IElement element2) {
        return U.replaceSubElement(this.object, element, element2);
    }
    
    @Override
    public void attachTag(final String s, final Object o) {
        this.object.dN().dN(s, o);
    }
    
    @Override
    public Object retrieveTag(final String s) {
        return this.object.dN().dN(s);
    }
}
