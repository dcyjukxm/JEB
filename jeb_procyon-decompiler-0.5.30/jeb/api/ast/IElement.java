// 
// Decompiled by Procyon v0.5.30
// 

package jeb.api.ast;

import java.util.List;

public interface IElement
{
    List getSubElements();
    
    boolean replaceSubElement(final IElement p0, final IElement p1);
    
    void attachTag(final String p0, final Object p1);
    
    Object retrieveTag(final String p0);
}
