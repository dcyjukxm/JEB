// 
// Decompiled by Procyon v0.5.30
// 

package jebglobal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Collection;
import java.util.Comparator;

final class sr implements Comparator
{
    private /* synthetic */ Dq dN;
    
    sr(final Dq dn) {
        this.dN = dn;
    }
    
    public int dN(final EG eg, final EG eg2) {
        return Collections.max((Collection<? extends Integer>)this.dN.ld.get(eg)) - Collections.max((Collection<? extends Integer>)this.dN.ld.get(eg2));
    }
}
